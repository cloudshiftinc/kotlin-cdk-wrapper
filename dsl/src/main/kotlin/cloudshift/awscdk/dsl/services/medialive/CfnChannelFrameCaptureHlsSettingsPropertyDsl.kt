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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for a frame capture output in an HLS output group.
 *
 * The parent of this entity is HlsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureHlsSettingsProperty frameCaptureHlsSettingsProperty =
 * FrameCaptureHlsSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturehlssettings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureHlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureHlsSettingsProperty.Builder =
        CfnChannel.FrameCaptureHlsSettingsProperty.builder()

    public fun build(): CfnChannel.FrameCaptureHlsSettingsProperty = cdkBuilder.build()
}
