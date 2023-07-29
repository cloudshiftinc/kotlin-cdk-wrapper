@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.JsonSchemaType
import software.amazon.awscdk.services.apigateway.JsonSchemaVersion

/**
 * Represents a JSON schema definition of the structure of a REST API model.
 *
 * Copied from npm module jsonschema.
 *
 * Example:
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
@CdkDslMarker
public class JsonSchemaDsl {
    private val cdkBuilder: JsonSchema.Builder = JsonSchema.builder()

    private val _additionalItems: MutableList<JsonSchema> = mutableListOf()

    private val _allOf: MutableList<JsonSchema> = mutableListOf()

    private val _anyOf: MutableList<JsonSchema> = mutableListOf()

    private val _contains: MutableList<JsonSchema> = mutableListOf()

    private val _enumValue: MutableList<Any> = mutableListOf()

    private val _items: MutableList<JsonSchema> = mutableListOf()

    private val _oneOf: MutableList<JsonSchema> = mutableListOf()

    private val _required: MutableList<String> = mutableListOf()

    private val _type: MutableList<JsonSchemaType> = mutableListOf()

    /** @param additionalItems the value to be set. */
    public fun additionalItems(additionalItems: JsonSchemaDsl.() -> Unit) {
        _additionalItems.add(JsonSchemaDsl().apply(additionalItems).build())
    }

    /** @param additionalItems the value to be set. */
    public fun additionalItems(additionalItems: Collection<JsonSchema>) {
        _additionalItems.addAll(additionalItems)
    }

    /** @param additionalProperties the value to be set. */
    public fun additionalProperties(additionalProperties: Boolean) {
        cdkBuilder.additionalProperties(additionalProperties)
    }

    /** @param additionalProperties the value to be set. */
    public fun additionalProperties(additionalProperties: JsonSchema) {
        cdkBuilder.additionalProperties(additionalProperties)
    }

    /** @param allOf the value to be set. */
    public fun allOf(allOf: JsonSchemaDsl.() -> Unit) {
        _allOf.add(JsonSchemaDsl().apply(allOf).build())
    }

    /** @param allOf the value to be set. */
    public fun allOf(allOf: Collection<JsonSchema>) {
        _allOf.addAll(allOf)
    }

    /** @param anyOf the value to be set. */
    public fun anyOf(anyOf: JsonSchemaDsl.() -> Unit) {
        _anyOf.add(JsonSchemaDsl().apply(anyOf).build())
    }

    /** @param anyOf the value to be set. */
    public fun anyOf(anyOf: Collection<JsonSchema>) {
        _anyOf.addAll(anyOf)
    }

    /** @param contains the value to be set. */
    public fun contains(contains: JsonSchemaDsl.() -> Unit) {
        _contains.add(JsonSchemaDsl().apply(contains).build())
    }

    /** @param contains the value to be set. */
    public fun contains(contains: Collection<JsonSchema>) {
        _contains.addAll(contains)
    }

    /** @param contains the value to be set. */
    public fun contains(contains: JsonSchema) {
        cdkBuilder.contains(contains)
    }

    /** @param defaultValue The default value if you use an enum. */
    public fun defaultValue(defaultValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(defaultValue)
        cdkBuilder.defaultValue(builder.map)
    }

    /** @param defaultValue The default value if you use an enum. */
    public fun defaultValue(defaultValue: Any) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param definitions the value to be set. */
    public fun definitions(definitions: Map<String, JsonSchema>) {
        cdkBuilder.definitions(definitions)
    }

    /** @param dependencies the value to be set. */
    public fun dependencies(dependencies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dependencies)
        cdkBuilder.dependencies(builder.map)
    }

    /** @param dependencies the value to be set. */
    public fun dependencies(dependencies: Map<String, Any>) {
        cdkBuilder.dependencies(dependencies)
    }

    /** @param description the value to be set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param enumValue the value to be set. */
    public fun enumValue(vararg enumValue: Any) {
        _enumValue.addAll(listOf(*enumValue))
    }

    /** @param enumValue the value to be set. */
    public fun enumValue(enumValue: Collection<Any>) {
        _enumValue.addAll(enumValue)
    }

    /** @param exclusiveMaximum the value to be set. */
    public fun exclusiveMaximum(exclusiveMaximum: Boolean) {
        cdkBuilder.exclusiveMaximum(exclusiveMaximum)
    }

    /** @param exclusiveMinimum the value to be set. */
    public fun exclusiveMinimum(exclusiveMinimum: Boolean) {
        cdkBuilder.exclusiveMinimum(exclusiveMinimum)
    }

    /** @param format the value to be set. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /** @param id the value to be set. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param items the value to be set. */
    public fun items(items: JsonSchemaDsl.() -> Unit) {
        _items.add(JsonSchemaDsl().apply(items).build())
    }

    /** @param items the value to be set. */
    public fun items(items: Collection<JsonSchema>) {
        _items.addAll(items)
    }

    /** @param items the value to be set. */
    public fun items(items: JsonSchema) {
        cdkBuilder.items(items)
    }

    /** @param maxItems the value to be set. */
    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    /** @param maxLength the value to be set. */
    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    /** @param maxProperties the value to be set. */
    public fun maxProperties(maxProperties: Number) {
        cdkBuilder.maxProperties(maxProperties)
    }

    /** @param maximum the value to be set. */
    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    /** @param minItems the value to be set. */
    public fun minItems(minItems: Number) {
        cdkBuilder.minItems(minItems)
    }

    /** @param minLength the value to be set. */
    public fun minLength(minLength: Number) {
        cdkBuilder.minLength(minLength)
    }

    /** @param minProperties the value to be set. */
    public fun minProperties(minProperties: Number) {
        cdkBuilder.minProperties(minProperties)
    }

    /** @param minimum the value to be set. */
    public fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
    }

    /** @param multipleOf the value to be set. */
    public fun multipleOf(multipleOf: Number) {
        cdkBuilder.multipleOf(multipleOf)
    }

    /** @param not the value to be set. */
    public fun not(not: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(not)
        cdkBuilder.not(builder.build())
    }

    /** @param not the value to be set. */
    public fun not(not: JsonSchema) {
        cdkBuilder.not(not)
    }

    /** @param oneOf the value to be set. */
    public fun oneOf(oneOf: JsonSchemaDsl.() -> Unit) {
        _oneOf.add(JsonSchemaDsl().apply(oneOf).build())
    }

    /** @param oneOf the value to be set. */
    public fun oneOf(oneOf: Collection<JsonSchema>) {
        _oneOf.addAll(oneOf)
    }

    /** @param pattern the value to be set. */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    /** @param patternProperties the value to be set. */
    public fun patternProperties(patternProperties: Map<String, JsonSchema>) {
        cdkBuilder.patternProperties(patternProperties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: Map<String, JsonSchema>) {
        cdkBuilder.properties(properties)
    }

    /** @param propertyNames the value to be set. */
    public fun propertyNames(propertyNames: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(propertyNames)
        cdkBuilder.propertyNames(builder.build())
    }

    /** @param propertyNames the value to be set. */
    public fun propertyNames(propertyNames: JsonSchema) {
        cdkBuilder.propertyNames(propertyNames)
    }

    /** @param ref the value to be set. */
    public fun ref(ref: String) {
        cdkBuilder.ref(ref)
    }

    /** @param required the value to be set. */
    public fun required(vararg required: String) {
        _required.addAll(listOf(*required))
    }

    /** @param required the value to be set. */
    public fun required(required: Collection<String>) {
        _required.addAll(required)
    }

    /** @param schema the value to be set. */
    public fun schema(schema: JsonSchemaVersion) {
        cdkBuilder.schema(schema)
    }

    /** @param title the value to be set. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param type the value to be set. */
    public fun type(vararg type: JsonSchemaType) {
        _type.addAll(listOf(*type))
    }

    /** @param type the value to be set. */
    public fun type(type: Collection<JsonSchemaType>) {
        _type.addAll(type)
    }

    /** @param type the value to be set. */
    public fun type(type: JsonSchemaType) {
        cdkBuilder.type(type)
    }

    /** @param uniqueItems the value to be set. */
    public fun uniqueItems(uniqueItems: Boolean) {
        cdkBuilder.uniqueItems(uniqueItems)
    }

    public fun build(): JsonSchema {
        if (_additionalItems.isNotEmpty()) cdkBuilder.additionalItems(_additionalItems)
        if (_allOf.isNotEmpty()) cdkBuilder.allOf(_allOf)
        if (_anyOf.isNotEmpty()) cdkBuilder.anyOf(_anyOf)
        if (_contains.isNotEmpty()) cdkBuilder.contains(_contains)
        if (_enumValue.isNotEmpty()) cdkBuilder.enumValue(_enumValue)
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        if (_oneOf.isNotEmpty()) cdkBuilder.oneOf(_oneOf)
        if (_required.isNotEmpty()) cdkBuilder.required(_required)
        if (_type.isNotEmpty()) cdkBuilder.type(_type)
        return cdkBuilder.build()
    }
}
