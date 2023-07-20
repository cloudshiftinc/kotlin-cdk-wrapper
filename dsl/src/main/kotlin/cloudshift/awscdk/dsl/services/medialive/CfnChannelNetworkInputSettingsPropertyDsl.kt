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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelNetworkInputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.NetworkInputSettingsProperty.Builder =
        CfnChannel.NetworkInputSettingsProperty.builder()

    public fun hlsInputSettings(hlsInputSettings: IResolvable) {
        cdkBuilder.hlsInputSettings(hlsInputSettings)
    }

    public fun hlsInputSettings(hlsInputSettings: CfnChannel.HlsInputSettingsProperty) {
        cdkBuilder.hlsInputSettings(hlsInputSettings)
    }

    public fun serverValidation(serverValidation: String) {
        cdkBuilder.serverValidation(serverValidation)
    }

    public fun build(): CfnChannel.NetworkInputSettingsProperty = cdkBuilder.build()
}
