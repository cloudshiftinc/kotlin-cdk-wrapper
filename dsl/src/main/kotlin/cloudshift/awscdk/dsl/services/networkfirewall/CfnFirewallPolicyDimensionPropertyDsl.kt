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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import kotlin.String

@CdkDslMarker
public class CfnFirewallPolicyDimensionPropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.DimensionProperty.Builder =
        CfnFirewallPolicy.DimensionProperty.builder()

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFirewallPolicy.DimensionProperty = cdkBuilder.build()
}
