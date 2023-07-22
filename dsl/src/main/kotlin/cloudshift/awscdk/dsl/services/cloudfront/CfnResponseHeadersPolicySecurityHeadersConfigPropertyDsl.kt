@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder =
      CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder()

  /**
   * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as
   * values for the `Content-Security-Policy` HTTP response header.
   * For more information about the `Content-Security-Policy` HTTP response header, see
   * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
   * in the MDN Web Docs.
   */
  public fun contentSecurityPolicy(contentSecurityPolicy: IResolvable) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  /**
   * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as
   * values for the `Content-Security-Policy` HTTP response header.
   * For more information about the `Content-Security-Policy` HTTP response header, see
   * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
   * in the MDN Web Docs.
   */
  public
      fun contentSecurityPolicy(contentSecurityPolicy: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  /**
   * @param contentTypeOptions Determines whether CloudFront includes the `X-Content-Type-Options`
   * HTTP response header with its value set to `nosniff` .
   * For more information about the `X-Content-Type-Options` HTTP response header, see
   * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
   * in the MDN Web Docs.
   */
  public fun contentTypeOptions(contentTypeOptions: IResolvable) {
    cdkBuilder.contentTypeOptions(contentTypeOptions)
  }

  /**
   * @param contentTypeOptions Determines whether CloudFront includes the `X-Content-Type-Options`
   * HTTP response header with its value set to `nosniff` .
   * For more information about the `X-Content-Type-Options` HTTP response header, see
   * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
   * in the MDN Web Docs.
   */
  public
      fun contentTypeOptions(contentTypeOptions: CfnResponseHeadersPolicy.ContentTypeOptionsProperty) {
    cdkBuilder.contentTypeOptions(contentTypeOptions)
  }

  /**
   * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP response
   * header and the header's value.
   * For more information about the `X-Frame-Options` HTTP response header, see
   * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
   * in the MDN Web Docs.
   */
  public fun frameOptions(frameOptions: IResolvable) {
    cdkBuilder.frameOptions(frameOptions)
  }

  /**
   * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP response
   * header and the header's value.
   * For more information about the `X-Frame-Options` HTTP response header, see
   * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
   * in the MDN Web Docs.
   */
  public fun frameOptions(frameOptions: CfnResponseHeadersPolicy.FrameOptionsProperty) {
    cdkBuilder.frameOptions(frameOptions)
  }

  /**
   * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
   * response header and the header's value.
   * For more information about the `Referrer-Policy` HTTP response header, see
   * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
   * in the MDN Web Docs.
   */
  public fun referrerPolicy(referrerPolicy: IResolvable) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  /**
   * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
   * response header and the header's value.
   * For more information about the `Referrer-Policy` HTTP response header, see
   * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
   * in the MDN Web Docs.
   */
  public fun referrerPolicy(referrerPolicy: CfnResponseHeadersPolicy.ReferrerPolicyProperty) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  /**
   * @param strictTransportSecurity Determines whether CloudFront includes the
   * `Strict-Transport-Security` HTTP response header and the header's value.
   * For more information about the `Strict-Transport-Security` HTTP response header, see
   * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
   * in the MDN Web Docs.
   */
  public fun strictTransportSecurity(strictTransportSecurity: IResolvable) {
    cdkBuilder.strictTransportSecurity(strictTransportSecurity)
  }

  /**
   * @param strictTransportSecurity Determines whether CloudFront includes the
   * `Strict-Transport-Security` HTTP response header and the header's value.
   * For more information about the `Strict-Transport-Security` HTTP response header, see
   * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
   * in the MDN Web Docs.
   */
  public
      fun strictTransportSecurity(strictTransportSecurity: CfnResponseHeadersPolicy.StrictTransportSecurityProperty) {
    cdkBuilder.strictTransportSecurity(strictTransportSecurity)
  }

  /**
   * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
   * response header and the header's value.
   * For more information about the `X-XSS-Protection` HTTP response header, see
   * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
   * in the MDN Web Docs.
   */
  public fun xssProtection(xssProtection: IResolvable) {
    cdkBuilder.xssProtection(xssProtection)
  }

  /**
   * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
   * response header and the header's value.
   * For more information about the `X-XSS-Protection` HTTP response header, see
   * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
   * in the MDN Web Docs.
   */
  public fun xssProtection(xssProtection: CfnResponseHeadersPolicy.XSSProtectionProperty) {
    cdkBuilder.xssProtection(xssProtection)
  }

  public fun build(): CfnResponseHeadersPolicy.SecurityHeadersConfigProperty = cdkBuilder.build()
}
