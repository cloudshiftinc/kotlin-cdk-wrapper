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
 * Basic properties for a lifecycle hook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * ILifecycleHookTarget lifecycleHookTarget;
 * Role role;
 * BasicLifecycleHookProps basicLifecycleHookProps = BasicLifecycleHookProps.builder()
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
public interface BasicLifecycleHookProps {
  /**
   * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
   * unexpected failure occurs.
   *
   * Default: Continue
   */
  public fun defaultResult(): DefaultResult? =
      unwrap(this).getDefaultResult()?.let(DefaultResult::wrap)

  /**
   * Maximum time between calls to RecordLifecycleActionHeartbeat for the hook.
   *
   * If the lifecycle hook times out, perform the action in DefaultResult.
   *
   * Default: - No heartbeat timeout.
   */
  public fun heartbeatTimeout(): Duration? = unwrap(this).getHeartbeatTimeout()?.let(Duration::wrap)

  /**
   * Name of the lifecycle hook.
   *
   * Default: - Automatically generated name.
   */
  public fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  /**
   * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook.
   */
  public fun lifecycleTransition(): LifecycleTransition

  /**
   * Additional data to pass to the lifecycle hook target.
   *
   * Default: - No metadata.
   */
  public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  /**
   * The target of the lifecycle hook.
   *
   * Default: - No target.
   */
  public fun notificationTarget(): ILifecycleHookTarget? =
      unwrap(this).getNotificationTarget()?.let(ILifecycleHookTarget::wrap)

  /**
   * The role that allows publishing to the notification target.
   *
   * Default: - A role will be created if a target is provided. Otherwise, no role is created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [BasicLifecycleHookProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.builder()

    /**
     * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
     * elapses or if an unexpected failure occurs.
     */
    override fun defaultResult(defaultResult: DefaultResult) {
      cdkBuilder.defaultResult(defaultResult.let(DefaultResult::unwrap))
    }

    /**
     * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
     * hook.
     * If the lifecycle hook times out, perform the action in DefaultResult.
     */
    override fun heartbeatTimeout(heartbeatTimeout: Duration) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Duration::unwrap))
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
      cdkBuilder.lifecycleTransition(lifecycleTransition.let(LifecycleTransition::unwrap))
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
      cdkBuilder.notificationTarget(notificationTarget.let(ILifecycleHookTarget::unwrap))
    }

    /**
     * @param role The role that allows publishing to the notification target.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps,
  ) : CdkObject(cdkObject), BasicLifecycleHookProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): BasicLifecycleHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps):
        BasicLifecycleHookProps = CdkObjectWrappers.wrap(cdkObject) as? BasicLifecycleHookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicLifecycleHookProps):
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps
  }
}
