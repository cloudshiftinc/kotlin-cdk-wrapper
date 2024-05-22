@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use an Event Bridge event bus as a Lambda destination.
 *
 * If no event bus is specified, the default event bus is used.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.lambda.destinations.*;
 * EventBus eventBus;
 * EventBridgeDestination eventBridgeDestination = new EventBridgeDestination(eventBus);
 * ```
 */
public open class EventBridgeDestination(
  cdkObject: software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination,
) : CdkObject(cdkObject), IDestination {
  public constructor() :
      this(software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination()
  )

  public constructor(eventBus: IEventBus) :
      this(software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination(eventBus.let(IEventBus.Companion::unwrap))
  )

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(scope: Construct, fn: IFunction): DestinationConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      fn.let(IFunction.Companion::unwrap)).let(DestinationConfig::wrap)

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
  ): DestinationConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      fn.let(IFunction.Companion::unwrap),
      options.let(DestinationOptions.Companion::unwrap)).let(DestinationConfig::wrap)

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
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination):
        EventBridgeDestination = EventBridgeDestination(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDestination):
        software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination
  }
}
