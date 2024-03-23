@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use a SQS queue as a Lambda destination.
 *
 * Example:
 *
 * ```
 * // An sqs queue for unsuccessful invocations of a lambda function
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue deadLetterQueue = new Queue(this, "DeadLetterQueue");
 * Function myFn = Function.Builder.create(this, "Fn")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromInline("// your code"))
 * // sqs queue for unsuccessful invocations
 * .onFailure(new SqsDestination(deadLetterQueue))
 * .build();
 * ```
 */
public open class SqsDestination(
  cdkObject: software.amazon.awscdk.services.lambda.destinations.SqsDestination,
) : CdkObject(cdkObject), IDestination {
  public constructor(queue: IQueue) :
      this(software.amazon.awscdk.services.lambda.destinations.SqsDestination(queue.let(IQueue::unwrap))
  )

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(scope: Construct, fn: IFunction): DestinationConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      fn.let(IFunction::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap), fn.let(IFunction::unwrap),
      options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public override fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(scope, fn, DestinationOptions(options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.SqsDestination):
        SqsDestination = SqsDestination(cdkObject)

    internal fun unwrap(wrapped: SqsDestination):
        software.amazon.awscdk.services.lambda.destinations.SqsDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.destinations.SqsDestination
  }
}
