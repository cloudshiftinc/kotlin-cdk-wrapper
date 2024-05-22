@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the CORS Configuration.
 *
 * Example:
 *
 * ```
 * HttpApi.Builder.create(this, "HttpProxyApi")
 * .corsPreflight(CorsPreflightOptions.builder()
 * .allowHeaders(List.of("Authorization"))
 * .allowMethods(List.of(CorsHttpMethod.GET, CorsHttpMethod.HEAD, CorsHttpMethod.OPTIONS,
 * CorsHttpMethod.POST))
 * .allowOrigins(List.of("*"))
 * .maxAge(Duration.days(10))
 * .build())
 * .build();
 * ```
 */
public interface CorsPreflightOptions {
  /**
   * Specifies whether credentials are included in the CORS request.
   *
   * Default: false
   */
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  /**
   * Represents a collection of allowed headers.
   *
   * Default: - No Headers are allowed.
   */
  public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

  /**
   * Represents a collection of allowed HTTP methods.
   *
   * Default: - No Methods are allowed.
   */
  public fun allowMethods(): List<CorsHttpMethod> =
      unwrap(this).getAllowMethods()?.map(CorsHttpMethod::wrap) ?: emptyList()

  /**
   * Represents a collection of allowed origins.
   *
   * Default: - No Origins are allowed.
   */
  public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

  /**
   * Represents a collection of exposed headers.
   *
   * Default: - No Expose Headers are allowed.
   */
  public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

  /**
   * The duration that the browser should cache preflight request results.
   *
   * Default: Duration.seconds(0)
   */
  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  /**
   * A builder for [CorsPreflightOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowCredentials Specifies whether credentials are included in the CORS request.
     */
    public fun allowCredentials(allowCredentials: Boolean)

    /**
     * @param allowHeaders Represents a collection of allowed headers.
     */
    public fun allowHeaders(allowHeaders: List<String>)

    /**
     * @param allowHeaders Represents a collection of allowed headers.
     */
    public fun allowHeaders(vararg allowHeaders: String)

    /**
     * @param allowMethods Represents a collection of allowed HTTP methods.
     */
    public fun allowMethods(allowMethods: List<CorsHttpMethod>)

    /**
     * @param allowMethods Represents a collection of allowed HTTP methods.
     */
    public fun allowMethods(vararg allowMethods: CorsHttpMethod)

    /**
     * @param allowOrigins Represents a collection of allowed origins.
     */
    public fun allowOrigins(allowOrigins: List<String>)

    /**
     * @param allowOrigins Represents a collection of allowed origins.
     */
    public fun allowOrigins(vararg allowOrigins: String)

    /**
     * @param exposeHeaders Represents a collection of exposed headers.
     */
    public fun exposeHeaders(exposeHeaders: List<String>)

    /**
     * @param exposeHeaders Represents a collection of exposed headers.
     */
    public fun exposeHeaders(vararg exposeHeaders: String)

    /**
     * @param maxAge The duration that the browser should cache preflight request results.
     */
    public fun maxAge(maxAge: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions.builder()

    /**
     * @param allowCredentials Specifies whether credentials are included in the CORS request.
     */
    override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    /**
     * @param allowHeaders Represents a collection of allowed headers.
     */
    override fun allowHeaders(allowHeaders: List<String>) {
      cdkBuilder.allowHeaders(allowHeaders)
    }

    /**
     * @param allowHeaders Represents a collection of allowed headers.
     */
    override fun allowHeaders(vararg allowHeaders: String): Unit =
        allowHeaders(allowHeaders.toList())

    /**
     * @param allowMethods Represents a collection of allowed HTTP methods.
     */
    override fun allowMethods(allowMethods: List<CorsHttpMethod>) {
      cdkBuilder.allowMethods(allowMethods.map(CorsHttpMethod.Companion::unwrap))
    }

    /**
     * @param allowMethods Represents a collection of allowed HTTP methods.
     */
    override fun allowMethods(vararg allowMethods: CorsHttpMethod): Unit =
        allowMethods(allowMethods.toList())

    /**
     * @param allowOrigins Represents a collection of allowed origins.
     */
    override fun allowOrigins(allowOrigins: List<String>) {
      cdkBuilder.allowOrigins(allowOrigins)
    }

    /**
     * @param allowOrigins Represents a collection of allowed origins.
     */
    override fun allowOrigins(vararg allowOrigins: String): Unit =
        allowOrigins(allowOrigins.toList())

    /**
     * @param exposeHeaders Represents a collection of exposed headers.
     */
    override fun exposeHeaders(exposeHeaders: List<String>) {
      cdkBuilder.exposeHeaders(exposeHeaders)
    }

    /**
     * @param exposeHeaders Represents a collection of exposed headers.
     */
    override fun exposeHeaders(vararg exposeHeaders: String): Unit =
        exposeHeaders(exposeHeaders.toList())

    /**
     * @param maxAge The duration that the browser should cache preflight request results.
     */
    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions,
  ) : CdkObject(cdkObject), CorsPreflightOptions {
    /**
     * Specifies whether credentials are included in the CORS request.
     *
     * Default: false
     */
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    /**
     * Represents a collection of allowed headers.
     *
     * Default: - No Headers are allowed.
     */
    override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    /**
     * Represents a collection of allowed HTTP methods.
     *
     * Default: - No Methods are allowed.
     */
    override fun allowMethods(): List<CorsHttpMethod> =
        unwrap(this).getAllowMethods()?.map(CorsHttpMethod::wrap) ?: emptyList()

    /**
     * Represents a collection of allowed origins.
     *
     * Default: - No Origins are allowed.
     */
    override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    /**
     * Represents a collection of exposed headers.
     *
     * Default: - No Expose Headers are allowed.
     */
    override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    /**
     * The duration that the browser should cache preflight request results.
     *
     * Default: Duration.seconds(0)
     */
    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CorsPreflightOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions):
        CorsPreflightOptions = CdkObjectWrappers.wrap(cdkObject) as? CorsPreflightOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsPreflightOptions):
        software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions
  }
}
