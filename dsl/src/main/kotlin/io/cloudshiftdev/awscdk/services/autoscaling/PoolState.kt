package io.cloudshiftdev.awscdk.services.autoscaling

public enum class PoolState(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.PoolState,
) {
    HIBERNATED(software.amazon.awscdk.services.autoscaling.PoolState.HIBERNATED),
    RUNNING(software.amazon.awscdk.services.autoscaling.PoolState.RUNNING),
    STOPPED(software.amazon.awscdk.services.autoscaling.PoolState.STOPPED),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.PoolState
        ): PoolState =
            when (cdkObject) {
                software.amazon.awscdk.services.autoscaling.PoolState.HIBERNATED ->
                    PoolState.HIBERNATED
                software.amazon.awscdk.services.autoscaling.PoolState.RUNNING -> PoolState.RUNNING
                software.amazon.awscdk.services.autoscaling.PoolState.STOPPED -> PoolState.STOPPED
            }

        internal fun unwrap(
            wrapped: PoolState
        ): software.amazon.awscdk.services.autoscaling.PoolState = wrapped.cdkObject
    }
}
