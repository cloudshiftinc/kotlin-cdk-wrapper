@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Represents a JSON schema definition of the structure of a REST API model.
 *
 * Copied from npm module jsonschema.
 *
 * Example:
 *
 * ```
 * RestApi api;
 * // We define the JSON Schema for the transformed valid response
 * Model responseModel = api.addModel("ResponseModel", ModelOptions.builder()
 * .contentType("application/json")
 * .modelName("ResponseModel")
 * .schema(JsonSchema.builder()
 * .schema(JsonSchemaVersion.DRAFT4)
 * .title("pollResponse")
 * .type(JsonSchemaType.OBJECT)
 * .properties(Map.of(
 * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
 * "greeting", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
 * .build())
 * .build());
 * // We define the JSON Schema for the transformed error response
 * Model errorResponseModel = api.addModel("ErrorResponseModel", ModelOptions.builder()
 * .contentType("application/json")
 * .modelName("ErrorResponseModel")
 * .schema(JsonSchema.builder()
 * .schema(JsonSchemaVersion.DRAFT4)
 * .title("errorResponse")
 * .type(JsonSchemaType.OBJECT)
 * .properties(Map.of(
 * "state", JsonSchema.builder().type(JsonSchemaType.STRING).build(),
 * "message", JsonSchema.builder().type(JsonSchemaType.STRING).build()))
 * .build())
 * .build());
 * ```
 *
 * [Documentation](https://github.com/tdegrunt/jsonschema)
 */
public interface JsonSchema {
  /**
   *
   */
  public fun additionalItems(): List<JsonSchema> =
      unwrap(this).getAdditionalItems()?.map(JsonSchema::wrap) ?: emptyList()

  /**
   *
   */
  public fun additionalProperties(): Any? = unwrap(this).getAdditionalProperties()

  /**
   *
   */
  public fun allOf(): List<JsonSchema> = unwrap(this).getAllOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  /**
   *
   */
  public fun anyOf(): List<JsonSchema> = unwrap(this).getAnyOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  /**
   *
   */
  public fun contains(): Any? = unwrap(this).getContains()

  /**
   * The default value if you use an enum.
   *
   * Default: - not set
   */
  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  /**
   *
   */
  public fun definitions(): Map<String, JsonSchema> =
      unwrap(this).getDefinitions()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

  /**
   *
   */
  public fun dependencies(): Map<String, Any> = unwrap(this).getDependencies() ?: emptyMap()

  /**
   *
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public fun enumValue(): List<Any> = unwrap(this).getEnumValue() ?: emptyList()

  /**
   *
   */
  public fun exclusiveMaximum(): Boolean? = unwrap(this).getExclusiveMaximum()

  /**
   *
   */
  public fun exclusiveMinimum(): Boolean? = unwrap(this).getExclusiveMinimum()

  /**
   *
   */
  public fun format(): String? = unwrap(this).getFormat()

  /**
   *
   */
  public fun id(): String? = unwrap(this).getId()

  /**
   *
   */
  public fun items(): Any? = unwrap(this).getItems()

  /**
   *
   */
  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   *
   */
  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  /**
   *
   */
  public fun maxProperties(): Number? = unwrap(this).getMaxProperties()

  /**
   *
   */
  public fun maximum(): Number? = unwrap(this).getMaximum()

  /**
   *
   */
  public fun minItems(): Number? = unwrap(this).getMinItems()

  /**
   *
   */
  public fun minLength(): Number? = unwrap(this).getMinLength()

  /**
   *
   */
  public fun minProperties(): Number? = unwrap(this).getMinProperties()

  /**
   *
   */
  public fun minimum(): Number? = unwrap(this).getMinimum()

  /**
   *
   */
  public fun multipleOf(): Number? = unwrap(this).getMultipleOf()

  /**
   *
   */
  public fun not(): JsonSchema? = unwrap(this).getNot()?.let(JsonSchema::wrap)

  /**
   *
   */
  public fun oneOf(): List<JsonSchema> = unwrap(this).getOneOf()?.map(JsonSchema::wrap) ?:
      emptyList()

  /**
   *
   */
  public fun pattern(): String? = unwrap(this).getPattern()

  /**
   *
   */
  public fun patternProperties(): Map<String, JsonSchema> =
      unwrap(this).getPatternProperties()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

  /**
   *
   */
  public fun properties(): Map<String, JsonSchema> =
      unwrap(this).getProperties()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

  /**
   *
   */
  public fun propertyNames(): JsonSchema? = unwrap(this).getPropertyNames()?.let(JsonSchema::wrap)

  /**
   *
   */
  public fun ref(): String? = unwrap(this).getRef()

  /**
   *
   */
  public fun required(): List<String> = unwrap(this).getRequired() ?: emptyList()

  /**
   *
   */
  public fun schema(): JsonSchemaVersion? = unwrap(this).getSchema()?.let(JsonSchemaVersion::wrap)

  /**
   *
   */
  public fun title(): String? = unwrap(this).getTitle()

  /**
   *
   */
  public fun type(): Any? = unwrap(this).getType()

  /**
   *
   */
  public fun uniqueItems(): Boolean? = unwrap(this).getUniqueItems()

  /**
   * A builder for [JsonSchema]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalItems the value to be set.
     */
    public fun additionalItems(additionalItems: List<JsonSchema>)

    /**
     * @param additionalItems the value to be set.
     */
    public fun additionalItems(vararg additionalItems: JsonSchema)

    /**
     * @param additionalProperties the value to be set.
     */
    public fun additionalProperties(additionalProperties: Boolean)

    /**
     * @param additionalProperties the value to be set.
     */
    public fun additionalProperties(additionalProperties: JsonSchema)

    /**
     * @param additionalProperties the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7e78408e18b738039f407a9a88c46d42bcf2845b16597bbbc0227be06d17e2")
    public fun additionalProperties(additionalProperties: Builder.() -> Unit)

    /**
     * @param allOf the value to be set.
     */
    public fun allOf(allOf: List<JsonSchema>)

    /**
     * @param allOf the value to be set.
     */
    public fun allOf(vararg allOf: JsonSchema)

    /**
     * @param anyOf the value to be set.
     */
    public fun anyOf(anyOf: List<JsonSchema>)

    /**
     * @param anyOf the value to be set.
     */
    public fun anyOf(vararg anyOf: JsonSchema)

    /**
     * @param contains the value to be set.
     */
    public fun contains(contains: JsonSchema)

    /**
     * @param contains the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86dbf701ddc733d9222e0a531a4feb149dc2782b1d870b308e3bfc7eefd8c1ca")
    public fun contains(contains: Builder.() -> Unit)

    /**
     * @param contains the value to be set.
     */
    public fun contains(contains: List<JsonSchema>)

    /**
     * @param contains the value to be set.
     */
    public fun contains(vararg contains: JsonSchema)

    /**
     * @param defaultValue The default value if you use an enum.
     */
    public fun defaultValue(defaultValue: Any)

    /**
     * @param definitions the value to be set.
     */
    public fun definitions(definitions: Map<String, JsonSchema>)

    /**
     * @param dependencies the value to be set.
     */
    public fun dependencies(dependencies: Map<String, Any>)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param enumValue the value to be set.
     */
    public fun enumValue(enumValue: List<Any>)

    /**
     * @param enumValue the value to be set.
     */
    public fun enumValue(vararg enumValue: Any)

    /**
     * @param exclusiveMaximum the value to be set.
     */
    public fun exclusiveMaximum(exclusiveMaximum: Boolean)

    /**
     * @param exclusiveMinimum the value to be set.
     */
    public fun exclusiveMinimum(exclusiveMinimum: Boolean)

    /**
     * @param format the value to be set.
     */
    public fun format(format: String)

    /**
     * @param id the value to be set.
     */
    public fun id(id: String)

    /**
     * @param items the value to be set.
     */
    public fun items(items: JsonSchema)

    /**
     * @param items the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b20fec6a7ef255dd7facdc1a7fe2072389ea5fcfda89e43516c953f1f055752")
    public fun items(items: Builder.() -> Unit)

    /**
     * @param items the value to be set.
     */
    public fun items(items: List<JsonSchema>)

    /**
     * @param items the value to be set.
     */
    public fun items(vararg items: JsonSchema)

    /**
     * @param maxItems the value to be set.
     */
    public fun maxItems(maxItems: Number)

    /**
     * @param maxLength the value to be set.
     */
    public fun maxLength(maxLength: Number)

    /**
     * @param maxProperties the value to be set.
     */
    public fun maxProperties(maxProperties: Number)

    /**
     * @param maximum the value to be set.
     */
    public fun maximum(maximum: Number)

    /**
     * @param minItems the value to be set.
     */
    public fun minItems(minItems: Number)

    /**
     * @param minLength the value to be set.
     */
    public fun minLength(minLength: Number)

    /**
     * @param minProperties the value to be set.
     */
    public fun minProperties(minProperties: Number)

    /**
     * @param minimum the value to be set.
     */
    public fun minimum(minimum: Number)

    /**
     * @param multipleOf the value to be set.
     */
    public fun multipleOf(multipleOf: Number)

    /**
     * @param not the value to be set.
     */
    public fun not(not: JsonSchema)

    /**
     * @param not the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("445f0f7b77a57094179172e4a70ee83ad5aeab2a26b84a0a23614ba66b605d69")
    public fun not(not: Builder.() -> Unit)

    /**
     * @param oneOf the value to be set.
     */
    public fun oneOf(oneOf: List<JsonSchema>)

    /**
     * @param oneOf the value to be set.
     */
    public fun oneOf(vararg oneOf: JsonSchema)

    /**
     * @param pattern the value to be set.
     */
    public fun pattern(pattern: String)

    /**
     * @param patternProperties the value to be set.
     */
    public fun patternProperties(patternProperties: Map<String, JsonSchema>)

    /**
     * @param properties the value to be set.
     */
    public fun properties(properties: Map<String, JsonSchema>)

    /**
     * @param propertyNames the value to be set.
     */
    public fun propertyNames(propertyNames: JsonSchema)

    /**
     * @param propertyNames the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("471658186b0b46e030d032d143548bb4505bb2cf1f0dc65a06356885c467cd0e")
    public fun propertyNames(propertyNames: Builder.() -> Unit)

    /**
     * @param ref the value to be set.
     */
    public fun ref(ref: String)

    /**
     * @param required the value to be set.
     */
    public fun required(required: List<String>)

    /**
     * @param required the value to be set.
     */
    public fun required(vararg required: String)

    /**
     * @param schema the value to be set.
     */
    public fun schema(schema: JsonSchemaVersion)

    /**
     * @param title the value to be set.
     */
    public fun title(title: String)

    /**
     * @param type the value to be set.
     */
    public fun type(type: JsonSchemaType)

    /**
     * @param type the value to be set.
     */
    public fun type(type: List<JsonSchemaType>)

    /**
     * @param type the value to be set.
     */
    public fun type(vararg type: JsonSchemaType)

    /**
     * @param uniqueItems the value to be set.
     */
    public fun uniqueItems(uniqueItems: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.JsonSchema.Builder =
        software.amazon.awscdk.services.apigateway.JsonSchema.builder()

    /**
     * @param additionalItems the value to be set.
     */
    override fun additionalItems(additionalItems: List<JsonSchema>) {
      cdkBuilder.additionalItems(additionalItems.map(JsonSchema::unwrap))
    }

    /**
     * @param additionalItems the value to be set.
     */
    override fun additionalItems(vararg additionalItems: JsonSchema): Unit =
        additionalItems(additionalItems.toList())

    /**
     * @param additionalProperties the value to be set.
     */
    override fun additionalProperties(additionalProperties: Boolean) {
      cdkBuilder.additionalProperties(additionalProperties)
    }

    /**
     * @param additionalProperties the value to be set.
     */
    override fun additionalProperties(additionalProperties: JsonSchema) {
      cdkBuilder.additionalProperties(additionalProperties.let(JsonSchema::unwrap))
    }

    /**
     * @param additionalProperties the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7e78408e18b738039f407a9a88c46d42bcf2845b16597bbbc0227be06d17e2")
    override fun additionalProperties(additionalProperties: Builder.() -> Unit): Unit =
        additionalProperties(JsonSchema(additionalProperties))

    /**
     * @param allOf the value to be set.
     */
    override fun allOf(allOf: List<JsonSchema>) {
      cdkBuilder.allOf(allOf.map(JsonSchema::unwrap))
    }

    /**
     * @param allOf the value to be set.
     */
    override fun allOf(vararg allOf: JsonSchema): Unit = allOf(allOf.toList())

    /**
     * @param anyOf the value to be set.
     */
    override fun anyOf(anyOf: List<JsonSchema>) {
      cdkBuilder.anyOf(anyOf.map(JsonSchema::unwrap))
    }

    /**
     * @param anyOf the value to be set.
     */
    override fun anyOf(vararg anyOf: JsonSchema): Unit = anyOf(anyOf.toList())

    /**
     * @param contains the value to be set.
     */
    override fun contains(contains: JsonSchema) {
      cdkBuilder.contains(contains.let(JsonSchema::unwrap))
    }

    /**
     * @param contains the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86dbf701ddc733d9222e0a531a4feb149dc2782b1d870b308e3bfc7eefd8c1ca")
    override fun contains(contains: Builder.() -> Unit): Unit = contains(JsonSchema(contains))

    /**
     * @param contains the value to be set.
     */
    override fun contains(contains: List<JsonSchema>) {
      cdkBuilder.contains(contains.map(JsonSchema::unwrap))
    }

    /**
     * @param contains the value to be set.
     */
    override fun contains(vararg contains: JsonSchema): Unit = contains(contains.toList())

    /**
     * @param defaultValue The default value if you use an enum.
     */
    override fun defaultValue(defaultValue: Any) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param definitions the value to be set.
     */
    override fun definitions(definitions: Map<String, JsonSchema>) {
      cdkBuilder.definitions(definitions.mapValues{JsonSchema.unwrap(it.value)})
    }

    /**
     * @param dependencies the value to be set.
     */
    override fun dependencies(dependencies: Map<String, Any>) {
      cdkBuilder.dependencies(dependencies)
    }

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enumValue the value to be set.
     */
    override fun enumValue(enumValue: List<Any>) {
      cdkBuilder.enumValue(enumValue)
    }

    /**
     * @param enumValue the value to be set.
     */
    override fun enumValue(vararg enumValue: Any): Unit = enumValue(enumValue.toList())

    /**
     * @param exclusiveMaximum the value to be set.
     */
    override fun exclusiveMaximum(exclusiveMaximum: Boolean) {
      cdkBuilder.exclusiveMaximum(exclusiveMaximum)
    }

    /**
     * @param exclusiveMinimum the value to be set.
     */
    override fun exclusiveMinimum(exclusiveMinimum: Boolean) {
      cdkBuilder.exclusiveMinimum(exclusiveMinimum)
    }

    /**
     * @param format the value to be set.
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param id the value to be set.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param items the value to be set.
     */
    override fun items(items: JsonSchema) {
      cdkBuilder.items(items.let(JsonSchema::unwrap))
    }

    /**
     * @param items the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b20fec6a7ef255dd7facdc1a7fe2072389ea5fcfda89e43516c953f1f055752")
    override fun items(items: Builder.() -> Unit): Unit = items(JsonSchema(items))

    /**
     * @param items the value to be set.
     */
    override fun items(items: List<JsonSchema>) {
      cdkBuilder.items(items.map(JsonSchema::unwrap))
    }

    /**
     * @param items the value to be set.
     */
    override fun items(vararg items: JsonSchema): Unit = items(items.toList())

    /**
     * @param maxItems the value to be set.
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    /**
     * @param maxLength the value to be set.
     */
    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    /**
     * @param maxProperties the value to be set.
     */
    override fun maxProperties(maxProperties: Number) {
      cdkBuilder.maxProperties(maxProperties)
    }

    /**
     * @param maximum the value to be set.
     */
    override fun maximum(maximum: Number) {
      cdkBuilder.maximum(maximum)
    }

    /**
     * @param minItems the value to be set.
     */
    override fun minItems(minItems: Number) {
      cdkBuilder.minItems(minItems)
    }

    /**
     * @param minLength the value to be set.
     */
    override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    /**
     * @param minProperties the value to be set.
     */
    override fun minProperties(minProperties: Number) {
      cdkBuilder.minProperties(minProperties)
    }

    /**
     * @param minimum the value to be set.
     */
    override fun minimum(minimum: Number) {
      cdkBuilder.minimum(minimum)
    }

    /**
     * @param multipleOf the value to be set.
     */
    override fun multipleOf(multipleOf: Number) {
      cdkBuilder.multipleOf(multipleOf)
    }

    /**
     * @param not the value to be set.
     */
    override fun not(not: JsonSchema) {
      cdkBuilder.not(not.let(JsonSchema::unwrap))
    }

    /**
     * @param not the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("445f0f7b77a57094179172e4a70ee83ad5aeab2a26b84a0a23614ba66b605d69")
    override fun not(not: Builder.() -> Unit): Unit = not(JsonSchema(not))

    /**
     * @param oneOf the value to be set.
     */
    override fun oneOf(oneOf: List<JsonSchema>) {
      cdkBuilder.oneOf(oneOf.map(JsonSchema::unwrap))
    }

    /**
     * @param oneOf the value to be set.
     */
    override fun oneOf(vararg oneOf: JsonSchema): Unit = oneOf(oneOf.toList())

    /**
     * @param pattern the value to be set.
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * @param patternProperties the value to be set.
     */
    override fun patternProperties(patternProperties: Map<String, JsonSchema>) {
      cdkBuilder.patternProperties(patternProperties.mapValues{JsonSchema.unwrap(it.value)})
    }

    /**
     * @param properties the value to be set.
     */
    override fun properties(properties: Map<String, JsonSchema>) {
      cdkBuilder.properties(properties.mapValues{JsonSchema.unwrap(it.value)})
    }

    /**
     * @param propertyNames the value to be set.
     */
    override fun propertyNames(propertyNames: JsonSchema) {
      cdkBuilder.propertyNames(propertyNames.let(JsonSchema::unwrap))
    }

    /**
     * @param propertyNames the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("471658186b0b46e030d032d143548bb4505bb2cf1f0dc65a06356885c467cd0e")
    override fun propertyNames(propertyNames: Builder.() -> Unit): Unit =
        propertyNames(JsonSchema(propertyNames))

    /**
     * @param ref the value to be set.
     */
    override fun ref(ref: String) {
      cdkBuilder.ref(ref)
    }

    /**
     * @param required the value to be set.
     */
    override fun required(required: List<String>) {
      cdkBuilder.required(required)
    }

    /**
     * @param required the value to be set.
     */
    override fun required(vararg required: String): Unit = required(required.toList())

    /**
     * @param schema the value to be set.
     */
    override fun schema(schema: JsonSchemaVersion) {
      cdkBuilder.schema(schema.let(JsonSchemaVersion::unwrap))
    }

    /**
     * @param title the value to be set.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param type the value to be set.
     */
    override fun type(type: JsonSchemaType) {
      cdkBuilder.type(type.let(JsonSchemaType::unwrap))
    }

    /**
     * @param type the value to be set.
     */
    override fun type(type: List<JsonSchemaType>) {
      cdkBuilder.type(type.map(JsonSchemaType::unwrap))
    }

    /**
     * @param type the value to be set.
     */
    override fun type(vararg type: JsonSchemaType): Unit = type(type.toList())

    /**
     * @param uniqueItems the value to be set.
     */
    override fun uniqueItems(uniqueItems: Boolean) {
      cdkBuilder.uniqueItems(uniqueItems)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.JsonSchema = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.JsonSchema,
  ) : CdkObject(cdkObject), JsonSchema {
    /**
     *
     */
    override fun additionalItems(): List<JsonSchema> =
        unwrap(this).getAdditionalItems()?.map(JsonSchema::wrap) ?: emptyList()

    /**
     *
     */
    override fun additionalProperties(): Any? = unwrap(this).getAdditionalProperties()

    /**
     *
     */
    override fun allOf(): List<JsonSchema> = unwrap(this).getAllOf()?.map(JsonSchema::wrap) ?:
        emptyList()

    /**
     *
     */
    override fun anyOf(): List<JsonSchema> = unwrap(this).getAnyOf()?.map(JsonSchema::wrap) ?:
        emptyList()

    /**
     *
     */
    override fun contains(): Any? = unwrap(this).getContains()

    /**
     * The default value if you use an enum.
     *
     * Default: - not set
     */
    override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     *
     */
    override fun definitions(): Map<String, JsonSchema> =
        unwrap(this).getDefinitions()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

    /**
     *
     */
    override fun dependencies(): Map<String, Any> = unwrap(this).getDependencies() ?: emptyMap()

    /**
     *
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     *
     */
    override fun enumValue(): List<Any> = unwrap(this).getEnumValue() ?: emptyList()

    /**
     *
     */
    override fun exclusiveMaximum(): Boolean? = unwrap(this).getExclusiveMaximum()

    /**
     *
     */
    override fun exclusiveMinimum(): Boolean? = unwrap(this).getExclusiveMinimum()

    /**
     *
     */
    override fun format(): String? = unwrap(this).getFormat()

    /**
     *
     */
    override fun id(): String? = unwrap(this).getId()

    /**
     *
     */
    override fun items(): Any? = unwrap(this).getItems()

    /**
     *
     */
    override fun maxItems(): Number? = unwrap(this).getMaxItems()

    /**
     *
     */
    override fun maxLength(): Number? = unwrap(this).getMaxLength()

    /**
     *
     */
    override fun maxProperties(): Number? = unwrap(this).getMaxProperties()

    /**
     *
     */
    override fun maximum(): Number? = unwrap(this).getMaximum()

    /**
     *
     */
    override fun minItems(): Number? = unwrap(this).getMinItems()

    /**
     *
     */
    override fun minLength(): Number? = unwrap(this).getMinLength()

    /**
     *
     */
    override fun minProperties(): Number? = unwrap(this).getMinProperties()

    /**
     *
     */
    override fun minimum(): Number? = unwrap(this).getMinimum()

    /**
     *
     */
    override fun multipleOf(): Number? = unwrap(this).getMultipleOf()

    /**
     *
     */
    override fun not(): JsonSchema? = unwrap(this).getNot()?.let(JsonSchema::wrap)

    /**
     *
     */
    override fun oneOf(): List<JsonSchema> = unwrap(this).getOneOf()?.map(JsonSchema::wrap) ?:
        emptyList()

    /**
     *
     */
    override fun pattern(): String? = unwrap(this).getPattern()

    /**
     *
     */
    override fun patternProperties(): Map<String, JsonSchema> =
        unwrap(this).getPatternProperties()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

    /**
     *
     */
    override fun properties(): Map<String, JsonSchema> =
        unwrap(this).getProperties()?.mapValues{JsonSchema.wrap(it.value)} ?: emptyMap()

    /**
     *
     */
    override fun propertyNames(): JsonSchema? =
        unwrap(this).getPropertyNames()?.let(JsonSchema::wrap)

    /**
     *
     */
    override fun ref(): String? = unwrap(this).getRef()

    /**
     *
     */
    override fun required(): List<String> = unwrap(this).getRequired() ?: emptyList()

    /**
     *
     */
    override fun schema(): JsonSchemaVersion? =
        unwrap(this).getSchema()?.let(JsonSchemaVersion::wrap)

    /**
     *
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     *
     */
    override fun type(): Any? = unwrap(this).getType()

    /**
     *
     */
    override fun uniqueItems(): Boolean? = unwrap(this).getUniqueItems()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonSchema {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.JsonSchema): JsonSchema
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonSchema): software.amazon.awscdk.services.apigateway.JsonSchema
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.JsonSchema
  }
}
