@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construction properties for a CustomPolicy.
 *
 * Example:
 *
 * ```
 * String samplePolicyText = "\n# This rule checks if point in time recovery (PITR) is enabled on
 * active Amazon DynamoDB tables\nlet status = ['ACTIVE']\n\nrule tableisactive when\n    resourceType
 * == \"AWS::DynamoDB::Table\" {\n    configuration.tableStatus == %status\n}\n\nrule checkcompliance
 * when\n    resourceType == \"AWS::DynamoDB::Table\"\n    tableisactive {\n        let pitr =
 * supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus\n
 *        %pitr == \"ENABLED\"\n}\n";
 * CustomPolicy.Builder.create(this, "Custom")
 * .policyText(samplePolicyText)
 * .enableDebugLog(true)
 * .ruleScope(RuleScope.fromResources(List.of(ResourceType.DYNAMODB_TABLE)))
 * .build();
 * ```
 */
public interface CustomPolicyProps : RuleProps {
  /**
   * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
   *
   * Default: false
   */
  public fun enableDebugLog(): Boolean? = unwrap(this).getEnableDebugLog()

  /**
   * The policy definition containing the logic for your AWS Config Custom Policy rule.
   */
  public fun policyText(): String

  /**
   * A builder for [CustomPolicyProps]
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
     * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
     * Custom Policy rule.
     */
    public fun enableDebugLog(enableDebugLog: Boolean)

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
     * @param policyText The policy definition containing the logic for your AWS Config Custom
     * Policy rule. 
     */
    public fun policyText(policyText: String)

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CustomPolicyProps.Builder =
        software.amazon.awscdk.services.config.CustomPolicyProps.builder()

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
     * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
     * Custom Policy rule.
     */
    override fun enableDebugLog(enableDebugLog: Boolean) {
      cdkBuilder.enableDebugLog(enableDebugLog)
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
     * @param policyText The policy definition containing the logic for your AWS Config Custom
     * Policy rule. 
     */
    override fun policyText(policyText: String) {
      cdkBuilder.policyText(policyText)
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CustomPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CustomPolicyProps,
  ) : CdkObject(cdkObject), CustomPolicyProps {
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
     * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
     *
     * Default: false
     */
    override fun enableDebugLog(): Boolean? = unwrap(this).getEnableDebugLog()

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
     * The policy definition containing the logic for your AWS Config Custom Policy rule.
     */
    override fun policyText(): String = unwrap(this).getPolicyText()

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     */
    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CustomPolicyProps):
        CustomPolicyProps = CdkObjectWrappers.wrap(cdkObject) as CustomPolicyProps

    internal fun unwrap(wrapped: CustomPolicyProps):
        software.amazon.awscdk.services.config.CustomPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.config.CustomPolicyProps
  }
}
