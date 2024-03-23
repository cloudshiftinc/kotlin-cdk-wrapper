@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construction properties for a CustomRule.
 *
 * Example:
 *
 * ```
 * // Lambda function containing logic that evaluates compliance with the rule.
 * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
 * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * // A custom rule that runs on configuration changes of EC2 instances
 * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
 * .configurationChanges(true)
 * .lambdaFunction(evalComplianceFn)
 * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
 * .build();
 * ```
 */
public interface CustomRuleProps : RuleProps {
  /**
   * Whether to run the rule on configuration changes.
   *
   * Default: false
   */
  public fun configurationChanges(): Boolean? = unwrap(this).getConfigurationChanges()

  /**
   * The Lambda function to run.
   */
  public fun lambdaFunction(): IFunction

  /**
   * Whether to run the rule on a fixed frequency.
   *
   * Default: false
   */
  public fun periodic(): Boolean? = unwrap(this).getPeriodic()

  /**
   * A builder for [CustomRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String)

    /**
     * @param configurationChanges Whether to run the rule on configuration changes.
     */
    public fun configurationChanges(configurationChanges: Boolean)

    /**
     * @param description A description about this AWS Config rule.
     */
    public fun description(description: String)

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * @param lambdaFunction The Lambda function to run. 
     */
    public fun lambdaFunction(lambdaFunction: IFunction)

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * @param periodic Whether to run the rule on a fixed frequency.
     */
    public fun periodic(periodic: Boolean)

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomRuleProps.Builder =
        software.amazon.awscdk.services.config.CustomRuleProps.builder()

    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * @param configurationChanges Whether to run the rule on configuration changes.
     */
    override fun configurationChanges(configurationChanges: Boolean) {
      cdkBuilder.configurationChanges(configurationChanges)
    }

    /**
     * @param description A description about this AWS Config rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param lambdaFunction The Lambda function to run. 
     */
    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    /**
     * @param periodic Whether to run the rule on a fixed frequency.
     */
    override fun periodic(periodic: Boolean) {
      cdkBuilder.periodic(periodic)
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CustomRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.CustomRuleProps,
  ) : CdkObject(cdkObject), CustomRuleProps {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     */
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    /**
     * Whether to run the rule on configuration changes.
     *
     * Default: false
     */
    override fun configurationChanges(): Boolean? = unwrap(this).getConfigurationChanges()

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     */
    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    /**
     * The Lambda function to run.
     */
    override fun lambdaFunction(): IFunction = unwrap(this).getLambdaFunction().let(IFunction::wrap)

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     */
    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    /**
     * Whether to run the rule on a fixed frequency.
     *
     * Default: false
     */
    override fun periodic(): Boolean? = unwrap(this).getPeriodic()

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     */
    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomRuleProps):
        CustomRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CustomRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomRuleProps):
        software.amazon.awscdk.services.config.CustomRuleProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CustomRuleProps
  }
}
