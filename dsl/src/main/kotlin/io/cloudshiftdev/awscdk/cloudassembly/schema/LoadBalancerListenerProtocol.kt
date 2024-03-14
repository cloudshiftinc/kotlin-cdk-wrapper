package io.cloudshiftdev.awscdk.cloudassembly.schema

public enum class LoadBalancerListenerProtocol(
    private val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol,
) {
    HTTP(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTP),
    HTTPS(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTPS),
    TCP(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP),
    TLS(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TLS),
    UDP(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.UDP),
    TCP_UDP(software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP_UDP),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol
        ): LoadBalancerListenerProtocol =
            when (cdkObject) {
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTP ->
                    LoadBalancerListenerProtocol.HTTP
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.HTTPS ->
                    LoadBalancerListenerProtocol.HTTPS
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP ->
                    LoadBalancerListenerProtocol.TCP
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TLS ->
                    LoadBalancerListenerProtocol.TLS
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.UDP ->
                    LoadBalancerListenerProtocol.UDP
                software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol.TCP_UDP ->
                    LoadBalancerListenerProtocol.TCP_UDP
            }

        internal fun unwrap(
            wrapped: LoadBalancerListenerProtocol
        ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol =
            wrapped.cdkObject
    }
}
