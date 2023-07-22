@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

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
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.constructs.Construct

/**
 * The `AWS::RDS::DBCluster` resource creates an Amazon Aurora DB cluster or Multi-AZ DB cluster.
 *
 * For more information about creating an Aurora DB cluster, see [Creating an Amazon Aurora DB
 * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html) in
 * the *Amazon Aurora User Guide* .
 *
 * For more information about creating a Multi-AZ DB cluster, see [Creating a Multi-AZ DB
 * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html) in
 * the *Amazon RDS User Guide* .
 *
 *
 * You can only create this resource in AWS Regions where Amazon Aurora or Multi-AZ DB clusters are
 * supported.
 *
 *
 * *Updating DB clusters*
 *
 * When properties labeled " *Update requires:*
 * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * " are updated, AWS CloudFormation first creates a replacement DB cluster, then changes references
 * from other dependent resources to point to the replacement DB cluster, and finally deletes the old
 * DB cluster.
 *
 *
 * We highly recommend that you take a snapshot of the database before updating the stack. If you
 * don't, you lose the data when AWS CloudFormation replaces your DB cluster. To preserve your data,
 * perform the following procedure:
 *
 * * Deactivate any applications that are using the DB cluster so that there's no activity on the DB
 * instance.
 * * Create a snapshot of the DB cluster. For more information, see [Creating a DB Cluster
 * Snapshot](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CreateSnapshotCluster.html)
 * .
 * * If you want to restore your DB cluster using a DB cluster snapshot, modify the updated template
 * with your DB cluster changes and add the `SnapshotIdentifier` property with the ID of the DB cluster
 * snapshot that you want to use.
 *
 * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the same
 * `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify this
 * property for an update, the DB cluster is not restored from the DB cluster snapshot again, and the
 * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
 * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify a
 * property that is different from the previous snapshot restore property, a new DB cluster is restored
 * from the specified `SnapshotIdentifier` property, and the original DB cluster is deleted.
 *
 * * Update the stack.
 *
 *
 * Currently, when you are updating the stack for an Aurora Serverless DB cluster, you can't include
 * changes to any other properties when you specify one of the following properties:
 * `PreferredBackupWindow` , `PreferredMaintenanceWindow` , and `Port` . This limitation doesn't apply
 * to provisioned DB clusters.
 *
 * For more information about updating other properties of this resource, see
 * `[ModifyDBCluster](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_ModifyDBCluster.html)`
 * . For more information about updating stacks, see [AWS CloudFormation Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * *Deleting DB clusters*
 *
 * The default `DeletionPolicy` for `AWS::RDS::DBCluster` resources is `Snapshot` . For more
 * information about how AWS CloudFormation deletes resources, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
 * .allocatedStorage(123)
 * .associatedRoles(List.of(DBClusterRoleProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .featureName("featureName")
 * .build()))
 * .autoMinorVersionUpgrade(false)
 * .availabilityZones(List.of("availabilityZones"))
 * .backtrackWindow(123)
 * .backupRetentionPeriod(123)
 * .copyTagsToSnapshot(false)
 * .databaseName("databaseName")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbClusterInstanceClass("dbClusterInstanceClass")
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .dbSystemId("dbSystemId")
 * .deletionProtection(false)
 * .domain("domain")
 * .domainIamRoleName("domainIamRoleName")
 * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
 * .enableHttpEndpoint(false)
 * .enableIamDatabaseAuthentication(false)
 * .engine("engine")
 * .engineMode("engineMode")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .manageMasterUserPassword(false)
 * .masterUsername("masterUsername")
 * .masterUserPassword("masterUserPassword")
 * .masterUserSecret(MasterUserSecretProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .secretArn("secretArn")
 * .build())
 * .monitoringInterval(123)
 * .monitoringRoleArn("monitoringRoleArn")
 * .networkType("networkType")
 * .performanceInsightsEnabled(false)
 * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
 * .performanceInsightsRetentionPeriod(123)
 * .port(123)
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .replicationSourceIdentifier("replicationSourceIdentifier")
 * .restoreToTime("restoreToTime")
 * .restoreType("restoreType")
 * .scalingConfiguration(ScalingConfigurationProperty.builder()
 * .autoPause(false)
 * .maxCapacity(123)
 * .minCapacity(123)
 * .secondsBeforeTimeout(123)
 * .secondsUntilAutoPause(123)
 * .timeoutAction("timeoutAction")
 * .build())
 * .serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .snapshotIdentifier("snapshotIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .sourceRegion("sourceRegion")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
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
   * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
   * cluster.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * This setting is required to create a Multi-AZ DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-allocatedstorage)
   * @param allocatedStorage The amount of storage in gibibytes (GiB) to allocate to each DB
   * instance in the Multi-AZ DB cluster. 
   */
  public fun allocatedStorage(allocatedStorage: Number) {
    cdkBuilder.allocatedStorage(allocatedStorage)
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon Web Services on your behalf.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(vararg associatedRoles: Any) {
    _associatedRoles.addAll(listOf(*associatedRoles))
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon Web Services on your behalf.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(associatedRoles: Collection<Any>) {
    _associatedRoles.addAll(associatedRoles)
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   *
   * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
   * other Amazon Web Services on your behalf.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
   * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
   * that are associated with the DB cluster. 
   */
  public fun associatedRoles(associatedRoles: IResolvable) {
    cdkBuilder.associatedRoles(associatedRoles)
  }

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   *
   * By default, minor engine upgrades are applied automatically.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
   * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
   * automatically to the DB cluster during the maintenance window. 
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   *
   * By default, minor engine upgrades are applied automatically.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
   * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
   * automatically to the DB cluster during the maintenance window. 
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
   *
   * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
   * Availability
   * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
   * in the *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
   * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
   * can be created. 
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
   *
   * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
   * Availability
   * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
   * in the *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
   * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
   * can be created. 
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
   *
   *
   * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
   *
   *
   * Default: 0
   *
   * Constraints:
   *
   * * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
   *
   * Valid for: Aurora MySQL DB clusters only
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backtrackwindow)
   * @param backtrackWindow The target backtrack window, in seconds. To disable backtracking, set
   * this value to 0. 
   */
  public fun backtrackWindow(backtrackWindow: Number) {
    cdkBuilder.backtrackWindow(backtrackWindow)
  }

  /**
   * The number of days for which automated backups are retained.
   *
   * Default: 1
   *
   * Constraints:
   *
   * * Must be a value from 1 to 35
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Default: - 1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backupretentionperiod)
   * @param backupRetentionPeriod The number of days for which automated backups are retained. 
   */
  public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
  }

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   *
   * The default is not to copy them.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
   * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
   * to snapshots of the DB cluster. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   *
   * The default is not to copy them.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
   * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
   * to snapshots of the DB cluster. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * The name of your database.
   *
   * If you don't provide a name, then Amazon RDS won't create a database in this DB cluster. For
   * naming constraints, see [Naming
   * Constraints](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
   * in the *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
   * @param databaseName The name of your database. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * The DB cluster identifier. This parameter is stored as a lowercase string.
   *
   * Constraints:
   *
   * * Must contain from 1 to 63 letters, numbers, or hyphens.
   * * First character must be a letter.
   * * Can't end with a hyphen or contain two consecutive hyphens.
   *
   * Example: `my-cluster1`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
   * @param dbClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
   * string. 
   */
  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  /**
   * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
   * `db.m6gd.xlarge` . Not all DB instance classes are available in all AWS Regions , or for all
   * database engines.
   *
   * For the full list of DB instance classes and availability for your engine, see [DB instance
   * class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
   * the *Amazon RDS User Guide* .
   *
   * This setting is required to create a Multi-AZ DB cluster.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterinstanceclass)
   * @param dbClusterInstanceClass The compute and memory capacity of each DB instance in the
   * Multi-AZ DB cluster, for example `db.m6gd.xlarge` . Not all DB instance classes are available in
   * all AWS Regions , or for all database engines. 
   */
  public fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
    cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
  }

  /**
   * The name of the DB cluster parameter group to associate with this DB cluster.
   *
   *
   * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
   * reboot. This can result in an outage while the DB instances are rebooting.
   *
   * If you apply a change to parameter group associated with a stopped DB cluster, then the update
   * stack waits until the DB cluster is started.
   *
   *
   * To list all of the available DB cluster parameter group names, use the following command:
   *
   * `aws rds describe-db-cluster-parameter-groups --query
   * "DBClusterParameterGroups[].DBClusterParameterGroupName" --output text`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Default: - "default.aurora5.6"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
   * @param dbClusterParameterGroupName The name of the DB cluster parameter group to associate with
   * this DB cluster. 
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   *
   *
   * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
   * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather than
   * during the next maintenance window.
   *
   *
   * Default: The existing name setting
   *
   * Constraints:
   *
   * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbinstanceparametergroupname)
   * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
   * instances of the DB cluster. 
   */
  public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
  }

  /**
   * A DB subnet group that you want to associate with this DB cluster.
   *
   * If you are restoring a DB cluster to a point in time with `RestoreType` set to `copy-on-write`
   * , and don't specify a DB subnet group name, then the DB cluster is restored with a default DB
   * subnet group.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
   * @param dbSubnetGroupName A DB subnet group that you want to associate with this DB cluster. 
   */
  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  /**
   * Reserved for future use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsystemid)
   * @param dbSystemId Reserved for future use. 
   */
  public fun dbSystemId(dbSystemId: String) {
    cdkBuilder.dbSystemId(dbSystemId)
  }

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled. By default, deletion
   * protection is disabled.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
   * @param deletionProtection A value that indicates whether the DB cluster has deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled. By default, deletion
   * protection is disabled.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
   * @param deletionProtection A value that indicates whether the DB cluster has deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Indicates the directory ID of the Active Directory to create the DB cluster.
   *
   * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users
   * that connect to the DB cluster.
   *
   * For more information, see [Kerberos
   * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
   * in the *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domain)
   * @param domain Indicates the directory ID of the Active Directory to create the DB cluster. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * Specifies the name of the IAM role to use when making API calls to the Directory Service.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domainiamrolename)
   * @param domainIamRoleName Specifies the name of the IAM role to use when making API calls to the
   * Directory Service. 
   */
  public fun domainIamRoleName(domainIamRoleName: String) {
    cdkBuilder.domainIamRoleName(domainIamRoleName)
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * The values in the list depend on the DB engine being used. For more information, see
   * [Publishing Database Logs to Amazon CloudWatch
   * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
   * in the *Amazon Aurora User Guide* .
   *
   * *Aurora MySQL*
   *
   * Valid values: `audit` , `error` , `general` , `slowquery`
   *
   * *Aurora PostgreSQL*
   *
   * Valid values: `postgresql`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
   * @param enableCloudwatchLogsExports The list of log types that need to be enabled for exporting
   * to CloudWatch Logs. 
   */
  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * The values in the list depend on the DB engine being used. For more information, see
   * [Publishing Database Logs to Amazon CloudWatch
   * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
   * in the *Amazon Aurora User Guide* .
   *
   * *Aurora MySQL*
   *
   * Valid values: `audit` , `error` , `general` , `slowquery`
   *
   * *Aurora PostgreSQL*
   *
   * Valid values: `postgresql`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
   * @param enableCloudwatchLogsExports The list of log types that need to be enabled for exporting
   * to CloudWatch Logs. 
   */
  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  /**
   * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster.
   *
   * By default, the HTTP endpoint is disabled.
   *
   * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
   * queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS
   * console with the query editor.
   *
   * For more information, see [Using the Data API for Aurora
   * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
   * *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
   * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
   * Aurora Serverless DB cluster. 
   */
  public fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
    cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
  }

  /**
   * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster.
   *
   * By default, the HTTP endpoint is disabled.
   *
   * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
   * queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS
   * console with the query editor.
   *
   * For more information, see [Using the Data API for Aurora
   * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
   * *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
   * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
   * Aurora Serverless DB cluster. 
   */
  public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
    cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
  }

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   *
   * By default, mapping is disabled.
   *
   * For more information, see [IAM Database
   * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
   * in the *Amazon Aurora User Guide.*
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
   * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of AWS
   * Identity and Access Management (IAM) accounts to database accounts. 
   */
  public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
    cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
  }

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   *
   * By default, mapping is disabled.
   *
   * For more information, see [IAM Database
   * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
   * in the *Amazon Aurora User Guide.*
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
   * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of AWS
   * Identity and Access Management (IAM) accounts to database accounts. 
   */
  public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
    cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
  }

  /**
   * The name of the database engine to be used for this DB cluster.
   *
   * Valid Values:
   *
   * * `aurora-mysql`
   * * `aurora-postgresql`
   * * `mysql`
   * * `postgres`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
   * @param engine The name of the database engine to be used for this DB cluster. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * The DB engine mode of the DB cluster, either `provisioned` or `serverless` .
   *
   * The `serverless` engine mode only supports Aurora Serverless v1.
   *
   * Limitations and requirements apply to some DB engine modes. For more information, see the
   * following sections in the *Amazon Aurora User Guide* :
   *
   * * [Limitations of Aurora Serverless
   * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations)
   * * [Requirements for Aurora Serverless
   * v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html)
   * * [Limitations of parallel
   * query](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations)
   * * [Limitations of Aurora global
   * databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations)
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
   * @param engineMode The DB engine mode of the DB cluster, either `provisioned` or `serverless` . 
   */
  public fun engineMode(engineMode: String) {
    cdkBuilder.engineMode(engineMode)
  }

  /**
   * The version number of the database engine to use.
   *
   * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
   * version 3 (8.0-compatible), use the following command:
   *
   * `aws rds describe-db-engine-versions --engine aurora-mysql --query
   * "DBEngineVersions[].EngineVersion"`
   *
   * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL version
   * 2 or version 3, respectively.
   *
   * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
   *
   * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
   * "DBEngineVersions[].EngineVersion"`
   *
   * To list all of the available engine versions for RDS for MySQL, use the following command:
   *
   * `aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"`
   *
   * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
   *
   * `aws rds describe-db-engine-versions --engine postgres --query
   * "DBEngineVersions[].EngineVersion"`
   *
   * *Aurora MySQL*
   *
   * For information, see [Database engine updates for Amazon Aurora
   * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) in
   * the *Amazon Aurora User Guide* .
   *
   * *Aurora PostgreSQL*
   *
   * For information, see [Amazon Aurora PostgreSQL releases and engine
   * versions](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html)
   * in the *Amazon Aurora User Guide* .
   *
   * *MySQL*
   *
   * For information, see [Amazon RDS for
   * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
   * in the *Amazon RDS User Guide* .
   *
   * *PostgreSQL*
   *
   * For information, see [Amazon RDS for
   * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts)
   * in the *Amazon RDS User Guide* .
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
   * @param engineVersion The version number of the database engine to use. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to be
   * a secondary member in the global database cluster, specify the global cluster ID of the global
   * database cluster.
   *
   * To define the primary database cluster of the global cluster, use the
   * [AWS::RDS::GlobalCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
   * resource.
   *
   * If you aren't configuring a global database cluster, don't specify this property.
   *
   *
   * To remove the DB cluster from a global database cluster, specify an empty value for the
   * `GlobalClusterIdentifier` property.
   *
   *
   * For information about Aurora global databases, see [Working with Amazon Aurora Global
   * Databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)
   * in the *Amazon Aurora User Guide* .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-globalclusteridentifier)
   * @param globalClusterIdentifier If you are configuring an Aurora global database cluster and
   * want your Aurora DB cluster to be a secondary member in the global database cluster, specify the
   * global cluster ID of the global database cluster. 
   */
  public fun globalClusterIdentifier(globalClusterIdentifier: String) {
    cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
  }

  /**
   * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated
   * for each DB instance in the Multi-AZ DB cluster.
   *
   * For information about valid IOPS values, see [Provisioned IOPS
   * storage](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS) in
   * the *Amazon RDS User Guide* .
   *
   * This setting is required to create a Multi-AZ DB cluster.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * Constraints:
   *
   * * Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-iops)
   * @param iops The amount of Provisioned IOPS (input/output operations per second) to be initially
   * allocated for each DB instance in the Multi-AZ DB cluster. 
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
   * instances in the DB cluster, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   *
   * If you enable the `StorageEncrypted` property but don't specify this property, the default KMS
   * key is used. If you specify this property, you must set the `StorageEncrypted` property to `true`
   * .
   *
   * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
   * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId` property
   * is used.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
   * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the
   * database instances in the DB cluster, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` . 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide* and [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
   * the *Amazon Aurora User Guide.*
   *
   * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Constraints:
   *
   * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
   * specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
   * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
   * Secrets Manager. 
   */
  public fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
    cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
  }

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide* and [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
   * the *Amazon Aurora User Guide.*
   *
   * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Constraints:
   *
   * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
   * specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
   * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
   * Secrets Manager. 
   */
  public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
    cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
  }

  /**
   * The master password for the DB instance.
   *
   *
   * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
   * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
   * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
   * respectively.
   *
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
   * @param masterUserPassword The master password for the DB instance. 
   */
  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide* and [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
   * the *Amazon Aurora User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
   * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
   * password. 
   */
  public fun masterUserSecret(masterUserSecret: IResolvable) {
    cdkBuilder.masterUserSecret(masterUserSecret)
  }

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide* and [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
   * the *Amazon Aurora User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
   * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
   * password. 
   */
  public fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty) {
    cdkBuilder.masterUserSecret(masterUserSecret)
  }

  /**
   * The name of the master user for the DB cluster.
   *
   *
   * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
   * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
   * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
   * respectively.
   *
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
   * @param masterUsername The name of the master user for the DB cluster. 
   */
  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
  }

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB cluster.
   *
   * To turn off collecting Enhanced Monitoring metrics, specify `0` .
   *
   * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0` .
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * Valid Values: `0 | 1 | 5 | 10 | 15 | 30 | 60`
   *
   * Default: `0`
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringinterval)
   * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
   * metrics are collected for the DB cluster. 
   */
  public fun monitoringInterval(monitoringInterval: Number) {
    cdkBuilder.monitoringInterval(monitoringInterval)
  }

  /**
   * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
   * metrics to Amazon CloudWatch Logs.
   *
   * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
   * monitoring role, see [Setting up and enabling Enhanced
   * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
   * in the *Amazon RDS User Guide* .
   *
   * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn` value.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringrolearn)
   * @param monitoringRoleArn The Amazon Resource Name (ARN) for the IAM role that permits RDS to
   * send Enhanced Monitoring metrics to Amazon CloudWatch Logs. 
   */
  public fun monitoringRoleArn(monitoringRoleArn: String) {
    cdkBuilder.monitoringRoleArn(monitoringRoleArn)
  }

  /**
   * The network type of the DB cluster.
   *
   * Valid values:
   *
   * * `IPV4`
   * * `DUAL`
   *
   * The network type is determined by the `DBSubnetGroup` specified for the DB cluster. A
   * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
   *
   * For more information, see [Working with a DB instance in a
   * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
   * in the *Amazon Aurora User Guide.*
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-networktype)
   * @param networkType The network type of the DB cluster. 
   */
  public fun networkType(networkType: String) {
    cdkBuilder.networkType(networkType)
  }

  /**
   * Specifies whether to turn on Performance Insights for the DB cluster.
   *
   * For more information, see [Using Amazon Performance
   * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
   * *Amazon RDS User Guide* .
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
   * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the DB
   * cluster. 
   */
  public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
    cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
  }

  /**
   * Specifies whether to turn on Performance Insights for the DB cluster.
   *
   * For more information, see [Using Amazon Performance
   * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
   * *Amazon RDS User Guide* .
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
   * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the DB
   * cluster. 
   */
  public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
    cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
  }

  /**
   * The AWS KMS key identifier for encryption of Performance Insights data.
   *
   * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
   *
   * If you don't specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
   * default KMS key. There is a default KMS key for your AWS account . Your AWS account has a
   * different default KMS key for each AWS Region .
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightskmskeyid)
   * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
   * Insights data. 
   */
  public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
    cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
  }

  /**
   * The number of days to retain Performance Insights data.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * Valid Values:
   *
   * * `7`
   * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months * 31),
   * `341` (11 months * 31), `589` (19 months * 31)
   * * `731`
   *
   * Default: `7` days
   *
   * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsretentionperiod)
   * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
   * data. 
   */
  public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
    cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
  }

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   *
   * Default:
   *
   * * When `EngineMode` is `provisioned` , `3306` (for both Aurora MySQL and Aurora PostgreSQL)
   * * When `EngineMode` is `serverless` :
   * * `3306` when `Engine` is `aurora` or `aurora-mysql`
   * * `5432` when `Engine` is `aurora-postgresql`
   *
   *
   * The `No interruption` on update behavior only applies to DB clusters. If you are updating a DB
   * instance, see
   * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
   * for the AWS::RDS::DBInstance resource.
   *
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
   * @param port The port number on which the DB instances in the DB cluster accept connections. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * The daily time range during which automated backups are created.
   *
   * For more information, see [Backup
   * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow)
   * in the *Amazon Aurora User Guide.*
   *
   * Constraints:
   *
   * * Must be in the format `hh24:mi-hh24:mi` .
   * * Must be in Universal Coordinated Time (UTC).
   * * Must not conflict with the preferred maintenance window.
   * * Must be at least 30 minutes.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
   * @param preferredBackupWindow The daily time range during which automated backups are created. 
   */
  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
  }

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region, occurring on a random day of the week. To see the time blocks available, see [Adjusting
   * the Preferred DB Cluster Maintenance
   * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora)
   * in the *Amazon Aurora User Guide.*
   *
   * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
   *
   * Constraints: Minimum 30-minute window.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
   * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
   * occur, in Universal Coordinated Time (UTC). 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * Specifies whether the DB cluster is publicly accessible.
   *
   * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
   * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
   * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately
   * controlled by the security group it uses. That public access isn't permitted if the security group
   * assigned to the DB cluster doesn't permit it.
   *
   * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
   * that resolves to a private IP address.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
   *
   * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the
   * DB cluster is private.
   * * If the default VPC in the target Region has an internet gateway attached to it, the DB
   * cluster is public.
   *
   * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB
   * cluster is private.
   * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster
   * is public.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
   * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * Specifies whether the DB cluster is publicly accessible.
   *
   * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
   * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
   * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately
   * controlled by the security group it uses. That public access isn't permitted if the security group
   * assigned to the DB cluster doesn't permit it.
   *
   * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
   * that resolves to a private IP address.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
   *
   * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the
   * DB cluster is private.
   * * If the default VPC in the target Region has an internet gateway attached to it, the DB
   * cluster is public.
   *
   * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB
   * cluster is private.
   * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster
   * is public.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
   * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
   * created as a read replica.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
   * @param replicationSourceIdentifier The Amazon Resource Name (ARN) of the source DB instance or
   * DB cluster if this DB cluster is created as a read replica. 
   */
  public fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
    cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
  }

  /**
   * The date and time to restore the DB cluster to.
   *
   * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
   *
   * Constraints:
   *
   * * Must be before the latest restorable time for the DB instance
   * * Must be specified if `UseLatestRestorableTime` parameter isn't provided
   * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled
   * * Can't be specified if the `RestoreType` parameter is `copy-on-write`
   *
   * Example: `2015-03-07T23:45:00Z`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretotime)
   * @param restoreToTime The date and time to restore the DB cluster to. 
   */
  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  /**
   * The type of restore to be performed. You can specify one of the following values:.
   *
   * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
   * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
   *
   * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full copy
   * of the source DB cluster.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Default: - "full-copy"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretype)
   * @param restoreType The type of restore to be performed. You can specify one of the following
   * values:. 
   */
  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   *
   * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, use
   * `ServerlessV2ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
   * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
   * configuration of an Aurora Serverless DB cluster. 
   */
  public fun scalingConfiguration(scalingConfiguration: IResolvable) {
    cdkBuilder.scalingConfiguration(scalingConfiguration)
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   *
   * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, use
   * `ServerlessV2ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
   * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
   * configuration of an Aurora Serverless DB cluster. 
   */
  public fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty) {
    cdkBuilder.scalingConfiguration(scalingConfiguration)
  }

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   *
   * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, use
   * `ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
   * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
   * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
   */
  public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
    cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration)
  }

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   *
   * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, use
   * `ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
   * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
   * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
   */
  public
      fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty) {
    cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration)
  }

  /**
   * The identifier for the DB snapshot or DB cluster snapshot to restore from.
   *
   * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot.
   * However, you can use only the ARN to specify a DB snapshot.
   *
   * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the same
   * `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify this
   * property for an update, the DB cluster is not restored from the snapshot again, and the data in
   * the database is not changed. However, if you don't specify the `SnapshotIdentifier` property, an
   * empty DB cluster is created, and the original DB cluster is deleted. If you specify a property
   * that is different from the previous snapshot restore property, a new DB cluster is restored from
   * the specified `SnapshotIdentifier` property, and the original DB cluster is deleted.
   *
   * If you specify the `SnapshotIdentifier` property to restore a DB cluster (as opposed to
   * specifying it for DB cluster updates), then don't specify the following properties:
   *
   * * `GlobalClusterIdentifier`
   * * `MasterUsername`
   * * `MasterUserPassword`
   * * `ReplicationSourceIdentifier`
   * * `RestoreType`
   * * `SourceDBClusterIdentifier`
   * * `SourceRegion`
   * * `StorageEncrypted` (for an encrypted snapshot)
   * * `UseLatestRestorableTime`
   *
   * Constraints:
   *
   * * Must match the identifier of an existing Snapshot.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
   * @param snapshotIdentifier The identifier for the DB snapshot or DB cluster snapshot to restore
   * from. 
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  /**
   * When restoring a DB cluster to a point in time, the identifier of the source DB cluster from
   * which to restore.
   *
   * Constraints:
   *
   * * Must match the identifier of an existing DBCluster.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourcedbclusteridentifier)
   * @param sourceDbClusterIdentifier When restoring a DB cluster to a point in time, the identifier
   * of the source DB cluster from which to restore. 
   */
  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  /**
   * The AWS Region which contains the source DB cluster when replicating a DB cluster. For example,
   * `us-east-1` .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourceregion)
   * @param sourceRegion The AWS Region which contains the source DB cluster when replicating a DB
   * cluster. For example, `us-east-1` . 
   */
  public fun sourceRegion(sourceRegion: String) {
    cdkBuilder.sourceRegion(sourceRegion)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   *
   * If you specify the `KmsKeyId` property, then you must enable encryption.
   *
   * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The value
   * is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
   * `KmsKeyId` property is used.
   *
   * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't specify
   * this property. The value is inherited from the snapshot, and the specified `KmsKeyId` property is
   * used.
   *
   * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can use
   * this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
   * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
   * encrypted, then don't set this property or set it to `false` .
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
   * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   *
   * If you specify the `KmsKeyId` property, then you must enable encryption.
   *
   * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The value
   * is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
   * `KmsKeyId` property is used.
   *
   * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't specify
   * this property. The value is inherited from the snapshot, and the specified `KmsKeyId` property is
   * used.
   *
   * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can use
   * this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
   * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
   * encrypted, then don't set this property or set it to `false` .
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
   * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
   */
  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * The storage type to associate with the DB cluster.
   *
   * For information on storage types for Aurora DB clusters, see [Storage configurations for Amazon
   * Aurora DB
   * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.StorageReliability.html#aurora-storage-type)
   * . For information on storage types for Multi-AZ DB clusters, see [Settings for creating Multi-AZ
   * DB
   * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html#create-multi-az-db-cluster-settings)
   * .
   *
   * This setting is required to create a Multi-AZ DB cluster.
   *
   * When specified for a Multi-AZ DB cluster, a value for the `Iops` parameter is required.
   *
   * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
   *
   * Valid Values:
   *
   * * Aurora DB clusters - `aurora | aurora-iopt1`
   * * Multi-AZ DB clusters - `io1`
   *
   * Default:
   *
   * * Aurora DB clusters - `aurora`
   * * Multi-AZ DB clusters - `io1`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storagetype)
   * @param storageType The storage type to associate with the DB cluster. 
   */
  public fun storageType(storageType: String) {
    cdkBuilder.storageType(storageType)
  }

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
   * @param tags An optional array of key-value pairs to apply to this DB cluster. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
   * @param tags An optional array of key-value pairs to apply to this DB cluster. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   *
   * By default, the DB cluster is not restored to the latest restorable backup time.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
   * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to the
   * latest restorable backup time. 
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   *
   * By default, the DB cluster is not restored to the latest restorable backup time.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
   * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to the
   * latest restorable backup time. 
   */
  public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   *
   * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB cluster.
   * 
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   *
   * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB cluster.
   * 
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
