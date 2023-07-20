@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingActionPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingActionProperty.Builder =
      EmrCreateCluster.ScalingActionProperty.builder()

  public fun market(market: EmrCreateCluster.InstanceMarket) {
    cdkBuilder.market(market)
  }

  public
      fun simpleScalingPolicyConfiguration(block: EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl()
    builder.apply(block)
    cdkBuilder.simpleScalingPolicyConfiguration(builder.build())
  }

  public
      fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  public fun build(): EmrCreateCluster.ScalingActionProperty = cdkBuilder.build()
}
