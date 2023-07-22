@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps

/**
 * The properties for enabling scaling based on memory utilization.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .desiredCount(1)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .build();
 * ScalableTaskCount scalableTarget =
 * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
 * .minCapacity(1)
 * .maxCapacity(20)
 * .build());
 * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * scalableTarget.scaleOnMemoryUtilization("MemoryScaling", MemoryUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * ```
 */
@CdkDslMarker
public class MemoryUtilizationScalingPropsDsl {
  private val cdkBuilder: MemoryUtilizationScalingProps.Builder =
      MemoryUtilizationScalingProps.builder()

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
   * @param targetUtilizationPercent The target value for memory utilization across all tasks in the
   * service. 
   */
  public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
    cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
  }

  public fun build(): MemoryUtilizationScalingProps = cdkBuilder.build()
}
