@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnCachePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCachePolicy.Builder = CfnCachePolicy.Builder.create(scope, id)

  /**
   * The cache policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
   * @param cachePolicyConfig The cache policy configuration. 
   */
  public fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
    cdkBuilder.cachePolicyConfig(cachePolicyConfig)
  }

  /**
   * The cache policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
   * @param cachePolicyConfig The cache policy configuration. 
   */
  public fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty) {
    cdkBuilder.cachePolicyConfig(cachePolicyConfig)
  }

  public fun build(): CfnCachePolicy = cdkBuilder.build()
}
