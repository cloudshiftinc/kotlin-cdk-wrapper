package cloudshift.awscdkdsl.build

plugins {
    `maven-publish`
    signing
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            pom {
                name.set("awscdk-dsl-kotlin")
                description.set("Kotlin DSL for AWS CDK")
                url.set("https://github.com/cloudshiftinc/awscdk-dsl-kotlin")

                licenses {
                    license {
                        name.set("Apache License, version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/cloudshiftinc/awscdk-dsl-kotlin.git/")
                    developerConnection.set("scm:git:ssh://github.com:cloudshiftinc/awscdk-dsl-kotlin.git")
                    url.set("https://github.com/cloudshiftinc/awscdk-dsl-kotlin")
                }

                developers {
                    developer {
                        id.set("cloudshiftchris")
                        name.set("Chris Lee")
                        email.set("chris@cloudshiftconsulting.com")
                    }
                }
            }
        }
    }
}

signing {
    val signingKey: String? by project
    val signingPassword: String? by project
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["mavenJava"])
}

val publishingPredicate = provider {
    val ci = System.getenv()["CI"] == "true"
    System.getenv().filter {
        it.key.startsWith("GITHUB_") &&
            (it.key.contains("REF") || it.key.contains("EVENT"))
    }.forEach {
        println("Publishing env: ${it.key} -> ${it.value}")
    }

    val eventName = System.getenv()["GITHUB_EVENT_NAME"]
    val refName = System.getenv()["GITHUB_REF_NAME"]

    when {
        !ci -> false
        eventName == "push" && refName == "main" -> true
        // TODO - handle PR merges
        else -> false
    }
}

tasks.withType<PublishToMavenRepository>().configureEach {
    onlyIf("Publishing only allowed on CI") {
        publishingPredicate.get()
    }
}

tasks.named("publishToSonatype") {
    onlyIf("Publishing only allowed on CI") {
        publishingPredicate.get()
    }
}

/*
For a push on main:

Publishing env: GITHUB_REF_TYPE -> branch
Publishing env: GITHUB_REF -> refs/heads/main
Publishing env: GITHUB_BASE_REF ->
Publishing env: GITHUB_EVENT_NAME -> push
Publishing env: GITHUB_WORKFLOW_REF -> cloudshiftinc/awscdk-dsl-kotlin/.github/workflows/build.yaml@refs/heads/main
Publishing env: GITHUB_REF_NAME -> main
Publishing env: GITHUB_HEAD_REF ->

 */

