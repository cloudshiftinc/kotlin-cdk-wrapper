package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLayerVersionPermission internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermission,
) : CfnResource(cdkObject), IInspectable {
  public open fun action(): String = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  public open fun layerVersionArn(`value`: String) {
    unwrap(this).setLayerVersionArn(`value`)
  }

  public open fun organizationId(): String? = unwrap(this).getOrganizationId()

  public open fun organizationId(`value`: String) {
    unwrap(this).setOrganizationId(`value`)
  }

  public open fun principal(): String = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public interface Builder {
    public fun action(action: String)

    public fun layerVersionArn(layerVersionArn: String)

    public fun organizationId(organizationId: String)

    public fun principal(principal: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnLayerVersionPermission.Builder
        = software.amazon.awscdk.services.lambda.CfnLayerVersionPermission.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun layerVersionArn(layerVersionArn: String) {
      cdkBuilder.layerVersionArn(layerVersionArn)
    }

    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersionPermission =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayerVersionPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayerVersionPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionPermission):
        CfnLayerVersionPermission = CfnLayerVersionPermission(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionPermission):
        software.amazon.awscdk.services.lambda.CfnLayerVersionPermission = wrapped.cdkObject
  }
}
