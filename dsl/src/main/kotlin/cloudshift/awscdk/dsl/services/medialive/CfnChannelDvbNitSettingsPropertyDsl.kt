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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelDvbNitSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbNitSettingsProperty.Builder =
        CfnChannel.DvbNitSettingsProperty.builder()

    public fun networkId(networkId: Number) {
        cdkBuilder.networkId(networkId)
    }

    public fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
    }

    public fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
    }

    public fun build(): CfnChannel.DvbNitSettingsProperty = cdkBuilder.build()
}
