@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * A custom action to use in stateless rule actions settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * ActionDefinitionProperty actionDefinitionProperty = ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-actiondefinition.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyActionDefinitionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.ActionDefinitionProperty.Builder =
      CfnFirewallPolicy.ActionDefinitionProperty.builder()

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
  public
      fun publishMetricAction(publishMetricAction: CfnFirewallPolicy.PublishMetricActionProperty) {
    cdkBuilder.publishMetricAction(publishMetricAction)
  }

  public fun build(): CfnFirewallPolicy.ActionDefinitionProperty = cdkBuilder.build()
}
