package io.cloudshiftdev.awscdk.services.ec2

public enum class TrafficDirection(
    private val cdkObject: software.amazon.awscdk.services.ec2.TrafficDirection,
) {
    EGRESS(software.amazon.awscdk.services.ec2.TrafficDirection.EGRESS),
    INGRESS(software.amazon.awscdk.services.ec2.TrafficDirection.INGRESS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.TrafficDirection
        ): TrafficDirection =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.TrafficDirection.EGRESS ->
                    TrafficDirection.EGRESS
                software.amazon.awscdk.services.ec2.TrafficDirection.INGRESS ->
                    TrafficDirection.INGRESS
            }

        internal fun unwrap(
            wrapped: TrafficDirection
        ): software.amazon.awscdk.services.ec2.TrafficDirection = wrapped.cdkObject
    }
}
