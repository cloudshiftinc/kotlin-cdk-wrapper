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
