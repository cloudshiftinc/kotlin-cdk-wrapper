@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
import software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior

/**
 * Configuration for a set of security-related HTTP response headers.
 *
 * CloudFront adds these headers to HTTP responses that it sends for requests that match a cache
 * behavior
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
@CdkDslMarker
public class ResponseSecurityHeadersBehaviorDsl {
  private val cdkBuilder: ResponseSecurityHeadersBehavior.Builder =
      ResponseSecurityHeadersBehavior.builder()

  /**
   * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as
   * values for the Content-Security-Policy HTTP response header.
   */
  public
      fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicyDsl.() -> Unit
      = {}) {
    val builder = ResponseHeadersContentSecurityPolicyDsl()
    builder.apply(contentSecurityPolicy)
    cdkBuilder.contentSecurityPolicy(builder.build())
  }

  /**
   * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as
   * values for the Content-Security-Policy HTTP response header.
   */
  public fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  /**
   * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
   * HTTP response header with its value set to nosniff.
   */
  public fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptionsDsl.() -> Unit
      = {}) {
    val builder = ResponseHeadersContentTypeOptionsDsl()
    builder.apply(contentTypeOptions)
    cdkBuilder.contentTypeOptions(builder.build())
  }

  /**
   * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
   * HTTP response header with its value set to nosniff.
   */
  public fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions) {
    cdkBuilder.contentTypeOptions(contentTypeOptions)
  }

  /**
   * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
   * header and the header’s value.
   */
  public fun frameOptions(frameOptions: ResponseHeadersFrameOptionsDsl.() -> Unit = {}) {
    val builder = ResponseHeadersFrameOptionsDsl()
    builder.apply(frameOptions)
    cdkBuilder.frameOptions(builder.build())
  }

  /**
   * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
   * header and the header’s value.
   */
  public fun frameOptions(frameOptions: ResponseHeadersFrameOptions) {
    cdkBuilder.frameOptions(frameOptions)
  }

  /**
   * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP response
   * header and the header’s value.
   */
  public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicyDsl.() -> Unit = {}) {
    val builder = ResponseHeadersReferrerPolicyDsl()
    builder.apply(referrerPolicy)
    cdkBuilder.referrerPolicy(builder.build())
  }

  /**
   * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP response
   * header and the header’s value.
   */
  public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  /**
   * @param strictTransportSecurity Determines whether CloudFront includes the
   * Strict-Transport-Security HTTP response header and the header’s value.
   */
  public
      fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurityDsl.() -> Unit
      = {}) {
    val builder = ResponseHeadersStrictTransportSecurityDsl()
    builder.apply(strictTransportSecurity)
    cdkBuilder.strictTransportSecurity(builder.build())
  }

  /**
   * @param strictTransportSecurity Determines whether CloudFront includes the
   * Strict-Transport-Security HTTP response header and the header’s value.
   */
  public
      fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity) {
    cdkBuilder.strictTransportSecurity(strictTransportSecurity)
  }

  /**
   * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP response
   * header and the header’s value.
   */
  public fun xssProtection(xssProtection: ResponseHeadersXSSProtectionDsl.() -> Unit = {}) {
    val builder = ResponseHeadersXSSProtectionDsl()
    builder.apply(xssProtection)
    cdkBuilder.xssProtection(builder.build())
  }

  /**
   * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP response
   * header and the header’s value.
   */
  public fun xssProtection(xssProtection: ResponseHeadersXSSProtection) {
    cdkBuilder.xssProtection(xssProtection)
  }

  public fun build(): ResponseSecurityHeadersBehavior = cdkBuilder.build()
}
