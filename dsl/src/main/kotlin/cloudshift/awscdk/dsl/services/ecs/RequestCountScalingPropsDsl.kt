@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.RequestCountScalingProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup

@CdkDslMarker
public class RequestCountScalingPropsDsl {
  private val cdkBuilder: RequestCountScalingProps.Builder = RequestCountScalingProps.builder()

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
   * @param requestsPerTarget The number of ALB requests per target. 
   */
  public fun requestsPerTarget(requestsPerTarget: Number) {
    cdkBuilder.requestsPerTarget(requestsPerTarget)
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
   * @param targetGroup The ALB target group name. 
   */
  public fun targetGroup(targetGroup: ApplicationTargetGroup) {
    cdkBuilder.targetGroup(targetGroup)
  }

  public fun build(): RequestCountScalingProps = cdkBuilder.build()
}
