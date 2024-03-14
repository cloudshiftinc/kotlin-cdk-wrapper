package io.cloudshiftdev.awscdk.services.opensearchservice

public enum class TLSSecurityPolicy(
    private val cdkObject: software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy,
) {
    TLS_1_0(software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_0),
    TLS_1_2(software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_2),
    TLS_1_2_PFS(software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_2_PFS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy
        ): TLSSecurityPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_0 ->
                    TLSSecurityPolicy.TLS_1_0
                software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_2 ->
                    TLSSecurityPolicy.TLS_1_2
                software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy.TLS_1_2_PFS ->
                    TLSSecurityPolicy.TLS_1_2_PFS
            }

        internal fun unwrap(
            wrapped: TLSSecurityPolicy
        ): software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy = wrapped.cdkObject
    }
}
