package io.cloudshiftdev.awscdk.services.appmesh

public enum class HttpRouteProtocol(
    private val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteProtocol,
) {
    HTTP(software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTP),
    HTTPS(software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTPS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteProtocol
        ): HttpRouteProtocol =
            when (cdkObject) {
                software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTP ->
                    HttpRouteProtocol.HTTP
                software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTPS ->
                    HttpRouteProtocol.HTTPS
            }

        internal fun unwrap(
            wrapped: HttpRouteProtocol
        ): software.amazon.awscdk.services.appmesh.HttpRouteProtocol = wrapped.cdkObject
    }
}
