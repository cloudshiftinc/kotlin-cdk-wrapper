package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LifecycleHook internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHook,
) : Resource(cdkObject), ILifecycleHook {
  public open fun lifecycleHookName(): String = unwrap(this).getLifecycleHookName()

  public override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    public fun defaultResult(defaultResult: DefaultResult)

    public fun heartbeatTimeout(heartbeatTimeout: Duration)

    public fun lifecycleHookName(lifecycleHookName: String)

    public fun lifecycleTransition(lifecycleTransition: LifecycleTransition)

    public fun notificationMetadata(notificationMetadata: String)

    public fun notificationTarget(notificationTarget: ILifecycleHookTarget)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.LifecycleHook.Builder =
        software.amazon.awscdk.services.autoscaling.LifecycleHook.Builder.create(scope, id)

    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.autoscaling.LifecycleHook =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
