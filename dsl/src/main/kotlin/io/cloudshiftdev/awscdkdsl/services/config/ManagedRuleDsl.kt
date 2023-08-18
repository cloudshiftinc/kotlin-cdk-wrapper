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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.constructs.Construct

/**
 * A new managed rule.
 *
 * Example:
 * ```
 * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
 * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
 * ManagedRule.Builder.create(this, "AccessKeysRotated")
 * .identifier(ManagedRuleIdentifiers.ACCESS_KEYS_ROTATED)
 * .inputParameters(Map.of(
 * "maxAccessKeyAge", 60))
 * // default is 24 hours
 * .maximumExecutionFrequency(MaximumExecutionFrequency.TWELVE_HOURS)
 * .build();
 * ```
 */
@CdkDslMarker
public class ManagedRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ManagedRule.Builder = ManagedRule.Builder.create(scope, id)

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
     * The identifier of the AWS managed rule.
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     *
     * @param identifier The identifier of the AWS managed rule.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
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

    public fun build(): ManagedRule = cdkBuilder.build()
}
