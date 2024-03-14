package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnAutomationRuleProps {
  /**
   * One or more actions to update finding fields if a finding matches the conditions specified in
   * `Criteria` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
   */
  public fun actions(): Any? = unwrap(this).getActions()

  /**
   * A set of [AWS Security Finding Format
   * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
   * Security Hub applies the rule action to the finding.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
   */
  public fun criteria(): Any? = unwrap(this).getCriteria()

  /**
   * A description of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun isTerminal(): Any? = unwrap(this).getIsTerminal()

  /**
   * The name of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulename)
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied
   * to findings.
   *
   * Security Hub applies rules with lower values for this parameter first.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-ruleorder)
   */
  public fun ruleOrder(): Number? = unwrap(this).getRuleOrder()

  /**
   * Whether the rule is active after it is created.
   *
   * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and finding
   * updates after the rule is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulestatus)
   */
  public fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  /**
   * User-defined tags associated with an automation rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAutomationRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    public fun actions(vararg actions: Any)

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    public fun criteria(criteria: IResolvable)

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    public fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty)

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b9fe65b2e87ea5657062360d44aa3b6c19213761055e0c7f0e2bedd11f44552")
    public
        fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder.() -> Unit)

    /**
     * @param description A description of the rule.
     */
    public fun description(description: String)

    /**
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria.
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     */
    public fun isTerminal(isTerminal: Boolean)

    /**
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria.
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     */
    public fun isTerminal(isTerminal: IResolvable)

    /**
     * @param ruleName The name of the rule.
     */
    public fun ruleName(ruleName: String)

    /**
     * @param ruleOrder An integer ranging from 1 to 1000 that represents the order in which the
     * rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     */
    public fun ruleOrder(ruleOrder: Number)

    /**
     * @param ruleStatus Whether the rule is active after it is created.
     * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and
     * finding updates after the rule is created.
     */
    public fun ruleStatus(ruleStatus: String)

    /**
     * @param tags User-defined tags associated with an automation rule.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps.builder()

    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions One or more actions to update finding fields if a finding matches the
     * conditions specified in `Criteria` .
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
    }

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    override fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty) {
      cdkBuilder.criteria(criteria.let(CfnAutomationRule.AutomationRulesFindingFiltersProperty::unwrap))
    }

    /**
     * @param criteria A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b9fe65b2e87ea5657062360d44aa3b6c19213761055e0c7f0e2bedd11f44552")
    override
        fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder.() -> Unit):
        Unit = criteria(CfnAutomationRule.AutomationRulesFindingFiltersProperty(criteria))

    /**
     * @param description A description of the rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria.
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     */
    override fun isTerminal(isTerminal: Boolean) {
      cdkBuilder.isTerminal(isTerminal)
    }

    /**
     * @param isTerminal Specifies whether a rule is the last to be applied with respect to a
     * finding that matches the rule criteria.
     * This is useful when a finding matches the criteria for multiple rules, and each rule has
     * different actions. If a rule is terminal, Security Hub applies the rule action to a finding that
     * matches the rule criteria and doesn't evaluate other rules for the finding. By default, a rule
     * isn't terminal.
     */
    override fun isTerminal(isTerminal: IResolvable) {
      cdkBuilder.isTerminal(isTerminal.let(IResolvable::unwrap))
    }

    /**
     * @param ruleName The name of the rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param ruleOrder An integer ranging from 1 to 1000 that represents the order in which the
     * rule action is applied to findings.
     * Security Hub applies rules with lower values for this parameter first.
     */
    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    /**
     * @param ruleStatus Whether the rule is active after it is created.
     * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and
     * finding updates after the rule is created.
     */
    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    /**
     * @param tags User-defined tags associated with an automation rule.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps,
  ) : CdkObject(cdkObject), CfnAutomationRuleProps {
    /**
     * One or more actions to update finding fields if a finding matches the conditions specified in
     * `Criteria` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
     */
    override fun actions(): Any? = unwrap(this).getActions()

    /**
     * A set of [AWS Security Finding Format
     * (ASFF)](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
     * finding field attributes and corresponding expected values that Security Hub uses to filter
     * findings. If a rule is enabled and a finding matches the criteria specified in this parameter,
     * Security Hub applies the rule action to the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
     */
    override fun criteria(): Any? = unwrap(this).getCriteria()

    /**
     * A description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun isTerminal(): Any? = unwrap(this).getIsTerminal()

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulename)
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * An integer ranging from 1 to 1000 that represents the order in which the rule action is
     * applied to findings.
     *
     * Security Hub applies rules with lower values for this parameter first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-ruleorder)
     */
    override fun ruleOrder(): Number? = unwrap(this).getRuleOrder()

    /**
     * Whether the rule is active after it is created.
     *
     * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and
     * finding updates after the rule is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulestatus)
     */
    override fun ruleStatus(): String? = unwrap(this).getRuleStatus()

    /**
     * User-defined tags associated with an automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutomationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps):
        CfnAutomationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRuleProps):
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps
  }
}
