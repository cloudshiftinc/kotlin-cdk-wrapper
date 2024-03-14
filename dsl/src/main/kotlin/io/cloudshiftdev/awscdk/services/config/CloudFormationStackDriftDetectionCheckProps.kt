package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CloudFormationStackDriftDetectionCheckProps : RuleProps {
  /**
   * Whether to check only the stack where this rule is deployed.
   *
   * Default: false
   */
  public fun ownStackOnly(): Boolean? = unwrap(this).getOwnStackOnly()

  /**
   * The IAM role to use for this rule.
   *
   * It must have permissions to detect drift
   * for AWS CloudFormation stacks. Ensure to attach `config.amazonaws.com` trusted
   * permissions and `ReadOnlyAccess` policy permissions. For specific policy permissions,
   * refer to
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
   *
   * Default: - A role will be created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [CloudFormationStackDriftDetectionCheckProps]
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
     * @param ownStackOnly Whether to check only the stack where this rule is deployed.
     */
    public fun ownStackOnly(ownStackOnly: Boolean)

    /**
     * @param role The IAM role to use for this rule.
     * It must have permissions to detect drift
     * for AWS CloudFormation stacks. Ensure to attach `config.amazonaws.com` trusted
     * permissions and `ReadOnlyAccess` policy permissions. For specific policy permissions,
     * refer to
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
     */
    public fun role(role: IRole)

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps.builder()

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
     * @param ownStackOnly Whether to check only the stack where this rule is deployed.
     */
    override fun ownStackOnly(ownStackOnly: Boolean) {
      cdkBuilder.ownStackOnly(ownStackOnly)
    }

    /**
     * @param role The IAM role to use for this rule.
     * It must have permissions to detect drift
     * for AWS CloudFormation stacks. Ensure to attach `config.amazonaws.com` trusted
     * permissions and `ReadOnlyAccess` policy permissions. For specific policy permissions,
     * refer to
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps,
  ) : CdkObject(cdkObject), CloudFormationStackDriftDetectionCheckProps {
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
     * Whether to check only the stack where this rule is deployed.
     *
     * Default: false
     */
    override fun ownStackOnly(): Boolean? = unwrap(this).getOwnStackOnly()

    /**
     * The IAM role to use for this rule.
     *
     * It must have permissions to detect drift
     * for AWS CloudFormation stacks. Ensure to attach `config.amazonaws.com` trusted
     * permissions and `ReadOnlyAccess` policy permissions. For specific policy permissions,
     * refer to
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
     *
     * Default: - A role will be created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     */
    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationStackDriftDetectionCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps):
        CloudFormationStackDriftDetectionCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackDriftDetectionCheckProps):
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
  }
}
