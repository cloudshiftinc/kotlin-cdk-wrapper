@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps

/**
 * The properties for enabling scaling based on CPU utilization.
 *
 * Example:
 *
 * ```
 * ApplicationTargetGroup target;
 * BaseService service;
 * ScalableTaskCount scaling =
 * service.autoScaleTaskCount(EnableScalingProps.builder().maxCapacity(10).build());
 * scaling.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * scaling.scaleOnRequestCount("RequestScaling", RequestCountScalingProps.builder()
 * .requestsPerTarget(10000)
 * .targetGroup(target)
 * .build());
 * ```
 */
@CdkDslMarker
public class CpuUtilizationScalingPropsDsl {
  private val cdkBuilder: CpuUtilizationScalingProps.Builder = CpuUtilizationScalingProps.builder()

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
   * If the value is true, scale in is disabled and the target tracking policy
   * won't remove capacity from the scalable resource. Otherwise, scale in is
   * enabled and the target tracking policy can remove capacity from the
   * scalable resource.
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param policyName A name for the scaling policy.
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param scaleInCooldown Period after a scale in activity completes before another scale in
   * activity can start.
   */
  public fun scaleInCooldown(scaleInCooldown: Duration) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  /**
   * @param scaleOutCooldown Period after a scale out activity completes before another scale out
   * activity can start.
   */
  public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  /**
   * @param targetUtilizationPercent The target value for CPU utilization across all tasks in the
   * service. 
   */
  public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
    cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
  }

  public fun build(): CpuUtilizationScalingProps = cdkBuilder.build()
}
