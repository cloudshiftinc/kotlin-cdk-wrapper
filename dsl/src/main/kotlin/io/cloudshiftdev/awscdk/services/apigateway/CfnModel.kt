package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnModel,
) : CfnResource(cdkObject), IInspectable {
  public open fun contentType(): String? = unwrap(this).getContentType()

  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun schema(): Any? = unwrap(this).getSchema()

  public open fun schema(`value`: Any) {
    unwrap(this).setSchema(`value`)
  }

  public interface Builder {
    public fun contentType(contentType: String) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun restApiId(restApiId: String) {
    }

    public fun schema(schema: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnModel.Builder =
        software.amazon.awscdk.services.apigateway.CfnModel.Builder.create(scope, id)

    public override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnModel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnModel): CfnModel =
        CfnModel(cdkObject)

    internal fun unwrap(wrapped: CfnModel): software.amazon.awscdk.services.apigateway.CfnModel =
        wrapped.cdkObject
  }
}
