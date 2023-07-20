package cloudshift.awscdk.dsl.extensions.core

import cloudshift.awscdk.dsl.awscdk
import cloudshift.awscdk.dsl.extensions.iam.action
import cloudshift.awscdk.dsl.extensions.iam.allow
import cloudshift.awscdk.dsl.extensions.iam.anyResource
import cloudshift.awscdk.dsl.extensions.iam.policyStatements
import cloudshift.awscdk.dsl.extensions.iam.resource
import cloudshift.awscdk.dsl.services.iam.iam
import cloudshift.awscdk.dsl.services.s3.s3
import io.kotest.core.spec.style.FunSpec
import software.constructs.Construct

class ExtensionsKtTest : FunSpec({

    test("it") {
        val app = awscdk.app()
        val stack = awscdk.stack(scope = app, id = "TestStack")
        val bucket = s3.bucket(scope = stack, id = "TestBucket") {
            bucketName("test-bucket")
        }
        val policyStatements = iam.policyStatements {
            policyStatement {
                sid("Something")
                action("s3:GetObject")
                allow()
                anyResource()
                resources(
                    arn(stack) {
                        service("s3")
                        resource("myBucket")
                    },
                )
            }
        }
    }
})

private class MyConstruct(scope: Construct, id: String) : Construct(scope, id) {
    init {
        val policyStatements = iam.policyStatements {
            policyStatement {
                sid("Something")
                action("s3:GetObject")
                allow()
                resource(
                    arn {
                        service("s3")
                        resource("myBucket")
                    },
                )
            }
        }
    }
}
