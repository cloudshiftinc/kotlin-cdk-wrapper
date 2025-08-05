package cloudshift.awscdkdsl.build

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


