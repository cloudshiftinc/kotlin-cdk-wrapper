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
 * Information about the video to extract from the input.
 *
 * The parent of this entity is VideoSelector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoSelectorSettingsProperty videoSelectorSettingsProperty =
 * VideoSelectorSettingsProperty.builder()
 * .videoSelectorPid(VideoSelectorPidProperty.builder()
 * .pid(123)
 * .build())
 * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
 * .programId(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html)
 */
@CdkDslMarker
public class CfnChannelVideoSelectorSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorSettingsProperty.Builder =
        CfnChannel.VideoSelectorSettingsProperty.builder()

    /** @param videoSelectorPid Used to extract video by PID. */
    public fun videoSelectorPid(videoSelectorPid: IResolvable) {
        cdkBuilder.videoSelectorPid(videoSelectorPid)
    }

    /** @param videoSelectorPid Used to extract video by PID. */
    public fun videoSelectorPid(videoSelectorPid: CfnChannel.VideoSelectorPidProperty) {
        cdkBuilder.videoSelectorPid(videoSelectorPid)
    }

    /** @param videoSelectorProgramId Used to extract video by program ID. */
    public fun videoSelectorProgramId(videoSelectorProgramId: IResolvable) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId)
    }

    /** @param videoSelectorProgramId Used to extract video by program ID. */
    public fun videoSelectorProgramId(
        videoSelectorProgramId: CfnChannel.VideoSelectorProgramIdProperty
    ) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId)
    }

    public fun build(): CfnChannel.VideoSelectorSettingsProperty = cdkBuilder.build()
}
