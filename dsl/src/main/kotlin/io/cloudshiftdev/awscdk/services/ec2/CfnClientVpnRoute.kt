package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClientVpnRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun targetVpcSubnetId(): String = unwrap(this).getTargetVpcSubnetId()

  public open fun targetVpcSubnetId(`value`: String) {
    unwrap(this).setTargetVpcSubnetId(`value`)
  }

  public interface Builder {
    public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    }

    public fun description(description: String) {
    }

    public fun destinationCidrBlock(destinationCidrBlock: String) {
    }

    public fun targetVpcSubnetId(targetVpcSubnetId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder.create(scope, id)

    public override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public override fun targetVpcSubnetId(targetVpcSubnetId: String) {
      cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRoute):
        CfnClientVpnRoute = CfnClientVpnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnRoute):
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute = wrapped.cdkObject
  }
}
