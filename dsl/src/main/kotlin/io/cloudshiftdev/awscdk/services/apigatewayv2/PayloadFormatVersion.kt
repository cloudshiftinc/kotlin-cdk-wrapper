package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class PayloadFormatVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion,
) : CdkObject(cdkObject) {
  /**
   * version as a string.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public fun custom(version: String): PayloadFormatVersion =
        software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion.custom(version).let(PayloadFormatVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion):
        PayloadFormatVersion = PayloadFormatVersion(cdkObject)

    internal fun unwrap(wrapped: PayloadFormatVersion):
        software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion = wrapped.cdkObject
  }
}
