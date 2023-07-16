@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder =
      CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder()

  public fun contentSecurityPolicy(contentSecurityPolicy: IResolvable) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  public
      fun contentSecurityPolicy(contentSecurityPolicy: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  public fun contentTypeOptions(contentTypeOptions: IResolvable) {
    cdkBuilder.contentTypeOptions(contentTypeOptions)
  }

  public
      fun contentTypeOptions(contentTypeOptions: CfnResponseHeadersPolicy.ContentTypeOptionsProperty) {
    cdkBuilder.contentTypeOptions(contentTypeOptions)
  }

  public fun frameOptions(frameOptions: IResolvable) {
    cdkBuilder.frameOptions(frameOptions)
  }

  public fun frameOptions(frameOptions: CfnResponseHeadersPolicy.FrameOptionsProperty) {
    cdkBuilder.frameOptions(frameOptions)
  }

  public fun referrerPolicy(referrerPolicy: IResolvable) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  public fun referrerPolicy(referrerPolicy: CfnResponseHeadersPolicy.ReferrerPolicyProperty) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  public fun strictTransportSecurity(strictTransportSecurity: IResolvable) {
    cdkBuilder.strictTransportSecurity(strictTransportSecurity)
  }

  public
      fun strictTransportSecurity(strictTransportSecurity: CfnResponseHeadersPolicy.StrictTransportSecurityProperty) {
    cdkBuilder.strictTransportSecurity(strictTransportSecurity)
  }

  public fun xssProtection(xssProtection: IResolvable) {
    cdkBuilder.xssProtection(xssProtection)
  }

  public fun xssProtection(xssProtection: CfnResponseHeadersPolicy.XSSProtectionProperty) {
    cdkBuilder.xssProtection(xssProtection)
  }

  public fun build(): CfnResponseHeadersPolicy.SecurityHeadersConfigProperty = cdkBuilder.build()
}
