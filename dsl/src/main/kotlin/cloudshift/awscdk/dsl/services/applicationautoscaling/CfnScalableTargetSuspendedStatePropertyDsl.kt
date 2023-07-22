@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

/**
 * `SuspendedState` is a property of the
 * [AWS::ApplicationAutoScaling::ScalableTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
 * resource that specifies whether the scaling activities for a scalable target are in a suspended
 * state.
 *
 * For more information, see [Suspending and resuming
 * scaling](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html)
 * in the *Application Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * SuspendedStateProperty suspendedStateProperty = SuspendedStateProperty.builder()
 * .dynamicScalingInSuspended(false)
 * .dynamicScalingOutSuspended(false)
 * .scheduledScalingSuspended(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html)
 */
@CdkDslMarker
public class CfnScalableTargetSuspendedStatePropertyDsl {
  private val cdkBuilder: CfnScalableTarget.SuspendedStateProperty.Builder =
      CfnScalableTarget.SuspendedStateProperty.builder()

  /**
   * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a step
   * scaling policy is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when a
   * scaling policy is triggered. The default is `false` .
   */
  public fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean) {
    cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
  }

  /**
   * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a step
   * scaling policy is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when a
   * scaling policy is triggered. The default is `false` .
   */
  public fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable) {
    cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
  }

  /**
   * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or a
   * step scaling policy is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
   * scaling policy is triggered. The default is `false` .
   */
  public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean) {
    cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
  }

  /**
   * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or a
   * step scaling policy is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
   * scaling policy is triggered. The default is `false` .
   */
  public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable) {
    cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
  }

  /**
   * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to add or remove capacity by
   * initiating scheduled actions. The default is `false` .
   */
  public fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean) {
    cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
  }

  /**
   * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
   * Set the value to `true` if you don't want Application Auto Scaling to add or remove capacity by
   * initiating scheduled actions. The default is `false` .
   */
  public fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable) {
    cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
  }

  public fun build(): CfnScalableTarget.SuspendedStateProperty = cdkBuilder.build()
}
