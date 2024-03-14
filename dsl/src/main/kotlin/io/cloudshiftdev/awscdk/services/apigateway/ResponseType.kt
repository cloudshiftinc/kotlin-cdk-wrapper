package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ResponseType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.ResponseType,
) : CdkObject(cdkObject) {
  /**
   * Valid value of response type.
   */
  public open fun responseType(): String = unwrap(this).getResponseType()

  public companion object {
    public fun of(type: String): ResponseType =
        software.amazon.awscdk.services.apigateway.ResponseType.of(type).let(ResponseType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResponseType):
        ResponseType = ResponseType(cdkObject)

    internal fun unwrap(wrapped: ResponseType):
        software.amazon.awscdk.services.apigateway.ResponseType = wrapped.cdkObject
  }
}