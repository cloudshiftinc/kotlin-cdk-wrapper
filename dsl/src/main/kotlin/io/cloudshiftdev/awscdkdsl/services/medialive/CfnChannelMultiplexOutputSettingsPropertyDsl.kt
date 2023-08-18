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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Configuration of a Multiplex output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexOutputSettingsProperty multiplexOutputSettingsProperty =
 * MultiplexOutputSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelMultiplexOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MultiplexOutputSettingsProperty.Builder =
        CfnChannel.MultiplexOutputSettingsProperty.builder()

    /** @param destination Destination is a Multiplex. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination Destination is a Multiplex. */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnChannel.MultiplexOutputSettingsProperty = cdkBuilder.build()
}
