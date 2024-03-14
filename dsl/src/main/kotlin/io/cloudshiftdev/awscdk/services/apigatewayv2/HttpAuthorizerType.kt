package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class HttpAuthorizerType(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType,
) {
    IAM(software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.IAM),
    JWT(software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.JWT),
    LAMBDA(software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.LAMBDA),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType
        ): HttpAuthorizerType =
            when (cdkObject) {
                software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.IAM ->
                    HttpAuthorizerType.IAM
                software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.JWT ->
                    HttpAuthorizerType.JWT
                software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType.LAMBDA ->
                    HttpAuthorizerType.LAMBDA
            }

        internal fun unwrap(
            wrapped: HttpAuthorizerType
        ): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType = wrapped.cdkObject
    }
}
