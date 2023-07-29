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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * Create a bridge with the egress bridge type.
 *
 * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
 * flow and is delivered to your premises.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * EgressGatewayBridgeProperty egressGatewayBridgeProperty = EgressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-egressgatewaybridge.html)
 */
@CdkDslMarker
public class CfnBridgeEgressGatewayBridgePropertyDsl {
    private val cdkBuilder: CfnBridge.EgressGatewayBridgeProperty.Builder =
        CfnBridge.EgressGatewayBridgeProperty.builder()

    /** @param maxBitrate The maximum expected bitrate (in bps) of the egress bridge. */
    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    public fun build(): CfnBridge.EgressGatewayBridgeProperty = cdkBuilder.build()
}
