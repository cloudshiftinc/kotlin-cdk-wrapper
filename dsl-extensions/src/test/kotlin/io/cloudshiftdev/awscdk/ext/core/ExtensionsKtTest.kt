package io.cloudshiftdev.awscdk.ext.core

import io.cloudshiftdev.awscdk.App
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.ext.iam.action
import io.cloudshiftdev.awscdk.ext.iam.allow
import io.cloudshiftdev.awscdk.ext.iam.anyResource
import io.cloudshiftdev.awscdk.ext.iam.policyStatements
import io.cloudshiftdev.awscdk.ext.iam.resource
import io.cloudshiftdev.awscdk.services.s3.Bucket
import io.cloudshiftdev.constructs.Construct
import io.kotest.core.spec.style.FunSpec

class ExtensionsKtTest :
    FunSpec({
        test("it") {
            val app = App()
            val stack = Stack(scope = app, id = "TestStack")
            val bucket = Bucket(scope = stack, id = "TestBucket") { bucketName("test-bucket") }
            val policyStatements = policyStatements {
                policyStatement {
                    sid("Something")
                    action("s3:GetObject")
                    allow()
                    anyResource()
                    resources(
                        arn(stack) {
                            service("s3")
                            resource("myBucket")
                        }
                    )
                }
            }
        }
    })

private class MyConstruct(scope: Construct, id: String) : Construct(scope, id) {
    init {
        val policyStatements = policyStatements {
            policyStatement {
                sid("Something")
                action("s3:GetObject")
                allow()
                resource(
                    arn {
                        service("s3")
                        resource("myBucket")
                    }
                )
            }
        }
    }
}
