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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps

/**
 * Properties for defining a `CfnTransitGatewayRouteTableAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRouteTableAttachmentProps cfnTransitGatewayRouteTableAttachmentProps =
 * CfnTransitGatewayRouteTableAttachmentProps.builder()
 * .peeringId("peeringId")
 * .transitGatewayRouteTableArn("transitGatewayRouteTableArn")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteTableAttachmentPropsDsl {
    private val cdkBuilder: CfnTransitGatewayRouteTableAttachmentProps.Builder =
        CfnTransitGatewayRouteTableAttachmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param peeringId The ID of the transit gateway peering. */
    public fun peeringId(peeringId: String) {
        cdkBuilder.peeringId(peeringId)
    }

    /** @param proposedSegmentChange This property is read-only. Values can't be assigned to it. */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /** @param proposedSegmentChange This property is read-only. Values can't be assigned to it. */
    public fun proposedSegmentChange(
        proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
    ) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     *   attachment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     *   attachment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param transitGatewayRouteTableArn The ARN of the transit gateway attachment route table. For
     *   example, `"TransitGatewayRouteTableArn":
     *   "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"`
     *   .
     */
    public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
        cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
    }

    public fun build(): CfnTransitGatewayRouteTableAttachmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
