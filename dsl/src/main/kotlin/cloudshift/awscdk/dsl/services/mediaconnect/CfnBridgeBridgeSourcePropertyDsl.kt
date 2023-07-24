@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * The bridge's source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeSourceProperty bridgeSourceProperty = BridgeSourceProperty.builder()
 * .flowSource(BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * .name("name")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .networkSource(BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html)
 */
@CdkDslMarker
public class CfnBridgeBridgeSourcePropertyDsl {
    private val cdkBuilder: CfnBridge.BridgeSourceProperty.Builder =
        CfnBridge.BridgeSourceProperty.builder()

    /**
     * @param flowSource The source of the bridge.
     * A flow source originates in MediaConnect as an existing cloud flow.
     */
    public fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * @param flowSource The source of the bridge.
     * A flow source originates in MediaConnect as an existing cloud flow.
     */
    public fun flowSource(flowSource: CfnBridge.BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * @param networkSource The source of the bridge.
     * A network source originates at your premises.
     */
    public fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource)
    }

    /**
     * @param networkSource The source of the bridge.
     * A network source originates at your premises.
     */
    public fun networkSource(networkSource: CfnBridge.BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun build(): CfnBridge.BridgeSourceProperty = cdkBuilder.build()
}
