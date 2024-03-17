@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Configuration for a set of HTTP response headers that are sent for requests that match a cache
 * behavior that’s associated with this response headers policy.
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
public interface ResponseCustomHeadersBehavior {
  /**
   * The list of HTTP response headers and their values.
   */
  public fun customHeaders(): List<ResponseCustomHeader>

  /**
   * A builder for [ResponseCustomHeadersBehavior]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customHeaders The list of HTTP response headers and their values. 
     */
    public fun customHeaders(customHeaders: List<ResponseCustomHeader>)

    /**
     * @param customHeaders The list of HTTP response headers and their values. 
     */
    public fun customHeaders(vararg customHeaders: ResponseCustomHeader)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.builder()

    /**
     * @param customHeaders The list of HTTP response headers and their values. 
     */
    override fun customHeaders(customHeaders: List<ResponseCustomHeader>) {
      cdkBuilder.customHeaders(customHeaders.map(ResponseCustomHeader::unwrap))
    }

    /**
     * @param customHeaders The list of HTTP response headers and their values. 
     */
    override fun customHeaders(vararg customHeaders: ResponseCustomHeader): Unit =
        customHeaders(customHeaders.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior,
  ) : CdkObject(cdkObject), ResponseCustomHeadersBehavior {
    /**
     * The list of HTTP response headers and their values.
     */
    override fun customHeaders(): List<ResponseCustomHeader> =
        unwrap(this).getCustomHeaders().map(ResponseCustomHeader::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeadersBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior):
        ResponseCustomHeadersBehavior = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseCustomHeadersBehavior ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseCustomHeadersBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
  }
}
