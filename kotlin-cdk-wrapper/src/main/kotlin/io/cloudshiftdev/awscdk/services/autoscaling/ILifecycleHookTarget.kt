@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ILifecycleHookTarget {
  public fun bind(arg0: Construct, arg1: BindHookTargetOptions): LifecycleHookTargetConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public fun bind(arg0: Construct, arg1: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget,
  ) : CdkObject(cdkObject), ILifecycleHookTarget {
    override fun bind(arg0: Construct, arg1: BindHookTargetOptions): LifecycleHookTargetConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(BindHookTargetOptions::unwrap)).let(LifecycleHookTargetConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
    override fun bind(arg0: Construct, arg1: BindHookTargetOptions.Builder.() -> Unit):
        LifecycleHookTargetConfig = bind(arg0, BindHookTargetOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget):
        ILifecycleHookTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILifecycleHookTarget):
        software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
  }
}
