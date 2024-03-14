package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class Protocol(
    private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.Protocol,
) {
    HTTP(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTP),
    HTTPS(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTPS),
    TCP(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP),
    TLS(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TLS),
    UDP(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.UDP),
    TCP_UDP(software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP_UDP),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
        ): Protocol =
            when (cdkObject) {
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTP ->
                    Protocol.HTTP
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.HTTPS ->
                    Protocol.HTTPS
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP -> Protocol.TCP
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TLS -> Protocol.TLS
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.UDP -> Protocol.UDP
                software.amazon.awscdk.services.elasticloadbalancingv2.Protocol.TCP_UDP ->
                    Protocol.TCP_UDP
            }

        internal fun unwrap(
            wrapped: Protocol
        ): software.amazon.awscdk.services.elasticloadbalancingv2.Protocol = wrapped.cdkObject
    }
}
