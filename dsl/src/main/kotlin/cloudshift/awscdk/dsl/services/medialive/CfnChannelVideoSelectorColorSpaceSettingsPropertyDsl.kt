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

@CdkDslMarker
public class CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorColorSpaceSettingsProperty.Builder =
        CfnChannel.VideoSelectorColorSpaceSettingsProperty.builder()

    public fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings)
    }

    public fun hdr10Settings(hdr10Settings: CfnChannel.Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings)
    }

    public fun build(): CfnChannel.VideoSelectorColorSpaceSettingsProperty = cdkBuilder.build()
}
