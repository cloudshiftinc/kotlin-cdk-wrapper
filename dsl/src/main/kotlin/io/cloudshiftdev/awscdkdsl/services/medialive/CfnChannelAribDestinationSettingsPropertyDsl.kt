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
 * The configuration of ARIB captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AribDestinationSettingsProperty aribDestinationSettingsProperty =
 * AribDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelAribDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AribDestinationSettingsProperty.Builder =
        CfnChannel.AribDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.AribDestinationSettingsProperty = cdkBuilder.build()
}
