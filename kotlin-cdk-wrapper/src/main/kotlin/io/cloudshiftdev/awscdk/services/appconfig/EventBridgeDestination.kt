@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class EventBridgeDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.EventBridgeDestination,
) : CdkObject(cdkObject), IEventDestination {
  public override fun extensionUri(): String = unwrap(this).getExtensionUri()

  public override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EventBridgeDestination):
        EventBridgeDestination = EventBridgeDestination(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDestination):
        software.amazon.awscdk.services.appconfig.EventBridgeDestination = wrapped.cdkObject
  }
}
