package io.cloudshiftdev.awscdk.services.autoscaling

public enum class PredefinedMetric(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.PredefinedMetric,
) {
    ASG_AVERAGE_CPU_UTILIZATION(
        software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION
    ),
    ASG_AVERAGE_NETWORK_IN(
        software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_NETWORK_IN
    ),
    ASG_AVERAGE_NETWORK_OUT(
        software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_NETWORK_OUT
    ),
    ALB_REQUEST_COUNT_PER_TARGET(
        software.amazon.awscdk.services.autoscaling.PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.PredefinedMetric
        ): PredefinedMetric =
            when (cdkObject) {
                software.amazon.awscdk.services.autoscaling.PredefinedMetric
                    .ASG_AVERAGE_CPU_UTILIZATION -> PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION
                software.amazon.awscdk.services.autoscaling.PredefinedMetric
                    .ASG_AVERAGE_NETWORK_IN -> PredefinedMetric.ASG_AVERAGE_NETWORK_IN
                software.amazon.awscdk.services.autoscaling.PredefinedMetric
                    .ASG_AVERAGE_NETWORK_OUT -> PredefinedMetric.ASG_AVERAGE_NETWORK_OUT
                software.amazon.awscdk.services.autoscaling.PredefinedMetric
                    .ALB_REQUEST_COUNT_PER_TARGET -> PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET
            }

        internal fun unwrap(
            wrapped: PredefinedMetric
        ): software.amazon.awscdk.services.autoscaling.PredefinedMetric = wrapped.cdkObject
    }
}
