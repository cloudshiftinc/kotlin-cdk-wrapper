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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The frame capture output settings.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FrameCaptureOutputSettingsProperty frameCaptureOutputSettingsProperty =
 * FrameCaptureOutputSettingsProperty.builder()
 * .nameModifier("nameModifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-framecaptureoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelFrameCaptureOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureOutputSettingsProperty.Builder =
        CfnChannel.FrameCaptureOutputSettingsProperty.builder()

    /**
     * @param nameModifier Required if the output group contains more than one output. This modifier
     *   forms part of the output file name.
     */
    public fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
    }

    public fun build(): CfnChannel.FrameCaptureOutputSettingsProperty = cdkBuilder.build()
}
