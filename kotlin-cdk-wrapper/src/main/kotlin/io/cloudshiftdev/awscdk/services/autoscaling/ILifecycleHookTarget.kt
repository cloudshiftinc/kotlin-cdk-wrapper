@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for autoscaling lifecycle hook targets.
 */
public interface ILifecycleHookTarget {
  /**
   * Called when this object is used as the target of a lifecycle hook.
   *
   * @param scope 
   * @param options [disable-awslint:ref-via-interface] The lifecycle hook to attach to and a role
   * to use. 
   */
  public fun bind(scope: Construct, options: BindHookTargetOptions): LifecycleHookTargetConfig

  /**
   * Called when this object is used as the target of a lifecycle hook.
   *
   * @param scope 
   * @param options [disable-awslint:ref-via-interface] The lifecycle hook to attach to and a role
   * to use. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public fun bind(scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget,
  ) : CdkObject(cdkObject), ILifecycleHookTarget {
    /**
     * Called when this object is used as the target of a lifecycle hook.
     *
     * @param scope 
     * @param options [disable-awslint:ref-via-interface] The lifecycle hook to attach to and a role
     * to use. 
     */
    override fun bind(scope: Construct, options: BindHookTargetOptions): LifecycleHookTargetConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        options.let(BindHookTargetOptions::unwrap)).let(LifecycleHookTargetConfig::wrap)

    /**
     * Called when this object is used as the target of a lifecycle hook.
     *
     * @param scope 
     * @param options [disable-awslint:ref-via-interface] The lifecycle hook to attach to and a role
     * to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
    override fun bind(scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
        LifecycleHookTargetConfig = bind(scope, BindHookTargetOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget):
        ILifecycleHookTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILifecycleHookTarget):
        software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
  }
}
