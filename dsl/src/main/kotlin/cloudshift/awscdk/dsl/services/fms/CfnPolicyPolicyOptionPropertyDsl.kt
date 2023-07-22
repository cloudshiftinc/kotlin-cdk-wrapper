@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fms.CfnPolicy

@CdkDslMarker
public class CfnPolicyPolicyOptionPropertyDsl {
  private val cdkBuilder: CfnPolicy.PolicyOptionProperty.Builder =
      CfnPolicy.PolicyOptionProperty.builder()

  /**
   * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
   */
  public fun networkFirewallPolicy(networkFirewallPolicy: IResolvable) {
    cdkBuilder.networkFirewallPolicy(networkFirewallPolicy)
  }

  /**
   * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
   */
  public fun networkFirewallPolicy(networkFirewallPolicy: CfnPolicy.NetworkFirewallPolicyProperty) {
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
  public
      fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: CfnPolicy.ThirdPartyFirewallPolicyProperty) {
    cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy)
  }

  public fun build(): CfnPolicy.PolicyOptionProperty = cdkBuilder.build()
}
