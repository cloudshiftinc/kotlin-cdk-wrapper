package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class AttributeValuesStep internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep,
) {
  public open fun `is`(`val`: String): AttributeValues =
      unwrap(this).`is`(`val`).let(AttributeValues::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValuesStep):
        AttributeValuesStep = AttributeValuesStep(cdkObject)

    internal fun unwrap(wrapped: AttributeValuesStep):
        software.amazon.awscdk.services.appsync.AttributeValuesStep = wrapped.cdkObject
  }
}
