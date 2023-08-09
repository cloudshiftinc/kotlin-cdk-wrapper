![Maven Central](https://img.shields.io/maven-central/v/io.cloudshiftdev.awscdk-dsl-kotlin/dsl)
![GitHub](https://img.shields.io/github/license/cloudshiftinc/awscdk-dsl-kotlin)
[![ktlint](https://img.shields.io/badge/ktlint%20code--style-%E2%9D%A4-FF4081)](https://pinterest.github.io/ktlint/)
# Kotlin DSL for AWS CDK

Use the AWS CDK with all the power of a native Kotlin DSL!

```kotlin
val bucket = s3.bucket(scope = stack, id = "TestBucket") {
            bucketName("test-bucket")
        }

bucket.addCorsRule {
    allowedHeaders("Test-Header")
    allowedMethods(HttpMethods.HEAD)
    allowedOrigins("abc")
}
```

The Kotlin DSL wraps the AWS CDK Java library, directly using the builders exposed there.  Any construct / object that has a builder has a corresponding DSL.

This provides the basis for powerful Kotlin extensions to the DSL to supercharge your CDK code.

# Getting Started

For the core DSL add this dependency to your Gradle script:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl:{{releaseVersion}}")`

Alternately, to use the extensions (recommended), use this dependency instead:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl-extensions:{{releaseVersion}}")`

# Extensions

The `dsl-extensions` module provides several DSL extensions to further smooth out the CDK experience:

## IAM

IAM extensions are provided for policy statements:

```kotlin
val policyStatements = iam.policyStatements {
            policyStatement {
                sid("Something")
                action("s3:GetObject")
                allow()
                anyResource()
            }
        }
```
