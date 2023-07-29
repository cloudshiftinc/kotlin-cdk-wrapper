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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps

/**
 * Properties for defining a `CfnTransitGatewayPeeringAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayPeeringAttachmentProps cfnTransitGatewayPeeringAttachmentProps =
 * CfnTransitGatewayPeeringAttachmentProps.builder()
 * .peerAccountId("peerAccountId")
 * .peerRegion("peerRegion")
 * .peerTransitGatewayId("peerTransitGatewayId")
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html)
 */
@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentPropsDsl {
    private val cdkBuilder: CfnTransitGatewayPeeringAttachmentProps.Builder =
        CfnTransitGatewayPeeringAttachmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param peerAccountId The ID of the AWS account that owns the transit gateway. */
    public fun peerAccountId(peerAccountId: String) {
        cdkBuilder.peerAccountId(peerAccountId)
    }

    /** @param peerRegion The Region of the transit gateway. */
    public fun peerRegion(peerRegion: String) {
        cdkBuilder.peerRegion(peerRegion)
    }

    /** @param peerTransitGatewayId The ID of the transit gateway. */
    public fun peerTransitGatewayId(peerTransitGatewayId: String) {
        cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    /** @param tags The tags for the transit gateway peering attachment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the transit gateway peering attachment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param transitGatewayId The ID of the transit gateway peering attachment. */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): CfnTransitGatewayPeeringAttachmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
