@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterInstanceFleetConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstanceFleetConfigProperty.Builder =
      EmrCreateCluster.InstanceFleetConfigProperty.builder()

  private val _instanceTypeConfigs: MutableList<EmrCreateCluster.InstanceTypeConfigProperty> =
      mutableListOf()

  /**
   * @param instanceFleetType The node type that the instance fleet hosts. 
   * Valid values are MASTER,CORE,and TASK.
   */
  public fun instanceFleetType(instanceFleetType: EmrCreateCluster.InstanceRoleType) {
    cdkBuilder.instanceFleetType(instanceFleetType)
  }

  /**
   * @param instanceTypeConfigs The instance type configurations that define the EC2 instances in
   * the instance fleet.
   */
  public
      fun instanceTypeConfigs(instanceTypeConfigs: EmrCreateClusterInstanceTypeConfigPropertyDsl.() -> Unit) {
    _instanceTypeConfigs.add(EmrCreateClusterInstanceTypeConfigPropertyDsl().apply(instanceTypeConfigs).build())
  }

  /**
   * @param instanceTypeConfigs The instance type configurations that define the EC2 instances in
   * the instance fleet.
   */
  public
      fun instanceTypeConfigs(instanceTypeConfigs: Collection<EmrCreateCluster.InstanceTypeConfigProperty>) {
    _instanceTypeConfigs.addAll(instanceTypeConfigs)
  }

  /**
   * @param launchSpecifications The launch specification for the instance fleet.
   */
  public
      fun launchSpecifications(launchSpecifications: EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
    builder.apply(launchSpecifications)
    cdkBuilder.launchSpecifications(builder.build())
  }

  /**
   * @param launchSpecifications The launch specification for the instance fleet.
   */
  public
      fun launchSpecifications(launchSpecifications: EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty) {
    cdkBuilder.launchSpecifications(launchSpecifications)
  }

  /**
   * @param name The friendly name of the instance fleet.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
   * which determines how many On-Demand instances to provision.
   */
  public fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
    cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
  }

  /**
   * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
   * determines how many Spot instances to provision.
   */
  public fun targetSpotCapacity(targetSpotCapacity: Number) {
    cdkBuilder.targetSpotCapacity(targetSpotCapacity)
  }

  public fun build(): EmrCreateCluster.InstanceFleetConfigProperty {
    if(_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
    return cdkBuilder.build()
  }
}
