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
 * DolbyVision81SettingsProperty dolbyVision81SettingsProperty =
 * DolbyVision81SettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dolbyvision81settings.html)
 */
@CdkDslMarker
public class CfnChannelDolbyVision81SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DolbyVision81SettingsProperty.Builder =
        CfnChannel.DolbyVision81SettingsProperty.builder()

    public fun build(): CfnChannel.DolbyVision81SettingsProperty = cdkBuilder.build()
}
