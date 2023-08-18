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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource

/**
 * The source of the bridge.
 *
 * A network source originates at your premises.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeNetworkSourceProperty bridgeNetworkSourceProperty = BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html)
 */
@CdkDslMarker
public class CfnBridgeSourceBridgeNetworkSourcePropertyDsl {
    private val cdkBuilder: CfnBridgeSource.BridgeNetworkSourceProperty.Builder =
        CfnBridgeSource.BridgeNetworkSourceProperty.builder()

    /** @param multicastIp The network source multicast IP. */
    public fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
    }

    /** @param networkName The network source's gateway network name. */
    public fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
    }

    /** @param port The network source port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol The network source protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnBridgeSource.BridgeNetworkSourceProperty = cdkBuilder.build()
}
