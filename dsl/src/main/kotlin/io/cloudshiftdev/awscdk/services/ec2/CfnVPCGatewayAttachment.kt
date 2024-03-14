package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCGatewayAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Used to identify if this resource is an Internet Gateway or Vpn Gateway Attachment.
   */
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the internet gateway.
   */
  public open fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  /**
   * The ID of the internet gateway.
   */
  public open fun internetGatewayId(`value`: String) {
    unwrap(this).setInternetGatewayId(`value`)
  }

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * The ID of the virtual private gateway.
   */
  public open fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * The ID of the virtual private gateway.
   */
  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCGatewayAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the internet gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
     * @param internetGatewayId The ID of the internet gateway. 
     */
    public fun internetGatewayId(internetGatewayId: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)

    /**
     * The ID of the virtual private gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway. 
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder.create(scope, id)

    /**
     * The ID of the internet gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
     * @param internetGatewayId The ID of the internet gateway. 
     */
    override fun internetGatewayId(internetGatewayId: String) {
      cdkBuilder.internetGatewayId(internetGatewayId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * The ID of the virtual private gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway. 
     */
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
