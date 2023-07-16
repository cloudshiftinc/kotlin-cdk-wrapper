@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder =
      EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder()

  public fun adjustmentType(adjustmentType: EmrCreateCluster.ScalingAdjustmentType) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  public fun coolDown(coolDown: Number) {
    cdkBuilder.coolDown(coolDown)
  }

  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): EmrCreateCluster.SimpleScalingPolicyConfigurationProperty = cdkBuilder.build()
}
