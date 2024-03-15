@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Payload format version for lambda proxy integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * PayloadFormatVersion payloadFormatVersion = PayloadFormatVersion.custom("version");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
 */
public open class PayloadFormatVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion,
) : CdkObject(cdkObject) {
  /**
   * version as a string.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val VERSION_1_0: PayloadFormatVersion =
        PayloadFormatVersion.wrap(software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion.VERSION_1_0)

    public val VERSION_2_0: PayloadFormatVersion =
        PayloadFormatVersion.wrap(software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion.VERSION_2_0)

    public fun custom(version: String): PayloadFormatVersion =
        software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion.custom(version).let(PayloadFormatVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion):
        PayloadFormatVersion = PayloadFormatVersion(cdkObject)

    internal fun unwrap(wrapped: PayloadFormatVersion):
        software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion = wrapped.cdkObject
  }
}
