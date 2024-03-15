@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class FilterCriteria internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria,
) : CdkObject(cdkObject) {
  public companion object {
    public fun filter(filter: Map<String, Any>): Map<String, Any> =
        software.amazon.awscdk.services.lambda.FilterCriteria.filter(filter) ?: emptyMap()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FilterCriteria):
        FilterCriteria = FilterCriteria(cdkObject)

    internal fun unwrap(wrapped: FilterCriteria):
        software.amazon.awscdk.services.lambda.FilterCriteria = wrapped.cdkObject
  }
}
