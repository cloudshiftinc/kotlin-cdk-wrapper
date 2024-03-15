@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ModelProps : ModelOptions {
  public fun restApi(): IRestApi

  @CdkDslMarker
  public interface Builder {
    public fun contentType(contentType: String)

    public fun description(description: String)

    public fun modelName(modelName: String)

    public fun restApi(restApi: IRestApi)

    public fun schema(schema: JsonSchema)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185d1713d3345b8eb1570fa04188d95ff12dabf5defb43a1ba06de9d23d4fe7f")
    public fun schema(schema: JsonSchema.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ModelProps.Builder =
        software.amazon.awscdk.services.apigateway.ModelProps.builder()

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    override fun schema(schema: JsonSchema) {
      cdkBuilder.schema(schema.let(JsonSchema::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185d1713d3345b8eb1570fa04188d95ff12dabf5defb43a1ba06de9d23d4fe7f")
    override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit = schema(JsonSchema(schema))

    public fun build(): software.amazon.awscdk.services.apigateway.ModelProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ModelProps,
  ) : CdkObject(cdkObject), ModelProps {
    override fun contentType(): String? = unwrap(this).getContentType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun modelName(): String? = unwrap(this).getModelName()

    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

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
