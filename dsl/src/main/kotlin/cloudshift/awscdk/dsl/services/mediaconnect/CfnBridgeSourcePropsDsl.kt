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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
import kotlin.String

@CdkDslMarker
public class CfnBridgeSourcePropsDsl {
    private val cdkBuilder: CfnBridgeSourceProps.Builder = CfnBridgeSourceProps.builder()

    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    public fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource)
    }

    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun build(): CfnBridgeSourceProps = cdkBuilder.build()
}
