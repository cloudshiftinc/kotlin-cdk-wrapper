@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ModelOptions {
  public fun contentType(): String? = unwrap(this).getContentType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun modelName(): String? = unwrap(this).getModelName()

  public fun schema(): JsonSchema

  @CdkDslMarker
  public interface Builder {
    public fun contentType(contentType: String)

    public fun description(description: String)

    public fun modelName(modelName: String)

    public fun schema(schema: JsonSchema)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8760257accfc19a5acda72d2c39a537519b7ef6011dbfa11664518fb9c7b5aa5")
    public fun schema(schema: JsonSchema.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ModelOptions.Builder =
        software.amazon.awscdk.services.apigateway.ModelOptions.builder()

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    override fun schema(schema: JsonSchema) {
      cdkBuilder.schema(schema.let(JsonSchema::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8760257accfc19a5acda72d2c39a537519b7ef6011dbfa11664518fb9c7b5aa5")
    override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit = schema(JsonSchema(schema))

    public fun build(): software.amazon.awscdk.services.apigateway.ModelOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ModelOptions,
  ) : CdkObject(cdkObject), ModelOptions {
    override fun contentType(): String? = unwrap(this).getContentType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun modelName(): String? = unwrap(this).getModelName()

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
