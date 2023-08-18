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
 * The settings for a Teletext captions output encode.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * TeletextDestinationSettingsProperty teletextDestinationSettingsProperty =
 * TeletextDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelTeletextDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.TeletextDestinationSettingsProperty.Builder =
        CfnChannel.TeletextDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.TeletextDestinationSettingsProperty = cdkBuilder.build()
}
