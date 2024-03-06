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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnMultiplex

/**
 * Multiplex MediaConnect output destination settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexMediaConnectOutputDestinationSettingsProperty
 * multiplexMediaConnectOutputDestinationSettingsProperty =
 * MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
 * .entitlementArn("entitlementArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings.html)
 */
@CdkDslMarker
public class CfnMultiplexMultiplexMediaConnectOutputDestinationSettingsPropertyDsl {
    private val cdkBuilder:
        CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.Builder =
        CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.builder()

    /** @param entitlementArn The MediaConnect entitlement ARN available as a Flow source. */
    public fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
    }

    public fun build(): CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty =
        cdkBuilder.build()
}
