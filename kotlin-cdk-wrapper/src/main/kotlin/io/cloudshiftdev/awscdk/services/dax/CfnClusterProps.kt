@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dax.*;
 * Object tags;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
  /**
   * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has been
   * created or updated.
   *
   * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you omit
   * this parameter, DAX will spread the nodes across Availability Zones for the highest availability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * The encryption type of the cluster's endpoint. Available values are:.
   *
   * * `NONE` - The cluster's endpoint will be unencrypted.
   * * `TLS` - The cluster's endpoint will be encrypted with Transport Layer Security, and will
   * provide an x509 certificate for authentication.
   *
   * The default value is `NONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clusterendpointencryptiontype)
   */
  public fun clusterEndpointEncryptionType(): String? =
      unwrap(this).getClusterEndpointEncryptionType()

  /**
   * The name of the DAX cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The description of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A valid Amazon Resource Name (ARN) that identifies an IAM role.
   *
   * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your
   * behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
   */
  public fun iamRoleArn(): String

  /**
   * The node type for the nodes in the cluster.
   *
   * (All nodes in a DAX cluster are of the same type.)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
   */
  public fun nodeType(): String

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
   *
   *
   * The Amazon SNS topic owner must be same as the DAX cluster owner.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
   */
  public fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  /**
   * The parameter group to be associated with the DAX cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
   */
  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * A range of time when maintenance of DAX cluster software will be performed.
   *
   * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
   * and is performed automatically within the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The number of nodes in the DAX cluster.
   *
   * A replication factor of 1 will create a single-node cluster, without any read replicas. For
   * additional fault tolerance, you can create a multiple node cluster with one or more read replicas.
   * To do this, set `ReplicationFactor` to a number between 3 (one primary and two read replicas) and
   * 10 (one primary and nine read replicas). `If the AvailabilityZones` parameter is provided, its
   * length must equal the `ReplicationFactor` .
   *
   *
   * AWS recommends that you have at least two read replicas per cluster.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
   */
  public fun replicationFactor(): Number

  /**
   * A list of security group IDs to be assigned to each node in the DAX cluster.
   *
   * (Each of the security group ID is system-generated.)
   *
   * If this parameter is not specified, DAX assigns the default VPC security group to each node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * Represents the settings used to enable server-side encryption on the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The name of the subnet group to be used for the replication group.
   *
   *
   * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in
   * a subnet group must exist in the same VPC.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
   */
  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * A set of tags to associate with the DAX cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated.
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated.
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param clusterEndpointEncryptionType The encryption type of the cluster's endpoint. Available
     * values are:.
     * * `NONE` - The cluster's endpoint will be unencrypted.
     * * `TLS` - The cluster's endpoint will be encrypted with Transport Layer Security, and will
     * provide an x509 certificate for authentication.
     *
     * The default value is `NONE` .
     */
    public fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String)

    /**
     * @param clusterName The name of the DAX cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param description The description of the cluster.
     */
    public fun description(description: String)

    /**
     * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies an IAM role. 
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param nodeType The node type for the nodes in the cluster. 
     * (All nodes in a DAX cluster are of the same type.)
     */
    public fun nodeType(nodeType: String)

    /**
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     */
    public fun notificationTopicArn(notificationTopicArn: String)

    /**
     * @param parameterGroupName The parameter group to be associated with the DAX cluster.
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * @param preferredMaintenanceWindow A range of time when maintenance of DAX cluster software
     * will be performed.
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param replicationFactor The number of nodes in the DAX cluster. 
     * A replication factor of 1 will create a single-node cluster, without any read replicas. For
     * additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set `ReplicationFactor` to a number between 3 (one primary and two read
     * replicas) and 10 (one primary and nine read replicas). `If the AvailabilityZones` parameter is
     * provided, its length must equal the `ReplicationFactor` .
     *
     *
     * AWS recommends that you have at least two read replicas per cluster.
     */
    public fun replicationFactor(replicationFactor: Number)

    /**
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster.
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster.
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    public fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty)

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6eb4a9e524c66505b81269be33d5b60faec9517e7032686c4daf1623a2f2da1")
    public
        fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty.Builder.() -> Unit)

    /**
     * @param subnetGroupName The name of the subnet group to be used for the replication group.
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param tags A set of tags to associate with the DAX cluster.
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnClusterProps.Builder =
        software.amazon.awscdk.services.dax.CfnClusterProps.builder()

    /**
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated.
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated.
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param clusterEndpointEncryptionType The encryption type of the cluster's endpoint. Available
     * values are:.
     * * `NONE` - The cluster's endpoint will be unencrypted.
     * * `TLS` - The cluster's endpoint will be encrypted with Transport Layer Security, and will
     * provide an x509 certificate for authentication.
     *
     * The default value is `NONE` .
     */
    override fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String) {
      cdkBuilder.clusterEndpointEncryptionType(clusterEndpointEncryptionType)
    }

    /**
     * @param clusterName The name of the DAX cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param description The description of the cluster.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies an IAM role. 
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param nodeType The node type for the nodes in the cluster. 
     * (All nodes in a DAX cluster are of the same type.)
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent.
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     */
    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * @param parameterGroupName The parameter group to be associated with the DAX cluster.
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param preferredMaintenanceWindow A range of time when maintenance of DAX cluster software
     * will be performed.
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param replicationFactor The number of nodes in the DAX cluster. 
     * A replication factor of 1 will create a single-node cluster, without any read replicas. For
     * additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set `ReplicationFactor` to a number between 3 (one primary and two read
     * replicas) and 10 (one primary and nine read replicas). `If the AvailabilityZones` parameter is
     * provided, its length must equal the `ReplicationFactor` .
     *
     *
     * AWS recommends that you have at least two read replicas per cluster.
     */
    override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    /**
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster.
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster.
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    override fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnCluster.SSESpecificationProperty::unwrap))
    }

    /**
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6eb4a9e524c66505b81269be33d5b60faec9517e7032686c4daf1623a2f2da1")
    override
        fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnCluster.SSESpecificationProperty(sseSpecification))

    /**
     * @param subnetGroupName The name of the subnet group to be used for the replication group.
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param tags A set of tags to associate with the DAX cluster.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * The encryption type of the cluster's endpoint. Available values are:.
     *
     * * `NONE` - The cluster's endpoint will be unencrypted.
     * * `TLS` - The cluster's endpoint will be encrypted with Transport Layer Security, and will
     * provide an x509 certificate for authentication.
     *
     * The default value is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clusterendpointencryptiontype)
     */
    override fun clusterEndpointEncryptionType(): String? =
        unwrap(this).getClusterEndpointEncryptionType()

    /**
     * The name of the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The description of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A valid Amazon Resource Name (ARN) that identifies an IAM role.
     *
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
     */
    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    /**
     * The node type for the nodes in the cluster.
     *
     * (All nodes in a DAX cluster are of the same type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
     */
    override fun nodeType(): String = unwrap(this).getNodeType()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     *
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
     */
    override fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

    /**
     * The parameter group to be associated with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
     */
    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    /**
     * A range of time when maintenance of DAX cluster software will be performed.
     *
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The number of nodes in the DAX cluster.
     *
     * A replication factor of 1 will create a single-node cluster, without any read replicas. For
     * additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set `ReplicationFactor` to a number between 3 (one primary and two read
     * replicas) and 10 (one primary and nine read replicas). `If the AvailabilityZones` parameter is
     * provided, its length must equal the `ReplicationFactor` .
     *
     *
     * AWS recommends that you have at least two read replicas per cluster.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
     */
    override fun replicationFactor(): Number = unwrap(this).getReplicationFactor()

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The name of the subnet group to be used for the replication group.
     *
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
     */
    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    /**
     * A set of tags to associate with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.dax.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dax.CfnClusterProps
  }
}
