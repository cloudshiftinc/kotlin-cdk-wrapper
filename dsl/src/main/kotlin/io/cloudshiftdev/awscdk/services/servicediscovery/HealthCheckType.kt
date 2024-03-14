package io.cloudshiftdev.awscdk.services.servicediscovery

public enum class HealthCheckType(
    private val cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckType,
) {
    HTTP(software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTP),
    HTTPS(software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTPS),
    TCP(software.amazon.awscdk.services.servicediscovery.HealthCheckType.TCP),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckType
        ): HealthCheckType =
            when (cdkObject) {
                software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTP ->
                    HealthCheckType.HTTP
                software.amazon.awscdk.services.servicediscovery.HealthCheckType.HTTPS ->
                    HealthCheckType.HTTPS
                software.amazon.awscdk.services.servicediscovery.HealthCheckType.TCP ->
                    HealthCheckType.TCP
            }

        internal fun unwrap(
            wrapped: HealthCheckType
        ): software.amazon.awscdk.services.servicediscovery.HealthCheckType = wrapped.cdkObject
    }
}
