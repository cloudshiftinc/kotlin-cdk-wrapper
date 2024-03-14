package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String

public open class ProviderAttribute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute,
) {
  public open fun attributeName(): String = unwrap(this).getAttributeName()

  public companion object {
    public open fun other(attributeName: String): ProviderAttribute =
        software.amazon.awscdk.services.cognito.ProviderAttribute.other(attributeName).let(ProviderAttribute::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute):
        ProviderAttribute = ProviderAttribute(cdkObject)

    internal fun unwrap(wrapped: ProviderAttribute):
        software.amazon.awscdk.services.cognito.ProviderAttribute = wrapped.cdkObject
  }
}
