@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.constructs.Construct

/**
 * Use `InstanceFleetConfig` to define instance fleets for an EMR cluster.
 *
 * A cluster can not use both instance fleets and instance groups. For more information, see
 * [Configure Instance
 * Fleets](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 *
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
 * excluding 5.0.x versions. &gt; You can currently only add a task instance fleet to a cluster with
 * this resource. If you use this resource, CloudFormation waits for the cluster launch to complete
 * before adding the task instance fleet to the cluster. In order to add a task instance fleet to the
 * cluster as part of the cluster launch and minimize delays in provisioning task nodes, use the
 * `TaskInstanceFleets` subproperty for the [AWS::EMR::Cluster
 * JobFlowInstancesConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
 * property instead. To use this subproperty, see
 * [AWS::EMR::Cluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 * for examples.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ConfigurationProperty configurationProperty_;
 * CfnInstanceFleetConfig cfnInstanceFleetConfig = CfnInstanceFleetConfig.Builder.create(this,
 * "MyCfnInstanceFleetConfig")
 * .clusterId("clusterId")
 * .instanceFleetType("instanceFleetType")
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html)
 */
@CdkDslMarker
public class CfnInstanceFleetConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstanceFleetConfig.Builder =
      CfnInstanceFleetConfig.Builder.create(scope, id)

  private val _instanceTypeConfigs: MutableList<Any> = mutableListOf()

  /**
   * The unique identifier of the EMR cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-clusterid)
   * @param clusterId The unique identifier of the EMR cluster. 
   */
  public fun clusterId(clusterId: String) {
    cdkBuilder.clusterId(clusterId)
  }

  /**
   * The node type that the instance fleet hosts.
   *
   * *Allowed Values* : TASK
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancefleettype)
   * @param instanceFleetType The node type that the instance fleet hosts. 
   */
  public fun instanceFleetType(instanceFleetType: String) {
    cdkBuilder.instanceFleetType(instanceFleetType)
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
   * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
   * attempts to provision to fulfill On-Demand and Spot target capacities. 
   */
  public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any) {
    _instanceTypeConfigs.addAll(listOf(*instanceTypeConfigs))
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
   * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
   * attempts to provision to fulfill On-Demand and Spot target capacities. 
   */
  public fun instanceTypeConfigs(instanceTypeConfigs: Collection<Any>) {
    _instanceTypeConfigs.addAll(instanceTypeConfigs)
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
   * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
   * attempts to provision to fulfill On-Demand and Spot target capacities. 
   */
  public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
    cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
  }

  /**
   * The launch specification for the instance fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
   * @param launchSpecifications The launch specification for the instance fleet. 
   */
  public fun launchSpecifications(launchSpecifications: IResolvable) {
    cdkBuilder.launchSpecifications(launchSpecifications)
  }

  /**
   * The launch specification for the instance fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
   * @param launchSpecifications The launch specification for the instance fleet. 
   */
  public
      fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty) {
    cdkBuilder.launchSpecifications(launchSpecifications)
  }

  /**
   * The friendly name of the instance fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-name)
   * @param name The friendly name of the instance fleet. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The target capacity of On-Demand units for the instance fleet, which determines how many
   * On-Demand instances to provision.
   *
   * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
   * specified by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity`
   * . When an On-Demand instance is provisioned, the `WeightedCapacity` units count toward the target
   * capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if
   * this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and
   * Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
   * provisioned, and the target capacity is exceeded by 3 units.
   *
   *
   * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
   * `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be
   * greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
   * `TargetOnDemandCapacity` can be specified, and its value must be 1.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetondemandcapacity)
   * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
   * which determines how many On-Demand instances to provision. 
   */
  public fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
    cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
  }

  /**
   * The target capacity of Spot units for the instance fleet, which determines how many Spot
   * instances to provision.
   *
   * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
   * `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` . When a
   * Spot instance is provisioned, the `WeightedCapacity` units count toward the target capacity.
   * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
   * results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon
   * EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
   * provisioned, and the target capacity is exceeded by 3 units.
   *
   *
   * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet.
   * At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater than 0. For a
   * master instance fleet, only one of `TargetSpotCapacity` and `TargetOnDemandCapacity` can be
   * specified, and its value must be 1.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetspotcapacity)
   * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
   * determines how many Spot instances to provision. 
   */
  public fun targetSpotCapacity(targetSpotCapacity: Number) {
    cdkBuilder.targetSpotCapacity(targetSpotCapacity)
  }

  public fun build(): CfnInstanceFleetConfig {
    if(_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
    return cdkBuilder.build()
  }
}
