@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@CdkDslMarker
public class CfnScalingPlanTargetTrackingConfigurationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.TargetTrackingConfigurationProperty.Builder =
      CfnScalingPlan.TargetTrackingConfigurationProperty.builder()

  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CfnScalingPlan.CustomizedScalingMetricSpecificationProperty) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun disableScaleIn(disableScaleIn: IResolvable) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: CfnScalingPlan.PredefinedScalingMetricSpecificationProperty) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  public fun scaleInCooldown(scaleInCooldown: Number) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  public fun scaleOutCooldown(scaleOutCooldown: Number) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnScalingPlan.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
