@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupActionDefinitionPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.ActionDefinitionProperty.Builder =
      CfnRuleGroup.ActionDefinitionProperty.builder()

  /**
   * @param publishMetricAction Stateless inspection criteria that publishes the specified metrics
   * to Amazon CloudWatch for the matching packet.
   * This setting defines a CloudWatch dimension value to be published.
   *
   * You can pair this custom action with any of the standard stateless rule actions. For example,
   * you could pair this in a rule action with the standard action that forwards the packet for
   * stateful inspection. Then, when a packet matches the rule, Network Firewall publishes metrics for
   * the packet and forwards it.
   */
  public fun publishMetricAction(publishMetricAction: IResolvable) {
    cdkBuilder.publishMetricAction(publishMetricAction)
  }

  /**
   * @param publishMetricAction Stateless inspection criteria that publishes the specified metrics
   * to Amazon CloudWatch for the matching packet.
   * This setting defines a CloudWatch dimension value to be published.
   *
   * You can pair this custom action with any of the standard stateless rule actions. For example,
   * you could pair this in a rule action with the standard action that forwards the packet for
   * stateful inspection. Then, when a packet matches the rule, Network Firewall publishes metrics for
   * the packet and forwards it.
   */
  public fun publishMetricAction(publishMetricAction: CfnRuleGroup.PublishMetricActionProperty) {
    cdkBuilder.publishMetricAction(publishMetricAction)
  }

  public fun build(): CfnRuleGroup.ActionDefinitionProperty = cdkBuilder.build()
}
