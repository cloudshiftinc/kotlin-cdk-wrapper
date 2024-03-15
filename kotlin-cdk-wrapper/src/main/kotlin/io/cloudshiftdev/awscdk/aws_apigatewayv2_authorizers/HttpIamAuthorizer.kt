@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Authorize HTTP API Routes with IAM.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * AnyPrincipal principal;
 * HttpIamAuthorizer authorizer = new HttpIamAuthorizer();
 * HttpApi httpApi = HttpApi.Builder.create(this, "HttpApi")
 * .defaultAuthorizer(authorizer)
 * .build();
 * HttpRoute[] routes = httpApi.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books/{book}")
 * .build());
 * routes[0].grantInvoke(principal);
 * ```
 */
public open class HttpIamAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  public constructor() :
      this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer())

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(_options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(_options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer):
        HttpIamAuthorizer = HttpIamAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpIamAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpIamAuthorizer = wrapped.cdkObject
  }
}
