import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    java
    id("cloudshift.awscdkdsl.build.base")
}

val awscdk: Configuration by configurations.creating
val awscdkSource: Configuration by configurations.creating

dependencies {
    awscdk(project.libs.awscdk)
    awscdkSource(project.libs.awscdk) {
        artifact { classifier = "sources" }
        isTransitive = false
    }
    awscdkSource(project.libs.awscdk.constructs) {
        artifact { classifier = "sources" }
        isTransitive = false
    }
}

tasks {
    register<GenerateDslTask>("generateDsl") {
        outputDirectory = layout.projectDirectory.dir("kotlin-cdk-wrapper")
        classpath = awscdk
        sources = awscdkSource
    }

    named("precommit") { dependsOn(check) }
}
