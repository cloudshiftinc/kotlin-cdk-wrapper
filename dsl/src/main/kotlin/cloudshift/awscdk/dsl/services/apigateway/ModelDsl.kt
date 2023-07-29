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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.Model
import software.constructs.Construct

/**
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
 */
@CdkDslMarker
public class ModelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Model.Builder = Model.Builder.create(scope, id)

    /**
     * The content type for the model.
     *
     * You can also force a content type in the request or response model mapping.
     *
     * Default: 'application/json'
     *
     * @param contentType The content type for the model.
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /**
     * A description that identifies this model.
     *
     * Default: None
     *
     * @param description A description that identifies this model.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A name for the model.
     *
     * Important If you specify a name, you cannot perform updates that require replacement of this
     * resource. You can perform updates that require no or some interruption. If you must replace
     * the resource, specify a new name.
     *
     * Default: <auto> If you don't specify a name, AWS CloudFormation generates a unique physical
     * ID and uses that ID for the model name. For more information, see Name Type.
     *
     * @param modelName A name for the model.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /**
     * The rest API that this model is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model is
     * being tracked by the top-level RestApi object for the purpose of calculating it's hash to
     * determine the ID of the deployment. This allows us to automatically update the deployment
     * when the model of the REST API changes.
     *
     * @param restApi The rest API that this model is part of.
     */
    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    /**
     * The schema to use to transform data to one or more output formats.
     *
     * Specify null ({}) if you don't want to specify a schema.
     *
     * @param schema The schema to use to transform data to one or more output formats.
     */
    public fun schema(schema: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(schema)
        cdkBuilder.schema(builder.build())
    }

    /**
     * The schema to use to transform data to one or more output formats.
     *
     * Specify null ({}) if you don't want to specify a schema.
     *
     * @param schema The schema to use to transform data to one or more output formats.
     */
    public fun schema(schema: JsonSchema) {
        cdkBuilder.schema(schema)
    }

    public fun build(): Model = cdkBuilder.build()
}
