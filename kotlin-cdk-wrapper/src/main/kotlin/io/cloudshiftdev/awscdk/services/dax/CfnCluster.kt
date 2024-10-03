@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a DAX cluster.
 *
 * All nodes in the cluster run the same DAX caching software.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dax.*;
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
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.dax.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.dax.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * Returns the ARN of the DAX cluster. For example:.
   *
   * `{ "Fn::GetAtt": [" MyDAXCluster ", "Arn"] }`
   *
   * Returns a value similar to the following:
   *
   * `arn:aws:dax:us-east-1:111122223333:cache/MyDAXCluster`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the endpoint of the DAX cluster. For example:.
   *
   * `{ "Fn::GetAtt": [" MyDAXCluster ", "ClusterDiscoveryEndpoint"] }`
   *
   * Returns a value similar to the following:
   *
   * `mydaxcluster.0h3d6x.clustercfg.dax.use1.cache.amazonaws.com:8111`
   */
  public open fun attrClusterDiscoveryEndpoint(): String =
      unwrap(this).getAttrClusterDiscoveryEndpoint()

  /**
   * Returns the endpoint URL of the DAX cluster.
   */
  public open fun attrClusterDiscoveryEndpointUrl(): String =
      unwrap(this).getAttrClusterDiscoveryEndpointUrl()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has been
   * created or updated.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has been
   * created or updated.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has been
   * created or updated.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * The encryption type of the cluster's endpoint.
   *
   * Available values are:.
   */
  public open fun clusterEndpointEncryptionType(): String? =
      unwrap(this).getClusterEndpointEncryptionType()

  /**
   * The encryption type of the cluster's endpoint.
   *
   * Available values are:.
   */
  public open fun clusterEndpointEncryptionType(`value`: String) {
    unwrap(this).setClusterEndpointEncryptionType(`value`)
  }

  /**
   * The name of the DAX cluster.
   */
  public open fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The name of the DAX cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The description of the cluster.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the cluster.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A valid Amazon Resource Name (ARN) that identifies an IAM role.
   */
  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  /**
   * A valid Amazon Resource Name (ARN) that identifies an IAM role.
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The node type for the nodes in the cluster.
   */
  public open fun nodeType(): String = unwrap(this).getNodeType()

  /**
   * The node type for the nodes in the cluster.
   */
  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
   */
  public open fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
   */
  public open fun notificationTopicArn(`value`: String) {
    unwrap(this).setNotificationTopicArn(`value`)
  }

  /**
   * The parameter group to be associated with the DAX cluster.
   */
  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * The parameter group to be associated with the DAX cluster.
   */
  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  /**
   * A range of time when maintenance of DAX cluster software will be performed.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * A range of time when maintenance of DAX cluster software will be performed.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * The number of nodes in the DAX cluster.
   */
  public open fun replicationFactor(): Number = unwrap(this).getReplicationFactor()

  /**
   * The number of nodes in the DAX cluster.
   */
  public open fun replicationFactor(`value`: Number) {
    unwrap(this).setReplicationFactor(`value`)
  }

  /**
   * A list of security group IDs to be assigned to each node in the DAX cluster.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of security group IDs to be assigned to each node in the DAX cluster.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of security group IDs to be assigned to each node in the DAX cluster.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Represents the settings used to enable server-side encryption on the cluster.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * Represents the settings used to enable server-side encryption on the cluster.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Represents the settings used to enable server-side encryption on the cluster.
   */
  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty.Companion::unwrap))
  }

  /**
   * Represents the settings used to enable server-side encryption on the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e1e1e37d596fffded811691bc5872cf4b49dae61b5d61d7e7267294100b5f5e")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  /**
   * The name of the subnet group to be used for the replication group.
   */
  public open fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * The name of the subnet group to be used for the replication group.
   */
  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A set of tags to associate with the DAX cluster.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * A set of tags to associate with the DAX cluster.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dax.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

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
     * @param clusterEndpointEncryptionType The encryption type of the cluster's endpoint. Available
     * values are:. 
     */
    public fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String)

    /**
     * The name of the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
     * @param clusterName The name of the DAX cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The description of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
     * @param description The description of the cluster. 
     */
    public fun description(description: String)

    /**
     * A valid Amazon Resource Name (ARN) that identifies an IAM role.
     *
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
     * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies an IAM role. 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * The node type for the nodes in the cluster.
     *
     * (All nodes in a DAX cluster are of the same type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
     * @param nodeType The node type for the nodes in the cluster. 
     */
    public fun nodeType(nodeType: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     *
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. 
     */
    public fun notificationTopicArn(notificationTopicArn: String)

    /**
     * The parameter group to be associated with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
     * @param parameterGroupName The parameter group to be associated with the DAX cluster. 
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * A range of time when maintenance of DAX cluster software will be performed.
     *
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow A range of time when maintenance of DAX cluster software
     * will be performed. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

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
     * @param replicationFactor The number of nodes in the DAX cluster. 
     */
    public fun replicationFactor(replicationFactor: Number)

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c809a44e1ba9227fb3a562887ecdac01bc3bdef30dc351232bb9ccc13054d6a0")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    /**
     * The name of the subnet group to be used for the replication group.
     *
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
     * @param subnetGroupName The name of the subnet group to be used for the replication group. 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * A set of tags to associate with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
     * @param tags A set of tags to associate with the DAX cluster. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnCluster.Builder =
        software.amazon.awscdk.services.dax.CfnCluster.Builder.create(scope, id)

    /**
     * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has
     * been created or updated.
     *
     * If provided, the length of this list must equal the `ReplicationFactor` parameter. If you
     * omit this parameter, DAX will spread the nodes across Availability Zones for the highest
     * availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
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
     * @param availabilityZones The Availability Zones (AZs) in which the cluster nodes will reside
     * after the cluster has been created or updated. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

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
     * @param clusterEndpointEncryptionType The encryption type of the cluster's endpoint. Available
     * values are:. 
     */
    override fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String) {
      cdkBuilder.clusterEndpointEncryptionType(clusterEndpointEncryptionType)
    }

    /**
     * The name of the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
     * @param clusterName The name of the DAX cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The description of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
     * @param description The description of the cluster. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A valid Amazon Resource Name (ARN) that identifies an IAM role.
     *
     * At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on
     * your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
     * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies an IAM role. 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The node type for the nodes in the cluster.
     *
     * (All nodes in a DAX cluster are of the same type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
     * @param nodeType The node type for the nodes in the cluster. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     *
     *
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. 
     */
    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * The parameter group to be associated with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
     * @param parameterGroupName The parameter group to be associated with the DAX cluster. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * A range of time when maintenance of DAX cluster software will be performed.
     *
     * For example: `sun:01:00-sun:09:00` . Cluster maintenance normally takes less than 30 minutes,
     * and is performed automatically within the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow A range of time when maintenance of DAX cluster software
     * will be performed. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

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
     * @param replicationFactor The number of nodes in the DAX cluster. 
     */
    override fun replicationFactor(replicationFactor: Number) {
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
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster.
     *
     * (Each of the security group ID is system-generated.)
     *
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
     * @param securityGroupIds A list of security group IDs to be assigned to each node in the DAX
     * cluster. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty.Companion::unwrap))
    }

    /**
     * Represents the settings used to enable server-side encryption on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-ssespecification)
     * @param sseSpecification Represents the settings used to enable server-side encryption on the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c809a44e1ba9227fb3a562887ecdac01bc3bdef30dc351232bb9ccc13054d6a0")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    /**
     * The name of the subnet group to be used for the replication group.
     *
     *
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify
     * in a subnet group must exist in the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
     * @param subnetGroupName The name of the subnet group to be used for the replication group. 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * A set of tags to associate with the DAX cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
     * @param tags A set of tags to associate with the DAX cluster. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dax.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.dax.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.dax.CfnCluster
  }

  /**
   * Represents the settings used to enable server-side encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dax.*;
   * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
   * .sseEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html)
   */
  public interface SSESpecificationProperty {
    /**
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled)
     */
    public fun sseEnabled(): Any? = unwrap(this).getSseEnabled()

    /**
     * A builder for [SSESpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
       * (false) on the cluster.
       */
      public fun sseEnabled(sseEnabled: Boolean)

      /**
       * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
       * (false) on the cluster.
       */
      public fun sseEnabled(sseEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.builder()

      /**
       * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
       * (false) on the cluster.
       */
      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      /**
       * @param sseEnabled Indicates whether server-side encryption is enabled (true) or disabled
       * (false) on the cluster.
       */
      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty,
    ) : CdkObject(cdkObject),
        SSESpecificationProperty {
      /**
       * Indicates whether server-side encryption is enabled (true) or disabled (false) on the
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled)
       */
      override fun sseEnabled(): Any? = unwrap(this).getSseEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty):
          SSESpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? SSESpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty
    }
  }
}
