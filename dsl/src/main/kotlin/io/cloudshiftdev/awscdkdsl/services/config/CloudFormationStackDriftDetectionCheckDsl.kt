@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Checks whether your CloudFormation stacks' actual configuration differs, or has drifted, from its
 * expected configuration.
 *
 * Example:
 * ```
 * // Topic to which compliance notification events will be published
 * Topic complianceTopic = new Topic(this, "ComplianceTopic");
 * CloudFormationStackDriftDetectionCheck rule = new CloudFormationStackDriftDetectionCheck(this,
 * "Drift");
 * rule.onComplianceChange("TopicEvent", OnEventOptions.builder()
 * .target(new SnsTopic(complianceTopic))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/cloudformation-stack-drift-detection-check.html)
 */
@CdkDslMarker
public class CloudFormationStackDriftDetectionCheckDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CloudFormationStackDriftDetectionCheck.Builder =
        CloudFormationStackDriftDetectionCheck.Builder.create(scope, id)

    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     *   evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * Whether to check only the stack where this rule is deployed.
     *
     * Default: false
     *
     * @param ownStackOnly Whether to check only the stack where this rule is deployed.
     */
    public fun ownStackOnly(ownStackOnly: Boolean) {
        cdkBuilder.ownStackOnly(ownStackOnly)
    }

    /**
     * The IAM role to use for this rule.
     *
     * It must have permissions to detect drift for AWS CloudFormation stacks. Ensure to attach
     * `config.amazonaws.com` trusted permissions and `ReadOnlyAccess` policy permissions. For
     * specific policy permissions, refer to
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
     *
     * Default: - A role will be created
     *
     * @param role The IAM role to use for this rule.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    public fun build(): CloudFormationStackDriftDetectionCheck = cdkBuilder.build()
}
