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
 * Information about the ancillary captions to extract from the input.
 *
 * The parent of this entity is CaptionSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AncillarySourceSettingsProperty ancillarySourceSettingsProperty =
 * AncillarySourceSettingsProperty.builder()
 * .sourceAncillaryChannelNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ancillarysourcesettings.html)
 */
@CdkDslMarker
public class CfnChannelAncillarySourceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AncillarySourceSettingsProperty.Builder =
        CfnChannel.AncillarySourceSettingsProperty.builder()

    /**
     * @param sourceAncillaryChannelNumber Specifies the number (1 to 4) of the captions channel you
     *   want to extract from the ancillary captions. If you plan to convert the ancillary captions
     *   to another format, complete this field. If you plan to choose Embedded as the captions
     *   destination in the output (to pass through all the channels in the ancillary captions),
     *   leave this field blank because MediaLive ignores the field.
     */
    public fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
        cdkBuilder.sourceAncillaryChannelNumber(sourceAncillaryChannelNumber)
    }

    public fun build(): CfnChannel.AncillarySourceSettingsProperty = cdkBuilder.build()
}
