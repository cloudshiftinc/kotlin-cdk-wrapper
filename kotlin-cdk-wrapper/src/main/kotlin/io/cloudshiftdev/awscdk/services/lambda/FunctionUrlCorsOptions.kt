@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies a cross-origin access property for a function URL.
 *
 * Example:
 *
 * ```
 * Function fn;
 * fn.addFunctionUrl(FunctionUrlOptions.builder()
 * .authType(FunctionUrlAuthType.NONE)
 * .cors(FunctionUrlCorsOptions.builder()
 * // Allow this to be called from websites on https://example.com.
 * // Can also be ['*'] to allow all domain.
 * .allowedOrigins(List.of("https://example.com"))
 * .build())
 * .build());
 * ```
 */
public interface FunctionUrlCorsOptions {
  /**
   * Whether to allow cookies or other credentials in requests to your function URL.
   *
   * Default: false
   */
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  /**
   * Headers that are specified in the Access-Control-Request-Headers header.
   *
   * Default: - No headers allowed.
   */
  public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

  /**
   * An HTTP method that you allow the origin to execute.
   *
   * Default: - [HttpMethod.ALL]
   */
  public fun allowedMethods(): List<HttpMethod> =
      unwrap(this).getAllowedMethods()?.map(HttpMethod::wrap) ?: emptyList()

  /**
   * One or more origins you want customers to be able to access the bucket from.
   *
   * Default: - No origins allowed.
   */
  public fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?: emptyList()

  /**
   * One or more headers in the response that you want customers to be able to access from their
   * applications.
   *
   * Default: - No headers exposed.
   */
  public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

  /**
   * The time in seconds that your browser is to cache the preflight response for the specified
   * resource.
   *
   * Default: - Browser default of 5 seconds.
   */
  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  /**
   * A builder for [FunctionUrlCorsOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowCredentials Whether to allow cookies or other credentials in requests to your
     * function URL.
     */
    public fun allowCredentials(allowCredentials: Boolean)

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    public fun allowedHeaders(allowedHeaders: List<String>)

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    public fun allowedHeaders(vararg allowedHeaders: String)

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute.
     */
    public fun allowedMethods(allowedMethods: List<HttpMethod>)

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute.
     */
    public fun allowedMethods(vararg allowedMethods: HttpMethod)

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from.
     */
    public fun allowedOrigins(allowedOrigins: List<String>)

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from.
     */
    public fun allowedOrigins(vararg allowedOrigins: String)

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    public fun exposedHeaders(exposedHeaders: List<String>)

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    public fun exposedHeaders(vararg exposedHeaders: String)

    /**
     * @param maxAge The time in seconds that your browser is to cache the preflight response for
     * the specified resource.
     */
    public fun maxAge(maxAge: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions.builder()

    /**
     * @param allowCredentials Whether to allow cookies or other credentials in requests to your
     * function URL.
     */
    override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    override fun allowedHeaders(allowedHeaders: List<String>) {
      cdkBuilder.allowedHeaders(allowedHeaders)
    }

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    override fun allowedHeaders(vararg allowedHeaders: String): Unit =
        allowedHeaders(allowedHeaders.toList())

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute.
     */
    override fun allowedMethods(allowedMethods: List<HttpMethod>) {
      cdkBuilder.allowedMethods(allowedMethods.map(HttpMethod::unwrap))
    }

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute.
     */
    override fun allowedMethods(vararg allowedMethods: HttpMethod): Unit =
        allowedMethods(allowedMethods.toList())

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from.
     */
    override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from.
     */
    override fun allowedOrigins(vararg allowedOrigins: String): Unit =
        allowedOrigins(allowedOrigins.toList())

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    override fun exposedHeaders(exposedHeaders: List<String>) {
      cdkBuilder.exposedHeaders(exposedHeaders)
    }

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    override fun exposedHeaders(vararg exposedHeaders: String): Unit =
        exposedHeaders(exposedHeaders.toList())

    /**
     * @param maxAge The time in seconds that your browser is to cache the preflight response for
     * the specified resource.
     */
    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions,
  ) : CdkObject(cdkObject), FunctionUrlCorsOptions {
    /**
     * Whether to allow cookies or other credentials in requests to your function URL.
     *
     * Default: false
     */
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    /**
     * Headers that are specified in the Access-Control-Request-Headers header.
     *
     * Default: - No headers allowed.
     */
    override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    /**
     * An HTTP method that you allow the origin to execute.
     *
     * Default: - [HttpMethod.ALL]
     */
    override fun allowedMethods(): List<HttpMethod> =
        unwrap(this).getAllowedMethods()?.map(HttpMethod::wrap) ?: emptyList()

    /**
     * One or more origins you want customers to be able to access the bucket from.
     *
     * Default: - No origins allowed.
     */
    override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?: emptyList()

    /**
     * One or more headers in the response that you want customers to be able to access from their
     * applications.
     *
     * Default: - No headers exposed.
     */
    override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

    /**
     * The time in seconds that your browser is to cache the preflight response for the specified
     * resource.
     *
     * Default: - Browser default of 5 seconds.
     */
    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlCorsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions):
        FunctionUrlCorsOptions = CdkObjectWrappers.wrap(cdkObject) as? FunctionUrlCorsOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlCorsOptions):
        software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
  }
}
