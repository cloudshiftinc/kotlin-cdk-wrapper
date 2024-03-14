package io.cloudshiftdev.awscdk.services.apigateway

public enum class AuthorizationType(
    private val cdkObject: software.amazon.awscdk.services.apigateway.AuthorizationType,
) {
    NONE(software.amazon.awscdk.services.apigateway.AuthorizationType.NONE),
    IAM(software.amazon.awscdk.services.apigateway.AuthorizationType.IAM),
    CUSTOM(software.amazon.awscdk.services.apigateway.AuthorizationType.CUSTOM),
    COGNITO(software.amazon.awscdk.services.apigateway.AuthorizationType.COGNITO),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.AuthorizationType
        ): AuthorizationType =
            when (cdkObject) {
                software.amazon.awscdk.services.apigateway.AuthorizationType.NONE ->
                    AuthorizationType.NONE
                software.amazon.awscdk.services.apigateway.AuthorizationType.IAM ->
                    AuthorizationType.IAM
                software.amazon.awscdk.services.apigateway.AuthorizationType.CUSTOM ->
                    AuthorizationType.CUSTOM
                software.amazon.awscdk.services.apigateway.AuthorizationType.COGNITO ->
                    AuthorizationType.COGNITO
            }

        internal fun unwrap(
            wrapped: AuthorizationType
        ): software.amazon.awscdk.services.apigateway.AuthorizationType = wrapped.cdkObject
    }
}
