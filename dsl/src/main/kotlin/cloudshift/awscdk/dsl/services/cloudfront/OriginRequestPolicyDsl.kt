@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior
import software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior
import software.constructs.Construct

@CdkDslMarker
public class OriginRequestPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OriginRequestPolicy.Builder = OriginRequestPolicy.Builder.create(scope,
      id)

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
    cdkBuilder.cookieBehavior(cookieBehavior)
  }

  public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
    cdkBuilder.headerBehavior(headerBehavior)
  }

  public fun originRequestPolicyName(originRequestPolicyName: String) {
    cdkBuilder.originRequestPolicyName(originRequestPolicyName)
  }

  public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
    cdkBuilder.queryStringBehavior(queryStringBehavior)
  }

  public fun build(): OriginRequestPolicy = cdkBuilder.build()
}
