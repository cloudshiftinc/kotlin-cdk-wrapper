@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentPropsDsl {
    private val cdkBuilder: CfnTransitGatewayPeeringAttachmentProps.Builder =
        CfnTransitGatewayPeeringAttachmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun peerAccountId(peerAccountId: String) {
        cdkBuilder.peerAccountId(peerAccountId)
    }

    public fun peerRegion(peerRegion: String) {
        cdkBuilder.peerRegion(peerRegion)
    }

    public fun peerTransitGatewayId(peerTransitGatewayId: String) {
        cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): CfnTransitGatewayPeeringAttachmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
