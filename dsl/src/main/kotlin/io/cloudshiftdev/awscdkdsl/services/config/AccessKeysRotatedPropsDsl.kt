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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope

/**
 * Construction properties for a AccessKeysRotated.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.config.*;
 * Object inputParameters;
 * RuleScope ruleScope;
 * AccessKeysRotatedProps accessKeysRotatedProps = AccessKeysRotatedProps.builder()
 * .configRuleName("configRuleName")
 * .description("description")
 * .inputParameters(Map.of(
 * "inputParametersKey", inputParameters))
 * .maxAge(Duration.minutes(30))
 * .maximumExecutionFrequency(MaximumExecutionFrequency.ONE_HOUR)
 * .ruleScope(ruleScope)
 * .build();
 * ```
 */
@CdkDslMarker
public class AccessKeysRotatedPropsDsl {
    private val cdkBuilder: AccessKeysRotatedProps.Builder = AccessKeysRotatedProps.builder()

    /** @param configRuleName A name for the AWS Config rule. */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /** @param description A description about this AWS Config rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /** @param maxAge The maximum number of days within which the access keys must be rotated. */
    public fun maxAge(maxAge: Duration) {
        cdkBuilder.maxAge(maxAge)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     *   evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /** @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. */
    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    public fun build(): AccessKeysRotatedProps = cdkBuilder.build()
}
