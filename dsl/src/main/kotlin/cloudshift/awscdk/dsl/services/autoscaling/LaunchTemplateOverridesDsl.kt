@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.InstanceType

/**
 * LaunchTemplateOverrides is a subproperty of LaunchTemplate that describes an override for a
 * launch template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceType instanceType;
 * LaunchTemplate launchTemplate;
 * LaunchTemplateOverrides launchTemplateOverrides = LaunchTemplateOverrides.builder()
 * .instanceType(instanceType)
 * // the properties below are optional
 * .launchTemplate(launchTemplate)
 * .weightedCapacity(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LaunchTemplateOverridesDsl {
  private val cdkBuilder: LaunchTemplateOverrides.Builder = LaunchTemplateOverrides.builder()

  /**
   * @param instanceType The instance type, such as m3.xlarge. You must use an instance type that is
   * supported in your requested Region and Availability Zones. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param launchTemplate Provides the launch template to be used when launching the instance type.
   * For example, some instance types might
   * require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses
   * the launch template
   * that's defined for your mixed instances policy.
   */
  public fun launchTemplate(launchTemplate: ILaunchTemplate) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  /**
   * @param weightedCapacity The number of capacity units provided by the specified instance type in
   * terms of virtual CPUs, memory, storage, throughput, or other relative performance characteristic.
   * When a Spot or On-Demand Instance is provisioned, the
   * capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances
   * until the desired
   * capacity is totally fulfilled, even if this results in an overage. Value must be in the range
   * of 1 to 999.
   *
   * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling
   * can only provision
   * an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the desired
   * capacity is exceeded
   * by 3 units.
   */
  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): LaunchTemplateOverrides = cdkBuilder.build()
}
