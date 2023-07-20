@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@CdkDslMarker
public class CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder =
      CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.builder()

  public fun predefinedLoadMetricType(predefinedLoadMetricType: String) {
    cdkBuilder.predefinedLoadMetricType(predefinedLoadMetricType)
  }

  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun build(): CfnScalingPlan.PredefinedLoadMetricSpecificationProperty = cdkBuilder.build()
}
