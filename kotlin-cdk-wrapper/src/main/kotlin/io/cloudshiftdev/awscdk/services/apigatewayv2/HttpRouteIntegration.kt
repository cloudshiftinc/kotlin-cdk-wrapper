@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The interface that various route integration classes will inherit.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function bookStoreDefaultFn;
 * HttpUrlIntegration getBooksIntegration = new HttpUrlIntegration("GetBooksIntegration",
 * "https://get-books-proxy.example.com");
 * HttpLambdaIntegration bookStoreDefaultIntegration = new HttpLambdaIntegration("BooksIntegration",
 * bookStoreDefaultFn);
 * HttpApi httpApi = new HttpApi(this, "HttpApi");
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/books")
 * .methods(List.of(HttpMethod.GET))
 * .integration(getBooksIntegration)
 * .build());
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/books")
 * .methods(List.of(HttpMethod.ANY))
 * .integration(bookStoreDefaultIntegration)
 * .build());
 * ```
 */
public abstract class HttpRouteIntegration(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration,
) : CdkObject(cdkObject) {
  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public open fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions.Companion::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public open fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration,
  ) : HttpRouteIntegration(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration):
        HttpRouteIntegration = CdkObjectWrappers.wrap(cdkObject) as? HttpRouteIntegration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegration):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
  }
}
