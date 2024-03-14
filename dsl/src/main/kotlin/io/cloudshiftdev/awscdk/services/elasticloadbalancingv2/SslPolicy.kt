package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class SslPolicy(
    private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy,
) {
    RECOMMENDED_TLS(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.RECOMMENDED_TLS
    ),
    RECOMMENDED(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.RECOMMENDED),
    TLS13_RES(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_RES),
    TLS13_EXT1(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_EXT1),
    TLS13_EXT2(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_EXT2),
    TLS13_10(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_10),
    TLS13_11(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_11),
    TLS13_13(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_13),
    FIPS_TLS13_13(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_13),
    FIPS_TLS13_12_RES(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12_RES
    ),
    FIPS_TLS13_12(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12),
    FIPS_TLS13_12_EXT0(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12_EXT0
    ),
    FIPS_TLS13_12_EXT1(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12_EXT1
    ),
    FIPS_TLS13_12_EXT2(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12_EXT2
    ),
    FIPS_TLS13_11(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_11),
    FIPS_TLS13_10(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_10),
    FORWARD_SECRECY_TLS12_RES_GCM(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
            .FORWARD_SECRECY_TLS12_RES_GCM
    ),
    FORWARD_SECRECY_TLS12_RES(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS12_RES
    ),
    FORWARD_SECRECY_TLS12(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS12
    ),
    FORWARD_SECRECY_TLS11(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY_TLS11
    ),
    FORWARD_SECRECY(
        software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY
    ),
    TLS12(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12),
    TLS12_EXT(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12_EXT),
    TLS11(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS11),
    LEGACY(software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.LEGACY),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
        ): SslPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.RECOMMENDED_TLS ->
                    SslPolicy.RECOMMENDED_TLS
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.RECOMMENDED ->
                    SslPolicy.RECOMMENDED
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_RES ->
                    SslPolicy.TLS13_RES
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_EXT1 ->
                    SslPolicy.TLS13_EXT1
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_EXT2 ->
                    SslPolicy.TLS13_EXT2
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_10 ->
                    SslPolicy.TLS13_10
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_11 ->
                    SslPolicy.TLS13_11
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS13_13 ->
                    SslPolicy.TLS13_13
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_13 ->
                    SslPolicy.FIPS_TLS13_13
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FIPS_TLS13_12_RES -> SslPolicy.FIPS_TLS13_12_RES
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_12 ->
                    SslPolicy.FIPS_TLS13_12
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FIPS_TLS13_12_EXT0 -> SslPolicy.FIPS_TLS13_12_EXT0
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FIPS_TLS13_12_EXT1 -> SslPolicy.FIPS_TLS13_12_EXT1
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FIPS_TLS13_12_EXT2 -> SslPolicy.FIPS_TLS13_12_EXT2
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_11 ->
                    SslPolicy.FIPS_TLS13_11
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FIPS_TLS13_10 ->
                    SslPolicy.FIPS_TLS13_10
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FORWARD_SECRECY_TLS12_RES_GCM -> SslPolicy.FORWARD_SECRECY_TLS12_RES_GCM
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FORWARD_SECRECY_TLS12_RES -> SslPolicy.FORWARD_SECRECY_TLS12_RES
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FORWARD_SECRECY_TLS12 -> SslPolicy.FORWARD_SECRECY_TLS12
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
                    .FORWARD_SECRECY_TLS11 -> SslPolicy.FORWARD_SECRECY_TLS11
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.FORWARD_SECRECY ->
                    SslPolicy.FORWARD_SECRECY
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12 ->
                    SslPolicy.TLS12
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS12_EXT ->
                    SslPolicy.TLS12_EXT
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.TLS11 ->
                    SslPolicy.TLS11
                software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy.LEGACY ->
                    SslPolicy.LEGACY
            }

        internal fun unwrap(
            wrapped: SslPolicy
        ): software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy = wrapped.cdkObject
    }
}
