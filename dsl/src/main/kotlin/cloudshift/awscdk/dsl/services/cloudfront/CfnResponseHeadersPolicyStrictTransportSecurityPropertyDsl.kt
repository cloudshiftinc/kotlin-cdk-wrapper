@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

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
