@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLifecycleHook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnLifecycleHookProps cfnLifecycleHookProps = CfnLifecycleHookProps.builder()
 * .autoScalingGroupName("autoScalingGroupName")
 * .lifecycleTransition("lifecycleTransition")
 * // the properties below are optional
 * .defaultResult("defaultResult")
 * .heartbeatTimeout(123)
 * .lifecycleHookName("lifecycleHookName")
 * .notificationMetadata("notificationMetadata")
 * .notificationTargetArn("notificationTargetArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html)
 */
public interface CfnLifecycleHookProps {
  /**
   * The name of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-autoscalinggroupname)
   */
  public fun autoScalingGroupName(): String

  /**
   * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
   * unexpected failure occurs.
   *
   * The default value is `ABANDON` .
   *
   * Valid values: `CONTINUE` | `ABANDON`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-defaultresult)
   */
  public fun defaultResult(): String? = unwrap(this).getDefaultResult()

  /**
   * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
   *
   * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-heartbeattimeout)
   */
  public fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

  /**
   * The name of the lifecycle hook.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
   */
  public fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  /**
   * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
   *
   * * To create a lifecycle hook for scale-out events, specify `autoscaling:EC2_INSTANCE_LAUNCHING`
   * .
   * * To create a lifecycle hook for scale-in events, specify
   * `autoscaling:EC2_INSTANCE_TERMINATING` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecycletransition)
   */
  public fun lifecycleTransition(): String

  /**
   * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
   * message to the notification target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationmetadata)
   */
  public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  /**
   * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
   * notifications to when an instance is in a wait state for the lifecycle hook.
   *
   * You can specify an Amazon SNS topic or an Amazon SQS queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationtargetarn)
   */
  public fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

  /**
   * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
   * notification target.
   *
   * For information about creating this role, see [Prepare to add a lifecycle hook to your Auto
   * Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A builder for [CfnLifecycleHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs.
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     */
    public fun defaultResult(defaultResult: String)

    /**
     * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
     * hook times out.
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     */
    public fun heartbeatTimeout(heartbeatTimeout: Number)

    /**
     * @param lifecycleHookName The name of the lifecycle hook.
     */
    public fun lifecycleHookName(lifecycleHookName: String)

    /**
     * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
     * major lifecycle transitions. 
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     */
    public fun lifecycleTransition(lifecycleTransition: String)

    /**
     * @param notificationMetadata Additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     */
    public fun notificationMetadata(notificationMetadata: String)

    /**
     * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
     * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
     * lifecycle hook.
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     */
    public fun notificationTargetArn(notificationTargetArn: String)

    /**
     * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
     * specified notification target.
     * For information about creating this role, see [Prepare to add a lifecycle hook to your Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.builder()

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs.
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     */
    override fun defaultResult(defaultResult: String) {
      cdkBuilder.defaultResult(defaultResult)
    }

    /**
     * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
     * hook times out.
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     */
    override fun heartbeatTimeout(heartbeatTimeout: Number) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param lifecycleHookName The name of the lifecycle hook.
     */
    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
     * major lifecycle transitions. 
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     */
    override fun lifecycleTransition(lifecycleTransition: String) {
      cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    /**
     * @param notificationMetadata Additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     */
    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
     * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
     * lifecycle hook.
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     */
    override fun notificationTargetArn(notificationTargetArn: String) {
      cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    /**
     * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
     * specified notification target.
     * For information about creating this role, see [Prepare to add a lifecycle hook to your Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps,
  ) : CdkObject(cdkObject),
      CfnLifecycleHookProps {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-autoscalinggroupname)
     */
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-defaultresult)
     */
    override fun defaultResult(): String? = unwrap(this).getDefaultResult()

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     *
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-heartbeattimeout)
     */
    override fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

    /**
     * The name of the lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
     */
    override fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

    /**
     * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
     *
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecycletransition)
     */
    override fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

    /**
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
     * message to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationmetadata)
     */
    override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
     * notifications to when an instance is in a wait state for the lifecycle hook.
     *
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationtargetarn)
     */
    override fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
     * notification target.
     *
     * For information about creating this role, see [Prepare to add a lifecycle hook to your Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecycleHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps):
        CfnLifecycleHookProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLifecycleHookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecycleHookProps):
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
  }
}
