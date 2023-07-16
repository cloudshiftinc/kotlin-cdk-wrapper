import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    id("cloudshift.awscdkdsl.build.base")
    id("io.github.gradle-nexus.publish-plugin") version("2.0.0-rc-1")
}

nexusPublishing {
    repositories {
        sonatype {  //only for users registered in Sonatype after 24 Feb 2021
            nexusUrl = uri("https://s01.oss.sonatype.org/service/local/")
            snapshotRepositoryUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
    }

    val sonatypeUsername : String? by project
    val sonatypePassword: String? by project
    println("User: '${sonatypeUsername.uppercase()}' : '${sonatypePassword.uppercase()}'")
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



