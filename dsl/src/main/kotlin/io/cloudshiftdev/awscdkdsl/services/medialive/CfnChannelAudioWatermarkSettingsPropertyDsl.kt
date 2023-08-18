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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Audio Watermark Settings.
 *
 * The parent of this entity is AudioDescription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioWatermarkSettingsProperty audioWatermarkSettingsProperty =
 * AudioWatermarkSettingsProperty.builder()
 * .nielsenWatermarksSettings(NielsenWatermarksSettingsProperty.builder()
 * .nielsenCbetSettings(NielsenCBETProperty.builder()
 * .cbetCheckDigitString("cbetCheckDigitString")
 * .cbetStepaside("cbetStepaside")
 * .csid("csid")
 * .build())
 * .nielsenDistributionType("nielsenDistributionType")
 * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
 * .checkDigitString("checkDigitString")
 * .sid(123)
 * .timezone("timezone")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiowatermarksettings.html)
 */
@CdkDslMarker
public class CfnChannelAudioWatermarkSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioWatermarkSettingsProperty.Builder =
        CfnChannel.AudioWatermarkSettingsProperty.builder()

    /**
     * @param nielsenWatermarksSettings Settings to configure Nielsen Watermarks in the audio
     *   encode.
     */
    public fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings)
    }

    /**
     * @param nielsenWatermarksSettings Settings to configure Nielsen Watermarks in the audio
     *   encode.
     */
    public fun nielsenWatermarksSettings(
        nielsenWatermarksSettings: CfnChannel.NielsenWatermarksSettingsProperty
    ) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings)
    }

    public fun build(): CfnChannel.AudioWatermarkSettingsProperty = cdkBuilder.build()
}
