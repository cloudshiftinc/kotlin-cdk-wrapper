@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTransitGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayProps cfnTransitGatewayProps = CfnTransitGatewayProps.builder()
 * .amazonSideAsn(123)
 * .associationDefaultRouteTableId("associationDefaultRouteTableId")
 * .autoAcceptSharedAttachments("autoAcceptSharedAttachments")
 * .defaultRouteTableAssociation("defaultRouteTableAssociation")
 * .defaultRouteTablePropagation("defaultRouteTablePropagation")
 * .description("description")
 * .dnsSupport("dnsSupport")
 * .multicastSupport("multicastSupport")
 * .propagationDefaultRouteTableId("propagationDefaultRouteTableId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitGatewayCidrBlocks(List.of("transitGatewayCidrBlocks"))
 * .vpnEcmpSupport("vpnEcmpSupport")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html)
 */
public interface CfnTransitGatewayProps {
  /**
   * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   *
   * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn)
   */
  public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  /**
   * The ID of the default association route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
   */
  public fun associationDefaultRouteTableId(): String? =
      unwrap(this).getAssociationDefaultRouteTableId()

  /**
   * Enable or disable automatic acceptance of attachment requests.
   *
   * Disabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments)
   */
  public fun autoAcceptSharedAttachments(): String? = unwrap(this).getAutoAcceptSharedAttachments()

  /**
   * Enable or disable automatic association with the default association route table.
   *
   * Enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation)
   */
  public fun defaultRouteTableAssociation(): String? =
      unwrap(this).getDefaultRouteTableAssociation()

  /**
   * Enable or disable automatic propagation of routes to the default propagation route table.
   *
   * Enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation)
   */
  public fun defaultRouteTablePropagation(): String? =
      unwrap(this).getDefaultRouteTablePropagation()

  /**
   * The description of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Enable or disable DNS support.
   *
   * Enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport)
   */
  public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

  /**
   * Indicates whether multicast is enabled on the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
   */
  public fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

  /**
   * The ID of the default propagation route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
   */
  public fun propagationDefaultRouteTableId(): String? =
      unwrap(this).getPropagationDefaultRouteTableId()

  /**
   * The tags for the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The transit gateway CIDR blocks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
   */
  public fun transitGatewayCidrBlocks(): List<String> = unwrap(this).getTransitGatewayCidrBlocks()
      ?: emptyList()

  /**
   * Enable or disable Equal Cost Multipath Protocol support.
   *
   * Enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport)
   */
  public fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()

  /**
   * A builder for [CfnTransitGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * @param associationDefaultRouteTableId The ID of the default association route table.
     */
    public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String)

    /**
     * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
     * requests.
     * Disabled by default.
     */
    public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String)

    /**
     * @param defaultRouteTableAssociation Enable or disable automatic association with the default
     * association route table.
     * Enabled by default.
     */
    public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String)

    /**
     * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
     * default propagation route table.
     * Enabled by default.
     */
    public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String)

    /**
     * @param description The description of the transit gateway.
     */
    public fun description(description: String)

    /**
     * @param dnsSupport Enable or disable DNS support.
     * Enabled by default.
     */
    public fun dnsSupport(dnsSupport: String)

    /**
     * @param multicastSupport Indicates whether multicast is enabled on the transit gateway.
     */
    public fun multicastSupport(multicastSupport: String)

    /**
     * @param propagationDefaultRouteTableId The ID of the default propagation route table.
     */
    public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String)

    /**
     * @param tags The tags for the transit gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the transit gateway.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
     */
    public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>)

    /**
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
     */
    public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String)

    /**
     * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support.
     * Enabled by default.
     */
    public fun vpnEcmpSupport(vpnEcmpSupport: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayProps.builder()

    /**
     * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session.
     * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * @param associationDefaultRouteTableId The ID of the default association route table.
     */
    override fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
      cdkBuilder.associationDefaultRouteTableId(associationDefaultRouteTableId)
    }

    /**
     * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
     * requests.
     * Disabled by default.
     */
    override fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
      cdkBuilder.autoAcceptSharedAttachments(autoAcceptSharedAttachments)
    }

    /**
     * @param defaultRouteTableAssociation Enable or disable automatic association with the default
     * association route table.
     * Enabled by default.
     */
    override fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
      cdkBuilder.defaultRouteTableAssociation(defaultRouteTableAssociation)
    }

    /**
     * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
     * default propagation route table.
     * Enabled by default.
     */
    override fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
      cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
    }

    /**
     * @param description The description of the transit gateway.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dnsSupport Enable or disable DNS support.
     * Enabled by default.
     */
    override fun dnsSupport(dnsSupport: String) {
      cdkBuilder.dnsSupport(dnsSupport)
    }

    /**
     * @param multicastSupport Indicates whether multicast is enabled on the transit gateway.
     */
    override fun multicastSupport(multicastSupport: String) {
      cdkBuilder.multicastSupport(multicastSupport)
    }

    /**
     * @param propagationDefaultRouteTableId The ID of the default propagation route table.
     */
    override fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
      cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
    }

    /**
     * @param tags The tags for the transit gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the transit gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
     */
    override fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>) {
      cdkBuilder.transitGatewayCidrBlocks(transitGatewayCidrBlocks)
    }

    /**
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
     */
    override fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String): Unit =
        transitGatewayCidrBlocks(transitGatewayCidrBlocks.toList())

    /**
     * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support.
     * Enabled by default.
     */
    override fun vpnEcmpSupport(vpnEcmpSupport: String) {
      cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayProps {
    /**
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     *
     * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn)
     */
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    /**
     * The ID of the default association route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
     */
    override fun associationDefaultRouteTableId(): String? =
        unwrap(this).getAssociationDefaultRouteTableId()

    /**
     * Enable or disable automatic acceptance of attachment requests.
     *
     * Disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-autoacceptsharedattachments)
     */
    override fun autoAcceptSharedAttachments(): String? =
        unwrap(this).getAutoAcceptSharedAttachments()

    /**
     * Enable or disable automatic association with the default association route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetableassociation)
     */
    override fun defaultRouteTableAssociation(): String? =
        unwrap(this).getDefaultRouteTableAssociation()

    /**
     * Enable or disable automatic propagation of routes to the default propagation route table.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-defaultroutetablepropagation)
     */
    override fun defaultRouteTablePropagation(): String? =
        unwrap(this).getDefaultRouteTablePropagation()

    /**
     * The description of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Enable or disable DNS support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-dnssupport)
     */
    override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    /**
     * Indicates whether multicast is enabled on the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
     */
    override fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

    /**
     * The ID of the default propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
     */
    override fun propagationDefaultRouteTableId(): String? =
        unwrap(this).getPropagationDefaultRouteTableId()

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     */
    override fun transitGatewayCidrBlocks(): List<String> =
        unwrap(this).getTransitGatewayCidrBlocks() ?: emptyList()

    /**
     * Enable or disable Equal Cost Multipath Protocol support.
     *
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport)
     */
    override fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps):
        CfnTransitGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTransitGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
  }
}
