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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The frame capture settings.
 *
 * The parent of this entity is VideoCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureSettingsProperty frameCaptureSettingsProperty =
 * FrameCaptureSettingsProperty.builder()
 * .captureInterval(123)
 * .captureIntervalUnits("captureIntervalUnits")
 * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecapturesettings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureSettingsProperty.Builder =
        CfnChannel.FrameCaptureSettingsProperty.builder()

    /**
     * @param captureInterval The frequency, in seconds, for capturing frames for inclusion in the
     *   output. For example, "10" means capture a frame every 10 seconds.
     */
    public fun captureInterval(captureInterval: Number) {
        cdkBuilder.captureInterval(captureInterval)
    }

    /** @param captureIntervalUnits Unit for the frame capture interval. */
    public fun captureIntervalUnits(captureIntervalUnits: String) {
        cdkBuilder.captureIntervalUnits(captureIntervalUnits)
    }

    /** @param timecodeBurninSettings the value to be set. */
    public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    /** @param timecodeBurninSettings the value to be set. */
    public fun timecodeBurninSettings(
        timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty
    ) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    public fun build(): CfnChannel.FrameCaptureSettingsProperty = cdkBuilder.build()
}
