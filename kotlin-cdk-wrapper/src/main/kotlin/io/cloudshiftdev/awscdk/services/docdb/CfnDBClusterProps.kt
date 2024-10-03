@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

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

/**
 * Properties for defining a `CfnDBCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
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
 * .storageType("storageType")
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
public interface CfnDBClusterProps {
  /**
   * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * The number of days for which automated backups are retained. You must specify a minimum value
   * of 1.
   *
   * Default: 1
   *
   * Constraints:
   *
   * * Must be a value from 1 to 35.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-backupretentionperiod)
   */
  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
   */
  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * The cluster identifier. This parameter is stored as a lowercase string.
   *
   * Constraints:
   *
   * * Must contain from 1 to 63 letters, numbers, or hyphens.
   * * The first character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * Example: `my-cluster`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * The name of the cluster parameter group to associate with this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusterparametergroupname)
   */
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  /**
   * A subnet group to associate with this cluster.
   *
   * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
   *
   * Example: `mySubnetgroup`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Protects clusters from being accidentally deleted.
   *
   * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
   * disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
   *
   * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
   * DocumentDB
   * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
   * [Profiling Amazon DocumentDB
   * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-enablecloudwatchlogsexports)
   */
  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * The version number of the database engine to use.
   *
   * The `--engine-version` will default to the latest major engine version. For production
   * workloads, we recommend explicitly declaring this parameter with the intended major engine
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The AWS KMS key identifier for an encrypted cluster.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The password for the master database user.
   *
   * This password can contain any printable ASCII character except forward slash (/), double quote
   * ("), or the "at" symbol (&#64;).
   *
   * Constraints: Must contain from 8 to 100 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masteruserpassword)
   */
  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The name of the master user for the cluster.
   *
   * Constraints:
   *
   * * Must be from 1 to 63 letters or numbers.
   * * The first character must be a letter.
   * * Cannot be a reserved word for the chosen database engine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masterusername)
   */
  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

  /**
   * Specifies the port that the database engine is listening on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled using the `BackupRetentionPeriod` parameter.
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region .
   *
   * Constraints:
   *
   * * Must be in the format `hh24:mi-hh24:mi` .
   * * Must be in Universal Coordinated Time (UTC).
   * * Must not conflict with the preferred maintenance window.
   * * Must be at least 30 minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region , occurring on a random day of the week.
   *
   * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
   *
   * Constraints: Minimum 30-minute window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The date and time to restore the cluster to.
   *
   * Valid values: A time in Universal Coordinated Time (UTC) format.
   *
   * Constraints:
   *
   * * Must be before the latest restorable time for the instance.
   * * Must be specified if the `UseLatestRestorableTime` parameter is not provided.
   * * Cannot be specified if the `UseLatestRestorableTime` parameter is `true` .
   * * Cannot be specified if the `RestoreType` parameter is `copy-on-write` .
   *
   * Example: `2015-03-07T23:45:00Z`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-restoretotime)
   */
  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  /**
   * The type of restore to be performed. You can specify one of the following values:.
   *
   * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
   * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
   *
   * Constraints: You can't specify `copy-on-write` if the engine version of the source DB cluster
   * is earlier than 1.11.
   *
   * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full copy
   * of the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-restoretype)
   */
  public fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * The identifier for the snapshot or cluster snapshot to restore from.
   *
   * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
   * However, you can use only the ARN to specify a snapshot.
   *
   * Constraints:
   *
   * * Must match the identifier of an existing snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-snapshotidentifier)
   */
  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * The identifier of the source cluster from which to restore.
   *
   * Constraints:
   *
   * * Must match the identifier of an existing `DBCluster` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-sourcedbclusteridentifier)
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * Specifies whether the cluster is encrypted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * The storage type to associate with the DB cluster.
   *
   * For information on storage types for Amazon DocumentDB clusters, see Cluster storage
   * configurations in the *Amazon DocumentDB Developer Guide* .
   *
   * Valid values for storage type - `standard | iopt1`
   *
   * Default value is `standard`
   *
   *
   * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage type
   * is returned in the response. The storage type isn't returned when you set it to `standard` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * The tags to be assigned to the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A value that is set to `true` to restore the cluster to the latest restorable backup time, and
   * `false` otherwise.
   *
   * Default: `false`
   *
   * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
   */
  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * A list of EC2 VPC security groups to associate with this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnDBClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You
     * must specify a minimum value of 1.
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35.
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * @param copyTagsToSnapshot the value to be set.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param copyTagsToSnapshot the value to be set.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

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
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
     * this cluster.
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * @param dbSubnetGroupName A subnet group to associate with this cluster.
     * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
     *
     * Example: `mySubnetgroup`
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param deletionProtection Protects clusters from being accidentally deleted.
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection Protects clusters from being accidentally deleted.
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs.
     * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
     * DocumentDB
     * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
     * [Profiling Amazon DocumentDB
     * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs.
     * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
     * DocumentDB
     * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
     * [Profiling Amazon DocumentDB
     * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * @param engineVersion The version number of the database engine to use.
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster.
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key.
     * If you are creating a cluster using the same AWS account that owns the AWS KMS encryption key
     * that is used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN
     * for the AWS KMS encryption key.
     *
     * If an encryption key is not specified in `KmsKeyId` :
     *
     * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Regions .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param masterUserPassword The password for the master database user.
     * This password can contain any printable ASCII character except forward slash (/), double
     * quote ("), or the "at" symbol (&#64;).
     *
     * Constraints: Must contain from 8 to 100 characters.
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * @param masterUsername The name of the master user for the cluster.
     * Constraints:
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word for the chosen database engine.
     */
    public fun masterUsername(masterUsername: String)

    /**
     * @param port Specifies the port that the database engine is listening on.
     */
    public fun port(port: Number)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled using the `BackupRetentionPeriod` parameter.
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region .
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param restoreToTime The date and time to restore the cluster to.
     * Valid values: A time in Universal Coordinated Time (UTC) format.
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the instance.
     * * Must be specified if the `UseLatestRestorableTime` parameter is not provided.
     * * Cannot be specified if the `UseLatestRestorableTime` parameter is `true` .
     * * Cannot be specified if the `RestoreType` parameter is `copy-on-write` .
     *
     * Example: `2015-03-07T23:45:00Z`
     */
    public fun restoreToTime(restoreToTime: String)

    /**
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:.
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * Constraints: You can't specify `copy-on-write` if the engine version of the source DB cluster
     * is earlier than 1.11.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     */
    public fun restoreType(restoreType: String)

    /**
     * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore
     * from.
     * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
     * However, you can use only the ARN to specify a snapshot.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing snapshot.
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * @param sourceDbClusterIdentifier The identifier of the source cluster from which to restore.
     * Constraints:
     *
     * * Must match the identifier of an existing `DBCluster` .
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * @param storageType The storage type to associate with the DB cluster.
     * For information on storage types for Amazon DocumentDB clusters, see Cluster storage
     * configurations in the *Amazon DocumentDB Developer Guide* .
     *
     * Valid values for storage type - `standard | iopt1`
     *
     * Default value is `standard`
     *
     *
     * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage
     * type is returned in the response. The storage type isn't returned when you set it to `standard`
     * .
     */
    public fun storageType(storageType: String)

    /**
     * @param tags The tags to be assigned to the cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be assigned to the cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise.
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    /**
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise.
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBClusterProps.builder()

    /**
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You
     * must specify a minimum value of 1.
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35.
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * @param copyTagsToSnapshot the value to be set.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param copyTagsToSnapshot the value to be set.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable.Companion::unwrap))
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
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
     * this cluster.
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * @param dbSubnetGroupName A subnet group to associate with this cluster.
     * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
     *
     * Example: `mySubnetgroup`
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param deletionProtection Protects clusters from being accidentally deleted.
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection Protects clusters from being accidentally deleted.
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs.
     * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
     * DocumentDB
     * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
     * [Profiling Amazon DocumentDB
     * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs.
     * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
     * DocumentDB
     * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
     * [Profiling Amazon DocumentDB
     * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * @param engineVersion The version number of the database engine to use.
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster.
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key.
     * If you are creating a cluster using the same AWS account that owns the AWS KMS encryption key
     * that is used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN
     * for the AWS KMS encryption key.
     *
     * If an encryption key is not specified in `KmsKeyId` :
     *
     * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Regions .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param masterUserPassword The password for the master database user.
     * This password can contain any printable ASCII character except forward slash (/), double
     * quote ("), or the "at" symbol (&#64;).
     *
     * Constraints: Must contain from 8 to 100 characters.
     */
    override fun masterUserPassword(masterUserPassword: String) {
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
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param port Specifies the port that the database engine is listening on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled using the `BackupRetentionPeriod` parameter.
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region .
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param restoreToTime The date and time to restore the cluster to.
     * Valid values: A time in Universal Coordinated Time (UTC) format.
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the instance.
     * * Must be specified if the `UseLatestRestorableTime` parameter is not provided.
     * * Cannot be specified if the `UseLatestRestorableTime` parameter is `true` .
     * * Cannot be specified if the `RestoreType` parameter is `copy-on-write` .
     *
     * Example: `2015-03-07T23:45:00Z`
     */
    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    /**
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:.
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * Constraints: You can't specify `copy-on-write` if the engine version of the source DB cluster
     * is earlier than 1.11.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     */
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    /**
     * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore
     * from.
     * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
     * However, you can use only the ARN to specify a snapshot.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing snapshot.
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * @param sourceDbClusterIdentifier The identifier of the source cluster from which to restore.
     * Constraints:
     *
     * * Must match the identifier of an existing `DBCluster` .
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param storageType The storage type to associate with the DB cluster.
     * For information on storage types for Amazon DocumentDB clusters, see Cluster storage
     * configurations in the *Amazon DocumentDB Developer Guide* .
     *
     * Valid values for storage type - `standard | iopt1`
     *
     * Default value is `standard`
     *
     *
     * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage
     * type is returned in the response. The storage type isn't returned when you set it to `standard`
     * .
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param tags The tags to be assigned to the cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be assigned to the cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise.
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise.
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterProps,
  ) : CdkObject(cdkObject),
      CfnDBClusterProps {
    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * The number of days for which automated backups are retained. You must specify a minimum value
     * of 1.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-backupretentionperiod)
     */
    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     */
    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * The cluster identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    /**
     * The name of the cluster parameter group to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusterparametergroupname)
     */
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    /**
     * A subnet group to associate with this cluster.
     *
     * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
     *
     * Example: `mySubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
     *
     * You can enable audit logs or profiler logs. For more information, see [Auditing Amazon
     * DocumentDB
     * Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html) and
     * [Profiling Amazon DocumentDB
     * Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-enablecloudwatchlogsexports)
     */
    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    /**
     * The version number of the database engine to use.
     *
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The AWS KMS key identifier for an encrypted cluster.
     *
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key.
     * If you are creating a cluster using the same AWS account that owns the AWS KMS encryption key
     * that is used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN
     * for the AWS KMS encryption key.
     *
     * If an encryption key is not specified in `KmsKeyId` :
     *
     * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The password for the master database user.
     *
     * This password can contain any printable ASCII character except forward slash (/), double
     * quote ("), or the "at" symbol (&#64;).
     *
     * Constraints: Must contain from 8 to 100 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masteruserpassword)
     */
    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * The name of the master user for the cluster.
     *
     * Constraints:
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word for the chosen database engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masterusername)
     */
    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled using the `BackupRetentionPeriod` parameter.
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region .
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The date and time to restore the cluster to.
     *
     * Valid values: A time in Universal Coordinated Time (UTC) format.
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the instance.
     * * Must be specified if the `UseLatestRestorableTime` parameter is not provided.
     * * Cannot be specified if the `UseLatestRestorableTime` parameter is `true` .
     * * Cannot be specified if the `RestoreType` parameter is `copy-on-write` .
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-restoretotime)
     */
    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

    /**
     * The type of restore to be performed. You can specify one of the following values:.
     *
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * Constraints: You can't specify `copy-on-write` if the engine version of the source DB cluster
     * is earlier than 1.11.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-restoretype)
     */
    override fun restoreType(): String? = unwrap(this).getRestoreType()

    /**
     * The identifier for the snapshot or cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
     * However, you can use only the ARN to specify a snapshot.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-snapshotidentifier)
     */
    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    /**
     * The identifier of the source cluster from which to restore.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing `DBCluster` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-sourcedbclusteridentifier)
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    /**
     * The storage type to associate with the DB cluster.
     *
     * For information on storage types for Amazon DocumentDB clusters, see Cluster storage
     * configurations in the *Amazon DocumentDB Developer Guide* .
     *
     * Valid values for storage type - `standard | iopt1`
     *
     * Default value is `standard`
     *
     *
     * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage
     * type is returned in the response. The storage type isn't returned when you set it to `standard`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     */
    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterProps):
        CfnDBClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.docdb.CfnDBClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.CfnDBClusterProps
  }
}
