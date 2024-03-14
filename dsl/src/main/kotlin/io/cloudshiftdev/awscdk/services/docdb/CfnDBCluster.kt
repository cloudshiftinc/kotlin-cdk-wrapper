package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The resource id for the cluster;
   *
   * for example: `cluster-ABCD1234EFGH5678IJKL90MNOP` . The cluster ID uniquely identifies the
   * cluster and is used in things like IAM authentication policies.
   */
  public open fun attrClusterResourceId(): String = unwrap(this).getAttrClusterResourceId()

  /**
   * The connection endpoint for the cluster, such as
   * `sample-cluster.cluster-cozrlsfrcjoc.us-east-1.docdb.amazonaws.com` .
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The port number on which the cluster accepts connections.
   *
   * For example: `27017` .
   */
  public open fun attrPort(): String = unwrap(this).getAttrPort()

  /**
   * The reader endpoint for the cluster.
   *
   * For example: `sample-cluster.cluster-ro-cozrlsfrcjoc.us-east-1.docdb.amazonaws.com` .
   */
  public open fun attrReadEndpoint(): String = unwrap(this).getAttrReadEndpoint()

  /**
   * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * The number of days for which automated backups are retained.
   *
   * You must specify a minimum value of 1.
   */
  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * The number of days for which automated backups are retained.
   *
   * You must specify a minimum value of 1.
   */
  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  /**
   *
   */
  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   *
   */
  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  /**
   *
   */
  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  /**
   * The cluster identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * The cluster identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * The name of the cluster parameter group to associate with this cluster.
   */
  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  /**
   * The name of the cluster parameter group to associate with this cluster.
   */
  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  /**
   * A subnet group to associate with this cluster.
   */
  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * A subnet group to associate with this cluster.
   */
  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  /**
   * Protects clusters from being accidentally deleted.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * Protects clusters from being accidentally deleted.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * Protects clusters from being accidentally deleted.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  /**
   * The list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(vararg `value`: String): Unit =
      enableCloudwatchLogsExports(`value`.toList())

  /**
   * The version number of the database engine to use.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version number of the database engine to use.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS KMS key identifier for an encrypted cluster.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS KMS key identifier for an encrypted cluster.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The password for the master database user.
   */
  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The password for the master database user.
   */
  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  /**
   * The name of the master user for the cluster.
   */
  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  /**
   * The name of the master user for the cluster.
   */
  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  /**
   * Specifies the port that the database engine is listening on.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * Specifies the port that the database engine is listening on.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled using the `BackupRetentionPeriod` parameter.
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled using the `BackupRetentionPeriod` parameter.
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * The date and time to restore the cluster to.
   */
  public open fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  /**
   * The date and time to restore the cluster to.
   */
  public open fun restoreToTime(`value`: String) {
    unwrap(this).setRestoreToTime(`value`)
  }

  /**
   * The type of restore to be performed.
   *
   * You can specify one of the following values:.
   */
  public open fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * The type of restore to be performed.
   *
   * You can specify one of the following values:.
   */
  public open fun restoreType(`value`: String) {
    unwrap(this).setRestoreType(`value`)
  }

  /**
   * The identifier for the snapshot or cluster snapshot to restore from.
   */
  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * The identifier for the snapshot or cluster snapshot to restore from.
   */
  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  /**
   * The identifier of the source cluster from which to restore.
   */
  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * The identifier of the source cluster from which to restore.
   */
  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  /**
   * Specifies whether the cluster is encrypted.
   */
  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Specifies whether the cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  /**
   * Specifies whether the cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  /**
   * The storage type to associate with the DB cluster.
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * The storage type to associate with the DB cluster.
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be assigned to the cluster.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be assigned to the cluster.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to be assigned to the cluster.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A value that is set to `true` to restore the cluster to the latest restorable backup time, and
   * `false` otherwise.
   */
  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * A value that is set to `true` to restore the cluster to the latest restorable backup time, and
   * `false` otherwise.
   */
  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  /**
   * A value that is set to `true` to restore the cluster to the latest restorable backup time, and
   * `false` otherwise.
   */
  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of EC2 VPC security groups to associate with this cluster.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of EC2 VPC security groups to associate with this cluster.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * A list of EC2 VPC security groups to associate with this cluster.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.CfnDBCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

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
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You
     * must specify a minimum value of 1. 
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

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
     * @param dbClusterIdentifier The cluster identifier. This parameter is stored as a lowercase
     * string. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * The name of the cluster parameter group to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
     * this cluster. 
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * A subnet group to associate with this cluster.
     *
     * Constraints: Must match the name of an existing `DBSubnetGroup` . Must not be default.
     *
     * Example: `mySubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbsubnetgroupname)
     * @param dbSubnetGroupName A subnet group to associate with this cluster. 
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     * @param deletionProtection Protects clusters from being accidentally deleted. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     * @param deletionProtection Protects clusters from being accidentally deleted. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * The version number of the database engine to use.
     *
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-engineversion)
     * @param engineVersion The version number of the database engine to use. 
     */
    public fun engineVersion(engineVersion: String)

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
     * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The password for the master database user.
     *
     * This password can contain any printable ASCII character except forward slash (/), double
     * quote ("), or the "at" symbol (&#64;).
     *
     * Constraints: Must contain from 8 to 100 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-masteruserpassword)
     * @param masterUserPassword The password for the master database user. 
     */
    public fun masterUserPassword(masterUserPassword: String)

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
     * @param masterUsername The name of the master user for the cluster. 
     */
    public fun masterUsername(masterUsername: String)

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-port)
     * @param port Specifies the port that the database engine is listening on. 
     */
    public fun port(port: Number)

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
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled using the `BackupRetentionPeriod` parameter. 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

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
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

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
     * @param restoreToTime The date and time to restore the cluster to. 
     */
    public fun restoreToTime(restoreToTime: String)

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
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:. 
     */
    public fun restoreType(restoreType: String)

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
     * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore
     * from. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * The identifier of the source cluster from which to restore.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing `DBCluster` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier The identifier of the source cluster from which to restore. 
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     * @param storageEncrypted Specifies whether the cluster is encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     * @param storageEncrypted Specifies whether the cluster is encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

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
     * @param storageType The storage type to associate with the DB cluster. 
     */
    public fun storageType(storageType: String)

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     * @param tags The tags to be assigned to the cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     * @param tags The tags to be assigned to the cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBCluster.Builder =
        software.amazon.awscdk.services.docdb.CfnDBCluster.Builder.create(scope, id)

    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-availabilityzones)
     * @param availabilityZones A list of Amazon EC2 Availability Zones that instances in the
     * cluster can be created in. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

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
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You
     * must specify a minimum value of 1. 
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

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
     * @param dbClusterIdentifier The cluster identifier. This parameter is stored as a lowercase
     * string. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * The name of the cluster parameter group to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the cluster parameter group to associate with
     * this cluster. 
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
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
     * @param dbSubnetGroupName A subnet group to associate with this cluster. 
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     * @param deletionProtection Protects clusters from being accidentally deleted. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Protects clusters from being accidentally deleted.
     *
     * If enabled, the cluster cannot be deleted unless it is modified and `DeletionProtection` is
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-deletionprotection)
     * @param deletionProtection Protects clusters from being accidentally deleted. 
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to Amazon CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * The version number of the database engine to use.
     *
     * The `--engine-version` will default to the latest major engine version. For production
     * workloads, we recommend explicitly declaring this parameter with the intended major engine
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-engineversion)
     * @param engineVersion The version number of the database engine to use. 
     */
    override fun engineVersion(engineVersion: String) {
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
     *
     * * If the `StorageEncrypted` parameter is `true` , Amazon DocumentDB uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-kmskeyid)
     * @param kmsKeyId The AWS KMS key identifier for an encrypted cluster. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
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
     * @param masterUserPassword The password for the master database user. 
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

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
     * @param masterUsername The name of the master user for the cluster. 
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-port)
     * @param port Specifies the port that the database engine is listening on. 
     */
    override fun port(port: Number) {
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
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled using the `BackupRetentionPeriod` parameter. 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
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
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

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
     * @param restoreToTime The date and time to restore the cluster to. 
     */
    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

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
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:. 
     */
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

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
     * @param snapshotIdentifier The identifier for the snapshot or cluster snapshot to restore
     * from. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * The identifier of the source cluster from which to restore.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing `DBCluster` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier The identifier of the source cluster from which to restore. 
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     * @param storageEncrypted Specifies whether the cluster is encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * Specifies whether the cluster is encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storageencrypted)
     * @param storageEncrypted Specifies whether the cluster is encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
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
     *
     * When you create a DocumentDB DB cluster with the storage type set to `iopt1` , the storage
     * type is returned in the response. The storage type isn't returned when you set it to `standard`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-storagetype)
     * @param storageType The storage type to associate with the DB cluster. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     * @param tags The tags to be assigned to the cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to be assigned to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-tags)
     * @param tags The tags to be assigned to the cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A value that is set to `true` to restore the cluster to the latest restorable backup time,
     * and `false` otherwise.
     *
     * Default: `false`
     *
     * Constraints: Cannot be specified if the `RestoreToTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
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
     * @param useLatestRestorableTime A value that is set to `true` to restore the cluster to the
     * latest restorable backup time, and `false` otherwise. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * A list of EC2 VPC security groups to associate with this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html#cfn-docdb-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this cluster. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBCluster): CfnDBCluster =
        CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.docdb.CfnDBCluster =
        wrapped.cdkObject
  }
}
