@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.hooktargets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.BindHookTargetOptions
import io.cloudshiftdev.awscdk.services.autoscaling.ILifecycleHookTarget
import io.cloudshiftdev.awscdk.services.autoscaling.LifecycleHookTargetConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use an SNS topic as a hook target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.hooktargets.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic;
 * TopicHook topicHook = new TopicHook(topic);
 * ```
 */
public open class TopicHook(
  cdkObject: software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook,
) : CdkObject(cdkObject),
    ILifecycleHookTarget {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook(topic.let(ITopic.Companion::unwrap))
  )

  /**
   * If an `IRole` is found in `options`, grant it topic publishing permissions.
   *
   * Otherwise, create a new `IRole` and grant it topic publishing permissions.
   *
   * @return the `IRole` with topic publishing permissions and the ARN of the topic it has
   * publishing permission to.
   * @param _scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: BindHookTargetOptions):
      LifecycleHookTargetConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(BindHookTargetOptions.Companion::unwrap)).let(LifecycleHookTargetConfig::wrap)

  /**
   * If an `IRole` is found in `options`, grant it topic publishing permissions.
   *
   * Otherwise, create a new `IRole` and grant it topic publishing permissions.
   *
   * @return the `IRole` with topic publishing permissions and the ARN of the topic it has
   * publishing permission to.
   * @param _scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public override fun bind(scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig = bind(scope, BindHookTargetOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook):
        TopicHook = TopicHook(cdkObject)

    internal fun unwrap(wrapped: TopicHook):
        software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook
  }
}
