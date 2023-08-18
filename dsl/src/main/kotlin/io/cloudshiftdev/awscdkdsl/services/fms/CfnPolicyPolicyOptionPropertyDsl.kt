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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * Contains the AWS Network Firewall firewall policy options to configure the policy's deployment
 * model and third-party firewall policy settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * PolicyOptionProperty policyOptionProperty = PolicyOptionProperty.builder()
 * .networkFirewallPolicy(NetworkFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build())
 * .thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html)
 */
@CdkDslMarker
public class CfnPolicyPolicyOptionPropertyDsl {
    private val cdkBuilder: CfnPolicy.PolicyOptionProperty.Builder =
        CfnPolicy.PolicyOptionProperty.builder()

    /** @param networkFirewallPolicy Defines the deployment model to use for the firewall policy. */
    public fun networkFirewallPolicy(networkFirewallPolicy: IResolvable) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy)
    }

    /** @param networkFirewallPolicy Defines the deployment model to use for the firewall policy. */
    public fun networkFirewallPolicy(
        networkFirewallPolicy: CfnPolicy.NetworkFirewallPolicyProperty
    ) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy)
    }

    /**
     * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall policy.
     */
    public fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: IResolvable) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy)
    }

    /**
     * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall policy.
     */
    public fun thirdPartyFirewallPolicy(
        thirdPartyFirewallPolicy: CfnPolicy.ThirdPartyFirewallPolicyProperty
    ) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy)
    }

    public fun build(): CfnPolicy.PolicyOptionProperty = cdkBuilder.build()
}
