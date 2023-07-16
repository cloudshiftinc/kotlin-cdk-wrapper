package cloudshift.awscdk.dsl.extensions.core

import cloudshift.awscdk.dsl.extensions.iam.action
import cloudshift.awscdk.dsl.services.iam.iam
import cloudshift.awscdk.dsl.extensions.iam.allow
import cloudshift.awscdk.dsl.extensions.iam.anyResource
import cloudshift.awscdk.dsl.extensions.iam.policyStatements
import io.kotest.core.spec.style.FunSpec

class ExtensionsKtTest : FunSpec({

    test("it") {
        val policyStatements = iam.policyStatements {
            policyStatement {
                sid("Something")
                action("s3:GetObject")
                allow()
                anyResource()
            }
        }
    }

})
