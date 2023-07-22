@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.rds.BackupProps
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.DBClusterStorageType
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IClusterInstance
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.InstanceProps
import software.amazon.awscdk.services.rds.InstanceUpdateBehaviour
import software.amazon.awscdk.services.rds.NetworkType
import software.amazon.awscdk.services.rds.SnapshotCredentials
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

@CdkDslMarker
public class DatabaseClusterFromSnapshotDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DatabaseClusterFromSnapshot.Builder =
      DatabaseClusterFromSnapshot.Builder.create(scope, id)

  private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _readers: MutableList<IClusterInstance> = mutableListOf()

  private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

  private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * The number of seconds to set a cluster's target backtrack window to.
   *
   * This feature is only supported by the Aurora MySQL database engine and
   * cannot be enabled on existing clusters.
   *
   * Default: 0 seconds (no backtrack)
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html)
   * @param backtrackWindow The number of seconds to set a cluster's target backtrack window to. 
   */
  public fun backtrackWindow(backtrackWindow: Duration) {
    cdkBuilder.backtrackWindow(backtrackWindow)
  }

  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
   * @param backup Backup settings. 
   */
  public fun backup(backup: BackupPropsDsl.() -> Unit = {}) {
    val builder = BackupPropsDsl()
    builder.apply(backup)
    cdkBuilder.backup(builder.build())
  }

  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
   * @param backup Backup settings. 
   */
  public fun backup(backup: BackupProps) {
    cdkBuilder.backup(backup)
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * Default: - no log exports
   *
   * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
   * CloudWatch Logs. 
   */
  public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String) {
    _cloudwatchLogsExports.addAll(listOf(*cloudwatchLogsExports))
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * Default: - no log exports
   *
   * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
   * CloudWatch Logs. 
   */
  public fun cloudwatchLogsExports(cloudwatchLogsExports: Collection<String>) {
    _cloudwatchLogsExports.addAll(cloudwatchLogsExports)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `Infinity`.
   *
   * Default: - logs never expire
   *
   * @param cloudwatchLogsRetention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
    cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention)
  }

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - a new role is created.
   *
   * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
   * custom resource that sets the retention policy. 
   */
  public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
    cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole)
  }

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   *
   * @param clusterIdentifier An optional identifier for the cluster. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - true
   *
   * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * (deprecated) Credentials for the administrative user.
   *
   * Note - using this prop only works with `Credentials.fromPassword()` with the
   * username of the snapshot, `Credentials.fromUsername()` with the username and
   * password of the snapshot or `Credentials.fromSecret()` with a secret containing
   * the username and password of the snapshot.
   *
   * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
   * password
   * that **will not be applied** to the cluster, use `snapshotCredentials` for the correct
   * behavior.
   *
   * @deprecated use `snapshotCredentials` which allows to generate a new password
   * @param credentials Credentials for the administrative user. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * Name of a database which is automatically created inside the cluster.
   *
   * Default: - Database is not created in cluster.
   *
   * @param defaultDatabaseName Name of a database which is automatically created inside the
   * cluster. 
   */
  public fun defaultDatabaseName(defaultDatabaseName: String) {
    cdkBuilder.defaultDatabaseName(defaultDatabaseName)
  }

  /**
   * Indicates whether the DB cluster should have deletion protection enabled.
   *
   * Default: - true if `removalPolicy` is RETAIN, `undefined` otherwise, which will not enable
   * deletion protection.
   * To disable deletion protection after it has been enabled, you must explicitly set this value to
   * `false`.
   *
   * @param deletionProtection Indicates whether the DB cluster should have deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * What kind of database to start.
   *
   * @param engine What kind of database to start. 
   */
  public fun engine(engine: IClusterEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
   * accounts.
   *
   * Default: false
   *
   * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts. 
   */
  public fun iamAuthentication(iamAuthentication: Boolean) {
    cdkBuilder.iamAuthentication(iamAuthentication)
  }

  /**
   * Base identifier for instances.
   *
   * Every replica is named by appending the replica number to this string, 1-based.
   *
   * Default: - clusterIdentifier is used with the word "Instance" appended.
   * If clusterIdentifier is not provided, the identifier is automatically generated.
   *
   * @param instanceIdentifierBase Base identifier for instances. 
   */
  public fun instanceIdentifierBase(instanceIdentifierBase: String) {
    cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
  }

  /**
   * (deprecated) Settings for the individual instances that are launched.
   *
   * * use writer and readers instead
   * @param instanceProps Settings for the individual instances that are launched. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instanceProps(instanceProps: InstancePropsDsl.() -> Unit = {}) {
    val builder = InstancePropsDsl()
    builder.apply(instanceProps)
    cdkBuilder.instanceProps(builder.build())
  }

  /**
   * (deprecated) Settings for the individual instances that are launched.
   *
   * * use writer and readers instead
   * @param instanceProps Settings for the individual instances that are launched. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instanceProps(instanceProps: InstanceProps) {
    cdkBuilder.instanceProps(instanceProps)
  }

  /**
   * The ordering of updates for instances.
   *
   * Default: InstanceUpdateBehaviour.BULK
   *
   * @param instanceUpdateBehaviour The ordering of updates for instances. 
   */
  public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
    cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour)
  }

  /**
   * (deprecated) How many replicas/instances to create.
   *
   * Has to be at least 1.
   *
   * Default: 2
   *
   * * use writer and readers instead
   * @param instances How many replicas/instances to create. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instances(instances: Number) {
    cdkBuilder.instances(instances)
  }

  /**
   * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
   * for the DB instances.
   *
   * Default: no enhanced monitoring
   *
   * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
   * enhanced monitoring metrics for the DB instances. 
   */
  public fun monitoringInterval(monitoringInterval: Duration) {
    cdkBuilder.monitoringInterval(monitoringInterval)
  }

  /**
   * Role that will be used to manage DB instances monitoring.
   *
   * Default: - A role is automatically created for you
   *
   * @param monitoringRole Role that will be used to manage DB instances monitoring. 
   */
  public fun monitoringRole(monitoringRole: IRole) {
    cdkBuilder.monitoringRole(monitoringRole)
  }

  /**
   * The network type of the DB instance.
   *
   * Default: - IPV4
   *
   * @param networkType The network type of the DB instance. 
   */
  public fun networkType(networkType: NetworkType) {
    cdkBuilder.networkType(networkType)
  }

  /**
   * Additional parameters to pass to the database engine.
   *
   * Default: - No parameter group.
   *
   * @param parameterGroup Additional parameters to pass to the database engine. 
   */
  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * The parameters in the DBClusterParameterGroup to create automatically.
   *
   * You can only specify parameterGroup or parameters but not both.
   * You need to use a versioned engine to auto-generate a DBClusterParameterGroup.
   *
   * Default: - None
   *
   * @param parameters The parameters in the DBClusterParameterGroup to create automatically. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * What port to listen on.
   *
   * Default: - The default for the engine is used.
   *
   * @param port What port to listen on. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * A preferred maintenance window day/time range. Should be specified as a range
   * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
   *
   * Example: 'Sun:23:45-Mon:00:15'
   *
   * Default: - 30-minute window selected at random from an 8-hour block of time for
   * each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance)
   * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
   * specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * A list of instances to create as cluster reader instances.
   *
   * Default: - no readers are created. The cluster will have a single writer/reader
   *
   * @param readers A list of instances to create as cluster reader instances. 
   */
  public fun readers(vararg readers: IClusterInstance) {
    _readers.addAll(listOf(*readers))
  }

  /**
   * A list of instances to create as cluster reader instances.
   *
   * Default: - no readers are created. The cluster will have a single writer/reader
   *
   * @param readers A list of instances to create as cluster reader instances. 
   */
  public fun readers(readers: Collection<IClusterInstance>) {
    _readers.addAll(readers)
  }

  /**
   * The removal policy to apply when the cluster and its instances are removed from the stack or
   * replaced during an update.
   *
   * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
   * the data)
   *
   * @param removalPolicy The removal policy to apply when the cluster and its instances are removed
   * from the stack or replaced during an update. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * S3 buckets that you want to load data into. This feature is only supported by the Aurora
   * database engine.
   *
   * This property must not be used if `s3ExportRole` is used.
   *
   * For MySQL:
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/postgresql-s3-export.html)
   * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
   * supported by the Aurora database engine. 
   */
  public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket) {
    _s3ExportBuckets.addAll(listOf(*s3ExportBuckets))
  }

  /**
   * S3 buckets that you want to load data into. This feature is only supported by the Aurora
   * database engine.
   *
   * This property must not be used if `s3ExportRole` is used.
   *
   * For MySQL:
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/postgresql-s3-export.html)
   * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
   * supported by the Aurora database engine. 
   */
  public fun s3ExportBuckets(s3ExportBuckets: Collection<IBucket>) {
    _s3ExportBuckets.addAll(s3ExportBuckets)
  }

  /**
   * Role that will be associated with this DB cluster to enable S3 export.
   *
   * This feature is only supported by the Aurora database engine.
   *
   * This property must not be used if `s3ExportBuckets` is used.
   *
   * For MySQL:
   *
   * Default: - New role is created if `s3ExportBuckets` is set, no role is defined otherwise
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/postgresql-s3-export.html)
   * @param s3ExportRole Role that will be associated with this DB cluster to enable S3 export. 
   */
  public fun s3ExportRole(s3ExportRole: IRole) {
    cdkBuilder.s3ExportRole(s3ExportRole)
  }

  /**
   * S3 buckets that you want to load data from. This feature is only supported by the Aurora
   * database engine.
   *
   * This property must not be used if `s3ImportRole` is used.
   *
   * For MySQL:
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Migrating.html)
   * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
   * supported by the Aurora database engine. 
   */
  public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket) {
    _s3ImportBuckets.addAll(listOf(*s3ImportBuckets))
  }

  /**
   * S3 buckets that you want to load data from. This feature is only supported by the Aurora
   * database engine.
   *
   * This property must not be used if `s3ImportRole` is used.
   *
   * For MySQL:
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Migrating.html)
   * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
   * supported by the Aurora database engine. 
   */
  public fun s3ImportBuckets(s3ImportBuckets: Collection<IBucket>) {
    _s3ImportBuckets.addAll(s3ImportBuckets)
  }

  /**
   * Role that will be associated with this DB cluster to enable S3 import.
   *
   * This feature is only supported by the Aurora database engine.
   *
   * This property must not be used if `s3ImportBuckets` is used.
   *
   * For MySQL:
   *
   * Default: - New role is created if `s3ImportBuckets` is set, no role is defined otherwise
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Migrating.html)
   * @param s3ImportRole Role that will be associated with this DB cluster to enable S3 import. 
   */
  public fun s3ImportRole(s3ImportRole: IRole) {
    cdkBuilder.s3ImportRole(s3ImportRole)
  }

  /**
   * Security group.
   *
   * Default: a new security group is created.
   *
   * @param securityGroups Security group. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * Security group.
   *
   * Default: a new security group is created.
   *
   * @param securityGroups Security group. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2
   * cluster.
   *
   * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
   * The largest value that you can use is 128 (256GB).
   *
   * The maximum capacity must be higher than 0.5 ACUs.
   *
   * Default: 2
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
   * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
   * instance in an Aurora Serverless v2 cluster. 
   */
  public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
    cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
  }

  /**
   * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2
   * cluster.
   *
   * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on.
   * The smallest value that you can use is 0.5.
   *
   * Default: 0.5
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
   * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
   * instance in an Aurora Serverless v2 cluster. 
   */
  public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
    cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
  }

  /**
   * Master user credentials.
   *
   * Note - It is not possible to change the master username for a snapshot;
   * however, it is possible to provide (or generate) a new password.
   *
   * Default: - The existing username and password from the snapshot will be used.
   *
   * @param snapshotCredentials Master user credentials. 
   */
  public fun snapshotCredentials(snapshotCredentials: SnapshotCredentials) {
    cdkBuilder.snapshotCredentials(snapshotCredentials)
  }

  /**
   * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
   *
   * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot.
   * However, you can use only the ARN to specify a DB instance snapshot.
   *
   * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot to
   * restore from. 
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  /**
   * Whether to enable storage encryption.
   *
   * Default: - true if storageEncryptionKey is provided, false otherwise
   *
   * @param storageEncrypted Whether to enable storage encryption. 
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * The KMS key for storage encryption.
   *
   * If specified, `storageEncrypted` will be set to `true`.
   *
   * Default: - if storageEncrypted is true then the default master key, no key otherwise
   *
   * @param storageEncryptionKey The KMS key for storage encryption. 
   */
  public fun storageEncryptionKey(storageEncryptionKey: IKey) {
    cdkBuilder.storageEncryptionKey(storageEncryptionKey)
  }

  /**
   * The storage type to be associated with the DB cluster.
   *
   * Default: - DBClusterStorageType.AURORA_IOPT1
   *
   * @param storageType The storage type to be associated with the DB cluster. 
   */
  public fun storageType(storageType: DBClusterStorageType) {
    cdkBuilder.storageType(storageType)
  }

  /**
   * Existing subnet group for the cluster.
   *
   * Default: - a new subnet group will be created.
   *
   * @param subnetGroup Existing subnet group for the cluster. 
   */
  public fun subnetGroup(subnetGroup: ISubnetGroup) {
    cdkBuilder.subnetGroup(subnetGroup)
  }

  /**
   * What subnets to run the RDS instances in.
   *
   * Must be at least 2 subnets in two different AZs.
   *
   * @param vpc What subnets to run the RDS instances in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Where to place the instances within the VPC.
   *
   * Default: - the Vpc default strategy if not specified.
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * Where to place the instances within the VPC.
   *
   * Default: - the Vpc default strategy if not specified.
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  /**
   * The instance to use for the cluster writer.
   *
   * Default: required if instanceProps is not provided
   *
   * @param writer The instance to use for the cluster writer. 
   */
  public fun writer(writer: IClusterInstance) {
    cdkBuilder.writer(writer)
  }

  public fun build(): DatabaseClusterFromSnapshot {
    if(_cloudwatchLogsExports.isNotEmpty()) cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
    if(_readers.isNotEmpty()) cdkBuilder.readers(_readers)
    if(_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
    if(_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
