@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Explicitly configure no authorizers on specific HTTP API routes.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * String issuer = "https://test.us.auth0.com";
 * HttpJwtAuthorizer authorizer = HttpJwtAuthorizer.Builder.create("DefaultAuthorizer", issuer)
 * .jwtAudience(List.of("3131231"))
 * .build();
 * HttpApi api = HttpApi.Builder.create(this, "HttpApi")
 * .defaultAuthorizer(authorizer)
 * .defaultAuthorizationScopes(List.of("read:books"))
 * .build();
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .methods(List.of(HttpMethod.GET))
 * .build());
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIdIntegration", "https://get-books-proxy.example.com"))
 * .path("/books/{id}")
 * .methods(List.of(HttpMethod.GET))
 * .build());
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .methods(List.of(HttpMethod.POST))
 * .authorizationScopes(List.of("write:books"))
 * .build());
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("LoginIntegration", "https://get-books-proxy.example.com"))
 * .path("/login")
 * .methods(List.of(HttpMethod.POST))
 * .authorizer(new HttpNoneAuthorizer())
 * .build());
 * ```
 */
public open class HttpNoneAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer,
) : CdkObject(cdkObject),
    IHttpRouteAuthorizer {
  public constructor() : this(software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer()
  )

  /**
   * The authorizationType used for IAM Authorizer.
   */
  public open fun authorizationType(): String = unwrap(this).getAuthorizationType()

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param _options 
   */
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions.Companion::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer):
        HttpNoneAuthorizer = HttpNoneAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpNoneAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpNoneAuthorizer
  }
}
