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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * An object that contains the filters for an event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
 * .filters(List.of(FilterProperty.builder()
 * .pattern("pattern")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filtercriteria.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingFilterCriteriaPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.FilterCriteriaProperty.Builder =
        CfnEventSourceMapping.FilterCriteriaProperty.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    /** @param filters A list of filters. */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters A list of filters. */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /** @param filters A list of filters. */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    public fun build(): CfnEventSourceMapping.FilterCriteriaProperty {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
