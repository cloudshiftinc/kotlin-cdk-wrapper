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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/**
 * An object containing `RuleName` , and `MatchingKeys` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * RuleProperty ruleProperty = RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowRulePropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.RuleProperty.Builder =
        CfnMatchingWorkflow.RuleProperty.builder()

    private val _matchingKeys: MutableList<String> = mutableListOf()

    /**
     * @param matchingKeys A list of `MatchingKeys` . The `MatchingKeys` must have been defined in
     *   the `SchemaMapping` . Two records are considered to match according to this rule if all of
     *   the `MatchingKeys` match.
     */
    public fun matchingKeys(vararg matchingKeys: String) {
        _matchingKeys.addAll(listOf(*matchingKeys))
    }

    /**
     * @param matchingKeys A list of `MatchingKeys` . The `MatchingKeys` must have been defined in
     *   the `SchemaMapping` . Two records are considered to match according to this rule if all of
     *   the `MatchingKeys` match.
     */
    public fun matchingKeys(matchingKeys: Collection<String>) {
        _matchingKeys.addAll(matchingKeys)
    }

    /** @param ruleName A name for the matching rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): CfnMatchingWorkflow.RuleProperty {
        if (_matchingKeys.isNotEmpty()) cdkBuilder.matchingKeys(_matchingKeys)
        return cdkBuilder.build()
    }
}
