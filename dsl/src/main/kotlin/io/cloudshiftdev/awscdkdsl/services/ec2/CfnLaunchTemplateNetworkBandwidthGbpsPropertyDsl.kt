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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
 *
 * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
 * bandwidth. Amazon EC2 will identify instance types that support the specified minimum bandwidth,
 * but the actual bandwidth of your instance might go below the specified minimum at times. For more
 * information, see
 * [Available instance bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkBandwidthGbpsProperty networkBandwidthGbpsProperty =
 * NetworkBandwidthGbpsProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.NetworkBandwidthGbpsProperty.Builder =
        CfnLaunchTemplate.NetworkBandwidthGbpsProperty.builder()

    /**
     * @param max The maximum amount of network bandwidth, in Gbps. To specify no maximum limit,
     *   omit this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of network bandwidth, in Gbps. If this parameter is not
     *   specified, there is no minimum limit.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnLaunchTemplate.NetworkBandwidthGbpsProperty = cdkBuilder.build()
}
