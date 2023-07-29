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
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect

/**
 * Describes the Connect attachment options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TransitGatewayConnectOptionsProperty transitGatewayConnectOptionsProperty =
 * TransitGatewayConnectOptionsProperty.builder()
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayconnect-transitgatewayconnectoptions.html)
 */
@CdkDslMarker
public class CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder =
        CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.builder()

    /** @param protocol The tunnel protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty =
        cdkBuilder.build()
}
