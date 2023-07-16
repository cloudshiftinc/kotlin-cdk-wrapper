#!/usr/bin/env kotlin

@file:DependsOn("io.github.typesafegithub:github-workflows-kt:0.47.0")
@file:Import("_shared.main.kts")

import io.github.typesafegithub.workflows.actions.actions.CheckoutV3
import io.github.typesafegithub.workflows.actions.gradle.GradleBuildActionV2
import io.github.typesafegithub.workflows.domain.RunnerType
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.domain.triggers.Push
import io.github.typesafegithub.workflows.dsl.expressions.expr
import io.github.typesafegithub.workflows.dsl.workflow
import io.github.typesafegithub.workflows.yaml.writeToFile

workflow(
    name = "Publish Kotlin AWS CDK DSL to Maven Central",
//    on = listOf(Push(tags = listOf("v*.*.*"))),
    on = listOf(Push()),
    sourceFile = __FILE__.toPath(),
    env = linkedMapOf(
        "ORG_GRADLE_PROJECT_signingKey" to expr("secrets.SIGNING_KEY"),
        "ORG_GRADLE_PROJECT_signingPassword" to expr("secrets.SIGNING_PASSWORD"),
        "ORG_GRADLE_PROJECT_sonatypeUsername" to expr("secrets.SONATYPEUSERNAME"),
        "ORG_GRADLE_PROJECT_sonatypePassword" to expr("secrets.SONATYPEPASSWORD"),
    ),
) {
    job(id = "build", runsOn = RunnerType.Labelled("Large_Runner")) {
        uses(name = "checkout", action = CheckoutV3())
        setupJava()
        run(command = "rm -rf \$HOME/.gradle/jdks/eclipse*")
        uses(name = "build", action = GradleBuildActionV2(
            gradleVersion = "wrapper",
            gradleHomeCacheCleanup = true,
            gradleHomeCacheIncludes = listOf("jdks", "caches", "notifications"),
            arguments = "build publishToSonatype closeAndReleaseSonatypeStagingRepository --info --stacktrace --no-configuration-cache"
        ))
    }
}.writeToFile()

