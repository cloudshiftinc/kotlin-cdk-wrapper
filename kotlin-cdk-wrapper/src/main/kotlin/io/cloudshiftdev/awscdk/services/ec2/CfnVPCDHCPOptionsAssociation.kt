@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a set of DHCP options with a VPC, or associates no DHCP options with the VPC.
 *
 * After you associate the options with the VPC, any existing instances and all new instances that
 * you launch in that VPC use the options. You don't need to restart or relaunch the instances. They
 * automatically pick up the changes within a few hours, depending on how frequently the instance
 * renews its DHCP lease. You can explicitly renew the lease using the operating system on the
 * instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCDHCPOptionsAssociation cfnVPCDHCPOptionsAssociation =
 * CfnVPCDHCPOptionsAssociation.Builder.create(this, "MyCfnVPCDHCPOptionsAssociation")
 * .dhcpOptionsId("dhcpOptionsId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html)
 */
public open class CfnVPCDHCPOptionsAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation,
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.CFN_RESOURCE_TYPE_NAME

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
