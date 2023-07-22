@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyReferrerPolicyPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder =
      CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder()

  /**
   * @param override A Boolean that determines whether CloudFront overrides the `Referrer-Policy`
   * HTTP response header received from the origin with the one specified in this response headers
   * policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the `Referrer-Policy`
   * HTTP response header received from the origin with the one specified in this response headers
   * policy. 
   */
  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid values
   * are:. 
   * * `no-referrer`
   * * `no-referrer-when-downgrade`
   * * `origin`
   * * `origin-when-cross-origin`
   * * `same-origin`
   * * `strict-origin`
   * * `strict-origin-when-cross-origin`
   * * `unsafe-url`
   *
   * For more information about these values, see
   * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
   * in the MDN Web Docs.
   */
  public fun referrerPolicy(referrerPolicy: String) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  public fun build(): CfnResponseHeadersPolicy.ReferrerPolicyProperty = cdkBuilder.build()
}
