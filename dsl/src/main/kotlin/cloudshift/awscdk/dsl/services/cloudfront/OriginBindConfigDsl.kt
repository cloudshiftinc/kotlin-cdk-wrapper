@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

@CdkDslMarker
public class OriginBindConfigDsl {
  private val cdkBuilder: OriginBindConfig.Builder = OriginBindConfig.builder()

  /**
   * @param failoverConfig The failover configuration for this Origin.
   */
  public fun failoverConfig(failoverConfig: OriginFailoverConfigDsl.() -> Unit = {}) {
    val builder = OriginFailoverConfigDsl()
    builder.apply(failoverConfig)
    cdkBuilder.failoverConfig(builder.build())
  }

  /**
   * @param failoverConfig The failover configuration for this Origin.
   */
  public fun failoverConfig(failoverConfig: OriginFailoverConfig) {
    cdkBuilder.failoverConfig(failoverConfig)
  }

  /**
   * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
   */
  public fun originProperty(originProperty: CfnDistributionOriginPropertyDsl.() -> Unit = {}) {
    val builder = CfnDistributionOriginPropertyDsl()
    builder.apply(originProperty)
    cdkBuilder.originProperty(builder.build())
  }

  /**
   * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
   */
  public fun originProperty(originProperty: CfnDistribution.OriginProperty) {
    cdkBuilder.originProperty(originProperty)
  }

  public fun build(): OriginBindConfig = cdkBuilder.build()
}
