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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnRegistryPolicyPropsDsl {
    private val cdkBuilder: CfnRegistryPolicyProps.Builder = CfnRegistryPolicyProps.builder()

    public fun policyText(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyText(builder.map)
    }

    public fun policyText(policyText: Any) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnRegistryPolicyProps = cdkBuilder.build()
}
