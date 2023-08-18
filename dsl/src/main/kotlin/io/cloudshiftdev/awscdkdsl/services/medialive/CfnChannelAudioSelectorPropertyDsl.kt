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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about one audio to extract from the input.
 *
 * The parent of this entity is InputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioSelectorProperty audioSelectorProperty = AudioSelectorProperty.builder()
 * .name("name")
 * .selectorSettings(AudioSelectorSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioselector.html)
 */
@CdkDslMarker
public class CfnChannelAudioSelectorPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioSelectorProperty.Builder =
        CfnChannel.AudioSelectorProperty.builder()

    /** @param name A name for this AudioSelector. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param selectorSettings Information about the specific audio to extract from the input. */
    public fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    /** @param selectorSettings Information about the specific audio to extract from the input. */
    public fun selectorSettings(selectorSettings: CfnChannel.AudioSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    public fun build(): CfnChannel.AudioSelectorProperty = cdkBuilder.build()
}
