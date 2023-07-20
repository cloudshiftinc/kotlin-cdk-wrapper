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

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy) {
    cdkBuilder.referrerPolicy(referrerPolicy)
  }

  public fun build(): ResponseHeadersReferrerPolicy = cdkBuilder.build()
}
