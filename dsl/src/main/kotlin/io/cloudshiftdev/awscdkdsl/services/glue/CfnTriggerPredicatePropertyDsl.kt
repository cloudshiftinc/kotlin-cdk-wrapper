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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger

/**
 * Defines the predicate of the trigger, which determines when it fires.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * PredicateProperty predicateProperty = PredicateProperty.builder()
 * .conditions(List.of(ConditionProperty.builder()
 * .crawlerName("crawlerName")
 * .crawlState("crawlState")
 * .jobName("jobName")
 * .logicalOperator("logicalOperator")
 * .state("state")
 * .build()))
 * .logical("logical")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html)
 */
@CdkDslMarker
public class CfnTriggerPredicatePropertyDsl {
    private val cdkBuilder: CfnTrigger.PredicateProperty.Builder =
        CfnTrigger.PredicateProperty.builder()

    private val _conditions: MutableList<Any> = mutableListOf()

    /** @param conditions A list of the conditions that determine when the trigger will fire. */
    public fun conditions(vararg conditions: Any) {
        _conditions.addAll(listOf(*conditions))
    }

    /** @param conditions A list of the conditions that determine when the trigger will fire. */
    public fun conditions(conditions: Collection<Any>) {
        _conditions.addAll(conditions)
    }

    /** @param conditions A list of the conditions that determine when the trigger will fire. */
    public fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions)
    }

    /**
     * @param logical An optional field if only one condition is listed. If multiple conditions are
     *   listed, then this field is required.
     */
    public fun logical(logical: String) {
        cdkBuilder.logical(logical)
    }

    public fun build(): CfnTrigger.PredicateProperty {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        return cdkBuilder.build()
    }
}
