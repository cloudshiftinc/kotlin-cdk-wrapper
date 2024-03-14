package io.cloudshiftdev.awscdk.services.globalaccelerator

public enum class HealthCheckProtocol(
    private val cdkObject: software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol,
) {
    TCP(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.TCP),
    HTTP(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTP),
    HTTPS(software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTPS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol
        ): HealthCheckProtocol =
            when (cdkObject) {
                software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.TCP ->
                    HealthCheckProtocol.TCP
                software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTP ->
                    HealthCheckProtocol.HTTP
                software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol.HTTPS ->
                    HealthCheckProtocol.HTTPS
            }

        internal fun unwrap(
            wrapped: HealthCheckProtocol
        ): software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol = wrapped.cdkObject
    }
}
