@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder =
      CfnAutoScalingGroup.MixedInstancesPolicyProperty.builder()

  /**
   * @param instancesDistribution The instances distribution.
   */
  public fun instancesDistribution(instancesDistribution: IResolvable) {
    cdkBuilder.instancesDistribution(instancesDistribution)
  }

  /**
   * @param instancesDistribution The instances distribution.
   */
  public
      fun instancesDistribution(instancesDistribution: CfnAutoScalingGroup.InstancesDistributionProperty) {
    cdkBuilder.instancesDistribution(instancesDistribution)
  }

  /**
   * @param launchTemplate One or more launch templates and the instance types (overrides) that are
   * used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
   */
  public fun launchTemplate(launchTemplate: IResolvable) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  /**
   * @param launchTemplate One or more launch templates and the instance types (overrides) that are
   * used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
   */
  public fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateProperty) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun build(): CfnAutoScalingGroup.MixedInstancesPolicyProperty = cdkBuilder.build()
}
