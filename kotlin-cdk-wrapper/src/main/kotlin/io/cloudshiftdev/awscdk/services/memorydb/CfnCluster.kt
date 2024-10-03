@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
 * Specifies a cluster .
 *
 * All nodes in the cluster run the same protocol-compliant engine software.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .aclName("aclName")
 * .clusterName("clusterName")
 * .nodeType("nodeType")
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .clusterEndpoint(EndpointProperty.builder()
 * .address("address")
 * .port(123)
 * .build())
 * .dataTiering("dataTiering")
 * .description("description")
 * .engineVersion("engineVersion")
 * .finalSnapshotName("finalSnapshotName")
 * .kmsKeyId("kmsKeyId")
 * .maintenanceWindow("maintenanceWindow")
 * .numReplicasPerShard(123)
 * .numShards(123)
 * .parameterGroupName("parameterGroupName")
 * .port(123)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snapshotArns(List.of("snapshotArns"))
 * .snapshotName("snapshotName")
 * .snapshotRetentionLimit(123)
 * .snapshotWindow("snapshotWindow")
 * .snsTopicArn("snsTopicArn")
 * .snsTopicStatus("snsTopicStatus")
 * .subnetGroupName("subnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tlsEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html)
 */
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.memorydb.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The name of the Access Control List to associate with the cluster .
   */
  public open fun aclName(): String = unwrap(this).getAclName()

  /**
   * The name of the Access Control List to associate with the cluster .
   */
  public open fun aclName(`value`: String) {
    unwrap(this).setAclName(`value`)
  }

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the cluster , such as `arn:aws:memorydb:us-east-1:123456789012:cluster/my-cluster`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The address of the cluster 's configuration endpoint.
   */
  public open fun attrClusterEndpointAddress(): String =
      unwrap(this).getAttrClusterEndpointAddress()

  /**
   * The port used by the cluster configuration endpoint.
   */
  public open fun attrClusterEndpointPort(): Number = unwrap(this).getAttrClusterEndpointPort()

  /**
   * The status of the parameter group used by the cluster , for example `active` or `applying` .
   */
  public open fun attrParameterGroupStatus(): String = unwrap(this).getAttrParameterGroupStatus()

  /**
   * The status of the cluster.
   *
   * For example, 'available', 'updating' or 'creating'.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * When set to true, the cluster will automatically receive minor engine version upgrades after
   * launch.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * When set to true, the cluster will automatically receive minor engine version upgrades after
   * launch.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * When set to true, the cluster will automatically receive minor engine version upgrades after
   * launch.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The cluster 's configuration endpoint.
   */
  public open fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

  /**
   * The cluster 's configuration endpoint.
   */
  public open fun clusterEndpoint(`value`: IResolvable) {
    unwrap(this).setClusterEndpoint(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The cluster 's configuration endpoint.
   */
  public open fun clusterEndpoint(`value`: EndpointProperty) {
    unwrap(this).setClusterEndpoint(`value`.let(EndpointProperty.Companion::unwrap))
  }

  /**
   * The cluster 's configuration endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d5527ac11fdc97153b5833ed5809a545cff10896ee706a0318cb3e803348749a")
  public open fun clusterEndpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      clusterEndpoint(EndpointProperty(`value`))

  /**
   * The name of the cluster .
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of the cluster .
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * Enables data tiering.
   */
  public open fun dataTiering(): String? = unwrap(this).getDataTiering()

  /**
   * Enables data tiering.
   */
  public open fun dataTiering(`value`: String) {
    unwrap(this).setDataTiering(`value`)
  }

  /**
   * A description of the cluster .
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the cluster .
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Redis engine version used by the cluster .
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The Redis engine version used by the cluster .
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * The user-supplied name of a final cluster snapshot.
   */
  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * The user-supplied name of a final cluster snapshot.
   */
  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
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
   * The ID of the KMS key used to encrypt the cluster .
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the KMS key used to encrypt the cluster .
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun maintenanceWindow(`value`: String) {
    unwrap(this).setMaintenanceWindow(`value`)
  }

  /**
   * The cluster 's node type.
   */
  public open fun nodeType(): String = unwrap(this).getNodeType()

  /**
   * The cluster 's node type.
   */
  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  /**
   * The number of replicas to apply to each shard.
   */
  public open fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

  /**
   * The number of replicas to apply to each shard.
   */
  public open fun numReplicasPerShard(`value`: Number) {
    unwrap(this).setNumReplicasPerShard(`value`)
  }

  /**
   * The number of shards in the cluster .
   */
  public open fun numShards(): Number? = unwrap(this).getNumShards()

  /**
   * The number of shards in the cluster .
   */
  public open fun numShards(`value`: Number) {
    unwrap(this).setNumShards(`value`)
  }

  /**
   * The name of the parameter group used by the cluster .
   */
  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * The name of the parameter group used by the cluster .
   */
  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  /**
   * The port used by the cluster .
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port used by the cluster .
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * A list of security group names to associate with this cluster .
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of security group names to associate with this cluster .
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of security group names to associate with this cluster .
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
   * Amazon S3.
   */
  public open fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
   * Amazon S3.
   */
  public open fun snapshotArns(`value`: List<String>) {
    unwrap(this).setSnapshotArns(`value`)
  }

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
   * Amazon S3.
   */
  public open fun snapshotArns(vararg `value`: String): Unit = snapshotArns(`value`.toList())

  /**
   * The name of a snapshot from which to restore data into the new cluster .
   */
  public open fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The name of a snapshot from which to restore data into the new cluster .
   */
  public open fun snapshotName(`value`: String) {
    unwrap(this).setSnapshotName(`value`)
  }

  /**
   * The number of days for which MemoryDB retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The number of days for which MemoryDB retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  /**
   * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
   * shard.
   */
  public open fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  /**
   * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
   * shard.
   */
  public open fun snapshotWindow(`value`: String) {
    unwrap(this).setSnapshotWindow(`value`)
  }

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
   */
  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * The SNS topic must be in Active status to receive notifications.
   */
  public open fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

  /**
   * The SNS topic must be in Active status to receive notifications.
   */
  public open fun snsTopicStatus(`value`: String) {
    unwrap(this).setSnsTopicStatus(`value`)
  }

  /**
   * The name of the subnet group used by the cluster .
   */
  public open fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * The name of the subnet group used by the cluster .
   */
  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A flag to indicate if In-transit encryption is enabled.
   */
  public open fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  /**
   * A flag to indicate if In-transit encryption is enabled.
   */
  public open fun tlsEnabled(`value`: Boolean) {
    unwrap(this).setTlsEnabled(`value`)
  }

  /**
   * A flag to indicate if In-transit encryption is enabled.
   */
  public open fun tlsEnabled(`value`: IResolvable) {
    unwrap(this).setTlsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Access Control List to associate with the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-aclname)
     * @param aclName The name of the Access Control List to associate with the cluster . 
     */
    public fun aclName(aclName: String)

    /**
     * When set to true, the cluster will automatically receive minor engine version upgrades after
     * launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * When set to true, the cluster will automatically receive minor engine version upgrades after
     * launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    public fun clusterEndpoint(clusterEndpoint: IResolvable)

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    public fun clusterEndpoint(clusterEndpoint: EndpointProperty)

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d33203bee7e089e4fbdd81588dfcceea6441e02214de6749a98f01dd1955f8d")
    public fun clusterEndpoint(clusterEndpoint: EndpointProperty.Builder.() -> Unit)

    /**
     * The name of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clustername)
     * @param clusterName The name of the cluster . 
     */
    public fun clusterName(clusterName: String)

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-datatiering)
     * @param dataTiering Enables data tiering. 
     */
    public fun dataTiering(dataTiering: String)

    /**
     * A description of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-description)
     * @param description A description of the cluster . 
     */
    public fun description(description: String)

    /**
     * The Redis engine version used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engineversion)
     * @param engineVersion The Redis engine version used by the cluster . 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The user-supplied name of a final cluster snapshot.
     *
     * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
     * deletes the cluster immediately afterward.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-finalsnapshotname)
     * @param finalSnapshotName The user-supplied name of a final cluster snapshot. 
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * The ID of the KMS key used to encrypt the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-kmskeyid)
     * @param kmsKeyId The ID of the KMS key used to encrypt the cluster . 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed.
     *
     * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The
     * minimum maintenance window is a 60 minute period.
     *
     * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-maintenancewindow)
     * @param maintenanceWindow Specifies the weekly time range during which maintenance on the
     * cluster is performed. 
     */
    public fun maintenanceWindow(maintenanceWindow: String)

    /**
     * The cluster 's node type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-nodetype)
     * @param nodeType The cluster 's node type. 
     */
    public fun nodeType(nodeType: String)

    /**
     * The number of replicas to apply to each shard.
     *
     * *Default value* : `1`
     *
     * *Maximum value* : `5`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numreplicaspershard)
     * @param numReplicasPerShard The number of replicas to apply to each shard. 
     */
    public fun numReplicasPerShard(numReplicasPerShard: Number)

    /**
     * The number of shards in the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numshards)
     * @param numShards The number of shards in the cluster . 
     */
    public fun numShards(numShards: Number)

    /**
     * The name of the parameter group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-parametergroupname)
     * @param parameterGroupName The name of the parameter group used by the cluster . 
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * The port used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-port)
     * @param port The port used by the cluster . 
     */
    public fun port(port: Number)

    /**
     * A list of security group names to associate with this cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
     * @param securityGroupIds A list of security group names to associate with this cluster . 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * A list of security group names to associate with this cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
     * @param securityGroupIds A list of security group names to associate with this cluster . 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
     * Amazon S3.
     *
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3. 
     */
    public fun snapshotArns(snapshotArns: List<String>)

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
     * Amazon S3.
     *
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3. 
     */
    public fun snapshotArns(vararg snapshotArns: String)

    /**
     * The name of a snapshot from which to restore data into the new cluster .
     *
     * The snapshot status changes to restoring while the new cluster is being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotname)
     * @param snapshotName The name of a snapshot from which to restore data into the new cluster . 
     */
    public fun snapshotName(snapshotName: String)

    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them.
     *
     * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which MemoryDB retains automatic
     * snapshots before deleting them. 
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
     * shard.
     *
     * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
     * appropriate time range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which MemoryDB begins taking a
     * daily snapshot of your shard. 
     */
    public fun snapshotWindow(snapshotWindow: String)

    /**
     * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns
     * the ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicarn)
     * @param snsTopicArn When you pass the logical ID of this resource to the intrinsic `Ref`
     * function, Ref returns the ARN of the SNS topic, such as
     * `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * The SNS topic must be in Active status to receive notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicstatus)
     * @param snsTopicStatus The SNS topic must be in Active status to receive notifications. 
     */
    public fun snsTopicStatus(snsTopicStatus: String)

    /**
     * The name of the subnet group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-subnetgroupname)
     * @param subnetGroupName The name of the subnet group used by the cluster . 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A flag to indicate if In-transit encryption is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled. 
     */
    public fun tlsEnabled(tlsEnabled: Boolean)

    /**
     * A flag to indicate if In-transit encryption is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled. 
     */
    public fun tlsEnabled(tlsEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnCluster.Builder =
        software.amazon.awscdk.services.memorydb.CfnCluster.Builder.create(scope, id)

    /**
     * The name of the Access Control List to associate with the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-aclname)
     * @param aclName The name of the Access Control List to associate with the cluster . 
     */
    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    /**
     * When set to true, the cluster will automatically receive minor engine version upgrades after
     * launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * When set to true, the cluster will automatically receive minor engine version upgrades after
     * launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    override fun clusterEndpoint(clusterEndpoint: IResolvable) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    override fun clusterEndpoint(clusterEndpoint: EndpointProperty) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(EndpointProperty.Companion::unwrap))
    }

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     * @param clusterEndpoint The cluster 's configuration endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d33203bee7e089e4fbdd81588dfcceea6441e02214de6749a98f01dd1955f8d")
    override fun clusterEndpoint(clusterEndpoint: EndpointProperty.Builder.() -> Unit): Unit =
        clusterEndpoint(EndpointProperty(clusterEndpoint))

    /**
     * The name of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clustername)
     * @param clusterName The name of the cluster . 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-datatiering)
     * @param dataTiering Enables data tiering. 
     */
    override fun dataTiering(dataTiering: String) {
      cdkBuilder.dataTiering(dataTiering)
    }

    /**
     * A description of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-description)
     * @param description A description of the cluster . 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Redis engine version used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engineversion)
     * @param engineVersion The Redis engine version used by the cluster . 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The user-supplied name of a final cluster snapshot.
     *
     * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
     * deletes the cluster immediately afterward.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-finalsnapshotname)
     * @param finalSnapshotName The user-supplied name of a final cluster snapshot. 
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * The ID of the KMS key used to encrypt the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-kmskeyid)
     * @param kmsKeyId The ID of the KMS key used to encrypt the cluster . 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed.
     *
     * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The
     * minimum maintenance window is a 60 minute period.
     *
     * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-maintenancewindow)
     * @param maintenanceWindow Specifies the weekly time range during which maintenance on the
     * cluster is performed. 
     */
    override fun maintenanceWindow(maintenanceWindow: String) {
      cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /**
     * The cluster 's node type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-nodetype)
     * @param nodeType The cluster 's node type. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * The number of replicas to apply to each shard.
     *
     * *Default value* : `1`
     *
     * *Maximum value* : `5`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numreplicaspershard)
     * @param numReplicasPerShard The number of replicas to apply to each shard. 
     */
    override fun numReplicasPerShard(numReplicasPerShard: Number) {
      cdkBuilder.numReplicasPerShard(numReplicasPerShard)
    }

    /**
     * The number of shards in the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numshards)
     * @param numShards The number of shards in the cluster . 
     */
    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    /**
     * The name of the parameter group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-parametergroupname)
     * @param parameterGroupName The name of the parameter group used by the cluster . 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * The port used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-port)
     * @param port The port used by the cluster . 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * A list of security group names to associate with this cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
     * @param securityGroupIds A list of security group names to associate with this cluster . 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * A list of security group names to associate with this cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
     * @param securityGroupIds A list of security group names to associate with this cluster . 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
     * Amazon S3.
     *
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3. 
     */
    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
     * Amazon S3.
     *
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3. 
     */
    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    /**
     * The name of a snapshot from which to restore data into the new cluster .
     *
     * The snapshot status changes to restoring while the new cluster is being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotname)
     * @param snapshotName The name of a snapshot from which to restore data into the new cluster . 
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them.
     *
     * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which MemoryDB retains automatic
     * snapshots before deleting them. 
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
     * shard.
     *
     * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
     * appropriate time range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which MemoryDB begins taking a
     * daily snapshot of your shard. 
     */
    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns
     * the ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicarn)
     * @param snsTopicArn When you pass the logical ID of this resource to the intrinsic `Ref`
     * function, Ref returns the ARN of the SNS topic, such as
     * `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * The SNS topic must be in Active status to receive notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicstatus)
     * @param snsTopicStatus The SNS topic must be in Active status to receive notifications. 
     */
    override fun snsTopicStatus(snsTopicStatus: String) {
      cdkBuilder.snsTopicStatus(snsTopicStatus)
    }

    /**
     * The name of the subnet group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-subnetgroupname)
     * @param subnetGroupName The name of the subnet group used by the cluster . 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A flag to indicate if In-transit encryption is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled. 
     */
    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    /**
     * A flag to indicate if In-transit encryption is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled. 
     */
    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.memorydb.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.memorydb.CfnCluster
  }

  /**
   * Represents the information required for client programs to connect to the cluster and its
   * nodes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.memorydb.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .address("address")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html)
   */
  public interface EndpointProperty {
    /**
     * The DNS hostname of the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html#cfn-memorydb-cluster-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The port number that the engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html#cfn-memorydb-cluster-endpoint-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The DNS hostname of the node.
       */
      public fun address(address: String)

      /**
       * @param port The port number that the engine is listening on.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty.builder()

      /**
       * @param address The DNS hostname of the node.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param port The port number that the engine is listening on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty,
    ) : CdkObject(cdkObject),
        EndpointProperty {
      /**
       * The DNS hostname of the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html#cfn-memorydb-cluster-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The port number that the engine is listening on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html#cfn-memorydb-cluster-endpoint-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty):
          EndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty
    }
  }
}
