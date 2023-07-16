[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.cloudshiftdev.awscdk-dsl-kotlin/dsl/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/io.cloudshiftdev.awscdk-dsl-kotlin/dsl)

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

For the core DSL pull add this dependency to your Gradle script:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl:<version>")`

Alternately, to use the extensions (recommended) use this dependency instead:

`implementation("io.cloudshiftdev.awscdk-dsl-kotlin:dsl-extensions:<version>")`

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


# Known issues

* Argument names are 'arg0' etc due to Java CDK library not exposing argument names.  Aside from `scope` and `id` argument names (which are inferred).  Issue #1;
* JavaDoc comments are not pulled across;
* Deprecation annotation are not pulled across;
* Overloaded arguments are skipped as they aren't readily mapped to Kotlin;

