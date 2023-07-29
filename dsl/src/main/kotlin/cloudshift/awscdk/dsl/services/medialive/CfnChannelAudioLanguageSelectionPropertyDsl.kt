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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the audio language to extract.
 *
 * The parent of this entity is AudioSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioLanguageSelectionProperty audioLanguageSelectionProperty =
 * AudioLanguageSelectionProperty.builder()
 * .languageCode("languageCode")
 * .languageSelectionPolicy("languageSelectionPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html)
 */
@CdkDslMarker
public class CfnChannelAudioLanguageSelectionPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioLanguageSelectionProperty.Builder =
        CfnChannel.AudioLanguageSelectionProperty.builder()

    /**
     * @param languageCode Selects a specific three-letter language code from within an audio
     *   source.
     */
    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param languageSelectionPolicy When set to "strict," the transport stream demux strictly
     *   identifies audio streams by their language descriptor. If a PMT update occurs such that an
     *   audio stream matching the initially selected language is no longer present, then mute is
     *   encoded until the language returns. If set to "loose," then on a PMT update the demux
     *   chooses another audio stream in the program with the same stream type if it can't find one
     *   with the same language.
     */
    public fun languageSelectionPolicy(languageSelectionPolicy: String) {
        cdkBuilder.languageSelectionPolicy(languageSelectionPolicy)
    }

    public fun build(): CfnChannel.AudioLanguageSelectionProperty = cdkBuilder.build()
}
