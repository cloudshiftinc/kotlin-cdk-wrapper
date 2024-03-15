@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
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
public interface ModelProps : ModelOptions {
  /**
   * The rest API that this model is part of.
   *
   * The reason we need the RestApi object itself and not just the ID is because the model
   * is being tracked by the top-level RestApi object for the purpose of calculating it's
   * hash to determine the ID of the deployment. This allows us to automatically update
   * the deployment when the model of the REST API changes.
   */
  public fun restApi(): IRestApi

  /**
   * A builder for [ModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentType The content type for the model.
     * You can also force a
     * content type in the request or response model mapping.
     */
    public fun contentType(contentType: String)

    /**
     * @param description A description that identifies this model.
     */
    public fun description(description: String)

    /**
     * @param modelName A name for the model.
     * Important
     * If you specify a name, you cannot perform updates that
     * require replacement of this resource. You can perform
     * updates that require no or some interruption. If you
     * must replace the resource, specify a new name.
     */
    public fun modelName(modelName: String)

    /**
     * @param restApi The rest API that this model is part of. 
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    public fun restApi(restApi: IRestApi)

    /**
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    public fun schema(schema: JsonSchema)

    /**
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185d1713d3345b8eb1570fa04188d95ff12dabf5defb43a1ba06de9d23d4fe7f")
    public fun schema(schema: JsonSchema.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ModelProps.Builder =
        software.amazon.awscdk.services.apigateway.ModelProps.builder()

    /**
     * @param contentType The content type for the model.
     * You can also force a
     * content type in the request or response model mapping.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param description A description that identifies this model.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param modelName A name for the model.
     * Important
     * If you specify a name, you cannot perform updates that
     * require replacement of this resource. You can perform
     * updates that require no or some interruption. If you
     * must replace the resource, specify a new name.
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * @param restApi The rest API that this model is part of. 
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    /**
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    override fun schema(schema: JsonSchema) {
      cdkBuilder.schema(schema.let(JsonSchema::unwrap))
    }

    /**
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185d1713d3345b8eb1570fa04188d95ff12dabf5defb43a1ba06de9d23d4fe7f")
    override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit = schema(JsonSchema(schema))

    public fun build(): software.amazon.awscdk.services.apigateway.ModelProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ModelProps,
  ) : CdkObject(cdkObject), ModelProps {
    /**
     * The content type for the model.
     *
     * You can also force a
     * content type in the request or response model mapping.
     *
     * Default: 'application/json'
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * A description that identifies this model.
     *
     * Default: None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the model.
     *
     * Important
     * If you specify a name, you cannot perform updates that
     * require replacement of this resource. You can perform
     * updates that require no or some interruption. If you
     * must replace the resource, specify a new name.
     *
     * Default: <auto> If you don't specify a name,
     * AWS CloudFormation generates a unique physical ID and
     * uses that ID for the model name. For more information,
     * see Name Type.
     */
    override fun modelName(): String? = unwrap(this).getModelName()

    /**
     * The rest API that this model is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    /**
     * The schema to use to transform data to one or more output formats.
     *
     * Specify null ({}) if you don't want to specify a schema.
     */
    override fun schema(): JsonSchema = unwrap(this).getSchema().let(JsonSchema::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ModelProps): ModelProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ModelProps): software.amazon.awscdk.services.apigateway.ModelProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ModelProps
  }
}
