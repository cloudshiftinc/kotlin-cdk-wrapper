package io.cloudshiftdev.awscdk.services.apigateway

public enum class ApiKeySourceType(
    private val cdkObject: software.amazon.awscdk.services.apigateway.ApiKeySourceType,
) {
    HEADER(software.amazon.awscdk.services.apigateway.ApiKeySourceType.HEADER),
    AUTHORIZER(software.amazon.awscdk.services.apigateway.ApiKeySourceType.AUTHORIZER),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.ApiKeySourceType
        ): ApiKeySourceType =
            when (cdkObject) {
                software.amazon.awscdk.services.apigateway.ApiKeySourceType.HEADER ->
                    ApiKeySourceType.HEADER
                software.amazon.awscdk.services.apigateway.ApiKeySourceType.AUTHORIZER ->
                    ApiKeySourceType.AUTHORIZER
            }

        internal fun unwrap(
            wrapped: ApiKeySourceType
        ): software.amazon.awscdk.services.apigateway.ApiKeySourceType = wrapped.cdkObject
    }
}
