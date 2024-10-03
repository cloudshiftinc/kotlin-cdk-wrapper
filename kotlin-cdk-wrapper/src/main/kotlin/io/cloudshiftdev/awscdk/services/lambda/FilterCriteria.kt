@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Filter criteria for Lambda event filtering.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.DynamoEventSource;
 * Table table;
 * Function fn;
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.LATEST)
 * .filters(List.of(FilterCriteria.filter(Map.of(
 * "eventName", FilterRule.isEqual("INSERT"),
 * "dynamodb", Map.of(
 * "NewImage", Map.of(
 * "id", Map.of("BOOL", FilterRule.isEqual(true))))))))
 * .build());
 * ```
 */
public open class FilterCriteria(
  cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.lambda.FilterCriteria()
  )

  public companion object {
    public fun filter(filter: Map<String, Any>): Map<String, Any> =
        software.amazon.awscdk.services.lambda.FilterCriteria.filter(filter.mapValues{CdkObjectWrappers.unwrap(it.value)})
        ?: emptyMap()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria):
        FilterCriteria = FilterCriteria(cdkObject)

    internal fun unwrap(wrapped: FilterCriteria):
        software.amazon.awscdk.services.lambda.FilterCriteria = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.FilterCriteria
  }
}
