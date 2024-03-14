package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocalGatewayRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

  public open fun localGatewayRouteTableId(`value`: String) {
    unwrap(this).setLocalGatewayRouteTableId(`value`)
  }

  public open fun localGatewayVirtualInterfaceGroupId(): String? =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  public open fun localGatewayVirtualInterfaceGroupId(`value`: String) {
    unwrap(this).setLocalGatewayVirtualInterfaceGroupId(`value`)
  }

  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public interface Builder {
    public fun destinationCidrBlock(destinationCidrBlock: String) {
    }

    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    }

    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder.create(scope, id)

    public override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    public override
        fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    public override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute):
        CfnLocalGatewayRoute = CfnLocalGatewayRoute(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRoute):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute = wrapped.cdkObject
  }
}
