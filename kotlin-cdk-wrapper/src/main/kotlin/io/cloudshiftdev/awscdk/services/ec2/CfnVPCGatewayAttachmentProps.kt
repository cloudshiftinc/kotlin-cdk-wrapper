@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVPCGatewayAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCGatewayAttachmentProps cfnVPCGatewayAttachmentProps =
 * CfnVPCGatewayAttachmentProps.builder()
 * .vpcId("vpcId")
 * // the properties below are optional
 * .internetGatewayId("internetGatewayId")
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html)
 */
public interface CfnVPCGatewayAttachmentProps {
  /**
   * The ID of the internet gateway.
   *
   * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
   */
  public fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
   */
  public fun vpcId(): String

  /**
   * The ID of the virtual private gateway.
   *
   * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
   */
  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * A builder for [CfnVPCGatewayAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param internetGatewayId The ID of the internet gateway.
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun internetGatewayId(internetGatewayId: String)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)

    /**
     * @param vpnGatewayId The ID of the virtual private gateway.
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.builder()

    /**
     * @param internetGatewayId The ID of the internet gateway.
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    override fun internetGatewayId(internetGatewayId: String) {
      cdkBuilder.internetGatewayId(internetGatewayId)
    }

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnGatewayId The ID of the virtual private gateway.
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps,
  ) : CdkObject(cdkObject), CfnVPCGatewayAttachmentProps {
    /**
     * The ID of the internet gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
     */
    override fun internetGatewayId(): String? = unwrap(this).getInternetGatewayId()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()

    /**
     * The ID of the virtual private gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
     */
    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCGatewayAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps):
        CfnVPCGatewayAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCGatewayAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
  }
}
