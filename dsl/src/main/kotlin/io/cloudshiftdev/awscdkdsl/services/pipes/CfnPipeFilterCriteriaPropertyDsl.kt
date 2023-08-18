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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The collection of event patterns used to filter events.
 *
 * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter` objects.
 *
 * For more information, see
 * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
 * .filters(List.of(FilterProperty.builder()
 * .pattern("pattern")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filtercriteria.html)
 */
@CdkDslMarker
public class CfnPipeFilterCriteriaPropertyDsl {
    private val cdkBuilder: CfnPipe.FilterCriteriaProperty.Builder =
        CfnPipe.FilterCriteriaProperty.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    /** @param filters The event patterns. */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters The event patterns. */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /** @param filters The event patterns. */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    public fun build(): CfnPipe.FilterCriteriaProperty {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
