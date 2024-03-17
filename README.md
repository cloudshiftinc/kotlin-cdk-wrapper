![Maven Central](https://img.shields.io/maven-central/v/io.cloudshiftdev.kotlin-cdk-wrapper/kotlin-cdk-wrapper)
![GitHub](https://img.shields.io/github/license/cloudshiftinc/kotlin-cdk-wrapper)
# Kotlin Wrapper for AWS CDK

Use the AWS CDK with all the power of Kotlin!

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

The Kotlin DSL is fully Kotlin - no imports from the Java CDK.  Any construct / object that has a builder has a corresponding DSL.

This provides the basis for powerful Kotlin extensions to the DSL to supercharge your CDK code.

# Getting Started

Gradle:

`implementation("io.cloudshiftdev.kotlin-cdk-wrapper:kotlin-cdk-wrapper:0.7.6")`

