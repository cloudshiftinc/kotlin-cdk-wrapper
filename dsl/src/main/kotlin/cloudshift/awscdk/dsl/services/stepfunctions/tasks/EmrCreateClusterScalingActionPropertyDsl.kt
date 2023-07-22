@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingActionPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingActionProperty.Builder =
      EmrCreateCluster.ScalingActionProperty.builder()

  /**
   * @param market Not available for instance groups.
   * Instance groups use the market type specified for the group.
   */
  public fun market(market: EmrCreateCluster.InstanceMarket) {
    cdkBuilder.market(market)
  }

  /**
   * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
   * makes when triggered, and the periodicity of the adjustment. 
   */
  public
      fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl()
    builder.apply(simpleScalingPolicyConfiguration)
    cdkBuilder.simpleScalingPolicyConfiguration(builder.build())
  }

  /**
   * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
   * makes when triggered, and the periodicity of the adjustment. 
   */
  public
      fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  public fun build(): EmrCreateCluster.ScalingActionProperty = cdkBuilder.build()
}
