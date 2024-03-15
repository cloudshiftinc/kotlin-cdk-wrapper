@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CorsOptions {
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

  public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

  public fun allowOrigins(): List<String>

  public fun disableCache(): Boolean? = unwrap(this).getDisableCache()

  public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  public fun statusCode(): Number? = unwrap(this).getStatusCode()

  @CdkDslMarker
  public interface Builder {
    public fun allowCredentials(allowCredentials: Boolean)

    public fun allowHeaders(allowHeaders: List<String>)

    public fun allowHeaders(vararg allowHeaders: String)

    public fun allowMethods(allowMethods: List<String>)

    public fun allowMethods(vararg allowMethods: String)

    public fun allowOrigins(allowOrigins: List<String>)

    public fun allowOrigins(vararg allowOrigins: String)

    public fun disableCache(disableCache: Boolean)

    public fun exposeHeaders(exposeHeaders: List<String>)

    public fun exposeHeaders(vararg exposeHeaders: String)

    public fun maxAge(maxAge: Duration)

    public fun statusCode(statusCode: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CorsOptions.Builder =
        software.amazon.awscdk.services.apigateway.CorsOptions.builder()

    override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    override fun allowHeaders(allowHeaders: List<String>) {
      cdkBuilder.allowHeaders(allowHeaders)
    }

    override fun allowHeaders(vararg allowHeaders: String): Unit =
        allowHeaders(allowHeaders.toList())

    override fun allowMethods(allowMethods: List<String>) {
      cdkBuilder.allowMethods(allowMethods)
    }

    override fun allowMethods(vararg allowMethods: String): Unit =
        allowMethods(allowMethods.toList())

    override fun allowOrigins(allowOrigins: List<String>) {
      cdkBuilder.allowOrigins(allowOrigins)
    }

    override fun allowOrigins(vararg allowOrigins: String): Unit =
        allowOrigins(allowOrigins.toList())

    override fun disableCache(disableCache: Boolean) {
      cdkBuilder.disableCache(disableCache)
    }

    override fun exposeHeaders(exposeHeaders: List<String>) {
      cdkBuilder.exposeHeaders(exposeHeaders)
    }

    override fun exposeHeaders(vararg exposeHeaders: String): Unit =
        exposeHeaders(exposeHeaders.toList())

    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    override fun statusCode(statusCode: Number) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CorsOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CorsOptions,
  ) : CdkObject(cdkObject), CorsOptions {
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins()

    override fun disableCache(): Boolean? = unwrap(this).getDisableCache()

    override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

    override fun statusCode(): Number? = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CorsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CorsOptions):
        CorsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsOptions):
        software.amazon.awscdk.services.apigateway.CorsOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CorsOptions
  }
}
