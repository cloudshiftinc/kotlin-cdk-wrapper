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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * A single port range specification.
 *
 * This is used for source and destination port ranges in the stateless rule
 * [MatchAttributes](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
 * , `SourcePorts` , and `DestinationPorts` settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationPortRangePropertyDsl {
    private val cdkBuilder: CfnTLSInspectionConfiguration.PortRangeProperty.Builder =
        CfnTLSInspectionConfiguration.PortRangeProperty.builder()

    /**
     * @param fromPort The lower limit of the port range. This must be less than or equal to the
     *   `ToPort` specification.
     */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param toPort The upper limit of the port range. This must be greater than or equal to the
     *   `FromPort` specification.
     */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnTLSInspectionConfiguration.PortRangeProperty = cdkBuilder.build()
}
