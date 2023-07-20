@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.JsonSchemaType
import software.amazon.awscdk.services.apigateway.JsonSchemaVersion
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

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

    public fun additionalItems(additionalItems: JsonSchemaDsl.() -> Unit) {
        _additionalItems.add(JsonSchemaDsl().apply(additionalItems).build())
    }

    public fun additionalItems(additionalItems: Collection<JsonSchema>) {
        _additionalItems.addAll(additionalItems)
    }

    public fun additionalProperties(additionalProperties: Boolean) {
        cdkBuilder.additionalProperties(additionalProperties)
    }

    public fun additionalProperties(additionalProperties: JsonSchema) {
        cdkBuilder.additionalProperties(additionalProperties)
    }

    public fun allOf(allOf: JsonSchemaDsl.() -> Unit) {
        _allOf.add(JsonSchemaDsl().apply(allOf).build())
    }

    public fun allOf(allOf: Collection<JsonSchema>) {
        _allOf.addAll(allOf)
    }

    public fun anyOf(anyOf: JsonSchemaDsl.() -> Unit) {
        _anyOf.add(JsonSchemaDsl().apply(anyOf).build())
    }

    public fun anyOf(anyOf: Collection<JsonSchema>) {
        _anyOf.addAll(anyOf)
    }

    public fun contains(contains: JsonSchemaDsl.() -> Unit) {
        _contains.add(JsonSchemaDsl().apply(contains).build())
    }

    public fun contains(contains: Collection<JsonSchema>) {
        _contains.addAll(contains)
    }

    public fun contains(contains: JsonSchema) {
        cdkBuilder.contains(contains)
    }

    public fun defaultValue(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.defaultValue(builder.map)
    }

    public fun defaultValue(defaultValue: Any) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun definitions(definitions: Map<String, JsonSchema>) {
        cdkBuilder.definitions(definitions)
    }

    public fun dependencies(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dependencies(builder.map)
    }

    public fun dependencies(dependencies: Map<String, Any>) {
        cdkBuilder.dependencies(dependencies)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enumValue(vararg enumValue: Any) {
        _enumValue.addAll(listOf(*enumValue))
    }

    public fun enumValue(enumValue: Collection<Any>) {
        _enumValue.addAll(enumValue)
    }

    public fun exclusiveMaximum(exclusiveMaximum: Boolean) {
        cdkBuilder.exclusiveMaximum(exclusiveMaximum)
    }

    public fun exclusiveMinimum(exclusiveMinimum: Boolean) {
        cdkBuilder.exclusiveMinimum(exclusiveMinimum)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun items(items: JsonSchemaDsl.() -> Unit) {
        _items.add(JsonSchemaDsl().apply(items).build())
    }

    public fun items(items: Collection<JsonSchema>) {
        _items.addAll(items)
    }

    public fun items(items: JsonSchema) {
        cdkBuilder.items(items)
    }

    public fun maxItems(maxItems: Number) {
        cdkBuilder.maxItems(maxItems)
    }

    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    public fun maxProperties(maxProperties: Number) {
        cdkBuilder.maxProperties(maxProperties)
    }

    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    public fun minItems(minItems: Number) {
        cdkBuilder.minItems(minItems)
    }

    public fun minLength(minLength: Number) {
        cdkBuilder.minLength(minLength)
    }

    public fun minProperties(minProperties: Number) {
        cdkBuilder.minProperties(minProperties)
    }

    public fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
    }

    public fun multipleOf(multipleOf: Number) {
        cdkBuilder.multipleOf(multipleOf)
    }

    public fun not(block: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(block)
        cdkBuilder.not(builder.build())
    }

    public fun not(not: JsonSchema) {
        cdkBuilder.not(not)
    }

    public fun oneOf(oneOf: JsonSchemaDsl.() -> Unit) {
        _oneOf.add(JsonSchemaDsl().apply(oneOf).build())
    }

    public fun oneOf(oneOf: Collection<JsonSchema>) {
        _oneOf.addAll(oneOf)
    }

    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun patternProperties(patternProperties: Map<String, JsonSchema>) {
        cdkBuilder.patternProperties(patternProperties)
    }

    public fun properties(properties: Map<String, JsonSchema>) {
        cdkBuilder.properties(properties)
    }

    public fun propertyNames(block: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(block)
        cdkBuilder.propertyNames(builder.build())
    }

    public fun propertyNames(propertyNames: JsonSchema) {
        cdkBuilder.propertyNames(propertyNames)
    }

    public fun ref(ref: String) {
        cdkBuilder.ref(ref)
    }

    public fun required(vararg required: String) {
        _required.addAll(listOf(*required))
    }

    public fun required(required: Collection<String>) {
        _required.addAll(required)
    }

    public fun schema(schema: JsonSchemaVersion) {
        cdkBuilder.schema(schema)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun type(vararg type: JsonSchemaType) {
        _type.addAll(listOf(*type))
    }

    public fun type(type: Collection<JsonSchemaType>) {
        _type.addAll(type)
    }

    public fun type(type: JsonSchemaType) {
        cdkBuilder.type(type)
    }

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
