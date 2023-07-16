@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

@CdkDslMarker
public class CfnPolicyNetworkFirewallPolicyPropertyDsl {
  private val cdkBuilder: CfnPolicy.NetworkFirewallPolicyProperty.Builder =
      CfnPolicy.NetworkFirewallPolicyProperty.builder()

  public fun firewallDeploymentModel(firewallDeploymentModel: String) {
    cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
  }

  public fun build(): CfnPolicy.NetworkFirewallPolicyProperty = cdkBuilder.build()
}
