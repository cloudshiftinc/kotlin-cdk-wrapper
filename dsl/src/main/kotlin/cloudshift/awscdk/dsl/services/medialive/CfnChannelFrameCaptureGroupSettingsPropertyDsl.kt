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
 * The settings for a frame capture output group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureGroupSettingsProperty frameCaptureGroupSettingsProperty =
 * FrameCaptureGroupSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .frameCaptureCdnSettings(FrameCaptureCdnSettingsProperty.builder()
 * .frameCaptureS3Settings(FrameCaptureS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturegroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureGroupSettingsProperty.Builder =
        CfnChannel.FrameCaptureGroupSettingsProperty.builder()

    /**
     * @param destination The destination for the frame capture files. The destination is either the
     *   URI for an Amazon S3 bucket and object, plus a file name prefix (for example,
     *   s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     *   plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_).
     *   The final file names consist of the prefix from the destination field (for example,
     *   "curling_") + name modifier + the counter (5 digits, starting from 00001) + extension
     *   (which is always .jpg). For example, curlingLow.00001.jpg.
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination The destination for the frame capture files. The destination is either the
     *   URI for an Amazon S3 bucket and object, plus a file name prefix (for example,
     *   s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     *   plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_).
     *   The final file names consist of the prefix from the destination field (for example,
     *   "curling_") + name modifier + the counter (5 digits, starting from 00001) + extension
     *   (which is always .jpg). For example, curlingLow.00001.jpg.
     */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param frameCaptureCdnSettings Settings to configure the destination of a Frame Capture
     *   output.
     */
    public fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings)
    }

    /**
     * @param frameCaptureCdnSettings Settings to configure the destination of a Frame Capture
     *   output.
     */
    public fun frameCaptureCdnSettings(
        frameCaptureCdnSettings: CfnChannel.FrameCaptureCdnSettingsProperty
    ) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings)
    }

    public fun build(): CfnChannel.FrameCaptureGroupSettingsProperty = cdkBuilder.build()
}
