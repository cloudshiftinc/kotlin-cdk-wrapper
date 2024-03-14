package io.cloudshiftdev.awscdk.services.elasticsearch

public enum class TLSSecurityPolicy(
    private val cdkObject: software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy,
) {
    TLS_1_0(software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_0),
    TLS_1_2(software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_2),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy
        ): TLSSecurityPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_0 ->
                    TLSSecurityPolicy.TLS_1_0
                software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy.TLS_1_2 ->
                    TLSSecurityPolicy.TLS_1_2
            }

        internal fun unwrap(
            wrapped: TLSSecurityPolicy
        ): software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy = wrapped.cdkObject
    }
}
