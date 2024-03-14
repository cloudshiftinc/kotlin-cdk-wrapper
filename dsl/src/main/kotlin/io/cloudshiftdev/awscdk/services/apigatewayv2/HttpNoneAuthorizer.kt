package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class HttpNoneAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param _options 
   */
  public override fun bind(_options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(_options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(_options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(_options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer):
        HttpNoneAuthorizer = HttpNoneAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpNoneAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer = wrapped.cdkObject
  }
}
