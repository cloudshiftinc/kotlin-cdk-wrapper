#!/usr/bin/env kotlin

@file:DependsOn("io.github.typesafegithub:github-workflows-kt:0.47.0")

import io.github.typesafegithub.workflows.actions.actions.CheckoutV3
import io.github.typesafegithub.workflows.actions.gradle.GradleBuildActionV2
import io.github.typesafegithub.workflows.domain.RunnerType.UbuntuLatest
import io.github.typesafegithub.workflows.domain.triggers.PullRequest
import io.github.typesafegithub.workflows.domain.triggers.Push
import io.github.typesafegithub.workflows.dsl.workflow
import io.github.typesafegithub.workflows.yaml.writeToFile

workflow(
    name = "Build Kotlin AWS CDK DSL",
    on = listOf(Push(), PullRequest()),
    sourceFile = __FILE__.toPath(),
) {
    job(id = "build", runsOn = UbuntuLatest) {
        uses(name = "checkout", action = CheckoutV3())
        uses(name = "build", action = GradleBuildActionV2(
            gradleVersion = "wrapper",
            gradleHomeCacheCleanup = true,
            gradleHomeCacheIncludes = listOf("jdks", "caches", "notifications"),
            arguments = "build publish --info --stacktrace"
        ))
    }
}.writeToFile()

