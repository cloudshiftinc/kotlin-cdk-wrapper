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
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * The minimum and maximum amount of baseline network bandwidth, in gigabits per second (Gbps).
 *
 * For more information, see
 * [Amazon EC2 instance network bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Default: No minimum or maximum limits
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
 * NetworkBandwidthGbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetNetworkBandwidthGbpsRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.Builder =
        CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.builder()

    /**
     * @param max The maximum amount of network bandwidth, in Gbps. To specify no maximum limit,
     *   omit this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of network bandwidth, in Gbps. To specify no minimum limit,
     *   omit this parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.NetworkBandwidthGbpsRequestProperty = cdkBuilder.build()
}
