@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * A list of ScalingEvents, you can use one of the predefined lists, such as ScalingEvents.ERRORS or
 * create a custom group by instantiating a `NotificationTypes` object, e.g: `new
 * NotificationTypes(`NotificationType.INSTANCE_LAUNCH`)`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * ScalingEvents scalingEvents = ScalingEvents.ALL;
 * ```
 */
public open class ScalingEvents(
  cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents,
) : CdkObject(cdkObject) {
  public constructor(types: ScalingEvent) :
      this(software.amazon.awscdk.services.autoscaling.ScalingEvents(types.let(ScalingEvent::unwrap))
  )

  public companion object {
    public val ALL: ScalingEvents =
        ScalingEvents.wrap(software.amazon.awscdk.services.autoscaling.ScalingEvents.ALL)

    public val ERRORS: ScalingEvents =
        ScalingEvents.wrap(software.amazon.awscdk.services.autoscaling.ScalingEvents.ERRORS)

    public val LAUNCH_EVENTS: ScalingEvents =
        ScalingEvents.wrap(software.amazon.awscdk.services.autoscaling.ScalingEvents.LAUNCH_EVENTS)

    public val TERMINATION_EVENTS: ScalingEvents =
        ScalingEvents.wrap(software.amazon.awscdk.services.autoscaling.ScalingEvents.TERMINATION_EVENTS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents):
        ScalingEvents = ScalingEvents(cdkObject)

    internal fun unwrap(wrapped: ScalingEvents):
        software.amazon.awscdk.services.autoscaling.ScalingEvents = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.ScalingEvents
  }
}
