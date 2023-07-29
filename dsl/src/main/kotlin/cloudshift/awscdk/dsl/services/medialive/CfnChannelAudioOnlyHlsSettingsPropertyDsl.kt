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
 * The configuration of an audio-only HLS output.
 *
 * The parent of this entity is HlsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioOnlyHlsSettingsProperty audioOnlyHlsSettingsProperty =
 * AudioOnlyHlsSettingsProperty.builder()
 * .audioGroupId("audioGroupId")
 * .audioOnlyImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .audioTrackType("audioTrackType")
 * .segmentType("segmentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioonlyhlssettings.html)
 */
@CdkDslMarker
public class CfnChannelAudioOnlyHlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioOnlyHlsSettingsProperty.Builder =
        CfnChannel.AudioOnlyHlsSettingsProperty.builder()

    /** @param audioGroupId Specifies the group that the audio rendition belongs to. */
    public fun audioGroupId(audioGroupId: String) {
        cdkBuilder.audioGroupId(audioGroupId)
    }

    /**
     * @param audioOnlyImage Used with an audio-only stream. It must be a .jpg or .png file. If
     *   given, this image is used as the cover art for the audio-only output. Ideally, it should be
     *   formatted for an iPhone screen for two reasons. The iPhone does not resize the image;
     *   instead, it crops a centered image on the top/bottom and left/right. Additionally, this
     *   image file gets saved bit-for-bit into every 10-second segment file, so it increases
     *   bandwidth by {image file size} * {segment count} * {user count.}.
     */
    public fun audioOnlyImage(audioOnlyImage: IResolvable) {
        cdkBuilder.audioOnlyImage(audioOnlyImage)
    }

    /**
     * @param audioOnlyImage Used with an audio-only stream. It must be a .jpg or .png file. If
     *   given, this image is used as the cover art for the audio-only output. Ideally, it should be
     *   formatted for an iPhone screen for two reasons. The iPhone does not resize the image;
     *   instead, it crops a centered image on the top/bottom and left/right. Additionally, this
     *   image file gets saved bit-for-bit into every 10-second segment file, so it increases
     *   bandwidth by {image file size} * {segment count} * {user count.}.
     */
    public fun audioOnlyImage(audioOnlyImage: CfnChannel.InputLocationProperty) {
        cdkBuilder.audioOnlyImage(audioOnlyImage)
    }

    /**
     * @param audioTrackType Four types of audio-only tracks are supported: Audio-Only Variant
     *   Stream The client can play back this audio-only stream instead of video in low-bandwidth
     *   scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto
     *   Select, Default Alternate rendition that the client should try to play back by default.
     *   Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     *   Alternate Audio, Auto Select, Not Default Alternate rendition that the client might try to
     *   play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     *   AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will
     *   not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     *   DEFAULT=NO, AUTOSELECT=NO.
     */
    public fun audioTrackType(audioTrackType: String) {
        cdkBuilder.audioTrackType(audioTrackType)
    }

    /** @param segmentType Specifies the segment type. */
    public fun segmentType(segmentType: String) {
        cdkBuilder.segmentType(segmentType)
    }

    public fun build(): CfnChannel.AudioOnlyHlsSettingsProperty = cdkBuilder.build()
}
