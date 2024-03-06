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
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps

/**
 * Properties for defining a `CfnSiteToSiteVpnAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnSiteToSiteVpnAttachmentProps cfnSiteToSiteVpnAttachmentProps =
 * CfnSiteToSiteVpnAttachmentProps.builder()
 * .coreNetworkId("coreNetworkId")
 * .vpnConnectionArn("vpnConnectionArn")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html)
 */
@CdkDslMarker
public class CfnSiteToSiteVpnAttachmentPropsDsl {
    private val cdkBuilder: CfnSiteToSiteVpnAttachmentProps.Builder =
        CfnSiteToSiteVpnAttachmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     *   attachment.
     */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
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
        proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
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

    /** @param vpnConnectionArn The ARN of the site-to-site VPN attachment. */
    public fun vpnConnectionArn(vpnConnectionArn: String) {
        cdkBuilder.vpnConnectionArn(vpnConnectionArn)
    }

    public fun build(): CfnSiteToSiteVpnAttachmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
