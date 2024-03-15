@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface BindHookTargetOptions {
  public fun lifecycleHook(): LifecycleHook

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun lifecycleHook(lifecycleHook: LifecycleHook)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions.Builder =
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions.builder()

    override fun lifecycleHook(lifecycleHook: LifecycleHook) {
      cdkBuilder.lifecycleHook(lifecycleHook.let(LifecycleHook::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BindHookTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.BindHookTargetOptions,
  ) : CdkObject(cdkObject), BindHookTargetOptions {
    override fun lifecycleHook(): LifecycleHook =
        unwrap(this).getLifecycleHook().let(LifecycleHook::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BindHookTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BindHookTargetOptions):
        BindHookTargetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BindHookTargetOptions):
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.BindHookTargetOptions
  }
}
