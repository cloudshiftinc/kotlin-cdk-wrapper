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

  public fun contentSecurityPolicy(contentSecurityPolicy: String) {
    cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): ResponseHeadersContentSecurityPolicy = cdkBuilder.build()
}
