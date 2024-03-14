package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnVPCDHCPOptionsAssociationProps {
  /**
   * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
   */
  public fun dhcpOptionsId(): String

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVPCDHCPOptionsAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     * options with the VPC. 
     */
    public fun dhcpOptionsId(dhcpOptionsId: String)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps.builder()

    /**
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     * options with the VPC. 
     */
    override fun dhcpOptionsId(dhcpOptionsId: String) {
      cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps,
  ) : CdkObject(cdkObject), CfnVPCDHCPOptionsAssociationProps {
    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
     */
    override fun dhcpOptionsId(): String = unwrap(this).getDhcpOptionsId()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCDHCPOptionsAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps):
        CfnVPCDHCPOptionsAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCDHCPOptionsAssociationProps):
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
  }
}
