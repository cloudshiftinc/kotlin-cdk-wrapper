@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and
 * the header's value.
 *
 * For more information about the `Strict-Transport-Security` HTTP response header, see
 * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
 * in the MDN Web Docs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * StrictTransportSecurityProperty strictTransportSecurityProperty =
 * StrictTransportSecurityProperty.builder()
 * .accessControlMaxAgeSec(123)
 * .override(false)
 * // the properties below are optional
 * .includeSubdomains(false)
 * .preload(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder =
      CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder()

  /**
   * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the `max-age`
   * directive in the `Strict-Transport-Security` HTTP response header. 
   */
  public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
    cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
  }

  /**
   * @param includeSubdomains A Boolean that determines whether CloudFront includes the
   * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
   */
  public fun includeSubdomains(includeSubdomains: Boolean) {
    cdkBuilder.includeSubdomains(includeSubdomains)
  }

  /**
   * @param includeSubdomains A Boolean that determines whether CloudFront includes the
   * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
   */
  public fun includeSubdomains(includeSubdomains: IResolvable) {
    cdkBuilder.includeSubdomains(includeSubdomains)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * `Strict-Transport-Security` HTTP response header received from the origin with the one specified
   * in this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * `Strict-Transport-Security` HTTP response header received from the origin with the one specified
   * in this response headers policy. 
   */
  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param preload A Boolean that determines whether CloudFront includes the `preload` directive in
   * the `Strict-Transport-Security` HTTP response header.
   */
  public fun preload(preload: Boolean) {
    cdkBuilder.preload(preload)
  }

  /**
   * @param preload A Boolean that determines whether CloudFront includes the `preload` directive in
   * the `Strict-Transport-Security` HTTP response header.
   */
  public fun preload(preload: IResolvable) {
    cdkBuilder.preload(preload)
  }

  public fun build(): CfnResponseHeadersPolicy.StrictTransportSecurityProperty = cdkBuilder.build()
}
