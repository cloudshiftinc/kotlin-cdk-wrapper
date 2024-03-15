import com.ncorti.ktfmt.gradle.tasks.KtfmtBaseTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("cloudshift.awscdkdsl.build.kotlin-library")
    id("cloudshift.awscdkdsl.build.library-publishing")
}


dependencies {
    implementation(libs.awscdk)
    api(project(":kotlin-cdk-wrapper-common"))
}


// lots of generated Kotlin drives memory requirement
//kotlin {
//    when {
//        System.getenv("CI") != null -> {
//            kotlinDaemonJvmArgs =  listOf("-Xms10g", "-Xmx10g")
//        }
//        else -> {
//            kotlinDaemonJvmArgs =  listOf("-Xms10g", "-Xmx10g")
//        }
//    }
//}

tasks.named<KotlinCompile>("compileKotlin") {
    onlyIf {
        // don't compile DSL code when in IntelliJ as it's large and takes considerable time
        when {
//            System.getenv("XPC_SERVICE_NAME")?.contains("intellij") ?: false -> false
//            System.getenv("IDEA_INITIAL_DIRECTORY") != null -> false
            else -> true
        }
    }
}


tasks.withType<KtfmtBaseTask>().configureEach {
    enabled = false
}

tasks.withType<Jar>() {
    isZip64 = true
}
