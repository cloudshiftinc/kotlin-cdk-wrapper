import cloudshift.awscdkdsl.build.dsl.GenerateDslTask

plugins {
    java
    id("cloudshift.awscdkdsl.build.base")
    alias(libs.plugins.release)
    alias(libs.plugins.nexusPublish)
}

release {
    preReleaseHooks {
        processTemplates {
            from(fileTree("gradle/docs") { include("**/*.md") })
            into(layout.projectDirectory)
        }
    }
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
val ktfmt by configurations.creating

dependencies {
    awscdk(project.libs.awscdk)
    awscdkSource(project.libs.awscdk) {
        artifact { classifier = "sources" }
        isTransitive = false
    }
    ktfmt("com.facebook:ktfmt:0.47")
}

tasks {
    register<GenerateDslTask>("generateDsl") {
        dslDir = file("dsl/src/main/kotlin")
        classpath = awscdk
        sources = awscdkSource
    }

    // from
    // https://github.com/Vampire/setup-wsl/blob/master/gradle/build-logic/src/main/kotlin/net/kautler/github_actions.gradle.kts
    val preprocessWorkflows by registering

    file(".github/workflows")
        .listFiles { _, name -> name.endsWith(".main.kts") }!!
        .forEach { workflowScript ->
            val workflowName = workflowScript.name.removeSuffix(".main.kts")
            val camelCasedWorkflowName =
                workflowName
                    .replace("""-\w""".toRegex()) {
                        it.value.substring(1).replaceFirstChar(Char::uppercaseChar)
                    }
                    .replaceFirstChar(Char::uppercaseChar)

            val task =
                register<Exec>("preprocess${camelCasedWorkflowName}Workflow") {
                    inputs.file(workflowScript).withPropertyName("workflowScript")
                    outputs
                        .file(workflowScript.resolveSibling("$workflowName.yaml"))
                        .withPropertyName("workflowFile")
                    commandLine(workflowScript.absolutePath)
                }
            preprocessWorkflows { dependsOn(task) }
        }

    val ktfmtFormat by
        registering(JavaExec::class) {
            onlyIf { System.getenv()["CI"] == null }
            val ktfmtArgs =
                mutableListOf(
                    "--kotlinlang-style",
                    "--do-not-remove-unused-imports",
                    layout.projectDirectory.asFile.absolutePath,
                )
            if (System.getenv()["CI"] != null) ktfmtArgs.add("--set-exit-if-changed")
            group = "formatting"
            description = "Run ktfmt"
            classpath = ktfmt
            mainClass.set("com.facebook.ktfmt.cli.Main")
            args(ktfmtArgs)
        }

    val check = named("check") { dependsOn(ktfmtFormat) }

    named("precommit") { dependsOn(check, preprocessWorkflows) }
}
