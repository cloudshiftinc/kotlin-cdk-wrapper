package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class CorsHttpMethod(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod,
) {
    ANY(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.ANY),
    DELETE(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.DELETE),
    GET(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.GET),
    HEAD(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.HEAD),
    OPTIONS(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.OPTIONS),
    PATCH(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.PATCH),
    POST(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.POST),
    PUT(software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.PUT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod
        ): CorsHttpMethod =
            when (cdkObject) {
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.ANY ->
                    CorsHttpMethod.ANY
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.DELETE ->
                    CorsHttpMethod.DELETE
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.GET ->
                    CorsHttpMethod.GET
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.HEAD ->
                    CorsHttpMethod.HEAD
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.OPTIONS ->
                    CorsHttpMethod.OPTIONS
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.PATCH ->
                    CorsHttpMethod.PATCH
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.POST ->
                    CorsHttpMethod.POST
                software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod.PUT ->
                    CorsHttpMethod.PUT
            }

        internal fun unwrap(
            wrapped: CorsHttpMethod
        ): software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod = wrapped.cdkObject
    }
}
