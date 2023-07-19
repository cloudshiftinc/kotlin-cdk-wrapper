package cloudshift.awscdkdsl.build.dsl

import com.google.common.reflect.ClassPath
import java.io.File
import java.net.URL
import java.net.URLClassLoader

internal object CdkModelLoaderImpl  {
    internal fun loadModel(classpath: Set<File>): CdkClassRegistry {

        // create custom classloader for CDK classes that will be discarded, to avoid
        // polluting other classloaders
        val cdkClassLoader = createClassLoader(classpath)

        val builderSuperClass = cdkClassLoader.loadClass("software.amazon.jsii.Builder").kotlin

        val cdkClasses =
            ClassPath.from(cdkClassLoader).allClasses.asSequence()
                .filter {
                    it.packageName.startsWith("software.amazon.awscdk")
                        && !it.name.contains("Jsii\$")
                }
                .map { CdkClass.from(it, builderSuperClass) }
                .toList()


        return CdkClassRegistry.create(cdkClasses)
    }

    private fun createClassLoader(classpath: Set<File>): URLClassLoader {
        return URLClassLoader(
            classpath.map { it.toURI().toURL() }.toTypedArray<URL?>(),
            Thread.currentThread().contextClassLoader,
        )
    }


}
