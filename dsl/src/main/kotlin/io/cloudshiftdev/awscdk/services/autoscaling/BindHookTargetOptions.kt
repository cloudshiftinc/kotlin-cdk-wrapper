package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface BindHookTargetOptions {
  /**
   * The lifecycle hook to attach to.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun lifecycleHook(): LifecycleHook

  /**
   * The role to use when attaching to the lifecycle hook.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: : a role is not created unless the target arn is specified
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [BindHookTargetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lifecycleHook The lifecycle hook to attach to. 
     * [disable-awslint:ref-via-interface]
     */
    public fun lifecycleHook(lifecycleHook: LifecycleHook)

    /**
     * @param role The role to use when attaching to the lifecycle hook.
     * [disable-awslint:ref-via-interface]
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions.Builder =
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions.builder()

    /**
     * @param lifecycleHook The lifecycle hook to attach to. 
     * [disable-awslint:ref-via-interface]
     */
    override fun lifecycleHook(lifecycleHook: LifecycleHook) {
      cdkBuilder.lifecycleHook(lifecycleHook.let(LifecycleHook::unwrap))
    }

    /**
     * @param role The role to use when attaching to the lifecycle hook.
     * [disable-awslint:ref-via-interface]
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BindHookTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.BindHookTargetOptions,
  ) : BindHookTargetOptions {
    /**
     * The lifecycle hook to attach to.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun lifecycleHook(): LifecycleHook =
        unwrap(this).getLifecycleHook().let(LifecycleHook::wrap)

    /**
     * The role to use when attaching to the lifecycle hook.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: : a role is not created unless the target arn is specified
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BindHookTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BindHookTargetOptions):
        BindHookTargetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BindHookTargetOptions):
        software.amazon.awscdk.services.autoscaling.BindHookTargetOptions = (wrapped as
        Wrapper).cdkObject
  }
}
