@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Utility class to allow assigning a value to an attribute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Assign assign;
 * AttributeValuesStep attributeValuesStep = new AttributeValuesStep("attr", "container",
 * List.of(assign));
 * ```
 */
public open class AttributeValuesStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep,
) : CdkObject(cdkObject) {
  /**
   * Assign the value to the current attribute.
   *
   * @param val 
   */
  public open fun `is`(`val`: String): AttributeValues =
      unwrap(this).`is`(`val`).let(AttributeValues::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep):
        AttributeValuesStep = AttributeValuesStep(cdkObject)

    internal fun unwrap(wrapped: AttributeValuesStep):
        software.amazon.awscdk.services.appsync.AttributeValuesStep = wrapped.cdkObject
  }
}
