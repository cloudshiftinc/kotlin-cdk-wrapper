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
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The setting to remix the audio.
 *
 * The parent of this entity is AudioChannelMappings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputChannelLevelProperty inputChannelLevelProperty = InputChannelLevelProperty.builder()
 * .gain(123)
 * .inputChannel(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputchannellevel.html)
 */
@CdkDslMarker
public class CfnChannelInputChannelLevelPropertyDsl {
    private val cdkBuilder: CfnChannel.InputChannelLevelProperty.Builder =
        CfnChannel.InputChannelLevelProperty.builder()

    /**
     * @param gain The remixing value. Units are in dB, and acceptable values are within the range
     *   from -60 (mute) to 6 dB.
     */
    public fun gain(gain: Number) {
        cdkBuilder.gain(gain)
    }

    /** @param inputChannel The index of the input channel that is used as a source. */
    public fun inputChannel(inputChannel: Number) {
        cdkBuilder.inputChannel(inputChannel)
    }

    public fun build(): CfnChannel.InputChannelLevelProperty = cdkBuilder.build()
}
