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
 * Information about the audio to extract from the input.
 *
 * The parent of this entity is AudioSelector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioSelectorSettingsProperty audioSelectorSettingsProperty =
 * AudioSelectorSettingsProperty.builder()
 * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
 * .groupId("groupId")
 * .name("name")
 * .build())
 * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
 * .languageCode("languageCode")
 * .languageSelectionPolicy("languageSelectionPolicy")
 * .build())
 * .audioPidSelection(AudioPidSelectionProperty.builder()
 * .pid(123)
 * .build())
 * .audioTrackSelection(AudioTrackSelectionProperty.builder()
 * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
 * .programSelection("programSelection")
 * .build())
 * .tracks(List.of(AudioTrackProperty.builder()
 * .track(123)
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioselectorsettings.html)
 */
@CdkDslMarker
public class CfnChannelAudioSelectorSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioSelectorSettingsProperty.Builder =
        CfnChannel.AudioSelectorSettingsProperty.builder()

    /** @param audioHlsRenditionSelection Selector for HLS audio rendition. */
    public fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection)
    }

    /** @param audioHlsRenditionSelection Selector for HLS audio rendition. */
    public fun audioHlsRenditionSelection(
        audioHlsRenditionSelection: CfnChannel.AudioHlsRenditionSelectionProperty
    ) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection)
    }

    /** @param audioLanguageSelection The language code of the audio to select. */
    public fun audioLanguageSelection(audioLanguageSelection: IResolvable) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection)
    }

    /** @param audioLanguageSelection The language code of the audio to select. */
    public fun audioLanguageSelection(
        audioLanguageSelection: CfnChannel.AudioLanguageSelectionProperty
    ) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection)
    }

    /** @param audioPidSelection The PID of the audio to select. */
    public fun audioPidSelection(audioPidSelection: IResolvable) {
        cdkBuilder.audioPidSelection(audioPidSelection)
    }

    /** @param audioPidSelection The PID of the audio to select. */
    public fun audioPidSelection(audioPidSelection: CfnChannel.AudioPidSelectionProperty) {
        cdkBuilder.audioPidSelection(audioPidSelection)
    }

    /** @param audioTrackSelection Information about the audio track to extract. */
    public fun audioTrackSelection(audioTrackSelection: IResolvable) {
        cdkBuilder.audioTrackSelection(audioTrackSelection)
    }

    /** @param audioTrackSelection Information about the audio track to extract. */
    public fun audioTrackSelection(audioTrackSelection: CfnChannel.AudioTrackSelectionProperty) {
        cdkBuilder.audioTrackSelection(audioTrackSelection)
    }

    public fun build(): CfnChannel.AudioSelectorSettingsProperty = cdkBuilder.build()
}
