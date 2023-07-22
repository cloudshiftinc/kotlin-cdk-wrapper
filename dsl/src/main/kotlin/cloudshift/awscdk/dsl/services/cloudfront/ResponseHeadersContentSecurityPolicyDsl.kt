@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy

@CdkDslMarker
public class ResponseHeadersContentSecurityPolicyDsl {
  private val cdkBuilder: ResponseHeadersContentSecurityPolicy.Builder =
      ResponseHeadersContentSecurityPolicy.builder()

  /**
   * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as
   * values for the Content-Security-Policy HTTP response header. 
   */
  public fun contentSecurityPolicy(contentSecurityPolicy: String) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * Content-Security-Policy HTTP response header received from the origin with the one specified in
   * this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): ResponseHeadersContentSecurityPolicy = cdkBuilder.build()
}
