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
 * The configuration of SCTE-20 plus embedded captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Scte20PlusEmbeddedDestinationSettingsProperty scte20PlusEmbeddedDestinationSettingsProperty =
 * Scte20PlusEmbeddedDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20plusembeddeddestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.Builder =
        CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty =
        cdkBuilder.build()
}
