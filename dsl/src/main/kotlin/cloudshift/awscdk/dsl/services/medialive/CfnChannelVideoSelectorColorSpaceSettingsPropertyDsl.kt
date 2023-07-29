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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure color space settings in the incoming video.
 *
 * The parent of this entity is VideoSelector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoSelectorColorSpaceSettingsProperty videoSelectorColorSpaceSettingsProperty =
 * VideoSelectorColorSpaceSettingsProperty.builder()
 * .hdr10Settings(Hdr10SettingsProperty.builder()
 * .maxCll(123)
 * .maxFall(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorcolorspacesettings.html)
 */
@CdkDslMarker
public class CfnChannelVideoSelectorColorSpaceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorColorSpaceSettingsProperty.Builder =
        CfnChannel.VideoSelectorColorSpaceSettingsProperty.builder()

    /** @param hdr10Settings Settings to configure color space settings in the incoming video. */
    public fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings)
    }

    /** @param hdr10Settings Settings to configure color space settings in the incoming video. */
    public fun hdr10Settings(hdr10Settings: CfnChannel.Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings)
    }

    public fun build(): CfnChannel.VideoSelectorColorSpaceSettingsProperty = cdkBuilder.build()
}
