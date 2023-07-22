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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps

@CdkDslMarker
public class CfnTransitGatewayPropsDsl {
  private val cdkBuilder: CfnTransitGatewayProps.Builder = CfnTransitGatewayProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _transitGatewayCidrBlocks: MutableList<String> = mutableListOf()

  /**
   * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
   * session.
   * The range is 64512 to 65534 for 16-bit ASNs. The default is 64512.
   */
  public fun amazonSideAsn(amazonSideAsn: Number) {
    cdkBuilder.amazonSideAsn(amazonSideAsn)
  }

  /**
   * @param associationDefaultRouteTableId The ID of the default association route table.
   */
  public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
    cdkBuilder.associationDefaultRouteTableId(associationDefaultRouteTableId)
  }

  /**
   * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
   * requests.
   * Disabled by default.
   */
  public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
    cdkBuilder.autoAcceptSharedAttachments(autoAcceptSharedAttachments)
  }

  /**
   * @param defaultRouteTableAssociation Enable or disable automatic association with the default
   * association route table.
   * Enabled by default.
   */
  public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
    cdkBuilder.defaultRouteTableAssociation(defaultRouteTableAssociation)
  }

  /**
   * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
   * default propagation route table.
   * Enabled by default.
   */
  public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
    cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
  }

  /**
   * @param description The description of the transit gateway.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param dnsSupport Enable or disable DNS support.
   * Enabled by default.
   */
  public fun dnsSupport(dnsSupport: String) {
    cdkBuilder.dnsSupport(dnsSupport)
  }

  /**
   * @param multicastSupport Indicates whether multicast is enabled on the transit gateway.
   */
  public fun multicastSupport(multicastSupport: String) {
    cdkBuilder.multicastSupport(multicastSupport)
  }

  /**
   * @param propagationDefaultRouteTableId The ID of the default propagation route table.
   */
  public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
    cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
  }

  /**
   * @param tags The tags for the transit gateway.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the transit gateway.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
   */
  public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String) {
    _transitGatewayCidrBlocks.addAll(listOf(*transitGatewayCidrBlocks))
  }

  /**
   * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
   */
  public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: Collection<String>) {
    _transitGatewayCidrBlocks.addAll(transitGatewayCidrBlocks)
  }

  /**
   * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support.
   * Enabled by default.
   */
  public fun vpnEcmpSupport(vpnEcmpSupport: String) {
    cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
  }

  public fun build(): CfnTransitGatewayProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_transitGatewayCidrBlocks.isNotEmpty())
        cdkBuilder.transitGatewayCidrBlocks(_transitGatewayCidrBlocks)
    return cdkBuilder.build()
  }
}
