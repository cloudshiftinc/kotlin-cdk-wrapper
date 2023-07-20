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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnBridgeSourceBridgeNetworkSourcePropertyDsl {
    private val cdkBuilder: CfnBridgeSource.BridgeNetworkSourceProperty.Builder =
        CfnBridgeSource.BridgeNetworkSourceProperty.builder()

    public fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
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

    public fun build(): CfnBridgeSource.BridgeNetworkSourceProperty = cdkBuilder.build()
}
