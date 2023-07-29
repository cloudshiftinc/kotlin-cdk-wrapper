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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for normalizing video.
 *
 * The parent of this entity is AudioDescription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioNormalizationSettingsProperty audioNormalizationSettingsProperty =
 * AudioNormalizationSettingsProperty.builder()
 * .algorithm("algorithm")
 * .algorithmControl("algorithmControl")
 * .targetLkfs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audionormalizationsettings.html)
 */
@CdkDslMarker
public class CfnChannelAudioNormalizationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioNormalizationSettingsProperty.Builder =
        CfnChannel.AudioNormalizationSettingsProperty.builder()

    /**
     * @param algorithm The audio normalization algorithm to use. itu17701 conforms to the CALM Act
     *   specification. itu17702 conforms to the EBU R-128 specification.
     */
    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    /**
     * @param algorithmControl When set to correctAudio, the output audio is corrected using the
     *   chosen algorithm. If set to measureOnly, the audio is measured but not adjusted.
     */
    public fun algorithmControl(algorithmControl: String) {
        cdkBuilder.algorithmControl(algorithmControl)
    }

    /**
     * @param targetLkfs The Target LKFS(loudness) to adjust volume to. If no value is entered, a
     *   default value is used according to the chosen algorithm. The CALM Act (1770-1) recommends a
     *   target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
     */
    public fun targetLkfs(targetLkfs: Number) {
        cdkBuilder.targetLkfs(targetLkfs)
    }

    public fun build(): CfnChannel.AudioNormalizationSettingsProperty = cdkBuilder.build()
}
