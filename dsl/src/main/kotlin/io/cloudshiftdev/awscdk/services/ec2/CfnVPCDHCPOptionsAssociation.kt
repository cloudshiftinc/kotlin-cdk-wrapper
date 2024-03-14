package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCDHCPOptionsAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
   */
  public open fun dhcpOptionsId(): String = unwrap(this).getDhcpOptionsId()

  /**
   * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
   */
  public open fun dhcpOptionsId(`value`: String) {
    unwrap(this).setDhcpOptionsId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     * options with the VPC. 
     */
    public fun dhcpOptionsId(dhcpOptionsId: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder.create(scope, id)

    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     * options with the VPC. 
     */
    override fun dhcpOptionsId(dhcpOptionsId: String) {
      cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCDHCPOptionsAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCDHCPOptionsAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation):
        CfnVPCDHCPOptionsAssociation = CfnVPCDHCPOptionsAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnVPCDHCPOptionsAssociation):
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation = wrapped.cdkObject
  }
}
