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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

/**
 * Describes the network interface options when creating an AWS Verified Access endpoint using the
 * `network-interface` type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkInterfaceOptionsProperty networkInterfaceOptionsProperty =
 * NetworkInterfaceOptionsProperty.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .port(123)
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder =
        CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder()

    /** @param networkInterfaceId The ID of the network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param port The IP port number. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol The IP protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty =
        cdkBuilder.build()
}
