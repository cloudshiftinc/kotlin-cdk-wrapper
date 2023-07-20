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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayMulticastDomainAssociationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastDomainAssociationProps.Builder =
        CfnTransitGatewayMulticastDomainAssociationProps.builder()

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastDomainAssociationProps = cdkBuilder.build()
}
