#!/usr/bin/env kotlin

@file:DependsOn("io.github.typesafegithub:github-workflows-kt:0.48.0")

import io.github.typesafegithub.workflows.actions.actions.CheckoutV3
import io.github.typesafegithub.workflows.actions.actions.SetupJavaV3
import io.github.typesafegithub.workflows.actions.gradle.GradleBuildActionV2
import io.github.typesafegithub.workflows.domain.RunnerType
import io.github.typesafegithub.workflows.domain.triggers.PullRequest
import io.github.typesafegithub.workflows.domain.triggers.Push
import io.github.typesafegithub.workflows.dsl.expressions.expr
import io.github.typesafegithub.workflows.dsl.workflow
import io.github.typesafegithub.workflows.yaml.writeToFile

workflow(
    name = "Build Kotlin AWS CDK DSL",
    on = listOf(Push(), PullRequest()),
    sourceFile = __FILE__.toPath(),
    env = linkedMapOf(
        "GRADLE_BUILD_ACTION_CACHE_DEBUG_ENABLED" to "false",
        "ORG_GRADLE_PROJECT_signingKey" to expr("secrets.SIGNING_KEY"),
        "ORG_GRADLE_PROJECT_signingPassword" to expr("secrets.SIGNING_PASSWORD"),
        "ORG_GRADLE_PROJECT_sonatypeUsername" to expr("secrets.SONATYPEUSERNAME"),
        "ORG_GRADLE_PROJECT_sonatypePassword" to expr("secrets.SONATYPEPASSWORD"),
    )
) {
    job(id = "build", runsOn = RunnerType.Labelled("Large_Runner")) {
        uses(name = "checkout", action = CheckoutV3())
        uses(
            name = "Set up JDK", action = SetupJavaV3(
                javaVersion = "17",
                distribution = SetupJavaV3.Distribution.Corretto,
                checkLatest = true
            )
        )
        uses(
            name = "build", action = GradleBuildActionV2(
                gradleVersion = "wrapper",
                gradleHomeCacheCleanup = true,
                gradleHomeCacheIncludes = listOf("jdks", "caches", "notifications"),
                arguments = "build --info --scan --stacktrace"
            )
        )
        uses(
            name = "publish", action = GradleBuildActionV2(
                gradleVersion = "wrapper",
                arguments = "publishToSonatype closeAndReleaseSonatypeStagingRepository --info --stacktrace --no-configuration-cache"
            )
        )
    }
}.writeToFile()

