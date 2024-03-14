package io.cloudshiftdev.awscdk.services.appmesh

public enum class DnsResponseType(
    private val cdkObject: software.amazon.awscdk.services.appmesh.DnsResponseType,
) {
    LOAD_BALANCER(software.amazon.awscdk.services.appmesh.DnsResponseType.LOAD_BALANCER),
    ENDPOINTS(software.amazon.awscdk.services.appmesh.DnsResponseType.ENDPOINTS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.DnsResponseType
        ): DnsResponseType =
            when (cdkObject) {
                software.amazon.awscdk.services.appmesh.DnsResponseType.LOAD_BALANCER ->
                    DnsResponseType.LOAD_BALANCER
                software.amazon.awscdk.services.appmesh.DnsResponseType.ENDPOINTS ->
                    DnsResponseType.ENDPOINTS
            }

        internal fun unwrap(
            wrapped: DnsResponseType
        ): software.amazon.awscdk.services.appmesh.DnsResponseType = wrapped.cdkObject
    }
}
