package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class DesyncMitigationMode(
    private val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode,
) {
    MONITOR(software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode.MONITOR),
    DEFENSIVE(
        software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode.DEFENSIVE
    ),
    STRICTEST(
        software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode.STRICTEST
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
        ): DesyncMitigationMode =
            when (cdkObject) {
                software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
                    .MONITOR -> DesyncMitigationMode.MONITOR
                software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
                    .DEFENSIVE -> DesyncMitigationMode.DEFENSIVE
                software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
                    .STRICTEST -> DesyncMitigationMode.STRICTEST
            }

        internal fun unwrap(
            wrapped: DesyncMitigationMode
        ): software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode =
            wrapped.cdkObject
    }
}
