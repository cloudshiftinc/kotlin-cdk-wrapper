@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import kotlin.Number

/**
 * Create a bridge with the ingress bridge type.
 *
 * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
 * delivered to the cloud.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * IngressGatewayBridgeProperty ingressGatewayBridgeProperty =
 * IngressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .maxOutputs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html)
 */
@CdkDslMarker
public class CfnBridgeIngressGatewayBridgePropertyDsl {
    private val cdkBuilder: CfnBridge.IngressGatewayBridgeProperty.Builder =
        CfnBridge.IngressGatewayBridgeProperty.builder()

    /**
     * @param maxBitrate The maximum expected bitrate (in bps) of the ingress bridge.
     */
    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    /**
     * @param maxOutputs The maximum number of outputs on the ingress bridge.
     */
    public fun maxOutputs(maxOutputs: Number) {
        cdkBuilder.maxOutputs(maxOutputs)
    }

    public fun build(): CfnBridge.IngressGatewayBridgeProperty = cdkBuilder.build()
}
