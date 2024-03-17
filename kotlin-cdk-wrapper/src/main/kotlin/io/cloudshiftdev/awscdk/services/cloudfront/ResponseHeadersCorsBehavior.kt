@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Configuration for a set of HTTP response headers that are used for cross-origin resource sharing
 * (CORS).
 *
 * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
 * cache behavior
 * associated with this response headers policy.
 *
 * Example:
 *
 * ```
 * // Using an existing managed response headers policy
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
 * .build())
 * .build();
 * // Creating a custom response headers policy -- all parameters optional
 * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
 * "ResponseHeadersPolicy")
 * .responseHeadersPolicyName("MyPolicy")
 * .comment("A default policy")
 * .corsBehavior(ResponseHeadersCorsBehavior.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlAllowMethods(List.of("GET", "POST"))
 * .accessControlAllowOrigins(List.of("*"))
 * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlMaxAge(Duration.seconds(600))
 * .originOverride(true)
 * .build())
 * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
 * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
 * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
 * .build())
 * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
 * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
 * https:;").override(true).build())
 * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
 * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
 * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
 * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
 * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
 * .build())
 * .removeHeaders(List.of("Server"))
 * .serverTimingSamplingRate(50)
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(myResponseHeadersPolicy)
 * .build())
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior,
  ) : CdkObject(cdkObject), ResponseHeadersCorsBehavior {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersCorsBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior):
        ResponseHeadersCorsBehavior = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseHeadersCorsBehavior ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersCorsBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior
  }
}
