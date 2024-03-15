import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    java
    id("cloudshift.awscdkdsl.build.base")
    alias(libs.plugins.nexusPublish)
}

nexusPublishing {
    this.repositories {
        sonatype { // only for users registered in Sonatype after 24 Feb 2021
            nexusUrl = uri("https://s01.oss.sonatype.org/service/local/")
            snapshotRepositoryUrl =
                uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
    }
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
