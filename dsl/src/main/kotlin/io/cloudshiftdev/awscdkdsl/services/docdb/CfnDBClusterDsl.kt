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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.docdb.CfnDBCluster
import software.constructs.Construct

/**
 * The `AWS::DocDB::DBCluster` Amazon DocumentDB (with MongoDB compatibility) resource describes a
 * DBCluster.
 *
 * Amazon DocumentDB is a fully managed, MongoDB-compatible document database engine. For more
 * information, see
 * [DBCluster](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBCluster.html) in
 * the *Amazon DocumentDB Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
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
@CdkDslMarker
public class CfnDBClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBCluster.Builder = CfnDBCluster.Builder.create(scope, id)

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     *
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     *   cluster can be created in.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     *
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     *   cluster can be created in.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * The number of days for which automated backups are retained. You must specify a minimum value
     * of 1.
     *
     * Default: 1
     *
     * Constraints:
     * * Must be a value from 1 to 35.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-backupretentionperiod)
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You
     *   must specify a minimum value of 1.
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
        cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     *
     * @param copyTagsToSnapshot
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     *
     * @param copyTagsToSnapshot
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * The cluster identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusteridentifier)
     *
     * @param dbClusterIdentifier The cluster identifier. This parameter is stored as a lowercase
     *   string.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * The name of the cluster parameter group to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusterparametergroupname)
     *
     * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
     *   this cluster.
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
        cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * A subnet group to associate with this cluster.
     *
     * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
     *
     * Example: `mySubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbsubnetgroupname)
     *
     * @param dbSubnetGroupName A subnet group to associate with this cluster.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     *
     * @param deletionProtection Protects clusters from being accidentally deleted.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     *
     * @param deletionProtection Protects clusters from being accidentally deleted.
     */
    public fun deletionProtection(deletionProtection: IResolvable) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
     *
     * You can enable audit logs or profiler logs. For more information, see
     * [Auditing Amazon DocumentDB Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html)
     * and
     * [Profiling Amazon DocumentDB Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-enablecloudwatchlogsexports)
     *
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     *   exporting to Amazon CloudWatch Logs.
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
        _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
    }

    /**
     * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
     *
     * You can enable audit logs or profiler logs. For more information, see
     * [Auditing Amazon DocumentDB Events](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html)
     * and
     * [Profiling Amazon DocumentDB Operations](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-enablecloudwatchlogsexports)
     *
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     *   exporting to Amazon CloudWatch Logs.
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
        _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
    }

    /**
     * The version number of the database engine to use.
     *
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-engineversion)
     *
     * @param engineVersion The version number of the database engine to use.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The AWS KMS key identifier for an encrypted cluster.
     *
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key.
     * If you are creating a cluster using the same AWS account that owns the AWS KMS encryption key
     * that is used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN
     * for the AWS KMS encryption key.
     *
     * If an encryption key is not specified in `KmsKeyId` :
     * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
     *   encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-kmskeyid)
     *
     * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The password for the master database user.
     *
     * This password can contain any printable ASCII character except forward slash (/), double
     * quote ("), or the "at" symbol (&#64;).
     *
     * Constraints: Must contain from 8 to 100 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masteruserpassword)
     *
     * @param masterUserPassword The password for the master database user.
     */
    public fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * The name of the master user for the cluster.
     *
     * Constraints:
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word for the chosen database engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masterusername)
     *
     * @param masterUsername The name of the master user for the cluster.
     */
    public fun masterUsername(masterUsername: String) {
        cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-port)
     *
     * @param port Specifies the port that the database engine is listening on.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled using the `BackupRetentionPeriod` parameter.
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region .
     *
     * Constraints:
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredbackupwindow)
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created
     *   if automated backups are enabled using the `BackupRetentionPeriod` parameter.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

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
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     *   occur, in Universal Coordinated Time (UTC).
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The date and time to restore the cluster to.
     *
     * Valid values: A time in Universal Coordinated Time (UTC) format.
     *
     * Constraints:
     * * Must be before the latest restorable time for the instance.
     * * Must be specified if the `UseLatestRestorableTime` parameter is not provided.
     * * Cannot be specified if the `UseLatestRestorableTime` parameter is `true` .
     * * Cannot be specified if the `RestoreType` parameter is `copy-on-write` .
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-restoretotime)
     *
     * @param restoreToTime The date and time to restore the cluster to.
     */
    public fun restoreToTime(restoreToTime: String) {
        cdkBuilder.restoreToTime(restoreToTime)
    }

    /**
     * The type of restore to be performed. You can specify one of the following values:.
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
     *
     * @param restoreType The type of restore to be performed. You can specify one of the following
     *   values:.
     */
    public fun restoreType(restoreType: String) {
        cdkBuilder.restoreType(restoreType)
    }

    /**
     * The identifier for the snapshot or cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a cluster snapshot.
     * However, you can use only the ARN to specify a snapshot.
     *
     * Constraints:
     * * Must match the identifier of an existing snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-snapshotidentifier)
     *
     * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore
     *   from.
     */
    public fun snapshotIdentifier(snapshotIdentifier: String) {
        cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * The identifier of the source cluster from which to restore.
     *
     * Constraints:
     * * Must match the identifier of an existing `DBCluster` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-sourcedbclusteridentifier)
     *
     * @param sourceDbClusterIdentifier The identifier of the source cluster from which to restore.
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
        cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     *
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     *
     * @param storageEncrypted Specifies whether the cluster is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

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
     * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage
     * type is returned in the response. The storage type isn't returned when you set it to
     * `standard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storagetype)
     *
     * @param storageType The storage type to associate with the DB cluster.
     */
    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     *
     * @param tags The tags to be assigned to the cluster.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     *
     * @param tags The tags to be assigned to the cluster.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     *
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     *   latest restorable backup time, and `false` otherwise.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
        cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     *
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     *   latest restorable backup time, and `false` otherwise.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
        cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnDBCluster {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_enableCloudwatchLogsExports.isNotEmpty())
            cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
