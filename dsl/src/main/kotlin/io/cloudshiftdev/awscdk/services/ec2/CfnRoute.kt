package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  public open fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

  public open fun carrierGatewayId(`value`: String) {
    unwrap(this).setCarrierGatewayId(`value`)
  }

  public open fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

  public open fun coreNetworkArn(`value`: String) {
    unwrap(this).setCoreNetworkArn(`value`)
  }

  public open fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public open fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  public open fun destinationIpv6CidrBlock(`value`: String) {
    unwrap(this).setDestinationIpv6CidrBlock(`value`)
  }

  public open fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  public open fun destinationPrefixListId(`value`: String) {
    unwrap(this).setDestinationPrefixListId(`value`)
  }

  public open fun egressOnlyInternetGatewayId(): String? =
      unwrap(this).getEgressOnlyInternetGatewayId()

  public open fun egressOnlyInternetGatewayId(`value`: String) {
    unwrap(this).setEgressOnlyInternetGatewayId(`value`)
  }

  public open fun gatewayId(): String? = unwrap(this).getGatewayId()

  public open fun gatewayId(`value`: String) {
    unwrap(this).setGatewayId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

  public open fun localGatewayId(`value`: String) {
    unwrap(this).setLocalGatewayId(`value`)
  }

  public open fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

  public open fun natGatewayId(`value`: String) {
    unwrap(this).setNatGatewayId(`value`)
  }

  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  public open fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  public open fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

  public open fun vpcPeeringConnectionId(`value`: String) {
    unwrap(this).setVpcPeeringConnectionId(`value`)
  }

  public interface Builder {
    public fun carrierGatewayId(carrierGatewayId: String) {
    }

    public fun coreNetworkArn(coreNetworkArn: String) {
    }

    public fun destinationCidrBlock(destinationCidrBlock: String) {
    }

    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
    }

    public fun destinationPrefixListId(destinationPrefixListId: String) {
    }

    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
    }

    public fun gatewayId(gatewayId: String) {
    }

    public fun instanceId(instanceId: String) {
    }

    public fun localGatewayId(localGatewayId: String) {
    }

    public fun natGatewayId(natGatewayId: String) {
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
    }

    public fun routeTableId(routeTableId: String) {
    }

    public fun transitGatewayId(transitGatewayId: String) {
    }

    public fun vpcEndpointId(vpcEndpointId: String) {
    }

    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnRoute.Builder.create(scope, id)

    public override fun carrierGatewayId(carrierGatewayId: String) {
      cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    public override fun coreNetworkArn(coreNetworkArn: String) {
      cdkBuilder.coreNetworkArn(coreNetworkArn)
    }

    public override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    public override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    public override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
      cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    public override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    public override fun natGatewayId(natGatewayId: String) {
      cdkBuilder.natGatewayId(natGatewayId)
    }

    public override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
      cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRoute): CfnRoute =
        CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.ec2.CfnRoute =
        wrapped.cdkObject
  }
}
