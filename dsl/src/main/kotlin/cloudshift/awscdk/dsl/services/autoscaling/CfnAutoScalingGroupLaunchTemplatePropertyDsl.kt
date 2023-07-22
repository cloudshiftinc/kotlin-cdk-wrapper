@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * Use this structure to specify the launch templates and instance types (overrides) for a mixed
 * instances policy.
 *
 * `LaunchTemplate` is a property of the [AWS::AutoScaling::AutoScalingGroup
 * MixedInstancesPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * LaunchTemplateProperty launchTemplateProperty = LaunchTemplateProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplatePropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateProperty.Builder =
      CfnAutoScalingGroup.LaunchTemplateProperty.builder()

  private val _overrides: MutableList<Any> = mutableListOf()

  /**
   * @param launchTemplateSpecification The launch template. 
   */
  public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param launchTemplateSpecification The launch template. 
   */
  public
      fun launchTemplateSpecification(launchTemplateSpecification: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param overrides Any properties that you specify override the same properties in the launch
   * template.
   */
  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  /**
   * @param overrides Any properties that you specify override the same properties in the launch
   * template.
   */
  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  /**
   * @param overrides Any properties that you specify override the same properties in the launch
   * template.
   */
  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  public fun build(): CfnAutoScalingGroup.LaunchTemplateProperty {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    return cdkBuilder.build()
  }
}
