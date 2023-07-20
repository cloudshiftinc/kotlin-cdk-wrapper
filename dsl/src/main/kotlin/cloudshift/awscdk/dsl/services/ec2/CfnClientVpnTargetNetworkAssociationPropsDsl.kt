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
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnClientVpnTargetNetworkAssociationPropsDsl {
    private val cdkBuilder: CfnClientVpnTargetNetworkAssociationProps.Builder =
        CfnClientVpnTargetNetworkAssociationProps.builder()

    public fun clientVpnEndpointId(clientVpnEndpointId: String) {
        cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnClientVpnTargetNetworkAssociationProps = cdkBuilder.build()
}
