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
 * Passthrough applies no color space conversion to the output.
 *
 * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ColorSpacePassthroughSettingsProperty colorSpacePassthroughSettingsProperty =
 * ColorSpacePassthroughSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-colorspacepassthroughsettings.html)
 */
@CdkDslMarker
public class CfnChannelColorSpacePassthroughSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ColorSpacePassthroughSettingsProperty.Builder =
        CfnChannel.ColorSpacePassthroughSettingsProperty.builder()

    public fun build(): CfnChannel.ColorSpacePassthroughSettingsProperty = cdkBuilder.build()
}
