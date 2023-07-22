@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnRuleGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRuleGroup.Builder = CfnRuleGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The maximum operating resources that this rule group can use.
   *
   * You can't change a rule group's capacity setting after you create the rule group. When you
   * update a rule group, you are limited to this capacity. When you reference a rule group from a
   * firewall policy, Network Firewall reserves this capacity for the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
   * @param capacity The maximum operating resources that this rule group can use. 
   */
  public fun capacity(capacity: Number) {
    cdkBuilder.capacity(capacity)
  }

  /**
   * A description of the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
   * @param description A description of the rule group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An object that defines the rule group rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
   * @param ruleGroup An object that defines the rule group rules. 
   */
  public fun ruleGroup(ruleGroup: IResolvable) {
    cdkBuilder.ruleGroup(ruleGroup)
  }

  /**
   * An object that defines the rule group rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
   * @param ruleGroup An object that defines the rule group rules. 
   */
  public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
    cdkBuilder.ruleGroup(ruleGroup)
  }

  /**
   * The descriptive name of the rule group.
   *
   * You can't change the name of a rule group after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
   * @param ruleGroupName The descriptive name of the rule group. 
   */
  public fun ruleGroupName(ruleGroupName: String) {
    cdkBuilder.ruleGroupName(ruleGroupName)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Indicates whether the rule group is stateless or stateful.
   *
   * If the rule group is stateless, it contains
   * stateless rules. If it is stateful, it contains stateful rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
   * @param type Indicates whether the rule group is stateless or stateful. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRuleGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
