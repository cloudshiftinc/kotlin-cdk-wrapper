package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class EndpointType(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointType,
) {
    EDGE(software.amazon.awscdk.services.apigatewayv2.EndpointType.EDGE),
    REGIONAL(software.amazon.awscdk.services.apigatewayv2.EndpointType.REGIONAL),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointType
        ): EndpointType =
            when (cdkObject) {
                software.amazon.awscdk.services.apigatewayv2.EndpointType.EDGE -> EndpointType.EDGE
                software.amazon.awscdk.services.apigatewayv2.EndpointType.REGIONAL ->
                    EndpointType.REGIONAL
            }

        internal fun unwrap(
            wrapped: EndpointType
        ): software.amazon.awscdk.services.apigatewayv2.EndpointType = wrapped.cdkObject
    }
}
