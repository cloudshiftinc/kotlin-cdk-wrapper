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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iot.CfnPolicyProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnPolicyPropsDsl {
    private val cdkBuilder: CfnPolicyProps.Builder = CfnPolicyProps.builder()

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

    public fun build(): CfnPolicyProps = cdkBuilder.build()
}
