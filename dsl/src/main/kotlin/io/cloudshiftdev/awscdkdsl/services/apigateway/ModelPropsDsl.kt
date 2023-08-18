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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.ModelProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Object default_;
 * Object enum_;
 * JsonSchema jsonSchema_;
 * RestApi restApi;
 * ModelProps modelProps = ModelProps.builder()
 * .restApi(restApi)
 * .schema(JsonSchema.builder()
 * .additionalItems(List.of(jsonSchema_))
 * .additionalProperties(false)
 * .allOf(List.of(jsonSchema_))
 * .anyOf(List.of(jsonSchema_))
 * .contains(jsonSchema_)
 * .default(default_)
 * .definitions(Map.of(
 * "definitionsKey", jsonSchema_))
 * .dependencies(Map.of(
 * "dependenciesKey", List.of("dependencies")))
 * .description("description")
 * .enum(List.of(enum_))
 * .exclusiveMaximum(false)
 * .exclusiveMinimum(false)
 * .format("format")
 * .id("id")
 * .items(jsonSchema_)
 * .maximum(123)
 * .maxItems(123)
 * .maxLength(123)
 * .maxProperties(123)
 * .minimum(123)
 * .minItems(123)
 * .minLength(123)
 * .minProperties(123)
 * .multipleOf(123)
 * .not(jsonSchema_)
 * .oneOf(List.of(jsonSchema_))
 * .pattern("pattern")
 * .patternProperties(Map.of(
 * "patternPropertiesKey", jsonSchema_))
 * .properties(Map.of(
 * "propertiesKey", jsonSchema_))
 * .propertyNames(jsonSchema_)
 * .ref("ref")
 * .required(List.of("required"))
 * .schema(JsonSchemaVersion.DRAFT4)
 * .title("title")
 * .type(JsonSchemaType.NULL)
 * .uniqueItems(false)
 * .build())
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .modelName("modelName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ModelPropsDsl {
    private val cdkBuilder: ModelProps.Builder = ModelProps.builder()

    /**
     * @param contentType The content type for the model. You can also force a content type in the
     *   request or response model mapping.
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param description A description that identifies this model. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param modelName A name for the model. Important If you specify a name, you cannot perform
     *   updates that require replacement of this resource. You can perform updates that require no
     *   or some interruption. If you must replace the resource, specify a new name.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /**
     * @param restApi The rest API that this model is part of. The reason we need the RestApi object
     *   itself and not just the ID is because the model is being tracked by the top-level RestApi
     *   object for the purpose of calculating it's hash to determine the ID of the deployment. This
     *   allows us to automatically update the deployment when the model of the REST API changes.
     */
    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    /**
     * @param schema The schema to use to transform data to one or more output formats. Specify null
     *   ({}) if you don't want to specify a schema.
     */
    public fun schema(schema: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(schema)
        cdkBuilder.schema(builder.build())
    }

    /**
     * @param schema The schema to use to transform data to one or more output formats. Specify null
     *   ({}) if you don't want to specify a schema.
     */
    public fun schema(schema: JsonSchema) {
        cdkBuilder.schema(schema)
    }

    public fun build(): ModelProps = cdkBuilder.build()
}
