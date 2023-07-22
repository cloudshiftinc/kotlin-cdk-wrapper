@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnResponseHeadersPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResponseHeadersPolicy.Builder =
      CfnResponseHeadersPolicy.Builder.create(scope, id)

  /**
   * A response headers policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
   * @param responseHeadersPolicyConfig A response headers policy configuration. 
   */
  public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
    cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
  }

  /**
   * A response headers policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
   * @param responseHeadersPolicyConfig A response headers policy configuration. 
   */
  public
      fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty) {
    cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
  }

  public fun build(): CfnResponseHeadersPolicy = cdkBuilder.build()
}
