@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * `NetworkBandwidthGbpsRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup
 * LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum network bandwidth for an instance type, in
 * Gbps.
 *
 *
 * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
 * bandwidth. Amazon EC2 will identify instance types that support the specified minimum bandwidth, but
 * the actual bandwidth of your instance might go below the specified minimum at times. For more
 * information, see [Available instance
 * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
 * in the *Amazon EC2 User Guide for Linux Instances* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
 * NetworkBandwidthGbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.Builder =
      CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.builder()

  /**
   * @param max The maximum amount of network bandwidth, in gigabits per second (Gbps).
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of network bandwidth, in gigabits per second (Gbps).
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty = cdkBuilder.build()
}
