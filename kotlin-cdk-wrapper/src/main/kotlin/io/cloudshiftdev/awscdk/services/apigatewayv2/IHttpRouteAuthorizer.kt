@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An authorizer that can attach to an Http Route.
 */
public interface IHttpRouteAuthorizer {
  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  public fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer,
  ) : CdkObject(cdkObject), IHttpRouteAuthorizer {
    /**
     * Bind this authorizer to a specified Http route.
     *
     * @param options 
     */
    override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
        unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

    /**
     * Bind this authorizer to a specified Http route.
     *
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
    override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
        HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer):
        IHttpRouteAuthorizer = CdkObjectWrappers.wrap(cdkObject) as? IHttpRouteAuthorizer ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpRouteAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
  }
}
