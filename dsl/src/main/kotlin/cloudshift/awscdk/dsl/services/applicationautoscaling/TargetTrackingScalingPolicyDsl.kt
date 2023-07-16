@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.constructs.Construct

@CdkDslMarker
public class TargetTrackingScalingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TargetTrackingScalingPolicy.Builder =
      TargetTrackingScalingPolicy.Builder.create(scope, id)

  public fun customMetric(customMetric: IMetric) {
    cdkBuilder.customMetric(customMetric)
  }

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
    cdkBuilder.predefinedMetric(predefinedMetric)
  }

  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun scaleInCooldown(scaleInCooldown: Duration) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  public fun scalingTarget(scalingTarget: IScalableTarget) {
    cdkBuilder.scalingTarget(scalingTarget)
  }

  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): TargetTrackingScalingPolicy = cdkBuilder.build()
}
