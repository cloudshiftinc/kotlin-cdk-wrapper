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
                    developerConnection.set(
                        "scm:git:ssh://github.com:cloudshiftinc/awscdk-dsl-kotlin.git"
                    )
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
    when {
        !ci -> false
        else -> true
    }
}

tasks.withType<PublishToMavenRepository>().configureEach {
    onlyIf("Publishing only allowed on CI") { publishingPredicate.get() }
}

tasks.named("publishToSonatype") {
    onlyIf("Publishing only allowed on CI") { publishingPredicate.get() }
}
