@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A VPC endpoint association defines a single subnet to use for a firewall endpoint for a
 * `Firewall` .
 *
 * You can define VPC endpoint associations only in the Availability Zones that already have a
 * subnet mapping defined in the `Firewall` resource.
 *
 *
 * You can retrieve the list of Availability Zones that are available for use by calling
 * `DescribeFirewallMetadata` .
 *
 *
 * To manage firewall endpoints, first, in the `Firewall` specification, you specify a single VPC
 * and one subnet for each of the Availability Zones where you want to use the firewall. Then you can
 * define additional endpoints as VPC endpoint associations.
 *
 * You can use VPC endpoint associations to expand the protections of the firewall as follows:
 *
 * * *Protect multiple VPCs with a single firewall* - You can use the firewall to protect other
 * VPCs, either in your account or in accounts where the firewall is shared. You can only specify
 * Availability Zones that already have a firewall endpoint defined in the `Firewall` subnet mappings.
 * * *Define multiple firewall endpoints for a VPC in an Availability Zone* - You can create
 * additional firewall endpoints for the VPC that you have defined in the firewall, in any Availability
 * Zone that already has an endpoint defined in the `Firewall` subnet mappings. You can create multiple
 * VPC endpoint associations for any other VPC where you use the firewall.
 *
 * You can use AWS Resource Access Manager to share a `Firewall` that you own with other accounts,
 * which gives them the ability to use the firewall to create VPC endpoint associations. For
 * information about sharing a firewall, see `PutResourcePolicy` in this guide and see [Sharing Network
 * Firewall resources](https://docs.aws.amazon.com/network-firewall/latest/developerguide/sharing.html)
 * in the *AWS Network Firewall Developer Guide* .
 *
 * The status of the VPC endpoint association, which indicates whether it's ready to filter network
 * traffic, is provided in the corresponding `VpcEndpointAssociationStatus` . You can retrieve both the
 * association and its status by calling `DescribeVpcEndpointAssociation` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnVpcEndpointAssociation cfnVpcEndpointAssociation =
 * CfnVpcEndpointAssociation.Builder.create(this, "MyCfnVpcEndpointAssociation")
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
public open class CfnVpcEndpointAssociation(
  cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcEndpointAssociationProps,
  ) :
      this(software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVpcEndpointAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcEndpointAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcEndpointAssociationProps(props)
  )

  /**
   * An endpoint Id.
   */
  public open fun attrEndpointId(): String = unwrap(this).getAttrEndpointId()

  /**
   * The Amazon Resource Name (ARN) of a VPC endpoint association.
   */
  public open fun attrVpcEndpointAssociationArn(): String =
      unwrap(this).getAttrVpcEndpointAssociationArn()

  /**
   * The unique identifier of the VPC endpoint association.
   */
  public open fun attrVpcEndpointAssociationId(): String =
      unwrap(this).getAttrVpcEndpointAssociationId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the VPC endpoint association.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the VPC endpoint association.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the firewall.
   */
  public open fun firewallArn(): String = unwrap(this).getFirewallArn()

  /**
   * The Amazon Resource Name (ARN) of the firewall.
   */
  public open fun firewallArn(`value`: String) {
    unwrap(this).setFirewallArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID for a subnet that's used in an association with a firewall.
   */
  public open fun subnetMapping(): Any = unwrap(this).getSubnetMapping()

  /**
   * The ID for a subnet that's used in an association with a firewall.
   */
  public open fun subnetMapping(`value`: IResolvable) {
    unwrap(this).setSubnetMapping(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID for a subnet that's used in an association with a firewall.
   */
  public open fun subnetMapping(`value`: SubnetMappingProperty) {
    unwrap(this).setSubnetMapping(`value`.let(SubnetMappingProperty.Companion::unwrap))
  }

  /**
   * The ID for a subnet that's used in an association with a firewall.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb46aee60d52b9b73a6673117e04a25487f202127b1d53f88a34bf02b7e8a4d8")
  public open fun subnetMapping(`value`: SubnetMappingProperty.Builder.() -> Unit): Unit =
      subnetMapping(SubnetMappingProperty(`value`))

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The unique identifier of the VPC for the endpoint association.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The unique identifier of the VPC for the endpoint association.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkfirewall.CfnVpcEndpointAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the VPC endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-description)
     * @param description A description of the VPC endpoint association. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-firewallarn)
     * @param firewallArn The Amazon Resource Name (ARN) of the firewall. 
     */
    public fun firewallArn(firewallArn: String)

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    public fun subnetMapping(subnetMapping: IResolvable)

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    public fun subnetMapping(subnetMapping: SubnetMappingProperty)

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284d1d242f35269d48c1ddfcce6fd4e4ed9dd9a39f39585de0b3fb0dda2e07df")
    public fun subnetMapping(subnetMapping: SubnetMappingProperty.Builder.() -> Unit)

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The unique identifier of the VPC for the endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-vpcid)
     * @param vpcId The unique identifier of the VPC for the endpoint association. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.Builder.create(scope,
        id)

    /**
     * A description of the VPC endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-description)
     * @param description A description of the VPC endpoint association. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-firewallarn)
     * @param firewallArn The Amazon Resource Name (ARN) of the firewall. 
     */
    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    override fun subnetMapping(subnetMapping: IResolvable) {
      cdkBuilder.subnetMapping(subnetMapping.let(IResolvable.Companion::unwrap))
    }

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    override fun subnetMapping(subnetMapping: SubnetMappingProperty) {
      cdkBuilder.subnetMapping(subnetMapping.let(SubnetMappingProperty.Companion::unwrap))
    }

    /**
     * The ID for a subnet that's used in an association with a firewall.
     *
     * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping)
     * @param subnetMapping The ID for a subnet that's used in an association with a firewall. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284d1d242f35269d48c1ddfcce6fd4e4ed9dd9a39f39585de0b3fb0dda2e07df")
    override fun subnetMapping(subnetMapping: SubnetMappingProperty.Builder.() -> Unit): Unit =
        subnetMapping(SubnetMappingProperty(subnetMapping))

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The unique identifier of the VPC for the endpoint association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-vpcendpointassociation.html#cfn-networkfirewall-vpcendpointassociation-vpcid)
     * @param vpcId The unique identifier of the VPC for the endpoint association. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcEndpointAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcEndpointAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation):
        CfnVpcEndpointAssociation = CfnVpcEndpointAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnVpcEndpointAssociation):
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation
  }

  /**
   * The ID for a subnet that's used in an association with a firewall.
   *
   * This is used in `CreateFirewall` , `AssociateSubnets` , and `CreateVpcEndpointAssociation` .
   * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
   * specify, to filter traffic in the subnet's Availability Zone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * SubnetMappingProperty subnetMappingProperty = SubnetMappingProperty.builder()
   * .subnetId("subnetId")
   * // the properties below are optional
   * .ipAddressType("ipAddressType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-vpcendpointassociation-subnetmapping.html)
   */
  public interface SubnetMappingProperty {
    /**
     * The subnet's IP address type.
     *
     * You can't change the IP address type after you create the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-vpcendpointassociation-subnetmapping.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping-ipaddresstype)
     */
    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The unique identifier for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-vpcendpointassociation-subnetmapping.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping-subnetid)
     */
    public fun subnetId(): String

    /**
     * A builder for [SubnetMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipAddressType The subnet's IP address type.
       * You can't change the IP address type after you create the subnet.
       */
      public fun ipAddressType(ipAddressType: String)

      /**
       * @param subnetId The unique identifier for the subnet. 
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty.builder()

      /**
       * @param ipAddressType The subnet's IP address type.
       * You can't change the IP address type after you create the subnet.
       */
      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      /**
       * @param subnetId The unique identifier for the subnet. 
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty,
    ) : CdkObject(cdkObject),
        SubnetMappingProperty {
      /**
       * The subnet's IP address type.
       *
       * You can't change the IP address type after you create the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-vpcendpointassociation-subnetmapping.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping-ipaddresstype)
       */
      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

      /**
       * The unique identifier for the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-vpcendpointassociation-subnetmapping.html#cfn-networkfirewall-vpcendpointassociation-subnetmapping-subnetid)
       */
      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubnetMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty):
          SubnetMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? SubnetMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubnetMappingProperty):
          software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnVpcEndpointAssociation.SubnetMappingProperty
    }
  }
}
