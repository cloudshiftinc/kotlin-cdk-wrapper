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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure the destination of a Frame Capture output.
 *
 * The parent of this entity is FrameCaptureGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureCdnSettingsProperty frameCaptureCdnSettingsProperty =
 * FrameCaptureCdnSettingsProperty.builder()
 * .frameCaptureS3Settings(FrameCaptureS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturecdnsettings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureCdnSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureCdnSettingsProperty.Builder =
        CfnChannel.FrameCaptureCdnSettingsProperty.builder()

    /**
     * @param frameCaptureS3Settings Sets up Amazon S3 as the destination for this Frame Capture
     *   output.
     */
    public fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings)
    }

    /**
     * @param frameCaptureS3Settings Sets up Amazon S3 as the destination for this Frame Capture
     *   output.
     */
    public fun frameCaptureS3Settings(
        frameCaptureS3Settings: CfnChannel.FrameCaptureS3SettingsProperty
    ) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings)
    }

    public fun build(): CfnChannel.FrameCaptureCdnSettingsProperty = cdkBuilder.build()
}
