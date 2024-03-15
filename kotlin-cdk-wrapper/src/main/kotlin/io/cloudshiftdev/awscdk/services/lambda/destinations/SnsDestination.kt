@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use a SNS topic as a Lambda destination.
 *
 * Example:
 *
 * ```
 * // An sns topic for successful invocations of a lambda function
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic myTopic = new Topic(this, "Topic");
 * Function myFn = Function.Builder.create(this, "Fn")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * // sns topic for successful invocations
 * .onSuccess(new SnsDestination(myTopic))
 * .build();
 * ```
 */
public open class SnsDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.destinations.SnsDestination,
) : CdkObject(cdkObject), IDestination {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.lambda.destinations.SnsDestination(ITopic.unwrap(topic)))

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(_scope: Construct, fn: IFunction): DestinationConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      fn.let(IFunction::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(
    _scope: Construct,
    fn: IFunction,
    _options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(_scope.let(Construct::unwrap), fn.let(IFunction::unwrap),
      _options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

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
    _scope: Construct,
    fn: IFunction,
    _options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(_scope, fn, DestinationOptions(_options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.SnsDestination):
        SnsDestination = SnsDestination(cdkObject)

    internal fun unwrap(wrapped: SnsDestination):
        software.amazon.awscdk.services.lambda.destinations.SnsDestination = wrapped.cdkObject
  }
}
