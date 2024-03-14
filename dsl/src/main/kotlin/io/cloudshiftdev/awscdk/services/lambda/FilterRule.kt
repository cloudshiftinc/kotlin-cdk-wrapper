package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class FilterRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FilterRule,
) : CdkObject(cdkObject) {
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
