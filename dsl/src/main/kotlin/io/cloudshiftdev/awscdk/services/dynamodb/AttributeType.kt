package io.cloudshiftdev.awscdk.services.dynamodb

public enum class AttributeType(
    private val cdkObject: software.amazon.awscdk.services.dynamodb.AttributeType,
) {
    BINARY(software.amazon.awscdk.services.dynamodb.AttributeType.BINARY),
    NUMBER(software.amazon.awscdk.services.dynamodb.AttributeType.NUMBER),
    STRING(software.amazon.awscdk.services.dynamodb.AttributeType.STRING),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dynamodb.AttributeType
        ): AttributeType =
            when (cdkObject) {
                software.amazon.awscdk.services.dynamodb.AttributeType.BINARY ->
                    AttributeType.BINARY
                software.amazon.awscdk.services.dynamodb.AttributeType.NUMBER ->
                    AttributeType.NUMBER
                software.amazon.awscdk.services.dynamodb.AttributeType.STRING ->
                    AttributeType.STRING
            }

        internal fun unwrap(
            wrapped: AttributeType
        ): software.amazon.awscdk.services.dynamodb.AttributeType = wrapped.cdkObject
    }
}
