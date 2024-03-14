package io.cloudshiftdev.awscdk.services.ec2

public enum class RouterType(
    private val cdkObject: software.amazon.awscdk.services.ec2.RouterType,
) {
    CARRIER_GATEWAY(software.amazon.awscdk.services.ec2.RouterType.CARRIER_GATEWAY),
    EGRESS_ONLY_INTERNET_GATEWAY(
        software.amazon.awscdk.services.ec2.RouterType.EGRESS_ONLY_INTERNET_GATEWAY
    ),
    GATEWAY(software.amazon.awscdk.services.ec2.RouterType.GATEWAY),
    INSTANCE(software.amazon.awscdk.services.ec2.RouterType.INSTANCE),
    LOCAL_GATEWAY(software.amazon.awscdk.services.ec2.RouterType.LOCAL_GATEWAY),
    NAT_GATEWAY(software.amazon.awscdk.services.ec2.RouterType.NAT_GATEWAY),
    NETWORK_INTERFACE(software.amazon.awscdk.services.ec2.RouterType.NETWORK_INTERFACE),
    TRANSIT_GATEWAY(software.amazon.awscdk.services.ec2.RouterType.TRANSIT_GATEWAY),
    VPC_PEERING_CONNECTION(software.amazon.awscdk.services.ec2.RouterType.VPC_PEERING_CONNECTION),
    VPC_ENDPOINT(software.amazon.awscdk.services.ec2.RouterType.VPC_ENDPOINT),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RouterType): RouterType =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.RouterType.CARRIER_GATEWAY ->
                    RouterType.CARRIER_GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.EGRESS_ONLY_INTERNET_GATEWAY ->
                    RouterType.EGRESS_ONLY_INTERNET_GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.GATEWAY -> RouterType.GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.INSTANCE -> RouterType.INSTANCE
                software.amazon.awscdk.services.ec2.RouterType.LOCAL_GATEWAY ->
                    RouterType.LOCAL_GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.NAT_GATEWAY -> RouterType.NAT_GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.NETWORK_INTERFACE ->
                    RouterType.NETWORK_INTERFACE
                software.amazon.awscdk.services.ec2.RouterType.TRANSIT_GATEWAY ->
                    RouterType.TRANSIT_GATEWAY
                software.amazon.awscdk.services.ec2.RouterType.VPC_PEERING_CONNECTION ->
                    RouterType.VPC_PEERING_CONNECTION
                software.amazon.awscdk.services.ec2.RouterType.VPC_ENDPOINT ->
                    RouterType.VPC_ENDPOINT
            }

        internal fun unwrap(wrapped: RouterType): software.amazon.awscdk.services.ec2.RouterType =
            wrapped.cdkObject
    }
}
