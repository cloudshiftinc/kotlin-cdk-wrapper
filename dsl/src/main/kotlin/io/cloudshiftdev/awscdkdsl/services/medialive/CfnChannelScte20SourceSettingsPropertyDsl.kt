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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the SCTE-20 captions to extract from the input.
 *
 * The parent of this entity is CaptionSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Scte20SourceSettingsProperty scte20SourceSettingsProperty =
 * Scte20SourceSettingsProperty.builder()
 * .convert608To708("convert608To708")
 * .source608ChannelNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html)
 */
@CdkDslMarker
public class CfnChannelScte20SourceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte20SourceSettingsProperty.Builder =
        CfnChannel.Scte20SourceSettingsProperty.builder()

    /**
     * @param convert608To708 If upconvert, 608 data is both passed through the "608 compatibility
     *   bytes" fields of the 708 wrapper as well as translated into 708. Any 708 data present in
     *   the source content is discarded.
     */
    public fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
    }

    /**
     * @param source608ChannelNumber Specifies the 608/708 channel number within the video track
     *   from which to extract captions.
     */
    public fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
    }

    public fun build(): CfnChannel.Scte20SourceSettingsProperty = cdkBuilder.build()
}
