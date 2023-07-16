package cloudshift.awscdkdsl.build

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.internal.jvm.inspection.JvmVendor
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm")
}

val precommit by tasks.registering {
    group = "verification"
    dependsOn(tasks.named("check"))
}

tasks.withType<AbstractArchiveTask>().configureEach {
    isPreserveFileTimestamps = false
    isReproducibleFileOrder = true
}

// workaround for https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

java {
    withJavadocJar()
    withSourcesJar()
    consistentResolution {
        useCompileClasspathVersions()
    }
}

tasks.withType<Test>().configureEach {
    systemProperty("kotest.framework.dump.config", "true")
    useJUnitPlatform()
    maxParallelForks = (
        Runtime.getRuntime()
            .availableProcessors() / 2
        ).takeIf { it > 0 } ?: 1
    testLogging {
        events = setOf(
            TestLogEvent.FAILED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.STANDARD_OUT,
            TestLogEvent.STANDARD_ERROR
        )
        exceptionFormat = TestExceptionFormat.FULL
        showExceptions = true
        showCauses = true
        showStackTraces = true
    }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
    }
    compilerOptions {

    }
}

dependencies {
    implementation(libs.guava)
//    implementation(libs.pearx.kasechange)

    // Kotest
    testImplementation(platform(libs.kotest.bom))
    testImplementation(libs.kotest.assertions.core)
    testImplementation(libs.kotest.assertions.json)
    testImplementation(libs.kotest.framework.datatest)
    testImplementation(libs.kotest.property)
    testImplementation(libs.kotest.runner.junit5)

    val junitPlatform = platform(libs.junit.bom)
    testImplementation(junitPlatform)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.params)

    testRuntimeOnly(junitPlatform)
    testRuntimeOnly(libs.junit.jupiter.engine)
}

configurations {
    named(JavaPlugin.TEST_COMPILE_ONLY_CONFIGURATION_NAME) {
        extendsFrom(named(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME).get())
    }
    named(JavaPlugin.TEST_ANNOTATION_PROCESSOR_CONFIGURATION_NAME) {
        extendsFrom(named(JavaPlugin.ANNOTATION_PROCESSOR_CONFIGURATION_NAME).get())
    }
    named(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME) {
        extendsFrom(named(JavaPlugin.ANNOTATION_PROCESSOR_CONFIGURATION_NAME).get())
    }
}

kotlin {
    explicitApi()
    jvmToolchain{
        languageVersion = JavaLanguageVersion.of(17)
        vendor = JvmVendorSpec.AMAZON
    }
}
