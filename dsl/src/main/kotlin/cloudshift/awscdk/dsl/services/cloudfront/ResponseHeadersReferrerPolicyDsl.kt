@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy

@CdkDslMarker
public class ResponseHeadersReferrerPolicyDsl {
  private val cdkBuilder: ResponseHeadersReferrerPolicy.Builder =
      ResponseHeadersReferrerPolicy.builder()

  /**
   * @param override A Boolean that determines whether CloudFront overrides the Referrer-Policy HTTP
   * response header received from the origin with the one specified in this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param referrerPolicy The value of the Referrer-Policy HTTP response header. 
   */
  public fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  public fun build(): ResponseHeadersReferrerPolicy = cdkBuilder.build()
}
