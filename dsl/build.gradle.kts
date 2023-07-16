import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("cloudshift.awscdkdsl.build.kotlin-library")
}

dependencies {
    api(libs.awscdk)
    api(projects.common)


}

tasks.withType<KotlinCompile>().configureEach {
    onlyIf {
        when {
            System.getenv("XPC_SERVICE_NAME")?.contains("intellij") ?: false -> false
            System.getenv("IDEA_INITIAL_DIRECTORY") != null -> false
            else -> true
        }
    }
}

