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
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * Transport stream service descriptor configuration for the Multiplex program.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexProgramServiceDescriptorProperty multiplexProgramServiceDescriptorProperty =
 * MultiplexProgramServiceDescriptorProperty.builder()
 * .providerName("providerName")
 * .serviceName("serviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramservicedescriptor.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexProgramServiceDescriptorPropertyDsl {
    private val cdkBuilder: CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.Builder =
        CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.builder()

    /** @param providerName Name of the provider. */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /** @param serviceName Name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty =
        cdkBuilder.build()
}
