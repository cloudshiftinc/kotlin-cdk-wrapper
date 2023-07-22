@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

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
import software.amazon.awscdk.services.docdb.CfnDBClusterProps

/**
 * Properties for defining a `CfnDBCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .backupRetentionPeriod(123)
 * .copyTagsToSnapshot(false)
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .deletionProtection(false)
 * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
 * .engineVersion("engineVersion")
 * .kmsKeyId("kmsKeyId")
 * .masterUsername("masterUsername")
 * .masterUserPassword("masterUserPassword")
 * .port(123)
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .restoreToTime("restoreToTime")
 * .restoreType("restoreType")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html)
 */
@CdkDslMarker
public class CfnDBClusterPropsDsl {
  private val cdkBuilder: CfnDBClusterProps.Builder = CfnDBClusterProps.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  /**
   * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the cluster
   * can be created in.
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the cluster
   * can be created in.
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * @param backupRetentionPeriod The number of days for which automated backups are retained. You
   * must specify a minimum value of 1.
   * Default: 1
   *
   * Constraints:
   *
   * * Must be a value from 1 to 35.
   */
  public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
  }

  /**
   * @param copyTagsToSnapshot the value to be set.
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * @param copyTagsToSnapshot the value to be set.
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * @param dbClusterIdentifier The cluster identifier. This parameter is stored as a lowercase
   * string.
   * Constraints:
   *
   * * Must contain from 1 to 63 letters, numbers, or hyphens.
   * * The first character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * Example: `my-cluster`
   */
  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  /**
   * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
   * this cluster.
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * @param dbSubnetGroupName A subnet group to associate with this cluster.
   * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
   *
   * Example: `mySubnetgroup`
   */
  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  /**
   * @param deletionProtection Protects clusters from being accidentally deleted.
   * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
   * disabled.
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param deletionProtection Protects clusters from being accidentally deleted.
   * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
   * disabled.
   */
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param enableCloudwatchLogsExports The list of log types that need to be enabled for exporting
   * to Amazon CloudWatch Logs.
   * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
   * DocumentDB
   * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
   * [Profiling Amazon DocumentDB
   * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
   */
  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  /**
   * @param enableCloudwatchLogsExports The list of log types that need to be enabled for exporting
   * to Amazon CloudWatch Logs.
   * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
   * DocumentDB
   * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
   * [Profiling Amazon DocumentDB
   * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
   */
  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  /**
   * @param engineVersion The version number of the database engine to use.
   * The `--engine-version` will default to the latest major engine version. For production
   * workloads, we recommend explicitly declaring this parameter with the intended major engine
   * version.
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster.
   * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If
   * you are creating a cluster using the same AWS account that owns the AWS KMS encryption key that is
   * used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN for the AWS
   * KMS encryption key.
   *
   * If an encryption key is not specified in `KmsKeyId` :
   *
   * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
   * encryption key.
   *
   * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
   * different default encryption key for each AWS Regions .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param masterUserPassword The password for the master database user.
   * This password can contain any printable ASCII character except forward slash (/), double quote
   * ("), or the "at" symbol (&#64;).
   *
   * Constraints: Must contain from 8 to 100 characters.
   */
  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  /**
   * @param masterUsername The name of the master user for the cluster.
   * Constraints:
   *
   * * Must be from 1 to 63 letters or numbers.
   * * The first character must be a letter.
   * * Cannot be a reserved word for the chosen database engine.
   */
  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
  }

  /**
   * @param port Specifies the port that the database engine is listening on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param preferredBackupWindow The daily time range during which automated backups are created if
   * automated backups are enabled using the `BackupRetentionPeriod` parameter.
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region .
   *
   * Constraints:
   *
   * * Must be in the format `hh24:mi-hh24:mi` .
   * * Must be in Universal Coordinated Time (UTC).
   * * Must not conflict with the preferred maintenance window.
   * * Must be at least 30 minutes.
   */
  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
  }

  /**
   * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
   * occur, in Universal Coordinated Time (UTC).
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region , occurring on a random day of the week.
   *
   * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
   *
   * Constraints: Minimum 30-minute window.
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * @param restoreToTime the value to be set.
   */
  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  /**
   * @param restoreType the value to be set.
   */
  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  /**
   * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore from.
   * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
   * However, you can use only the ARN to specify a snapshot.
   *
   * Constraints:
   *
   * * Must match the identifier of an existing snapshot.
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  /**
   * @param sourceDbClusterIdentifier the value to be set.
   */
  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  /**
   * @param storageEncrypted Specifies whether the cluster is encrypted.
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * @param storageEncrypted Specifies whether the cluster is encrypted.
   */
  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * @param tags The tags to be assigned to the cluster.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to be assigned to the cluster.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param useLatestRestorableTime the value to be set.
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * @param useLatestRestorableTime the value to be set.
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
   */
  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnDBClusterProps {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_enableCloudwatchLogsExports.isNotEmpty())
        cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
