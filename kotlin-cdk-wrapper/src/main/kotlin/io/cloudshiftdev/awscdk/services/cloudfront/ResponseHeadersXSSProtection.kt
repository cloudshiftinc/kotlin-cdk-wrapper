@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Determines whether CloudFront includes the X-XSS-Protection HTTP response header and the header’s
 * value.
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
public interface ResponseHeadersXSSProtection {
  /**
   * A Boolean that determines whether CloudFront includes the mode=block directive in the
   * X-XSS-Protection header.
   *
   * Default: false
   */
  public fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

  /**
   * A Boolean that determines whether CloudFront overrides the X-XSS-Protection HTTP response
   * header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A Boolean that determines the value of the X-XSS-Protection HTTP response header.
   *
   * When this setting is true, the value of the X-XSS-Protection header is 1.
   * When this setting is false, the value of the X-XSS-Protection header is 0.
   */
  public fun protection(): Boolean

  /**
   * A reporting URI, which CloudFront uses as the value of the report directive in the
   * X-XSS-Protection header.
   *
   * You cannot specify a ReportUri when ModeBlock is true.
   *
   * Default: - no report uri
   */
  public fun reportUri(): String? = unwrap(this).getReportUri()

  /**
   * A builder for [ResponseHeadersXSSProtection]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the mode=block
     * directive in the X-XSS-Protection header.
     */
    public fun modeBlock(modeBlock: Boolean)

    /**
     * @param override A Boolean that determines whether CloudFront overrides the X-XSS-Protection
     * HTTP response header received from the origin with the one specified in this response headers
     * policy. 
     */
    public fun `override`(`override`: Boolean)

    /**
     * @param protection A Boolean that determines the value of the X-XSS-Protection HTTP response
     * header. 
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    public fun protection(protection: Boolean)

    /**
     * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive
     * in the X-XSS-Protection header.
     * You cannot specify a ReportUri when ModeBlock is true.
     */
    public fun reportUri(reportUri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.builder()

    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the mode=block
     * directive in the X-XSS-Protection header.
     */
    override fun modeBlock(modeBlock: Boolean) {
      cdkBuilder.modeBlock(modeBlock)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the X-XSS-Protection
     * HTTP response header received from the origin with the one specified in this response headers
     * policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    /**
     * @param protection A Boolean that determines the value of the X-XSS-Protection HTTP response
     * header. 
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    override fun protection(protection: Boolean) {
      cdkBuilder.protection(protection)
    }

    /**
     * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive
     * in the X-XSS-Protection header.
     * You cannot specify a ReportUri when ModeBlock is true.
     */
    override fun reportUri(reportUri: String) {
      cdkBuilder.reportUri(reportUri)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection,
  ) : CdkObject(cdkObject), ResponseHeadersXSSProtection {
    /**
     * A Boolean that determines whether CloudFront includes the mode=block directive in the
     * X-XSS-Protection header.
     *
     * Default: false
     */
    override fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

    /**
     * A Boolean that determines whether CloudFront overrides the X-XSS-Protection HTTP response
     * header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()

    /**
     * A Boolean that determines the value of the X-XSS-Protection HTTP response header.
     *
     * When this setting is true, the value of the X-XSS-Protection header is 1.
     * When this setting is false, the value of the X-XSS-Protection header is 0.
     */
    override fun protection(): Boolean = unwrap(this).getProtection()

    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the
     * X-XSS-Protection header.
     *
     * You cannot specify a ReportUri when ModeBlock is true.
     *
     * Default: - no report uri
     */
    override fun reportUri(): String? = unwrap(this).getReportUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersXSSProtection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection):
        ResponseHeadersXSSProtection = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseHeadersXSSProtection ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersXSSProtection):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection
  }
}
