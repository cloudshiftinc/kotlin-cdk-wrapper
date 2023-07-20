@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterJobFlowInstancesConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.JobFlowInstancesConfigProperty.Builder =
        CfnCluster.JobFlowInstancesConfigProperty.builder()

    private val _additionalMasterSecurityGroups: MutableList<String> = mutableListOf()

    private val _additionalSlaveSecurityGroups: MutableList<String> = mutableListOf()

    private val _ec2SubnetIds: MutableList<String> = mutableListOf()

    private val _taskInstanceFleets: MutableList<Any> = mutableListOf()

    private val _taskInstanceGroups: MutableList<Any> = mutableListOf()

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

    public fun coreInstanceFleet(coreInstanceFleet: IResolvable) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet)
    }

    public fun coreInstanceFleet(coreInstanceFleet: CfnCluster.InstanceFleetConfigProperty) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet)
    }

    public fun coreInstanceGroup(coreInstanceGroup: IResolvable) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup)
    }

    public fun coreInstanceGroup(coreInstanceGroup: CfnCluster.InstanceGroupConfigProperty) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup)
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

    public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
    }

    public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
    }

    public fun masterInstanceFleet(masterInstanceFleet: IResolvable) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet)
    }

    public fun masterInstanceFleet(masterInstanceFleet: CfnCluster.InstanceFleetConfigProperty) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet)
    }

    public fun masterInstanceGroup(masterInstanceGroup: IResolvable) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup)
    }

    public fun masterInstanceGroup(masterInstanceGroup: CfnCluster.InstanceGroupConfigProperty) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup)
    }

    public fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement)
    }

    public fun placement(placement: CfnCluster.PlacementTypeProperty) {
        cdkBuilder.placement(placement)
    }

    public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
    }

    public fun taskInstanceFleets(vararg taskInstanceFleets: Any) {
        _taskInstanceFleets.addAll(listOf(*taskInstanceFleets))
    }

    public fun taskInstanceFleets(taskInstanceFleets: Collection<Any>) {
        _taskInstanceFleets.addAll(taskInstanceFleets)
    }

    public fun taskInstanceFleets(taskInstanceFleets: IResolvable) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets)
    }

    public fun taskInstanceGroups(vararg taskInstanceGroups: Any) {
        _taskInstanceGroups.addAll(listOf(*taskInstanceGroups))
    }

    public fun taskInstanceGroups(taskInstanceGroups: Collection<Any>) {
        _taskInstanceGroups.addAll(taskInstanceGroups)
    }

    public fun taskInstanceGroups(taskInstanceGroups: IResolvable) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups)
    }

    public fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
    }

    public fun terminationProtected(terminationProtected: IResolvable) {
        cdkBuilder.terminationProtected(terminationProtected)
    }

    public fun build(): CfnCluster.JobFlowInstancesConfigProperty {
        if (_additionalMasterSecurityGroups.isNotEmpty()) {
            cdkBuilder.additionalMasterSecurityGroups(_additionalMasterSecurityGroups)
        }
        if (_additionalSlaveSecurityGroups.isNotEmpty()) {
            cdkBuilder.additionalSlaveSecurityGroups(_additionalSlaveSecurityGroups)
        }
        if (_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
        if (_taskInstanceFleets.isNotEmpty()) cdkBuilder.taskInstanceFleets(_taskInstanceFleets)
        if (_taskInstanceGroups.isNotEmpty()) cdkBuilder.taskInstanceGroups(_taskInstanceGroups)
        return cdkBuilder.build()
    }
}
