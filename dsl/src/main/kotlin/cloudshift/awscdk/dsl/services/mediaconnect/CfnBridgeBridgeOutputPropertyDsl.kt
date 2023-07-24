@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * The output of the bridge.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeOutputProperty bridgeOutputProperty = BridgeOutputProperty.builder()
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeoutput.html)
 */
@CdkDslMarker
public class CfnBridgeBridgeOutputPropertyDsl {
    private val cdkBuilder: CfnBridge.BridgeOutputProperty.Builder =
        CfnBridge.BridgeOutputProperty.builder()

    /**
     * @param networkOutput The output of the bridge.
     * A network output is delivered to your premises.
     */
    public fun networkOutput(networkOutput: IResolvable) {
        cdkBuilder.networkOutput(networkOutput)
    }

    /**
     * @param networkOutput The output of the bridge.
     * A network output is delivered to your premises.
     */
    public fun networkOutput(networkOutput: CfnBridge.BridgeNetworkOutputProperty) {
        cdkBuilder.networkOutput(networkOutput)
    }

    public fun build(): CfnBridge.BridgeOutputProperty = cdkBuilder.build()
}
