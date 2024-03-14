package io.cloudshiftdev.awscdk.services.ecs

public enum class NetworkMode(
    private val cdkObject: software.amazon.awscdk.services.ecs.NetworkMode,
) {
    NONE(software.amazon.awscdk.services.ecs.NetworkMode.NONE),
    BRIDGE(software.amazon.awscdk.services.ecs.NetworkMode.BRIDGE),
    AWS_VPC(software.amazon.awscdk.services.ecs.NetworkMode.AWS_VPC),
    HOST(software.amazon.awscdk.services.ecs.NetworkMode.HOST),
    NAT(software.amazon.awscdk.services.ecs.NetworkMode.NAT),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.NetworkMode): NetworkMode =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.NetworkMode.NONE -> NetworkMode.NONE
                software.amazon.awscdk.services.ecs.NetworkMode.BRIDGE -> NetworkMode.BRIDGE
                software.amazon.awscdk.services.ecs.NetworkMode.AWS_VPC -> NetworkMode.AWS_VPC
                software.amazon.awscdk.services.ecs.NetworkMode.HOST -> NetworkMode.HOST
                software.amazon.awscdk.services.ecs.NetworkMode.NAT -> NetworkMode.NAT
            }

        internal fun unwrap(wrapped: NetworkMode): software.amazon.awscdk.services.ecs.NetworkMode =
            wrapped.cdkObject
    }
}
