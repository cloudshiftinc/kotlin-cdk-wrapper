rootProject.name = "awscdk-dsl-kotlin"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven("https://cache-redirector.jetbrains.com/plugins.gradle.org")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://cache-redirector.jetbrains.com/repo1.maven.org/maven2")
    }
}


include(":common")
include(":dsl")
include(":dsl-extensions")
