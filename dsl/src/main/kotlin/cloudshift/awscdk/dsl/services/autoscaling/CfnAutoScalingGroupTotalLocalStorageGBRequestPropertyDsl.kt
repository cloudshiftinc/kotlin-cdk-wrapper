@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * `TotalLocalStorageGBRequest` is a property of the `InstanceRequirements` property of the
 * [AWS::AutoScaling::AutoScalingGroup
 * LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property type that describes the minimum and maximum total local storage size for an instance type,
 * in GB.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
 * TotalLocalStorageGBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder =
      CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.builder()

  /**
   * @param max The storage maximum in GB.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The storage minimum in GB.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
