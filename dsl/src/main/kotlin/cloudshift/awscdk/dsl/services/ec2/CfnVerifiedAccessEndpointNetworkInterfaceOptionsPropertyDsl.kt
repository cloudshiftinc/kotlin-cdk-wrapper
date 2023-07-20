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
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder =
        CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder()

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty = cdkBuilder.build()
}
