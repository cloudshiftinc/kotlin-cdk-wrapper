package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ModelOptions {
  /**
   * The content type for the model.
   *
   * You can also force a
   * content type in the request or response model mapping.
   *
   * Default: 'application/json'
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * A description that identifies this model.
   *
   * Default: None
   */
  public fun description(): String? = unwrap(this).getDescription()

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
  public fun modelName(): String? = unwrap(this).getModelName()

  /**
   * The schema to use to transform data to one or more output formats.
   *
   * Specify null ({}) if you don't want to specify a schema.
   */
  public fun schema(): JsonSchema

  /**
   * A builder for [ModelOptions]
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
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    public fun schema(schema: JsonSchema)

    /**
     * @param schema The schema to use to transform data to one or more output formats. 
     * Specify null ({}) if you don't want to specify a schema.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8760257accfc19a5acda72d2c39a537519b7ef6011dbfa11664518fb9c7b5aa5")
    public fun schema(schema: JsonSchema.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ModelOptions.Builder =
        software.amazon.awscdk.services.apigateway.ModelOptions.builder()

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8760257accfc19a5acda72d2c39a537519b7ef6011dbfa11664518fb9c7b5aa5")
    override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit = schema(JsonSchema(schema))

    public fun build(): software.amazon.awscdk.services.apigateway.ModelOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ModelOptions,
  ) : CdkObject(cdkObject), ModelOptions {
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
     * The schema to use to transform data to one or more output formats.
     *
     * Specify null ({}) if you don't want to specify a schema.
     */
    override fun schema(): JsonSchema = unwrap(this).getSchema().let(JsonSchema::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ModelOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ModelOptions):
        ModelOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ModelOptions):
        software.amazon.awscdk.services.apigateway.ModelOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.ModelOptions
  }
}
