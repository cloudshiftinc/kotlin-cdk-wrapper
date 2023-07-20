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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnCustomerGatewayAssociationPropsDsl {
    private val cdkBuilder: CfnCustomerGatewayAssociationProps.Builder =
        CfnCustomerGatewayAssociationProps.builder()

    public fun customerGatewayArn(customerGatewayArn: String) {
        cdkBuilder.customerGatewayArn(customerGatewayArn)
    }

    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public fun linkId(linkId: String) {
        cdkBuilder.linkId(linkId)
    }

    public fun build(): CfnCustomerGatewayAssociationProps = cdkBuilder.build()
}
