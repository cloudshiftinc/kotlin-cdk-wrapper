@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

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
public open class AttributeValuesStep(
  cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep,
) : CdkObject(cdkObject) {
  public constructor(
    attr: String,
    container: String,
    assignments: List<Assign>,
  ) : this(software.amazon.awscdk.services.appsync.AttributeValuesStep(attr, container,
      assignments.map(Assign.Companion::unwrap))
  )

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
        software.amazon.awscdk.services.appsync.AttributeValuesStep = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AttributeValuesStep
  }
}
