package io.cloudshiftdev.awscdk.services.apigateway

public enum class JsonSchemaType(
  private val cdkObject: software.amazon.awscdk.services.apigateway.JsonSchemaType,
) {
  NULL(software.amazon.awscdk.services.apigateway.JsonSchemaType.NULL),
  BOOLEAN(software.amazon.awscdk.services.apigateway.JsonSchemaType.BOOLEAN),
  OBJECT(software.amazon.awscdk.services.apigateway.JsonSchemaType.OBJECT),
  ARRAY(software.amazon.awscdk.services.apigateway.JsonSchemaType.ARRAY),
  NUMBER(software.amazon.awscdk.services.apigateway.JsonSchemaType.NUMBER),
  INTEGER(software.amazon.awscdk.services.apigateway.JsonSchemaType.INTEGER),
  STRING(software.amazon.awscdk.services.apigateway.JsonSchemaType.STRING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.JsonSchemaType):
        JsonSchemaType = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.JsonSchemaType.NULL -> JsonSchemaType.NULL
      software.amazon.awscdk.services.apigateway.JsonSchemaType.BOOLEAN -> JsonSchemaType.BOOLEAN
      software.amazon.awscdk.services.apigateway.JsonSchemaType.OBJECT -> JsonSchemaType.OBJECT
      software.amazon.awscdk.services.apigateway.JsonSchemaType.ARRAY -> JsonSchemaType.ARRAY
      software.amazon.awscdk.services.apigateway.JsonSchemaType.NUMBER -> JsonSchemaType.NUMBER
      software.amazon.awscdk.services.apigateway.JsonSchemaType.INTEGER -> JsonSchemaType.INTEGER
      software.amazon.awscdk.services.apigateway.JsonSchemaType.STRING -> JsonSchemaType.STRING
    }

    internal fun unwrap(wrapped: JsonSchemaType):
        software.amazon.awscdk.services.apigateway.JsonSchemaType = wrapped.cdkObject
  }
}
