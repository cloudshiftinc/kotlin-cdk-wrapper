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
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.constructs.Construct

/**
 * Creates a core network Connect attachment from a specified core network attachment.
 *
 * A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish
 * a connection between a core network and an appliance. A core network Connect attachment uses an
 * existing VPC attachment as the underlying transport mechanism.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnConnectAttachment cfnConnectAttachment = CfnConnectAttachment.Builder.create(this,
 * "MyCfnConnectAttachment")
 * .coreNetworkId("coreNetworkId")
 * .edgeLocation("edgeLocation")
 * .options(ConnectAttachmentOptionsProperty.builder()
 * .protocol("protocol")
 * .build())
 * .transportAttachmentId("transportAttachmentId")
 * // the properties below are optional
 * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html)
 */
@CdkDslMarker
public class CfnConnectAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectAttachment.Builder =
        CfnConnectAttachment.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the core network where the Connect attachment is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-corenetworkid)
     *
     * @param coreNetworkId The ID of the core network where the Connect attachment is located.
     */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * The Region where the edge is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-edgelocation)
     *
     * @param edgeLocation The Region where the edge is located.
     */
    public fun edgeLocation(edgeLocation: String) {
        cdkBuilder.edgeLocation(edgeLocation)
    }

    /**
     * Options for connecting an attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-options)
     *
     * @param options Options for connecting an attachment.
     */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /**
     * Options for connecting an attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-options)
     *
     * @param options Options for connecting an attachment.
     */
    public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
        cdkBuilder.options(options)
    }

    /**
     * The attachment to move from one segment to another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-proposedsegmentchange)
     *
     * @param proposedSegmentChange The attachment to move from one segment to another.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * The attachment to move from one segment to another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-proposedsegmentchange)
     *
     * @param proposedSegmentChange The attachment to move from one segment to another.
     */
    public fun proposedSegmentChange(
        proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty
    ) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-tags)
     *
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-tags)
     *
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the transport attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-transportattachmentid)
     *
     * @param transportAttachmentId The ID of the transport attachment.
     */
    public fun transportAttachmentId(transportAttachmentId: String) {
        cdkBuilder.transportAttachmentId(transportAttachmentId)
    }

    public fun build(): CfnConnectAttachment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
