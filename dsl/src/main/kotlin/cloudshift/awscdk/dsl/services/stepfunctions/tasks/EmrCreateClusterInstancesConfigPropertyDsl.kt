@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterInstancesConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstancesConfigProperty.Builder =
      EmrCreateCluster.InstancesConfigProperty.builder()

  private val _additionalMasterSecurityGroups: MutableList<String> = mutableListOf()

  private val _additionalSlaveSecurityGroups: MutableList<String> = mutableListOf()

  private val _ec2SubnetIds: MutableList<String> = mutableListOf()

  private val _instanceFleets: MutableList<EmrCreateCluster.InstanceFleetConfigProperty> =
      mutableListOf()

  private val _instanceGroups: MutableList<EmrCreateCluster.InstanceGroupConfigProperty> =
      mutableListOf()

  public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String) {
    _additionalMasterSecurityGroups.addAll(listOf(*additionalMasterSecurityGroups))
  }

  public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: Collection<String>) {
    _additionalMasterSecurityGroups.addAll(additionalMasterSecurityGroups)
  }

  public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String) {
    _additionalSlaveSecurityGroups.addAll(listOf(*additionalSlaveSecurityGroups))
  }

  public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: Collection<String>) {
    _additionalSlaveSecurityGroups.addAll(additionalSlaveSecurityGroups)
  }

  public fun ec2KeyName(ec2KeyName: String) {
    cdkBuilder.ec2KeyName(ec2KeyName)
  }

  public fun ec2SubnetId(ec2SubnetId: String) {
    cdkBuilder.ec2SubnetId(ec2SubnetId)
  }

  public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
    _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
  }

  public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
    _ec2SubnetIds.addAll(ec2SubnetIds)
  }

  public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
    cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
  }

  public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
    cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
  }

  public fun hadoopVersion(hadoopVersion: String) {
    cdkBuilder.hadoopVersion(hadoopVersion)
  }

  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  public
      fun instanceFleets(instanceFleets: EmrCreateClusterInstanceFleetConfigPropertyDsl.() -> Unit) {
    _instanceFleets.add(EmrCreateClusterInstanceFleetConfigPropertyDsl().apply(instanceFleets).build())
  }

  public
      fun instanceFleets(instanceFleets: Collection<EmrCreateCluster.InstanceFleetConfigProperty>) {
    _instanceFleets.addAll(instanceFleets)
  }

  public
      fun instanceGroups(instanceGroups: EmrCreateClusterInstanceGroupConfigPropertyDsl.() -> Unit) {
    _instanceGroups.add(EmrCreateClusterInstanceGroupConfigPropertyDsl().apply(instanceGroups).build())
  }

  public
      fun instanceGroups(instanceGroups: Collection<EmrCreateCluster.InstanceGroupConfigProperty>) {
    _instanceGroups.addAll(instanceGroups)
  }

  public fun masterInstanceType(masterInstanceType: String) {
    cdkBuilder.masterInstanceType(masterInstanceType)
  }

  public fun placement(block: EmrCreateClusterPlacementTypePropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterPlacementTypePropertyDsl()
    builder.apply(block)
    cdkBuilder.placement(builder.build())
  }

  public fun placement(placement: EmrCreateCluster.PlacementTypeProperty) {
    cdkBuilder.placement(placement)
  }

  public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
    cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
  }

  public fun slaveInstanceType(slaveInstanceType: String) {
    cdkBuilder.slaveInstanceType(slaveInstanceType)
  }

  public fun terminationProtected(terminationProtected: Boolean) {
    cdkBuilder.terminationProtected(terminationProtected)
  }

  public fun build(): EmrCreateCluster.InstancesConfigProperty {
    if(_additionalMasterSecurityGroups.isNotEmpty())
        cdkBuilder.additionalMasterSecurityGroups(_additionalMasterSecurityGroups)
    if(_additionalSlaveSecurityGroups.isNotEmpty())
        cdkBuilder.additionalSlaveSecurityGroups(_additionalSlaveSecurityGroups)
    if(_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
    if(_instanceFleets.isNotEmpty()) cdkBuilder.instanceFleets(_instanceFleets)
    if(_instanceGroups.isNotEmpty()) cdkBuilder.instanceGroups(_instanceGroups)
    return cdkBuilder.build()
  }
}
