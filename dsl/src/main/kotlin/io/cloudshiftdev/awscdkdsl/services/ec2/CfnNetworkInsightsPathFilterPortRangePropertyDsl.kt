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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath

/**
 * Describes a port range.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * FilterPortRangeProperty filterPortRangeProperty = FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsPathFilterPortRangePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsPath.FilterPortRangeProperty.Builder =
        CfnNetworkInsightsPath.FilterPortRangeProperty.builder()

    /** @param fromPort The first port in the range. */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /** @param toPort The last port in the range. */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnNetworkInsightsPath.FilterPortRangeProperty = cdkBuilder.build()
}
