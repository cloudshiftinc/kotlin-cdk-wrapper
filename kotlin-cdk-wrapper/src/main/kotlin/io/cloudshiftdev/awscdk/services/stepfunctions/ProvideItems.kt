@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * The array that the Map state will iterate over.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object array;
 * ProvideItems provideItems = ProvideItems.jsonArray(List.of(array));
 * ```
 */
public abstract class ProvideItems(
  cdkObject: software.amazon.awscdk.services.stepfunctions.ProvideItems,
) : CdkObject(cdkObject) {
  /**
   * The array that the Map state will iterate over.
   */
  public open fun items(): Any = unwrap(this).getItems()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ProvideItems,
  ) : ProvideItems(cdkObject)

  public companion object {
    public fun jsonArray(array: List<Any>): ProvideItems =
        software.amazon.awscdk.services.stepfunctions.ProvideItems.jsonArray(array.map{CdkObjectWrappers.unwrap(it)}).let(ProvideItems::wrap)

    public fun jsonArray(vararg array: Any): ProvideItems = jsonArray(array.toList())

    public fun jsonata(jsonataExpression: String): ProvideItems =
        software.amazon.awscdk.services.stepfunctions.ProvideItems.jsonata(jsonataExpression).let(ProvideItems::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ProvideItems):
        ProvideItems = CdkObjectWrappers.wrap(cdkObject) as? ProvideItems ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProvideItems):
        software.amazon.awscdk.services.stepfunctions.ProvideItems = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ProvideItems
  }
}
