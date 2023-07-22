@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps

/**
 * Properties for defining a `CfnFirewallPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnFirewallPolicyProps cfnFirewallPolicyProps = CfnFirewallPolicyProps.builder()
 * .firewallPolicy(FirewallPolicyProperty.builder()
 * .statelessDefaultActions(List.of("statelessDefaultActions"))
 * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
 * // the properties below are optional
 * .policyVariables(PolicyVariablesProperty.builder()
 * .ruleVariables(Map.of(
 * "ruleVariablesKey", Map.of(
 * "definition", List.of("definition"))))
 * .build())
 * .statefulDefaultActions(List.of("statefulDefaultActions"))
 * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .streamExceptionPolicy("streamExceptionPolicy")
 * .build())
 * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .override(StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build())
 * .priority(123)
 * .build()))
 * .statelessCustomActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
 * .priority(123)
 * .resourceArn("resourceArn")
 * .build()))
 * .build())
 * .firewallPolicyName("firewallPolicyName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyPropsDsl {
  private val cdkBuilder: CfnFirewallPolicyProps.Builder = CfnFirewallPolicyProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the firewall policy.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
   * collection of stateless and stateful rule groups and other settings. 
   */
  public fun firewallPolicy(firewallPolicy: IResolvable) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  /**
   * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
   * collection of stateless and stateful rule groups and other settings. 
   */
  public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
    cdkBuilder.firewallPolicy(firewallPolicy)
  }

  /**
   * @param firewallPolicyName The descriptive name of the firewall policy. 
   * You can't change the name of a firewall policy after you create it.
   */
  public fun firewallPolicyName(firewallPolicyName: String) {
    cdkBuilder.firewallPolicyName(firewallPolicyName)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFirewallPolicyProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
