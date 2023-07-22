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
import software.constructs.Construct

/**
 * The `AWS::Neptune::DBCluster` resource creates an Amazon Neptune DB cluster. Neptune is a fully
 * managed graph database.
 *
 *
 * Currently, you can create this resource only in AWS Regions in which Amazon Neptune is supported.
 *
 *
 * If no `DeletionPolicy` is set for `AWS::Neptune::DBCluster` resources, the default deletion
 * behavior is that the entire volume will be deleted without a snapshot. To retain a backup of the
 * volume, the `DeletionPolicy` should be set to `Snapshot` . For more information about how AWS
 * CloudFormation deletes resources, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * You can use `AWS::Neptune::DBCluster.DeletionProtection` to help guard against unintended
 * deletion of your DB cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
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
public class CfnDBClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBCluster.Builder = CfnDBCluster.Builder.create(scope, id)

  private val _associatedRoles: MutableList<Any> = mutableListOf()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(vararg associatedRoles: Any) {
    _associatedRoles.addAll(listOf(*associatedRoles))
  }

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(associatedRoles: Collection<Any>) {
    _associatedRoles.addAll(associatedRoles)
  }

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(associatedRoles: IResolvable) {
    cdkBuilder.associatedRoles(associatedRoles)
  }

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
   * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
   * cluster can be created in. 
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
   * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
   * cluster can be created in. 
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * Specifies the number of days for which automatic DB snapshots are retained.
   *
   * An update may require some interruption. See
   * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
   * in the Amazon Neptune User Guide for more information.
   *
   * Default: - 1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod)
   * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots are
   * retained. 
   */
  public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
  }

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
   * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB cluster
   * that is created.*. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
   * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB cluster
   * that is created.*. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * Contains a user-supplied DB cluster identifier.
   *
   * This identifier is the unique key that identifies a DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
   * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier. 
   */
  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  /**
   * Provides the name of the DB cluster parameter group.
   *
   * An update may require some interruption. See
   * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
   * in the Amazon Neptune User Guide for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
   * @param dbClusterParameterGroupName Provides the name of the DB cluster parameter group. 
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   *
   * Used only in case of a major engine version upgrade request
   *
   * Note that when you apply a parameter group using `DBInstanceParameterGroupName` , parameter
   * changes are applied immediately, not during the next maintenance window.
   *
   * **Constraints** - The DB parameter group must be in the same DB parameter group family as the
   * target DB cluster version.
   *
   * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version upgrades.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbinstanceparametergroupname)
   * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
   * instances of the DB cluster. 
   */
  public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
  }

  /**
   * Specifies information on the subnet group associated with the DB cluster, including the name,
   * description, and subnets in the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
   * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
   * cluster, including the name, description, and subnets in the subnet group. 
   */
  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
   * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
   * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
   * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export to
   * CloudWatch Logs. 
   */
  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
   * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export to
   * CloudWatch Logs. 
   */
  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  /**
   * Indicates the database engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-engineversion)
   * @param engineVersion Indicates the database engine version. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
   * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
   * to database accounts is enabled, and otherwise false. 
   */
  public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
   * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
   * to database accounts is enabled, and otherwise false. 
   */
  public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
   * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted
   * DB cluster. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * Specifies the daily time range during which automated backups are created if automated backups
   * are enabled, as determined by the `BackupRetentionPeriod` .
   *
   * An update may require some interruption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
   * @param preferredBackupWindow Specifies the daily time range during which automated backups are
   * created if automated backups are enabled, as determined by the `BackupRetentionPeriod` . 
   */
  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
  }

  /**
   * Specifies the weekly time range during which system maintenance can occur, in Universal
   * Coordinated Time (UTC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
   * @param preferredMaintenanceWindow Specifies the weekly time range during which system
   * maintenance can occur, in Universal Coordinated Time (UTC). 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   *
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-restoretotime)
   * @param restoreToTime Creates a new DB cluster from a DB snapshot or DB cluster snapshot. 
   */
  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   *
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   *
   * Default: - "full-copy"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-restoretype)
   * @param restoreType Creates a new DB cluster from a DB snapshot or DB cluster snapshot. 
   */
  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
   * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
   * Serverless DB cluster. 
   */
  public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
    cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration)
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
   * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
   * Serverless DB cluster. 
   */
  public
      fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty) {
    cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration)
  }

  /**
   * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing
   * snapshot.
   *
   * After you restore a DB cluster using a `SnapshotIdentifier` , you must specify the same
   * `SnapshotIdentifier` for any future updates to the DB cluster. When you specify this property for
   * an update, the DB cluster is not restored from the snapshot again, and the data in the database is
   * not changed.
   *
   * However, if you don't specify the `SnapshotIdentifier` , an empty DB cluster is created, and
   * the original DB cluster is deleted. If you specify a property that is different from the previous
   * snapshot restore property, the DB cluster is restored from the snapshot specified by the
   * `SnapshotIdentifier` , and the original DB cluster is deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier)
   * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
   * identifier of an existing snapshot. 
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   *
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-sourcedbclusteridentifier)
   * @param sourceDbClusterIdentifier Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot. 
   */
  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   *
   * If you specify the `DBClusterIdentifier` , `DBSnapshotIdentifier` , or
   * `SourceDBInstanceIdentifier` property, don't specify this property. The value is inherited from
   * the cluster, snapshot, or source DB instance. If you specify the `KmsKeyId` property, you must
   * enable encryption.
   *
   * If you specify the `KmsKeyId` , you must enable encryption by setting `StorageEncrypted` to
   * true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted)
   * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   *
   * If you specify the `DBClusterIdentifier` , `DBSnapshotIdentifier` , or
   * `SourceDBInstanceIdentifier` property, don't specify this property. The value is inherited from
   * the cluster, snapshot, or source DB instance. If you specify the `KmsKeyId` property, you must
   * enable encryption.
   *
   * If you specify the `KmsKeyId` , you must enable encryption by setting `StorageEncrypted` to
   * true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted)
   * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
   */
  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * The tags assigned to this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
   * @param tags The tags assigned to this cluster. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags assigned to this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
   * @param tags The tags assigned to this cluster. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   *
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-uselatestrestorabletime)
   * @param useLatestRestorableTime Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot. 
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   *
   * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
   * with a default configuration and default security group.
   *
   * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
   * cluster restore point with the same configuration as the original source DB cluster, except that
   * the new DB cluster is created with the default security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-uselatestrestorabletime)
   * @param useLatestRestorableTime Creates a new DB cluster from a DB snapshot or DB cluster
   * snapshot. 
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
   * to. 
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
   * to. 
   */
  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnDBCluster {
    if(_associatedRoles.isNotEmpty()) cdkBuilder.associatedRoles(_associatedRoles)
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_enableCloudwatchLogsExports.isNotEmpty())
        cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
