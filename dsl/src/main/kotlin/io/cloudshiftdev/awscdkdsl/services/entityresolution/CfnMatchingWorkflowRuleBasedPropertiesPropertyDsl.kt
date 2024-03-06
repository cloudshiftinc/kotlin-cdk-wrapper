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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/**
 * An object which defines the list of matching rules to run and has a field `Rules` , which is a
 * list of rule objects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * RuleBasedPropertiesProperty ruleBasedPropertiesProperty = RuleBasedPropertiesProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * .rules(List.of(RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowRuleBasedPropertiesPropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.RuleBasedPropertiesProperty.Builder =
        CfnMatchingWorkflow.RuleBasedPropertiesProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /**
     * @param attributeMatchingModel The comparison type. You can either choose `ONE_TO_ONE` or
     *   `MANY_TO_MANY` as the AttributeMatchingModel. When choosing `MANY_TO_MANY` , the system can
     *   match attributes across the sub-types of an attribute type. For example, if the value of
     *   the `Email` field of Profile A and the value of `BusinessEmail` field of Profile B matches,
     *   the two profiles are matched on the `Email` type. When choosing `ONE_TO_ONE` ,the system
     *   can only match if the sub-types are exact matches. For example, only when the value of the
     *   `Email` field of Profile A and the value of the `Email` field of Profile B matches, the two
     *   profiles are matched on the `Email` type.
     */
    public fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
    }

    /**
     * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
     *   `MatchingKeys` .
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
     *   `MatchingKeys` .
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
     *   `MatchingKeys` .
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnMatchingWorkflow.RuleBasedPropertiesProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
