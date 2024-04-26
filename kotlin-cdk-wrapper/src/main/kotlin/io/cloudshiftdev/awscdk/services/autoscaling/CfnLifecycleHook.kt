@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AutoScaling::LifecycleHook` resource specifies lifecycle hooks for an Auto Scaling
 * group.
 *
 * These hooks let you create solutions that are aware of events in the Auto Scaling instance
 * lifecycle, and then perform a custom action on instances when the corresponding lifecycle event
 * occurs. A lifecycle hook provides a specified amount of time (one hour by default) to wait for the
 * action to complete before the instance transitions to the next state.
 *
 * Use lifecycle hooks to prepare new instances for use or to delay them from being registered
 * behind a load balancer before their configuration has been applied completely. You can also use
 * lifecycle hooks to prepare running instances to be terminated by, for example, downloading logs or
 * other data.
 *
 * For more information, see [Amazon EC2 Auto Scaling lifecycle
 * hooks](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html) in the *Amazon
 * EC2 Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
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
public open class CfnLifecycleHook(
  cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecycleHookProps,
  ) :
      this(software.amazon.awscdk.services.autoscaling.CfnLifecycleHook(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLifecycleHookProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecycleHookProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLifecycleHookProps(props)
  )

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  /**
   * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
   * unexpected failure occurs.
   */
  public open fun defaultResult(): String? = unwrap(this).getDefaultResult()

  /**
   * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
   * unexpected failure occurs.
   */
  public open fun defaultResult(`value`: String) {
    unwrap(this).setDefaultResult(`value`)
  }

  /**
   * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
   */
  public open fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

  /**
   * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
   */
  public open fun heartbeatTimeout(`value`: Number) {
    unwrap(this).setHeartbeatTimeout(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the lifecycle hook.
   */
  public open fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  /**
   * The name of the lifecycle hook.
   */
  public open fun lifecycleHookName(`value`: String) {
    unwrap(this).setLifecycleHookName(`value`)
  }

  /**
   * The lifecycle transition.
   *
   * For Auto Scaling groups, there are two major lifecycle transitions.
   */
  public open fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

  /**
   * The lifecycle transition.
   *
   * For Auto Scaling groups, there are two major lifecycle transitions.
   */
  public open fun lifecycleTransition(`value`: String) {
    unwrap(this).setLifecycleTransition(`value`)
  }

  /**
   * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
   * message to the notification target.
   */
  public open fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  /**
   * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
   * message to the notification target.
   */
  public open fun notificationMetadata(`value`: String) {
    unwrap(this).setNotificationMetadata(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
   * notifications to when an instance is in a wait state for the lifecycle hook.
   */
  public open fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

  /**
   * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
   * notifications to when an instance is in a wait state for the lifecycle hook.
   */
  public open fun notificationTargetArn(`value`: String) {
    unwrap(this).setNotificationTargetArn(`value`)
  }

  /**
   * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
   * notification target.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
   * notification target.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnLifecycleHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-defaultresult)
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs. 
     */
    public fun defaultResult(defaultResult: String)

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     *
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-heartbeattimeout)
     * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
     * hook times out. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Number)

    /**
     * The name of the lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
     * @param lifecycleHookName The name of the lifecycle hook. 
     */
    public fun lifecycleHookName(lifecycleHookName: String)

    /**
     * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
     *
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecycletransition)
     * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
     * major lifecycle transitions. 
     */
    public fun lifecycleTransition(lifecycleTransition: String)

    /**
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
     * message to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationmetadata)
     * @param notificationMetadata Additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target. 
     */
    public fun notificationMetadata(notificationMetadata: String)

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
     * notifications to when an instance is in a wait state for the lifecycle hook.
     *
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationtargetarn)
     * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
     * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
     * lifecycle hook. 
     */
    public fun notificationTargetArn(notificationTargetArn: String)

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
     * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
     * specified notification target. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder.create(scope, id)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
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
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs. 
     */
    override fun defaultResult(defaultResult: String) {
      cdkBuilder.defaultResult(defaultResult)
    }

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     *
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-heartbeattimeout)
     * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
     * hook times out. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Number) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * The name of the lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
     * @param lifecycleHookName The name of the lifecycle hook. 
     */
    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
     *
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecycletransition)
     * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
     * major lifecycle transitions. 
     */
    override fun lifecycleTransition(lifecycleTransition: String) {
      cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    /**
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
     * message to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationmetadata)
     * @param notificationMetadata Additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target. 
     */
    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
     * notifications to when an instance is in a wait state for the lifecycle hook.
     *
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html#cfn-autoscaling-lifecyclehook-notificationtargetarn)
     * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
     * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
     * lifecycle hook. 
     */
    override fun notificationTargetArn(notificationTargetArn: String) {
      cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

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
     * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
     * specified notification target. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLifecycleHook =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecycleHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecycleHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook):
        CfnLifecycleHook = CfnLifecycleHook(cdkObject)

    internal fun unwrap(wrapped: CfnLifecycleHook):
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
  }
}
