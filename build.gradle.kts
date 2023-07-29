import cloudshift.awscdkdsl.build.dsl.GenerateDslTask
import cloudshift.gradle.release.preProcessFiles

plugins {
    java
    id("cloudshift.awscdkdsl.build.base")
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0-rc-1" // only on root project
    id("de.undercouch.download") version "5.4.0"
    id("cloudshift.release-plugin")
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
}

tasks {
    //    val downloadCloudformationSpecZip = register<Download>("downloadCloudFormationSpecZip") {
    //
    // src("https://d1uauaxba7bl26.cloudfront.net/latest/CloudFormationResourceSpecification.zip")
    //        onlyIfModified(true)
    //        dest(temporaryDir.resolve("cloudFormationSpec.zip"))
    //    }

    register<GenerateDslTask>("generateDsl") {
        dslDir = file("dsl/src/main/kotlin")
        classpath = awscdk
        sources = awscdkSource
        //        cloudFormationSpecificationZip = downloadCloudformationSpecZip.map { it.dest }
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

    named("precommit") { dependsOn(preprocessWorkflows) }
}

val ktfmt by configurations.creating

dependencies { ktfmt("com.facebook:ktfmt:0.44") }

val ktfmtFormat by
    tasks.registering(JavaExec::class) {
        val ktfmtArgs =
            mutableListOf("--kotlinlang-style", layout.projectDirectory.asFile.absolutePath)
        if (System.getenv()["CI"] != null) ktfmtArgs.add("--set-exit-if-changed")
        group = "formatting"
        description = "Run ktfmt"
        classpath = ktfmt
        mainClass.set("com.facebook.ktfmt.cli.Main")
        //        jvmArgs("--add-opens=java.base/java.lang=ALL-UNNAMED")
        args(ktfmtArgs)
    }

val check = tasks.named("check") { dependsOn(ktfmtFormat) }

tasks.named("precommit") { dependsOn(check) }

// val noLocalChanges = tasks.register<NoLocalChanges>("noLocalChanges") {
//    group = LifecycleBasePlugin.VERIFICATION_GROUP
//    onlyIf { System.getenv()["CI"] != null }
//    dependsOn(ktlintFormat)
// }

// tasks.named("check") {
//    dependsOn(noLocalChanges)
// }

release {
    checks {
        failOnPushNeeded = false
        failOnPullNeeded = false
        failOnStagedFiles = false
        failOnUnstagedFiles = false
    }
    preProcessFiles {
        templates(sourceDir = "gradle/templates", destinationDir = layout.projectDirectory)
        replacements { includes("README.MD") }
    }
}
