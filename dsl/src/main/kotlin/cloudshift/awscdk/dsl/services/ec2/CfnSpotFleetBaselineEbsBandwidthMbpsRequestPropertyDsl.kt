@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
 *
 * For more information, see [Amazon EBS–optimized
 * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the *Amazon
 * EC2 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
 * BaselineEbsBandwidthMbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetBaselineEbsBandwidthMbpsRequestPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.Builder =
      CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

  /**
   * @param max The maximum baseline bandwidth, in Mbps.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum baseline bandwidth, in Mbps.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty = cdkBuilder.build()
}
