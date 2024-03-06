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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.InstanceType

/**
 * LaunchTemplateOverrides is a subproperty of LaunchTemplate that describes an override for a
 * launch template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceType instanceType;
 * LaunchTemplate launchTemplate;
 * LaunchTemplateOverrides launchTemplateOverrides = LaunchTemplateOverrides.builder()
 * .instanceRequirements(InstanceRequirementsProperty.builder()
 * .memoryMiB(MemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .vCpuCount(VCpuCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * // the properties below are optional
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
 * .maxSpotPriceAsPercentageOfOptimalOnDemandPrice(123)
 * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
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
 * .build())
 * .instanceType(instanceType)
 * .launchTemplate(launchTemplate)
 * .weightedCapacity(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LaunchTemplateOverridesDsl {
    private val cdkBuilder: LaunchTemplateOverrides.Builder = LaunchTemplateOverrides.builder()

    /**
     * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
     *   specified requirements to identify instance types. Then, it uses your On-Demand and Spot
     *   allocation strategies to launch instances from these instance types.
     *
     * You can specify up to four separate sets of instance requirements per Auto Scaling group.
     * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
     * same Auto Scaling group. To do this, create the AMIs and create a new launch template for
     * each AMI. Then, create a compatible set of instance requirements for each launch template.
     *
     * You must specify one of instanceRequirements or instanceType.
     */
    public fun instanceRequirements(
        instanceRequirements: CfnAutoScalingGroupInstanceRequirementsPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnAutoScalingGroupInstanceRequirementsPropertyDsl()
        builder.apply(instanceRequirements)
        cdkBuilder.instanceRequirements(builder.build())
    }

    /**
     * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
     *   specified requirements to identify instance types. Then, it uses your On-Demand and Spot
     *   allocation strategies to launch instances from these instance types.
     *
     * You can specify up to four separate sets of instance requirements per Auto Scaling group.
     * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
     * same Auto Scaling group. To do this, create the AMIs and create a new launch template for
     * each AMI. Then, create a compatible set of instance requirements for each launch template.
     *
     * You must specify one of instanceRequirements or instanceType.
     */
    public fun instanceRequirements(
        instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty
    ) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    /**
     * @param instanceType The instance type, such as m3.xlarge. You must use an instance type that
     *   is supported in your requested Region and Availability Zones. You must specify one of
     *   instanceRequirements or instanceType.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param launchTemplate Provides the launch template to be used when launching the instance
     *   type. For example, some instance types might require a launch template with a different
     *   AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template that's defined for
     *   your mixed instances policy.
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param weightedCapacity The number of capacity units provided by the specified instance type
     *   in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     *   characteristic. When a Spot or On-Demand Instance is provisioned, the capacity units count
     *   toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired
     *   capacity is totally fulfilled, even if this results in an overage. Value must be in the
     *   range of 1 to 999.
     *
     * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling
     * can only provision an instance with a WeightedCapacity of 5 units, the instance is
     * provisioned, and the desired capacity is exceeded by 3 units.
     */
    public fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): LaunchTemplateOverrides = cdkBuilder.build()
}
