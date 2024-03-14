package io.cloudshiftdev.awscdk.services.apigateway

public enum class JsonSchemaVersion(
    private val cdkObject: software.amazon.awscdk.services.apigateway.JsonSchemaVersion,
) {
    DRAFT4(software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT4),
    DRAFT7(software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT7),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.JsonSchemaVersion
        ): JsonSchemaVersion =
            when (cdkObject) {
                software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT4 ->
                    JsonSchemaVersion.DRAFT4
                software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT7 ->
                    JsonSchemaVersion.DRAFT7
            }

        internal fun unwrap(
            wrapped: JsonSchemaVersion
        ): software.amazon.awscdk.services.apigateway.JsonSchemaVersion = wrapped.cdkObject
    }
}
