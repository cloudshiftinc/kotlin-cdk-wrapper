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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeSourcePropertyDsl {
    private val cdkBuilder: CfnBridge.BridgeSourceProperty.Builder =
        CfnBridge.BridgeSourceProperty.builder()

    public fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource)
    }

    public fun flowSource(flowSource: CfnBridge.BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource)
    }

    public fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun networkSource(networkSource: CfnBridge.BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun build(): CfnBridge.BridgeSourceProperty = cdkBuilder.build()
}
