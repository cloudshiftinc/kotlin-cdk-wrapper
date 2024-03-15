@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CorsPreflightOptions {
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

  public fun allowMethods(): List<CorsHttpMethod> =
      unwrap(this).getAllowMethods()?.map(CorsHttpMethod::wrap) ?: emptyList()

  public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

  public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowCredentials(allowCredentials: Boolean)

    public fun allowHeaders(allowHeaders: List<String>)

    public fun allowHeaders(vararg allowHeaders: String)

    public fun allowMethods(allowMethods: List<CorsHttpMethod>)

    public fun allowMethods(vararg allowMethods: CorsHttpMethod)

    public fun allowOrigins(allowOrigins: List<String>)

    public fun allowOrigins(vararg allowOrigins: String)

    public fun exposeHeaders(exposeHeaders: List<String>)

    public fun exposeHeaders(vararg exposeHeaders: String)

    public fun maxAge(maxAge: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions.builder()

    override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    override fun allowHeaders(allowHeaders: List<String>) {
      cdkBuilder.allowHeaders(allowHeaders)
    }

    override fun allowHeaders(vararg allowHeaders: String): Unit =
        allowHeaders(allowHeaders.toList())

    override fun allowMethods(allowMethods: List<CorsHttpMethod>) {
      cdkBuilder.allowMethods(allowMethods.map(CorsHttpMethod::unwrap))
    }

    override fun allowMethods(vararg allowMethods: CorsHttpMethod): Unit =
        allowMethods(allowMethods.toList())

    override fun allowOrigins(allowOrigins: List<String>) {
      cdkBuilder.allowOrigins(allowOrigins)
    }

    override fun allowOrigins(vararg allowOrigins: String): Unit =
        allowOrigins(allowOrigins.toList())

    override fun exposeHeaders(exposeHeaders: List<String>) {
      cdkBuilder.exposeHeaders(exposeHeaders)
    }

    override fun exposeHeaders(vararg exposeHeaders: String): Unit =
        exposeHeaders(exposeHeaders.toList())

    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions,
  ) : CdkObject(cdkObject), CorsPreflightOptions {
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    override fun allowMethods(): List<CorsHttpMethod> =
        unwrap(this).getAllowMethods()?.map(CorsHttpMethod::wrap) ?: emptyList()

    override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CorsPreflightOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions):
        CorsPreflightOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsPreflightOptions):
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions
  }
}
