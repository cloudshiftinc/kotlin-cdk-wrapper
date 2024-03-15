@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject

public open class ScalingEvents internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents,
) : CdkObject(cdkObject) {
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
        software.amazon.awscdk.services.autoscaling.ScalingEvents = wrapped.cdkObject
  }
}
