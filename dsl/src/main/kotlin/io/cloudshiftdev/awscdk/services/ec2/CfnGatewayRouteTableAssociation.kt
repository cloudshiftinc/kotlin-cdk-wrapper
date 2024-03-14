package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGatewayRouteTableAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public open fun gatewayId(): String = unwrap(this).getGatewayId()

  public open fun gatewayId(`value`: String) {
    unwrap(this).setGatewayId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  public interface Builder {
    public fun gatewayId(gatewayId: String)

    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder.create(scope,
        id)

    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGatewayRouteTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGatewayRouteTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation):
        CfnGatewayRouteTableAssociation = CfnGatewayRouteTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRouteTableAssociation):
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation = wrapped.cdkObject
  }
}
