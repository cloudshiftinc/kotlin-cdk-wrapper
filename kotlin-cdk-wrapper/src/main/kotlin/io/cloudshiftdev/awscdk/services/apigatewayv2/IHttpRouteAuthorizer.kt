@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IHttpRouteAuthorizer {
  public fun bind(arg0: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public fun bind(arg0: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer,
  ) : CdkObject(cdkObject), IHttpRouteAuthorizer {
    override fun bind(arg0: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
        unwrap(this).bind(arg0.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
    override fun bind(arg0: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
        HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(arg0))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer):
        IHttpRouteAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpRouteAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
  }
}
