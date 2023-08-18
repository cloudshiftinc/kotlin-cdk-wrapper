@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.constructs.Construct

/**
 * Specifies a transit gateway.
 *
 * You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises
 * networks. After the transit gateway enters the `available` state, you can attach your VPCs and
 * VPN connections to the transit gateway.
 *
 * To attach your VPCs, use
 * [AWS::EC2::TransitGatewayAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
 * .
 *
 * To attach a VPN connection, use
 * [AWS::EC2::CustomerGateway](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html)
 * to create a customer gateway and specify the ID of the customer gateway and the ID of the transit
 * gateway in a call to
 * [AWS::EC2::VPNConnection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html)
 * .
 *
 * When you create a transit gateway, we create a default transit gateway route table and use it as
 * the default association route table and the default propagation route table. You can use
 * [AWS::EC2::TransitGatewayRouteTable](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
 * to create additional transit gateway route tables. If you disable automatic route propagation, we
 * do not create a default transit gateway route table. You can use
 * [AWS::EC2::TransitGatewayRouteTablePropagation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
 * to propagate routes from a resource attachment to a transit gateway route table. If you disable
 * automatic associations, you can use
 * [AWS::EC2::TransitGatewayRouteTableAssociation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
 * to associate a resource attachment with a transit gateway route table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGateway cfnTransitGateway = CfnTransitGateway.Builder.create(this,
 * "MyCfnTransitGateway")
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
     *
     * @param amazonSideAsn A private Autonomous System Number (ASN) for the Amazon side of a BGP
     *   session.
     */
    public fun amazonSideAsn(amazonSideAsn: Number) {
        cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * The ID of the default association route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-associationdefaultroutetableid)
     *
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
     *
     * @param autoAcceptSharedAttachments Enable or disable automatic acceptance of attachment
     *   requests.
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
     *
     * @param defaultRouteTableAssociation Enable or disable automatic association with the default
     *   association route table.
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
     *
     * @param defaultRouteTablePropagation Enable or disable automatic propagation of routes to the
     *   default propagation route table.
     */
    public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
        cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
    }

    /**
     * The description of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-description)
     *
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
     *
     * @param dnsSupport Enable or disable DNS support.
     */
    public fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
    }

    /**
     * Indicates whether multicast is enabled on the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-multicastsupport)
     *
     * @param multicastSupport Indicates whether multicast is enabled on the transit gateway.
     */
    public fun multicastSupport(multicastSupport: String) {
        cdkBuilder.multicastSupport(multicastSupport)
    }

    /**
     * The ID of the default propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-propagationdefaultroutetableid)
     *
     * @param propagationDefaultRouteTableId The ID of the default propagation route table.
     */
    public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
        cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
    }

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     *
     * @param tags The tags for the transit gateway.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-tags)
     *
     * @param tags The tags for the transit gateway.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     *
     * @param transitGatewayCidrBlocks The transit gateway CIDR blocks.
     */
    public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String) {
        _transitGatewayCidrBlocks.addAll(listOf(*transitGatewayCidrBlocks))
    }

    /**
     * The transit gateway CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgateway.html#cfn-ec2-transitgateway-transitgatewaycidrblocks)
     *
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
     *
     * @param vpnEcmpSupport Enable or disable Equal Cost Multipath Protocol support.
     */
    public fun vpnEcmpSupport(vpnEcmpSupport: String) {
        cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
    }

    public fun build(): CfnTransitGateway {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_transitGatewayCidrBlocks.isNotEmpty())
            cdkBuilder.transitGatewayCidrBlocks(_transitGatewayCidrBlocks)
        return cdkBuilder.build()
    }
}
