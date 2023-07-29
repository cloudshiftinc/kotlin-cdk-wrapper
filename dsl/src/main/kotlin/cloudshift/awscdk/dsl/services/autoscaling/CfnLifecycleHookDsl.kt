@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.constructs.Construct

/**
 * The `AWS::AutoScaling::LifecycleHook` resource specifies lifecycle hooks for an Auto Scaling
 * group.
 *
 * These hooks let you create solutions that are aware of events in the Auto Scaling instance
 * lifecycle, and then perform a custom action on instances when the corresponding lifecycle event
 * occurs. A lifecycle hook provides a specified amount of time (one hour by default) to wait for
 * the action to complete before the instance transitions to the next state.
 *
 * Use lifecycle hooks to prepare new instances for use or to delay them from being registered
 * behind a load balancer before their configuration has been applied completely. You can also use
 * lifecycle hooks to prepare running instances to be terminated by, for example, downloading logs
 * or other data.
 *
 * For more information, see
 * [Amazon EC2 Auto Scaling lifecycle hooks](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * CfnLifecycleHook cfnLifecycleHook = CfnLifecycleHook.Builder.create(this, "MyCfnLifecycleHook")
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
@CdkDslMarker
public class CfnLifecycleHookDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLifecycleHook.Builder = CfnLifecycleHook.Builder.create(scope, id)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-autoscalinggroupname)
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-defaultresult)
     *
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     *   elapses or if an unexpected failure occurs.
     */
    public fun defaultResult(defaultResult: String) {
        cdkBuilder.defaultResult(defaultResult)
    }

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     *
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-heartbeattimeout)
     *
     * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
     *   hook times out.
     */
    public fun heartbeatTimeout(heartbeatTimeout: Number) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * The name of the lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
     *
     * @param lifecycleHookName The name of the lifecycle hook.
     */
    public fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
     * * To create a lifecycle hook for scale-out events, specify
     *   `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     *   `autoscaling:EC2_INSTANCE_TERMINATING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecycletransition)
     *
     * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
     *   major lifecycle transitions.
     */
    public fun lifecycleTransition(lifecycleTransition: String) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    /**
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
     * message to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationmetadata)
     *
     * @param notificationMetadata Additional information that you want to include any time Amazon
     *   EC2 Auto Scaling sends a message to the notification target.
     */
    public fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
     * notifications to when an instance is in a wait state for the lifecycle hook.
     *
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationtargetarn)
     *
     * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
     *   Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
     *   lifecycle hook.
     */
    public fun notificationTargetArn(notificationTargetArn: String) {
        cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
     * notification target.
     *
     * For information about creating this role, see
     * [Configure a notification target for a lifecycle hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-rolearn)
     *
     * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
     *   specified notification target.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLifecycleHook = cdkBuilder.build()
}
