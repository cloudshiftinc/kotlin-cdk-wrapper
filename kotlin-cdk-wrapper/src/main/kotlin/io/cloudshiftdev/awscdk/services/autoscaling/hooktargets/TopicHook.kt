@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.hooktargets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.BindHookTargetOptions
import io.cloudshiftdev.awscdk.services.autoscaling.ILifecycleHookTarget
import io.cloudshiftdev.awscdk.services.autoscaling.LifecycleHookTargetConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public open class TopicHook internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook,
) : CdkObject(cdkObject), ILifecycleHookTarget {
  public override fun bind(_scope: Construct, options: BindHookTargetOptions):
      LifecycleHookTargetConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      options.let(BindHookTargetOptions::unwrap)).let(LifecycleHookTargetConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public override fun bind(_scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig = bind(_scope, BindHookTargetOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook):
        TopicHook = TopicHook(cdkObject)

    internal fun unwrap(wrapped: TopicHook):
        software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook = wrapped.cdkObject
  }
}
