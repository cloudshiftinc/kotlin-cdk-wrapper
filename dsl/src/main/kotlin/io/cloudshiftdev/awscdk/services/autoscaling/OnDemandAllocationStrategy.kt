package io.cloudshiftdev.awscdk.services.autoscaling

public enum class OnDemandAllocationStrategy(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy,
) {
    PRIORITIZED(software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy.PRIORITIZED),
    LOWEST_PRICE(
        software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy.LOWEST_PRICE
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy
        ): OnDemandAllocationStrategy =
            when (cdkObject) {
                software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy
                    .PRIORITIZED -> OnDemandAllocationStrategy.PRIORITIZED
                software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy
                    .LOWEST_PRICE -> OnDemandAllocationStrategy.LOWEST_PRICE
            }

        internal fun unwrap(
            wrapped: OnDemandAllocationStrategy
        ): software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy =
            wrapped.cdkObject
    }
}
