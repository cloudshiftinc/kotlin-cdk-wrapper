@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.CfnResourcePolicy
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
