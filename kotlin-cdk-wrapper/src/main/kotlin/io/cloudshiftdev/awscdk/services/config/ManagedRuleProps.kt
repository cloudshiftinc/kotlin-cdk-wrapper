@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construction properties for a ManagedRule.
 *
 * Example:
 *
 * ```
 * Function fn;
 * String samplePolicyText;
 * ManagedRule.Builder.create(this, "ManagedRule")
 * .identifier(ManagedRuleIdentifiers.API_GW_XRAY_ENABLED)
 * .evaluationModes(EvaluationMode.DETECTIVE_AND_PROACTIVE)
 * .build();
 * CustomRule.Builder.create(this, "CustomRule")
 * .lambdaFunction(fn)
 * .evaluationModes(EvaluationMode.PROACTIVE)
 * .build();
 * CustomPolicy.Builder.create(this, "CustomPolicy")
 * .policyText(samplePolicyText)
 * .evaluationModes(EvaluationMode.DETECTIVE)
 * .build();
 * ```
 */
public interface ManagedRuleProps : RuleProps {
  /**
   * The identifier of the AWS managed rule.
   *
   * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
   */
  public fun identifier(): String

  /**
   * A builder for [ManagedRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String)

    /**
     * @param description A description about this AWS Config rule.
     */
    public fun description(description: String)

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects.
     */
    public fun evaluationModes(evaluationModes: EvaluationMode)

    /**
     * @param identifier The identifier of the AWS managed rule. 
     */
    public fun identifier(identifier: String)

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.ManagedRuleProps.Builder =
        software.amazon.awscdk.services.config.ManagedRuleProps.builder()

    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * @param description A description about this AWS Config rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param evaluationModes The modes the AWS Config rule can be evaluated in.
     * The valid values are distinct objects.
     */
    override fun evaluationModes(evaluationModes: EvaluationMode) {
      cdkBuilder.evaluationModes(evaluationModes.let(EvaluationMode.Companion::unwrap))
    }

    /**
     * @param identifier The identifier of the AWS managed rule. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency.Companion::unwrap))
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.ManagedRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.ManagedRuleProps,
  ) : CdkObject(cdkObject),
      ManagedRuleProps {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     */
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects.
     *
     * Default: - Detective evaluation mode only
     */
    override fun evaluationModes(): EvaluationMode? =
        unwrap(this).getEvaluationModes()?.let(EvaluationMode::wrap)

    /**
     * The identifier of the AWS managed rule.
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     */
    override fun identifier(): String = unwrap(this).getIdentifier()

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     */
    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     */
    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     */
    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ManagedRuleProps):
        ManagedRuleProps = CdkObjectWrappers.wrap(cdkObject) as? ManagedRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedRuleProps):
        software.amazon.awscdk.services.config.ManagedRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.config.ManagedRuleProps
  }
}
