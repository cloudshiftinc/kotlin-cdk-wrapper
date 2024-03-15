@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IEventBus
import kotlin.String

/**
 * Use an Amazon EventBridge event bus as an event destination.
 *
 * Example:
 *
 * ```
 * IEventBus bus = EventBus.fromEventBusName(this, "MyEventBus", "default");
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new EventBridgeDestination(bus))
 * .build()))
 * .build();
 * ```
 */
public open class EventBridgeDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.EventBridgeDestination,
) : CdkObject(cdkObject), IEventDestination {
  public constructor(bus: IEventBus) :
      this(software.amazon.awscdk.services.appconfig.EventBridgeDestination(bus.let(IEventBus::unwrap))
  )

  /**
   * The URI of the extension event destination.
   */
  public override fun extensionUri(): String = unwrap(this).getExtensionUri()

  /**
   * The type of the extension event destination.
   */
  public override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EventBridgeDestination):
        EventBridgeDestination = EventBridgeDestination(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDestination):
        software.amazon.awscdk.services.appconfig.EventBridgeDestination = wrapped.cdkObject
  }
}
