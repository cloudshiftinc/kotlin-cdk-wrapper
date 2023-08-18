package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.awscdk
import io.kotest.core.spec.style.FunSpec
import software.amazon.awscdk.services.s3.HttpMethods

class S3BucketTest :
    FunSpec({
        test("abc") {
            val app = awscdk.app()
            val stack = awscdk.stack(scope = app, id = "TestStack")
            val bucket = s3.bucket(scope = stack, id = "TestBucket") { bucketName("test-bucket") }

            bucket.addCorsRule {
                allowedHeaders("Test-Header")
                allowedMethods(HttpMethods.HEAD)
                allowedOrigins("abc")
            }
        }
    })
