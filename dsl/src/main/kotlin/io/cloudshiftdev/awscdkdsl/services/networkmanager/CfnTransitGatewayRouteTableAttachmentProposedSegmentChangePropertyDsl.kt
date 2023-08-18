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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment

/**
 * Describes a proposed segment change.
 *
 * In some cases, the segment change must first be evaluated and accepted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
 * ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteTableAttachmentProposedSegmentChangePropertyDsl {
    private val cdkBuilder:
        CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder =
        CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param attachmentPolicyRuleNumber The rule number in the policy document that applies to this
     *   change.
     */
    public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
    }

    /** @param segmentName The name of the segment to change. */
    public fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
    }

    /** @param tags The list of key-value tags that changed for the segment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The list of key-value tags that changed for the segment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
