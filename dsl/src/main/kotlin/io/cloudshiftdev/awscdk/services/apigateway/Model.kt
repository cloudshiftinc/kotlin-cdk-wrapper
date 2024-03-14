package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Model internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Model,
) : Resource(cdkObject), IModel {
  public override fun modelId(): String = unwrap(this).getModelId()

  public interface Builder {
    public fun contentType(contentType: String) {
    }

    public fun description(description: String) {
    }

    public fun modelName(modelName: String) {
    }

    public fun restApi(restApi: IRestApi) {
    }

    public fun schema(schema: JsonSchema) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a813e8e585258da5c286b3d66d54447e843da13b8ca9c989720a67be94d08df")
    public fun schema(schema: JsonSchema.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Model.Builder =
        software.amazon.awscdk.services.apigateway.Model.Builder.create(scope, id)

    public override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    public override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    public override fun schema(schema: JsonSchema) {
      cdkBuilder.schema(schema.let(JsonSchema::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a813e8e585258da5c286b3d66d54447e843da13b8ca9c989720a67be94d08df")
    public override fun schema(schema: JsonSchema.Builder.() -> Unit): Unit =
        schema(JsonSchema(schema))

    public fun build(): software.amazon.awscdk.services.apigateway.Model = cdkBuilder.build()
  }

  public companion object {
    public open fun fromModelName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      modelName: String,
    ): IModel =
        software.amazon.awscdk.services.apigateway.Model.fromModelName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, modelName).let(IModel::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Model {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Model(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Model): Model =
        Model(cdkObject)

    internal fun unwrap(wrapped: Model): software.amazon.awscdk.services.apigateway.Model =
        wrapped.cdkObject
  }
}
