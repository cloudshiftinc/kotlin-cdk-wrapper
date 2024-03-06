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
