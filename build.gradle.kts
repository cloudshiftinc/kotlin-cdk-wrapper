import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    id("cloudshift.awscdkdsl.build.base")
    id("io.github.gradle-nexus.publish-plugin") version("1.3.0")
}

nexusPublishing {
    repositories {
        sonatype {  //only for users registered in Sonatype after 24 Feb 2021
            nexusUrl = uri("https://s01.oss.sonatype.org/service/local/")
            snapshotRepositoryUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
    }
}

val awscdk: Configuration by configurations.creating

dependencies {
    awscdk(project.libs.awscdk)
}

tasks {
    register<GenerateDslTask>("generateDsl") {
        dslDir = file("dsl/src/main/kotlin")
        classpath = awscdk
    }
}



