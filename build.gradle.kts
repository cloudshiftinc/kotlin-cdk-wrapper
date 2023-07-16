import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    id("cloudshift.awscdkdsl.build.base")
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



