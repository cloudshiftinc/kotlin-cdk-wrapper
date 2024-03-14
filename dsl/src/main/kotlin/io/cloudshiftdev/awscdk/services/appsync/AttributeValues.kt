package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class AttributeValues internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.AttributeValues,
) {
  public open fun attribute(attr: String): AttributeValuesStep =
      unwrap(this).attribute(attr).let(AttributeValuesStep::wrap)

  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  public open fun renderVariables(): String = unwrap(this).renderVariables()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValues):
        AttributeValues = AttributeValues(cdkObject)

    internal fun unwrap(wrapped: AttributeValues):
        software.amazon.awscdk.services.appsync.AttributeValues = wrapped.cdkObject
  }
}
