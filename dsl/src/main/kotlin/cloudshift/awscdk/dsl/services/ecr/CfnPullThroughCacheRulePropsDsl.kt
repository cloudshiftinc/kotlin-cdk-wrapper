@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps

@CdkDslMarker
public class CfnPullThroughCacheRulePropsDsl {
  private val cdkBuilder: CfnPullThroughCacheRuleProps.Builder =
      CfnPullThroughCacheRuleProps.builder()

  /**
   * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
   * cache rule.
   */
  public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
    cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
  }

  /**
   * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
   * rule.
   */
  public fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
    cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
  }

  public fun build(): CfnPullThroughCacheRuleProps = cdkBuilder.build()
}
