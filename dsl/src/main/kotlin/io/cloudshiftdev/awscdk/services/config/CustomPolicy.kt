package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CustomPolicy,
) : Resource(cdkObject), IRule {
  /**
   * The arn of the rule.
   */
  public open fun configRuleArn(): String = unwrap(this).getConfigRuleArn()

  /**
   * The compliance status of the rule.
   */
  public open fun configRuleComplianceType(): String = unwrap(this).getConfigRuleComplianceType()

  /**
   * The id of the rule.
   */
  public open fun configRuleId(): String = unwrap(this).getConfigRuleId()

  /**
   * The name of the rule.
   */
  public override fun configRuleName(): String = unwrap(this).getConfigRuleName()

  /**
   * Defines an EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  public override fun onComplianceChange(id: String): Rule =
      unwrap(this).onComplianceChange(id).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  public override fun onComplianceChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onComplianceChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
  public override fun onComplianceChange(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onComplianceChange(id, OnEventOptions(options))

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  /**
   * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  public override fun onReEvaluationStatus(id: String): Rule =
      unwrap(this).onReEvaluationStatus(id).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  public override fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReEvaluationStatus(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
  public override fun onReEvaluationStatus(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReEvaluationStatus(id, OnEventOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CustomPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    public fun description(description: String)

    /**
     * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
     *
     * Default: false
     *
     * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
     * Custom Policy rule. 
     */
    public fun enableDebugLog(enableDebugLog: Boolean)

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations. 
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * The policy definition containing the logic for your AWS Config Custom Policy rule.
     *
     * @param policyText The policy definition containing the logic for your AWS Config Custom
     * Policy rule. 
     */
    public fun policyText(policyText: String)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomPolicy.Builder =
        software.amazon.awscdk.services.config.CustomPolicy.Builder.create(scope, id)

    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
     *
     * Default: false
     *
     * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
     * Custom Policy rule. 
     */
    override fun enableDebugLog(enableDebugLog: Boolean) {
      cdkBuilder.enableDebugLog(enableDebugLog)
    }

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations. 
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    /**
     * The policy definition containing the logic for your AWS Config Custom Policy rule.
     *
     * @param policyText The policy definition containing the logic for your AWS Config Custom
     * Policy rule. 
     */
    override fun policyText(policyText: String) {
      cdkBuilder.policyText(policyText)
    }

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CustomPolicy = cdkBuilder.build()
  }

  public companion object {
    public fun fromConfigRuleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configRuleName: String,
    ): IRule =
        software.amazon.awscdk.services.config.CustomPolicy.fromConfigRuleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, configRuleName).let(IRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomPolicy): CustomPolicy
        = CustomPolicy(cdkObject)

    internal fun unwrap(wrapped: CustomPolicy): software.amazon.awscdk.services.config.CustomPolicy
        = wrapped.cdkObject
  }
}