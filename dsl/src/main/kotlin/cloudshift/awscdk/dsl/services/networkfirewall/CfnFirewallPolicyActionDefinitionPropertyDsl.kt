@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyActionDefinitionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.ActionDefinitionProperty.Builder =
      CfnFirewallPolicy.ActionDefinitionProperty.builder()

  public fun publishMetricAction(publishMetricAction: IResolvable) {
    cdkBuilder.publishMetricAction(publishMetricAction)
  }

  public
      fun publishMetricAction(publishMetricAction: CfnFirewallPolicy.PublishMetricActionProperty) {
    cdkBuilder.publishMetricAction(publishMetricAction)
  }

  public fun build(): CfnFirewallPolicy.ActionDefinitionProperty = cdkBuilder.build()
}
