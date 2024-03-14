package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

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
