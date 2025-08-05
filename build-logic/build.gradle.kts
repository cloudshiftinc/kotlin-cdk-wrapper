plugins { `kotlin-dsl` }

dependencies {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencies {

    // for convention plugins
    implementation(plugin(libs.plugins.kotlin.jvm))
    implementation(plugin(libs.plugins.ktfmt))
    implementation(plugin(libs.plugins.vanniktech.maven.publish))

    // for generating Kotlin DSL
    implementation(libs.guava)
    implementation(libs.squareup.kotlinpoet)
    implementation(platform(libs.asm.bom))
    implementation(libs.asm.core)
    implementation(libs.asm.tree)
    implementation(libs.asm.util)
    implementation(libs.caffeine)
    implementation(libs.aspectj.tools)
    implementation(libs.javaparser.core)

    implementation(platform(libs.jackson.bom))
    implementation(libs.jackson.core)
    implementation(libs.jackson.databind)
    implementation(libs.jackson.module.kotlin)

    implementation("net.pearx.kasechange:kasechange:1.4.1")

    // release management
    implementation("io.github.z4kn4fein:semver:1.4.2")
    // implementation(plugin("org.ajoberstar.grgit.service", "5.2.0"))

    // workaround for using version catalog in precompiled script plugins
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

fun DependencyHandlerScope.plugin(id: String, version: String) = "$id:$id.gradle.plugin:$version"

fun DependencyHandlerScope.plugin(plugin: Provider<PluginDependency>): Provider<String> =
    plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }
