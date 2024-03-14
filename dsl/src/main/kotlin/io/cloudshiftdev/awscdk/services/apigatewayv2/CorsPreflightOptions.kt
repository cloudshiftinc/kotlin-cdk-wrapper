package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
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

  public interface Builder {
    public fun allowCredentials(allowCredentials: Boolean)

    public fun allowHeaders(allowHeaders: List<String>)

    public fun allowMethods(allowMethods: List<CorsHttpMethod>)

    public fun allowOrigins(allowOrigins: List<String>)

    public fun exposeHeaders(exposeHeaders: List<String>)

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

    override fun allowMethods(allowMethods: List<CorsHttpMethod>) {
      cdkBuilder.allowMethods(allowMethods.map(CorsHttpMethod::unwrap))
    }

    override fun allowOrigins(allowOrigins: List<String>) {
      cdkBuilder.allowOrigins(allowOrigins)
    }

    override fun exposeHeaders(exposeHeaders: List<String>) {
      cdkBuilder.exposeHeaders(exposeHeaders)
    }

    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions,
  ) : CorsPreflightOptions {
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    override fun allowMethods(): List<CorsHttpMethod> =
        unwrap(this).getAllowMethods()?.map(CorsHttpMethod::wrap) ?: emptyList()

    override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CorsPreflightOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions):
        CorsPreflightOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsPreflightOptions):
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions = (wrapped as
        Wrapper).cdkObject
  }
}
