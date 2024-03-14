package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LifecycleHook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHook,
) : Resource(cdkObject), ILifecycleHook {
  /**
   * The name of this lifecycle hook.
   */
  public open fun lifecycleHookName(): String = unwrap(this).getLifecycleHookName()

  /**
   * The role that allows the ASG to publish to the notification target.
   *
   * Default: - A default role is created if 'notificationTarget' is specified.
   * Otherwise, no role is created.
   */
  public override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.LifecycleHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AutoScalingGroup to add the lifecycle hook to.
     *
     * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * Default: Continue
     *
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs. 
     */
    public fun defaultResult(defaultResult: DefaultResult)

    /**
     * Maximum time between calls to RecordLifecycleActionHeartbeat for the hook.
     *
     * If the lifecycle hook times out, perform the action in DefaultResult.
     *
     * Default: - No heartbeat timeout.
     *
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     * hook. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Duration)

    /**
     * Name of the lifecycle hook.
     *
     * Default: - Automatically generated name.
     *
     * @param lifecycleHookName Name of the lifecycle hook. 
     */
    public fun lifecycleHookName(lifecycleHookName: String)

    /**
     * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook.
     *
     * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach
     * the lifecycle hook. 
     */
    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition)

    /**
     * Additional data to pass to the lifecycle hook target.
     *
     * Default: - No metadata.
     *
     * @param notificationMetadata Additional data to pass to the lifecycle hook target. 
     */
    public fun notificationMetadata(notificationMetadata: String)

    /**
     * The target of the lifecycle hook.
     *
     * Default: - No target.
     *
     * @param notificationTarget The target of the lifecycle hook. 
     */
    public fun notificationTarget(notificationTarget: ILifecycleHookTarget)

    /**
     * The role that allows publishing to the notification target.
     *
     * Default: - A role will be created if a target is provided. Otherwise, no role is created.
     *
     * @param role The role that allows publishing to the notification target. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.LifecycleHook.Builder =
        software.amazon.awscdk.services.autoscaling.LifecycleHook.Builder.create(scope, id)

    /**
     * The AutoScalingGroup to add the lifecycle hook to.
     *
     * @param autoScalingGroup The AutoScalingGroup to add the lifecycle hook to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * Default: Continue
     *
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs. 
     */
    override fun defaultResult(defaultResult: DefaultResult) {
      cdkBuilder.defaultResult(defaultResult.let(DefaultResult::unwrap))
    }

    /**
     * Maximum time between calls to RecordLifecycleActionHeartbeat for the hook.
     *
     * If the lifecycle hook times out, perform the action in DefaultResult.
     *
     * Default: - No heartbeat timeout.
     *
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     * hook. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Duration) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Duration::unwrap))
    }

    /**
     * Name of the lifecycle hook.
     *
     * Default: - Automatically generated name.
     *
     * @param lifecycleHookName Name of the lifecycle hook. 
     */
    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    /**
     * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook.
     *
     * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach
     * the lifecycle hook. 
     */
    override fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
      cdkBuilder.lifecycleTransition(lifecycleTransition.let(LifecycleTransition::unwrap))
    }

    /**
     * Additional data to pass to the lifecycle hook target.
     *
     * Default: - No metadata.
     *
     * @param notificationMetadata Additional data to pass to the lifecycle hook target. 
     */
    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    /**
     * The target of the lifecycle hook.
     *
     * Default: - No target.
     *
     * @param notificationTarget The target of the lifecycle hook. 
     */
    override fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
      cdkBuilder.notificationTarget(notificationTarget.let(ILifecycleHookTarget::unwrap))
    }

    /**
     * The role that allows publishing to the notification target.
     *
     * Default: - A role will be created if a target is provided. Otherwise, no role is created.
     *
     * @param role The role that allows publishing to the notification target. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.LifecycleHook =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LifecycleHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LifecycleHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHook):
        LifecycleHook = LifecycleHook(cdkObject)

    internal fun unwrap(wrapped: LifecycleHook):
        software.amazon.awscdk.services.autoscaling.LifecycleHook = wrapped.cdkObject
  }
}
