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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayPeeringAttachment.Builder =
        CfnTransitGatewayPeeringAttachment.Builder.create(scope, id)

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

    public fun build(): CfnTransitGatewayPeeringAttachment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
