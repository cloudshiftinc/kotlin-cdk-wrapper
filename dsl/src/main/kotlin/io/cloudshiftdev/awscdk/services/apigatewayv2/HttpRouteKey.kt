package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String

public open class HttpRouteKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteKey,
) {
  public open fun key(): String = unwrap(this).getKey()

  public open fun method(): HttpMethod = unwrap(this).getMethod().let(HttpMethod::wrap)

  public open fun path(): String? = unwrap(this).getPath()

  public companion object {
    public open fun with(path: String): HttpRouteKey =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey.with(path).let(HttpRouteKey::wrap)

    public open fun with(path: String, method: HttpMethod): HttpRouteKey =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey.with(path,
        method.let(HttpMethod::unwrap)).let(HttpRouteKey::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteKey):
        HttpRouteKey = HttpRouteKey(cdkObject)

    internal fun unwrap(wrapped: HttpRouteKey):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey = wrapped.cdkObject
  }
}
