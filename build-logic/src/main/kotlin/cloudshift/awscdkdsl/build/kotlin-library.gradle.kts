package cloudshift.awscdkdsl.build

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm")
    id("cloudshift.awscdkdsl.build.base")
    id("com.ncorti.ktfmt.gradle")
}

ktfmt {
    kotlinLangStyle()
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
    consistentResolution { useCompileClasspathVersions() }
}

tasks.withType<Test>().configureEach {
    systemProperty("kotest.framework.dump.config", "true")
    useJUnitPlatform()
    maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).takeIf { it > 0 } ?: 1
    testLogging {
        events =
            setOf(
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
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
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
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.AMAZON
    }
    kotlinDaemonJvmArgs = when {
        System.getenv("CI") != null -> listOf("-Xms20g", "-Xmx20g")
        else -> listOf("-Xms10g", "-Xmx15g")
    }
}
