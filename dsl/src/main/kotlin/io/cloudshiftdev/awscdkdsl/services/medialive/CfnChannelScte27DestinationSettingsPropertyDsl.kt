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
 * Scte27DestinationSettingsProperty scte27DestinationSettingsProperty =
 * Scte27DestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27destinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelScte27DestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte27DestinationSettingsProperty.Builder =
        CfnChannel.Scte27DestinationSettingsProperty.builder()

    public fun build(): CfnChannel.Scte27DestinationSettingsProperty = cdkBuilder.build()
}
