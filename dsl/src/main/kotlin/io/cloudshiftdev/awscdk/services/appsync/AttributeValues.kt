package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class AttributeValues internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.AttributeValues,
) : CdkObject(cdkObject) {
  /**
   * Allows assigning a value to the specified attribute.
   *
   * @param attr 
   */
  public open fun attribute(attr: String): AttributeValuesStep =
      unwrap(this).attribute(attr).let(AttributeValuesStep::wrap)

  /**
   * Renders the attribute value assingments to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  /**
   * Renders the variables required for `renderTemplate`.
   */
  public open fun renderVariables(): String = unwrap(this).renderVariables()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValues):
        AttributeValues = AttributeValues(cdkObject)

    internal fun unwrap(wrapped: AttributeValues):
        software.amazon.awscdk.services.appsync.AttributeValues = wrapped.cdkObject
  }
}
