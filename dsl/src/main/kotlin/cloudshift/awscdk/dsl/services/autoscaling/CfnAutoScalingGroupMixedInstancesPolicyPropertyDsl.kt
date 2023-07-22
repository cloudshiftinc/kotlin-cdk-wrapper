@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances
 * within a single Auto Scaling group.
 *
 * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch
 * instances and help optimize your costs. For more information, see [Auto Scaling groups with multiple
 * instance types and purchase
 * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * You can create a mixed instances policy for new and existing Auto Scaling groups. You must use a
 * launch template to configure the policy. You cannot use a launch configuration.
 *
 * There are key differences between Spot Instances and On-Demand Instances:
 *
 * * The price for Spot Instances varies based on demand
 * * Amazon EC2 can terminate an individual Spot Instance as the availability of, or price for, Spot
 * Instances changes
 *
 * When a Spot Instance is terminated, Amazon EC2 Auto Scaling group attempts to launch a
 * replacement instance to maintain the desired capacity for the group.
 *
 * `MixedInstancesPolicy` is a property of the
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MixedInstancesPolicyProperty mixedInstancesPolicyProperty =
 * MixedInstancesPolicyProperty.builder()
 * .launchTemplate(LaunchTemplateProperty.builder()
 * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * // the properties below are optional
 * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
 * .instanceRequirements(InstanceRequirementsProperty.builder()
 * .acceleratorCount(AcceleratorCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
 * .acceleratorNames(List.of("acceleratorNames"))
 * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorTypes(List.of("acceleratorTypes"))
 * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
 * .bareMetal("bareMetal")
 * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .burstablePerformance("burstablePerformance")
 * .cpuManufacturers(List.of("cpuManufacturers"))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .instanceGenerations(List.of("instanceGenerations"))
 * .localStorage("localStorage")
 * .localStorageTypes(List.of("localStorageTypes"))
 * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .memoryMiB(MemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .onDemandMaxPricePercentageOverLowestPrice(123)
 * .requireHibernateSupport(false)
 * .spotMaxPricePercentageOverLowestPrice(123)
 * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .vCpuCount(VCpuCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .build())
 * .instanceType("instanceType")
 * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .weightedCapacity("weightedCapacity")
 * .build()))
 * .build())
 * // the properties below are optional
 * .instancesDistribution(InstancesDistributionProperty.builder()
 * .onDemandAllocationStrategy("onDemandAllocationStrategy")
 * .onDemandBaseCapacity(123)
 * .onDemandPercentageAboveBaseCapacity(123)
 * .spotAllocationStrategy("spotAllocationStrategy")
 * .spotInstancePools(123)
 * .spotMaxPrice("spotMaxPrice")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html)
 */
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
