@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.neptune.CfnDBCluster
import software.amazon.awscdk.services.neptune.CfnDBClusterProps

/**
 * Properties for defining a `CfnDBCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
 * .associatedRoles(List.of(DBClusterRoleProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .featureName("featureName")
 * .build()))
 * .availabilityZones(List.of("availabilityZones"))
 * .backupRetentionPeriod(123)
 * .copyTagsToSnapshot(false)
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .deletionProtection(false)
 * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
 * .engineVersion("engineVersion")
 * .iamAuthEnabled(false)
 * .kmsKeyId("kmsKeyId")
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .restoreToTime("restoreToTime")
 * .restoreType("restoreType")
 * .serverlessScalingConfiguration(ServerlessScalingConfigurationProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .snapshotIdentifier("snapshotIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .storageEncrypted(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useLatestRestorableTime(false)
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html)
 */
@CdkDslMarker
public class CfnDBClusterPropsDsl {
  private val cdkBuilder: CfnDBClusterProps.Builder = CfnDBClusterProps.builder()

  private val _associatedRoles: MutableList<Any> = mutableListOf()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  /**
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster.
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   */
  public fun associatedRoles(vararg associatedRoles: Any) {
    _associatedRoles.addAll(listOf(*associatedRoles))
  }

  /**
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster.
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   */
  public fun associatedRoles(associatedRoles: Collection<Any>) {
    _associatedRoles.addAll(associatedRoles)
  }

  /**
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster.
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   */
  public fun associatedRoles(associatedRoles: IResolvable) {
    cdkBuilder.associatedRoles(associatedRoles)
  }

  /**
   * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
   * cluster can be created in.
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
   * cluster can be created in.
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots are
   * retained.
   * An update may require some interruption. See
   * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
   * in the Amazon Neptune User Guide for more information.
   */
  public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
  }

  /**
   * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB cluster
   * that is created.*.
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB cluster
   * that is created.*.
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier.
   * This identifier is the unique key that identifies a DB cluster.
   */
  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  /**
   * @param dbClusterParameterGroupName Provides the name of the DB cluster parameter group.
   * An update may require some interruption. See
   * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
   * in the Amazon Neptune User Guide for more information.
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
   * instances of the DB cluster.
   * Used only in case of a major engine version upgrade request
   *
   * Note that when you apply a parameter group using `DBInstanceParameterGroupName` , parameter
   * changes are applied immediately, not during the next maintenance window.
   *
   * **Constraints** - The DB parameter group must be in the same DB parameter group family as the
   * target DB cluster version.
   *
   * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version upgrades.
   */
  public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
  }

  /**
   * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
   * cluster, including the name, description, and subnets in the subnet group.
   */
  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  /**
   * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
   * enabled.
   * The database can't be deleted when deletion protection is enabled.
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
   * enabled.
   * The database can't be deleted when deletion protection is enabled.
   */
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export to
   * CloudWatch Logs.
   */
  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  /**
   * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export to
   * CloudWatch Logs.
   */
  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  /**
   * @param engineVersion Indicates the database engine version.
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
   * to database accounts is enabled, and otherwise false.
   */
  public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
   * to database accounts is enabled, and otherwise false.
   */
  public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted
   * DB cluster.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param preferredBackupWindow Specifies the daily time range during which automated backups are
   * created if automated backups are enabled, as determined by the `BackupRetentionPeriod` .
   * An update may require some interruption.
   */
  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
  }

  /**
   * @param preferredMaintenanceWindow Specifies the weekly time range during which system
   * maintenance can occur, in Universal Coordinated Time (UTC).
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * @param restoreToTime Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   */
  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  /**
   * @param restoreType Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   */
  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  /**
   * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
   * Serverless DB cluster.
   */
  public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
    cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration)
  }

  /**
   * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
   * Serverless DB cluster.
   */
  public
      fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty) {
    cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration)
  }

  /**
   * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
   * identifier of an existing snapshot.
   * After you restore a DB cluster using a `SnapshotIdentifier` , you must specify the same
   * `SnapshotIdentifier` for any future updates to the DB cluster. When you specify this property for
   * an update, the DB cluster is not restored from the snapshot again, and the data in the database is
   * not changed.
   *
   * However, if you don't specify the `SnapshotIdentifier` , an empty DB cluster is created, and
   * the original DB cluster is deleted. If you specify a property that is different from the previous
   * snapshot restore property, the DB cluster is restored from the snapshot specified by the
   * `SnapshotIdentifier` , and the original DB cluster is deleted.
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  /**
   * @param sourceDbClusterIdentifier Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot.
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   */
  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  /**
   * @param storageEncrypted Indicates whether the DB cluster is encrypted.
   * If you specify the `DBClusterIdentifier` , `DBSnapshotIdentifier` , or
   * `SourceDBInstanceIdentifier` property, don't specify this property. The value is inherited from
   * the cluster, snapshot, or source DB instance. If you specify the `KmsKeyId` property, you must
   * enable encryption.
   *
   * If you specify the `KmsKeyId` , you must enable encryption by setting `StorageEncrypted` to
   * true.
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * @param storageEncrypted Indicates whether the DB cluster is encrypted.
   * If you specify the `DBClusterIdentifier` , `DBSnapshotIdentifier` , or
   * `SourceDBInstanceIdentifier` property, don't specify this property. The value is inherited from
   * the cluster, snapshot, or source DB instance. If you specify the `KmsKeyId` property, you must
   * enable encryption.
   *
   * If you specify the `KmsKeyId` , you must enable encryption by setting `StorageEncrypted` to
   * true.
   */
  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * @param tags The tags assigned to this cluster.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags assigned to this cluster.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param useLatestRestorableTime Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot.
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * @param useLatestRestorableTime Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot.
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
   * to.
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
   * to.
   */
  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnDBClusterProps {
    if(_associatedRoles.isNotEmpty()) cdkBuilder.associatedRoles(_associatedRoles)
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_enableCloudwatchLogsExports.isNotEmpty())
        cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
