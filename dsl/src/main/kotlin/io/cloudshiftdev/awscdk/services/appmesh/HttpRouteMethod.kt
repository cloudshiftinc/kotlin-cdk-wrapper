package io.cloudshiftdev.awscdk.services.appmesh

public enum class HttpRouteMethod(
    private val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMethod,
) {
    GET(software.amazon.awscdk.services.appmesh.HttpRouteMethod.GET),
    HEAD(software.amazon.awscdk.services.appmesh.HttpRouteMethod.HEAD),
    POST(software.amazon.awscdk.services.appmesh.HttpRouteMethod.POST),
    PUT(software.amazon.awscdk.services.appmesh.HttpRouteMethod.PUT),
    DELETE(software.amazon.awscdk.services.appmesh.HttpRouteMethod.DELETE),
    CONNECT(software.amazon.awscdk.services.appmesh.HttpRouteMethod.CONNECT),
    OPTIONS(software.amazon.awscdk.services.appmesh.HttpRouteMethod.OPTIONS),
    TRACE(software.amazon.awscdk.services.appmesh.HttpRouteMethod.TRACE),
    PATCH(software.amazon.awscdk.services.appmesh.HttpRouteMethod.PATCH),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMethod
        ): HttpRouteMethod =
            when (cdkObject) {
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.GET -> HttpRouteMethod.GET
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.HEAD -> HttpRouteMethod.HEAD
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.POST -> HttpRouteMethod.POST
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.PUT -> HttpRouteMethod.PUT
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.DELETE ->
                    HttpRouteMethod.DELETE
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.CONNECT ->
                    HttpRouteMethod.CONNECT
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.OPTIONS ->
                    HttpRouteMethod.OPTIONS
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.TRACE ->
                    HttpRouteMethod.TRACE
                software.amazon.awscdk.services.appmesh.HttpRouteMethod.PATCH ->
                    HttpRouteMethod.PATCH
            }

        internal fun unwrap(
            wrapped: HttpRouteMethod
        ): software.amazon.awscdk.services.appmesh.HttpRouteMethod = wrapped.cdkObject
    }
}
