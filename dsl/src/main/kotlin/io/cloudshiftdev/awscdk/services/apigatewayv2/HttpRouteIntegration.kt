package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class HttpRouteIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration,
) : CdkObject(cdkObject) {
  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public open fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public open fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration,
  ) : HttpRouteIntegration(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration):
        HttpRouteIntegration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegration):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
  }
}
