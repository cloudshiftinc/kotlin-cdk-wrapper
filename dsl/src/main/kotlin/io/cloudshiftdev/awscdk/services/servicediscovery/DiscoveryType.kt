package io.cloudshiftdev.awscdk.services.servicediscovery

public enum class DiscoveryType(
    private val cdkObject: software.amazon.awscdk.services.servicediscovery.DiscoveryType,
) {
    API(software.amazon.awscdk.services.servicediscovery.DiscoveryType.API),
    DNS_AND_API(software.amazon.awscdk.services.servicediscovery.DiscoveryType.DNS_AND_API),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicediscovery.DiscoveryType
        ): DiscoveryType =
            when (cdkObject) {
                software.amazon.awscdk.services.servicediscovery.DiscoveryType.API ->
                    DiscoveryType.API
                software.amazon.awscdk.services.servicediscovery.DiscoveryType.DNS_AND_API ->
                    DiscoveryType.DNS_AND_API
            }

        internal fun unwrap(
            wrapped: DiscoveryType
        ): software.amazon.awscdk.services.servicediscovery.DiscoveryType = wrapped.cdkObject
    }
}
