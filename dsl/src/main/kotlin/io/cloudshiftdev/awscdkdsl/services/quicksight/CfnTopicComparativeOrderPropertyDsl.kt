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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * The order in which data is displayed for the column when it's used in a comparative context.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ComparativeOrderProperty comparativeOrderProperty = ComparativeOrderProperty.builder()
 * .specifedOrder(List.of("specifedOrder"))
 * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
 * .useOrdering("useOrdering")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html)
 */
@CdkDslMarker
public class CfnTopicComparativeOrderPropertyDsl {
    private val cdkBuilder: CfnTopic.ComparativeOrderProperty.Builder =
        CfnTopic.ComparativeOrderProperty.builder()

    private val _specifedOrder: MutableList<String> = mutableListOf()

    /** @param specifedOrder The list of columns to be used in the ordering. */
    public fun specifedOrder(vararg specifedOrder: String) {
        _specifedOrder.addAll(listOf(*specifedOrder))
    }

    /** @param specifedOrder The list of columns to be used in the ordering. */
    public fun specifedOrder(specifedOrder: Collection<String>) {
        _specifedOrder.addAll(specifedOrder)
    }

    /**
     * @param treatUndefinedSpecifiedValues The treat of undefined specified values. Valid values
     *   for this structure are `LEAST` and `MOST` .
     */
    public fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String) {
        cdkBuilder.treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues)
    }

    /**
     * @param useOrdering The ordering type for a column. Valid values for this structure are
     *   `GREATER_IS_BETTER` , `LESSER_IS_BETTER` and `SPECIFIED` .
     */
    public fun useOrdering(useOrdering: String) {
        cdkBuilder.useOrdering(useOrdering)
    }

    public fun build(): CfnTopic.ComparativeOrderProperty {
        if (_specifedOrder.isNotEmpty()) cdkBuilder.specifedOrder(_specifedOrder)
        return cdkBuilder.build()
    }
}
