import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    id("cloudshift.awscdkdsl.build.base")
    id("io.github.gradle-nexus.publish-plugin") version ("2.0.0-rc-1")  // only on root project
}

nexusPublishing {
    this.repositories {
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

    // from https://github.com/Vampire/setup-wsl/blob/master/gradle/build-logic/src/main/kotlin/net/kautler/github_actions.gradle.kts
    val preprocessWorkflows by registering

    file(".github/workflows").listFiles { _, name -> name.endsWith(".main.kts") }!!.forEach {workflowScript ->
        val workflowName = workflowScript.name.removeSuffix(".main.kts")
        val camelCasedWorkflowName = workflowName.replace("""-\w""".toRegex()) {
            it.value.substring(1).replaceFirstChar(Char::uppercaseChar)
        }.replaceFirstChar(Char::uppercaseChar)

        val task = register<Exec>("preprocess${camelCasedWorkflowName}Workflow") {
            inputs.file(workflowScript).withPropertyName("workflowScript")
            outputs.file(workflowScript.resolveSibling("$workflowName.yaml")).withPropertyName("workflowFile")
            commandLine(workflowScript.absolutePath)
        }
        preprocessWorkflows {
            dependsOn(task)
        }
    }

    named("precommit") {
        dependsOn(preprocessWorkflows)
    }
}



