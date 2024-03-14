package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDBClusterProps {
  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon services on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
   */
  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

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
   */
  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
   */
  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * Contains a user-supplied DB cluster identifier.
   *
   * This identifier is the unique key that identifies a DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * Provides the name of the DB cluster parameter group.
   *
   * An update may require some interruption. See
   * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
   * in the Amazon Neptune User Guide for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
   */
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

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
   */
  public fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   *
   * If not specified, the default port used is `8182` .
   *
   *
   * The `Port` property will soon be deprecated. Please update existing templates to use the new
   * `DBPort` property that has the same functionality.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbport)
   */
  public fun dbPort(): Number? = unwrap(this).getDbPort()

  /**
   * Specifies information on the subnet group associated with the DB cluster, including the name,
   * description, and subnets in the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
   */
  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * Indicates the database engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
   */
  public fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

  /**
   * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the daily time range during which automated backups are created if automated backups
   * are enabled, as determined by the `BackupRetentionPeriod` .
   *
   * An update may require some interruption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * Specifies the weekly time range during which system maintenance can occur, in Universal
   * Coordinated Time (UTC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

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
   */
  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

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
   */
  public fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
   */
  public fun serverlessScalingConfiguration(): Any? =
      unwrap(this).getServerlessScalingConfiguration()

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
   */
  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

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
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

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
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * The tags assigned to this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnDBClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots
     * are retained.
     * An update may require some interruption. See
     * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
     * in the Amazon Neptune User Guide for more information.
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    /**
     * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier.
     * This identifier is the unique key that identifies a DB cluster.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbClusterParameterGroupName Provides the name of the DB cluster parameter group.
     * An update may require some interruption. See
     * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
     * in the Amazon Neptune User Guide for more information.
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

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
     * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version
     * upgrades.
     */
    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

    /**
     * @param dbPort The port number on which the DB instances in the DB cluster accept connections.
     * If not specified, the default port used is `8182` .
     *
     *
     * The `Port` property will soon be deprecated. Please update existing templates to use the new
     * `DBPort` property that has the same functionality.
     */
    public fun dbPort(dbPort: Number)

    /**
     * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet group.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled.
     * The database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled.
     * The database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs.
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs.
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * @param engineVersion Indicates the database engine version.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false.
     */
    public fun iamAuthEnabled(iamAuthEnabled: Boolean)

    /**
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false.
     */
    public fun iamAuthEnabled(iamAuthEnabled: IResolvable)

    /**
     * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the
     * encrypted DB cluster.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param preferredBackupWindow Specifies the daily time range during which automated backups
     * are created if automated backups are enabled, as determined by the `BackupRetentionPeriod` .
     * An update may require some interruption.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     * maintenance can occur, in Universal Coordinated Time (UTC).
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param restoreToTime Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
     * with a default configuration and default security group.
     *
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
     * cluster restore point with the same configuration as the original source DB cluster, except that
     * the new DB cluster is created with the default security group.
     */
    public fun restoreToTime(restoreToTime: String)

    /**
     * @param restoreType Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot
     * with a default configuration and default security group.
     *
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB
     * cluster restore point with the same configuration as the original source DB cluster, except that
     * the new DB cluster is created with the default security group.
     */
    public fun restoreType(restoreType: String)

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable)

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty)

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57231fc0e580f9fe8c798e5b3ebf0d30ee11e862ac996a5251d53b67bc91d94b")
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
     * identifier of an existing snapshot.
     * After you restore a DB cluster using a `SnapshotIdentifier` , you must specify the same
     * `SnapshotIdentifier` for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the
     * database is not changed.
     *
     * However, if you don't specify the `SnapshotIdentifier` , an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the
     * previous snapshot restore property, the DB cluster is restored from the snapshot specified by
     * the `SnapshotIdentifier` , and the original DB cluster is deleted.
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

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
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

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
    public fun storageEncrypted(storageEncrypted: Boolean)

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
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * @param tags The tags assigned to this cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to this cluster.
     */
    public fun tags(vararg tags: CfnTag)

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
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

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
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.neptune.CfnDBClusterProps.builder()

    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots
     * are retained.
     * An update may require some interruption. See
     * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
     * in the Amazon Neptune User Guide for more information.
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    /**
     * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier.
     * This identifier is the unique key that identifies a DB cluster.
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbClusterParameterGroupName Provides the name of the DB cluster parameter group.
     * An update may require some interruption. See
     * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
     * in the Amazon Neptune User Guide for more information.
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
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
     * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version
     * upgrades.
     */
    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    /**
     * @param dbPort The port number on which the DB instances in the DB cluster accept connections.
     * If not specified, the default port used is `8182` .
     *
     *
     * The `Port` property will soon be deprecated. Please update existing templates to use the new
     * `DBPort` property that has the same functionality.
     */
    override fun dbPort(dbPort: Number) {
      cdkBuilder.dbPort(dbPort)
    }

    /**
     * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet group.
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled.
     * The database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled.
     * The database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs.
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs.
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * @param engineVersion Indicates the database engine version.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false.
     */
    override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    /**
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false.
     */
    override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the
     * encrypted DB cluster.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param preferredBackupWindow Specifies the daily time range during which automated backups
     * are created if automated backups are enabled, as determined by the `BackupRetentionPeriod` .
     * An update may require some interruption.
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     * maintenance can occur, in Universal Coordinated Time (UTC).
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
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
    override fun restoreToTime(restoreToTime: String) {
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
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    override fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(CfnDBCluster.ServerlessScalingConfigurationProperty::unwrap))
    }

    /**
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57231fc0e580f9fe8c798e5b3ebf0d30ee11e862ac996a5251d53b67bc91d94b")
    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessScalingConfiguration(CfnDBCluster.ServerlessScalingConfigurationProperty(serverlessScalingConfiguration))

    /**
     * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
     * identifier of an existing snapshot.
     * After you restore a DB cluster using a `SnapshotIdentifier` , you must specify the same
     * `SnapshotIdentifier` for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the
     * database is not changed.
     *
     * However, if you don't specify the `SnapshotIdentifier` , an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the
     * previous snapshot restore property, the DB cluster is restored from the snapshot specified by
     * the `SnapshotIdentifier` , and the original DB cluster is deleted.
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
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
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
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
    override fun storageEncrypted(storageEncrypted: Boolean) {
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
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * @param tags The tags assigned to this cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to this cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
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
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterProps,
  ) : CdkObject(cdkObject), CfnDBClusterProps {
    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     */
    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created
     * in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

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
     */
    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    /**
     * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
     */
    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * Contains a user-supplied DB cluster identifier.
     *
     * This identifier is the unique key that identifies a DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    /**
     * Provides the name of the DB cluster parameter group.
     *
     * An update may require some interruption. See
     * [ModifyDBInstance](https://docs.aws.amazon.com/neptune/latest/userguide/api-instances.html#ModifyDBInstance)
     * in the Amazon Neptune User Guide for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
     */
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

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
     * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version
     * upgrades.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbinstanceparametergroupname)
     */
    override fun dbInstanceParameterGroupName(): String? =
        unwrap(this).getDbInstanceParameterGroupName()

    /**
     * The port number on which the DB instances in the DB cluster accept connections.
     *
     * If not specified, the default port used is `8182` .
     *
     *
     * The `Port` property will soon be deprecated. Please update existing templates to use the new
     * `DBPort` property that has the same functionality.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbport)
     */
    override fun dbPort(): Number? = unwrap(this).getDbPort()

    /**
     * Specifies information on the subnet group associated with the DB cluster, including the name,
     * description, and subnets in the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * Indicates whether or not the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * Specifies a list of log types that are enabled for export to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
     */
    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    /**
     * Indicates the database engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts
     * is enabled, and otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
     */
    override fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

    /**
     * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the daily time range during which automated backups are created if automated
     * backups are enabled, as determined by the `BackupRetentionPeriod` .
     *
     * An update may require some interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * Specifies the weekly time range during which system maintenance can occur, in Universal
     * Coordinated Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

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
     */
    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

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
     */
    override fun restoreType(): String? = unwrap(this).getRestoreType()

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     */
    override fun serverlessScalingConfiguration(): Any? =
        unwrap(this).getServerlessScalingConfiguration()

    /**
     * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing
     * snapshot.
     *
     * After you restore a DB cluster using a `SnapshotIdentifier` , you must specify the same
     * `SnapshotIdentifier` for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the
     * database is not changed.
     *
     * However, if you don't specify the `SnapshotIdentifier` , an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the
     * previous snapshot restore property, the DB cluster is restored from the snapshot specified by
     * the `SnapshotIdentifier` , and the original DB cluster is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier)
     */
    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

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
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

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
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    /**
     * The tags assigned to this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterProps):
        CfnDBClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.neptune.CfnDBClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.neptune.CfnDBClusterProps
  }
}
