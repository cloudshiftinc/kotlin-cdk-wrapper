@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * Configures the deployment model for the third-party firewall.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * ThirdPartyFirewallPolicyProperty thirdPartyFirewallPolicyProperty =
 * ThirdPartyFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
 */
@CdkDslMarker
public class CfnPolicyThirdPartyFirewallPolicyPropertyDsl {
    private val cdkBuilder: CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder =
        CfnPolicy.ThirdPartyFirewallPolicyProperty.builder()

    /**
     * @param firewallDeploymentModel Defines the deployment model to use for the third-party
     *   firewall policy.
     */
    public fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
    }

    public fun build(): CfnPolicy.ThirdPartyFirewallPolicyProperty = cdkBuilder.build()
}
