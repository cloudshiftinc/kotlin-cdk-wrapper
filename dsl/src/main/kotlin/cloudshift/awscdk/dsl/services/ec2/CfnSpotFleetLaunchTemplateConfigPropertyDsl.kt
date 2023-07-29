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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Specifies a launch template and overrides.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LaunchTemplateConfigProperty launchTemplateConfigProperty =
 * LaunchTemplateConfigProperty.builder()
 * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
 * .availabilityZone("availabilityZone")
 * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
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
 * .vCpuCount(VCpuCountRangeRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .build())
 * .instanceType("instanceType")
 * .priority(123)
 * .spotPrice("spotPrice")
 * .subnetId("subnetId")
 * .weightedCapacity(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
 */
@CdkDslMarker
public class CfnSpotFleetLaunchTemplateConfigPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.LaunchTemplateConfigProperty.Builder =
        CfnSpotFleet.LaunchTemplateConfigProperty.builder()

    private val _overrides: MutableList<Any> = mutableListOf()

    /**
     * @param launchTemplateSpecification The launch template to use. Make sure that the launch
     *   template does not contain the `NetworkInterfaceId` parameter because you can't specify a
     *   network interface ID in a Spot Fleet.
     */
    public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
    }

    /**
     * @param launchTemplateSpecification The launch template to use. Make sure that the launch
     *   template does not contain the `NetworkInterfaceId` parameter because you can't specify a
     *   network interface ID in a Spot Fleet.
     */
    public fun launchTemplateSpecification(
        launchTemplateSpecification: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
    ) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
    }

    /**
     * @param overrides Any parameters that you specify override the same parameters in the launch
     *   template.
     */
    public fun overrides(vararg overrides: Any) {
        _overrides.addAll(listOf(*overrides))
    }

    /**
     * @param overrides Any parameters that you specify override the same parameters in the launch
     *   template.
     */
    public fun overrides(overrides: Collection<Any>) {
        _overrides.addAll(overrides)
    }

    /**
     * @param overrides Any parameters that you specify override the same parameters in the launch
     *   template.
     */
    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    public fun build(): CfnSpotFleet.LaunchTemplateConfigProperty {
        if (_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
        return cdkBuilder.build()
    }
}
