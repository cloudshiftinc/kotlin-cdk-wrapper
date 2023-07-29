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
 * Settings for the fMP4 containers.
 *
 * The parent of this entity is HlsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Fmp4HlsSettingsProperty fmp4HlsSettingsProperty = Fmp4HlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-fmp4hlssettings.html)
 */
@CdkDslMarker
public class CfnChannelFmp4HlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Fmp4HlsSettingsProperty.Builder =
        CfnChannel.Fmp4HlsSettingsProperty.builder()

    /**
     * @param audioRenditionSets List all the audio groups that are used with the video output
     *   stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
     */
    public fun audioRenditionSets(audioRenditionSets: String) {
        cdkBuilder.audioRenditionSets(audioRenditionSets)
    }

    /**
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones for media tracking
     *   will be detected in the input audio and an equivalent ID3 tag will be inserted in the
     *   output.
     */
    public fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
    }

    /**
     * @param timedMetadataBehavior When set to passthrough, timed metadata is passed through from
     *   input to output.
     */
    public fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
    }

    public fun build(): CfnChannel.Fmp4HlsSettingsProperty = cdkBuilder.build()
}
