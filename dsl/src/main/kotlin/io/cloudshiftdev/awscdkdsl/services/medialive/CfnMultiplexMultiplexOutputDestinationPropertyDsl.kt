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
import software.amazon.awscdk.services.medialive.CfnMultiplex

/**
 * Multiplex output destination settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexOutputDestinationProperty multiplexOutputDestinationProperty =
 * MultiplexOutputDestinationProperty.builder()
 * .multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
 * .entitlementArn("entitlementArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexoutputdestination.html)
 */
@CdkDslMarker
public class CfnMultiplexMultiplexOutputDestinationPropertyDsl {
    private val cdkBuilder: CfnMultiplex.MultiplexOutputDestinationProperty.Builder =
        CfnMultiplex.MultiplexOutputDestinationProperty.builder()

    /**
     * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
     *   destination settings.
     */
    public fun multiplexMediaConnectOutputDestinationSettings(
        multiplexMediaConnectOutputDestinationSettings: IResolvable
    ) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(
            multiplexMediaConnectOutputDestinationSettings
        )
    }

    /**
     * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
     *   destination settings.
     */
    public fun multiplexMediaConnectOutputDestinationSettings(
        multiplexMediaConnectOutputDestinationSettings:
            CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
    ) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(
            multiplexMediaConnectOutputDestinationSettings
        )
    }

    public fun build(): CfnMultiplex.MultiplexOutputDestinationProperty = cdkBuilder.build()
}
