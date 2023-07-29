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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

/**
 * The container for the network interface.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-networkinterface.html)
 */
@CdkDslMarker
public class CfnEndpointNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnEndpoint.NetworkInterfaceProperty.Builder =
        CfnEndpoint.NetworkInterfaceProperty.builder()

    /** @param networkInterfaceId The ID for the network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): CfnEndpoint.NetworkInterfaceProperty = cdkBuilder.build()
}
