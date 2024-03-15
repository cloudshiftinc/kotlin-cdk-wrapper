@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * import io.cloudshiftdev.awscdk.services.neptune.*;
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
 * .dbPort(123)
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
public open class CfnDBCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   */
  public open fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   */
  public open fun associatedRoles(`value`: IResolvable) {
    unwrap(this).setAssociatedRoles(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   */
  public open fun associatedRoles(`value`: List<Any>) {
    unwrap(this).setAssociatedRoles(`value`)
  }

  /**
   * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
   * with the DB cluster.
   */
  public open fun associatedRoles(vararg `value`: Any): Unit = associatedRoles(`value`.toList())

  /**
   * The resource id for the DB cluster.
   *
   * For example: `cluster-ABCD1234EFGH5678IJKL90MNOP` . The cluster ID uniquely identifies the
   * cluster and is used in things like IAM authentication policies.
   */
  public open fun attrClusterResourceId(): String = unwrap(this).getAttrClusterResourceId()

  /**
   * The connection endpoint for the DB cluster.
   *
   * For example: `mystack-mydbcluster-1apw1j4phylrk.cg034hpkmmjt.us-east-2.rds.amazonaws.com`
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   */
  public open fun attrPort(): String = unwrap(this).getAttrPort()

  /**
   * The reader endpoint for the DB cluster.
   *
   * For example: `mystack-mydbcluster-ro-1apw1j4phylrk.cg034hpkmmjt.us-east-2.rds.amazonaws.com`
   */
  public open fun attrReadEndpoint(): String = unwrap(this).getAttrReadEndpoint()

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * Specifies the number of days for which automatic DB snapshots are retained.
   */
  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * Specifies the number of days for which automatic DB snapshots are retained.
   */
  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   */
  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   */
  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  /**
   * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
   */
  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains a user-supplied DB cluster identifier.
   */
  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * Contains a user-supplied DB cluster identifier.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * Provides the name of the DB cluster parameter group.
   */
  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  /**
   * Provides the name of the DB cluster parameter group.
   */
  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   */
  public open fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   */
  public open fun dbInstanceParameterGroupName(`value`: String) {
    unwrap(this).setDbInstanceParameterGroupName(`value`)
  }

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   */
  public open fun dbPort(): Number? = unwrap(this).getDbPort()

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   */
  public open fun dbPort(`value`: Number) {
    unwrap(this).setDbPort(`value`)
  }

  /**
   * Specifies information on the subnet group associated with the DB cluster, including the name,
   * description, and subnets in the subnet group.
   */
  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Specifies information on the subnet group associated with the DB cluster, including the name,
   * description, and subnets in the subnet group.
   */
  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * Indicates whether or not the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  /**
   * Specifies a list of log types that are enabled for export to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(vararg `value`: String): Unit =
      enableCloudwatchLogsExports(`value`.toList())

  /**
   * Indicates the database engine version.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * Indicates the database engine version.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   */
  public open fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   */
  public open fun iamAuthEnabled(`value`: Boolean) {
    unwrap(this).setIamAuthEnabled(`value`)
  }

  /**
   * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts is
   * enabled, and otherwise false.
   */
  public open fun iamAuthEnabled(`value`: IResolvable) {
    unwrap(this).setIamAuthEnabled(`value`.let(IResolvable::unwrap))
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
   * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the daily time range during which automated backups are created if automated backups
   * are enabled, as determined by the `BackupRetentionPeriod` .
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * Specifies the daily time range during which automated backups are created if automated backups
   * are enabled, as determined by the `BackupRetentionPeriod` .
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * Specifies the weekly time range during which system maintenance can occur, in Universal
   * Coordinated Time (UTC).
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Specifies the weekly time range during which system maintenance can occur, in Universal
   * Coordinated Time (UTC).
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun restoreToTime(`value`: String) {
    unwrap(this).setRestoreToTime(`value`)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun restoreType(`value`: String) {
    unwrap(this).setRestoreType(`value`)
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   */
  public open fun serverlessScalingConfiguration(): Any? =
      unwrap(this).getServerlessScalingConfiguration()

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   */
  public open fun serverlessScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setServerlessScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   */
  public open fun serverlessScalingConfiguration(`value`: ServerlessScalingConfigurationProperty) {
    unwrap(this).setServerlessScalingConfiguration(`value`.let(ServerlessScalingConfigurationProperty::unwrap))
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d43d13bdda8d7f79719335581a679872630140759c0103d4461a7c248ad47c02")
  public open
      fun serverlessScalingConfiguration(`value`: ServerlessScalingConfigurationProperty.Builder.() -> Unit):
      Unit = serverlessScalingConfiguration(ServerlessScalingConfigurationProperty(`value`))

  /**
   * Specifies the identifier for a DB cluster snapshot.
   *
   * Must match the identifier of an existing snapshot.
   */
  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * Specifies the identifier for a DB cluster snapshot.
   *
   * Must match the identifier of an existing snapshot.
   */
  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to this cluster.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to this cluster.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to this cluster.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  /**
   * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
   */
  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * Provides a list of VPC security groups that the DB cluster belongs to.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.neptune.CfnDBCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created
     * in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created
     * in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

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
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots
     * are retained. 
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    /**
     * Contains a user-supplied DB cluster identifier.
     *
     * This identifier is the unique key that identifies a DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
     * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

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
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

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
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster. 
     */
    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

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
     * @param dbPort The port number on which the DB instances in the DB cluster accept connections.
     * 
     */
    public fun dbPort(dbPort: Number)

    /**
     * Specifies information on the subnet group associated with the DB cluster, including the name,
     * description, and subnets in the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
     * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet group. 
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * Indicates whether or not the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Indicates whether or not the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-deletionprotection)
     * @param deletionProtection Indicates whether or not the DB cluster has deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * Specifies a list of log types that are enabled for export to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * Specifies a list of log types that are enabled for export to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * Indicates the database engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-engineversion)
     * @param engineVersion Indicates the database engine version. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts
     * is enabled, and otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false. 
     */
    public fun iamAuthEnabled(iamAuthEnabled: Boolean)

    /**
     * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts
     * is enabled, and otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false. 
     */
    public fun iamAuthEnabled(iamAuthEnabled: IResolvable)

    /**
     * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
     * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the
     * encrypted DB cluster. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies the daily time range during which automated backups are created if automated
     * backups are enabled, as determined by the `BackupRetentionPeriod` .
     *
     * An update may require some interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
     * @param preferredBackupWindow Specifies the daily time range during which automated backups
     * are created if automated backups are enabled, as determined by the `BackupRetentionPeriod` . 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * Specifies the weekly time range during which system maintenance can occur, in Universal
     * Coordinated Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system
     * maintenance can occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

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
    public fun restoreToTime(restoreToTime: String)

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
    public fun restoreType(restoreType: String)

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable)

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty)

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffaf2a7c8b4f9100c6045e32963db334bc3c1c23fe7e457d220ec2d45621d09")
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty.Builder.() -> Unit)

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
     * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
     * identifier of an existing snapshot. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

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
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

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
    public fun storageEncrypted(storageEncrypted: Boolean)

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
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * The tags assigned to this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
     * @param tags The tags assigned to this cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
     * @param tags The tags assigned to this cluster. 
     */
    public fun tags(vararg tags: CfnTag)

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
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

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
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBCluster.Builder =
        software.amazon.awscdk.services.neptune.CfnDBCluster.Builder.create(scope, id)

    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * Provides a list of the Amazon Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon services on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the Amazon Identity and Access Management (IAM)
     * roles that are associated with the DB cluster. 
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created
     * in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created
     * in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

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
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots
     * are retained. 
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * *If set to `true` , tags are copied to any snapshot of the DB cluster that is created.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot *If set to `true` , tags are copied to any snapshot of the DB
     * cluster that is created.*. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    /**
     * Contains a user-supplied DB cluster identifier.
     *
     * This identifier is the unique key that identifies a DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
     * @param dbClusterIdentifier Contains a user-supplied DB cluster identifier. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
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
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
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
     * * The `DBInstanceParameterGroupName` parameter is only valid for major engine version
     * upgrades.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbinstanceparametergroupname)
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster. 
     */
    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

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
     * @param dbPort The port number on which the DB instances in the DB cluster accept connections.
     * 
     */
    override fun dbPort(dbPort: Number) {
      cdkBuilder.dbPort(dbPort)
    }

    /**
     * Specifies information on the subnet group associated with the DB cluster, including the name,
     * description, and subnets in the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
     * @param dbSubnetGroupName Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet group. 
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
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
    override fun deletionProtection(deletionProtection: Boolean) {
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
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * Specifies a list of log types that are enabled for export to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * Specifies a list of log types that are enabled for export to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports Specifies a list of log types that are enabled for export
     * to CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * Indicates the database engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-engineversion)
     * @param engineVersion Indicates the database engine version. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts
     * is enabled, and otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false. 
     */
    override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    /**
     * True if mapping of Amazon Identity and Access Management (IAM) accounts to database accounts
     * is enabled, and otherwise false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
     * @param iamAuthEnabled True if mapping of Amazon Identity and Access Management (IAM) accounts
     * to database accounts is enabled, and otherwise false. 
     */
    override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
    }

    /**
     * If `StorageEncrypted` is true, the Amazon KMS key identifier for the encrypted DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
     * @param kmsKeyId If `StorageEncrypted` is true, the Amazon KMS key identifier for the
     * encrypted DB cluster. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the daily time range during which automated backups are created if automated
     * backups are enabled, as determined by the `BackupRetentionPeriod` .
     *
     * An update may require some interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
     * @param preferredBackupWindow Specifies the daily time range during which automated backups
     * are created if automated backups are enabled, as determined by the `BackupRetentionPeriod` . 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
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
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
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
    override fun restoreToTime(restoreToTime: String) {
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
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    override fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(ServerlessScalingConfigurationProperty::unwrap))
    }

    /**
     * Contains the scaling configuration of an Neptune Serverless DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-serverlessscalingconfiguration)
     * @param serverlessScalingConfiguration Contains the scaling configuration of an Neptune
     * Serverless DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffaf2a7c8b4f9100c6045e32963db334bc3c1c23fe7e457d220ec2d45621d09")
    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessScalingConfiguration(ServerlessScalingConfigurationProperty(serverlessScalingConfiguration))

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
     * @param snapshotIdentifier Specifies the identifier for a DB cluster snapshot. Must match the
     * identifier of an existing snapshot. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
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
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
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
    override fun storageEncrypted(storageEncrypted: Boolean) {
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
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * The tags assigned to this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
     * @param tags The tags assigned to this cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
     * @param tags The tags assigned to this cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
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
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds Provides a list of VPC security groups that the DB cluster belongs
     * to. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.neptune.CfnDBCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster): CfnDBCluster
        = CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.neptune.CfnDBCluster
        = wrapped.cdkObject
  }

  /**
   * Describes an Amazon Identity and Access Management (IAM) role that is associated with a DB
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.neptune.*;
   * DBClusterRoleProperty dBClusterRoleProperty = DBClusterRoleProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .featureName("featureName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html)
   */
  public interface DBClusterRoleProperty {
    /**
     * The name of the feature associated with the Amazon Identity and Access Management (IAM) role.
     *
     * For the list of supported feature names, see
     * [DescribeDBEngineVersions](https://docs.aws.amazon.com/neptune/latest/userguide/api-other-apis.html#DescribeDBEngineVersions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html#cfn-neptune-dbcluster-dbclusterrole-featurename)
     */
    public fun featureName(): String? = unwrap(this).getFeatureName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html#cfn-neptune-dbcluster-dbclusterrole-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DBClusterRoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param featureName The name of the feature associated with the Amazon Identity and Access
       * Management (IAM) role.
       * For the list of supported feature names, see
       * [DescribeDBEngineVersions](https://docs.aws.amazon.com/neptune/latest/userguide/api-other-apis.html#DescribeDBEngineVersions)
       * .
       */
      public fun featureName(featureName: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the
       * DB cluster. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty.Builder =
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty.builder()

      /**
       * @param featureName The name of the feature associated with the Amazon Identity and Access
       * Management (IAM) role.
       * For the list of supported feature names, see
       * [DescribeDBEngineVersions](https://docs.aws.amazon.com/neptune/latest/userguide/api-other-apis.html#DescribeDBEngineVersions)
       * .
       */
      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the
       * DB cluster. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty,
    ) : CdkObject(cdkObject), DBClusterRoleProperty {
      /**
       * The name of the feature associated with the Amazon Identity and Access Management (IAM)
       * role.
       *
       * For the list of supported feature names, see
       * [DescribeDBEngineVersions](https://docs.aws.amazon.com/neptune/latest/userguide/api-other-apis.html#DescribeDBEngineVersions)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html#cfn-neptune-dbcluster-dbclusterrole-featurename)
       */
      override fun featureName(): String? = unwrap(this).getFeatureName()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html#cfn-neptune-dbcluster-dbclusterrole-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DBClusterRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty):
          DBClusterRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBClusterRoleProperty):
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty
    }
  }

  /**
   * Contains the scaling configuration of a Neptune Serverless DB cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.neptune.*;
   * ServerlessScalingConfigurationProperty serverlessScalingConfigurationProperty =
   * ServerlessScalingConfigurationProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html)
   */
  public interface ServerlessScalingConfigurationProperty {
    /**
     * The maximum number of Neptune capacity units (NCUs) for a DB instance in a Neptune Serverless
     * cluster.
     *
     * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html#cfn-neptune-dbcluster-serverlessscalingconfiguration-maxcapacity)
     */
    public fun maxCapacity(): Number

    /**
     * The minimum number of Neptune capacity units (NCUs) for a DB instance in a Neptune Serverless
     * cluster.
     *
     * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html#cfn-neptune-dbcluster-serverlessscalingconfiguration-mincapacity)
     */
    public fun minCapacity(): Number

    /**
     * A builder for [ServerlessScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The maximum number of Neptune capacity units (NCUs) for a DB instance in
       * a Neptune Serverless cluster. 
       * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The minimum number of Neptune capacity units (NCUs) for a DB instance in
       * a Neptune Serverless cluster. 
       * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty.builder()

      /**
       * @param maxCapacity The maximum number of Neptune capacity units (NCUs) for a DB instance in
       * a Neptune Serverless cluster. 
       * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The minimum number of Neptune capacity units (NCUs) for a DB instance in
       * a Neptune Serverless cluster. 
       * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty,
    ) : CdkObject(cdkObject), ServerlessScalingConfigurationProperty {
      /**
       * The maximum number of Neptune capacity units (NCUs) for a DB instance in a Neptune
       * Serverless cluster.
       *
       * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html#cfn-neptune-dbcluster-serverlessscalingconfiguration-maxcapacity)
       */
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      /**
       * The minimum number of Neptune capacity units (NCUs) for a DB instance in a Neptune
       * Serverless cluster.
       *
       * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html#cfn-neptune-dbcluster-serverlessscalingconfiguration-mincapacity)
       */
      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerlessScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty):
          ServerlessScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessScalingConfigurationProperty):
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty
    }
  }
}
