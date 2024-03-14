package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CorsOptions {
  /**
   * The Access-Control-Allow-Credentials response header tells browsers whether to expose the
   * response to frontend JavaScript code when the request's credentials mode (Request.credentials) is
   * "include".
   *
   * When a request's credentials mode (Request.credentials) is "include",
   * browsers will only expose the response to frontend JavaScript code if the
   * Access-Control-Allow-Credentials value is true.
   *
   * Credentials are cookies, authorization headers or TLS client certificates.
   *
   * Default: false
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
   */
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  /**
   * The Access-Control-Allow-Headers response header is used in response to a preflight request
   * which includes the Access-Control-Request-Headers to indicate which HTTP headers can be used
   * during the actual request.
   *
   * Default: Cors.DEFAULT_HEADERS
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
   */
  public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

  /**
   * The Access-Control-Allow-Methods response header specifies the method or methods allowed when
   * accessing the resource in response to a preflight request.
   *
   * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
   *
   * Default: Cors.ALL_METHODS
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
   */
  public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

  /**
   * Specifies the list of origins that are allowed to make requests to this resource.
   *
   * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
   * `[ * ]`.
   *
   * Responses will include the `Access-Control-Allow-Origin` response header.
   * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
   * also be included.
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
   */
  public fun allowOrigins(): List<String>

  /**
   * Sets Access-Control-Max-Age to -1, which means that caching is disabled.
   *
   * This option cannot be used with `maxAge`.
   *
   * Default: - cache is enabled
   */
  public fun disableCache(): Boolean? = unwrap(this).getDisableCache()

  /**
   * The Access-Control-Expose-Headers response header indicates which headers can be exposed as
   * part of the response by listing their names.
   *
   * If you want clients to be able to access other headers, you have to list
   * them using the Access-Control-Expose-Headers header.
   *
   * Default: - only the 6 CORS-safelisted response headers are exposed:
   * Cache-Control, Content-Language, Content-Type, Expires, Last-Modified,
   * Pragma
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
   */
  public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

  /**
   * The Access-Control-Max-Age response header indicates how long the results of a preflight
   * request (that is the information contained in the Access-Control-Allow-Methods and
   * Access-Control-Allow-Headers headers) can be cached.
   *
   * To disable caching altogether use `disableCache: true`.
   *
   * Default: - browser-specific (see reference)
   *
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
   */
  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  /**
   * Specifies the response status code returned from the OPTIONS method.
   *
   * Default: 204
   */
  public fun statusCode(): Number? = unwrap(this).getStatusCode()

  /**
   * A builder for [CorsOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowCredentials The Access-Control-Allow-Credentials response header tells browsers
     * whether to expose the response to frontend JavaScript code when the request's credentials mode
     * (Request.credentials) is "include".
     * When a request's credentials mode (Request.credentials) is "include",
     * browsers will only expose the response to frontend JavaScript code if the
     * Access-Control-Allow-Credentials value is true.
     *
     * Credentials are cookies, authorization headers or TLS client certificates.
     */
    public fun allowCredentials(allowCredentials: Boolean)

    /**
     * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
     * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP
     * headers can be used during the actual request.
     */
    public fun allowHeaders(allowHeaders: List<String>)

    /**
     * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
     * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP
     * headers can be used during the actual request.
     */
    public fun allowHeaders(vararg allowHeaders: String)

    /**
     * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
     * methods allowed when accessing the resource in response to a preflight request.
     * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
     */
    public fun allowMethods(allowMethods: List<String>)

    /**
     * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
     * methods allowed when accessing the resource in response to a preflight request.
     * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
     */
    public fun allowMethods(vararg allowMethods: String)

    /**
     * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
     * resource. 
     * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
     * `[ * ]`.
     *
     * Responses will include the `Access-Control-Allow-Origin` response header.
     * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
     * also be included.
     */
    public fun allowOrigins(allowOrigins: List<String>)

    /**
     * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
     * resource. 
     * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
     * `[ * ]`.
     *
     * Responses will include the `Access-Control-Allow-Origin` response header.
     * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
     * also be included.
     */
    public fun allowOrigins(vararg allowOrigins: String)

    /**
     * @param disableCache Sets Access-Control-Max-Age to -1, which means that caching is disabled.
     * This option cannot be used with `maxAge`.
     */
    public fun disableCache(disableCache: Boolean)

    /**
     * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which
     * headers can be exposed as part of the response by listing their names.
     * If you want clients to be able to access other headers, you have to list
     * them using the Access-Control-Expose-Headers header.
     */
    public fun exposeHeaders(exposeHeaders: List<String>)

    /**
     * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which
     * headers can be exposed as part of the response by listing their names.
     * If you want clients to be able to access other headers, you have to list
     * them using the Access-Control-Expose-Headers header.
     */
    public fun exposeHeaders(vararg exposeHeaders: String)

    /**
     * @param maxAge The Access-Control-Max-Age response header indicates how long the results of a
     * preflight request (that is the information contained in the Access-Control-Allow-Methods and
     * Access-Control-Allow-Headers headers) can be cached.
     * To disable caching altogether use `disableCache: true`.
     */
    public fun maxAge(maxAge: Duration)

    /**
     * @param statusCode Specifies the response status code returned from the OPTIONS method.
     */
    public fun statusCode(statusCode: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CorsOptions.Builder =
        software.amazon.awscdk.services.apigateway.CorsOptions.builder()

    /**
     * @param allowCredentials The Access-Control-Allow-Credentials response header tells browsers
     * whether to expose the response to frontend JavaScript code when the request's credentials mode
     * (Request.credentials) is "include".
     * When a request's credentials mode (Request.credentials) is "include",
     * browsers will only expose the response to frontend JavaScript code if the
     * Access-Control-Allow-Credentials value is true.
     *
     * Credentials are cookies, authorization headers or TLS client certificates.
     */
    override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    /**
     * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
     * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP
     * headers can be used during the actual request.
     */
    override fun allowHeaders(allowHeaders: List<String>) {
      cdkBuilder.allowHeaders(allowHeaders)
    }

    /**
     * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
     * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP
     * headers can be used during the actual request.
     */
    override fun allowHeaders(vararg allowHeaders: String): Unit =
        allowHeaders(allowHeaders.toList())

    /**
     * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
     * methods allowed when accessing the resource in response to a preflight request.
     * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
     */
    override fun allowMethods(allowMethods: List<String>) {
      cdkBuilder.allowMethods(allowMethods)
    }

    /**
     * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
     * methods allowed when accessing the resource in response to a preflight request.
     * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
     */
    override fun allowMethods(vararg allowMethods: String): Unit =
        allowMethods(allowMethods.toList())

    /**
     * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
     * resource. 
     * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
     * `[ * ]`.
     *
     * Responses will include the `Access-Control-Allow-Origin` response header.
     * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
     * also be included.
     */
    override fun allowOrigins(allowOrigins: List<String>) {
      cdkBuilder.allowOrigins(allowOrigins)
    }

    /**
     * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
     * resource. 
     * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
     * `[ * ]`.
     *
     * Responses will include the `Access-Control-Allow-Origin` response header.
     * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
     * also be included.
     */
    override fun allowOrigins(vararg allowOrigins: String): Unit =
        allowOrigins(allowOrigins.toList())

    /**
     * @param disableCache Sets Access-Control-Max-Age to -1, which means that caching is disabled.
     * This option cannot be used with `maxAge`.
     */
    override fun disableCache(disableCache: Boolean) {
      cdkBuilder.disableCache(disableCache)
    }

    /**
     * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which
     * headers can be exposed as part of the response by listing their names.
     * If you want clients to be able to access other headers, you have to list
     * them using the Access-Control-Expose-Headers header.
     */
    override fun exposeHeaders(exposeHeaders: List<String>) {
      cdkBuilder.exposeHeaders(exposeHeaders)
    }

    /**
     * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which
     * headers can be exposed as part of the response by listing their names.
     * If you want clients to be able to access other headers, you have to list
     * them using the Access-Control-Expose-Headers header.
     */
    override fun exposeHeaders(vararg exposeHeaders: String): Unit =
        exposeHeaders(exposeHeaders.toList())

    /**
     * @param maxAge The Access-Control-Max-Age response header indicates how long the results of a
     * preflight request (that is the information contained in the Access-Control-Allow-Methods and
     * Access-Control-Allow-Headers headers) can be cached.
     * To disable caching altogether use `disableCache: true`.
     */
    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    /**
     * @param statusCode Specifies the response status code returned from the OPTIONS method.
     */
    override fun statusCode(statusCode: Number) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CorsOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CorsOptions,
  ) : CdkObject(cdkObject), CorsOptions {
    /**
     * The Access-Control-Allow-Credentials response header tells browsers whether to expose the
     * response to frontend JavaScript code when the request's credentials mode (Request.credentials)
     * is "include".
     *
     * When a request's credentials mode (Request.credentials) is "include",
     * browsers will only expose the response to frontend JavaScript code if the
     * Access-Control-Allow-Credentials value is true.
     *
     * Credentials are cookies, authorization headers or TLS client certificates.
     *
     * Default: false
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
     */
    override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    /**
     * The Access-Control-Allow-Headers response header is used in response to a preflight request
     * which includes the Access-Control-Request-Headers to indicate which HTTP headers can be used
     * during the actual request.
     *
     * Default: Cors.DEFAULT_HEADERS
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
     */
    override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    /**
     * The Access-Control-Allow-Methods response header specifies the method or methods allowed when
     * accessing the resource in response to a preflight request.
     *
     * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
     *
     * Default: Cors.ALL_METHODS
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
     */
    override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    /**
     * Specifies the list of origins that are allowed to make requests to this resource.
     *
     * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
     * `[ * ]`.
     *
     * Responses will include the `Access-Control-Allow-Origin` response header.
     * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
     * also be included.
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
     */
    override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins()

    /**
     * Sets Access-Control-Max-Age to -1, which means that caching is disabled.
     *
     * This option cannot be used with `maxAge`.
     *
     * Default: - cache is enabled
     */
    override fun disableCache(): Boolean? = unwrap(this).getDisableCache()

    /**
     * The Access-Control-Expose-Headers response header indicates which headers can be exposed as
     * part of the response by listing their names.
     *
     * If you want clients to be able to access other headers, you have to list
     * them using the Access-Control-Expose-Headers header.
     *
     * Default: - only the 6 CORS-safelisted response headers are exposed:
     * Cache-Control, Content-Language, Content-Type, Expires, Last-Modified,
     * Pragma
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
     */
    override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    /**
     * The Access-Control-Max-Age response header indicates how long the results of a preflight
     * request (that is the information contained in the Access-Control-Allow-Methods and
     * Access-Control-Allow-Headers headers) can be cached.
     *
     * To disable caching altogether use `disableCache: true`.
     *
     * Default: - browser-specific (see reference)
     *
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
     */
    override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

    /**
     * Specifies the response status code returned from the OPTIONS method.
     *
     * Default: 204
     */
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
