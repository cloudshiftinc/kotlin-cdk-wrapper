package io.cloudshiftdev.awscdk.services.globalaccelerator

public enum class IpAddressType(
    private val cdkObject: software.amazon.awscdk.services.globalaccelerator.IpAddressType,
) {
    IPV4(software.amazon.awscdk.services.globalaccelerator.IpAddressType.IPV4),
    DUAL_STACK(software.amazon.awscdk.services.globalaccelerator.IpAddressType.DUAL_STACK),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.globalaccelerator.IpAddressType
        ): IpAddressType =
            when (cdkObject) {
                software.amazon.awscdk.services.globalaccelerator.IpAddressType.IPV4 ->
                    IpAddressType.IPV4
                software.amazon.awscdk.services.globalaccelerator.IpAddressType.DUAL_STACK ->
                    IpAddressType.DUAL_STACK
            }

        internal fun unwrap(
            wrapped: IpAddressType
        ): software.amazon.awscdk.services.globalaccelerator.IpAddressType = wrapped.cdkObject
    }
}
