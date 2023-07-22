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
        sourceRoot.parse("software.amazon.awscdk", parserConfiguration) { _, _, result ->
            val cu = result.result.get()

            val classes = processCompilationUnit(cu)

            synchronized(sourceClasses) {
                sourceClasses.addAll(classes)
            }
            SourceRoot.Callback.Result.DONT_SAVE
        }

        val classMap = sourceClasses.associateBy { it.className }
        return CdkSourceModel(classes = sourceClasses, classMap = classMap)
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
                .map { method ->
                    val parameterType = method.parameters.first().type.asString()
                    val comment = method.comment.getOrNull()
                        ?.let { convertJavadocComment(it.content) }
                    CdkSourceMethod(
                        name = method.name.identifier,
                        type = parameterType,
                        comment = comment
                    )
                }

            else -> emptyList()
        }

        val comment = type.comment.getOrNull()
            ?.let { convertJavadocComment(it.content) }

        return CdkSourceClass(className = type.className, methods = methods, comment = comment)
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
            .map { replaceMap.entries.fold(it) { acc, entry -> acc.replace(entry.key, entry.value) } }
            .map { line ->
                line.replace(seeAlsoRegex) {
                    val (url, _) = it.destructured
                    "[Documentation]($url)"
                }
            }
            .map { line ->
                line.replace(aHrefRegex) { "[${it.groupValues[2]}](${it.groupValues[1]})" }
            }
            .map { line ->
                line.replace(linkRegex) { "[${it.groupValues[1]}]" }
            }
            .filter { !it.startsWith("Sets the value of ") }
            .joinToString("\n")
    }

    private val replaceMap = mapOf(
        "<blockquote>" to "",
        "</blockquote>" to "",
        "<pre>" to "```",
        "</pre>" to "```",
        "<ul>" to "",
        "</ul>" to "",
        "<ol>" to "",
        "</ol>" to "",
        "<li>" to "* ",
        "</li>" to "",
        "<p>" to "",
        "<strong>" to "**",
        "</strong>" to "**",
        "<em>" to "*",
        "</em>" to "*",
        "<code>" to "`",
        "</code>" to "`",

        // Java CDK erroneously uses "This parameter is required." seeming randomly
        "This parameter is required." to "",

        // do this last
        "/*" to "/ *"
    )
    private val seeAlsoRegex = Regex("^@see <a href=\"(.*?)\">(.*?)</a>\$")
    private val aHrefRegex = Regex("<a href=\"(.*?)\">(.*?)</a>")
    private val linkRegex = Regex("\\{@link (.*?)}")

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
