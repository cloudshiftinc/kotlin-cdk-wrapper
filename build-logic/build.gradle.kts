import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

dependencies {
    repositories {
        maven("https://cache-redirector.jetbrains.com/repo1.maven.org/maven2")
        maven("https://cache-redirector.jetbrains.com/plugins.gradle.org")
    }
}

dependencies {
    implementation(libs.guava)
    implementation(libs.squareup.kotlinpoet)
    implementation(plugin(libs.plugins.kotlin.jvm))

    implementation(platform(libs.asm.bom))
    implementation(libs.asm.core)
    implementation(libs.asm.tree)
    implementation(libs.asm.util)
    implementation(libs.caffeine)
    implementation(libs.aspectj.tools)

    implementation("com.github.javaparser:javaparser-core:3.25.4")

    implementation(
        files(libs.javaClass.superclass.protectionDomain.codeSource.location)
    )
}

// https://kotlinlang.org/docs/whatsnew19.html#try-the-k2-compiler-in-your-project
if (GradleVersion.current() < GradleVersion.version("8.3")) {
    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            languageVersion.set(KotlinVersion.KOTLIN_1_9)
            apiVersion.set(KotlinVersion.KOTLIN_1_9)
        }
    }
}

fun DependencyHandlerScope.plugin(id: String, version: String) = "$id:$id.gradle.plugin:$version"

fun DependencyHandlerScope.plugin(plugin: Provider<PluginDependency>): Provider<String> = plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }
