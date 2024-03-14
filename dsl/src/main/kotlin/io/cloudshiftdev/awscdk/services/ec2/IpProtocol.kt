package io.cloudshiftdev.awscdk.services.ec2

public enum class IpProtocol(
    private val cdkObject: software.amazon.awscdk.services.ec2.IpProtocol,
) {
    IPV4_ONLY(software.amazon.awscdk.services.ec2.IpProtocol.IPV4_ONLY),
    DUAL_STACK(software.amazon.awscdk.services.ec2.IpProtocol.DUAL_STACK),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IpProtocol): IpProtocol =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.IpProtocol.IPV4_ONLY -> IpProtocol.IPV4_ONLY
                software.amazon.awscdk.services.ec2.IpProtocol.DUAL_STACK -> IpProtocol.DUAL_STACK
            }

        internal fun unwrap(wrapped: IpProtocol): software.amazon.awscdk.services.ec2.IpProtocol =
            wrapped.cdkObject
    }
}
