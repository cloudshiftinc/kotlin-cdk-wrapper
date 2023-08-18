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
 * The setup of SMPTE-TT captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * SmpteTtDestinationSettingsProperty smpteTtDestinationSettingsProperty =
 * SmpteTtDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-smptettdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelSmpteTtDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.SmpteTtDestinationSettingsProperty.Builder =
        CfnChannel.SmpteTtDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.SmpteTtDestinationSettingsProperty = cdkBuilder.build()
}
