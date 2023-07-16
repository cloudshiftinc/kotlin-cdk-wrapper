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
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}


fun DependencyHandlerScope.plugin(id: String, version: String) = "$id:$id.gradle.plugin:$version"
fun DependencyHandlerScope.plugin(plugin: Provider<PluginDependency>): Provider<String> =
    plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }

