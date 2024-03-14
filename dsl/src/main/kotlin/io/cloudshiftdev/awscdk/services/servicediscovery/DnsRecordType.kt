package io.cloudshiftdev.awscdk.services.servicediscovery

public enum class DnsRecordType(
    private val cdkObject: software.amazon.awscdk.services.servicediscovery.DnsRecordType,
) {
    A(software.amazon.awscdk.services.servicediscovery.DnsRecordType.A),
    AAAA(software.amazon.awscdk.services.servicediscovery.DnsRecordType.AAAA),
    A_AAAA(software.amazon.awscdk.services.servicediscovery.DnsRecordType.A_AAAA),
    SRV(software.amazon.awscdk.services.servicediscovery.DnsRecordType.SRV),
    CNAME(software.amazon.awscdk.services.servicediscovery.DnsRecordType.CNAME),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicediscovery.DnsRecordType
        ): DnsRecordType =
            when (cdkObject) {
                software.amazon.awscdk.services.servicediscovery.DnsRecordType.A -> DnsRecordType.A
                software.amazon.awscdk.services.servicediscovery.DnsRecordType.AAAA ->
                    DnsRecordType.AAAA
                software.amazon.awscdk.services.servicediscovery.DnsRecordType.A_AAAA ->
                    DnsRecordType.A_AAAA
                software.amazon.awscdk.services.servicediscovery.DnsRecordType.SRV ->
                    DnsRecordType.SRV
                software.amazon.awscdk.services.servicediscovery.DnsRecordType.CNAME ->
                    DnsRecordType.CNAME
            }

        internal fun unwrap(
            wrapped: DnsRecordType
        ): software.amazon.awscdk.services.servicediscovery.DnsRecordType = wrapped.cdkObject
    }
}
