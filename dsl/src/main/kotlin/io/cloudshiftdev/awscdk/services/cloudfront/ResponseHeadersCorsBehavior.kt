package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ResponseHeadersCorsBehavior {
  /**
   * A Boolean that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP
   * response header.
   */
  public fun accessControlAllowCredentials(): Boolean

  /**
   * A list of HTTP header names that CloudFront includes as values for the
   * Access-Control-Allow-Headers HTTP response header.
   *
   * You can specify `['*']` to allow all headers.
   */
  public fun accessControlAllowHeaders(): List<String>

  /**
   * A list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods
   * HTTP response header.
   */
  public fun accessControlAllowMethods(): List<String>

  /**
   * A list of origins (domain names) that CloudFront can use as the value for the
   * Access-Control-Allow-Origin HTTP response header.
   *
   * You can specify `['*']` to allow all origins.
   */
  public fun accessControlAllowOrigins(): List<String>

  /**
   * A list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers
   * HTTP response header.
   *
   * You can specify `['*']` to expose all headers.
   *
   * Default: - no headers exposed
   */
  public fun accessControlExposeHeaders(): List<String> =
      unwrap(this).getAccessControlExposeHeaders() ?: emptyList()

  /**
   * A number that CloudFront uses as the value for the Access-Control-Max-Age HTTP response header.
   *
   * Default: - no max age
   */
  public fun accessControlMaxAge(): Duration? =
      unwrap(this).getAccessControlMaxAge()?.let(Duration::wrap)

  /**
   * A Boolean that determines whether CloudFront overrides HTTP response headers received from the
   * origin with the ones specified in this response headers policy.
   */
  public fun originOverride(): Boolean

  /**
   * A builder for [ResponseHeadersCorsBehavior]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
     * Access-Control-Allow-Credentials HTTP response header. 
     */
    public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean)

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     * values for the Access-Control-Allow-Headers HTTP response header. 
     * You can specify `['*']` to allow all headers.
     */
    public fun accessControlAllowHeaders(accessControlAllowHeaders: List<String>)

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     * values for the Access-Control-Allow-Headers HTTP response header. 
     * You can specify `['*']` to allow all headers.
     */
    public fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String)

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     * for the Access-Control-Allow-Methods HTTP response header. 
     */
    public fun accessControlAllowMethods(accessControlAllowMethods: List<String>)

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     * for the Access-Control-Allow-Methods HTTP response header. 
     */
    public fun accessControlAllowMethods(vararg accessControlAllowMethods: String)

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     * the value for the Access-Control-Allow-Origin HTTP response header. 
     * You can specify `['*']` to allow all origins.
     */
    public fun accessControlAllowOrigins(accessControlAllowOrigins: List<String>)

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     * the value for the Access-Control-Allow-Origin HTTP response header. 
     * You can specify `['*']` to allow all origins.
     */
    public fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String)

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     * for the Access-Control-Expose-Headers HTTP response header.
     * You can specify `['*']` to expose all headers.
     */
    public fun accessControlExposeHeaders(accessControlExposeHeaders: List<String>)

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     * for the Access-Control-Expose-Headers HTTP response header.
     * You can specify `['*']` to expose all headers.
     */
    public fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String)

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the
     * Access-Control-Max-Age HTTP response header.
     */
    public fun accessControlMaxAge(accessControlMaxAge: Duration)

    /**
     * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
     * headers received from the origin with the ones specified in this response headers policy. 
     */
    public fun originOverride(originOverride: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior.builder()

    /**
     * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
     * Access-Control-Allow-Credentials HTTP response header. 
     */
    override fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
      cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     * values for the Access-Control-Allow-Headers HTTP response header. 
     * You can specify `['*']` to allow all headers.
     */
    override fun accessControlAllowHeaders(accessControlAllowHeaders: List<String>) {
      cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     * values for the Access-Control-Allow-Headers HTTP response header. 
     * You can specify `['*']` to allow all headers.
     */
    override fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String): Unit =
        accessControlAllowHeaders(accessControlAllowHeaders.toList())

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     * for the Access-Control-Allow-Methods HTTP response header. 
     */
    override fun accessControlAllowMethods(accessControlAllowMethods: List<String>) {
      cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
    }

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     * for the Access-Control-Allow-Methods HTTP response header. 
     */
    override fun accessControlAllowMethods(vararg accessControlAllowMethods: String): Unit =
        accessControlAllowMethods(accessControlAllowMethods.toList())

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     * the value for the Access-Control-Allow-Origin HTTP response header. 
     * You can specify `['*']` to allow all origins.
     */
    override fun accessControlAllowOrigins(accessControlAllowOrigins: List<String>) {
      cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
    }

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     * the value for the Access-Control-Allow-Origin HTTP response header. 
     * You can specify `['*']` to allow all origins.
     */
    override fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String): Unit =
        accessControlAllowOrigins(accessControlAllowOrigins.toList())

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     * for the Access-Control-Expose-Headers HTTP response header.
     * You can specify `['*']` to expose all headers.
     */
    override fun accessControlExposeHeaders(accessControlExposeHeaders: List<String>) {
      cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
    }

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     * for the Access-Control-Expose-Headers HTTP response header.
     * You can specify `['*']` to expose all headers.
     */
    override fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String): Unit =
        accessControlExposeHeaders(accessControlExposeHeaders.toList())

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the
     * Access-Control-Max-Age HTTP response header.
     */
    override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    /**
     * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
     * headers received from the origin with the ones specified in this response headers policy. 
     */
    override fun originOverride(originOverride: Boolean) {
      cdkBuilder.originOverride(originOverride)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior,
  ) : ResponseHeadersCorsBehavior {
    /**
     * A Boolean that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP
     * response header.
     */
    override fun accessControlAllowCredentials(): Boolean =
        unwrap(this).getAccessControlAllowCredentials()

    /**
     * A list of HTTP header names that CloudFront includes as values for the
     * Access-Control-Allow-Headers HTTP response header.
     *
     * You can specify `['*']` to allow all headers.
     */
    override fun accessControlAllowHeaders(): List<String> =
        unwrap(this).getAccessControlAllowHeaders()

    /**
     * A list of HTTP methods that CloudFront includes as values for the
     * Access-Control-Allow-Methods HTTP response header.
     */
    override fun accessControlAllowMethods(): List<String> =
        unwrap(this).getAccessControlAllowMethods()

    /**
     * A list of origins (domain names) that CloudFront can use as the value for the
     * Access-Control-Allow-Origin HTTP response header.
     *
     * You can specify `['*']` to allow all origins.
     */
    override fun accessControlAllowOrigins(): List<String> =
        unwrap(this).getAccessControlAllowOrigins()

    /**
     * A list of HTTP headers that CloudFront includes as values for the
     * Access-Control-Expose-Headers HTTP response header.
     *
     * You can specify `['*']` to expose all headers.
     *
     * Default: - no headers exposed
     */
    override fun accessControlExposeHeaders(): List<String> =
        unwrap(this).getAccessControlExposeHeaders() ?: emptyList()

    /**
     * A number that CloudFront uses as the value for the Access-Control-Max-Age HTTP response
     * header.
     *
     * Default: - no max age
     */
    override fun accessControlMaxAge(): Duration? =
        unwrap(this).getAccessControlMaxAge()?.let(Duration::wrap)

    /**
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from
     * the origin with the ones specified in this response headers policy.
     */
    override fun originOverride(): Boolean = unwrap(this).getOriginOverride()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersCorsBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior):
        ResponseHeadersCorsBehavior = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersCorsBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior = (wrapped as
        Wrapper).cdkObject
  }
}
