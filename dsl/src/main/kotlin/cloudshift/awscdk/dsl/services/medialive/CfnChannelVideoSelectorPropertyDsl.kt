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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the video to extract from the input. An input can contain only one video
 * selector.
 *
 * The parent of this entity is InputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoSelectorProperty videoSelectorProperty = VideoSelectorProperty.builder()
 * .colorSpace("colorSpace")
 * .colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty.builder()
 * .hdr10Settings(Hdr10SettingsProperty.builder()
 * .maxCll(123)
 * .maxFall(123)
 * .build())
 * .build())
 * .colorSpaceUsage("colorSpaceUsage")
 * .selectorSettings(VideoSelectorSettingsProperty.builder()
 * .videoSelectorPid(VideoSelectorPidProperty.builder()
 * .pid(123)
 * .build())
 * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
 * .programId(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html)
 */
@CdkDslMarker
public class CfnChannelVideoSelectorPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorProperty.Builder =
        CfnChannel.VideoSelectorProperty.builder()

    /**
     * @param colorSpace Specifies the color space of an input. This setting works in tandem with
     *   colorSpaceConversion to determine if MediaLive will perform any conversion.
     */
    public fun colorSpace(colorSpace: String) {
        cdkBuilder.colorSpace(colorSpace)
    }

    /**
     * @param colorSpaceSettings Settings to configure color space settings in the incoming video.
     */
    public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /**
     * @param colorSpaceSettings Settings to configure color space settings in the incoming video.
     */
    public fun colorSpaceSettings(
        colorSpaceSettings: CfnChannel.VideoSelectorColorSpaceSettingsProperty
    ) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /**
     * @param colorSpaceUsage Applies only if colorSpace is a value other than Follow. This field
     *   controls how the value in the colorSpace field is used. Fallback means that when the input
     *   does include color space data, that data is used, but when the input has no color space
     *   data, the value in colorSpace is used. Choose fallback if your input is sometimes missing
     *   color space data, but when it does have color space data, that data is correct. Force means
     *   to always use the value in colorSpace. Choose force if your input usually has no color
     *   space data or might have unreliable color space data.
     */
    public fun colorSpaceUsage(colorSpaceUsage: String) {
        cdkBuilder.colorSpaceUsage(colorSpaceUsage)
    }

    /** @param selectorSettings Information about the video to select from the content. */
    public fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    /** @param selectorSettings Information about the video to select from the content. */
    public fun selectorSettings(selectorSettings: CfnChannel.VideoSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    public fun build(): CfnChannel.VideoSelectorProperty = cdkBuilder.build()
}
