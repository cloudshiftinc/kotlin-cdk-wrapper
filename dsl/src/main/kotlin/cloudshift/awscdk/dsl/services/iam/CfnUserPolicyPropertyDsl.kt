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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iam.CfnUser
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnUserPolicyPropertyDsl {
    private val cdkBuilder: CfnUser.PolicyProperty.Builder = CfnUser.PolicyProperty.builder()

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnUser.PolicyProperty = cdkBuilder.build()
}
