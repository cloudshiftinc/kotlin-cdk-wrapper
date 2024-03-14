package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface JsonSchema {
  public fun additionalItems(): List<JsonSchema> =
      unwrap(this).getAdditionalItems()?.map(JsonSchema::wrap) ?: emptyList()

  public fun additionalProperties(): Any? = unwrap(this).getAdditionalProperties()

  public fun allOf(): List<JsonSchema> = unwrap(this).getAllOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  public fun anyOf(): List<JsonSchema> = unwrap(this).getAnyOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  public fun contains(): Any? = unwrap(this).getContains()

  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  public fun definitions(): Map<String, JsonSchema> = unwrap(this).getDefinitions()?.mapValues {
      JsonSchema.wrap(it.value)} ?: emptyMap()

  public fun dependencies(): Map<String, Any> = unwrap(this).getDependencies() ?: emptyMap()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enumValue(): List<Any> = unwrap(this).getEnumValue() ?: emptyList()

  public fun exclusiveMaximum(): Boolean? = unwrap(this).getExclusiveMaximum()

  public fun exclusiveMinimum(): Boolean? = unwrap(this).getExclusiveMinimum()

  public fun format(): String? = unwrap(this).getFormat()

  public fun id(): String? = unwrap(this).getId()

  public fun items(): Any? = unwrap(this).getItems()

  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  public fun maxProperties(): Number? = unwrap(this).getMaxProperties()

  public fun maximum(): Number? = unwrap(this).getMaximum()

  public fun minItems(): Number? = unwrap(this).getMinItems()

  public fun minLength(): Number? = unwrap(this).getMinLength()

  public fun minProperties(): Number? = unwrap(this).getMinProperties()

  public fun minimum(): Number? = unwrap(this).getMinimum()

  public fun multipleOf(): Number? = unwrap(this).getMultipleOf()

  public fun not(): JsonSchema? = unwrap(this).getNot()?.let(JsonSchema::wrap)

  public fun oneOf(): List<JsonSchema> = unwrap(this).getOneOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  public fun pattern(): String? = unwrap(this).getPattern()

  public fun patternProperties(): Map<String, JsonSchema> =
      unwrap(this).getPatternProperties()?.mapValues { JsonSchema.wrap(it.value)} ?: emptyMap()

  public fun properties(): Map<String, JsonSchema> = unwrap(this).getProperties()?.mapValues {
      JsonSchema.wrap(it.value)} ?: emptyMap()

  public fun propertyNames(): JsonSchema? = unwrap(this).getPropertyNames()?.let(JsonSchema::wrap)

  public fun ref(): String? = unwrap(this).getRef()

  public fun required(): List<String> = unwrap(this).getRequired() ?: emptyList()

  public fun schema(): JsonSchemaVersion? = unwrap(this).getSchema()?.let(JsonSchemaVersion::wrap)

  public fun title(): String? = unwrap(this).getTitle()

  public fun type(): Any? = unwrap(this).getType()

  public fun uniqueItems(): Boolean? = unwrap(this).getUniqueItems()

  public interface Builder {
    public fun additionalItems(additionalItems: List<JsonSchema>) {
    }

    public fun additionalProperties(additionalProperties: Boolean) {
    }

    public fun additionalProperties(additionalProperties: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7e78408e18b738039f407a9a88c46d42bcf2845b16597bbbc0227be06d17e2")
    public fun additionalProperties(additionalProperties: Builder.() -> Unit) {
    }

    public fun allOf(allOf: List<JsonSchema>) {
    }

    public fun anyOf(anyOf: List<JsonSchema>) {
    }

    public fun contains(contains: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86dbf701ddc733d9222e0a531a4feb149dc2782b1d870b308e3bfc7eefd8c1ca")
    public fun contains(contains: Builder.() -> Unit) {
    }

    public fun contains(contains: List<JsonSchema>) {
    }

    public fun defaultValue(defaultValue: Any) {
    }

    public fun definitions(definitions: Map<String, JsonSchema>) {
    }

    public fun dependencies(dependencies: Map<String, Any>) {
    }

    public fun description(description: String) {
    }

    public fun enumValue(enumValue: List<Any>) {
    }

    public fun exclusiveMaximum(exclusiveMaximum: Boolean) {
    }

    public fun exclusiveMinimum(exclusiveMinimum: Boolean) {
    }

    public fun format(format: String) {
    }

    public fun id(id: String) {
    }

    public fun items(items: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b20fec6a7ef255dd7facdc1a7fe2072389ea5fcfda89e43516c953f1f055752")
    public fun items(items: Builder.() -> Unit) {
    }

    public fun items(items: List<JsonSchema>) {
    }

    public fun maxItems(maxItems: Number) {
    }

    public fun maxLength(maxLength: Number) {
    }

    public fun maxProperties(maxProperties: Number) {
    }

    public fun maximum(maximum: Number) {
    }

    public fun minItems(minItems: Number) {
    }

    public fun minLength(minLength: Number) {
    }

    public fun minProperties(minProperties: Number) {
    }

    public fun minimum(minimum: Number) {
    }

    public fun multipleOf(multipleOf: Number) {
    }

    public fun not(not: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("445f0f7b77a57094179172e4a70ee83ad5aeab2a26b84a0a23614ba66b605d69")
    public fun not(not: Builder.() -> Unit) {
    }

    public fun oneOf(oneOf: List<JsonSchema>) {
    }

    public fun pattern(pattern: String) {
    }

    public fun patternProperties(patternProperties: Map<String, JsonSchema>) {
    }

    public fun properties(properties: Map<String, JsonSchema>) {
    }

    public fun propertyNames(propertyNames: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("471658186b0b46e030d032d143548bb4505bb2cf1f0dc65a06356885c467cd0e")
    public fun propertyNames(propertyNames: Builder.() -> Unit) {
    }

    public fun ref(ref: String) {
    }

    public fun required(required: List<String>) {
    }

    public fun schema(schema: JsonSchemaVersion) {
    }

    public fun title(title: String) {
    }

    public fun type(type: JsonSchemaType) {
    }

    public fun type(type: List<JsonSchemaType>) {
    }

    public fun uniqueItems(uniqueItems: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.JsonSchema.Builder =
        software.amazon.awscdk.services.apigateway.JsonSchema.builder()

    public override fun additionalItems(additionalItems: List<JsonSchema>) {
      cdkBuilder.additionalItems(additionalItems.map(JsonSchema::unwrap))
    }

    public override fun additionalProperties(additionalProperties: Boolean) {
      cdkBuilder.additionalProperties(additionalProperties)
    }

    public override fun additionalProperties(additionalProperties: JsonSchema) {
      cdkBuilder.additionalProperties(additionalProperties.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7e78408e18b738039f407a9a88c46d42bcf2845b16597bbbc0227be06d17e2")
    public override fun additionalProperties(additionalProperties: Builder.() -> Unit): Unit =
        additionalProperties(JsonSchema(additionalProperties))

    public override fun allOf(allOf: List<JsonSchema>) {
      cdkBuilder.allOf(allOf.map(JsonSchema::unwrap))
    }

    public override fun anyOf(anyOf: List<JsonSchema>) {
      cdkBuilder.anyOf(anyOf.map(JsonSchema::unwrap))
    }

    public override fun contains(contains: JsonSchema) {
      cdkBuilder.contains(contains.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86dbf701ddc733d9222e0a531a4feb149dc2782b1d870b308e3bfc7eefd8c1ca")
    public override fun contains(contains: Builder.() -> Unit): Unit =
        contains(JsonSchema(contains))

    public override fun contains(contains: List<JsonSchema>) {
      cdkBuilder.contains(contains.map(JsonSchema::unwrap))
    }

    public override fun defaultValue(defaultValue: Any) {
      cdkBuilder.defaultValue(defaultValue)
    }

    public override fun definitions(definitions: Map<String, JsonSchema>) {
      cdkBuilder.definitions(definitions.mapValues { JsonSchema.unwrap(it.value)})
    }

    public override fun dependencies(dependencies: Map<String, Any>) {
      cdkBuilder.dependencies(dependencies)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enumValue(enumValue: List<Any>) {
      cdkBuilder.enumValue(enumValue)
    }

    public override fun exclusiveMaximum(exclusiveMaximum: Boolean) {
      cdkBuilder.exclusiveMaximum(exclusiveMaximum)
    }

    public override fun exclusiveMinimum(exclusiveMinimum: Boolean) {
      cdkBuilder.exclusiveMinimum(exclusiveMinimum)
    }

    public override fun format(format: String) {
      cdkBuilder.format(format)
    }

    public override fun id(id: String) {
      cdkBuilder.id(id)
    }

    public override fun items(items: JsonSchema) {
      cdkBuilder.items(items.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b20fec6a7ef255dd7facdc1a7fe2072389ea5fcfda89e43516c953f1f055752")
    public override fun items(items: Builder.() -> Unit): Unit = items(JsonSchema(items))

    public override fun items(items: List<JsonSchema>) {
      cdkBuilder.items(items.map(JsonSchema::unwrap))
    }

    public override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    public override fun maxProperties(maxProperties: Number) {
      cdkBuilder.maxProperties(maxProperties)
    }

    public override fun maximum(maximum: Number) {
      cdkBuilder.maximum(maximum)
    }

    public override fun minItems(minItems: Number) {
      cdkBuilder.minItems(minItems)
    }

    public override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    public override fun minProperties(minProperties: Number) {
      cdkBuilder.minProperties(minProperties)
    }

    public override fun minimum(minimum: Number) {
      cdkBuilder.minimum(minimum)
    }

    public override fun multipleOf(multipleOf: Number) {
      cdkBuilder.multipleOf(multipleOf)
    }

    public override fun not(not: JsonSchema) {
      cdkBuilder.not(not.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("445f0f7b77a57094179172e4a70ee83ad5aeab2a26b84a0a23614ba66b605d69")
    public override fun not(not: Builder.() -> Unit): Unit = not(JsonSchema(not))

    public override fun oneOf(oneOf: List<JsonSchema>) {
      cdkBuilder.oneOf(oneOf.map(JsonSchema::unwrap))
    }

    public override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    public override fun patternProperties(patternProperties: Map<String, JsonSchema>) {
      cdkBuilder.patternProperties(patternProperties.mapValues { JsonSchema.unwrap(it.value)})
    }

    public override fun properties(properties: Map<String, JsonSchema>) {
      cdkBuilder.properties(properties.mapValues { JsonSchema.unwrap(it.value)})
    }

    public override fun propertyNames(propertyNames: JsonSchema) {
      cdkBuilder.propertyNames(propertyNames.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("471658186b0b46e030d032d143548bb4505bb2cf1f0dc65a06356885c467cd0e")
    public override fun propertyNames(propertyNames: Builder.() -> Unit): Unit =
        propertyNames(JsonSchema(propertyNames))

    public override fun ref(ref: String) {
      cdkBuilder.ref(ref)
    }

    public override fun required(required: List<String>) {
      cdkBuilder.required(required)
    }

    public override fun schema(schema: JsonSchemaVersion) {
      cdkBuilder.schema(schema.let(JsonSchemaVersion::unwrap))
    }

    public override fun title(title: String) {
      cdkBuilder.title(title)
    }

    public override fun type(type: JsonSchemaType) {
      cdkBuilder.type(type.let(JsonSchemaType::unwrap))
    }

    public override fun type(type: List<JsonSchemaType>) {
      cdkBuilder.type(type.map(JsonSchemaType::unwrap))
    }

    public override fun uniqueItems(uniqueItems: Boolean) {
      cdkBuilder.uniqueItems(uniqueItems)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.JsonSchema = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.JsonSchema,
  ) : JsonSchema {
    public override fun additionalItems(): List<JsonSchema> =
        unwrap(this).getAdditionalItems()?.map(JsonSchema::wrap) ?: emptyList()

    public override fun additionalProperties(): Any? = unwrap(this).getAdditionalProperties()

    public override fun allOf(): List<JsonSchema> = unwrap(this).getAllOf()?.map(JsonSchema::wrap)
        ?: emptyList()

    public override fun anyOf(): List<JsonSchema> = unwrap(this).getAnyOf()?.map(JsonSchema::wrap)
        ?: emptyList()

    public override fun contains(): Any? = unwrap(this).getContains()

    public override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    public override fun definitions(): Map<String, JsonSchema> =
        unwrap(this).getDefinitions()?.mapValues { JsonSchema.wrap(it.value)} ?: emptyMap()

    public override fun dependencies(): Map<String, Any> = unwrap(this).getDependencies() ?:
        emptyMap()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun enumValue(): List<Any> = unwrap(this).getEnumValue() ?: emptyList()

    public override fun exclusiveMaximum(): Boolean? = unwrap(this).getExclusiveMaximum()

    public override fun exclusiveMinimum(): Boolean? = unwrap(this).getExclusiveMinimum()

    public override fun format(): String? = unwrap(this).getFormat()

    public override fun id(): String? = unwrap(this).getId()

    public override fun items(): Any? = unwrap(this).getItems()

    public override fun maxItems(): Number? = unwrap(this).getMaxItems()

    public override fun maxLength(): Number? = unwrap(this).getMaxLength()

    public override fun maxProperties(): Number? = unwrap(this).getMaxProperties()

    public override fun maximum(): Number? = unwrap(this).getMaximum()

    public override fun minItems(): Number? = unwrap(this).getMinItems()

    public override fun minLength(): Number? = unwrap(this).getMinLength()

    public override fun minProperties(): Number? = unwrap(this).getMinProperties()

    public override fun minimum(): Number? = unwrap(this).getMinimum()

    public override fun multipleOf(): Number? = unwrap(this).getMultipleOf()

    public override fun not(): JsonSchema? = unwrap(this).getNot()?.let(JsonSchema::wrap)

    public override fun oneOf(): List<JsonSchema> = unwrap(this).getOneOf()?.map(JsonSchema::wrap)
        ?: emptyList()

    public override fun pattern(): String? = unwrap(this).getPattern()

    public override fun patternProperties(): Map<String, JsonSchema> =
        unwrap(this).getPatternProperties()?.mapValues { JsonSchema.wrap(it.value)} ?: emptyMap()

    public override fun properties(): Map<String, JsonSchema> =
        unwrap(this).getProperties()?.mapValues { JsonSchema.wrap(it.value)} ?: emptyMap()

    public override fun propertyNames(): JsonSchema? =
        unwrap(this).getPropertyNames()?.let(JsonSchema::wrap)

    public override fun ref(): String? = unwrap(this).getRef()

    public override fun required(): List<String> = unwrap(this).getRequired() ?: emptyList()

    public override fun schema(): JsonSchemaVersion? =
        unwrap(this).getSchema()?.let(JsonSchemaVersion::wrap)

    public override fun title(): String? = unwrap(this).getTitle()

    public override fun type(): Any? = unwrap(this).getType()

    public override fun uniqueItems(): Boolean? = unwrap(this).getUniqueItems()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): JsonSchema {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.JsonSchema): JsonSchema
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonSchema): software.amazon.awscdk.services.apigateway.JsonSchema
        = (wrapped as Wrapper).cdkObject
  }
}
