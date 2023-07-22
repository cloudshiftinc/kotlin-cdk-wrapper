@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.memorydb.CfnCluster
import software.amazon.awscdk.services.memorydb.CfnClusterProps

@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _snapshotArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param aclName The name of the Access Control List to associate with the cluster . 
   */
  public fun aclName(aclName: String) {
    cdkBuilder.aclName(aclName)
  }

  /**
   * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
   * engine version upgrades after launch.
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * @param autoMinorVersionUpgrade When set to true, the cluster will automatically receive minor
   * engine version upgrades after launch.
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * @param clusterEndpoint The cluster 's configuration endpoint.
   */
  public fun clusterEndpoint(clusterEndpoint: IResolvable) {
    cdkBuilder.clusterEndpoint(clusterEndpoint)
  }

  /**
   * @param clusterEndpoint The cluster 's configuration endpoint.
   */
  public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty) {
    cdkBuilder.clusterEndpoint(clusterEndpoint)
  }

  /**
   * @param clusterName The name of the cluster . 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param dataTiering Enables data tiering.
   * Data tiering is only supported for replication groups using the r6gd node type. This parameter
   * must be set to true when using r6gd nodes. For more information, see [Data
   * tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html) .
   */
  public fun dataTiering(dataTiering: String) {
    cdkBuilder.dataTiering(dataTiering)
  }

  /**
   * @param description A description of the cluster .
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engineVersion The Redis engine version used by the cluster .
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param finalSnapshotName The user-supplied name of a final cluster snapshot.
   * This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then
   * deletes the cluster immediately afterward.
   */
  public fun finalSnapshotName(finalSnapshotName: String) {
    cdkBuilder.finalSnapshotName(finalSnapshotName)
  }

  /**
   * @param kmsKeyId The ID of the KMS key used to encrypt the cluster .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param maintenanceWindow Specifies the weekly time range during which maintenance on the
   * cluster is performed.
   * It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum
   * maintenance window is a 60 minute period.
   *
   * *Pattern* : `ddd:hh24:mi-ddd:hh24:mi`
   */
  public fun maintenanceWindow(maintenanceWindow: String) {
    cdkBuilder.maintenanceWindow(maintenanceWindow)
  }

  /**
   * @param nodeType The cluster 's node type. 
   */
  public fun nodeType(nodeType: String) {
    cdkBuilder.nodeType(nodeType)
  }

  /**
   * @param numReplicasPerShard The number of replicas to apply to each shard.
   * *Default value* : `1`
   *
   * *Maximum value* : `5`
   */
  public fun numReplicasPerShard(numReplicasPerShard: Number) {
    cdkBuilder.numReplicasPerShard(numReplicasPerShard)
  }

  /**
   * @param numShards The number of shards in the cluster .
   */
  public fun numShards(numShards: Number) {
    cdkBuilder.numShards(numShards)
  }

  /**
   * @param parameterGroupName The name of the parameter group used by the cluster .
   */
  public fun parameterGroupName(parameterGroupName: String) {
    cdkBuilder.parameterGroupName(parameterGroupName)
  }

  /**
   * @param port The port used by the cluster .
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param securityGroupIds A list of security group names to associate with this cluster .
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds A list of security group names to associate with this cluster .
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
   * snapshot files stored in Amazon S3.
   * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the ARN
   * cannot contain any commas.
   */
  public fun snapshotArns(vararg snapshotArns: String) {
    _snapshotArns.addAll(listOf(*snapshotArns))
  }

  /**
   * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the RDB
   * snapshot files stored in Amazon S3.
   * The snapshot files are used to populate the new cluster . The Amazon S3 object name in the ARN
   * cannot contain any commas.
   */
  public fun snapshotArns(snapshotArns: Collection<String>) {
    _snapshotArns.addAll(snapshotArns)
  }

  /**
   * @param snapshotName The name of a snapshot from which to restore data into the new cluster .
   * The snapshot status changes to restoring while the new cluster is being created.
   */
  public fun snapshotName(snapshotName: String) {
    cdkBuilder.snapshotName(snapshotName)
  }

  /**
   * @param snapshotRetentionLimit The number of days for which MemoryDB retains automatic snapshots
   * before deleting them.
   * For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is
   * retained for 5 days before being deleted.
   */
  public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
    cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
  }

  /**
   * @param snapshotWindow The daily time range (in UTC) during which MemoryDB begins taking a daily
   * snapshot of your shard.
   * Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an
   * appropriate time range.
   */
  public fun snapshotWindow(snapshotWindow: String) {
    cdkBuilder.snapshotWindow(snapshotWindow)
  }

  /**
   * @param snsTopicArn When you pass the logical ID of this resource to the intrinsic `Ref`
   * function, Ref returns the ARN of the SNS topic, such as
   * `arn:aws:memorydb:us-east-1:123456789012:mySNSTopic`.
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  /**
   * @param snsTopicStatus The SNS topic must be in Active status to receive notifications.
   */
  public fun snsTopicStatus(snsTopicStatus: String) {
    cdkBuilder.snsTopicStatus(snsTopicStatus)
  }

  /**
   * @param subnetGroupName The name of the subnet group used by the cluster .
   */
  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
   */
  public fun tlsEnabled(tlsEnabled: Boolean) {
    cdkBuilder.tlsEnabled(tlsEnabled)
  }

  /**
   * @param tlsEnabled A flag to indicate if In-transit encryption is enabled.
   */
  public fun tlsEnabled(tlsEnabled: IResolvable) {
    cdkBuilder.tlsEnabled(tlsEnabled)
  }

  public fun build(): CfnClusterProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
