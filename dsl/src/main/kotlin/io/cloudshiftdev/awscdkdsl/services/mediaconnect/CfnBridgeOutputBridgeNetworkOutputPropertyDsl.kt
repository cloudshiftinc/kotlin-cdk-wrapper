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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput

/**
 * The output of the bridge.
 *
 * A network output is delivered to your premises.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeNetworkOutputProperty bridgeNetworkOutputProperty = BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html)
 */
@CdkDslMarker
public class CfnBridgeOutputBridgeNetworkOutputPropertyDsl {
    private val cdkBuilder: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder =
        CfnBridgeOutput.BridgeNetworkOutputProperty.builder()

    /** @param ipAddress The network output IP Address. */
    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    /** @param networkName The network output's gateway network name. */
    public fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
    }

    /** @param port The network output port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol The network output protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /** @param ttl The network output TTL. */
    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnBridgeOutput.BridgeNetworkOutputProperty = cdkBuilder.build()
}
