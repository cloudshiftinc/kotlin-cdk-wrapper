@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingPredefinedScalingMetricPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.Builder
      = CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.builder()

  public fun predefinedMetricType(predefinedMetricType: String) {
    cdkBuilder.predefinedMetricType(predefinedMetricType)
  }

  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty =
      cdkBuilder.build()
}
