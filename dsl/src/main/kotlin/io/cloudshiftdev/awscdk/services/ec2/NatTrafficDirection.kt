package io.cloudshiftdev.awscdk.services.ec2

public enum class NatTrafficDirection(
    private val cdkObject: software.amazon.awscdk.services.ec2.NatTrafficDirection,
) {
    OUTBOUND_ONLY(software.amazon.awscdk.services.ec2.NatTrafficDirection.OUTBOUND_ONLY),
    INBOUND_AND_OUTBOUND(
        software.amazon.awscdk.services.ec2.NatTrafficDirection.INBOUND_AND_OUTBOUND
    ),
    NONE(software.amazon.awscdk.services.ec2.NatTrafficDirection.NONE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.NatTrafficDirection
        ): NatTrafficDirection =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.NatTrafficDirection.OUTBOUND_ONLY ->
                    NatTrafficDirection.OUTBOUND_ONLY
                software.amazon.awscdk.services.ec2.NatTrafficDirection.INBOUND_AND_OUTBOUND ->
                    NatTrafficDirection.INBOUND_AND_OUTBOUND
                software.amazon.awscdk.services.ec2.NatTrafficDirection.NONE ->
                    NatTrafficDirection.NONE
            }

        internal fun unwrap(
            wrapped: NatTrafficDirection
        ): software.amazon.awscdk.services.ec2.NatTrafficDirection = wrapped.cdkObject
    }
}
