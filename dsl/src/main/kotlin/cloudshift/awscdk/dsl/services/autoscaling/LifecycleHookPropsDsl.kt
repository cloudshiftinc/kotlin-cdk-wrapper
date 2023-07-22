@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.DefaultResult
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.amazon.awscdk.services.autoscaling.LifecycleTransition
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class LifecycleHookPropsDsl {
  private val cdkBuilder: LifecycleHookProps.Builder = LifecycleHookProps.builder()

  /**
   * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to. 
   */
  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  /**
   * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
   * elapses or if an unexpected failure occurs.
   */
  public fun defaultResult(defaultResult: DefaultResult) {
    cdkBuilder.defaultResult(defaultResult)
  }

  /**
   * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
   * hook.
   * If the lifecycle hook times out, perform the action in DefaultResult.
   */
  public fun heartbeatTimeout(heartbeatTimeout: Duration) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * @param lifecycleHookName Name of the lifecycle hook.
   */
  public fun lifecycleHookName(lifecycleHookName: String) {
    cdkBuilder.lifecycleHookName(lifecycleHookName)
  }

  /**
   * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach the
   * lifecycle hook. 
   */
  public fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
    cdkBuilder.lifecycleTransition(lifecycleTransition)
  }

  /**
   * @param notificationMetadata Additional data to pass to the lifecycle hook target.
   */
  public fun notificationMetadata(notificationMetadata: String) {
    cdkBuilder.notificationMetadata(notificationMetadata)
  }

  /**
   * @param notificationTarget The target of the lifecycle hook.
   */
  public fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
    cdkBuilder.notificationTarget(notificationTarget)
  }

  /**
   * @param role The role that allows publishing to the notification target.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LifecycleHookProps = cdkBuilder.build()
}
