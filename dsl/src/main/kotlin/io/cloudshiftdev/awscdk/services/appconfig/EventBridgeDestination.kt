package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class EventBridgeDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.EventBridgeDestination,
) : CdkObject(cdkObject), IEventDestination {
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
