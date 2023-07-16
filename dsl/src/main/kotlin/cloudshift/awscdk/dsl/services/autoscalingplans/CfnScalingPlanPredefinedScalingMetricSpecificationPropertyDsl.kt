@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@CdkDslMarker
public class CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder =
      CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.builder()

  public fun predefinedScalingMetricType(predefinedScalingMetricType: String) {
    cdkBuilder.predefinedScalingMetricType(predefinedScalingMetricType)
  }

  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun build(): CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
      cdkBuilder.build()
}
