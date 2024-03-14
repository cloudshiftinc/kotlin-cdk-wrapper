package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject

public open class ScalingEvents internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents,
) : CdkObject(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents):
        ScalingEvents = ScalingEvents(cdkObject)

    internal fun unwrap(wrapped: ScalingEvents):
        software.amazon.awscdk.services.autoscaling.ScalingEvents = wrapped.cdkObject
  }
}
