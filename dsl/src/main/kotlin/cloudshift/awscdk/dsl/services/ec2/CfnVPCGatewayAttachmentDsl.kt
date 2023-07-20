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
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnVPCGatewayAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCGatewayAttachment.Builder =
        CfnVPCGatewayAttachment.Builder.create(scope, id)

    public fun internetGatewayId(internetGatewayId: String) {
        cdkBuilder.internetGatewayId(internetGatewayId)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPCGatewayAttachment = cdkBuilder.build()
}
