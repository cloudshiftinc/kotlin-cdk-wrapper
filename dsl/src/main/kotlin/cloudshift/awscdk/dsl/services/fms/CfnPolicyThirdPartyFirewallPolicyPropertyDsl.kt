@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

@CdkDslMarker
public class CfnPolicyThirdPartyFirewallPolicyPropertyDsl {
  private val cdkBuilder: CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder =
      CfnPolicy.ThirdPartyFirewallPolicyProperty.builder()

  /**
   * @param firewallDeploymentModel Defines the deployment model to use for the third-party firewall
   * policy. 
   */
  public fun firewallDeploymentModel(firewallDeploymentModel: String) {
    cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
  }

  public fun build(): CfnPolicy.ThirdPartyFirewallPolicyProperty = cdkBuilder.build()
}
