@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder =
      CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.builder()

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty =
      cdkBuilder.build()
}
