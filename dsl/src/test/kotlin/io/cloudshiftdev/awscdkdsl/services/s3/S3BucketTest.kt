package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdk.App
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.Bucket
import io.cloudshiftdev.awscdk.services.s3.HttpMethods
import io.kotest.core.spec.style.FunSpec

class S3BucketTest :
    FunSpec({
        test("abc") {
            val app = App()
            val stack = Stack(scope = app, id = "TestStack")
            val bucket = Bucket(scope = stack, id = "TestBucket") { bucketName("test-bucket") }

            bucket.addCorsRule {
                allowedHeaders("Test-Header")
                allowedMethods(HttpMethods.HEAD)
                allowedOrigins("abc")
            }
        }
    })
