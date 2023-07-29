import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("cloudshift.awscdkdsl.build.kotlin-library")
    id("cloudshift.awscdkdsl.build.library-publishing")
}

dependencies {
    api(libs.awscdk)
    api(projects.common)
}

// lots of generated Kotlin drives memory requirement
kotlin { kotlinDaemonJvmArgs = listOf("-Xms8g", "-Xmx8g") }

tasks.named<KotlinCompile>("compileKotlin") {
    onlyIf {
        // don't compile DSL code when in IntelliJ as it's large and takes considerable time
        when {
            System.getenv("XPC_SERVICE_NAME")?.contains("intellij") ?: false -> false
            System.getenv("IDEA_INITIAL_DIRECTORY") != null -> false
            else -> true
        }
    }
}
