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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * A specification of the number and type of Amazon EC2 instances.
 *
 * See the RunJobFlow API for complete documentation on input parameters
 *
 * Example:
 * ```
 * Role clusterRole = Role.Builder.create(this, "ClusterRole")
 * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
 * .build();
 * Role serviceRole = Role.Builder.create(this, "ServiceRole")
 * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
 * .build();
 * Role autoScalingRole = Role.Builder.create(this, "AutoScalingRole")
 * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
 * .build();
 * autoScalingRole.assumeRolePolicy.addStatements(
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(
 * new ServicePrincipal("application-autoscaling.amazonaws.com")))
 * .actions(List.of("sts:AssumeRole"))
 * .build());
 * EmrCreateCluster.Builder.create(this, "Create Cluster")
 * .instances(InstancesConfigProperty.builder().build())
 * .clusterRole(clusterRole)
 * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
 * .serviceRole(serviceRole)
 * .autoScalingRole(autoScalingRole)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_JobFlowInstancesConfig.html)
 */
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

    /**
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the master node.
     */
    public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String) {
        _additionalMasterSecurityGroups.addAll(listOf(*additionalMasterSecurityGroups))
    }

    /**
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the master node.
     */
    public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: Collection<String>) {
        _additionalMasterSecurityGroups.addAll(additionalMasterSecurityGroups)
    }

    /**
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the core and task nodes.
     */
    public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String) {
        _additionalSlaveSecurityGroups.addAll(listOf(*additionalSlaveSecurityGroups))
    }

    /**
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the core and task nodes.
     */
    public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: Collection<String>) {
        _additionalSlaveSecurityGroups.addAll(additionalSlaveSecurityGroups)
    }

    /**
     * @param ec2KeyName The name of the EC2 key pair that can be used to ssh to the master node as
     *   the user called "hadoop.".
     */
    public fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
    }

    /**
     * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration. To
     *   launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the
     *   identifier of the Amazon VPC subnet where you want the cluster to launch.
     */
    public fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
    }

    /**
     * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration. When
     *   multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and launches instances in
     *   the optimal subnet.
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
        _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
    }

    /**
     * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration. When
     *   multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and launches instances in
     *   the optimal subnet.
     */
    public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
        _ec2SubnetIds.addAll(ec2SubnetIds)
    }

    /**
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for the
     *   master node.
     */
    public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
    }

    /**
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
     *   core and task nodes.
     */
    public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
    }

    /**
     * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     *   version for the cluster.
     */
    public fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
    }

    /** @param instanceCount The number of EC2 instances in the cluster. */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
     *   that use the instance fleet configuration. The instance fleet configuration is available
     *   only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
     */
    public fun instanceFleets(
        instanceFleets: EmrCreateClusterInstanceFleetConfigPropertyDsl.() -> Unit
    ) {
        _instanceFleets.add(
            EmrCreateClusterInstanceFleetConfigPropertyDsl().apply(instanceFleets).build()
        )
    }

    /**
     * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
     *   that use the instance fleet configuration. The instance fleet configuration is available
     *   only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
     */
    public fun instanceFleets(
        instanceFleets: Collection<EmrCreateCluster.InstanceFleetConfigProperty>
    ) {
        _instanceFleets.addAll(instanceFleets)
    }

    /** @param instanceGroups Configuration for the instance groups in a cluster. */
    public fun instanceGroups(
        instanceGroups: EmrCreateClusterInstanceGroupConfigPropertyDsl.() -> Unit
    ) {
        _instanceGroups.add(
            EmrCreateClusterInstanceGroupConfigPropertyDsl().apply(instanceGroups).build()
        )
    }

    /** @param instanceGroups Configuration for the instance groups in a cluster. */
    public fun instanceGroups(
        instanceGroups: Collection<EmrCreateCluster.InstanceGroupConfigProperty>
    ) {
        _instanceGroups.addAll(instanceGroups)
    }

    /** @param masterInstanceType The EC2 instance type of the master node. */
    public fun masterInstanceType(masterInstanceType: String) {
        cdkBuilder.masterInstanceType(masterInstanceType)
    }

    /** @param placement The Availability Zone in which the cluster runs. */
    public fun placement(placement: EmrCreateClusterPlacementTypePropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterPlacementTypePropertyDsl()
        builder.apply(placement)
        cdkBuilder.placement(builder.build())
    }

    /** @param placement The Availability Zone in which the cluster runs. */
    public fun placement(placement: EmrCreateCluster.PlacementTypeProperty) {
        cdkBuilder.placement(placement)
    }

    /**
     * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
     *   Amazon EMR service to access clusters in VPC private subnets.
     */
    public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
    }

    /** @param slaveInstanceType The EC2 instance type of the core and task nodes. */
    public fun slaveInstanceType(slaveInstanceType: String) {
        cdkBuilder.slaveInstanceType(slaveInstanceType)
    }

    /**
     * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
     *   instances from being terminated by API call, user intervention, or in the event of a
     *   job-flow error.
     */
    public fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
    }

    public fun build(): EmrCreateCluster.InstancesConfigProperty {
        if (_additionalMasterSecurityGroups.isNotEmpty())
            cdkBuilder.additionalMasterSecurityGroups(_additionalMasterSecurityGroups)
        if (_additionalSlaveSecurityGroups.isNotEmpty())
            cdkBuilder.additionalSlaveSecurityGroups(_additionalSlaveSecurityGroups)
        if (_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
        if (_instanceFleets.isNotEmpty()) cdkBuilder.instanceFleets(_instanceFleets)
        if (_instanceGroups.isNotEmpty()) cdkBuilder.instanceGroups(_instanceGroups)
        return cdkBuilder.build()
    }
}
