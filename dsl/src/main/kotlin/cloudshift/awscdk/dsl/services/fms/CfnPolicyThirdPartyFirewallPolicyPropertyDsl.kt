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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fms.CfnPolicy
import kotlin.String

@CdkDslMarker
public class CfnPolicyThirdPartyFirewallPolicyPropertyDsl {
    private val cdkBuilder: CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder =
        CfnPolicy.ThirdPartyFirewallPolicyProperty.builder()

    public fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
    }

    public fun build(): CfnPolicy.ThirdPartyFirewallPolicyProperty = cdkBuilder.build()
}
