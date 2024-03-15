@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface BasicLifecycleHookProps {
  public fun defaultResult(): DefaultResult? =
      unwrap(this).getDefaultResult()?.let(DefaultResult::wrap)

  public fun heartbeatTimeout(): Duration? = unwrap(this).getHeartbeatTimeout()?.let(Duration::wrap)

  public fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  public fun lifecycleTransition(): LifecycleTransition

  public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  public fun notificationTarget(): ILifecycleHookTarget? =
      unwrap(this).getNotificationTarget()?.let(ILifecycleHookTarget::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun defaultResult(defaultResult: DefaultResult)

    public fun heartbeatTimeout(heartbeatTimeout: Duration)

    public fun lifecycleHookName(lifecycleHookName: String)

    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition)

    public fun notificationMetadata(notificationMetadata: String)

    public fun notificationTarget(notificationTarget: ILifecycleHookTarget)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.builder()

    override fun defaultResult(defaultResult: DefaultResult) {
      cdkBuilder.defaultResult(defaultResult.let(DefaultResult::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Duration) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Duration::unwrap))
    }

    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    override fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
      cdkBuilder.lifecycleTransition(lifecycleTransition.let(LifecycleTransition::unwrap))
    }

    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    override fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
      cdkBuilder.notificationTarget(notificationTarget.let(ILifecycleHookTarget::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps,
  ) : CdkObject(cdkObject), BasicLifecycleHookProps {
    override fun defaultResult(): DefaultResult? =
        unwrap(this).getDefaultResult()?.let(DefaultResult::wrap)

    override fun heartbeatTimeout(): Duration? =
        unwrap(this).getHeartbeatTimeout()?.let(Duration::wrap)

    override fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

    override fun lifecycleTransition(): LifecycleTransition =
        unwrap(this).getLifecycleTransition().let(LifecycleTransition::wrap)

    override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    override fun notificationTarget(): ILifecycleHookTarget? =
        unwrap(this).getNotificationTarget()?.let(ILifecycleHookTarget::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasicLifecycleHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps):
        BasicLifecycleHookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicLifecycleHookProps):
        software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps
  }
}
