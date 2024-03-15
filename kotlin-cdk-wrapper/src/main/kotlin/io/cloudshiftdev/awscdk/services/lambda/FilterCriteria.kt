@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Filter criteria for Lambda event filtering.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Function fn;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .stream(StreamViewType.NEW_IMAGE)
 * .build();
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.LATEST)
 * .filters(List.of(FilterCriteria.filter(Map.of("eventName", FilterRule.isEqual("INSERT")))))
 * .build());
 * ```
 */
public open class FilterCriteria internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.lambda.FilterCriteria()
  )

  public companion object {
    public fun filter(filter: Map<String, Any>): Map<String, Any> =
        software.amazon.awscdk.services.lambda.FilterCriteria.filter(filter) ?: emptyMap()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria):
        FilterCriteria = FilterCriteria(cdkObject)

    internal fun unwrap(wrapped: FilterCriteria):
        software.amazon.awscdk.services.lambda.FilterCriteria = wrapped.cdkObject
  }
}
