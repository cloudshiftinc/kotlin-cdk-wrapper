package io.cloudshiftdev.awscdk.services.eks

public enum class IpFamily(
    private val cdkObject: software.amazon.awscdk.services.eks.IpFamily,
) {
    IP_V4(software.amazon.awscdk.services.eks.IpFamily.IP_V4),
    IP_V6(software.amazon.awscdk.services.eks.IpFamily.IP_V6),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IpFamily): IpFamily =
            when (cdkObject) {
                software.amazon.awscdk.services.eks.IpFamily.IP_V4 -> IpFamily.IP_V4
                software.amazon.awscdk.services.eks.IpFamily.IP_V6 -> IpFamily.IP_V6
            }

        internal fun unwrap(wrapped: IpFamily): software.amazon.awscdk.services.eks.IpFamily =
            wrapped.cdkObject
    }
}
