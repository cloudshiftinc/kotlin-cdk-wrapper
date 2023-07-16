package cloudshift.awscdk.dsl.extensions.core

import cloudshift.awscdk.dsl.services.iam.iam
import cloudshift.awscdk.dsl.extensions.iam.allow
import cloudshift.awscdk.dsl.extensions.iam.anyResource
import cloudshift.awscdk.dsl.extensions.iam.policyStatements
import io.kotest.core.spec.style.FunSpec

class ExtensionsKtTest : FunSpec({

    test("it") {
        val policyStatements = iam.policyStatements {
            policyStatement {
                sid("abc")
                allow()
                anyResource()
                conditions {
                    "abc" {
                        "aaa" to "def"
                    }
                }
            }
        }
    }

})
