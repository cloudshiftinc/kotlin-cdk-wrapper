package io.cloudshiftdev.awscdkdsl.ext.core

import io.cloudshiftdev.awscdkdsl.awscdk
import io.cloudshiftdev.awscdkdsl.ext.iam.action
import io.cloudshiftdev.awscdkdsl.ext.iam.allow
import io.cloudshiftdev.awscdkdsl.ext.iam.anyResource
import io.cloudshiftdev.awscdkdsl.ext.iam.policyStatements
import io.cloudshiftdev.awscdkdsl.ext.iam.resource
import io.cloudshiftdev.awscdkdsl.services.iam.iam
import io.cloudshiftdev.awscdkdsl.services.s3.s3
import io.kotest.core.spec.style.FunSpec
import software.constructs.Construct

class ExtensionsKtTest :
    FunSpec({
        test("it") {
            val app = awscdk.app()
            val stack = awscdk.stack(scope = app, id = "TestStack")
            val bucket = s3.bucket(scope = stack, id = "TestBucket") { bucketName("test-bucket") }
            val policyStatements =
                iam.policyStatements {
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
        val policyStatements =
            iam.policyStatements {
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
