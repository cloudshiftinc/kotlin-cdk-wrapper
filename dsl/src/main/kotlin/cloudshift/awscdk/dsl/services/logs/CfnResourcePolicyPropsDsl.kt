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
import software.amazon.awscdk.services.logs.CfnResourcePolicyProps
import kotlin.String

@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
