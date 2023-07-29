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
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps

/**
 * Properties for defining a `CfnCustomerGatewayAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnCustomerGatewayAssociationProps cfnCustomerGatewayAssociationProps =
 * CfnCustomerGatewayAssociationProps.builder()
 * .customerGatewayArn("customerGatewayArn")
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html)
 */
@CdkDslMarker
public class CfnCustomerGatewayAssociationPropsDsl {
    private val cdkBuilder: CfnCustomerGatewayAssociationProps.Builder =
        CfnCustomerGatewayAssociationProps.builder()

    /** @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway. */
    public fun customerGatewayArn(customerGatewayArn: String) {
        cdkBuilder.customerGatewayArn(customerGatewayArn)
    }

    /** @param deviceId The ID of the device. */
    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /** @param linkId The ID of the link. */
    public fun linkId(linkId: String) {
        cdkBuilder.linkId(linkId)
    }

    public fun build(): CfnCustomerGatewayAssociationProps = cdkBuilder.build()
}
