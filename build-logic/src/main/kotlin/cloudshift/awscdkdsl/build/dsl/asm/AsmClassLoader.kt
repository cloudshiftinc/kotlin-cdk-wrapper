package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkClassLoader
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceClass
import com.squareup.kotlinpoet.ClassName
import java.io.File
import java.io.PrintWriter
import java.util.jar.JarEntry
import java.util.jar.JarFile
import kotlin.streams.asSequence
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.util.Textifier
import org.objectweb.asm.util.TraceClassVisitor

internal object AsmClassLoader : CdkClassLoader {
    override fun loadClasses(
        classpath: Set<File>,
        sourceClasses: Map<ClassName, CdkSourceClass>
    ): List<CdkClass> =
        loadCdkClasses(classpath).map {
            val className = ClassName.fromAsmClassName(it.name)
            val sourceClass = sourceClasses[className] ?: error("No source mapping for $className")
            AsmClassAdapter(className, it, sourceClass)
        }

    private fun loadCdkClasses(classpath: Set<File>): List<ClassNode> {
        val cdkClassPredicate = { name: String ->
            name.startsWith("software/amazon/awscdk") &&
                !name.contains("\$Jsii") &&
                !name.endsWith("/\$Module") &&
                !name.endsWith("/package-info")
        }
        val toTrace = emptySet<String>()
        return classpath.flatMap { file ->
            JarFile(file).use { jar ->
                jar.stream().use { jarStream ->
                    jarStream
                        .asSequence()
                        .mapNotNull { entry ->
                            maybeLoadJarEntry(entry, cdkClassPredicate, jar, toTrace)
                        }
                        .toList()
                }
            }
        }
    }

    private fun maybeLoadJarEntry(
        entry: JarEntry,
        cdkClassPredicate: (String) -> Boolean,
        jar: JarFile,
        toTrace: Set<String>
    ): ClassNode? {
        val name = entry.name
        return when {
            !name.endsWith(".class") -> null
            cdkClassPredicate(name.removeSuffix(".class")) -> {
                val classBytes = jar.getInputStream(entry).use { it.readAllBytes() }
                val classReader = ClassReader(classBytes)
                val classNode = ClassNode()
                classReader.accept(classNode, ClassReader.SKIP_FRAMES)
                if (classNode.access and Opcodes.ACC_PUBLIC != 0) {
                    if (toTrace.any { name.contains(it) }) {
                        val textifier = Textifier()
                        val traceClassVisitor =
                            TraceClassVisitor(null, textifier, PrintWriter(System.out))
                        classReader.accept(traceClassVisitor, ClassReader.SKIP_FRAMES)
                    }
                    classNode
                } else {
                    null
                }
            }
            else -> null
        }
    }
}
