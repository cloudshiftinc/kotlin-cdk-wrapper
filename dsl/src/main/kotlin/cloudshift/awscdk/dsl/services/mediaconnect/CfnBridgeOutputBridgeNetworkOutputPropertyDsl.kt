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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnBridgeOutputBridgeNetworkOutputPropertyDsl {
    private val cdkBuilder: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder =
        CfnBridgeOutput.BridgeNetworkOutputProperty.builder()

    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    public fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnBridgeOutput.BridgeNetworkOutputProperty = cdkBuilder.build()
}
