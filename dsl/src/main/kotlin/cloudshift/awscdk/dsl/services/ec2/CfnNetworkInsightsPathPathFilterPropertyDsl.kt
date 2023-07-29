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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath

/**
 * Describes a set of filters for a path analysis.
 *
 * Use path filters to scope the analysis when there can be multiple resulting paths.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PathFilterProperty pathFilterProperty = PathFilterProperty.builder()
 * .destinationAddress("destinationAddress")
 * .destinationPortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .sourceAddress("sourceAddress")
 * .sourcePortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsPathPathFilterPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsPath.PathFilterProperty.Builder =
        CfnNetworkInsightsPath.PathFilterProperty.builder()

    /** @param destinationAddress The destination IPv4 address. */
    public fun destinationAddress(destinationAddress: String) {
        cdkBuilder.destinationAddress(destinationAddress)
    }

    /** @param destinationPortRange The destination port range. */
    public fun destinationPortRange(destinationPortRange: IResolvable) {
        cdkBuilder.destinationPortRange(destinationPortRange)
    }

    /** @param destinationPortRange The destination port range. */
    public fun destinationPortRange(
        destinationPortRange: CfnNetworkInsightsPath.FilterPortRangeProperty
    ) {
        cdkBuilder.destinationPortRange(destinationPortRange)
    }

    /** @param sourceAddress The source IPv4 address. */
    public fun sourceAddress(sourceAddress: String) {
        cdkBuilder.sourceAddress(sourceAddress)
    }

    /** @param sourcePortRange The source port range. */
    public fun sourcePortRange(sourcePortRange: IResolvable) {
        cdkBuilder.sourcePortRange(sourcePortRange)
    }

    /** @param sourcePortRange The source port range. */
    public fun sourcePortRange(sourcePortRange: CfnNetworkInsightsPath.FilterPortRangeProperty) {
        cdkBuilder.sourcePortRange(sourcePortRange)
    }

    public fun build(): CfnNetworkInsightsPath.PathFilterProperty = cdkBuilder.build()
}
