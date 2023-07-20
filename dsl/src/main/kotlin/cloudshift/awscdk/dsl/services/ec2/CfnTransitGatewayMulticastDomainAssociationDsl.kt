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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayMulticastDomainAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayMulticastDomainAssociation.Builder =
        CfnTransitGatewayMulticastDomainAssociation.Builder.create(scope, id)

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastDomainAssociation = cdkBuilder.build()
}
