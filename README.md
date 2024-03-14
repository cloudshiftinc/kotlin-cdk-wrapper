![Maven Central](https://img.shields.io/maven-central/v/io.cloudshiftdev.awscdk-dsl-kotlin/dsl)
![GitHub](https://img.shields.io/github/license/cloudshiftinc/awscdk-dsl-kotlin)
# Kotlin DSL for AWS CDK

Use the AWS CDK with all the power of a native Kotlin DSL!

```kotlin
val app = App()
val stack = Stack(scope = app, id = "TestStack")
val bucket = Bucket(scope = stack, id = "TestBucket") { bucketName("test-bucket") }

bucket.addCorsRule {
    allowedHeaders("Test-Header")
    allowedMethods(HttpMethods.HEAD)
    allowedOrigins("abc")
}

app.synth()
```

The Kotlin DSL is fully Kotlin - no import from the Java CDK.  Any construct / object that has a builder has a corresponding DSL.

This provides the basis for powerful Kotlin extensions to the DSL to supercharge your CDK code.

# Getting Started

For the core DSL add this dependency to your Gradle script:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl:0.7.0")`

Alternately, to use the extensions (recommended), use this dependency instead:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl-extensions:0.7.0")`

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
