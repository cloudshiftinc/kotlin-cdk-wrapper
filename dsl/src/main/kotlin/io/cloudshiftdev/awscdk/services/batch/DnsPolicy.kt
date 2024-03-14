package io.cloudshiftdev.awscdk.services.batch

public enum class DnsPolicy(
    private val cdkObject: software.amazon.awscdk.services.batch.DnsPolicy,
) {
    DEFAULT(software.amazon.awscdk.services.batch.DnsPolicy.DEFAULT),
    CLUSTER_FIRST(software.amazon.awscdk.services.batch.DnsPolicy.CLUSTER_FIRST),
    CLUSTER_FIRST_WITH_HOST_NET(
        software.amazon.awscdk.services.batch.DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET
    ),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.DnsPolicy): DnsPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.batch.DnsPolicy.DEFAULT -> DnsPolicy.DEFAULT
                software.amazon.awscdk.services.batch.DnsPolicy.CLUSTER_FIRST ->
                    DnsPolicy.CLUSTER_FIRST
                software.amazon.awscdk.services.batch.DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET ->
                    DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET
            }

        internal fun unwrap(wrapped: DnsPolicy): software.amazon.awscdk.services.batch.DnsPolicy =
            wrapped.cdkObject
    }
}
