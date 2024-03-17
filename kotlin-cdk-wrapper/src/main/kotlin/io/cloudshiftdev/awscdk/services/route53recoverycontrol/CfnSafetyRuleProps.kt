@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSafetyRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnSafetyRuleProps cfnSafetyRuleProps = CfnSafetyRuleProps.builder()
 * .controlPanelArn("controlPanelArn")
 * .name("name")
 * .ruleConfig(RuleConfigProperty.builder()
 * .inverted(false)
 * .threshold(123)
 * .type("type")
 * .build())
 * // the properties below are optional
 * .assertionRule(AssertionRuleProperty.builder()
 * .assertedControls(List.of("assertedControls"))
 * .waitPeriodMs(123)
 * .build())
 * .gatingRule(GatingRuleProperty.builder()
 * .gatingControls(List.of("gatingControls"))
 * .targetControls(List.of("targetControls"))
 * .waitPeriodMs(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html)
 */
public interface CfnSafetyRuleProps {
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
   */
  public fun assertionRule(): Any? = unwrap(this).getAssertionRule()

  /**
   * The Amazon Resource Name (ARN) of the control panel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-controlpanelarn)
   */
  public fun controlPanelArn(): String

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
   */
  public fun gatingRule(): Any? = unwrap(this).getGatingRule()

  /**
   * The name of the assertion rule.
   *
   * The name must be unique within a control panel. You can use any non-white space character in
   * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-name)
   */
  public fun name(): String

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   *
   * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your rule
   * configuration. This means that at least two assertion controls must be `ON` , so that at least two
   * AWS Regions have traffic flowing to them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
   */
  public fun ruleConfig(): Any

  /**
   * The tags associated with the safety rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSafetyRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    public fun assertionRule(assertionRule: IResolvable)

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty)

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e32eb88b6da6949a3fba525515e388aeaf23e57055d25474c161a3c3e6da041")
    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty.Builder.() -> Unit)

    /**
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel. 
     */
    public fun controlPanelArn(controlPanelArn: String)

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    public fun gatingRule(gatingRule: IResolvable)

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty)

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3a41c79ff00f0d22d878abc676c70254f1aec171efaf1316eeef327c673e830")
    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty.Builder.() -> Unit)

    /**
     * @param name The name of the assertion rule. 
     * The name must be unique within a control panel. You can use any non-white space character in
     * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
     */
    public fun name(name: String)

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    public fun ruleConfig(ruleConfig: IResolvable)

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty)

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee1d6a6326ccc684eaa4a219ffa2836cd14f5b3a1c84602b8b52797ecbda3431")
    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags associated with the safety rule.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the safety rule.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps.builder()

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    override fun assertionRule(assertionRule: IResolvable) {
      cdkBuilder.assertionRule(assertionRule.let(IResolvable::unwrap))
    }

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    override fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty) {
      cdkBuilder.assertionRule(assertionRule.let(CfnSafetyRule.AssertionRuleProperty::unwrap))
    }

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met.
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e32eb88b6da6949a3fba525515e388aeaf23e57055d25474c161a3c3e6da041")
    override
        fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty.Builder.() -> Unit):
        Unit = assertionRule(CfnSafetyRule.AssertionRuleProperty(assertionRule))

    /**
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel. 
     */
    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    override fun gatingRule(gatingRule: IResolvable) {
      cdkBuilder.gatingRule(gatingRule.let(IResolvable::unwrap))
    }

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    override fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty) {
      cdkBuilder.gatingRule(gatingRule.let(CfnSafetyRule.GatingRuleProperty::unwrap))
    }

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete.
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3a41c79ff00f0d22d878abc676c70254f1aec171efaf1316eeef327c673e830")
    override fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty.Builder.() -> Unit): Unit =
        gatingRule(CfnSafetyRule.GatingRuleProperty(gatingRule))

    /**
     * @param name The name of the assertion rule. 
     * The name must be unique within a control panel. You can use any non-white space character in
     * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    override fun ruleConfig(ruleConfig: IResolvable) {
      cdkBuilder.ruleConfig(ruleConfig.let(IResolvable::unwrap))
    }

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    override fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty) {
      cdkBuilder.ruleConfig(ruleConfig.let(CfnSafetyRule.RuleConfigProperty::unwrap))
    }

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee1d6a6326ccc684eaa4a219ffa2836cd14f5b3a1c84602b8b52797ecbda3431")
    override fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty.Builder.() -> Unit): Unit =
        ruleConfig(CfnSafetyRule.RuleConfigProperty(ruleConfig))

    /**
     * @param tags The tags associated with the safety rule.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the safety rule.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps,
  ) : CdkObject(cdkObject), CfnSafetyRuleProps {
    /**
     * An assertion rule enforces that, when you change a routing control state, that the criteria
     * that you set in the rule configuration is met.
     *
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule)
     */
    override fun assertionRule(): Any? = unwrap(this).getAssertionRule()

    /**
     * The Amazon Resource Name (ARN) of the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-controlpanelarn)
     */
    override fun controlPanelArn(): String = unwrap(this).getControlPanelArn()

    /**
     * A gating rule verifies that a gating routing control or set of gating routing controls,
     * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
     * control state changes to complete.
     *
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
     * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule)
     */
    override fun gatingRule(): Any? = unwrap(this).getGatingRule()

    /**
     * The name of the assertion rule.
     *
     * The name must be unique within a control panel. You can use any non-white space character in
     * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     */
    override fun ruleConfig(): Any = unwrap(this).getRuleConfig()

    /**
     * The tags associated with the safety rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSafetyRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps):
        CfnSafetyRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSafetyRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSafetyRuleProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
  }
}
