package io.cloudshiftdev.awscdk.services.autoscaling

public open class ScalingEvents
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents,
) {
    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvents
        ): ScalingEvents = ScalingEvents(cdkObject)

        internal fun unwrap(
            wrapped: ScalingEvents
        ): software.amazon.awscdk.services.autoscaling.ScalingEvents = wrapped.cdkObject
    }
}
