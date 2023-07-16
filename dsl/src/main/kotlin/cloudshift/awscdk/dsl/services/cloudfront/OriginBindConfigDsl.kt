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

  public fun failoverConfig(block: OriginFailoverConfigDsl.() -> Unit = {}) {
    val builder = OriginFailoverConfigDsl()
    builder.apply(block)
    cdkBuilder.failoverConfig(builder.build())
  }

  public fun failoverConfig(failoverConfig: OriginFailoverConfig) {
    cdkBuilder.failoverConfig(failoverConfig)
  }

  public fun originProperty(block: CfnDistributionOriginPropertyDsl.() -> Unit = {}) {
    val builder = CfnDistributionOriginPropertyDsl()
    builder.apply(block)
    cdkBuilder.originProperty(builder.build())
  }

  public fun originProperty(originProperty: CfnDistribution.OriginProperty) {
    cdkBuilder.originProperty(originProperty)
  }

  public fun build(): OriginBindConfig = cdkBuilder.build()
}
