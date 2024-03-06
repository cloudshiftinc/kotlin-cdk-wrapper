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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.constructs.Construct

/**
 * Creates a core network Connect peer for a specified core network connect attachment between a
 * core network and an appliance.
 *
 * The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnConnectPeer cfnConnectPeer = CfnConnectPeer.Builder.create(this, "MyCfnConnectPeer")
 * .connectAttachmentId("connectAttachmentId")
 * .peerAddress("peerAddress")
 * // the properties below are optional
 * .bgpOptions(BgpOptionsProperty.builder()
 * .peerAsn(123)
 * .build())
 * .coreNetworkAddress("coreNetworkAddress")
 * .insideCidrBlocks(List.of("insideCidrBlocks"))
 * .subnetArn("subnetArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html)
 */
@CdkDslMarker
public class CfnConnectPeerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectPeer.Builder = CfnConnectPeer.Builder.create(scope, id)

    private val _insideCidrBlocks: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     *
     * @param bgpOptions Describes the BGP options.
     */
    public fun bgpOptions(bgpOptions: IResolvable) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    /**
     * Describes the BGP options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-bgpoptions)
     *
     * @param bgpOptions Describes the BGP options.
     */
    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    /**
     * The ID of the attachment to connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-connectattachmentid)
     *
     * @param connectAttachmentId The ID of the attachment to connect.
     */
    public fun connectAttachmentId(connectAttachmentId: String) {
        cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    /**
     * The IP address of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-corenetworkaddress)
     *
     * @param coreNetworkAddress The IP address of a core network.
     */
    public fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     *
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
     */
    public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
        _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
    }

    /**
     * The inside IP addresses used for a Connect peer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-insidecidrblocks)
     *
     * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
     */
    public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
        _insideCidrBlocks.addAll(insideCidrBlocks)
    }

    /**
     * The IP address of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-peeraddress)
     *
     * @param peerAddress The IP address of the Connect peer.
     */
    public fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
    }

    /**
     * The subnet ARN of the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-subnetarn)
     *
     * @param subnetArn The subnet ARN of the Connect peer.
     */
    public fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
    }

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     *
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The list of key-value tags associated with the Connect peer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html#cfn-networkmanager-connectpeer-tags)
     *
     * @param tags The list of key-value tags associated with the Connect peer.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConnectPeer {
        if (_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
