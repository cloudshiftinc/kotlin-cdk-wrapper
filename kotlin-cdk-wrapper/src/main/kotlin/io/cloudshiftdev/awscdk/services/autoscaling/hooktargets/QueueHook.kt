@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.hooktargets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.BindHookTargetOptions
import io.cloudshiftdev.awscdk.services.autoscaling.ILifecycleHookTarget
import io.cloudshiftdev.awscdk.services.autoscaling.LifecycleHookTargetConfig
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use an SQS queue as a hook target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.hooktargets.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * QueueHook queueHook = new QueueHook(queue);
 * ```
 */
public open class QueueHook internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook,
) : CdkObject(cdkObject), ILifecycleHookTarget {
  public constructor(queue: IQueue) :
      this(software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook(queue.let(IQueue::unwrap))
  )

  /**
   * If an `IRole` is found in `options`, grant it access to send messages.
   *
   * Otherwise, create a new `IRole` and grant it access to send messages.
   *
   * @return the `IRole` with access to send messages and the ARN of the queue it has access to send
   * messages to.
   * @param _scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: BindHookTargetOptions):
      LifecycleHookTargetConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      options.let(BindHookTargetOptions::unwrap)).let(LifecycleHookTargetConfig::wrap)

  /**
   * If an `IRole` is found in `options`, grant it access to send messages.
   *
   * Otherwise, create a new `IRole` and grant it access to send messages.
   *
   * @return the `IRole` with access to send messages and the ARN of the queue it has access to send
   * messages to.
   * @param _scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a256b345ffa3a5089e3c2315d1f614a5e6fb6ed617a236cb05a1ffe90b1f565d")
  public override fun bind(scope: Construct, options: BindHookTargetOptions.Builder.() -> Unit):
      LifecycleHookTargetConfig = bind(scope, BindHookTargetOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook):
        QueueHook = QueueHook(cdkObject)

    internal fun unwrap(wrapped: QueueHook):
        software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook = wrapped.cdkObject
  }
}
