plugins {
    `kotlin-dsl`
}

//gradlePlugin {
//    plugins.register("cdk-dsl-plugin") {
//        id = "cloudshift.gradle.plugin.aws-cdk-dsl"
//        implementationClass = "cloudshift.gradle.awscdkdsl.CdkDslPlugin"
//    }
//}

dependencies {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencies {
    implementation("com.google.guava:guava:32.1.1-jre")
    implementation("com.squareup:kotlinpoet:1.14.2")
    implementation(libs.oshai.kotlinLogging)
    implementation(plugin(libs.plugins.kotlin.jvm))
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}


fun DependencyHandlerScope.plugin(id: String, version: String) = "$id:$id.gradle.plugin:$version"
fun DependencyHandlerScope.plugin(plugin: Provider<PluginDependency>): Provider<String> =
    plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }

