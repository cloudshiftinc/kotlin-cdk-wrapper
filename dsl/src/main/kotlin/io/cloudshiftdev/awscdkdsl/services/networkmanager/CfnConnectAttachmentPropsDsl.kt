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
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps

/**
 * Properties for defining a `CfnConnectAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnConnectAttachmentProps cfnConnectAttachmentProps = CfnConnectAttachmentProps.builder()
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
public class CfnConnectAttachmentPropsDsl {
    private val cdkBuilder: CfnConnectAttachmentProps.Builder = CfnConnectAttachmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param coreNetworkId The ID of the core network where the Connect attachment is located. */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /** @param edgeLocation The Region where the edge is located. */
    public fun edgeLocation(edgeLocation: String) {
        cdkBuilder.edgeLocation(edgeLocation)
    }

    /** @param options Options for connecting an attachment. */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /** @param options Options for connecting an attachment. */
    public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
        cdkBuilder.options(options)
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change. In some cases, the segment
     *   change must first be evaluated and accepted.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change. In some cases, the segment
     *   change must first be evaluated and accepted.
     */
    public fun proposedSegmentChange(
        proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty
    ) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /** @param tags Tags for the attachment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags for the attachment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param transportAttachmentId The ID of the transport attachment. */
    public fun transportAttachmentId(transportAttachmentId: String) {
        cdkBuilder.transportAttachmentId(transportAttachmentId)
    }

    public fun build(): CfnConnectAttachmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
