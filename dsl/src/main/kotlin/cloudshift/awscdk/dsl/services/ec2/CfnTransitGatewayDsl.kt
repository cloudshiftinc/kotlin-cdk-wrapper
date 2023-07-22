@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGateway.Builder = CfnTransitGateway.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _transitGatewayCidrBlocks: MutableList<String> = mutableListOf()

  /**
   * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
   *
   * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-amazonsideasn)
   * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
   * session. 
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * The ID of the default association route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
   * @param associationDefaultRouteTableId The ID of the default association route table. 
   */
  public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
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
  public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
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
  public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
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
  public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
    cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
  }

  /**
   * The description of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
   * @param description The description of the transit gateway. 
   */
  public fun description(description: String) {
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
  public fun dnsSupport(dnsSupport: String) {
    cdkBuilder.dnsSupport(dnsSupport)
  }

  /**
   * Indicates whether multicast is enabled on the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
   * @param multicastSupport Indicates whether multicast is enabled on the transit gateway. 
   */
  public fun multicastSupport(multicastSupport: String) {
    cdkBuilder.multicastSupport(multicastSupport)
  }

  /**
   * The ID of the default propagation route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
   * @param propagationDefaultRouteTableId The ID of the default propagation route table. 
   */
  public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
    cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
  }

  /**
   * The tags for the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
   * @param tags The tags for the transit gateway. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
   * @param tags The tags for the transit gateway. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The transit gateway CIDR blocks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
   * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
   */
  public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String) {
    _transitGatewayCidrBlocks.addAll(listOf(*transitGatewayCidrBlocks))
  }

  /**
   * The transit gateway CIDR blocks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
   * @param transitGatewayCidrBlocks The transit gateway CIDR blocks. 
   */
  public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: Collection<String>) {
    _transitGatewayCidrBlocks.addAll(transitGatewayCidrBlocks)
  }

  /**
   * Enable or disable Equal Cost Multipath Protocol support.
   *
   * Enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-vpnecmpsupport)
   * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support. 
   */
  public fun vpnEcmpSupport(vpnEcmpSupport: String) {
    cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
  }

  public fun build(): CfnTransitGateway {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_transitGatewayCidrBlocks.isNotEmpty())
        cdkBuilder.transitGatewayCidrBlocks(_transitGatewayCidrBlocks)
    return cdkBuilder.build()
  }
}
