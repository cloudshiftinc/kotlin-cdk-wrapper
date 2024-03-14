package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCGatewayAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  public open fun internetGatewayId(`value`: String) {
    unwrap(this).setInternetGatewayId(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public open fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  public interface Builder {
    public fun internetGatewayId(internetGatewayId: String)

    public fun vpcId(vpcId: String)

    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder.create(scope, id)

    override fun internetGatewayId(internetGatewayId: String) {
      cdkBuilder.internetGatewayId(internetGatewayId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCGatewayAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCGatewayAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment):
        CfnVPCGatewayAttachment = CfnVPCGatewayAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnVPCGatewayAttachment):
        software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment = wrapped.cdkObject
  }
}
