@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::AutomationRule` resource specifies an automation rule based on input
 * parameters.
 *
 * For more information, see [Automation
 * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the *AWS
 * Security Hub User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * Object id;
 * Object updatedBy;
 * CfnAutomationRule cfnAutomationRule = CfnAutomationRule.Builder.create(this,
 * "MyCfnAutomationRule")
 * .actions(List.of(AutomationRulesActionProperty.builder()
 * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
 * .confidence(123)
 * .criticality(123)
 * .note(NoteUpdateProperty.builder()
 * .text("text")
 * .updatedBy(updatedBy)
 * .build())
 * .relatedFindings(List.of(RelatedFindingProperty.builder()
 * .id(id)
 * .productArn("productArn")
 * .build()))
 * .severity(SeverityUpdateProperty.builder()
 * .label("label")
 * .normalized(123)
 * .product(123)
 * .build())
 * .types(List.of("types"))
 * .userDefinedFields(Map.of(
 * "userDefinedFieldsKey", "userDefinedFields"))
 * .verificationState("verificationState")
 * .workflow(WorkflowUpdateProperty.builder()
 * .status("status")
 * .build())
 * .build())
 * .type("type")
 * .build()))
 * .criteria(AutomationRulesFindingFiltersProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .companyName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .confidence(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .createdAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .criticality(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .description(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .firstObservedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .generatorId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .id(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .lastObservedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .noteText(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .noteUpdatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .noteUpdatedBy(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .productArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .productName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .recordState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .relatedFindingsId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceDetailsOther(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourcePartition(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceRegion(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceTags(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .severityLabel(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .sourceUrl(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .title(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .type(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .updatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .userDefinedFields(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .verificationState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .workflowStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .build())
 * .description("description")
 * .ruleName("ruleName")
 * .ruleOrder(123)
 * // the properties below are optional
 * .isTerminal(false)
 * .ruleStatus("ruleStatus")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html)
 */
public open class CfnAutomationRule(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutomationRuleProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnAutomationRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAutomationRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutomationRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAutomationRuleProps(props)
  )

  /**
   * One or more actions to update finding fields if a finding matches the conditions specified in
   * `Criteria` .
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * One or more actions to update finding fields if a finding matches the conditions specified in
   * `Criteria` .
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more actions to update finding fields if a finding matches the conditions specified in
   * `Criteria` .
   */
  public open fun actions(`value`: List<Any>) {
    unwrap(this).setActions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more actions to update finding fields if a finding matches the conditions specified in
   * `Criteria` .
   */
  public open fun actions(vararg `value`: Any): Unit = actions(`value`.toList())

  /**
   * A timestamp that indicates when the rule was created.
   *
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The principal that created the rule.
   *
   * For example, `arn:aws:sts::123456789012:assumed-role/Developer-Role/JaneDoe` .
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The Amazon Resource Name (ARN) of the automation rule that you create.
   *
   * For example,
   * `arn:aws:securityhub:us-east-1:123456789012:automation-rule/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   * .
   */
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  /**
   * A timestamp that indicates when the rule was most recently updated.
   *
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A set of [AWS Security Finding Format
   * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
   * Security Hub applies the rule action to the finding.
   */
  public open fun criteria(): Any = unwrap(this).getCriteria()

  /**
   * A set of [AWS Security Finding Format
   * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
   * Security Hub applies the rule action to the finding.
   */
  public open fun criteria(`value`: IResolvable) {
    unwrap(this).setCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of [AWS Security Finding Format
   * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
   * Security Hub applies the rule action to the finding.
   */
  public open fun criteria(`value`: AutomationRulesFindingFiltersProperty) {
    unwrap(this).setCriteria(`value`.let(AutomationRulesFindingFiltersProperty.Companion::unwrap))
  }

  /**
   * A set of [AWS Security Finding Format
   * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
   * Security Hub applies the rule action to the finding.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7d1705ddd0b2135b88828aed825e0b0ce3012e29b786bfdfce4d6cd60acecf58")
  public open fun criteria(`value`: AutomationRulesFindingFiltersProperty.Builder.() -> Unit): Unit
      = criteria(AutomationRulesFindingFiltersProperty(`value`))

  /**
   * A description of the rule.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies whether a rule is the last to be applied with respect to a finding that matches the
   * rule criteria.
   */
  public open fun isTerminal(): Any? = unwrap(this).getIsTerminal()

  /**
   * Specifies whether a rule is the last to be applied with respect to a finding that matches the
   * rule criteria.
   */
  public open fun isTerminal(`value`: Boolean) {
    unwrap(this).setIsTerminal(`value`)
  }

  /**
   * Specifies whether a rule is the last to be applied with respect to a finding that matches the
   * rule criteria.
   */
  public open fun isTerminal(`value`: IResolvable) {
    unwrap(this).setIsTerminal(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the rule.
   */
  public open fun ruleName(): String = unwrap(this).getRuleName()

  /**
   * The name of the rule.
   */
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  /**
   * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied
   * to findings.
   */
  public open fun ruleOrder(): Number = unwrap(this).getRuleOrder()

  /**
   * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied
   * to findings.
   */
  public open fun ruleOrder(`value`: Number) {
    unwrap(this).setRuleOrder(`value`)
  }

  /**
   * Whether the rule is active after it is created.
   */
  public open fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  /**
   * Whether the rule is active after it is created.
   */
  public open fun ruleStatus(`value`: String) {
    unwrap(this).setRuleStatus(`value`)
  }

  /**
   * User-defined tags associated with an automation rule.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * User-defined tags associated with an automation rule.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnAutomationRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    public fun actions(actions: IResolvable)

    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    public fun actions(actions: List<Any>)

    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    public fun actions(vararg actions: Any)

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    public fun criteria(criteria: IResolvable)

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    public fun criteria(criteria: AutomationRulesFindingFiltersProperty)

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135935e2b9aeab7dd2476700f8acf596a520fc2014f76071e71ae8c8b1b8754b")
    public fun criteria(criteria: AutomationRulesFindingFiltersProperty.Builder.() -> Unit)

    /**
     * A description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-description)
     * @param description A description of the rule. 
     */
    public fun description(description: String)

    /**
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the
     * rule criteria.
     *
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria. 
     */
    public fun isTerminal(isTerminal: Boolean)

    /**
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the
     * rule criteria.
     *
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria. 
     */
    public fun isTerminal(isTerminal: IResolvable)

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulename)
     * @param ruleName The name of the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is
     * applied to findings.
     *
     * Security Hub applies rules with lower values for this parameter first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-ruleorder)
     * @param ruleOrder An integer ranging from 1 to 1000 that represents the order in which the
     * rule action is applied to findings. 
     */
    public fun ruleOrder(ruleOrder: Number)

    /**
     * Whether the rule is active after it is created.
     *
     * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and
     * finding updates after the rule is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulestatus)
     * @param ruleStatus Whether the rule is active after it is created. 
     */
    public fun ruleStatus(ruleStatus: String)

    /**
     * User-defined tags associated with an automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-tags)
     * @param tags User-defined tags associated with an automation rule. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnAutomationRule.Builder =
        software.amazon.awscdk.services.securityhub.CfnAutomationRule.Builder.create(scope, id)

    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` . 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    override fun criteria(criteria: AutomationRulesFindingFiltersProperty) {
      cdkBuilder.criteria(criteria.let(AutomationRulesFindingFiltersProperty.Companion::unwrap))
    }

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("135935e2b9aeab7dd2476700f8acf596a520fc2014f76071e71ae8c8b1b8754b")
    override fun criteria(criteria: AutomationRulesFindingFiltersProperty.Builder.() -> Unit): Unit
        = criteria(AutomationRulesFindingFiltersProperty(criteria))

    /**
     * A description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-description)
     * @param description A description of the rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the
     * rule criteria.
     *
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria. 
     */
    override fun isTerminal(isTerminal: Boolean) {
      cdkBuilder.isTerminal(isTerminal)
    }

    /**
     * Specifies whether a rule is the last to be applied with respect to a finding that matches the
     * rule criteria.
     *
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria. 
     */
    override fun isTerminal(isTerminal: IResolvable) {
      cdkBuilder.isTerminal(isTerminal.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulename)
     * @param ruleName The name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is
     * applied to findings.
     *
     * Security Hub applies rules with lower values for this parameter first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-ruleorder)
     * @param ruleOrder An integer ranging from 1 to 1000 that represents the order in which the
     * rule action is applied to findings. 
     */
    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    /**
     * Whether the rule is active after it is created.
     *
     * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and
     * finding updates after the rule is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulestatus)
     * @param ruleStatus Whether the rule is active after it is created. 
     */
    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    /**
     * User-defined tags associated with an automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-tags)
     * @param tags User-defined tags associated with an automation rule. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnAutomationRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutomationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutomationRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule):
        CfnAutomationRule = CfnAutomationRule(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRule):
        software.amazon.awscdk.services.securityhub.CfnAutomationRule = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnAutomationRule
  }

  /**
   * One or more actions that AWS Security Hub takes when a finding matches the defined criteria of
   * a rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * Object id;
   * Object updatedBy;
   * AutomationRulesActionProperty automationRulesActionProperty =
   * AutomationRulesActionProperty.builder()
   * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
   * .confidence(123)
   * .criticality(123)
   * .note(NoteUpdateProperty.builder()
   * .text("text")
   * .updatedBy(updatedBy)
   * .build())
   * .relatedFindings(List.of(RelatedFindingProperty.builder()
   * .id(id)
   * .productArn("productArn")
   * .build()))
   * .severity(SeverityUpdateProperty.builder()
   * .label("label")
   * .normalized(123)
   * .product(123)
   * .build())
   * .types(List.of("types"))
   * .userDefinedFields(Map.of(
   * "userDefinedFieldsKey", "userDefinedFields"))
   * .verificationState("verificationState")
   * .workflow(WorkflowUpdateProperty.builder()
   * .status("status")
   * .build())
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html)
   */
  public interface AutomationRulesActionProperty {
    /**
     * Specifies that the automation rule action is an update to a finding field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html#cfn-securityhub-automationrule-automationrulesaction-findingfieldsupdate)
     */
    public fun findingFieldsUpdate(): Any

    /**
     * Specifies the type of action that Security Hub takes when a finding matches the defined
     * criteria of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html#cfn-securityhub-automationrule-automationrulesaction-type)
     */
    public fun type(): String

    /**
     * A builder for [AutomationRulesActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      public fun findingFieldsUpdate(findingFieldsUpdate: IResolvable)

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty)

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c3f16cefb02891da7c8b09db3c49d70707c13fd09f95537daf015db2dc77ec5")
      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty.Builder.() -> Unit)

      /**
       * @param type Specifies the type of action that Security Hub takes when a finding matches the
       * defined criteria of a rule. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty.builder()

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      override fun findingFieldsUpdate(findingFieldsUpdate: IResolvable) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(AutomationRulesFindingFieldsUpdateProperty.Companion::unwrap))
      }

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c3f16cefb02891da7c8b09db3c49d70707c13fd09f95537daf015db2dc77ec5")
      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateProperty.Builder.() -> Unit):
          Unit =
          findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty(findingFieldsUpdate))

      /**
       * @param type Specifies the type of action that Security Hub takes when a finding matches the
       * defined criteria of a rule. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty,
    ) : CdkObject(cdkObject),
        AutomationRulesActionProperty {
      /**
       * Specifies that the automation rule action is an update to a finding field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html#cfn-securityhub-automationrule-automationrulesaction-findingfieldsupdate)
       */
      override fun findingFieldsUpdate(): Any = unwrap(this).getFindingFieldsUpdate()

      /**
       * Specifies the type of action that Security Hub takes when a finding matches the defined
       * criteria of a rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html#cfn-securityhub-automationrule-automationrulesaction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutomationRulesActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty):
          AutomationRulesActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutomationRulesActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesActionProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesActionProperty
    }
  }

  /**
   * Identifies the finding fields that the automation rule action updates when a finding matches
   * the defined criteria.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * Object id;
   * Object updatedBy;
   * AutomationRulesFindingFieldsUpdateProperty automationRulesFindingFieldsUpdateProperty =
   * AutomationRulesFindingFieldsUpdateProperty.builder()
   * .confidence(123)
   * .criticality(123)
   * .note(NoteUpdateProperty.builder()
   * .text("text")
   * .updatedBy(updatedBy)
   * .build())
   * .relatedFindings(List.of(RelatedFindingProperty.builder()
   * .id(id)
   * .productArn("productArn")
   * .build()))
   * .severity(SeverityUpdateProperty.builder()
   * .label("label")
   * .normalized(123)
   * .product(123)
   * .build())
   * .types(List.of("types"))
   * .userDefinedFields(Map.of(
   * "userDefinedFieldsKey", "userDefinedFields"))
   * .verificationState("verificationState")
   * .workflow(WorkflowUpdateProperty.builder()
   * .status("status")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html)
   */
  public interface AutomationRulesFindingFieldsUpdateProperty {
    /**
     * The rule action updates the `Confidence` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-confidence)
     */
    public fun confidence(): Number? = unwrap(this).getConfidence()

    /**
     * The rule action updates the `Criticality` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-criticality)
     */
    public fun criticality(): Number? = unwrap(this).getCriticality()

    /**
     * The rule action will update the `Note` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-note)
     */
    public fun note(): Any? = unwrap(this).getNote()

    /**
     * The rule action will update the `RelatedFindings` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-relatedfindings)
     */
    public fun relatedFindings(): Any? = unwrap(this).getRelatedFindings()

    /**
     * The rule action will update the `Severity` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-severity)
     */
    public fun severity(): Any? = unwrap(this).getSeverity()

    /**
     * The rule action updates the `Types` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * The rule action updates the `UserDefinedFields` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-userdefinedfields)
     */
    public fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

    /**
     * The rule action updates the `VerificationState` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-verificationstate)
     */
    public fun verificationState(): String? = unwrap(this).getVerificationState()

    /**
     * The rule action will update the `Workflow` field of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-workflow)
     */
    public fun workflow(): Any? = unwrap(this).getWorkflow()

    /**
     * A builder for [AutomationRulesFindingFieldsUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param confidence The rule action updates the `Confidence` field of a finding.
       */
      public fun confidence(confidence: Number)

      /**
       * @param criticality The rule action updates the `Criticality` field of a finding.
       */
      public fun criticality(criticality: Number)

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      public fun note(note: IResolvable)

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      public fun note(note: NoteUpdateProperty)

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72379505fd3f18cca4f46ba7ad6532ed15e68d45ce50c32089e85f2f9d531ecd")
      public fun note(note: NoteUpdateProperty.Builder.() -> Unit)

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      public fun relatedFindings(relatedFindings: IResolvable)

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      public fun relatedFindings(relatedFindings: List<Any>)

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      public fun relatedFindings(vararg relatedFindings: Any)

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      public fun severity(severity: IResolvable)

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      public fun severity(severity: SeverityUpdateProperty)

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500bb85fb2d022fb7610811da54b2440bcbdb9429760513eaa3fce97736539a3")
      public fun severity(severity: SeverityUpdateProperty.Builder.() -> Unit)

      /**
       * @param types The rule action updates the `Types` field of a finding.
       */
      public fun types(types: List<String>)

      /**
       * @param types The rule action updates the `Types` field of a finding.
       */
      public fun types(vararg types: String)

      /**
       * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a
       * finding.
       */
      public fun userDefinedFields(userDefinedFields: IResolvable)

      /**
       * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a
       * finding.
       */
      public fun userDefinedFields(userDefinedFields: Map<String, String>)

      /**
       * @param verificationState The rule action updates the `VerificationState` field of a
       * finding.
       */
      public fun verificationState(verificationState: String)

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      public fun workflow(workflow: IResolvable)

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      public fun workflow(workflow: WorkflowUpdateProperty)

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6504fe5e9999d895f655b17bb81cf4ae03527b5f7ad2d746c1344c950dbc0e57")
      public fun workflow(workflow: WorkflowUpdateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.builder()

      /**
       * @param confidence The rule action updates the `Confidence` field of a finding.
       */
      override fun confidence(confidence: Number) {
        cdkBuilder.confidence(confidence)
      }

      /**
       * @param criticality The rule action updates the `Criticality` field of a finding.
       */
      override fun criticality(criticality: Number) {
        cdkBuilder.criticality(criticality)
      }

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      override fun note(note: IResolvable) {
        cdkBuilder.note(note.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      override fun note(note: NoteUpdateProperty) {
        cdkBuilder.note(note.let(NoteUpdateProperty.Companion::unwrap))
      }

      /**
       * @param note The rule action will update the `Note` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72379505fd3f18cca4f46ba7ad6532ed15e68d45ce50c32089e85f2f9d531ecd")
      override fun note(note: NoteUpdateProperty.Builder.() -> Unit): Unit =
          note(NoteUpdateProperty(note))

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      override fun relatedFindings(relatedFindings: IResolvable) {
        cdkBuilder.relatedFindings(relatedFindings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      override fun relatedFindings(relatedFindings: List<Any>) {
        cdkBuilder.relatedFindings(relatedFindings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedFindings The rule action will update the `RelatedFindings` field of a
       * finding.
       */
      override fun relatedFindings(vararg relatedFindings: Any): Unit =
          relatedFindings(relatedFindings.toList())

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      override fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      override fun severity(severity: SeverityUpdateProperty) {
        cdkBuilder.severity(severity.let(SeverityUpdateProperty.Companion::unwrap))
      }

      /**
       * @param severity The rule action will update the `Severity` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500bb85fb2d022fb7610811da54b2440bcbdb9429760513eaa3fce97736539a3")
      override fun severity(severity: SeverityUpdateProperty.Builder.() -> Unit): Unit =
          severity(SeverityUpdateProperty(severity))

      /**
       * @param types The rule action updates the `Types` field of a finding.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The rule action updates the `Types` field of a finding.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      /**
       * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a
       * finding.
       */
      override fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a
       * finding.
       */
      override fun userDefinedFields(userDefinedFields: Map<String, String>) {
        cdkBuilder.userDefinedFields(userDefinedFields)
      }

      /**
       * @param verificationState The rule action updates the `VerificationState` field of a
       * finding.
       */
      override fun verificationState(verificationState: String) {
        cdkBuilder.verificationState(verificationState)
      }

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      override fun workflow(workflow: IResolvable) {
        cdkBuilder.workflow(workflow.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      override fun workflow(workflow: WorkflowUpdateProperty) {
        cdkBuilder.workflow(workflow.let(WorkflowUpdateProperty.Companion::unwrap))
      }

      /**
       * @param workflow The rule action will update the `Workflow` field of a finding.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6504fe5e9999d895f655b17bb81cf4ae03527b5f7ad2d746c1344c950dbc0e57")
      override fun workflow(workflow: WorkflowUpdateProperty.Builder.() -> Unit): Unit =
          workflow(WorkflowUpdateProperty(workflow))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty,
    ) : CdkObject(cdkObject),
        AutomationRulesFindingFieldsUpdateProperty {
      /**
       * The rule action updates the `Confidence` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-confidence)
       */
      override fun confidence(): Number? = unwrap(this).getConfidence()

      /**
       * The rule action updates the `Criticality` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-criticality)
       */
      override fun criticality(): Number? = unwrap(this).getCriticality()

      /**
       * The rule action will update the `Note` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-note)
       */
      override fun note(): Any? = unwrap(this).getNote()

      /**
       * The rule action will update the `RelatedFindings` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-relatedfindings)
       */
      override fun relatedFindings(): Any? = unwrap(this).getRelatedFindings()

      /**
       * The rule action will update the `Severity` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-severity)
       */
      override fun severity(): Any? = unwrap(this).getSeverity()

      /**
       * The rule action updates the `Types` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

      /**
       * The rule action updates the `UserDefinedFields` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-userdefinedfields)
       */
      override fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

      /**
       * The rule action updates the `VerificationState` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-verificationstate)
       */
      override fun verificationState(): String? = unwrap(this).getVerificationState()

      /**
       * The rule action will update the `Workflow` field of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html#cfn-securityhub-automationrule-automationrulesfindingfieldsupdate-workflow)
       */
      override fun workflow(): Any? = unwrap(this).getWorkflow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomationRulesFindingFieldsUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty):
          AutomationRulesFindingFieldsUpdateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutomationRulesFindingFieldsUpdateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesFindingFieldsUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty
    }
  }

  /**
   * The criteria that determine which findings a rule applies to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * AutomationRulesFindingFiltersProperty automationRulesFindingFiltersProperty =
   * AutomationRulesFindingFiltersProperty.builder()
   * .awsAccountId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .companyName(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .complianceStatus(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .confidence(List.of(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build()))
   * .createdAt(List.of(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build()))
   * .criticality(List.of(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build()))
   * .description(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .firstObservedAt(List.of(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build()))
   * .generatorId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .id(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .lastObservedAt(List.of(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build()))
   * .noteText(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .noteUpdatedAt(List.of(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build()))
   * .noteUpdatedBy(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .productArn(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .productName(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .recordState(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .relatedFindingsId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourceDetailsOther(List.of(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build()))
   * .resourceId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourcePartition(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourceRegion(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourceTags(List.of(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build()))
   * .resourceType(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .severityLabel(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .sourceUrl(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .title(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .type(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .updatedAt(List.of(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build()))
   * .userDefinedFields(List.of(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build()))
   * .verificationState(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .workflowStatus(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html)
   */
  public interface AutomationRulesFindingFiltersProperty {
    /**
     * The AWS account ID in which a finding was generated.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-awsaccountid)
     */
    public fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

    /**
     * The name of the company for the product that generated the finding.
     *
     * For control-based findings, the company is AWS .
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-companyname)
     */
    public fun companyName(): Any? = unwrap(this).getCompanyName()

    /**
     * The unique identifier of a standard in which a control is enabled.
     *
     * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a
     * standard in the
     * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API response.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-complianceassociatedstandardsid)
     */
    public fun complianceAssociatedStandardsId(): Any? =
        unwrap(this).getComplianceAssociatedStandardsId()

    /**
     * The security control ID for which a finding was generated. Security control IDs are the same
     * across standards.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-compliancesecuritycontrolid)
     */
    public fun complianceSecurityControlId(): Any? = unwrap(this).getComplianceSecurityControlId()

    /**
     * The result of a security check. This field is only used for findings generated from controls.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-compliancestatus)
     */
    public fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

    /**
     * The likelihood that a finding accurately identifies the behavior or issue that it was
     * intended to identify.
     *
     * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
     * confidence, and a value of `100` means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an
     * actual exfiltration hasn't been verified. For more information, see
     * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
     * in the *AWS Security Hub User Guide* .
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-confidence)
     */
    public fun confidence(): Any? = unwrap(this).getConfidence()

    /**
     * A timestamp that indicates when this finding record was created.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-createdat)
     */
    public fun createdAt(): Any? = unwrap(this).getCreatedAt()

    /**
     * The level of importance that is assigned to the resources that are associated with a finding.
     *
     * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
     * integers. A score of `0` means that the underlying resources have no criticality, and a score of
     * `100` is reserved for the most critical resources. For more information, see
     * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
     * in the *AWS Security Hub User Guide* .
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-criticality)
     */
    public fun criticality(): Any? = unwrap(this).getCriticality()

    /**
     * A finding's description.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-description)
     */
    public fun description(): Any? = unwrap(this).getDescription()

    /**
     * A timestamp that indicates when the potential security issue captured by a finding was first
     * observed by the security findings product.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-firstobservedat)
     */
    public fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

    /**
     * The identifier for the solution-specific component that generated a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-generatorid)
     */
    public fun generatorId(): Any? = unwrap(this).getGeneratorId()

    /**
     * The product-specific identifier for a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-id)
     */
    public fun id(): Any? = unwrap(this).getId()

    /**
     * A timestamp that indicates when the potential security issue captured by a finding was most
     * recently observed by the security findings product.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-lastobservedat)
     */
    public fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

    /**
     * The text of a user-defined note that's added to a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-notetext)
     */
    public fun noteText(): Any? = unwrap(this).getNoteText()

    /**
     * The timestamp of when the note was updated.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-noteupdatedat)
     */
    public fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

    /**
     * The principal that created a note.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-noteupdatedby)
     */
    public fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

    /**
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security
     * Hub.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-productarn)
     */
    public fun productArn(): Any? = unwrap(this).getProductArn()

    /**
     * Provides the name of the product that generated the finding. For control-based findings, the
     * product name is Security Hub.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-productname)
     */
    public fun productName(): Any? = unwrap(this).getProductName()

    /**
     * Provides the current state of a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-recordstate)
     */
    public fun recordState(): Any? = unwrap(this).getRecordState()

    /**
     * The product-generated identifier for a related finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-relatedfindingsid)
     */
    public fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

    /**
     * The ARN for the product that generated a related finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-relatedfindingsproductarn)
     */
    public fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

    /**
     * Custom fields and values about the resource that a finding pertains to.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcedetailsother)
     */
    public fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

    /**
     * The identifier for the given resource type.
     *
     * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
     * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that created
     * the resource. For non- AWS resources, this is a unique identifier that is associated with the
     * resource.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourceid)
     */
    public fun resourceId(): Any? = unwrap(this).getResourceId()

    /**
     * The partition in which the resource that the finding pertains to is located.
     *
     * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcepartition)
     */
    public fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

    /**
     * The AWS Region where the resource that a finding pertains to is located.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourceregion)
     */
    public fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

    /**
     * A list of AWS tags associated with a resource at the time the finding was processed.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcetags)
     */
    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * A finding's title.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcetype)
     */
    public fun resourceType(): Any? = unwrap(this).getResourceType()

    /**
     * The severity value of the finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-severitylabel)
     */
    public fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

    /**
     * Provides a URL that links to a page about the current finding in the finding product.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-sourceurl)
     */
    public fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

    /**
     * A finding's title.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-title)
     */
    public fun title(): Any? = unwrap(this).getTitle()

    /**
     * One or more finding types in the format of namespace/category/classifier that classify a
     * finding.
     *
     * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
     * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
     * in the *AWS Security Hub User Guide* .
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-type)
     */
    public fun type(): Any? = unwrap(this).getType()

    /**
     * A timestamp that indicates when the finding record was most recently updated.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-updatedat)
     */
    public fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

    /**
     * A list of user-defined name and value string pairs added to a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-userdefinedfields)
     */
    public fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

    /**
     * Provides the veracity of a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-verificationstate)
     */
    public fun verificationState(): Any? = unwrap(this).getVerificationState()

    /**
     * Provides information about the status of the investigation into a finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-workflowstatus)
     */
    public fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()

    /**
     * A builder for [AutomationRulesFindingFiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun awsAccountId(awsAccountId: IResolvable)

      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun awsAccountId(awsAccountId: List<Any>)

      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun awsAccountId(vararg awsAccountId: Any)

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun companyName(companyName: IResolvable)

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun companyName(companyName: List<Any>)

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun companyName(vararg companyName: Any)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any)

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceSecurityControlId(complianceSecurityControlId: IResolvable)

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceSecurityControlId(complianceSecurityControlId: List<Any>)

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceSecurityControlId(vararg complianceSecurityControlId: Any)

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceStatus(complianceStatus: IResolvable)

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceStatus(complianceStatus: List<Any>)

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun complianceStatus(vararg complianceStatus: Any)

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun confidence(confidence: IResolvable)

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun confidence(confidence: List<Any>)

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun confidence(vararg confidence: Any)

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun createdAt(createdAt: IResolvable)

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun createdAt(createdAt: List<Any>)

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun createdAt(vararg createdAt: Any)

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun criticality(criticality: IResolvable)

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun criticality(criticality: List<Any>)

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun criticality(vararg criticality: Any)

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun description(description: IResolvable)

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun description(description: List<Any>)

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun description(vararg description: Any)

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun firstObservedAt(firstObservedAt: IResolvable)

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun firstObservedAt(firstObservedAt: List<Any>)

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun firstObservedAt(vararg firstObservedAt: Any)

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun generatorId(generatorId: IResolvable)

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun generatorId(generatorId: List<Any>)

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun generatorId(vararg generatorId: Any)

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun id(id: IResolvable)

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun id(id: List<Any>)

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun id(vararg id: Any)

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun lastObservedAt(lastObservedAt: IResolvable)

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun lastObservedAt(lastObservedAt: List<Any>)

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun lastObservedAt(vararg lastObservedAt: Any)

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteText(noteText: IResolvable)

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteText(noteText: List<Any>)

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteText(vararg noteText: Any)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedAt(noteUpdatedAt: IResolvable)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedAt(noteUpdatedAt: List<Any>)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedAt(vararg noteUpdatedAt: Any)

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedBy(noteUpdatedBy: IResolvable)

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedBy(noteUpdatedBy: List<Any>)

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun noteUpdatedBy(vararg noteUpdatedBy: Any)

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productArn(productArn: IResolvable)

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productArn(productArn: List<Any>)

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productArn(vararg productArn: Any)

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productName(productName: IResolvable)

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productName(productName: List<Any>)

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun productName(vararg productName: Any)

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun recordState(recordState: IResolvable)

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun recordState(recordState: List<Any>)

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun recordState(vararg recordState: Any)

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsId(relatedFindingsId: IResolvable)

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsId(relatedFindingsId: List<Any>)

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsId(vararg relatedFindingsId: Any)

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable)

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>)

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any)

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceDetailsOther(resourceDetailsOther: IResolvable)

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceDetailsOther(resourceDetailsOther: List<Any>)

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceDetailsOther(vararg resourceDetailsOther: Any)

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceId(resourceId: IResolvable)

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceId(resourceId: List<Any>)

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceId(vararg resourceId: Any)

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourcePartition(resourcePartition: IResolvable)

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourcePartition(resourcePartition: List<Any>)

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourcePartition(vararg resourcePartition: Any)

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceRegion(resourceRegion: IResolvable)

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceRegion(resourceRegion: List<Any>)

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceRegion(vararg resourceRegion: Any)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceTags(resourceTags: IResolvable)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceTags(resourceTags: List<Any>)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun resourceTags(vararg resourceTags: Any)

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceType(resourceType: IResolvable)

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceType(resourceType: List<Any>)

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun resourceType(vararg resourceType: Any)

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun severityLabel(severityLabel: IResolvable)

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun severityLabel(severityLabel: List<Any>)

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun severityLabel(vararg severityLabel: Any)

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun sourceUrl(sourceUrl: IResolvable)

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun sourceUrl(sourceUrl: List<Any>)

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun sourceUrl(vararg sourceUrl: Any)

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun title(title: IResolvable)

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun title(title: List<Any>)

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      public fun title(vararg title: Any)

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun type(type: IResolvable)

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun type(type: List<Any>)

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun type(vararg type: Any)

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun updatedAt(updatedAt: IResolvable)

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun updatedAt(updatedAt: List<Any>)

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun updatedAt(vararg updatedAt: Any)

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun userDefinedFields(userDefinedFields: IResolvable)

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun userDefinedFields(userDefinedFields: List<Any>)

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun userDefinedFields(vararg userDefinedFields: Any)

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun verificationState(verificationState: IResolvable)

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun verificationState(verificationState: List<Any>)

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun verificationState(vararg verificationState: Any)

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun workflowStatus(workflowStatus: IResolvable)

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun workflowStatus(workflowStatus: List<Any>)

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun workflowStatus(vararg workflowStatus: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty.builder()

      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun awsAccountId(awsAccountId: List<Any>) {
        cdkBuilder.awsAccountId(awsAccountId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsAccountId The AWS account ID in which a finding was generated.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun awsAccountId(vararg awsAccountId: Any): Unit =
          awsAccountId(awsAccountId.toList())

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun companyName(companyName: IResolvable) {
        cdkBuilder.companyName(companyName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun companyName(companyName: List<Any>) {
        cdkBuilder.companyName(companyName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param companyName The name of the company for the product that generated the finding.
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun companyName(vararg companyName: Any): Unit = companyName(companyName.toList())

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any):
          Unit = complianceAssociatedStandardsId(complianceAssociatedStandardsId.toList())

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceSecurityControlId(complianceSecurityControlId: IResolvable) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceSecurityControlId(complianceSecurityControlId: List<Any>) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceSecurityControlId The security control ID for which a finding was
       * generated. Security control IDs are the same across standards.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceSecurityControlId(vararg complianceSecurityControlId: Any): Unit =
          complianceSecurityControlId(complianceSecurityControlId.toList())

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceStatus(complianceStatus: IResolvable) {
        cdkBuilder.complianceStatus(complianceStatus.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceStatus(complianceStatus: List<Any>) {
        cdkBuilder.complianceStatus(complianceStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceStatus The result of a security check. This field is only used for
       * findings generated from controls.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun complianceStatus(vararg complianceStatus: Any): Unit =
          complianceStatus(complianceStatus.toList())

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun confidence(confidence: IResolvable) {
        cdkBuilder.confidence(confidence.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun confidence(confidence: List<Any>) {
        cdkBuilder.confidence(confidence.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param confidence The likelihood that a finding accurately identifies the behavior or issue
       * that it was intended to identify.
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun confidence(vararg confidence: Any): Unit = confidence(confidence.toList())

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun createdAt(createdAt: IResolvable) {
        cdkBuilder.createdAt(createdAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun createdAt(createdAt: List<Any>) {
        cdkBuilder.createdAt(createdAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param createdAt A timestamp that indicates when this finding record was created.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun createdAt(vararg createdAt: Any): Unit = createdAt(createdAt.toList())

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun criticality(criticality: IResolvable) {
        cdkBuilder.criticality(criticality.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun criticality(criticality: List<Any>) {
        cdkBuilder.criticality(criticality.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param criticality The level of importance that is assigned to the resources that are
       * associated with a finding.
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun criticality(vararg criticality: Any): Unit = criticality(criticality.toList())

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun description(description: IResolvable) {
        cdkBuilder.description(description.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun description(description: List<Any>) {
        cdkBuilder.description(description.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param description A finding's description.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun description(vararg description: Any): Unit = description(description.toList())

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun firstObservedAt(firstObservedAt: List<Any>) {
        cdkBuilder.firstObservedAt(firstObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param firstObservedAt A timestamp that indicates when the potential security issue
       * captured by a finding was first observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun firstObservedAt(vararg firstObservedAt: Any): Unit =
          firstObservedAt(firstObservedAt.toList())

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun generatorId(generatorId: IResolvable) {
        cdkBuilder.generatorId(generatorId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun generatorId(generatorId: List<Any>) {
        cdkBuilder.generatorId(generatorId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param generatorId The identifier for the solution-specific component that generated a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun generatorId(vararg generatorId: Any): Unit = generatorId(generatorId.toList())

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun id(id: List<Any>) {
        cdkBuilder.id(id.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param id The product-specific identifier for a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun id(vararg id: Any): Unit = id(id.toList())

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun lastObservedAt(lastObservedAt: List<Any>) {
        cdkBuilder.lastObservedAt(lastObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lastObservedAt A timestamp that indicates when the potential security issue captured
       * by a finding was most recently observed by the security findings product.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun lastObservedAt(vararg lastObservedAt: Any): Unit =
          lastObservedAt(lastObservedAt.toList())

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteText(noteText: IResolvable) {
        cdkBuilder.noteText(noteText.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteText(noteText: List<Any>) {
        cdkBuilder.noteText(noteText.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteText The text of a user-defined note that's added to a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteText(vararg noteText: Any): Unit = noteText(noteText.toList())

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedAt(noteUpdatedAt: IResolvable) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedAt(noteUpdatedAt: List<Any>) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedAt(vararg noteUpdatedAt: Any): Unit =
          noteUpdatedAt(noteUpdatedAt.toList())

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedBy(noteUpdatedBy: IResolvable) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedBy(noteUpdatedBy: List<Any>) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteUpdatedBy The principal that created a note.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun noteUpdatedBy(vararg noteUpdatedBy: Any): Unit =
          noteUpdatedBy(noteUpdatedBy.toList())

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productArn(productArn: IResolvable) {
        cdkBuilder.productArn(productArn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productArn(productArn: List<Any>) {
        cdkBuilder.productArn(productArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
       * finding in Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productArn(vararg productArn: Any): Unit = productArn(productArn.toList())

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productName(productName: IResolvable) {
        cdkBuilder.productName(productName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productName(productName: List<Any>) {
        cdkBuilder.productName(productName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param productName Provides the name of the product that generated the finding. For
       * control-based findings, the product name is Security Hub.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun productName(vararg productName: Any): Unit = productName(productName.toList())

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun recordState(recordState: IResolvable) {
        cdkBuilder.recordState(recordState.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun recordState(recordState: List<Any>) {
        cdkBuilder.recordState(recordState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recordState Provides the current state of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun recordState(vararg recordState: Any): Unit = recordState(recordState.toList())

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsId(relatedFindingsId: IResolvable) {
        cdkBuilder.relatedFindingsId(relatedFindingsId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsId(relatedFindingsId: List<Any>) {
        cdkBuilder.relatedFindingsId(relatedFindingsId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedFindingsId The product-generated identifier for a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsId(vararg relatedFindingsId: Any): Unit =
          relatedFindingsId(relatedFindingsId.toList())

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any): Unit =
          relatedFindingsProductArn(relatedFindingsProductArn.toList())

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceDetailsOther(resourceDetailsOther: IResolvable) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceDetailsOther(resourceDetailsOther: List<Any>) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceDetailsOther Custom fields and values about the resource that a finding
       * pertains to.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceDetailsOther(vararg resourceDetailsOther: Any): Unit =
          resourceDetailsOther(resourceDetailsOther.toList())

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceId(resourceId: List<Any>) {
        cdkBuilder.resourceId(resourceId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceId The identifier for the given resource type.
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceId(vararg resourceId: Any): Unit = resourceId(resourceId.toList())

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourcePartition(resourcePartition: IResolvable) {
        cdkBuilder.resourcePartition(resourcePartition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourcePartition(resourcePartition: List<Any>) {
        cdkBuilder.resourcePartition(resourcePartition.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourcePartition The partition in which the resource that the finding pertains to
       * is located.
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourcePartition(vararg resourcePartition: Any): Unit =
          resourcePartition(resourcePartition.toList())

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceRegion(resourceRegion: IResolvable) {
        cdkBuilder.resourceRegion(resourceRegion.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceRegion(resourceRegion: List<Any>) {
        cdkBuilder.resourceRegion(resourceRegion.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceRegion The AWS Region where the resource that a finding pertains to is
       * located.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceRegion(vararg resourceRegion: Any): Unit =
          resourceRegion(resourceRegion.toList())

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun resourceTags(vararg resourceTags: Any): Unit =
          resourceTags(resourceTags.toList())

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceType(resourceType: List<Any>) {
        cdkBuilder.resourceType(resourceType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceType A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun resourceType(vararg resourceType: Any): Unit =
          resourceType(resourceType.toList())

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun severityLabel(severityLabel: IResolvable) {
        cdkBuilder.severityLabel(severityLabel.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun severityLabel(severityLabel: List<Any>) {
        cdkBuilder.severityLabel(severityLabel.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param severityLabel The severity value of the finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun severityLabel(vararg severityLabel: Any): Unit =
          severityLabel(severityLabel.toList())

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun sourceUrl(sourceUrl: IResolvable) {
        cdkBuilder.sourceUrl(sourceUrl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun sourceUrl(sourceUrl: List<Any>) {
        cdkBuilder.sourceUrl(sourceUrl.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourceUrl Provides a URL that links to a page about the current finding in the
       * finding product.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun sourceUrl(vararg sourceUrl: Any): Unit = sourceUrl(sourceUrl.toList())

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun title(title: IResolvable) {
        cdkBuilder.title(title.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun title(title: List<Any>) {
        cdkBuilder.title(title.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param title A finding's title.
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       */
      override fun title(vararg title: Any): Unit = title(title.toList())

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun type(type: List<Any>) {
        cdkBuilder.type(type.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param type One or more finding types in the format of namespace/category/classifier that
       * classify a finding.
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun type(vararg type: Any): Unit = type(type.toList())

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun updatedAt(updatedAt: List<Any>) {
        cdkBuilder.updatedAt(updatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param updatedAt A timestamp that indicates when the finding record was most recently
       * updated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun updatedAt(vararg updatedAt: Any): Unit = updatedAt(updatedAt.toList())

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun userDefinedFields(userDefinedFields: List<Any>) {
        cdkBuilder.userDefinedFields(userDefinedFields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param userDefinedFields A list of user-defined name and value string pairs added to a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun userDefinedFields(vararg userDefinedFields: Any): Unit =
          userDefinedFields(userDefinedFields.toList())

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun verificationState(verificationState: IResolvable) {
        cdkBuilder.verificationState(verificationState.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun verificationState(verificationState: List<Any>) {
        cdkBuilder.verificationState(verificationState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param verificationState Provides the veracity of a finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun verificationState(vararg verificationState: Any): Unit =
          verificationState(verificationState.toList())

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun workflowStatus(workflowStatus: IResolvable) {
        cdkBuilder.workflowStatus(workflowStatus.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun workflowStatus(workflowStatus: List<Any>) {
        cdkBuilder.workflowStatus(workflowStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param workflowStatus Provides information about the status of the investigation into a
       * finding.
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun workflowStatus(vararg workflowStatus: Any): Unit =
          workflowStatus(workflowStatus.toList())

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty,
    ) : CdkObject(cdkObject),
        AutomationRulesFindingFiltersProperty {
      /**
       * The AWS account ID in which a finding was generated.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-awsaccountid)
       */
      override fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

      /**
       * The name of the company for the product that generated the finding.
       *
       * For control-based findings, the company is AWS .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-companyname)
       */
      override fun companyName(): Any? = unwrap(this).getCompanyName()

      /**
       * The unique identifier of a standard in which a control is enabled.
       *
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-complianceassociatedstandardsid)
       */
      override fun complianceAssociatedStandardsId(): Any? =
          unwrap(this).getComplianceAssociatedStandardsId()

      /**
       * The security control ID for which a finding was generated. Security control IDs are the
       * same across standards.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-compliancesecuritycontrolid)
       */
      override fun complianceSecurityControlId(): Any? =
          unwrap(this).getComplianceSecurityControlId()

      /**
       * The result of a security check. This field is only used for findings generated from
       * controls.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-compliancestatus)
       */
      override fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

      /**
       * The likelihood that a finding accurately identifies the behavior or issue that it was
       * intended to identify.
       *
       * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
       * confidence, and a value of `100` means 100 percent confidence. For example, a data
       * exfiltration detection based on a statistical deviation of network traffic has low confidence
       * because an actual exfiltration hasn't been verified. For more information, see
       * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-confidence)
       */
      override fun confidence(): Any? = unwrap(this).getConfidence()

      /**
       * A timestamp that indicates when this finding record was created.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-createdat)
       */
      override fun createdAt(): Any? = unwrap(this).getCreatedAt()

      /**
       * The level of importance that is assigned to the resources that are associated with a
       * finding.
       *
       * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full
       * integers. A score of `0` means that the underlying resources have no criticality, and a score
       * of `100` is reserved for the most critical resources. For more information, see
       * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-criticality)
       */
      override fun criticality(): Any? = unwrap(this).getCriticality()

      /**
       * A finding's description.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-description)
       */
      override fun description(): Any? = unwrap(this).getDescription()

      /**
       * A timestamp that indicates when the potential security issue captured by a finding was
       * first observed by the security findings product.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-firstobservedat)
       */
      override fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

      /**
       * The identifier for the solution-specific component that generated a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-generatorid)
       */
      override fun generatorId(): Any? = unwrap(this).getGeneratorId()

      /**
       * The product-specific identifier for a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-id)
       */
      override fun id(): Any? = unwrap(this).getId()

      /**
       * A timestamp that indicates when the potential security issue captured by a finding was most
       * recently observed by the security findings product.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-lastobservedat)
       */
      override fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

      /**
       * The text of a user-defined note that's added to a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-notetext)
       */
      override fun noteText(): Any? = unwrap(this).getNoteText()

      /**
       * The timestamp of when the note was updated.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-noteupdatedat)
       */
      override fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

      /**
       * The principal that created a note.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-noteupdatedby)
       */
      override fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

      /**
       * The Amazon Resource Name (ARN) for a third-party product that generated a finding in
       * Security Hub.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-productarn)
       */
      override fun productArn(): Any? = unwrap(this).getProductArn()

      /**
       * Provides the name of the product that generated the finding. For control-based findings,
       * the product name is Security Hub.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-productname)
       */
      override fun productName(): Any? = unwrap(this).getProductName()

      /**
       * Provides the current state of a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-recordstate)
       */
      override fun recordState(): Any? = unwrap(this).getRecordState()

      /**
       * The product-generated identifier for a related finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-relatedfindingsid)
       */
      override fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

      /**
       * The ARN for the product that generated a related finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-relatedfindingsproductarn)
       */
      override fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

      /**
       * Custom fields and values about the resource that a finding pertains to.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcedetailsother)
       */
      override fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

      /**
       * The identifier for the given resource type.
       *
       * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For
       * AWS resources that lack ARNs, this is the identifier as defined by the AWS service that
       * created the resource. For non- AWS resources, this is a unique identifier that is associated
       * with the resource.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourceid)
       */
      override fun resourceId(): Any? = unwrap(this).getResourceId()

      /**
       * The partition in which the resource that the finding pertains to is located.
       *
       * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcepartition)
       */
      override fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

      /**
       * The AWS Region where the resource that a finding pertains to is located.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourceregion)
       */
      override fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

      /**
       * A list of AWS tags associated with a resource at the time the finding was processed.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcetags)
       */
      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      /**
       * A finding's title.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-resourcetype)
       */
      override fun resourceType(): Any? = unwrap(this).getResourceType()

      /**
       * The severity value of the finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-severitylabel)
       */
      override fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

      /**
       * Provides a URL that links to a page about the current finding in the finding product.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-sourceurl)
       */
      override fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

      /**
       * A finding's title.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 100 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-title)
       */
      override fun title(): Any? = unwrap(this).getTitle()

      /**
       * One or more finding types in the format of namespace/category/classifier that classify a
       * finding.
       *
       * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
       * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
       * in the *AWS Security Hub User Guide* .
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-type)
       */
      override fun type(): Any? = unwrap(this).getType()

      /**
       * A timestamp that indicates when the finding record was most recently updated.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-updatedat)
       */
      override fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

      /**
       * A list of user-defined name and value string pairs added to a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-userdefinedfields)
       */
      override fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

      /**
       * Provides the veracity of a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-verificationstate)
       */
      override fun verificationState(): Any? = unwrap(this).getVerificationState()

      /**
       * Provides information about the status of the investigation into a finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html#cfn-securityhub-automationrule-automationrulesfindingfilters-workflowstatus)
       */
      override fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomationRulesFindingFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty):
          AutomationRulesFindingFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutomationRulesFindingFiltersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesFindingFiltersProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.AutomationRulesFindingFiltersProperty
    }
  }

  /**
   * A date filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html)
   */
  public interface DateFilterProperty {
    /**
     * A date range for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-daterange)
     */
    public fun dateRange(): Any? = unwrap(this).getDateRange()

    /**
     * A timestamp that provides the end date for the date filter.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * A timestamp that provides the start date for the date filter.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * A builder for [DateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: IResolvable)

      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: DateRangeProperty)

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd591f68a01c43a95bf7629f4b5eb43f0b12dfef81656f6b65a55e993c495318")
      public fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit)

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun end(end: String)

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty.builder()

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: DateRangeProperty) {
        cdkBuilder.dateRange(dateRange.let(DateRangeProperty.Companion::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd591f68a01c43a95bf7629f4b5eb43f0b12dfef81656f6b65a55e993c495318")
      override fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit): Unit =
          dateRange(DateRangeProperty(dateRange))

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty,
    ) : CdkObject(cdkObject),
        DateFilterProperty {
      /**
       * A date range for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-daterange)
       */
      override fun dateRange(): Any? = unwrap(this).getDateRange()

      /**
       * A timestamp that provides the end date for the date filter.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * A timestamp that provides the start date for the date filter.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html#cfn-securityhub-automationrule-datefilter-start)
       */
      override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty):
          DateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? DateFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateFilterProperty
    }
  }

  /**
   * A date range for the date filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateRangeProperty dateRangeProperty = DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html)
   */
  public interface DateRangeProperty {
    /**
     * A date range unit for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html#cfn-securityhub-automationrule-daterange-unit)
     */
    public fun unit(): String

    /**
     * A date range value for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html#cfn-securityhub-automationrule-daterange-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [DateRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit A date range unit for the date filter. 
       */
      public fun unit(unit: String)

      /**
       * @param value A date range value for the date filter. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty.builder()

      /**
       * @param unit A date range unit for the date filter. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value A date range value for the date filter. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty,
    ) : CdkObject(cdkObject),
        DateRangeProperty {
      /**
       * A date range unit for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html#cfn-securityhub-automationrule-daterange-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A date range value for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html#cfn-securityhub-automationrule-daterange-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty):
          DateRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? DateRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateRangeProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.DateRangeProperty
    }
  }

  /**
   * A map filter for filtering AWS Security Hub findings.
   *
   * Each map filter provides the field to check for, the value to check for, and the comparison
   * operator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html)
   */
  public interface MapFilterProperty {
    /**
     * The condition to apply to the key value when filtering Security Hub findings with a map
     * filter.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, for the
     * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
     * the value `Security` for the `Department` tag. In the same example, a finding with a value of
     * `Security team` for the `Department` tag is a match.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
     * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have the
     * value `Security` for the `Department` tag.
     *
     * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
     * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
     * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
     * both values.
     *
     * To search for values that don't have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
     * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
     * exclude the value `Finance` for the `Department` tag.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
     * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
     * have the value `Finance` for the `Department` tag.
     *
     * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
     * matches only if it matches all of those filters. For example, the filters `Department
     * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
     * the `Security` and `Finance` values.
     *
     * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can
     * only be used with other `NOT_CONTAINS` filters.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
     * Combining filters in this way returns an error.
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
     * information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The key of the map filter.
     *
     * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
     * `UserDefinedFields` , `Key` is the name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-key)
     */
    public fun key(): String

    /**
     * The value for the key in the map filter.
     *
     * Filter values are case sensitive. For example, one of the values for a tag called
     * `Department` might be `Security` . If you provide `security` as the filter value, then there's
     * no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MapFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      public fun key(key: String)

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty.builder()

      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty,
    ) : CdkObject(cdkObject),
        MapFilterProperty {
      /**
       * The condition to apply to the key value when filtering Security Hub findings with a map
       * filter.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The key of the map filter.
       *
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value for the key in the map filter.
       *
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html#cfn-securityhub-automationrule-mapfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty):
          MapFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? MapFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.MapFilterProperty
    }
  }

  /**
   * The updated note.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * Object updatedBy;
   * NoteUpdateProperty noteUpdateProperty = NoteUpdateProperty.builder()
   * .text("text")
   * .updatedBy(updatedBy)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html)
   */
  public interface NoteUpdateProperty {
    /**
     * The updated note text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html#cfn-securityhub-automationrule-noteupdate-text)
     */
    public fun text(): String

    /**
     * The principal that updated the note.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html#cfn-securityhub-automationrule-noteupdate-updatedby)
     */
    public fun updatedBy(): Any

    /**
     * A builder for [NoteUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text The updated note text. 
       */
      public fun text(text: String)

      /**
       * @param updatedBy The principal that updated the note. 
       */
      public fun updatedBy(updatedBy: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty.builder()

      /**
       * @param text The updated note text. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param updatedBy The principal that updated the note. 
       */
      override fun updatedBy(updatedBy: Any) {
        cdkBuilder.updatedBy(updatedBy)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty,
    ) : CdkObject(cdkObject),
        NoteUpdateProperty {
      /**
       * The updated note text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html#cfn-securityhub-automationrule-noteupdate-text)
       */
      override fun text(): String = unwrap(this).getText()

      /**
       * The principal that updated the note.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html#cfn-securityhub-automationrule-noteupdate-updatedby)
       */
      override fun updatedBy(): Any = unwrap(this).getUpdatedBy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NoteUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty):
          NoteUpdateProperty = CdkObjectWrappers.wrap(cdkObject) as? NoteUpdateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoteUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NoteUpdateProperty
    }
  }

  /**
   * A number filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html)
   */
  public interface NumberFilterProperty {
    /**
     * The equal-to condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-eq)
     */
    public fun eq(): Number? = unwrap(this).getEq()

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-gte)
     */
    public fun gte(): Number? = unwrap(this).getGte()

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-lte)
     */
    public fun lte(): Number? = unwrap(this).getLte()

    /**
     * A builder for [NumberFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      public fun eq(eq: Number)

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      public fun gte(gte: Number)

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      public fun lte(lte: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty.builder()

      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      override fun eq(eq: Number) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty,
    ) : CdkObject(cdkObject),
        NumberFilterProperty {
      /**
       * The equal-to condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-eq)
       */
      override fun eq(): Number? = unwrap(this).getEq()

      /**
       * The greater-than-equal condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-gte)
       */
      override fun gte(): Number? = unwrap(this).getGte()

      /**
       * The less-than-equal condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html#cfn-securityhub-automationrule-numberfilter-lte)
       */
      override fun lte(): Number? = unwrap(this).getLte()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty):
          NumberFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? NumberFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.NumberFilterProperty
    }
  }

  /**
   * Provides details about a list of findings that the current finding relates to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * Object id;
   * RelatedFindingProperty relatedFindingProperty = RelatedFindingProperty.builder()
   * .id(id)
   * .productArn("productArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html)
   */
  public interface RelatedFindingProperty {
    /**
     * The product-generated identifier for a related finding.
     *
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html#cfn-securityhub-automationrule-relatedfinding-id)
     */
    public fun id(): Any

    /**
     * The Amazon Resource Name (ARN) for the product that generated a related finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html#cfn-securityhub-automationrule-relatedfinding-productarn)
     */
    public fun productArn(): String

    /**
     * A builder for [RelatedFindingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The product-generated identifier for a related finding. 
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      public fun id(id: Any)

      /**
       * @param productArn The Amazon Resource Name (ARN) for the product that generated a related
       * finding. 
       */
      public fun productArn(productArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty.builder()

      /**
       * @param id The product-generated identifier for a related finding. 
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       */
      override fun id(id: Any) {
        cdkBuilder.id(id)
      }

      /**
       * @param productArn The Amazon Resource Name (ARN) for the product that generated a related
       * finding. 
       */
      override fun productArn(productArn: String) {
        cdkBuilder.productArn(productArn)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty,
    ) : CdkObject(cdkObject),
        RelatedFindingProperty {
      /**
       * The product-generated identifier for a related finding.
       *
       * Array Members: Minimum number of 1 item. Maximum number of 20 items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html#cfn-securityhub-automationrule-relatedfinding-id)
       */
      override fun id(): Any = unwrap(this).getId()

      /**
       * The Amazon Resource Name (ARN) for the product that generated a related finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html#cfn-securityhub-automationrule-relatedfinding-productarn)
       */
      override fun productArn(): String = unwrap(this).getProductArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelatedFindingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty):
          RelatedFindingProperty = CdkObjectWrappers.wrap(cdkObject) as? RelatedFindingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelatedFindingProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.RelatedFindingProperty
    }
  }

  /**
   * Updates to the severity information for a finding.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * SeverityUpdateProperty severityUpdateProperty = SeverityUpdateProperty.builder()
   * .label("label")
   * .normalized(123)
   * .product(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html)
   */
  public interface SeverityUpdateProperty {
    /**
     * The severity value of the finding. The allowed values are the following.
     *
     * * `INFORMATIONAL` - No issue was found.
     * * `LOW` - The issue does not require action on its own.
     * * `MEDIUM` - The issue must be addressed but not urgently.
     * * `HIGH` - The issue must be addressed as a priority.
     * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-label)
     */
    public fun label(): String? = unwrap(this).getLabel()

    /**
     * The normalized severity for the finding. This attribute is to be deprecated in favor of
     * `Label` .
     *
     * If you provide `Normalized` and do not provide `Label` , `Label` is set automatically as
     * follows.
     *
     * * 0 - `INFORMATIONAL`
     * * 1–39 - `LOW`
     * * 40–69 - `MEDIUM`
     * * 70–89 - `HIGH`
     * * 90–100 - `CRITICAL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-normalized)
     */
    public fun normalized(): Number? = unwrap(this).getNormalized()

    /**
     * The native severity as defined by the AWS service or integrated partner product that
     * generated the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-product)
     */
    public fun product(): Number? = unwrap(this).getProduct()

    /**
     * A builder for [SeverityUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param label The severity value of the finding. The allowed values are the following.
       * * `INFORMATIONAL` - No issue was found.
       * * `LOW` - The issue does not require action on its own.
       * * `MEDIUM` - The issue must be addressed but not urgently.
       * * `HIGH` - The issue must be addressed as a priority.
       * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
       */
      public fun label(label: String)

      /**
       * @param normalized The normalized severity for the finding. This attribute is to be
       * deprecated in favor of `Label` .
       * If you provide `Normalized` and do not provide `Label` , `Label` is set automatically as
       * follows.
       *
       * * 0 - `INFORMATIONAL`
       * * 1–39 - `LOW`
       * * 40–69 - `MEDIUM`
       * * 70–89 - `HIGH`
       * * 90–100 - `CRITICAL`
       */
      public fun normalized(normalized: Number)

      /**
       * @param product The native severity as defined by the AWS service or integrated partner
       * product that generated the finding.
       */
      public fun product(product: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty.builder()

      /**
       * @param label The severity value of the finding. The allowed values are the following.
       * * `INFORMATIONAL` - No issue was found.
       * * `LOW` - The issue does not require action on its own.
       * * `MEDIUM` - The issue must be addressed but not urgently.
       * * `HIGH` - The issue must be addressed as a priority.
       * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      /**
       * @param normalized The normalized severity for the finding. This attribute is to be
       * deprecated in favor of `Label` .
       * If you provide `Normalized` and do not provide `Label` , `Label` is set automatically as
       * follows.
       *
       * * 0 - `INFORMATIONAL`
       * * 1–39 - `LOW`
       * * 40–69 - `MEDIUM`
       * * 70–89 - `HIGH`
       * * 90–100 - `CRITICAL`
       */
      override fun normalized(normalized: Number) {
        cdkBuilder.normalized(normalized)
      }

      /**
       * @param product The native severity as defined by the AWS service or integrated partner
       * product that generated the finding.
       */
      override fun product(product: Number) {
        cdkBuilder.product(product)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty,
    ) : CdkObject(cdkObject),
        SeverityUpdateProperty {
      /**
       * The severity value of the finding. The allowed values are the following.
       *
       * * `INFORMATIONAL` - No issue was found.
       * * `LOW` - The issue does not require action on its own.
       * * `MEDIUM` - The issue must be addressed but not urgently.
       * * `HIGH` - The issue must be addressed as a priority.
       * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-label)
       */
      override fun label(): String? = unwrap(this).getLabel()

      /**
       * The normalized severity for the finding. This attribute is to be deprecated in favor of
       * `Label` .
       *
       * If you provide `Normalized` and do not provide `Label` , `Label` is set automatically as
       * follows.
       *
       * * 0 - `INFORMATIONAL`
       * * 1–39 - `LOW`
       * * 40–69 - `MEDIUM`
       * * 70–89 - `HIGH`
       * * 90–100 - `CRITICAL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-normalized)
       */
      override fun normalized(): Number? = unwrap(this).getNormalized()

      /**
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html#cfn-securityhub-automationrule-severityupdate-product)
       */
      override fun product(): Number? = unwrap(this).getProduct()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SeverityUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty):
          SeverityUpdateProperty = CdkObjectWrappers.wrap(cdkObject) as? SeverityUpdateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SeverityUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.SeverityUpdateProperty
    }
  }

  /**
   * A string filter for filtering AWS Security Hub findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html)
   */
  public interface StringFilterProperty {
    /**
     * The condition to apply to a string value when filtering Security Hub findings.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, the
     * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the string
     * CloudFront.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
     * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
     * `123456789012` .
     * * To search for values that start with the filter value, use `PREFIX` . For example, the
     * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts with
     * `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or `ca` ,
     * doesn't match.
     *
     * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A finding
     * matches if it matches any one of those filters. For example, the filters `Title CONTAINS
     * CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either `CloudFront` ,
     * `CloudWatch` , or both strings in the title.
     *
     * To search for values that don’t have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
     * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
     * string CloudFront.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
     * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
     * other than `123456789012` .
     * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` . For
     * example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
     * `ResourceRegion` that starts with a value other than `us` .
     *
     * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are joined
     * by `AND` . A finding matches only if it matches all of those filters. For example, the filters
     * `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that excludes
     * both `CloudFront` and `CloudWatch` in the title.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
     * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters can
     * only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with other
     * `NOT_CONTAINS` filters.
     *
     * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
     * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
     * `PREFIX_NOT_EQUALS` filters.
     *
     * For example, for the following filters, Security Hub first identifies findings that have
     * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that have
     * a resource type of `AwsIamPolicy` and findings that have a resource type of
     * `AwsEc2NetworkInterface` .
     *
     * * `ResourceType PREFIX AwsIam`
     * * `ResourceType PREFIX AwsEc2`
     * * `ResourceType NOT_EQUALS AwsIamPolicy`
     * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
     * information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html#cfn-securityhub-automationrule-stringfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The string filter value.
     *
     * Filter values are case sensitive. For example, the product name for control-based findings is
     * `Security Hub` . If you provide `security hub` as the filter value, there's no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html#cfn-securityhub-automationrule-stringfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [StringFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty.builder()

      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty,
    ) : CdkObject(cdkObject),
        StringFilterProperty {
      /**
       * The condition to apply to a string value when filtering Security Hub findings.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html#cfn-securityhub-automationrule-stringfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The string filter value.
       *
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html#cfn-securityhub-automationrule-stringfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty):
          StringFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? StringFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.StringFilterProperty
    }
  }

  /**
   * Used to update information about the investigation into the finding.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * WorkflowUpdateProperty workflowUpdateProperty = WorkflowUpdateProperty.builder()
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-workflowupdate.html)
   */
  public interface WorkflowUpdateProperty {
    /**
     * The status of the investigation into the finding.
     *
     * The workflow status is specific to an individual finding. It does not affect the generation
     * of new findings. For example, setting the workflow status to `SUPPRESSED` or `RESOLVED` does not
     * prevent a new finding for the same issue.
     *
     * The allowed values are the following.
     *
     * * `NEW` - The initial state of a finding, before it is reviewed.
     *
     * Security Hub also resets `WorkFlowStatus` from `NOTIFIED` or `RESOLVED` to `NEW` in the
     * following cases:
     *
     * * The record state changes from `ARCHIVED` to `ACTIVE` .
     * * The compliance status changes from `PASSED` to either `WARNING` , `FAILED` , or
     * `NOT_AVAILABLE` .
     * * `NOTIFIED` - Indicates that you notified the resource owner about the security issue. Used
     * when the initial reviewer is not the resource owner, and needs intervention from the resource
     * owner.
     * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
     * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
     * is needed. The finding is no longer updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-workflowupdate.html#cfn-securityhub-automationrule-workflowupdate-status)
     */
    public fun status(): String

    /**
     * A builder for [WorkflowUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of the investigation into the finding. 
       * The workflow status is specific to an individual finding. It does not affect the generation
       * of new findings. For example, setting the workflow status to `SUPPRESSED` or `RESOLVED` does
       * not prevent a new finding for the same issue.
       *
       * The allowed values are the following.
       *
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets `WorkFlowStatus` from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * The record state changes from `ARCHIVED` to `ACTIVE` .
       * * The compliance status changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that you notified the resource owner about the security issue.
       * Used when the initial reviewer is not the resource owner, and needs intervention from the
       * resource owner.
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed. The finding is no longer updated.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty.builder()

      /**
       * @param status The status of the investigation into the finding. 
       * The workflow status is specific to an individual finding. It does not affect the generation
       * of new findings. For example, setting the workflow status to `SUPPRESSED` or `RESOLVED` does
       * not prevent a new finding for the same issue.
       *
       * The allowed values are the following.
       *
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets `WorkFlowStatus` from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * The record state changes from `ARCHIVED` to `ACTIVE` .
       * * The compliance status changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that you notified the resource owner about the security issue.
       * Used when the initial reviewer is not the resource owner, and needs intervention from the
       * resource owner.
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed. The finding is no longer updated.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty,
    ) : CdkObject(cdkObject),
        WorkflowUpdateProperty {
      /**
       * The status of the investigation into the finding.
       *
       * The workflow status is specific to an individual finding. It does not affect the generation
       * of new findings. For example, setting the workflow status to `SUPPRESSED` or `RESOLVED` does
       * not prevent a new finding for the same issue.
       *
       * The allowed values are the following.
       *
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets `WorkFlowStatus` from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * The record state changes from `ARCHIVED` to `ACTIVE` .
       * * The compliance status changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that you notified the resource owner about the security issue.
       * Used when the initial reviewer is not the resource owner, and needs intervention from the
       * resource owner.
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed. The finding is no longer updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-workflowupdate.html#cfn-securityhub-automationrule-workflowupdate-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty):
          WorkflowUpdateProperty = CdkObjectWrappers.wrap(cdkObject) as? WorkflowUpdateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowUpdateProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRule.WorkflowUpdateProperty
    }
  }
}
