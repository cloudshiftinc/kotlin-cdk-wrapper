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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * Use `InstanceFleetConfig` to define instance fleets for an EMR cluster.
 *
 * A cluster can not use both instance fleets and instance groups. For more information, see
 * [Configure Instance Fleets](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
 * excluding 5.0.x versions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ConfigurationProperty configurationProperty_;
 * InstanceFleetConfigProperty instanceFleetConfigProperty = InstanceFleetConfigProperty.builder()
 * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .bidPrice("bidPrice")
 * .bidPriceAsPercentageOfOnDemandPrice(123)
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .weightedCapacity(123)
 * .build()))
 * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
 * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build())
 * .build())
 * .name("name")
 * .targetOnDemandCapacity(123)
 * .targetSpotCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html)
 */
@CdkDslMarker
public class CfnClusterInstanceFleetConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.InstanceFleetConfigProperty.Builder =
        CfnCluster.InstanceFleetConfigProperty.builder()

    private val _instanceTypeConfigs: MutableList<Any> = mutableListOf()

    /**
     * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
     *   instances in the instance fleet.
     */
    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any) {
        _instanceTypeConfigs.addAll(listOf(*instanceTypeConfigs))
    }

    /**
     * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
     *   instances in the instance fleet.
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: Collection<Any>) {
        _instanceTypeConfigs.addAll(instanceTypeConfigs)
    }

    /**
     * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
     *   instances in the instance fleet.
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
    }

    /** @param launchSpecifications The launch specification for the instance fleet. */
    public fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications)
    }

    /** @param launchSpecifications The launch specification for the instance fleet. */
    public fun launchSpecifications(
        launchSpecifications: CfnCluster.InstanceFleetProvisioningSpecificationsProperty
    ) {
        cdkBuilder.launchSpecifications(launchSpecifications)
    }

    /** @param name The friendly name of the instance fleet. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
     *   which determines how many On-Demand instances to provision. When the instance fleet
     *   launches, Amazon EMR tries to provision On-Demand instances as specified by
     *   `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` .
     *   When an On-Demand instance is provisioned, the `WeightedCapacity` units count toward the
     *   target capacity. Amazon EMR provisions instances until the target capacity is totally
     *   fulfilled, even if this results in an overage. For example, if there are 2 units remaining
     *   to fulfill capacity, and Amazon EMR can only provision an instance with a
     *   `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is
     *   exceeded by 3 units.
     *
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
     * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and
     * `TargetOnDemandCapacity` should be greater than 0. For a master instance fleet, only one of
     * `TargetSpotCapacity` and `TargetOnDemandCapacity` can be specified, and its value must be 1.
     */
    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    /**
     * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
     *   determines how many Spot instances to provision. When the instance fleet launches, Amazon
     *   EMR tries to provision Spot instances as specified by `InstanceTypeConfig` . Each instance
     *   configuration has a specified `WeightedCapacity` . When a Spot instance is provisioned, the
     *   `WeightedCapacity` units count toward the target capacity. Amazon EMR provisions instances
     *   until the target capacity is totally fulfilled, even if this results in an overage. For
     *   example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only
     *   provision an instance with a `WeightedCapacity` of 5 units, the instance is provisioned,
     *   and the target capacity is exceeded by 3 units.
     *
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance
     * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater
     * than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
     * `TargetOnDemandCapacity` can be specified, and its value must be 1.
     */
    public fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): CfnCluster.InstanceFleetConfigProperty {
        if (_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
        return cdkBuilder.build()
    }
}
