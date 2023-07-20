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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps
import kotlin.String

@CdkDslMarker
public class CfnBridgeOutputPropsDsl {
    private val cdkBuilder: CfnBridgeOutputProps.Builder = CfnBridgeOutputProps.builder()

    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networkOutput(networkOutput: IResolvable) {
        cdkBuilder.networkOutput(networkOutput)
    }

    public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
        cdkBuilder.networkOutput(networkOutput)
    }

    public fun build(): CfnBridgeOutputProps = cdkBuilder.build()
}
