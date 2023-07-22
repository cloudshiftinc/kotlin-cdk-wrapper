@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps

/**
 * Properties for defining a `CfnFirewallRuleGroupAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnFirewallRuleGroupAssociationProps cfnFirewallRuleGroupAssociationProps =
 * CfnFirewallRuleGroupAssociationProps.builder()
 * .firewallRuleGroupId("firewallRuleGroupId")
 * .priority(123)
 * .vpcId("vpcId")
 * // the properties below are optional
 * .mutationProtection("mutationProtection")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html)
 */
@CdkDslMarker
public class CfnFirewallRuleGroupAssociationPropsDsl {
  private val cdkBuilder: CfnFirewallRuleGroupAssociationProps.Builder =
      CfnFirewallRuleGroupAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param firewallRuleGroupId The unique identifier of the firewall rule group. 
   */
  public fun firewallRuleGroupId(firewallRuleGroupId: String) {
    cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
  }

  /**
   * @param mutationProtection If enabled, this setting disallows modification or removal of the
   * association, to help prevent against accidentally altering DNS firewall protections.
   */
  public fun mutationProtection(mutationProtection: String) {
    cdkBuilder.mutationProtection(mutationProtection)
  }

  /**
   * @param name The name of the association.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority The setting that determines the processing order of the rule group among the
   * rule groups that are associated with a single VPC. 
   * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
   * setting.
   *
   * You must specify a unique priority for each rule group that you associate with a single VPC. To
   * make it easier to insert rule groups later, leave space between the numbers, for example, use 101,
   * 200, and so on. You can change the priority setting for a rule group association after you create
   * it.
   *
   * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param tags A list of the tag keys and values that you want to associate with the rule group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of the tag keys and values that you want to associate with the rule group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcId The unique identifier of the VPC that is associated with the rule group. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnFirewallRuleGroupAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
