package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnResource,
) : io.cloudshiftdev.awscdk.CfnResource(cdkObject), IInspectable {
  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parentId(): String = unwrap(this).getParentId()

  public open fun parentId(`value`: String) {
    unwrap(this).setParentId(`value`)
  }

  public open fun pathPart(): String = unwrap(this).getPathPart()

  public open fun pathPart(`value`: String) {
    unwrap(this).setPathPart(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public interface Builder {
    public fun parentId(parentId: String) {
    }

    public fun pathPart(pathPart: String) {
    }

    public fun restApiId(restApiId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnResource.Builder =
        software.amazon.awscdk.services.apigateway.CfnResource.Builder.create(scope, id)

    public override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    public override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    public override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnResource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnResource):
        CfnResource = CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource):
        software.amazon.awscdk.services.apigateway.CfnResource = wrapped.cdkObject
  }
}
