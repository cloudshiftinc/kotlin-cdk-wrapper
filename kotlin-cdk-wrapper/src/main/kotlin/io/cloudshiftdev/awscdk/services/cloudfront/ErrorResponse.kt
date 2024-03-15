@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Options for configuring custom error responses.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * ErrorResponse errorResponse = ErrorResponse.builder()
 * .httpStatus(123)
 * // the properties below are optional
 * .responseHttpStatus(123)
 * .responsePagePath("responsePagePath")
 * .ttl(Duration.minutes(30))
 * .build();
 * ```
 */
public interface ErrorResponse {
  /**
   * The HTTP status code for which you want to specify a custom error page and/or a caching
   * duration.
   */
  public fun httpStatus(): Number

  /**
   * The HTTP status code that you want CloudFront to return to the viewer along with the custom
   * error page.
   *
   * If you specify a value for `responseHttpStatus`, you must also specify a value for
   * `responsePagePath`.
   *
   * Default: - the error code will be returned as the response code.
   */
  public fun responseHttpStatus(): Number? = unwrap(this).getResponseHttpStatus()

  /**
   * The path to the custom error page that you want CloudFront to return to a viewer when your
   * origin returns the `httpStatus`, for example, /4xx-errors/403-forbidden.html.
   *
   * Default: - the default CloudFront response is shown.
   */
  public fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

  /**
   * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code
   * specified in ErrorCode.
   *
   * Default: - the default caching TTL behavior applies
   */
  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  /**
   * A builder for [ErrorResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpStatus The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration. 
     */
    public fun httpStatus(httpStatus: Number)

    /**
     * @param responseHttpStatus The HTTP status code that you want CloudFront to return to the
     * viewer along with the custom error page.
     * If you specify a value for `responseHttpStatus`, you must also specify a value for
     * `responsePagePath`.
     */
    public fun responseHttpStatus(responseHttpStatus: Number)

    /**
     * @param responsePagePath The path to the custom error page that you want CloudFront to return
     * to a viewer when your origin returns the `httpStatus`, for example,
     * /4xx-errors/403-forbidden.html.
     */
    public fun responsePagePath(responsePagePath: String)

    /**
     * @param ttl The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP
     * status code specified in ErrorCode.
     */
    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ErrorResponse.Builder =
        software.amazon.awscdk.services.cloudfront.ErrorResponse.builder()

    /**
     * @param httpStatus The HTTP status code for which you want to specify a custom error page
     * and/or a caching duration. 
     */
    override fun httpStatus(httpStatus: Number) {
      cdkBuilder.httpStatus(httpStatus)
    }

    /**
     * @param responseHttpStatus The HTTP status code that you want CloudFront to return to the
     * viewer along with the custom error page.
     * If you specify a value for `responseHttpStatus`, you must also specify a value for
     * `responsePagePath`.
     */
    override fun responseHttpStatus(responseHttpStatus: Number) {
      cdkBuilder.responseHttpStatus(responseHttpStatus)
    }

    /**
     * @param responsePagePath The path to the custom error page that you want CloudFront to return
     * to a viewer when your origin returns the `httpStatus`, for example,
     * /4xx-errors/403-forbidden.html.
     */
    override fun responsePagePath(responsePagePath: String) {
      cdkBuilder.responsePagePath(responsePagePath)
    }

    /**
     * @param ttl The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP
     * status code specified in ErrorCode.
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ErrorResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ErrorResponse,
  ) : CdkObject(cdkObject), ErrorResponse {
    /**
     * The HTTP status code for which you want to specify a custom error page and/or a caching
     * duration.
     */
    override fun httpStatus(): Number = unwrap(this).getHttpStatus()

    /**
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom
     * error page.
     *
     * If you specify a value for `responseHttpStatus`, you must also specify a value for
     * `responsePagePath`.
     *
     * Default: - the error code will be returned as the response code.
     */
    override fun responseHttpStatus(): Number? = unwrap(this).getResponseHttpStatus()

    /**
     * The path to the custom error page that you want CloudFront to return to a viewer when your
     * origin returns the `httpStatus`, for example, /4xx-errors/403-forbidden.html.
     *
     * Default: - the default CloudFront response is shown.
     */
    override fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

    /**
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status
     * code specified in ErrorCode.
     *
     * Default: - the default caching TTL behavior applies
     */
    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ErrorResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ErrorResponse):
        ErrorResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ErrorResponse):
        software.amazon.awscdk.services.cloudfront.ErrorResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.ErrorResponse
  }
}
