@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupLifecycleHookSpecificationPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder =
      CfnAutoScalingGroup.LifecycleHookSpecificationProperty.builder()

  /**
   * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
   * elapses or if an unexpected failure occurs.
   * The default value is `ABANDON` .
   *
   * Valid values: `CONTINUE` | `ABANDON`
   */
  public fun defaultResult(defaultResult: String) {
    cdkBuilder.defaultResult(defaultResult)
  }

  /**
   * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle hook
   * times out.
   * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
   */
  public fun heartbeatTimeout(heartbeatTimeout: Number) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * @param lifecycleHookName The name of the lifecycle hook. 
   */
  public fun lifecycleHookName(lifecycleHookName: String) {
    cdkBuilder.lifecycleHookName(lifecycleHookName)
  }

  /**
   * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
   * major lifecycle transitions. 
   * * To create a lifecycle hook for scale-out events, specify `autoscaling:EC2_INSTANCE_LAUNCHING`
   * .
   * * To create a lifecycle hook for scale-in events, specify
   * `autoscaling:EC2_INSTANCE_TERMINATING` .
   */
  public fun lifecycleTransition(lifecycleTransition: String) {
    cdkBuilder.lifecycleTransition(lifecycleTransition)
  }

  /**
   * @param notificationMetadata Additional information that you want to include any time Amazon EC2
   * Auto Scaling sends a message to the notification target.
   */
  public fun notificationMetadata(notificationMetadata: String) {
    cdkBuilder.notificationMetadata(notificationMetadata)
  }

  /**
   * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
   * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
   * lifecycle hook.
   * You can specify an Amazon SNS topic or an Amazon SQS queue.
   */
  public fun notificationTargetArn(notificationTargetArn: String) {
    cdkBuilder.notificationTargetArn(notificationTargetArn)
  }

  /**
   * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
   * specified notification target.
   * For information about creating this role, see [Configure a notification target for a lifecycle
   * hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAutoScalingGroup.LifecycleHookSpecificationProperty = cdkBuilder.build()
}
