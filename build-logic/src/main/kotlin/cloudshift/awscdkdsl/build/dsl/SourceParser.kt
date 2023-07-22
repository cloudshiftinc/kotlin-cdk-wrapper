package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceClass
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceMethod
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceModel
import com.github.javaparser.ParserConfiguration
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.body.TypeDeclaration
import com.github.javaparser.utils.SourceRoot
import com.squareup.kotlinpoet.ClassName
import java.io.File
import kotlin.jvm.optionals.getOrNull

internal object SourceParser {
    fun parse(dir: File): CdkSourceModel {
        val sourceRoot = SourceRoot(dir.toPath())
        val parserConfiguration = ParserConfiguration()
        parserConfiguration.setAttributeComments(true)
        parserConfiguration.setDoNotAssignCommentsPrecedingEmptyLines(true)
        parserConfiguration.setIgnoreAnnotationsWhenAttributingComments(true)
        parserConfiguration.setLexicalPreservationEnabled(false)
        parserConfiguration.languageLevel = ParserConfiguration.LanguageLevel.JAVA_11
        val sourceClasses = mutableListOf<CdkSourceClass>()
        sourceRoot.parse("software.amazon.awscdk", parserConfiguration) { localPath, absolutePath, result ->
            val cu = result.result.get()

            val classes = processCompilationUnit(cu)

            synchronized(sourceClasses) {
                sourceClasses.addAll(classes)
            }
            SourceRoot.Callback.Result.DONT_SAVE
        }

        val builderMap = sourceClasses.filter { it.className.simpleName == "Builder" }
            .associateBy { it.className }
        return CdkSourceModel(classes = sourceClasses, builderMap = builderMap)
    }

    private fun processCompilationUnit(cu: CompilationUnit): List<CdkSourceClass> {
        return cu.types.flatMap { processType(it) }
    }

    private fun processType(type: TypeDeclaration<*>): List<CdkSourceClass> {
        val list = mutableListOf(convertTypeDeclaration(type))
        list.addAll(
            type.members.filterIsInstance<TypeDeclaration<*>>()
                .filter {
                    !it.name.asString()
                        .contains("Jsii")
                }
                .flatMap {
                    processType(it)
                }
        )
        return list
    }

    private fun convertTypeDeclaration(type: TypeDeclaration<*>): CdkSourceClass {
        val methods = when (type.name.identifier) {
            "Builder" -> type.methods.filter {
                it.isPublic && it.parameters.size == 1 && !it.isStatic && !it.isConstructorDeclaration
            }
                .map {
                    val type = it.parameters.first().type.asString()
                    val comment = it.comment.getOrNull()
                        ?.let { convertJavadocComment(it.content) }
                    CdkSourceMethod(
                        name = it.name.identifier,
                        type = type,
                        comment = comment
                    )
                }

            else -> emptyList()
        }

        return CdkSourceClass(className = type.className, methods = methods)
    }

    private fun gatherParentNames(list: MutableList<String>, type: TypeDeclaration<*>) {
        if (type.parentNode.isEmpty || type.parentNode.get() !is TypeDeclaration<*>) {
            list.add(type.name.asString())
            return
        }
        gatherParentNames(list, type.parentNode.get() as TypeDeclaration<*>)
        list.add(type.name.asString())
    }

    private val TypeDeclaration<*>.className: ClassName
        get() {
            val names = mutableListOf<String>()
            gatherParentNames(names, this)

            return ClassName(
                findCompilationUnit().get().packageDeclaration.get().name.asString(),
                names
            )
        }

    private fun convertJavadocComment(comment: String): String {
        return comment.lines()
            .asSequence()
            .map { it.trim() }
            .map { it.removePrefix("* ") }
            .dropWhile { it.isBlank() }
            .map { it.trim() }
            .filter { it !in javaDocLinesToRemove }
            .map { it.replace("This parameter is required.", "") }
            .map {
                it.replace(seeAlsoRegex) {
                    val (url, label) = it.destructured
                    "[Documentation]($url)"
                }
            }
            .map {
                it.replace("<code>", "`")
                    .replace("</code>", "`")
            }
            .map {
                it.replace("<strong>", "**")
                    .replace("</strong>", "**")
            }
            .map {
                it.replace("<em>", "*")
                    .replace("</em>", "*")
            }
            .map {
                it.replace(aHrefRegex) { "[${it.groupValues[2]}](${it.groupValues[1]})" }
            }
            .map {
                it.replace("<p>", "")
            }
            .map {
                it.replace("<li>", "* ")
            }
            .map { it.replace("</li>", "") }
            .map {
                it.replace(linkRegex) { "[${it.groupValues[1]}]" }
            }
            .map {
                it.replace("<blockquote>", "")
            }
            .map { it.replace("</blockquote>", "") }
            .map {
                it.replace("<pre>", "```")
            }
            .map { it.replace("</pre>", "```") }
            .map {
                it.replace("/*", "/ *")
            }
            .map { it.replace("<ul>", "") }
            .map { it.replace("</ul>", "") }
            .filter { !it.startsWith("Sets the value of ") }
            .joinToString("\n")
    }

    private val seeAlsoRegex = Regex("^@see <a href=\"(.*?)\">(.*?)</a>\$")
    private val aHrefRegex = Regex("<a href=\"(.*?)\">(.*?)</a>")
    private val linkRegex = Regex("\\{@link (.*?)}")

    // Java CDK erroneously uses "This parameter is required." seeming randomly
    // remove "@return {@code this}" as that is an artifact of Java builder pattern
    private val javaDocLinesToRemove = setOf(
        "@return {@code this}",
        "<ul>",
        "</ul>",
        "<blockquote>",
        "</blockquote>",
        "@deprecated <ul>"
    )
}
