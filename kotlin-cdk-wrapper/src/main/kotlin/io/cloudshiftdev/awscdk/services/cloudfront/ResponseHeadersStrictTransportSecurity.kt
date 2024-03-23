@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and the
 * header’s value.
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
public interface ResponseHeadersStrictTransportSecurity {
  /**
   * A number that CloudFront uses as the value for the max-age directive in the
   * Strict-Transport-Security HTTP response header.
   */
  public fun accessControlMaxAge(): Duration

  /**
   * A Boolean that determines whether CloudFront includes the includeSubDomains directive in the
   * Strict-Transport-Security HTTP response header.
   *
   * Default: false
   */
  public fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

  /**
   * A Boolean that determines whether CloudFront overrides the Strict-Transport-Security HTTP
   * response header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A Boolean that determines whether CloudFront includes the preload directive in the
   * Strict-Transport-Security HTTP response header.
   *
   * Default: false
   */
  public fun preload(): Boolean? = unwrap(this).getPreload()

  /**
   * A builder for [ResponseHeadersStrictTransportSecurity]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age
     * directive in the Strict-Transport-Security HTTP response header. 
     */
    public fun accessControlMaxAge(accessControlMaxAge: Duration)

    /**
     * @param includeSubdomains A Boolean that determines whether CloudFront includes the
     * includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     */
    public fun includeSubdomains(includeSubdomains: Boolean)

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Strict-Transport-Security HTTP response header received from the origin with the one specified
     * in this response headers policy. 
     */
    public fun `override`(`override`: Boolean)

    /**
     * @param preload A Boolean that determines whether CloudFront includes the preload directive in
     * the Strict-Transport-Security HTTP response header.
     */
    public fun preload(preload: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.builder()

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age
     * directive in the Strict-Transport-Security HTTP response header. 
     */
    override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    /**
     * @param includeSubdomains A Boolean that determines whether CloudFront includes the
     * includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     */
    override fun includeSubdomains(includeSubdomains: Boolean) {
      cdkBuilder.includeSubdomains(includeSubdomains)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Strict-Transport-Security HTTP response header received from the origin with the one specified
     * in this response headers policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    /**
     * @param preload A Boolean that determines whether CloudFront includes the preload directive in
     * the Strict-Transport-Security HTTP response header.
     */
    override fun preload(preload: Boolean) {
      cdkBuilder.preload(preload)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity,
  ) : CdkObject(cdkObject), ResponseHeadersStrictTransportSecurity {
    /**
     * A number that CloudFront uses as the value for the max-age directive in the
     * Strict-Transport-Security HTTP response header.
     */
    override fun accessControlMaxAge(): Duration =
        unwrap(this).getAccessControlMaxAge().let(Duration::wrap)

    /**
     * A Boolean that determines whether CloudFront includes the includeSubDomains directive in the
     * Strict-Transport-Security HTTP response header.
     *
     * Default: false
     */
    override fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

    /**
     * A Boolean that determines whether CloudFront overrides the Strict-Transport-Security HTTP
     * response header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()

    /**
     * A Boolean that determines whether CloudFront includes the preload directive in the
     * Strict-Transport-Security HTTP response header.
     *
     * Default: false
     */
    override fun preload(): Boolean? = unwrap(this).getPreload()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ResponseHeadersStrictTransportSecurity {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity):
        ResponseHeadersStrictTransportSecurity = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseHeadersStrictTransportSecurity ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersStrictTransportSecurity):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
  }
}
