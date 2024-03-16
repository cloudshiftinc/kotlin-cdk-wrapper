@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDBCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
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
 * .enableGlobalWriteForwarding(false)
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
public interface CfnDBClusterProps {
  /**
   * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
   * cluster.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * This setting is required to create a Multi-AZ DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-allocatedstorage)
   */
  public fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

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
   */
  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   *
   * By default, minor engine upgrades are applied automatically.
   *
   * Valid for Cluster Type: Multi-AZ DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

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
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

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
   */
  public fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

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
   */
  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   *
   * The default is not to copy them.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
   */
  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

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
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

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
   */
  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

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
   */
  public fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

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
   */
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

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
   */
  public fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

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
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Reserved for future use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsystemid)
   */
  public fun dbSystemId(): String? = unwrap(this).getDbSystemId()

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled. By default, deletion
   * protection is disabled.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

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
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the name of the IAM role to use when making API calls to the Directory Service.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domainiamrolename)
   */
  public fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

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
   */
  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * Specifies whether to enable this DB cluster to forward write operations to the primary cluster
   * of a global cluster (Aurora global database).
   *
   * By default, write operations are not allowed on Aurora DB clusters that are secondary clusters
   * in an Aurora global database.
   *
   * You can set this value only on Aurora DB clusters that are members of an Aurora global
   * database. With this parameter enabled, a secondary cluster can forward writes to the current
   * primary cluster, and the resulting changes are replicated back to this cluster. For the primary DB
   * cluster of an Aurora global database, this value is used immediately if the primary is demoted by
   * a global cluster API operation, but it does nothing until then.
   *
   * Valid for Cluster Type: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
   */
  public fun enableGlobalWriteForwarding(): Any? = unwrap(this).getEnableGlobalWriteForwarding()

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
   */
  public fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

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
   */
  public fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

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
   */
  public fun engine(): String? = unwrap(this).getEngine()

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
   */
  public fun engineMode(): String? = unwrap(this).getEngineMode()

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
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

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
   */
  public fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

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
   */
  public fun iops(): Number? = unwrap(this).getIops()

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
   * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to set
   * `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key is
   * used to encrypt the read replica in that AWS Region.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
   */
  public fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

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
   */
  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

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
   */
  public fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

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
   */
  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

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
   */
  public fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

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
   */
  public fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

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
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

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
   */
  public fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

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
   */
  public fun performanceInsightsKmsKeyId(): String? = unwrap(this).getPerformanceInsightsKmsKeyId()

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
   */
  public fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

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
   */
  public fun port(): Number? = unwrap(this).getPort()

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
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

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
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

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
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
   * created as a read replica.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
   */
  public fun replicationSourceIdentifier(): String? = unwrap(this).getReplicationSourceIdentifier()

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
   * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
   * will have the identifier that matches the value of the `DBclusterIdentifier` property.
   *
   * Example: `2015-03-07T23:45:00Z`
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretotime)
   */
  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

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
   */
  public fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   *
   * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
   * `ServerlessV2ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
   */
  public fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   *
   * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
   * `ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
   */
  public fun serverlessV2ScalingConfiguration(): Any? =
      unwrap(this).getServerlessV2ScalingConfiguration()

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
   */
  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

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
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * The AWS Region which contains the source DB cluster when replicating a DB cluster. For example,
   * `us-east-1` .
   *
   * Valid for: Aurora DB clusters only
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourceregion)
   */
  public fun sourceRegion(): String? = unwrap(this).getSourceRegion()

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
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

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
   *
   * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the storage
   * type is returned in the response. The storage type isn't returned when you set it to `aurora` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   *
   * By default, the DB cluster is not restored to the latest restorable backup time.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
   */
  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   *
   * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
   *
   * Valid for: Aurora DB clusters and Multi-AZ DB clusters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnDBClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to allocate to each DB
     * instance in the Multi-AZ DB cluster.
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * This setting is required to create a Multi-AZ DB cluster.
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created.
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created.
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param backtrackWindow The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
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
     */
    public fun backtrackWindow(backtrackWindow: Number)

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained.
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster.
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster.
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    /**
     * @param databaseName The name of your database.
     * If you don't provide a name, then Amazon RDS won't create a database in this DB cluster. For
     * naming constraints, see [Naming
     * Constraints](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun databaseName(databaseName: String)

    /**
     * @param dbClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster1`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbClusterInstanceClass The compute and memory capacity of each DB instance in the
     * Multi-AZ DB cluster, for example `db.m6gd.xlarge` . Not all DB instance classes are available in
     * all AWS Regions , or for all database engines.
     * For the full list of DB instance classes and availability for your engine, see [DB instance
     * class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun dbClusterInstanceClass(dbClusterInstanceClass: String)

    /**
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group to associate
     * with this DB cluster.
     *
     * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
     * reboot. This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
     *
     *
     * To list all of the available DB cluster parameter group names, use the following command:
     *
     * `aws rds describe-db-cluster-parameter-groups --query
     * "DBClusterParameterGroups[].DBClusterParameterGroupName" --output text`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster.
     *
     * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
     * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather
     * than during the next maintenance window.
     *
     *
     * Default: The existing name setting
     *
     * Constraints:
     *
     * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     */
    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

    /**
     * @param dbSubnetGroupName A DB subnet group that you want to associate with this DB cluster.
     * If you are restoring a DB cluster to a point in time with `RestoreType` set to
     * `copy-on-write` , and don't specify a DB subnet group name, then the DB cluster is restored with
     * a default DB subnet group.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param dbSystemId Reserved for future use.
     */
    public fun dbSystemId(dbSystemId: String)

    /**
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param domain Indicates the directory ID of the Active Directory to create the DB cluster.
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate
     * users that connect to the DB cluster.
     *
     * For more information, see [Kerberos
     * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    public fun domain(domain: String)

    /**
     * @param domainIamRoleName Specifies the name of the IAM role to use when making API calls to
     * the Directory Service.
     * Valid for: Aurora DB clusters only
     */
    public fun domainIamRoleName(domainIamRoleName: String)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
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
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
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
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database).
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     */
    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean)

    /**
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database).
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     */
    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable)

    /**
     * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
     * Aurora Serverless DB cluster.
     * By default, the HTTP endpoint is disabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
     * queries on the Aurora Serverless DB cluster. You can also query your database from inside the
     * RDS console with the query editor.
     *
     * For more information, see [Using the Data API for Aurora
     * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
     * *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    public fun enableHttpEndpoint(enableHttpEndpoint: Boolean)

    /**
     * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
     * Aurora Serverless DB cluster.
     * By default, the HTTP endpoint is disabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
     * queries on the Aurora Serverless DB cluster. You can also query your database from inside the
     * RDS console with the query editor.
     *
     * For more information, see [Using the Data API for Aurora
     * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
     * *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable)

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean)

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

    /**
     * @param engine The name of the database engine to be used for this DB cluster.
     * Valid Values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun engine(engine: String)

    /**
     * @param engineMode The DB engine mode of the DB cluster, either `provisioned` or `serverless`
     * .
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
     */
    public fun engineMode(engineMode: String)

    /**
     * @param engineVersion The version number of the database engine to use.
     * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
     * version 3 (8.0-compatible), use the following command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL
     * version 2 or version 3, respectively.
     *
     * To list all of the available engine versions for Aurora PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     *
     * `aws rds describe-db-engine-versions --engine mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for PostgreSQL, use the following
     * command:
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
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param globalClusterIdentifier If you are configuring an Aurora global database cluster and
     * want your Aurora DB cluster to be a secondary member in the global database cluster, specify the
     * global cluster ID of the global database cluster.
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
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    /**
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for each DB instance in the Multi-AZ DB cluster.
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
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the
     * database instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     * If you enable the `StorageEncrypted` property but don't specify this property, the default
     * KMS key is used. If you specify this property, you must set the `StorageEncrypted` property to
     * `true` .
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to
     * set `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key
     * is used to encrypt the read replica in that AWS Region.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    /**
     * @param masterUserPassword The master password for the DB instance.
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    public fun masterUserSecret(masterUserSecret: IResolvable)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    public fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0254e2f4dd72b3247f641935d466cdd46104f547d7ae4c2079f9c0da520fbb36")
    public
        fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty.Builder.() -> Unit)

    /**
     * @param masterUsername The name of the master user for the DB cluster.
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun masterUsername(masterUsername: String)

    /**
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB cluster.
     * To turn off collecting Enhanced Monitoring metrics, specify `0` .
     *
     * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0`
     * .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values: `0 | 1 | 5 | 10 | 15 | 30 | 60`
     *
     * Default: `0`
     */
    public fun monitoringInterval(monitoringInterval: Number)

    /**
     * @param monitoringRoleArn The Amazon Resource Name (ARN) for the IAM role that permits RDS to
     * send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting up and enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn`
     * value.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun monitoringRoleArn(monitoringRoleArn: String)

    /**
     * @param networkType The network type of the DB cluster.
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
     */
    public fun networkType(networkType: String)

    /**
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean)

    /**
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable)

    /**
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data.
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you don't specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account . Your AWS account has a
     * different default KMS key for each AWS Region .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

    /**
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data.
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values:
     *
     * * `7`
     * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months *
     * 31), `341` (11 months * 31), `589` (19 months * 31)
     * * `731`
     *
     * Default: `7` days
     *
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an
     * error.
     */
    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

    /**
     * @param port The port number on which the DB instances in the DB cluster accept connections.
     * Default:
     *
     * * When `EngineMode` is `provisioned` , `3306` (for both Aurora MySQL and Aurora PostgreSQL)
     * * When `EngineMode` is `serverless` :
     * * `3306` when `Engine` is `aurora` or `aurora-mysql`
     * * `5432` when `Engine` is `aurora-postgresql`
     *
     *
     * The `No interruption` on update behavior only applies to DB clusters. If you are updating a
     * DB instance, see
     * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
     * for the AWS::RDS::DBInstance resource.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun port(port: Number)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created.
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
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Cluster Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *
     * Constraints: Minimum 30-minute window.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible.
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible.
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param replicationSourceIdentifier The Amazon Resource Name (ARN) of the source DB instance
     * or DB cluster if this DB cluster is created as a read replica.
     * Valid for: Aurora DB clusters only
     */
    public fun replicationSourceIdentifier(replicationSourceIdentifier: String)

    /**
     * @param restoreToTime The date and time to restore the DB cluster to.
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the DB instance
     * * Must be specified if `UseLatestRestorableTime` parameter isn't provided
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled
     * * Can't be specified if the `RestoreType` parameter is `copy-on-write`
     *
     * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
     * will have the identifier that matches the value of the `DBclusterIdentifier` property.
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun restoreToTime(restoreToTime: String)

    /**
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:.
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun restoreType(restoreType: String)

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    public fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty)

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669faa99f851803fe28a32b25a008dcb1931d2e5b37783cf7d41a878fa8a1319")
    public
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable)

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty)

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7e00644e444918868049b5781d6f9ccb5826a3d4ffc86dc7538c18aba397e2")
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param snapshotIdentifier The identifier for the DB snapshot or DB cluster snapshot to
     * restore from.
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot. However, you can use only the ARN to specify a DB snapshot.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
     * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify
     * a property that is different from the previous snapshot restore property, a new DB cluster is
     * restored from the specified `SnapshotIdentifier` property, and the original DB cluster is
     * deleted.
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
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * @param sourceDbClusterIdentifier When restoring a DB cluster to a point in time, the
     * identifier of the source DB cluster from which to restore.
     * Constraints:
     *
     * * Must match the identifier of an existing DBCluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * @param sourceRegion The AWS Region which contains the source DB cluster when replicating a DB
     * cluster. For example, `us-east-1` .
     * Valid for: Aurora DB clusters only
     */
    public fun sourceRegion(sourceRegion: String)

    /**
     * @param storageEncrypted Indicates whether the DB cluster is encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncrypted Indicates whether the DB cluster is encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * @param storageType The storage type to associate with the DB cluster.
     * For information on storage types for Aurora DB clusters, see [Storage configurations for
     * Amazon Aurora DB
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
     *
     * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the
     * storage type is returned in the response. The storage type isn't returned when you set it to
     * `aurora` .
     */
    public fun storageType(storageType: String)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster.
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster.
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time.
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    /**
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time.
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBClusterProps.builder()

    /**
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to allocate to each DB
     * instance in the Multi-AZ DB cluster.
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * This setting is required to create a Multi-AZ DB cluster.
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster.
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created.
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created.
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param backtrackWindow The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
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
     */
    override fun backtrackWindow(backtrackWindow: Number) {
      cdkBuilder.backtrackWindow(backtrackWindow)
    }

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained.
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster.
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster.
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    /**
     * @param databaseName The name of your database.
     * If you don't provide a name, then Amazon RDS won't create a database in this DB cluster. For
     * naming constraints, see [Naming
     * Constraints](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param dbClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster1`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbClusterInstanceClass The compute and memory capacity of each DB instance in the
     * Multi-AZ DB cluster, for example `db.m6gd.xlarge` . Not all DB instance classes are available in
     * all AWS Regions , or for all database engines.
     * For the full list of DB instance classes and availability for your engine, see [DB instance
     * class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
      cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
    }

    /**
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group to associate
     * with this DB cluster.
     *
     * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
     * reboot. This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
     *
     *
     * To list all of the available DB cluster parameter group names, use the following command:
     *
     * `aws rds describe-db-cluster-parameter-groups --query
     * "DBClusterParameterGroups[].DBClusterParameterGroupName" --output text`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster.
     *
     * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
     * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather
     * than during the next maintenance window.
     *
     *
     * Default: The existing name setting
     *
     * Constraints:
     *
     * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     */
    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    /**
     * @param dbSubnetGroupName A DB subnet group that you want to associate with this DB cluster.
     * If you are restoring a DB cluster to a point in time with `RestoreType` set to
     * `copy-on-write` , and don't specify a DB subnet group name, then the DB cluster is restored with
     * a default DB subnet group.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param dbSystemId Reserved for future use.
     */
    override fun dbSystemId(dbSystemId: String) {
      cdkBuilder.dbSystemId(dbSystemId)
    }

    /**
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * @param domain Indicates the directory ID of the Active Directory to create the DB cluster.
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate
     * users that connect to the DB cluster.
     *
     * For more information, see [Kerberos
     * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param domainIamRoleName Specifies the name of the IAM role to use when making API calls to
     * the Directory Service.
     * Valid for: Aurora DB clusters only
     */
    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
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
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
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
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database).
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     */
    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding)
    }

    /**
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database).
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     */
    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding.let(IResolvable::unwrap))
    }

    /**
     * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
     * Aurora Serverless DB cluster.
     * By default, the HTTP endpoint is disabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
     * queries on the Aurora Serverless DB cluster. You can also query your database from inside the
     * RDS console with the query editor.
     *
     * For more information, see [Using the Data API for Aurora
     * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
     * *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    override fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
    }

    /**
     * @param enableHttpEndpoint A value that indicates whether to enable the HTTP endpoint for an
     * Aurora Serverless DB cluster.
     * By default, the HTTP endpoint is disabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
     * queries on the Aurora Serverless DB cluster. You can also query your database from inside the
     * RDS console with the query editor.
     *
     * For more information, see [Using the Data API for Aurora
     * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
     * *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     */
    override fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint.let(IResolvable::unwrap))
    }

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param engine The name of the database engine to be used for this DB cluster.
     * Valid Values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineMode The DB engine mode of the DB cluster, either `provisioned` or `serverless`
     * .
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
     */
    override fun engineMode(engineMode: String) {
      cdkBuilder.engineMode(engineMode)
    }

    /**
     * @param engineVersion The version number of the database engine to use.
     * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
     * version 3 (8.0-compatible), use the following command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL
     * version 2 or version 3, respectively.
     *
     * To list all of the available engine versions for Aurora PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     *
     * `aws rds describe-db-engine-versions --engine mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for PostgreSQL, use the following
     * command:
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
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param globalClusterIdentifier If you are configuring an Aurora global database cluster and
     * want your Aurora DB cluster to be a secondary member in the global database cluster, specify the
     * global cluster ID of the global database cluster.
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
     */
    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for each DB instance in the Multi-AZ DB cluster.
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
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the
     * database instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     * If you enable the `StorageEncrypted` property but don't specify this property, the default
     * KMS key is used. If you specify this property, you must set the `StorageEncrypted` property to
     * `true` .
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to
     * set `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key
     * is used to encrypt the read replica in that AWS Region.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
    }

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

    /**
     * @param masterUserPassword The master password for the DB instance.
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    override fun masterUserSecret(masterUserSecret: IResolvable) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(IResolvable::unwrap))
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    override fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(CfnDBCluster.MasterUserSecretProperty::unwrap))
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0254e2f4dd72b3247f641935d466cdd46104f547d7ae4c2079f9c0da520fbb36")
    override
        fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(CfnDBCluster.MasterUserSecretProperty(masterUserSecret))

    /**
     * @param masterUsername The name of the master user for the DB cluster.
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB cluster.
     * To turn off collecting Enhanced Monitoring metrics, specify `0` .
     *
     * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0`
     * .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values: `0 | 1 | 5 | 10 | 15 | 30 | 60`
     *
     * Default: `0`
     */
    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /**
     * @param monitoringRoleArn The Amazon Resource Name (ARN) for the IAM role that permits RDS to
     * send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
     * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting up and enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn`
     * value.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    /**
     * @param networkType The network type of the DB cluster.
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
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
    }

    /**
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data.
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you don't specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account . Your AWS account has a
     * different default KMS key for each AWS Region .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     */
    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    /**
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data.
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values:
     *
     * * `7`
     * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months *
     * 31), `341` (11 months * 31), `589` (19 months * 31)
     * * `731`
     *
     * Default: `7` days
     *
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an
     * error.
     */
    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    /**
     * @param port The port number on which the DB instances in the DB cluster accept connections.
     * Default:
     *
     * * When `EngineMode` is `provisioned` , `3306` (for both Aurora MySQL and Aurora PostgreSQL)
     * * When `EngineMode` is `serverless` :
     * * `3306` when `Engine` is `aurora` or `aurora-mysql`
     * * `5432` when `Engine` is `aurora-postgresql`
     *
     *
     * The `No interruption` on update behavior only applies to DB clusters. If you are updating a
     * DB instance, see
     * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
     * for the AWS::RDS::DBInstance resource.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created.
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
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Cluster Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *
     * Constraints: Minimum 30-minute window.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible.
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible.
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * @param replicationSourceIdentifier The Amazon Resource Name (ARN) of the source DB instance
     * or DB cluster if this DB cluster is created as a read replica.
     * Valid for: Aurora DB clusters only
     */
    override fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
      cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
    }

    /**
     * @param restoreToTime The date and time to restore the DB cluster to.
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the DB instance
     * * Must be specified if `UseLatestRestorableTime` parameter isn't provided
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled
     * * Can't be specified if the `RestoreType` parameter is `copy-on-write`
     *
     * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
     * will have the identifier that matches the value of the `DBclusterIdentifier` property.
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    override
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(CfnDBCluster.ScalingConfigurationProperty::unwrap))
    }

    /**
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster.
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669faa99f851803fe28a32b25a008dcb1931d2e5b37783cf7d41a878fa8a1319")
    override
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(CfnDBCluster.ScalingConfigurationProperty(scalingConfiguration))

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    override fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(CfnDBCluster.ServerlessV2ScalingConfigurationProperty::unwrap))
    }

    /**
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster.
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7e00644e444918868049b5781d6f9ccb5826a3d4ffc86dc7538c18aba397e2")
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessV2ScalingConfiguration(CfnDBCluster.ServerlessV2ScalingConfigurationProperty(serverlessV2ScalingConfiguration))

    /**
     * @param snapshotIdentifier The identifier for the DB snapshot or DB cluster snapshot to
     * restore from.
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot. However, you can use only the ARN to specify a DB snapshot.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
     * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify
     * a property that is different from the previous snapshot restore property, a new DB cluster is
     * restored from the specified `SnapshotIdentifier` property, and the original DB cluster is
     * deleted.
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
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * @param sourceDbClusterIdentifier When restoring a DB cluster to a point in time, the
     * identifier of the source DB cluster from which to restore.
     * Constraints:
     *
     * * Must match the identifier of an existing DBCluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param sourceRegion The AWS Region which contains the source DB cluster when replicating a DB
     * cluster. For example, `us-east-1` .
     * Valid for: Aurora DB clusters only
     */
    override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
    }

    /**
     * @param storageEncrypted Indicates whether the DB cluster is encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted Indicates whether the DB cluster is encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * @param storageType The storage type to associate with the DB cluster.
     * For information on storage types for Aurora DB clusters, see [Storage configurations for
     * Amazon Aurora DB
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
     *
     * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the
     * storage type is returned in the response. The storage type isn't returned when you set it to
     * `aurora` .
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster.
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster.
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time.
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time.
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterProps,
  ) : CdkObject(cdkObject), CfnDBClusterProps {
    /**
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
     * cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-allocatedstorage)
     */
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     */
    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

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
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

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
     */
    override fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

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
     */
    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    /**
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
     * cluster.
     *
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
     */
    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

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
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

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
     */
    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

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
     */
    override fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

    /**
     * The name of the DB cluster parameter group to associate with this DB cluster.
     *
     *
     * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
     * reboot. This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
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
     */
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     *
     *
     * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
     * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather
     * than during the next maintenance window.
     *
     *
     * Default: The existing name setting
     *
     * Constraints:
     *
     * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbinstanceparametergroupname)
     */
    override fun dbInstanceParameterGroupName(): String? =
        unwrap(this).getDbInstanceParameterGroupName()

    /**
     * A DB subnet group that you want to associate with this DB cluster.
     *
     * If you are restoring a DB cluster to a point in time with `RestoreType` set to
     * `copy-on-write` , and don't specify a DB subnet group name, then the DB cluster is restored with
     * a default DB subnet group.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsystemid)
     */
    override fun dbSystemId(): String? = unwrap(this).getDbSystemId()

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * Indicates the directory ID of the Active Directory to create the DB cluster.
     *
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate
     * users that connect to the DB cluster.
     *
     * For more information, see [Kerberos
     * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * Specifies the name of the IAM role to use when making API calls to the Directory Service.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domainiamrolename)
     */
    override fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

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
     */
    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    /**
     * Specifies whether to enable this DB cluster to forward write operations to the primary
     * cluster of a global cluster (Aurora global database).
     *
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
     */
    override fun enableGlobalWriteForwarding(): Any? = unwrap(this).getEnableGlobalWriteForwarding()

    /**
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB
     * cluster.
     *
     * By default, the HTTP endpoint is disabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL
     * queries on the Aurora Serverless DB cluster. You can also query your database from inside the
     * RDS console with the query editor.
     *
     * For more information, see [Using the Data API for Aurora
     * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the
     * *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
     */
    override fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

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
     */
    override fun enableIamDatabaseAuthentication(): Any? =
        unwrap(this).getEnableIamDatabaseAuthentication()

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
     */
    override fun engine(): String? = unwrap(this).getEngine()

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
     */
    override fun engineMode(): String? = unwrap(this).getEngineMode()

    /**
     * The version number of the database engine to use.
     *
     * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
     * version 3 (8.0-compatible), use the following command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL
     * version 2 or version 3, respectively.
     *
     * To list all of the available engine versions for Aurora PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     *
     * `aws rds describe-db-engine-versions --engine mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for PostgreSQL, use the following
     * command:
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
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to
     * be a secondary member in the global database cluster, specify the global cluster ID of the
     * global database cluster.
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
     */
    override fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

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
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
     * instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     *
     * If you enable the `StorageEncrypted` property but don't specify this property, the default
     * KMS key is used. If you specify this property, you must set the `StorageEncrypted` property to
     * `true` .
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to
     * set `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key
     * is used to encrypt the read replica in that AWS Region.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
     */
    override fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

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
     */
    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     */
    override fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

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
     */
    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for
     * the DB cluster.
     *
     * To turn off collecting Enhanced Monitoring metrics, specify `0` .
     *
     * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0`
     * .
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
     */
    override fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

    /**
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     *
     * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting up and enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn`
     * value.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringrolearn)
     */
    override fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

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
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

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
     */
    override fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

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
     */
    override fun performanceInsightsKmsKeyId(): String? =
        unwrap(this).getPerformanceInsightsKmsKeyId()

    /**
     * The number of days to retain Performance Insights data.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values:
     *
     * * `7`
     * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months *
     * 31), `341` (11 months * 31), `589` (19 months * 31)
     * * `731`
     *
     * Default: `7` days
     *
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an
     * error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsretentionperiod)
     */
    override fun performanceInsightsRetentionPeriod(): Number? =
        unwrap(this).getPerformanceInsightsRetentionPeriod()

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
     * The `No interruption` on update behavior only applies to DB clusters. If you are updating a
     * DB instance, see
     * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
     * for the AWS::RDS::DBInstance resource.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

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
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Cluster Maintenance
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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Specifies whether the DB cluster is publicly accessible.
     *
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
     * created as a read replica.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
     */
    override fun replicationSourceIdentifier(): String? =
        unwrap(this).getReplicationSourceIdentifier()

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
     * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
     * will have the identifier that matches the value of the `DBclusterIdentifier` property.
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretotime)
     */
    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

    /**
     * The type of restore to be performed. You can specify one of the following values:.
     *
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - "full-copy"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretype)
     */
    override fun restoreType(): String? = unwrap(this).getRestoreType()

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     */
    override fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     */
    override fun serverlessV2ScalingConfiguration(): Any? =
        unwrap(this).getServerlessV2ScalingConfiguration()

    /**
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot. However, you can use only the ARN to specify a DB snapshot.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
     * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify
     * a property that is different from the previous snapshot restore property, a new DB cluster is
     * restored from the specified `SnapshotIdentifier` property, and the original DB cluster is
     * deleted.
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
     */
    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

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
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    /**
     * The AWS Region which contains the source DB cluster when replicating a DB cluster. For
     * example, `us-east-1` .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourceregion)
     */
    override fun sourceRegion(): String? = unwrap(this).getSourceRegion()

    /**
     * Indicates whether the DB cluster is encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    /**
     * The storage type to associate with the DB cluster.
     *
     * For information on storage types for Aurora DB clusters, see [Storage configurations for
     * Amazon Aurora DB
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
     *
     * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the
     * storage type is returned in the response. The storage type isn't returned when you set it to
     * `aurora` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * An optional array of key-value pairs to apply to this DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A value that indicates whether to restore the DB cluster to the latest restorable backup
     * time.
     *
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
     */
    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterProps):
        CfnDBClusterProps = CdkObjectWrappers.wrap(cdkObject) as CfnDBClusterProps

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.rds.CfnDBClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBClusterProps
  }
}
