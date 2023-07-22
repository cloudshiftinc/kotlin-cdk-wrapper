@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity

@CdkDslMarker
public class ResponseHeadersStrictTransportSecurityDsl {
  private val cdkBuilder: ResponseHeadersStrictTransportSecurity.Builder =
      ResponseHeadersStrictTransportSecurity.builder()

  /**
   * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age directive
   * in the Strict-Transport-Security HTTP response header. 
   */
  public fun accessControlMaxAge(accessControlMaxAge: Duration) {
    cdkBuilder.accessControlMaxAge(accessControlMaxAge)
  }

  /**
   * @param includeSubdomains A Boolean that determines whether CloudFront includes the
   * includeSubDomains directive in the Strict-Transport-Security HTTP response header.
   */
  public fun includeSubdomains(includeSubdomains: Boolean) {
    cdkBuilder.includeSubdomains(includeSubdomains)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * Strict-Transport-Security HTTP response header received from the origin with the one specified in
   * this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param preload A Boolean that determines whether CloudFront includes the preload directive in
   * the Strict-Transport-Security HTTP response header.
   */
  public fun preload(preload: Boolean) {
    cdkBuilder.preload(preload)
  }

  public fun build(): ResponseHeadersStrictTransportSecurity = cdkBuilder.build()
}
