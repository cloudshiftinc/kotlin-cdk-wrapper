package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class HttpRouteKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteKey,
) : CdkObject(cdkObject) {
  /**
   * The key to the RouteKey as recognized by APIGateway.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * The method of the route.
   */
  public open fun method(): HttpMethod = unwrap(this).getMethod().let(HttpMethod::wrap)

  /**
   * The path part of this RouteKey.
   *
   * Returns `undefined` when `RouteKey.DEFAULT` is used.
   */
  public open fun path(): String? = unwrap(this).getPath()

  public companion object {
    public val DEFAULT: HttpRouteKey =
        HttpRouteKey.wrap(software.amazon.awscdk.services.apigatewayv2.HttpRouteKey.DEFAULT)

    public fun with(path: String): HttpRouteKey =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey.with(path).let(HttpRouteKey::wrap)

    public fun with(path: String, method: HttpMethod): HttpRouteKey =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey.with(path,
        method.let(HttpMethod::unwrap)).let(HttpRouteKey::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteKey):
        HttpRouteKey = HttpRouteKey(cdkObject)

    internal fun unwrap(wrapped: HttpRouteKey):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteKey = wrapped.cdkObject
  }
}
