@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * An optional, non-standard action to use for stateless packet handling.
 *
 * You can define this in addition to the standard action that you must specify.
 *
 * You define and name the custom actions that you want to be able to use, and then you reference
 * them by name in your actions settings.
 *
 * You can use custom actions in the following places:
 *
 * * In an `RuleGroup.StatelessRulesAndCustomActions` . The custom actions are available for use by
 * name inside the `StatelessRulesAndCustomActions` where you define them. You can use them for your
 * stateless rule actions to specify what to do with a packet that matches the rule's match attributes.
 * * In an `FirewallPolicy` specification, in `StatelessCustomActions` . The custom actions are
 * available for use inside the policy where you define them. You can use them for the policy's default
 * stateless actions settings to specify what to do with packets that don't match any of the policy's
 * stateless rules.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CustomActionProperty customActionProperty = CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyCustomActionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.CustomActionProperty.Builder =
      CfnFirewallPolicy.CustomActionProperty.builder()

  /**
   * @param actionDefinition The custom action associated with the action name. 
   */
  public fun actionDefinition(actionDefinition: IResolvable) {
    cdkBuilder.actionDefinition(actionDefinition)
  }

  /**
   * @param actionDefinition The custom action associated with the action name. 
   */
  public fun actionDefinition(actionDefinition: CfnFirewallPolicy.ActionDefinitionProperty) {
    cdkBuilder.actionDefinition(actionDefinition)
  }

  /**
   * @param actionName The descriptive name of the custom action. 
   * You can't change the name of a custom action after you create it.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun build(): CfnFirewallPolicy.CustomActionProperty = cdkBuilder.build()
}
