@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .finalSnapshotName("finalSnapshotName")
 * .kmsKeyId("kmsKeyId")
 * .maintenanceWindow("maintenanceWindow")
 * .multiRegionClusterName("multiRegionClusterName")
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
public interface CfnClusterProps {
  /**
   * The name of the Access Control List to associate with the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-aclname)
   */
  public fun aclName(): String

  /**
   * When set to true, the cluster will automatically receive minor engine version upgrades after
   * launch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The cluster 's configuration endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
   */
  public fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

  /**
   * The name of the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clustername)
   */
  public fun clusterName(): String

  /**
   * Enables data tiering.
   *
   * Data tiering is only supported for clusters using the r6gd node type. This parameter must be
   * set when using r6gd nodes. For more information, see [Data
   * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-datatiering)
   */
  public fun dataTiering(): String? = unwrap(this).getDataTiering()

  /**
   * A description of the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the engine used by the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The Valkey or Redis OSS engine version used by the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The user-supplied name of a final cluster snapshot.
   *
   * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
   * deletes the cluster immediately afterward.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-finalsnapshotname)
   */
  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * The ID of the KMS key used to encrypt the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   *
   * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum
   * maintenance window is a 60 minute period.
   *
   * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-maintenancewindow)
   */
  public fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

  /**
   * The name of the multi-Region cluster that this cluster belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-multiregionclustername)
   */
  public fun multiRegionClusterName(): String? = unwrap(this).getMultiRegionClusterName()

  /**
   * The cluster 's node type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-nodetype)
   */
  public fun nodeType(): String

  /**
   * The number of replicas to apply to each shard.
   *
   * *Default value* : `1`
   *
   * *Maximum value* : `5`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numreplicaspershard)
   */
  public fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

  /**
   * The number of shards in the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numshards)
   */
  public fun numShards(): Number? = unwrap(this).getNumShards()

  /**
   * The name of the parameter group used by the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-parametergroupname)
   */
  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * The port used by the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * A list of security group names to associate with this cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
   * Amazon S3.
   *
   * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the ARN
   * cannot contain any commas.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
   */
  public fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  /**
   * The name of a snapshot from which to restore data into the new cluster .
   *
   * The snapshot status changes to restoring while the new cluster is being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotname)
   */
  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The number of days for which MemoryDB retains automatic snapshots before deleting them.
   *
   * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
   * retained for 5 days before being deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotretentionlimit)
   */
  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
   * shard.
   *
   * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
   * appropriate time range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotwindow)
   */
  public fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicarn)
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The SNS topic must be in Active status to receive notifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicstatus)
   */
  public fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

  /**
   * The name of the subnet group used by the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-subnetgroupname)
   */
  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A flag to indicate if In-transit encryption is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
   */
  public fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aclName The name of the Access Control List to associate with the cluster . 
     */
    public fun aclName(aclName: String)

    /**
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    public fun clusterEndpoint(clusterEndpoint: IResolvable)

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty)

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0321f528d8f2b81e84125a9061b941b51ee01fe1936f9baddd562083f0552768")
    public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty.Builder.() -> Unit)

    /**
     * @param clusterName The name of the cluster . 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param dataTiering Enables data tiering.
     * Data tiering is only supported for clusters using the r6gd node type. This parameter must be
     * set when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
     */
    public fun dataTiering(dataTiering: String)

    /**
     * @param description A description of the cluster .
     */
    public fun description(description: String)

    /**
     * @param engine The name of the engine used by the cluster.
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The Valkey or Redis OSS engine version used by the cluster .
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param finalSnapshotName The user-supplied name of a final cluster snapshot.
     * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
     * deletes the cluster immediately afterward.
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * @param kmsKeyId The ID of the KMS key used to encrypt the cluster .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param maintenanceWindow Specifies the weekly time range during which maintenance on the
     * cluster is performed.
     * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The
     * minimum maintenance window is a 60 minute period.
     *
     * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
     */
    public fun maintenanceWindow(maintenanceWindow: String)

    /**
     * @param multiRegionClusterName The name of the multi-Region cluster that this cluster belongs
     * to.
     */
    public fun multiRegionClusterName(multiRegionClusterName: String)

    /**
     * @param nodeType The cluster 's node type. 
     */
    public fun nodeType(nodeType: String)

    /**
     * @param numReplicasPerShard The number of replicas to apply to each shard.
     * *Default value* : `1`
     *
     * *Maximum value* : `5`
     */
    public fun numReplicasPerShard(numReplicasPerShard: Number)

    /**
     * @param numShards The number of shards in the cluster .
     */
    public fun numShards(numShards: Number)

    /**
     * @param parameterGroupName The name of the parameter group used by the cluster .
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * @param port The port used by the cluster .
     */
    public fun port(port: Number)

    /**
     * @param securityGroupIds A list of security group names to associate with this cluster .
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group names to associate with this cluster .
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3.
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     */
    public fun snapshotArns(snapshotArns: List<String>)

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3.
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     */
    public fun snapshotArns(vararg snapshotArns: String)

    /**
     * @param snapshotName The name of a snapshot from which to restore data into the new cluster .
     * The snapshot status changes to restoring while the new cluster is being created.
     */
    public fun snapshotName(snapshotName: String)

    /**
     * @param snapshotRetentionLimit The number of days for which MemoryDB retains automatic
     * snapshots before deleting them.
     * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * @param snapshotWindow The daily time range (in UTC) during which MemoryDB begins taking a
     * daily snapshot of your shard.
     * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
     * appropriate time range.
     */
    public fun snapshotWindow(snapshotWindow: String)

    /**
     * @param snsTopicArn When you pass the logical ID of this resource to the intrinsic `Ref`
     * function, Ref returns the ARN of the SNS topic, such as
     * `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param snsTopicStatus The SNS topic must be in Active status to receive notifications.
     */
    public fun snsTopicStatus(snsTopicStatus: String)

    /**
     * @param subnetGroupName The name of the subnet group used by the cluster .
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
     */
    public fun tlsEnabled(tlsEnabled: Boolean)

    /**
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
     */
    public fun tlsEnabled(tlsEnabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnClusterProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnClusterProps.builder()

    /**
     * @param aclName The name of the Access Control List to associate with the cluster . 
     */
    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    /**
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
     * engine version upgrades after launch.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    override fun clusterEndpoint(clusterEndpoint: IResolvable) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    override fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(CfnCluster.EndpointProperty.Companion::unwrap))
    }

    /**
     * @param clusterEndpoint The cluster 's configuration endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0321f528d8f2b81e84125a9061b941b51ee01fe1936f9baddd562083f0552768")
    override fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty.Builder.() -> Unit):
        Unit = clusterEndpoint(CfnCluster.EndpointProperty(clusterEndpoint))

    /**
     * @param clusterName The name of the cluster . 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param dataTiering Enables data tiering.
     * Data tiering is only supported for clusters using the r6gd node type. This parameter must be
     * set when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
     */
    override fun dataTiering(dataTiering: String) {
      cdkBuilder.dataTiering(dataTiering)
    }

    /**
     * @param description A description of the cluster .
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The name of the engine used by the cluster.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The Valkey or Redis OSS engine version used by the cluster .
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param finalSnapshotName The user-supplied name of a final cluster snapshot.
     * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
     * deletes the cluster immediately afterward.
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * @param kmsKeyId The ID of the KMS key used to encrypt the cluster .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param maintenanceWindow Specifies the weekly time range during which maintenance on the
     * cluster is performed.
     * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The
     * minimum maintenance window is a 60 minute period.
     *
     * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
     */
    override fun maintenanceWindow(maintenanceWindow: String) {
      cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /**
     * @param multiRegionClusterName The name of the multi-Region cluster that this cluster belongs
     * to.
     */
    override fun multiRegionClusterName(multiRegionClusterName: String) {
      cdkBuilder.multiRegionClusterName(multiRegionClusterName)
    }

    /**
     * @param nodeType The cluster 's node type. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * @param numReplicasPerShard The number of replicas to apply to each shard.
     * *Default value* : `1`
     *
     * *Maximum value* : `5`
     */
    override fun numReplicasPerShard(numReplicasPerShard: Number) {
      cdkBuilder.numReplicasPerShard(numReplicasPerShard)
    }

    /**
     * @param numShards The number of shards in the cluster .
     */
    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    /**
     * @param parameterGroupName The name of the parameter group used by the cluster .
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param port The port used by the cluster .
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param securityGroupIds A list of security group names to associate with this cluster .
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group names to associate with this cluster .
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3.
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     */
    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
     * snapshot files stored in Amazon S3.
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     */
    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    /**
     * @param snapshotName The name of a snapshot from which to restore data into the new cluster .
     * The snapshot status changes to restoring while the new cluster is being created.
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * @param snapshotRetentionLimit The number of days for which MemoryDB retains automatic
     * snapshots before deleting them.
     * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * @param snapshotWindow The daily time range (in UTC) during which MemoryDB begins taking a
     * daily snapshot of your shard.
     * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
     * appropriate time range.
     */
    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * @param snsTopicArn When you pass the logical ID of this resource to the intrinsic `Ref`
     * function, Ref returns the ARN of the SNS topic, such as
     * `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param snsTopicStatus The SNS topic must be in Active status to receive notifications.
     */
    override fun snsTopicStatus(snsTopicStatus: String) {
      cdkBuilder.snsTopicStatus(snsTopicStatus)
    }

    /**
     * @param subnetGroupName The name of the subnet group used by the cluster .
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
     */
    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    /**
     * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
     */
    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.memorydb.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * The name of the Access Control List to associate with the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-aclname)
     */
    override fun aclName(): String = unwrap(this).getAclName()

    /**
     * When set to true, the cluster will automatically receive minor engine version upgrades after
     * launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The cluster 's configuration endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clusterendpoint)
     */
    override fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

    /**
     * The name of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for clusters using the r6gd node type. This parameter must be
     * set when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-datatiering)
     */
    override fun dataTiering(): String? = unwrap(this).getDataTiering()

    /**
     * A description of the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the engine used by the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The Valkey or Redis OSS engine version used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The user-supplied name of a final cluster snapshot.
     *
     * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
     * deletes the cluster immediately afterward.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-finalsnapshotname)
     */
    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    /**
     * The ID of the KMS key used to encrypt the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed.
     *
     * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The
     * minimum maintenance window is a 60 minute period.
     *
     * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-maintenancewindow)
     */
    override fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

    /**
     * The name of the multi-Region cluster that this cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-multiregionclustername)
     */
    override fun multiRegionClusterName(): String? = unwrap(this).getMultiRegionClusterName()

    /**
     * The cluster 's node type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-nodetype)
     */
    override fun nodeType(): String = unwrap(this).getNodeType()

    /**
     * The number of replicas to apply to each shard.
     *
     * *Default value* : `1`
     *
     * *Maximum value* : `5`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numreplicaspershard)
     */
    override fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

    /**
     * The number of shards in the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-numshards)
     */
    override fun numShards(): Number? = unwrap(this).getNumShards()

    /**
     * The name of the parameter group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-parametergroupname)
     */
    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    /**
     * The port used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * A list of security group names to associate with this cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in
     * Amazon S3.
     *
     * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the
     * ARN cannot contain any commas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotarns)
     */
    override fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

    /**
     * The name of a snapshot from which to restore data into the new cluster .
     *
     * The snapshot status changes to restoring while the new cluster is being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotname)
     */
    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them.
     *
     * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotretentionlimit)
     */
    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your
     * shard.
     *
     * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
     * appropriate time range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snapshotwindow)
     */
    override fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

    /**
     * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns
     * the ARN of the SNS topic, such as `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * The SNS topic must be in Active status to receive notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-snstopicstatus)
     */
    override fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

    /**
     * The name of the subnet group used by the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-subnetgroupname)
     */
    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A flag to indicate if In-transit encryption is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html#cfn-memorydb-cluster-tlsenabled)
     */
    override fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.memorydb.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.memorydb.CfnClusterProps
  }
}
