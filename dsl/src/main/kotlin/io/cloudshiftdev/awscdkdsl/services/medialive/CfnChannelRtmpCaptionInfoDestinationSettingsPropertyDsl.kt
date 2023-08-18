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
 * The settings for RTMPCaptionInfo captions encode in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * RtmpCaptionInfoDestinationSettingsProperty rtmpCaptionInfoDestinationSettingsProperty =
 * RtmpCaptionInfoDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpcaptioninfodestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelRtmpCaptionInfoDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RtmpCaptionInfoDestinationSettingsProperty.Builder =
        CfnChannel.RtmpCaptionInfoDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.RtmpCaptionInfoDestinationSettingsProperty = cdkBuilder.build()
}
