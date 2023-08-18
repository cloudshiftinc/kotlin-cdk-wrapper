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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for embedded plus SCTE-20 captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * EmbeddedPlusScte20DestinationSettingsProperty embeddedPlusScte20DestinationSettingsProperty =
 * EmbeddedPlusScte20DestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedplusscte20destinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.Builder =
        CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.builder()

    public fun build(): CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty =
        cdkBuilder.build()
}
