@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface GrantInvokeOptions {
  public fun httpMethods(): List<HttpMethod> = unwrap(this).getHttpMethods()?.map(HttpMethod::wrap)
      ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun httpMethods(httpMethods: List<HttpMethod>)

    public fun httpMethods(vararg httpMethods: HttpMethod)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions.Builder
        = software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions.builder()

    override fun httpMethods(httpMethods: List<HttpMethod>) {
      cdkBuilder.httpMethods(httpMethods.map(HttpMethod::unwrap))
    }

    override fun httpMethods(vararg httpMethods: HttpMethod): Unit =
        httpMethods(httpMethods.toList())

    public fun build(): software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions,
  ) : CdkObject(cdkObject), GrantInvokeOptions {
    override fun httpMethods(): List<HttpMethod> =
        unwrap(this).getHttpMethods()?.map(HttpMethod::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantInvokeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions):
        GrantInvokeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantInvokeOptions):
        software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions
  }
}
