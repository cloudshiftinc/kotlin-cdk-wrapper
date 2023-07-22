@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

/**
 * The details of the Auto Scaling group for the capacity provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AutoScalingGroupProviderProperty autoScalingGroupProviderProperty =
 * AutoScalingGroupProviderProperty.builder()
 * .autoScalingGroupArn("autoScalingGroupArn")
 * // the properties below are optional
 * .managedScaling(ManagedScalingProperty.builder()
 * .instanceWarmupPeriod(123)
 * .maximumScalingStepSize(123)
 * .minimumScalingStepSize(123)
 * .status("status")
 * .targetCapacity(123)
 * .build())
 * .managedTerminationProtection("managedTerminationProtection")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html)
 */
@CdkDslMarker
public class CfnCapacityProviderAutoScalingGroupProviderPropertyDsl {
  private val cdkBuilder: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder =
      CfnCapacityProvider.AutoScalingGroupProviderProperty.builder()

  /**
   * @param autoScalingGroupArn The Amazon Resource Name (ARN) that identifies the Auto Scaling
   * group. 
   */
  public fun autoScalingGroupArn(autoScalingGroupArn: String) {
    cdkBuilder.autoScalingGroupArn(autoScalingGroupArn)
  }

  /**
   * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
   * provider.
   */
  public fun managedScaling(managedScaling: IResolvable) {
    cdkBuilder.managedScaling(managedScaling)
  }

  /**
   * @param managedScaling The managed scaling settings for the Auto Scaling group capacity
   * provider.
   */
  public fun managedScaling(managedScaling: CfnCapacityProvider.ManagedScalingProperty) {
    cdkBuilder.managedScaling(managedScaling)
  }

  /**
   * @param managedTerminationProtection The managed termination protection setting to use for the
   * Auto Scaling group capacity provider.
   * This determines whether the Auto Scaling group has managed termination protection. The default
   * is off.
   *
   *
   * When using managed termination protection, managed scaling must also be used otherwise managed
   * termination protection doesn't work.
   *
   *
   * When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in an
   * Auto Scaling group that contain tasks from being terminated during a scale-in action. The Auto
   * Scaling group and each instance in the Auto Scaling group must have instance protection from
   * scale-in actions on as well. For more information, see [Instance
   * Protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)
   * in the *AWS Auto Scaling User Guide* .
   *
   * When managed termination protection is off, your Amazon EC2 instances aren't protected from
   * termination when the Auto Scaling group scales in.
   */
  public fun managedTerminationProtection(managedTerminationProtection: String) {
    cdkBuilder.managedTerminationProtection(managedTerminationProtection)
  }

  public fun build(): CfnCapacityProvider.AutoScalingGroupProviderProperty = cdkBuilder.build()
}
