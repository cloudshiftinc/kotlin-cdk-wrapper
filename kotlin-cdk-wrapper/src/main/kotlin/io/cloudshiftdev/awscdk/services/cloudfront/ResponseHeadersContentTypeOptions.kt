@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Determines whether CloudFront includes the X-Content-Type-Options HTTP response header with its
 * value set to nosniff.
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
 * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(false).reportUri("https://example.com/csp-report").override(true).build())
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
public interface ResponseHeadersContentTypeOptions {
  /**
   * A Boolean that determines whether CloudFront overrides the X-Content-Type-Options HTTP response
   * header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A builder for [ResponseHeadersContentTypeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * X-Content-Type-Options HTTP response header received from the origin with the one specified in
     * this response headers policy. 
     */
    public fun `override`(`override`: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.builder()

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * X-Content-Type-Options HTTP response header received from the origin with the one specified in
     * this response headers policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions,
  ) : CdkObject(cdkObject),
      ResponseHeadersContentTypeOptions {
    /**
     * A Boolean that determines whether CloudFront overrides the X-Content-Type-Options HTTP
     * response header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersContentTypeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions):
        ResponseHeadersContentTypeOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseHeadersContentTypeOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersContentTypeOptions):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
  }
}
