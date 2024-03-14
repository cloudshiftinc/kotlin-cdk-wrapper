package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ProviderAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute,
) : CdkObject(cdkObject) {
  /**
   * The attribute value string as recognized by the provider.
   */
  public open fun attributeName(): String = unwrap(this).getAttributeName()

  public companion object {
    public fun other(attributeName: String): ProviderAttribute =
        software.amazon.awscdk.services.cognito.ProviderAttribute.other(attributeName).let(ProviderAttribute::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute):
        ProviderAttribute = ProviderAttribute(cdkObject)

    internal fun unwrap(wrapped: ProviderAttribute):
        software.amazon.awscdk.services.cognito.ProviderAttribute = wrapped.cdkObject
  }
}