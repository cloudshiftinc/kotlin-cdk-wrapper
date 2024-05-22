@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Lifecycle hook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * AutoScalingGroup autoScalingGroup;
 * ILifecycleHookTarget lifecycleHookTarget;
 * Role role;
 * LifecycleHookProps lifecycleHookProps = LifecycleHookProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
 * // the properties below are optional
 * .defaultResult(DefaultResult.CONTINUE)
 * .heartbeatTimeout(Duration.minutes(30))
 * .lifecycleHookName("lifecycleHookName")
 * .notificationMetadata("notificationMetadata")
 * .notificationTarget(lifecycleHookTarget)
 * .role(role)
 * .build();
 * ```
 */
public interface LifecycleHookProps : BasicLifecycleHookProps {
  /**
   * The AutoScalingGroup to add the lifecycle hook to.
   */
  public fun autoScalingGroup(): IAutoScalingGroup

  /**
   * A builder for [LifecycleHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs.
     */
    public fun defaultResult(defaultResult: DefaultResult)

    /**
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     * hook.
     * If the lifecycle hook times out, perform the action in DefaultResult.
     */
    public fun heartbeatTimeout(heartbeatTimeout: Duration)

    /**
     * @param lifecycleHookName Name of the lifecycle hook.
     */
    public fun lifecycleHookName(lifecycleHookName: String)

    /**
     * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach
     * the lifecycle hook. 
     */
    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition)

    /**
     * @param notificationMetadata Additional data to pass to the lifecycle hook target.
     */
    public fun notificationMetadata(notificationMetadata: String)

    /**
     * @param notificationTarget The target of the lifecycle hook.
     */
    public fun notificationTarget(notificationTarget: ILifecycleHookTarget)

    /**
     * @param role The role that allows publishing to the notification target.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder =
        software.amazon.awscdk.services.autoscaling.LifecycleHookProps.builder()

    /**
     * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup.Companion::unwrap))
    }

    /**
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs.
     */
    override fun defaultResult(defaultResult: DefaultResult) {
      cdkBuilder.defaultResult(defaultResult.let(DefaultResult.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     * hook.
     * If the lifecycle hook times out, perform the action in DefaultResult.
     */
    override fun heartbeatTimeout(heartbeatTimeout: Duration) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param lifecycleHookName Name of the lifecycle hook.
     */
    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach
     * the lifecycle hook. 
     */
    override fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
      cdkBuilder.lifecycleTransition(lifecycleTransition.let(LifecycleTransition.Companion::unwrap))
    }

    /**
     * @param notificationMetadata Additional data to pass to the lifecycle hook target.
     */
    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * @param notificationTarget The target of the lifecycle hook.
     */
    override fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
      cdkBuilder.notificationTarget(notificationTarget.let(ILifecycleHookTarget.Companion::unwrap))
    }

    /**
     * @param role The role that allows publishing to the notification target.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.LifecycleHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookProps,
  ) : CdkObject(cdkObject), LifecycleHookProps {
    /**
     * The AutoScalingGroup to add the lifecycle hook to.
     */
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * Default: Continue
     */
    override fun defaultResult(): DefaultResult? =
        unwrap(this).getDefaultResult()?.let(DefaultResult::wrap)

    /**
     * Maximum time between calls to RecordLifecycleActionHeartbeat for the hook.
     *
     * If the lifecycle hook times out, perform the action in DefaultResult.
     *
     * Default: - No heartbeat timeout.
     */
    override fun heartbeatTimeout(): Duration? =
        unwrap(this).getHeartbeatTimeout()?.let(Duration::wrap)

    /**
     * Name of the lifecycle hook.
     *
     * Default: - Automatically generated name.
     */
    override fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

    /**
     * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook.
     */
    override fun lifecycleTransition(): LifecycleTransition =
        unwrap(this).getLifecycleTransition().let(LifecycleTransition::wrap)

    /**
     * Additional data to pass to the lifecycle hook target.
     *
     * Default: - No metadata.
     */
    override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    /**
     * The target of the lifecycle hook.
     *
     * Default: - No target.
     */
    override fun notificationTarget(): ILifecycleHookTarget? =
        unwrap(this).getNotificationTarget()?.let(ILifecycleHookTarget::wrap)

    /**
     * The role that allows publishing to the notification target.
     *
     * Default: - A role will be created if a target is provided. Otherwise, no role is created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookProps):
        LifecycleHookProps = CdkObjectWrappers.wrap(cdkObject) as? LifecycleHookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleHookProps):
        software.amazon.awscdk.services.autoscaling.LifecycleHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.LifecycleHookProps
  }
}
