@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps

@CdkDslMarker
public class CfnCachePolicyPropsDsl {
  private val cdkBuilder: CfnCachePolicyProps.Builder = CfnCachePolicyProps.builder()

  /**
   * @param cachePolicyConfig The cache policy configuration. 
   */
  public fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
    cdkBuilder.cachePolicyConfig(cachePolicyConfig)
  }

  /**
   * @param cachePolicyConfig The cache policy configuration. 
   */
  public fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty) {
    cdkBuilder.cachePolicyConfig(cachePolicyConfig)
  }

  public fun build(): CfnCachePolicyProps = cdkBuilder.build()
}
