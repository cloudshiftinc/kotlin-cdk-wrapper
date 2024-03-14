package io.cloudshiftdev.awscdk.services.autoscaling.hooktargets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.BindHookTargetOptions
import io.cloudshiftdev.awscdk.services.autoscaling.ILifecycleHookTarget
import io.cloudshiftdev.awscdk.services.autoscaling.LifecycleHookTargetConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class FunctionHook internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook,
) : CdkObject(cdkObject), ILifecycleHookTarget {
  /**
   * If the `IRole` does not exist in `options`, will create an `IRole` and an SNS Topic and attach
   * both to the lifecycle hook.
   *
   * If the `IRole` does exist in `options`, will only create an SNS Topic and attach it to the
   * lifecycle hook.
   *
   * @param _scope 
   * @param options 
   */
  public override fun bind(_scope: Construct, options: BindHookTargetOptions):
      LifecycleHookTargetConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      options.let(BindHookTargetOptions::unwrap)).let(LifecycleHookTargetConfig::wrap)

  /**
   * If the `IRole` does not exist in `options`, will create an `IRole` and an SNS Topic and attach
   * both to the lifecycle hook.
   *
   * If the `IRole` does exist in `options`, will only create an SNS Topic and attach it to the
   * lifecycle hook.
   *
   * @param _scope 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public override fun bind(_scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig = bind(_scope, BindHookTargetOptions(options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook):
        FunctionHook = FunctionHook(cdkObject)

    internal fun unwrap(wrapped: FunctionHook):
        software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook = wrapped.cdkObject
  }
}
