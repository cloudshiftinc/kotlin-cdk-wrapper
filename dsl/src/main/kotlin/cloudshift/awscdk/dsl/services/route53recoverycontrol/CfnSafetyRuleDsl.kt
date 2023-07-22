@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.constructs.Construct

@CdkDslMarker
public class CfnSafetyRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSafetyRule.Builder = CfnSafetyRule.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   *
   * Otherwise, the change to the routing control is not accepted. For example, the criteria might
   * be that at least one routing control state is `On` after the transaction so that traffic continues
   * to flow to at least one cell for the application. This ensures that you avoid a fail-open
   * scenario.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule)
   * @param assertionRule An assertion rule enforces that, when you change a routing control state,
   * that the criteria that you set in the rule configuration is met. 
   */
  public fun assertionRule(assertionRule: IResolvable) {
    cdkBuilder.assertionRule(assertionRule)
  }

  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   *
   * Otherwise, the change to the routing control is not accepted. For example, the criteria might
   * be that at least one routing control state is `On` after the transaction so that traffic continues
   * to flow to at least one cell for the application. This ensures that you avoid a fail-open
   * scenario.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule)
   * @param assertionRule An assertion rule enforces that, when you change a routing control state,
   * that the criteria that you set in the rule configuration is met. 
   */
  public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty) {
    cdkBuilder.assertionRule(assertionRule)
  }

  /**
   * The Amazon Resource Name (ARN) for the control panel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-controlpanelarn)
   * @param controlPanelArn The Amazon Resource Name (ARN) for the control panel. 
   */
  public fun controlPanelArn(controlPanelArn: String) {
    cdkBuilder.controlPanelArn(controlPanelArn)
  }

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   *
   * For example, if you specify one gating routing control and you set the `Type` in the rule
   * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
   * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
   * then you can update the routing control states for the target routing controls that you specify in
   * the gating rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule)
   * @param gatingRule A gating rule verifies that a gating routing control or set of gating routing
   * controls, evaluates as true, based on a rule configuration that you specify, which allows a set of
   * routing control state changes to complete. 
   */
  public fun gatingRule(gatingRule: IResolvable) {
    cdkBuilder.gatingRule(gatingRule)
  }

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   *
   * For example, if you specify one gating routing control and you set the `Type` in the rule
   * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
   * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
   * then you can update the routing control states for the target routing controls that you specify in
   * the gating rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule)
   * @param gatingRule A gating rule verifies that a gating routing control or set of gating routing
   * controls, evaluates as true, based on a rule configuration that you specify, which allows a set of
   * routing control state changes to complete. 
   */
  public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty) {
    cdkBuilder.gatingRule(gatingRule)
  }

  /**
   * The name of the assertion rule.
   *
   * The name must be unique within a control panel. You can use any non-white space character in
   * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-name)
   * @param name The name of the assertion rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   *
   * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your rule
   * configuration. This means that at least two assertion controls must be `ON` , so that at least two
   * AWS Regions have traffic flowing to them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
   * @param ruleConfig The criteria that you set for specific assertion controls (routing controls)
   * that designate how many control states must be `ON` as the result of a transaction. 
   */
  public fun ruleConfig(ruleConfig: IResolvable) {
    cdkBuilder.ruleConfig(ruleConfig)
  }

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   *
   * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your rule
   * configuration. This means that at least two assertion controls must be `ON` , so that at least two
   * AWS Regions have traffic flowing to them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
   * @param ruleConfig The criteria that you set for specific assertion controls (routing controls)
   * that designate how many control states must be `ON` as the result of a transaction. 
   */
  public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty) {
    cdkBuilder.ruleConfig(ruleConfig)
  }

  /**
   * The value for a tag.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
   * @param tags The value for a tag. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The value for a tag.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
   * @param tags The value for a tag. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSafetyRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
