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

package io.cloudshiftdev.awscdkdsl.services.dax

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dax.CfnCluster
import software.constructs.Construct

/**
 * Creates a DAX cluster.
 *
 * All nodes in the cluster run the same DAX caching software.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dax.*;
 * Object tags;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .iamRoleArn("iamRoleArn")
 * .nodeType("nodeType")
 * .replicationFactor(123)
 * // the properties below are optional
 * .availabilityZones(List.of("availabilityZones"))
 * .clusterEndpointEncryptionType("clusterEndpointEncryptionType")
 * .clusterName("clusterName")
 * .description("description")
 * .notificationTopicArn("notificationTopicArn")
 * .parameterGroupName("parameterGroupName")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build())
 * .subnetGroupName("subnetGroupName")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
 */
@CdkDslMarker
public class CfnClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     *
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     *   after the cluster has been created or updated.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     *
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     *   after the cluster has been created or updated.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * The encryption type of the cluster's endpoint. Available values are:.
     * * `NONE` - The cluster's endpoint will be unencrypted.
     * * `TLS` - The cluster's endpoint will be encrypted with Transport Layer Security, and will
     *   provide an x509 certificate for authentication.
     *
     * The default value is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clusterendpointencryptiontype)
     *
     * @param clusterEndpointEncryptionType The encryption type of the cluster's endpoint. Available
     *   values are:.
     */
    public fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String) {
        cdkBuilder.clusterEndpointEncryptionType(clusterEndpointEncryptionType)
    }

    /**
     * The name of the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
     *
     * @param clusterName The name of the DAX cluster.
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * The description of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
     *
     * @param description The description of the cluster.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A valid Amazon Resource Name (ARN) that identifies an IAM role.
     *
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
     *
     * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies an IAM role.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The node type for the nodes in the cluster.
     *
     * (All nodes in a DAX cluster are of the same type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
     *
     * @param nodeType The node type for the nodes in the cluster.
     */
    public fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *   notifications will be sent.
     */
    public fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * The parameter group to be associated with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
     *
     * @param parameterGroupName The parameter group to be associated with the DAX cluster.
     */
    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * A range of time when maintenance of DAX cluster software will be performed.
     *
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
     *
     * @param preferredMaintenanceWindow A range of time when maintenance of DAX cluster software
     *   will be performed.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The number of nodes in the DAX cluster.
     *
     * A replication factor of 1 will create a single-node cluster, without any read replicas. For
     * additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set `ReplicationFactor` to a number between 3 (one primary and two read
     * replicas) and 10 (one primary and nine read replicas). `If the AvailabilityZones` parameter
     * is provided, its length must equal the `ReplicationFactor` .
     *
     * AWS recommends that you have at least two read replicas per cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
     *
     * @param replicationFactor The number of nodes in the DAX cluster.
     */
    public fun replicationFactor(replicationFactor: Number) {
        cdkBuilder.replicationFactor(replicationFactor)
    }

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     *
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     *   cluster.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     *
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     *   cluster.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     *
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     *   cluster.
     */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     *
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     *   cluster.
     */
    public fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * The name of the subnet group to be used for the replication group.
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
     *
     * @param subnetGroupName The name of the subnet group to be used for the replication group.
     */
    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * A set of tags to associate with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
     *
     * @param tags A set of tags to associate with the DAX cluster.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * A set of tags to associate with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
     *
     * @param tags A set of tags to associate with the DAX cluster.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnCluster {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
