@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAutomationRuleV2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnAutomationRuleV2Props cfnAutomationRuleV2Props = CfnAutomationRuleV2Props.builder()
 * .actions(List.of(AutomationRulesActionV2Property.builder()
 * .type("type")
 * // the properties below are optional
 * .externalIntegrationConfiguration(ExternalIntegrationConfigurationProperty.builder()
 * .connectorArn("connectorArn")
 * .build())
 * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateV2Property.builder()
 * .comment("comment")
 * .severityId(123)
 * .statusId(123)
 * .build())
 * .build()))
 * .criteria(CriteriaProperty.builder()
 * .ocsfFindingCriteria(OcsfFindingFiltersProperty.builder()
 * .compositeFilters(List.of(CompositeFilterProperty.builder()
 * .booleanFilters(List.of(OcsfBooleanFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(BooleanFilterProperty.builder()
 * .value(false)
 * .build())
 * .build()))
 * .dateFilters(List.of(OcsfDateFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build())
 * .build()))
 * .mapFilters(List.of(OcsfMapFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build())
 * .build()))
 * .numberFilters(List.of(OcsfNumberFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build())
 * .build()))
 * .operator("operator")
 * .stringFilters(List.of(OcsfStringFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * .compositeOperator("compositeOperator")
 * .build())
 * .build())
 * .description("description")
 * .ruleName("ruleName")
 * .ruleOrder(123)
 * // the properties below are optional
 * .ruleStatus("ruleStatus")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html)
 */
public interface CfnAutomationRuleV2Props {
  /**
   * A list of actions to be performed when the rule criteria is met.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
   */
  public fun actions(): Any

  /**
   * The filtering type and configuration of the automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
   */
  public fun criteria(): Any

  /**
   * A description of the V2 automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-description)
   */
  public fun description(): String

  /**
   * The name of the V2 automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulename)
   */
  public fun ruleName(): String

  /**
   * The value for the rule priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-ruleorder)
   */
  public fun ruleOrder(): Number

  /**
   * The status of the V2 automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulestatus)
   */
  public fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  /**
   * A list of key-value pairs associated with the V2 automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAutomationRuleV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(vararg actions: Any)

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    public fun criteria(criteria: IResolvable)

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    public fun criteria(criteria: CfnAutomationRuleV2.CriteriaProperty)

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74e0f2671be0f1d1a15cdb44c6f40b8a7fd331b8b10c18f70f4522879e4ec366")
    public fun criteria(criteria: CfnAutomationRuleV2.CriteriaProperty.Builder.() -> Unit)

    /**
     * @param description A description of the V2 automation rule. 
     */
    public fun description(description: String)

    /**
     * @param ruleName The name of the V2 automation rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * @param ruleOrder The value for the rule priority. 
     */
    public fun ruleOrder(ruleOrder: Number)

    /**
     * @param ruleStatus The status of the V2 automation rule.
     */
    public fun ruleStatus(ruleStatus: String)

    /**
     * @param tags A list of key-value pairs associated with the V2 automation rule.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props.Builder =
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props.builder()

    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    override fun criteria(criteria: CfnAutomationRuleV2.CriteriaProperty) {
      cdkBuilder.criteria(criteria.let(CfnAutomationRuleV2.CriteriaProperty.Companion::unwrap))
    }

    /**
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74e0f2671be0f1d1a15cdb44c6f40b8a7fd331b8b10c18f70f4522879e4ec366")
    override fun criteria(criteria: CfnAutomationRuleV2.CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CfnAutomationRuleV2.CriteriaProperty(criteria))

    /**
     * @param description A description of the V2 automation rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ruleName The name of the V2 automation rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param ruleOrder The value for the rule priority. 
     */
    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    /**
     * @param ruleStatus The status of the V2 automation rule.
     */
    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    /**
     * @param tags A list of key-value pairs associated with the V2 automation rule.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props,
  ) : CdkObject(cdkObject),
      CfnAutomationRuleV2Props {
    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     */
    override fun criteria(): Any = unwrap(this).getCriteria()

    /**
     * A description of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The name of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulename)
     */
    override fun ruleName(): String = unwrap(this).getRuleName()

    /**
     * The value for the rule priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-ruleorder)
     */
    override fun ruleOrder(): Number = unwrap(this).getRuleOrder()

    /**
     * The status of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulestatus)
     */
    override fun ruleStatus(): String? = unwrap(this).getRuleStatus()

    /**
     * A list of key-value pairs associated with the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutomationRuleV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props):
        CfnAutomationRuleV2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnAutomationRuleV2Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRuleV2Props):
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props
  }
}
