package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CloudFormationStackDriftDetectionCheck internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck,
) : ManagedRule(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.config.CloudFormationStackDriftDetectionCheck].
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
     * Whether to check only the stack where this rule is deployed.
     *
     * Default: false
     *
     * @param ownStackOnly Whether to check only the stack where this rule is deployed. 
     */
    public fun ownStackOnly(ownStackOnly: Boolean)

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
     *
     * @param role The IAM role to use for this rule. 
     */
    public fun role(role: IRole)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck.Builder.create(scope,
        id)

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
     * Whether to check only the stack where this rule is deployed.
     *
     * Default: false
     *
     * @param ownStackOnly Whether to check only the stack where this rule is deployed. 
     */
    override fun ownStackOnly(ownStackOnly: Boolean) {
      cdkBuilder.ownStackOnly(ownStackOnly)
    }

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
     *
     * @param role The IAM role to use for this rule. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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

    public fun build():
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationStackDriftDetectionCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFormationStackDriftDetectionCheck(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck):
        CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackDriftDetectionCheck):
        software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck =
        wrapped.cdkObject
  }
}
