@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Filter rules for Lambda event filtering.
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
public open class FilterRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FilterRule,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.lambda.FilterRule()
  )

  public companion object {
    public fun beginsWith(elem: String): List<Map<String, String>> =
        software.amazon.awscdk.services.lambda.FilterRule.beginsWith(elem)

    public fun between(first: Number, second: Number): List<Map<String, List<Any>>> =
        software.amazon.awscdk.services.lambda.FilterRule.between(first, second)

    public fun doNull(): List<String> = software.amazon.awscdk.services.lambda.FilterRule.doNull()

    public fun empty(): List<String> = software.amazon.awscdk.services.lambda.FilterRule.empty()

    public fun exists(): List<Map<String, Boolean>> =
        software.amazon.awscdk.services.lambda.FilterRule.exists()

    public fun isEqual(item: Any): Any =
        software.amazon.awscdk.services.lambda.FilterRule.isEqual(item)

    public fun notEquals(elem: String): List<Map<String, List<String>>> =
        software.amazon.awscdk.services.lambda.FilterRule.notEquals(elem)

    public fun notExists(): List<Map<String, Boolean>> =
        software.amazon.awscdk.services.lambda.FilterRule.notExists()

    public fun or(elem: String): List<String> =
        software.amazon.awscdk.services.lambda.FilterRule.or(elem)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FilterRule): FilterRule =
        FilterRule(cdkObject)

    internal fun unwrap(wrapped: FilterRule): software.amazon.awscdk.services.lambda.FilterRule =
        wrapped.cdkObject
  }
}
