@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a new database cluster.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface DatabaseClusterProps {
  /**
   * The number of seconds to set a cluster's target backtrack window to.
   *
   * This feature is only supported by the Aurora MySQL database engine and
   * cannot be enabled on existing clusters.
   *
   * Default: 0 seconds (no backtrack)
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html)
   */
  public fun backtrackWindow(): Duration? = unwrap(this).getBacktrackWindow()?.let(Duration::wrap)

  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
   */
  public fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * Default: - no log exports
   */
  public fun cloudwatchLogsExports(): List<String> = unwrap(this).getCloudwatchLogsExports() ?:
      emptyList()

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `Infinity`.
   *
   * Default: - logs never expire
   */
  public fun cloudwatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudwatchLogsRetention()?.let(RetentionDays::wrap)

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - a new role is created.
   */
  public fun cloudwatchLogsRetentionRole(): IRole? =
      unwrap(this).getCloudwatchLogsRetentionRole()?.let(IRole::wrap)

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   */
  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - true
   */
  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * Credentials for the administrative user.
   *
   * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
   * password
   */
  public fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

  /**
   * Name of a database which is automatically created inside the cluster.
   *
   * Default: - Database is not created in cluster.
   */
  public fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

  /**
   * Indicates whether the DB cluster should have deletion protection enabled.
   *
   * Default: - true if `removalPolicy` is RETAIN, `undefined` otherwise, which will not enable
   * deletion protection.
   * To disable deletion protection after it has been enabled, you must explicitly set this value to
   * `false`.
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * Directory ID for associating the DB cluster with a specific Active Directory.
   *
   * Necessary for enabling Kerberos authentication. If specified, the DB cluster joins the given
   * Active Directory, enabling Kerberos authentication.
   * If not specified, the DB cluster will not be associated with any Active Directory, and Kerberos
   * authentication will not be enabled.
   *
   * Default: - DB cluster is not associated with an Active Directory; Kerberos authentication is
   * not enabled.
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The IAM role to be used when making API calls to the Directory Service.
   *
   * The role needs the AWS-managed policy
   * `AmazonRDSDirectoryServiceAccess` or equivalent.
   *
   * Default: - If `DatabaseClusterBaseProps.domain` is specified, a role with the
   * `AmazonRDSDirectoryServiceAccess` policy is automatically created.
   */
  public fun domainRole(): IRole? = unwrap(this).getDomainRole()?.let(IRole::wrap)

  /**
   * Whether to enable the Data API for the cluster.
   *
   * Default: - false
   */
  public fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

  /**
   * What kind of database to start.
   */
  public fun engine(): IClusterEngine

  /**
   * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
   * accounts.
   *
   * Default: false
   */
  public fun iamAuthentication(): Boolean? = unwrap(this).getIamAuthentication()

  /**
   * Base identifier for instances.
   *
   * Every replica is named by appending the replica number to this string, 1-based.
   *
   * Default: - clusterIdentifier is used with the word "Instance" appended.
   * If clusterIdentifier is not provided, the identifier is automatically generated.
   */
  public fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

  /**
   * (deprecated) Settings for the individual instances that are launched.
   *
   * * use writer and readers instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instanceProps(): InstanceProps? =
      unwrap(this).getInstanceProps()?.let(InstanceProps::wrap)

  /**
   * The ordering of updates for instances.
   *
   * Default: InstanceUpdateBehaviour.BULK
   */
  public fun instanceUpdateBehaviour(): InstanceUpdateBehaviour? =
      unwrap(this).getInstanceUpdateBehaviour()?.let(InstanceUpdateBehaviour::wrap)

  /**
   * (deprecated) How many replicas/instances to create.
   *
   * Has to be at least 1.
   *
   * Default: 2
   *
   * * use writer and readers instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instances(): Number? = unwrap(this).getInstances()

  /**
   * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
   * for the DB instances.
   *
   * Default: no enhanced monitoring
   */
  public fun monitoringInterval(): Duration? =
      unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

  /**
   * Role that will be used to manage DB instances monitoring.
   *
   * Default: - A role is automatically created for you
   */
  public fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

  /**
   * The network type of the DB instance.
   *
   * Default: - IPV4
   */
  public fun networkType(): NetworkType? = unwrap(this).getNetworkType()?.let(NetworkType::wrap)

  /**
   * Additional parameters to pass to the database engine.
   *
   * Default: - No parameter group.
   */
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  /**
   * The parameters in the DBClusterParameterGroup to create automatically.
   *
   * You can only specify parameterGroup or parameters but not both.
   * You need to use a versioned engine to auto-generate a DBClusterParameterGroup.
   *
   * Default: - None
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * What port to listen on.
   *
   * Default: - The default for the engine is used.
   */
  public fun port(): Number? = unwrap(this).getPort()

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
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * A list of instances to create as cluster reader instances.
   *
   * Default: - no readers are created. The cluster will have a single writer/reader
   */
  public fun readers(): List<IClusterInstance> =
      unwrap(this).getReaders()?.map(IClusterInstance::wrap) ?: emptyList()

  /**
   * The removal policy to apply when the cluster and its instances are removed from the stack or
   * replaced during an update.
   *
   * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
   * the data)
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

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
   */
  public fun s3ExportBuckets(): List<IBucket> =
      unwrap(this).getS3ExportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
   */
  public fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

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
   */
  public fun s3ImportBuckets(): List<IBucket> =
      unwrap(this).getS3ImportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
   */
  public fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

  /**
   * Security group.
   *
   * Default: a new security group is created.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

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
   */
  public fun serverlessV2MaxCapacity(): Number? = unwrap(this).getServerlessV2MaxCapacity()

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
   */
  public fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

  /**
   * Whether to enable storage encryption.
   *
   * Default: - true if storageEncryptionKey is provided, false otherwise
   */
  public fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

  /**
   * The KMS key for storage encryption.
   *
   * If specified, `storageEncrypted` will be set to `true`.
   *
   * Default: - if storageEncrypted is true then the default master key, no key otherwise
   */
  public fun storageEncryptionKey(): IKey? = unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

  /**
   * The storage type to be associated with the DB cluster.
   *
   * Default: - DBClusterStorageType.AURORA_IOPT1
   */
  public fun storageType(): DBClusterStorageType? =
      unwrap(this).getStorageType()?.let(DBClusterStorageType::wrap)

  /**
   * Existing subnet group for the cluster.
   *
   * Default: - a new subnet group will be created.
   */
  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  /**
   * What subnets to run the RDS instances in.
   *
   * Must be at least 2 subnets in two different AZs.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Where to place the instances within the VPC.
   *
   * Default: - the Vpc default strategy if not specified.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * The instance to use for the cluster writer.
   *
   * Default: required if instanceProps is not provided
   */
  public fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)

  /**
   * A builder for [DatabaseClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backtrackWindow The number of seconds to set a cluster's target backtrack window to.
     * This feature is only supported by the Aurora MySQL database engine and
     * cannot be enabled on existing clusters.
     */
    public fun backtrackWindow(backtrackWindow: Duration)

    /**
     * @param backup Backup settings.
     */
    public fun backup(backup: BackupProps)

    /**
     * @param backup Backup settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49cd1803fcd3e6b1b4c8e17bdc77d845dc10482a9520b395e9297a5bdc65de2b")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>)

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String)

    /**
     * @param cloudwatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     */
    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays)

    /**
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy.
     */
    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole)

    /**
     * @param clusterIdentifier An optional identifier for the cluster.
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param credentials Credentials for the administrative user.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster.
     */
    public fun defaultDatabaseName(defaultDatabaseName: String)

    /**
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param domain Directory ID for associating the DB cluster with a specific Active Directory.
     * Necessary for enabling Kerberos authentication. If specified, the DB cluster joins the given
     * Active Directory, enabling Kerberos authentication.
     * If not specified, the DB cluster will not be associated with any Active Directory, and
     * Kerberos authentication will not be enabled.
     */
    public fun domain(domain: String)

    /**
     * @param domainRole The IAM role to be used when making API calls to the Directory Service.
     * The role needs the AWS-managed policy
     * `AmazonRDSDirectoryServiceAccess` or equivalent.
     */
    public fun domainRole(domainRole: IRole)

    /**
     * @param enableDataApi Whether to enable the Data API for the cluster.
     */
    public fun enableDataApi(enableDataApi: Boolean)

    /**
     * @param engine What kind of database to start. 
     */
    public fun engine(engine: IClusterEngine)

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts.
     */
    public fun iamAuthentication(iamAuthentication: Boolean)

    /**
     * @param instanceIdentifierBase Base identifier for instances.
     * Every replica is named by appending the replica number to this string, 1-based.
     */
    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps)

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df92396c9f0edddf0036074d7ca7989bf0b2d9b4c27e949b9ec901c0f4ba477")
    public fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit)

    /**
     * @param instanceUpdateBehaviour The ordering of updates for instances.
     */
    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour)

    /**
     * @param instances How many replicas/instances to create.
     * Has to be at least 1.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instances(instances: Number)

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instances.
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * @param monitoringRole Role that will be used to manage DB instances monitoring.
     */
    public fun monitoringRole(monitoringRole: IRole)

    /**
     * @param networkType The network type of the DB instance.
     */
    public fun networkType(networkType: NetworkType)

    /**
     * @param parameterGroup Additional parameters to pass to the database engine.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param parameters The parameters in the DBClusterParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBClusterParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param port What port to listen on.
     */
    public fun port(port: Number)

    /**
     * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
     * specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     * Example: 'Sun:23:45-Mon:00:15'
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param readers A list of instances to create as cluster reader instances.
     */
    public fun readers(readers: List<IClusterInstance>)

    /**
     * @param readers A list of instances to create as cluster reader instances.
     */
    public fun readers(vararg readers: IClusterInstance)

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For MySQL:
     */
    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For MySQL:
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket)

    /**
     * @param s3ExportRole Role that will be associated with this DB cluster to enable S3 export.
     * This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For MySQL:
     */
    public fun s3ExportRole(s3ExportRole: IRole)

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ImportRole` is used.
     *
     * For MySQL:
     */
    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ImportRole` is used.
     *
     * For MySQL:
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket)

    /**
     * @param s3ImportRole Role that will be associated with this DB cluster to enable S3 import.
     * This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For MySQL:
     */
    public fun s3ImportRole(s3ImportRole: IRole)

    /**
     * @param securityGroups Security group.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Security group.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 128 (256GB).
     *
     * The maximum capacity must be higher than 0.5 ACUs.
     */
    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number)

    /**
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on.
     * The smallest value that you can use is 0.5.
     */
    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number)

    /**
     * @param storageEncrypted Whether to enable storage encryption.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncryptionKey The KMS key for storage encryption.
     * If specified, `storageEncrypted` will be set to `true`.
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    /**
     * @param storageType The storage type to be associated with the DB cluster.
     */
    public fun storageType(storageType: DBClusterStorageType)

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * @param vpc What subnets to run the RDS instances in.
     * Must be at least 2 subnets in two different AZs.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81da83322806002508132cc1ba556c3ce2710568323ae7c68d5238cdaed9c886")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param writer The instance to use for the cluster writer.
     */
    public fun writer(writer: IClusterInstance)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseClusterProps.builder()

    /**
     * @param backtrackWindow The number of seconds to set a cluster's target backtrack window to.
     * This feature is only supported by the Aurora MySQL database engine and
     * cannot be enabled on existing clusters.
     */
    override fun backtrackWindow(backtrackWindow: Duration) {
      cdkBuilder.backtrackWindow(backtrackWindow.let(Duration::unwrap))
    }

    /**
     * @param backup Backup settings.
     */
    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
    }

    /**
     * @param backup Backup settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49cd1803fcd3e6b1b4c8e17bdc77d845dc10482a9520b395e9297a5bdc65de2b")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs.
     */
    override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs.
     */
    override fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String): Unit =
        cloudwatchLogsExports(cloudwatchLogsExports.toList())

    /**
     * @param cloudwatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     */
    override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy.
     */
    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    /**
     * @param clusterIdentifier An optional identifier for the cluster.
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param credentials Credentials for the administrative user.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster.
     */
    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    /**
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param domain Directory ID for associating the DB cluster with a specific Active Directory.
     * Necessary for enabling Kerberos authentication. If specified, the DB cluster joins the given
     * Active Directory, enabling Kerberos authentication.
     * If not specified, the DB cluster will not be associated with any Active Directory, and
     * Kerberos authentication will not be enabled.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param domainRole The IAM role to be used when making API calls to the Directory Service.
     * The role needs the AWS-managed policy
     * `AmazonRDSDirectoryServiceAccess` or equivalent.
     */
    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    /**
     * @param enableDataApi Whether to enable the Data API for the cluster.
     */
    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    /**
     * @param engine What kind of database to start. 
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts.
     */
    override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    /**
     * @param instanceIdentifierBase Base identifier for instances.
     * Every replica is named by appending the replica number to this string, 1-based.
     */
    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(instanceProps: InstanceProps) {
      cdkBuilder.instanceProps(instanceProps.let(InstanceProps::unwrap))
    }

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df92396c9f0edddf0036074d7ca7989bf0b2d9b4c27e949b9ec901c0f4ba477")
    override fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit): Unit =
        instanceProps(InstanceProps(instanceProps))

    /**
     * @param instanceUpdateBehaviour The ordering of updates for instances.
     */
    override fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
      cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour.let(InstanceUpdateBehaviour::unwrap))
    }

    /**
     * @param instances How many replicas/instances to create.
     * Has to be at least 1.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instances.
     */
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    /**
     * @param monitoringRole Role that will be used to manage DB instances monitoring.
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    /**
     * @param networkType The network type of the DB instance.
     */
    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    /**
     * @param parameterGroup Additional parameters to pass to the database engine.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * @param parameters The parameters in the DBClusterParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBClusterParameterGroup.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param port What port to listen on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
     * specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     * Example: 'Sun:23:45-Mon:00:15'
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param readers A list of instances to create as cluster reader instances.
     */
    override fun readers(readers: List<IClusterInstance>) {
      cdkBuilder.readers(readers.map(IClusterInstance::unwrap))
    }

    /**
     * @param readers A list of instances to create as cluster reader instances.
     */
    override fun readers(vararg readers: IClusterInstance): Unit = readers(readers.toList())

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ExportBuckets(vararg s3ExportBuckets: IBucket): Unit =
        s3ExportBuckets(s3ExportBuckets.toList())

    /**
     * @param s3ExportRole Role that will be associated with this DB cluster to enable S3 export.
     * This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For MySQL:
     */
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ImportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ImportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ImportBuckets(vararg s3ImportBuckets: IBucket): Unit =
        s3ImportBuckets(s3ImportBuckets.toList())

    /**
     * @param s3ImportRole Role that will be associated with this DB cluster to enable S3 import.
     * This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For MySQL:
     */
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 128 (256GB).
     *
     * The maximum capacity must be higher than 0.5 ACUs.
     */
    override fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
      cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

    /**
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on.
     * The smallest value that you can use is 0.5.
     */
    override fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
      cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    /**
     * @param storageEncrypted Whether to enable storage encryption.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncryptionKey The KMS key for storage encryption.
     * If specified, `storageEncrypted` will be set to `true`.
     */
    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    /**
     * @param storageType The storage type to be associated with the DB cluster.
     */
    override fun storageType(storageType: DBClusterStorageType) {
      cdkBuilder.storageType(storageType.let(DBClusterStorageType::unwrap))
    }

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    /**
     * @param vpc What subnets to run the RDS instances in.
     * Must be at least 2 subnets in two different AZs.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81da83322806002508132cc1ba556c3ce2710568323ae7c68d5238cdaed9c886")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param writer The instance to use for the cluster writer.
     */
    override fun writer(writer: IClusterInstance) {
      cdkBuilder.writer(writer.let(IClusterInstance::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterProps,
  ) : CdkObject(cdkObject), DatabaseClusterProps {
    /**
     * The number of seconds to set a cluster's target backtrack window to.
     *
     * This feature is only supported by the Aurora MySQL database engine and
     * cannot be enabled on existing clusters.
     *
     * Default: 0 seconds (no backtrack)
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html)
     */
    override fun backtrackWindow(): Duration? =
        unwrap(this).getBacktrackWindow()?.let(Duration::wrap)

    /**
     * Backup settings.
     *
     * Default: - Backup retention period for automated backups is 1 day.
     * Backup preferred window is set to a 30-minute window selected at random from an
     * 8-hour block of time for each AWS Region, occurring on a random day of the week.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
     */
    override fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     */
    override fun cloudwatchLogsExports(): List<String> = unwrap(this).getCloudwatchLogsExports() ?:
        emptyList()

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     *
     * Default: - logs never expire
     */
    override fun cloudwatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudwatchLogsRetention()?.let(RetentionDays::wrap)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - a new role is created.
     */
    override fun cloudwatchLogsRetentionRole(): IRole? =
        unwrap(this).getCloudwatchLogsRetentionRole()?.let(IRole::wrap)

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     */
    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     */
    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * Credentials for the administrative user.
     *
     * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
     * password
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     */
    override fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if `removalPolicy` is RETAIN, `undefined` otherwise, which will not enable
     * deletion protection.
     * To disable deletion protection after it has been enabled, you must explicitly set this value
     * to `false`.
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Directory ID for associating the DB cluster with a specific Active Directory.
     *
     * Necessary for enabling Kerberos authentication. If specified, the DB cluster joins the given
     * Active Directory, enabling Kerberos authentication.
     * If not specified, the DB cluster will not be associated with any Active Directory, and
     * Kerberos authentication will not be enabled.
     *
     * Default: - DB cluster is not associated with an Active Directory; Kerberos authentication is
     * not enabled.
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * `AmazonRDSDirectoryServiceAccess` or equivalent.
     *
     * Default: - If `DatabaseClusterBaseProps.domain` is specified, a role with the
     * `AmazonRDSDirectoryServiceAccess` policy is automatically created.
     */
    override fun domainRole(): IRole? = unwrap(this).getDomainRole()?.let(IRole::wrap)

    /**
     * Whether to enable the Data API for the cluster.
     *
     * Default: - false
     */
    override fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

    /**
     * What kind of database to start.
     */
    override fun engine(): IClusterEngine = unwrap(this).getEngine().let(IClusterEngine::wrap)

    /**
     * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts.
     *
     * Default: false
     */
    override fun iamAuthentication(): Boolean? = unwrap(this).getIamAuthentication()

    /**
     * Base identifier for instances.
     *
     * Every replica is named by appending the replica number to this string, 1-based.
     *
     * Default: - clusterIdentifier is used with the word "Instance" appended.
     * If clusterIdentifier is not provided, the identifier is automatically generated.
     */
    override fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

    /**
     * (deprecated) Settings for the individual instances that are launched.
     *
     * * use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(): InstanceProps? =
        unwrap(this).getInstanceProps()?.let(InstanceProps::wrap)

    /**
     * The ordering of updates for instances.
     *
     * Default: InstanceUpdateBehaviour.BULK
     */
    override fun instanceUpdateBehaviour(): InstanceUpdateBehaviour? =
        unwrap(this).getInstanceUpdateBehaviour()?.let(InstanceUpdateBehaviour::wrap)

    /**
     * (deprecated) How many replicas/instances to create.
     *
     * Has to be at least 1.
     *
     * Default: 2
     *
     * * use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instances(): Number? = unwrap(this).getInstances()

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instances.
     *
     * Default: no enhanced monitoring
     */
    override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    /**
     * Role that will be used to manage DB instances monitoring.
     *
     * Default: - A role is automatically created for you
     */
    override fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

    /**
     * The network type of the DB instance.
     *
     * Default: - IPV4
     */
    override fun networkType(): NetworkType? = unwrap(this).getNetworkType()?.let(NetworkType::wrap)

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - No parameter group.
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The parameters in the DBClusterParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBClusterParameterGroup.
     *
     * Default: - None
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * What port to listen on.
     *
     * Default: - The default for the engine is used.
     */
    override fun port(): Number? = unwrap(this).getPort()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * A list of instances to create as cluster reader instances.
     *
     * Default: - no readers are created. The cluster will have a single writer/reader
     */
    override fun readers(): List<IClusterInstance> =
        unwrap(this).getReaders()?.map(IClusterInstance::wrap) ?: emptyList()

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

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
     */
    override fun s3ExportBuckets(): List<IBucket> =
        unwrap(this).getS3ExportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
     */
    override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

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
     */
    override fun s3ImportBuckets(): List<IBucket> =
        unwrap(this).getS3ImportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
     */
    override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

    /**
     * Security group.
     *
     * Default: a new security group is created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless
     * v2 cluster.
     *
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 128 (256GB).
     *
     * The maximum capacity must be higher than 0.5 ACUs.
     *
     * Default: 2
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
     */
    override fun serverlessV2MaxCapacity(): Number? = unwrap(this).getServerlessV2MaxCapacity()

    /**
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless
     * v2 cluster.
     *
     * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on.
     * The smallest value that you can use is 0.5.
     *
     * Default: 0.5
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
     */
    override fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

    /**
     * Whether to enable storage encryption.
     *
     * Default: - true if storageEncryptionKey is provided, false otherwise
     */
    override fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

    /**
     * The KMS key for storage encryption.
     *
     * If specified, `storageEncrypted` will be set to `true`.
     *
     * Default: - if storageEncrypted is true then the default master key, no key otherwise
     */
    override fun storageEncryptionKey(): IKey? =
        unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

    /**
     * The storage type to be associated with the DB cluster.
     *
     * Default: - DBClusterStorageType.AURORA_IOPT1
     */
    override fun storageType(): DBClusterStorageType? =
        unwrap(this).getStorageType()?.let(DBClusterStorageType::wrap)

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group will be created.
     */
    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

    /**
     * What subnets to run the RDS instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    /**
     * The instance to use for the cluster writer.
     *
     * Default: required if instanceProps is not provided
     */
    override fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterProps):
        DatabaseClusterProps = CdkObjectWrappers.wrap(cdkObject) as DatabaseClusterProps

    internal fun unwrap(wrapped: DatabaseClusterProps):
        software.amazon.awscdk.services.rds.DatabaseClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseClusterProps
  }
}
