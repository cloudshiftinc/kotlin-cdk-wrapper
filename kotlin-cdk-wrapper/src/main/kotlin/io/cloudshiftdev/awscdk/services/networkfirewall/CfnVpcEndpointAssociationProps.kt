@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVpcEndpointAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnVpcEndpointAssociationProps cfnVpcEndpointAssociationProps =
 * CfnVpcEndpointAssociationProps.builder()
 * .firewallArn("firewallArn")
 * .subnetMapping(SubnetMappingProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddressType("ipAddressType")
 * .build())
 * .vpcId("vpcId")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html)
 */
public interface CfnVpcEndpointAssociationProps {
  /**
   * A description of the VPC endpoint association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the firewall.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-firewallarn)
   */
  public fun firewallArn(): String

  /**
   * The ID for a subnet that's used in an association with a firewall.
   *
   * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
   * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
   * specify, to filter traffic in the subnet's Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
   */
  public fun subnetMapping(): Any

  /**
   * The key:value pairs to associate with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The unique identifier of the VPC for the endpoint association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVpcEndpointAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the VPC endpoint association.
     */
    public fun description(description: String)

    /**
     * @param firewallArn The Amazon Resource Name (ARN) of the firewall. 
     */
    public fun firewallArn(firewallArn: String)

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    public fun subnetMapping(subnetMapping: IResolvable)

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    public fun subnetMapping(subnetMapping: CfnVpcEndpointAssociation.SubnetMappingProperty)

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62eff82cc68d591fad189134eaea53cfbe96eb9aecaa7322c7608920929ee08a")
    public
        fun subnetMapping(subnetMapping: CfnVpcEndpointAssociation.SubnetMappingProperty.Builder.() -> Unit)

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The unique identifier of the VPC for the endpoint association. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps.builder()

    /**
     * @param description A description of the VPC endpoint association.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param firewallArn The Amazon Resource Name (ARN) of the firewall. 
     */
    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    override fun subnetMapping(subnetMapping: IResolvable) {
      cdkBuilder.subnetMapping(subnetMapping.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    override fun subnetMapping(subnetMapping: CfnVpcEndpointAssociation.SubnetMappingProperty) {
      cdkBuilder.subnetMapping(subnetMapping.let(CfnVpcEndpointAssociation.SubnetMappingProperty.Companion::unwrap))
    }

    /**
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62eff82cc68d591fad189134eaea53cfbe96eb9aecaa7322c7608920929ee08a")
    override
        fun subnetMapping(subnetMapping: CfnVpcEndpointAssociation.SubnetMappingProperty.Builder.() -> Unit):
        Unit = subnetMapping(CfnVpcEndpointAssociation.SubnetMappingProperty(subnetMapping))

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The unique identifier of the VPC for the endpoint association. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps,
  ) : CdkObject(cdkObject),
      CfnVpcEndpointAssociationProps {
    /**
     * A description of the VPC endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-firewallarn)
     */
    override fun firewallArn(): String = unwrap(this).getFirewallArn()

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     */
    override fun subnetMapping(): Any = unwrap(this).getSubnetMapping()

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The unique identifier of the VPC for the endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcEndpointAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps):
        CfnVpcEndpointAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVpcEndpointAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcEndpointAssociationProps):
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociationProps
  }
}
