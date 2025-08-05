package cloudshift.awscdkdsl.build

import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import gradle.kotlin.dsl.accessors._94cffe4e74c4f6a3b1c88c3e0c336ef5.mavenPublishing

plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    pom {
        name = "awscdk-dsl-kotlin"
        description = "Kotlin DSL for AWS CDK"
        inceptionYear = "2023"
        url = "https://github.com/cloudshiftinc/awscdk-dsl-kotlin"
        licenses {
            license {
                name = "Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "cloudshiftchris"
                name = "Chris Lee"
                email = "chris@cloudshiftconsulting.com"
            }
        }
        scm {
            connection = "scm:git:git://github.com/cloudshiftinc/awscdk-dsl-kotlin.git"
            developerConnection =
                "scm:git:https://github.com/cloudshiftinc/awscdk-dsl-kotlin.git"
            url = "https://github.com/cloudshiftinc/awscdk-dsl-kotlin"
        }
    }
}

/*publishing {
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
}*/

val publishingPredicate = provider {
    val ci = System.getenv("CI") == "true" && System.getenv("GITHUB_REF") == "refs/heads/main"
    when {
        !ci -> false
        else -> true
    }
}

tasks.withType<PublishToMavenRepository>().configureEach {
    onlyIf("Publishing only allowed on CI") { publishingPredicate.get() }
}


