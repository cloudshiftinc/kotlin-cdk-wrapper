package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   */
  public open fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  /**
   * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   */
  public open fun amazonSideAsn(`value`: Number) {
    unwrap(this).setAmazonSideAsn(`value`)
  }

  /**
   * The ID of the default association route table.
   */
  public open fun associationDefaultRouteTableId(): String? =
      unwrap(this).getAssociationDefaultRouteTableId()

  /**
   * The ID of the default association route table.
   */
  public open fun associationDefaultRouteTableId(`value`: String) {
    unwrap(this).setAssociationDefaultRouteTableId(`value`)
  }

  /**
   * The ID of the transit gateway.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrTransitGatewayArn(): String = unwrap(this).getAttrTransitGatewayArn()

  /**
   * Enable or disable automatic acceptance of attachment requests.
   */
  public open fun autoAcceptSharedAttachments(): String? =
      unwrap(this).getAutoAcceptSharedAttachments()

  /**
   * Enable or disable automatic acceptance of attachment requests.
   */
  public open fun autoAcceptSharedAttachments(`value`: String) {
    unwrap(this).setAutoAcceptSharedAttachments(`value`)
  }

  /**
   * Enable or disable automatic association with the default association route table.
   */
  public open fun defaultRouteTableAssociation(): String? =
      unwrap(this).getDefaultRouteTableAssociation()

  /**
   * Enable or disable automatic association with the default association route table.
   */
  public open fun defaultRouteTableAssociation(`value`: String) {
    unwrap(this).setDefaultRouteTableAssociation(`value`)
  }

  /**
   * Enable or disable automatic propagation of routes to the default propagation route table.
   */
  public open fun defaultRouteTablePropagation(): String? =
      unwrap(this).getDefaultRouteTablePropagation()

  /**
   * Enable or disable automatic propagation of routes to the default propagation route table.
   */
  public open fun defaultRouteTablePropagation(`value`: String) {
    unwrap(this).setDefaultRouteTablePropagation(`value`)
  }

  /**
   * The description of the transit gateway.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the transit gateway.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Enable or disable DNS support.
   */
  public open fun dnsSupport(): String? = unwrap(this).getDnsSupport()

  /**
   * Enable or disable DNS support.
   */
  public open fun dnsSupport(`value`: String) {
    unwrap(this).setDnsSupport(`value`)
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
   * Indicates whether multicast is enabled on the transit gateway.
   */
  public open fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

  /**
   * Indicates whether multicast is enabled on the transit gateway.
   */
  public open fun multicastSupport(`value`: String) {
    unwrap(this).setMulticastSupport(`value`)
  }

  /**
   * The ID of the default propagation route table.
   */
  public open fun propagationDefaultRouteTableId(): String? =
      unwrap(this).getPropagationDefaultRouteTableId()

  /**
   * The ID of the default propagation route table.
   */
  public open fun propagationDefaultRouteTableId(`value`: String) {
    unwrap(this).setPropagationDefaultRouteTableId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the transit gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the transit gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the transit gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The transit gateway CIDR blocks.
   */
  public open fun transitGatewayCidrBlocks(): List<String> =
      unwrap(this).getTransitGatewayCidrBlocks() ?: emptyList()

  /**
   * The transit gateway CIDR blocks.
   */
  public open fun transitGatewayCidrBlocks(`value`: List<String>) {
    unwrap(this).setTransitGatewayCidrBlocks(`value`)
  }

  /**
   * The transit gateway CIDR blocks.
   */
  public open fun transitGatewayCidrBlocks(vararg `value`: String): Unit =
      transitGatewayCidrBlocks(`value`.toList())

  /**
   * Enable or disable Equal Cost Multipath Protocol support.
   */
  public open fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()

  /**
   * Enable or disable Equal Cost Multipath Protocol support.
   */
  public open fun vpnEcmpSupport(`value`: String) {
    unwrap(this).setVpnEcmpSupport(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn)
     * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. 
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * The ID of the default association route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
     * @param associationDefaultRouteTableId The ID of the default association route table. 
     */
    public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String)

    /**
     * Enable or disable automatic acceptance of attachment requests.
     *
     * Disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments)
     * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
     * requests. 
     */
    public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String)

    /**
     * Enable or disable automatic association with the default association route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation)
     * @param defaultRouteTableAssociation Enable or disable automatic association with the default
     * association route table. 
     */
    public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String)

    /**
     * Enable or disable automatic propagation of routes to the default propagation route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation)
     * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
     * default propagation route table. 
     */
    public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String)

    /**
     * The description of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
     * @param description The description of the transit gateway. 
     */
    public fun description(description: String)

    /**
     * Enable or disable DNS support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport)
     * @param dnsSupport Enable or disable DNS support. 
     */
    public fun dnsSupport(dnsSupport: String)

    /**
     * Indicates whether multicast is enabled on the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
     * @param multicastSupport Indicates whether multicast is enabled on the transit gateway. 
     */
    public fun multicastSupport(multicastSupport: String)

    /**
     * The ID of the default propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
     * @param propagationDefaultRouteTableId The ID of the default propagation route table. 
     */
    public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String)

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     * @param tags The tags for the transit gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     * @param tags The tags for the transit gateway. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
     */
    public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>)

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
     */
    public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String)

    /**
     * Enable or disable Equal Cost Multipath Protocol support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport)
     * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support. 
     */
    public fun vpnEcmpSupport(vpnEcmpSupport: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGateway.Builder.create(scope, id)

    /**
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn)
     * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. 
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * The ID of the default association route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
     * @param associationDefaultRouteTableId The ID of the default association route table. 
     */
    override fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
      cdkBuilder.associationDefaultRouteTableId(associationDefaultRouteTableId)
    }

    /**
     * Enable or disable automatic acceptance of attachment requests.
     *
     * Disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments)
     * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
     * requests. 
     */
    override fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
      cdkBuilder.autoAcceptSharedAttachments(autoAcceptSharedAttachments)
    }

    /**
     * Enable or disable automatic association with the default association route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation)
     * @param defaultRouteTableAssociation Enable or disable automatic association with the default
     * association route table. 
     */
    override fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
      cdkBuilder.defaultRouteTableAssociation(defaultRouteTableAssociation)
    }

    /**
     * Enable or disable automatic propagation of routes to the default propagation route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation)
     * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
     * default propagation route table. 
     */
    override fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
      cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
    }

    /**
     * The description of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
     * @param description The description of the transit gateway. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Enable or disable DNS support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport)
     * @param dnsSupport Enable or disable DNS support. 
     */
    override fun dnsSupport(dnsSupport: String) {
      cdkBuilder.dnsSupport(dnsSupport)
    }

    /**
     * Indicates whether multicast is enabled on the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
     * @param multicastSupport Indicates whether multicast is enabled on the transit gateway. 
     */
    override fun multicastSupport(multicastSupport: String) {
      cdkBuilder.multicastSupport(multicastSupport)
    }

    /**
     * The ID of the default propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
     * @param propagationDefaultRouteTableId The ID of the default propagation route table. 
     */
    override fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
      cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
    }

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     * @param tags The tags for the transit gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     * @param tags The tags for the transit gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
     */
    override fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>) {
      cdkBuilder.transitGatewayCidrBlocks(transitGatewayCidrBlocks)
    }

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
     */
    override fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String): Unit =
        transitGatewayCidrBlocks(transitGatewayCidrBlocks.toList())

    /**
     * Enable or disable Equal Cost Multipath Protocol support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport)
     * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support. 
     */
    override fun vpnEcmpSupport(vpnEcmpSupport: String) {
      cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGateway = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGateway):
        CfnTransitGateway = CfnTransitGateway(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGateway):
        software.amazon.awscdk.services.ec2.CfnTransitGateway = wrapped.cdkObject
  }
}