@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a safety rule in a control panel in Amazon Route 53 Application Recovery Controller.
 *
 * Safety rules in Amazon Route 53 Application Recovery Controller let you add safeguards around
 * changing routing control states, and enabling and disabling routing controls, to help prevent
 * unwanted outcomes. Note that the name of a safety rule must be unique within a control panel.
 *
 * There are two types of safety rules in Route 53 ARC: assertion rules and gating rules.
 *
 * Assertion rule: An assertion rule enforces that, when you change a routing control state, certain
 * criteria are met. For example, the criteria might be that at least one routing control state is `On`
 * after the transaction completes so that traffic continues to be directed to at least one cell for
 * the application. This prevents a fail-open scenario.
 *
 * Gating rule: A gating rule lets you configure a gating routing control as an overall on-off
 * switch for a group of routing controls. Or, you can configure more complex gating scenarios, for
 * example, by configuring multiple gating routing controls.
 *
 * For more information, see [Safety
 * rules](https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.safety-rules.html) in the
 * Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnSafetyRule cfnSafetyRule = CfnSafetyRule.Builder.create(this, "MyCfnSafetyRule")
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
public open class CfnSafetyRule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   */
  public open fun assertionRule(): Any? = unwrap(this).getAssertionRule()

  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   */
  public open fun assertionRule(`value`: IResolvable) {
    unwrap(this).setAssertionRule(`value`.let(IResolvable::unwrap))
  }

  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   */
  public open fun assertionRule(`value`: AssertionRuleProperty) {
    unwrap(this).setAssertionRule(`value`.let(AssertionRuleProperty::unwrap))
  }

  /**
   * An assertion rule enforces that, when you change a routing control state, that the criteria
   * that you set in the rule configuration is met.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e330001a2d197a409de6a89957588985b3ea604b7f3e83dff76e65a243f234a")
  public open fun assertionRule(`value`: AssertionRuleProperty.Builder.() -> Unit): Unit =
      assertionRule(AssertionRuleProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the safety rule.
   */
  public open fun attrSafetyRuleArn(): String = unwrap(this).getAttrSafetyRuleArn()

  /**
   * The deployment status of the safety rule.
   *
   * Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the control panel.
   */
  public open fun controlPanelArn(): String = unwrap(this).getControlPanelArn()

  /**
   * The Amazon Resource Name (ARN) of the control panel.
   */
  public open fun controlPanelArn(`value`: String) {
    unwrap(this).setControlPanelArn(`value`)
  }

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   */
  public open fun gatingRule(): Any? = unwrap(this).getGatingRule()

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   */
  public open fun gatingRule(`value`: IResolvable) {
    unwrap(this).setGatingRule(`value`.let(IResolvable::unwrap))
  }

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   */
  public open fun gatingRule(`value`: GatingRuleProperty) {
    unwrap(this).setGatingRule(`value`.let(GatingRuleProperty::unwrap))
  }

  /**
   * A gating rule verifies that a gating routing control or set of gating routing controls,
   * evaluates as true, based on a rule configuration that you specify, which allows a set of routing
   * control state changes to complete.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5c3ea7e792d75f457a3266f6b0b6005063a6a36764cb79caeb501455dd765d2")
  public open fun gatingRule(`value`: GatingRuleProperty.Builder.() -> Unit): Unit =
      gatingRule(GatingRuleProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the assertion rule.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the assertion rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   */
  public open fun ruleConfig(): Any = unwrap(this).getRuleConfig()

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   */
  public open fun ruleConfig(`value`: IResolvable) {
    unwrap(this).setRuleConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   */
  public open fun ruleConfig(`value`: RuleConfigProperty) {
    unwrap(this).setRuleConfig(`value`.let(RuleConfigProperty::unwrap))
  }

  /**
   * The criteria that you set for specific assertion controls (routing controls) that designate how
   * many control states must be `ON` as the result of a transaction.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("58d6415b9a45ab757e8a6969532a5d3ee581d130cdeb5bca7ecd3d59a8ca065d")
  public open fun ruleConfig(`value`: RuleConfigProperty.Builder.() -> Unit): Unit =
      ruleConfig(RuleConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with the safety rule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with the safety rule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the safety rule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53recoverycontrol.CfnSafetyRule].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    public fun assertionRule(assertionRule: IResolvable)

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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    public fun assertionRule(assertionRule: AssertionRuleProperty)

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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("186b309aa6ebe3b2679b8546e369a7e8a0a2b6129a17050605aeacfd9971ab74")
    public fun assertionRule(assertionRule: AssertionRuleProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-controlpanelarn)
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel. 
     */
    public fun controlPanelArn(controlPanelArn: String)

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
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    public fun gatingRule(gatingRule: IResolvable)

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
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    public fun gatingRule(gatingRule: GatingRuleProperty)

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
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38748a228e93e98b70b10d493d909939dbe988b5cfd4cdca14b2e21fa727a1e7")
    public fun gatingRule(gatingRule: GatingRuleProperty.Builder.() -> Unit)

    /**
     * The name of the assertion rule.
     *
     * The name must be unique within a control panel. You can use any non-white space character in
     * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-name)
     * @param name The name of the assertion rule. 
     */
    public fun name(name: String)

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    public fun ruleConfig(ruleConfig: IResolvable)

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    public fun ruleConfig(ruleConfig: RuleConfigProperty)

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4623aa1709d6b596c85e289ae2b6c3b6b09955006887d6c00ac8fabc70b5fff0")
    public fun ruleConfig(ruleConfig: RuleConfigProperty.Builder.() -> Unit)

    /**
     * The tags associated with the safety rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
     * @param tags The tags associated with the safety rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the safety rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
     * @param tags The tags associated with the safety rule. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.Builder.create(scope,
        id)

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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    override fun assertionRule(assertionRule: IResolvable) {
      cdkBuilder.assertionRule(assertionRule.let(IResolvable::unwrap))
    }

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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    override fun assertionRule(assertionRule: AssertionRuleProperty) {
      cdkBuilder.assertionRule(assertionRule.let(AssertionRuleProperty::unwrap))
    }

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
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     * state, that the criteria that you set in the rule configuration is met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("186b309aa6ebe3b2679b8546e369a7e8a0a2b6129a17050605aeacfd9971ab74")
    override fun assertionRule(assertionRule: AssertionRuleProperty.Builder.() -> Unit): Unit =
        assertionRule(AssertionRuleProperty(assertionRule))

    /**
     * The Amazon Resource Name (ARN) of the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-controlpanelarn)
     * @param controlPanelArn The Amazon Resource Name (ARN) of the control panel. 
     */
    override fun controlPanelArn(controlPanelArn: String) {
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
     * then you can update the routing control states for the target routing controls that you specify
     * in the gating rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule)
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    override fun gatingRule(gatingRule: IResolvable) {
      cdkBuilder.gatingRule(gatingRule.let(IResolvable::unwrap))
    }

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
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    override fun gatingRule(gatingRule: GatingRuleProperty) {
      cdkBuilder.gatingRule(gatingRule.let(GatingRuleProperty::unwrap))
    }

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
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     * routing controls, evaluates as true, based on a rule configuration that you specify, which
     * allows a set of routing control state changes to complete. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38748a228e93e98b70b10d493d909939dbe988b5cfd4cdca14b2e21fa727a1e7")
    override fun gatingRule(gatingRule: GatingRuleProperty.Builder.() -> Unit): Unit =
        gatingRule(GatingRuleProperty(gatingRule))

    /**
     * The name of the assertion rule.
     *
     * The name must be unique within a control panel. You can use any non-white space character in
     * the name except the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-name)
     * @param name The name of the assertion rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    override fun ruleConfig(ruleConfig: IResolvable) {
      cdkBuilder.ruleConfig(ruleConfig.let(IResolvable::unwrap))
    }

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    override fun ruleConfig(ruleConfig: RuleConfigProperty) {
      cdkBuilder.ruleConfig(ruleConfig.let(RuleConfigProperty::unwrap))
    }

    /**
     * The criteria that you set for specific assertion controls (routing controls) that designate
     * how many control states must be `ON` as the result of a transaction.
     *
     * For example, if you have three assertion controls, you might specify `ATLEAST 2` for your
     * rule configuration. This means that at least two assertion controls must be `ON` , so that at
     * least two AWS Regions have traffic flowing to them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-ruleconfig)
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     * controls) that designate how many control states must be `ON` as the result of a transaction. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4623aa1709d6b596c85e289ae2b6c3b6b09955006887d6c00ac8fabc70b5fff0")
    override fun ruleConfig(ruleConfig: RuleConfigProperty.Builder.() -> Unit): Unit =
        ruleConfig(RuleConfigProperty(ruleConfig))

    /**
     * The tags associated with the safety rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
     * @param tags The tags associated with the safety rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the safety rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html#cfn-route53recoverycontrol-safetyrule-tags)
     * @param tags The tags associated with the safety rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSafetyRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSafetyRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule):
        CfnSafetyRule = CfnSafetyRule(cdkObject)

    internal fun unwrap(wrapped: CfnSafetyRule):
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule = wrapped.cdkObject
  }

  /**
   * The rule configuration for an assertion rule.
   *
   * That is, the criteria that you set for specific assertion controls (routing controls) that
   * specify how many controls must be enabled after a transaction completes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
   * RuleConfigProperty ruleConfigProperty = RuleConfigProperty.builder()
   * .inverted(false)
   * .threshold(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html)
   */
  public interface RuleConfigProperty {
    /**
     * Logical negation of the rule.
     *
     * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-inverted)
     */
    public fun inverted(): Any

    /**
     * The value of N, when you specify an `ATLEAST` rule type.
     *
     * That is, `Threshold` is the number of controls that must be set when you specify an `ATLEAST`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-threshold)
     */
    public fun threshold(): Number

    /**
     * A rule can be one of the following: `ATLEAST` , `AND` , or `OR` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [RuleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inverted Logical negation of the rule. 
       * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
       */
      public fun inverted(inverted: Boolean)

      /**
       * @param inverted Logical negation of the rule. 
       * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
       */
      public fun inverted(inverted: IResolvable)

      /**
       * @param threshold The value of N, when you specify an `ATLEAST` rule type. 
       * That is, `Threshold` is the number of controls that must be set when you specify an
       * `ATLEAST` type.
       */
      public fun threshold(threshold: Number)

      /**
       * @param type A rule can be one of the following: `ATLEAST` , `AND` , or `OR` . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.builder()

      /**
       * @param inverted Logical negation of the rule. 
       * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
       */
      override fun inverted(inverted: Boolean) {
        cdkBuilder.inverted(inverted)
      }

      /**
       * @param inverted Logical negation of the rule. 
       * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
       */
      override fun inverted(inverted: IResolvable) {
        cdkBuilder.inverted(inverted.let(IResolvable::unwrap))
      }

      /**
       * @param threshold The value of N, when you specify an `ATLEAST` rule type. 
       * That is, `Threshold` is the number of controls that must be set when you specify an
       * `ATLEAST` type.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param type A rule can be one of the following: `ATLEAST` , `AND` , or `OR` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty,
    ) : CdkObject(cdkObject), RuleConfigProperty {
      /**
       * Logical negation of the rule.
       *
       * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-inverted)
       */
      override fun inverted(): Any = unwrap(this).getInverted()

      /**
       * The value of N, when you specify an `ATLEAST` rule type.
       *
       * That is, `Threshold` is the number of controls that must be set when you specify an
       * `ATLEAST` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * A rule can be one of the following: `ATLEAST` , `AND` , or `OR` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html#cfn-route53recoverycontrol-safetyrule-ruleconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty):
          RuleConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleConfigProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty
    }
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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
   * GatingRuleProperty gatingRuleProperty = GatingRuleProperty.builder()
   * .gatingControls(List.of("gatingControls"))
   * .targetControls(List.of("targetControls"))
   * .waitPeriodMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html)
   */
  public interface GatingRuleProperty {
    /**
     * An array of gating routing control Amazon Resource Names (ARNs).
     *
     * For a simple on-off switch, specify the ARN for one routing control. The gating routing
     * controls are evaluated by the rule configuration that you specify to determine if the target
     * routing control states can be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-gatingcontrols)
     */
    public fun gatingControls(): List<String>

    /**
     * An array of target routing control Amazon Resource Names (ARNs) for which the states can only
     * be updated if the rule configuration that you specify evaluates to true for the gating routing
     * control.
     *
     * As a simple example, if you have a single gating control, it acts as an overall on-off switch
     * for a set of target routing controls. You can use this to manually override automated failover,
     * for example.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-targetcontrols)
     */
    public fun targetControls(): List<String>

    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target
     * routing controls will fail.
     *
     * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
     * choose a custom value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-waitperiodms)
     */
    public fun waitPeriodMs(): Number

    /**
     * A builder for [GatingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). 
       * For a simple on-off switch, specify the ARN for one routing control. The gating routing
       * controls are evaluated by the rule configuration that you specify to determine if the target
       * routing control states can be changed.
       */
      public fun gatingControls(gatingControls: List<String>)

      /**
       * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). 
       * For a simple on-off switch, specify the ARN for one routing control. The gating routing
       * controls are evaluated by the rule configuration that you specify to determine if the target
       * routing control states can be changed.
       */
      public fun gatingControls(vararg gatingControls: String)

      /**
       * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
       * which the states can only be updated if the rule configuration that you specify evaluates to
       * true for the gating routing control. 
       * As a simple example, if you have a single gating control, it acts as an overall on-off
       * switch for a set of target routing controls. You can use this to manually override automated
       * failover, for example.
       */
      public fun targetControls(targetControls: List<String>)

      /**
       * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
       * which the states can only be updated if the rule configuration that you specify evaluates to
       * true for the gating routing control. 
       * As a simple example, if you have a single gating control, it acts as an overall on-off
       * switch for a set of target routing controls. You can use this to manually override automated
       * failover, for example.
       */
      public fun targetControls(vararg targetControls: String)

      /**
       * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
       * against the target routing controls will fail. 
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       */
      public fun waitPeriodMs(waitPeriodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.builder()

      /**
       * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). 
       * For a simple on-off switch, specify the ARN for one routing control. The gating routing
       * controls are evaluated by the rule configuration that you specify to determine if the target
       * routing control states can be changed.
       */
      override fun gatingControls(gatingControls: List<String>) {
        cdkBuilder.gatingControls(gatingControls)
      }

      /**
       * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). 
       * For a simple on-off switch, specify the ARN for one routing control. The gating routing
       * controls are evaluated by the rule configuration that you specify to determine if the target
       * routing control states can be changed.
       */
      override fun gatingControls(vararg gatingControls: String): Unit =
          gatingControls(gatingControls.toList())

      /**
       * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
       * which the states can only be updated if the rule configuration that you specify evaluates to
       * true for the gating routing control. 
       * As a simple example, if you have a single gating control, it acts as an overall on-off
       * switch for a set of target routing controls. You can use this to manually override automated
       * failover, for example.
       */
      override fun targetControls(targetControls: List<String>) {
        cdkBuilder.targetControls(targetControls)
      }

      /**
       * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
       * which the states can only be updated if the rule configuration that you specify evaluates to
       * true for the gating routing control. 
       * As a simple example, if you have a single gating control, it acts as an overall on-off
       * switch for a set of target routing controls. You can use this to manually override automated
       * failover, for example.
       */
      override fun targetControls(vararg targetControls: String): Unit =
          targetControls(targetControls.toList())

      /**
       * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
       * against the target routing controls will fail. 
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       */
      override fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty,
    ) : CdkObject(cdkObject), GatingRuleProperty {
      /**
       * An array of gating routing control Amazon Resource Names (ARNs).
       *
       * For a simple on-off switch, specify the ARN for one routing control. The gating routing
       * controls are evaluated by the rule configuration that you specify to determine if the target
       * routing control states can be changed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-gatingcontrols)
       */
      override fun gatingControls(): List<String> = unwrap(this).getGatingControls()

      /**
       * An array of target routing control Amazon Resource Names (ARNs) for which the states can
       * only be updated if the rule configuration that you specify evaluates to true for the gating
       * routing control.
       *
       * As a simple example, if you have a single gating control, it acts as an overall on-off
       * switch for a set of target routing controls. You can use this to manually override automated
       * failover, for example.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-targetcontrols)
       */
      override fun targetControls(): List<String> = unwrap(this).getTargetControls()

      /**
       * An evaluation period, in milliseconds (ms), during which any request against the target
       * routing controls will fail.
       *
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html#cfn-route53recoverycontrol-safetyrule-gatingrule-waitperiodms)
       */
      override fun waitPeriodMs(): Number = unwrap(this).getWaitPeriodMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty):
          GatingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? GatingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatingRuleProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty
    }
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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
   * AssertionRuleProperty assertionRuleProperty = AssertionRuleProperty.builder()
   * .assertedControls(List.of("assertedControls"))
   * .waitPeriodMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html)
   */
  public interface AssertionRuleProperty {
    /**
     * The routing controls that are part of transactions that are evaluated to determine if a
     * request to change a routing control state is allowed.
     *
     * For example, you might include three routing controls, one for each of three AWS Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule-assertedcontrols)
     */
    public fun assertedControls(): List<String>

    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target
     * routing controls will fail.
     *
     * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
     * choose a custom value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule-waitperiodms)
     */
    public fun waitPeriodMs(): Number

    /**
     * A builder for [AssertionRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assertedControls The routing controls that are part of transactions that are
       * evaluated to determine if a request to change a routing control state is allowed. 
       * For example, you might include three routing controls, one for each of three AWS Regions.
       */
      public fun assertedControls(assertedControls: List<String>)

      /**
       * @param assertedControls The routing controls that are part of transactions that are
       * evaluated to determine if a request to change a routing control state is allowed. 
       * For example, you might include three routing controls, one for each of three AWS Regions.
       */
      public fun assertedControls(vararg assertedControls: String)

      /**
       * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
       * against the target routing controls will fail. 
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       */
      public fun waitPeriodMs(waitPeriodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.builder()

      /**
       * @param assertedControls The routing controls that are part of transactions that are
       * evaluated to determine if a request to change a routing control state is allowed. 
       * For example, you might include three routing controls, one for each of three AWS Regions.
       */
      override fun assertedControls(assertedControls: List<String>) {
        cdkBuilder.assertedControls(assertedControls)
      }

      /**
       * @param assertedControls The routing controls that are part of transactions that are
       * evaluated to determine if a request to change a routing control state is allowed. 
       * For example, you might include three routing controls, one for each of three AWS Regions.
       */
      override fun assertedControls(vararg assertedControls: String): Unit =
          assertedControls(assertedControls.toList())

      /**
       * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
       * against the target routing controls will fail. 
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       */
      override fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty,
    ) : CdkObject(cdkObject), AssertionRuleProperty {
      /**
       * The routing controls that are part of transactions that are evaluated to determine if a
       * request to change a routing control state is allowed.
       *
       * For example, you might include three routing controls, one for each of three AWS Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule-assertedcontrols)
       */
      override fun assertedControls(): List<String> = unwrap(this).getAssertedControls()

      /**
       * An evaluation period, in milliseconds (ms), during which any request against the target
       * routing controls will fail.
       *
       * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can
       * choose a custom value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html#cfn-route53recoverycontrol-safetyrule-assertionrule-waitperiodms)
       */
      override fun waitPeriodMs(): Number = unwrap(this).getWaitPeriodMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssertionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty):
          AssertionRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? AssertionRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssertionRuleProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty
    }
  }
}
