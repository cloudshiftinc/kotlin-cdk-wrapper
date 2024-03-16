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
 * Construction properties for a new rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * Object inputParameters;
 * RuleScope ruleScope;
 * RuleProps ruleProps = RuleProps.builder()
 * .configRuleName("configRuleName")
 * .description("description")
 * .inputParameters(Map.of(
 * "inputParametersKey", inputParameters))
 * .maximumExecutionFrequency(MaximumExecutionFrequency.ONE_HOUR)
 * .ruleScope(ruleScope)
 * .build();
 * ```
 */
public interface RuleProps {
  /**
   * A name for the AWS Config rule.
   *
   * Default: - CloudFormation generated name
   */
  public fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  /**
   * A description about this AWS Config rule.
   *
   * Default: - No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Input parameter values that are passed to the AWS Config rule.
   *
   * Default: - No input parameters
   */
  public fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?: emptyMap()

  /**
   * The maximum frequency at which the AWS Config rule runs evaluations.
   *
   * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
   */
  public fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
      unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

  /**
   * Defines which resources trigger an evaluation for an AWS Config rule.
   *
   * Default: - evaluations for the rule are triggered when any resource in the recording group
   * changes.
   */
  public fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)

  /**
   * A builder for [RuleProps]
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
    private val cdkBuilder: software.amazon.awscdk.services.config.RuleProps.Builder =
        software.amazon.awscdk.services.config.RuleProps.builder()

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
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.RuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.RuleProps,
  ) : CdkObject(cdkObject), RuleProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.RuleProps): RuleProps =
        CdkObjectWrappers.wrap(cdkObject) as RuleProps

    internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.config.RuleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.config.RuleProps
  }
}
