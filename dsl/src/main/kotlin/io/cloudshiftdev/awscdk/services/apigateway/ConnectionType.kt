package io.cloudshiftdev.awscdk.services.apigateway

public enum class ConnectionType(
    private val cdkObject: software.amazon.awscdk.services.apigateway.ConnectionType,
) {
    INTERNET(software.amazon.awscdk.services.apigateway.ConnectionType.INTERNET),
    VPC_LINK(software.amazon.awscdk.services.apigateway.ConnectionType.VPC_LINK),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.ConnectionType
        ): ConnectionType =
            when (cdkObject) {
                software.amazon.awscdk.services.apigateway.ConnectionType.INTERNET ->
                    ConnectionType.INTERNET
                software.amazon.awscdk.services.apigateway.ConnectionType.VPC_LINK ->
                    ConnectionType.VPC_LINK
            }

        internal fun unwrap(
            wrapped: ConnectionType
        ): software.amazon.awscdk.services.apigateway.ConnectionType = wrapped.cdkObject
    }
}
