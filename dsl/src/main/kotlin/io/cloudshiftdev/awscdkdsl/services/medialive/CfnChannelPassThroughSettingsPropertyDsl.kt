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
 * PassThroughSettingsProperty passThroughSettingsProperty =
 * PassThroughSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-passthroughsettings.html)
 */
@CdkDslMarker
public class CfnChannelPassThroughSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.PassThroughSettingsProperty.Builder =
        CfnChannel.PassThroughSettingsProperty.builder()

    public fun build(): CfnChannel.PassThroughSettingsProperty = cdkBuilder.build()
}
