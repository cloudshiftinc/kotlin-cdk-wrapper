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
 * Properties for `DatabaseClusterFromSnapshot`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .build();
 * ```
 */
public interface DatabaseClusterFromSnapshotProps {
  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   *
   * Default: true
   */
  public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

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
   * (deprecated) [Misspelled] Specifies the scalability mode of the Aurora DB cluster.
   *
   * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
   *
   * Default: ClusterScailabilityType.STANDARD
   *
   * @deprecated Use clusterScalabilityType instead. This will be removed in the next major version.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun clusterScailabilityType(): ClusterScailabilityType? =
      unwrap(this).getClusterScailabilityType()?.let(ClusterScailabilityType::wrap)

  /**
   * Specifies the scalability mode of the Aurora DB cluster.
   *
   * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
   *
   * Default: ClusterScalabilityType.STANDARD
   */
  public fun clusterScalabilityType(): ClusterScalabilityType? =
      unwrap(this).getClusterScalabilityType()?.let(ClusterScalabilityType::wrap)

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - true
   */
  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

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
   */
  @Deprecated(message = "deprecated in CDK")
  public fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

  /**
   * The database insights mode.
   *
   * Default: - DatabaseInsightsMode.STANDARD when performance insights are enabled and Amazon
   * Aurora engine is used, otherwise not set.
   */
  public fun databaseInsightsMode(): DatabaseInsightsMode? =
      unwrap(this).getDatabaseInsightsMode()?.let(DatabaseInsightsMode::wrap)

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
   * Whether to enable enhanced monitoring at the cluster level.
   *
   * If set to true, `monitoringInterval` and `monitoringRole` are applied to not the instances, but
   * the cluster.
   * `monitoringInterval` is required to be set if `enableClusterLevelEnhancedMonitoring` is set to
   * true.
   *
   * Default: - When the `monitoringInterval` is set, enhanced monitoring is enabled for each
   * instance.
   */
  public fun enableClusterLevelEnhancedMonitoring(): Boolean? =
      unwrap(this).getEnableClusterLevelEnhancedMonitoring()

  /**
   * Whether to enable the Data API for the cluster.
   *
   * Default: - false
   */
  public fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

  /**
   * Whether read replicas can forward write operations to the writer DB instance in the DB cluster.
   *
   * This setting can only be enabled for Aurora MySQL 3.04 or higher, and for Aurora PostgreSQL
   * 16.4
   * or higher (for version 16), 15.8 or higher (for version 15), and 14.13 or higher (for version
   * 14).
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-postgresql-write-forwarding.html)
   */
  public fun enableLocalWriteForwarding(): Boolean? = unwrap(this).getEnableLocalWriteForwarding()

  /**
   * Whether to enable Performance Insights for the DB cluster.
   *
   * Default: - false, unless `performanceInsightRetention` or `performanceInsightEncryptionKey` is
   * set,
   * or `databaseInsightsMode` is set to `DatabaseInsightsMode.ADVANCED`.
   */
  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  /**
   * What kind of database to start.
   */
  public fun engine(): IClusterEngine

  /**
   * The life cycle type for this DB cluster.
   *
   * Default: undefined - AWS RDS default setting is
   * `EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT`
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html)
   */
  public fun engineLifecycleSupport(): EngineLifecycleSupport? =
      unwrap(this).getEngineLifecycleSupport()?.let(EngineLifecycleSupport::wrap)

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
   * The interval between points when Amazon RDS collects enhanced monitoring metrics.
   *
   * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the cluster,
   * otherwise it is applied to the instances.
   *
   * Default: - no enhanced monitoring
   */
  public fun monitoringInterval(): Duration? =
      unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

  /**
   * Role that will be used to manage DB monitoring.
   *
   * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the cluster,
   * otherwise it is applied to the instances.
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
   * The AWS KMS key for encryption of Performance Insights data.
   *
   * Default: - default master key
   */
  public fun performanceInsightEncryptionKey(): IKey? =
      unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

  /**
   * The amount of time, in days, to retain Performance Insights data.
   *
   * If you set `databaseInsightsMode` to `DatabaseInsightsMode.ADVANCED`, you must set this
   * property to `PerformanceInsightRetention.MONTHS_15`.
   *
   * Default: - 7
   */
  public fun performanceInsightRetention(): PerformanceInsightRetention? =
      unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

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
   * To use this property with Aurora PostgreSQL, it must be configured with the S3 export feature
   * enabled when creating the DatabaseClusterEngine
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
   * To use this property with Aurora PostgreSQL, it must be configured with the S3 import feature
   * enabled when creating the DatabaseClusterEngine
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
   * Default: - a new security group is created.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Specifies the duration an Aurora Serverless v2 DB instance must be idle before Aurora attempts
   * to automatically pause it.
   *
   * The duration must be between 300 seconds (5 minutes) and 86,400 seconds (24 hours).
   *
   * Default: - The default is 300 seconds (5 minutes).
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2-auto-pause.html)
   */
  public fun serverlessV2AutoPauseDuration(): Duration? =
      unwrap(this).getServerlessV2AutoPauseDuration()?.let(Duration::wrap)

  /**
   * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2
   * cluster.
   *
   * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
   * The largest value that you can use is 256.
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
   * The smallest value that you can use is 0.
   *
   * For Aurora versions that support the Aurora Serverless v2 auto-pause feature, the smallest
   * value that you can use is 0.
   * For versions that don't support Aurora Serverless v2 auto-pause, the smallest value that you
   * can use is 0.5.
   *
   * Default: 0.5
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.min_capacity_considerations)
   */
  public fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

  /**
   * Master user credentials.
   *
   * Note - It is not possible to change the master username for a snapshot;
   * however, it is possible to provide (or generate) a new password.
   *
   * Default: - The existing username and password from the snapshot will be used.
   */
  public fun snapshotCredentials(): SnapshotCredentials? =
      unwrap(this).getSnapshotCredentials()?.let(SnapshotCredentials::wrap)

  /**
   * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
   *
   * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot.
   * However, you can use only the ARN to specify a DB instance snapshot.
   */
  public fun snapshotIdentifier(): String

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
   * Default: - DBClusterStorageType.AURORA
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
   * Default: - required if instanceProps is not provided
   */
  public fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)

  /**
   * A builder for [DatabaseClusterFromSnapshotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

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
    @JvmName("81281ab2c52d9da4017bedf5de6b74b80d0542b6e3b6c189b403a10c0cf38830")
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
     * @param clusterScailabilityType [Misspelled] Specifies the scalability mode of the Aurora DB
     * cluster.
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     * @deprecated Use clusterScalabilityType instead. This will be removed in the next major
     * version.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun clusterScailabilityType(clusterScailabilityType: ClusterScailabilityType)

    /**
     * @param clusterScalabilityType Specifies the scalability mode of the Aurora DB cluster.
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     */
    public fun clusterScalabilityType(clusterScalabilityType: ClusterScalabilityType)

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param credentials Credentials for the administrative user.
     * Note - using this prop only works with `Credentials.fromPassword()` with the
     * username of the snapshot, `Credentials.fromUsername()` with the username and
     * password of the snapshot or `Credentials.fromSecret()` with a secret containing
     * the username and password of the snapshot.
     * @deprecated use `snapshotCredentials` which allows to generate a new password
     */
    @Deprecated(message = "deprecated in CDK")
    public fun credentials(credentials: Credentials)

    /**
     * @param databaseInsightsMode The database insights mode.
     */
    public fun databaseInsightsMode(databaseInsightsMode: DatabaseInsightsMode)

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
     * @param enableClusterLevelEnhancedMonitoring Whether to enable enhanced monitoring at the
     * cluster level.
     * If set to true, `monitoringInterval` and `monitoringRole` are applied to not the instances,
     * but the cluster.
     * `monitoringInterval` is required to be set if `enableClusterLevelEnhancedMonitoring` is set
     * to true.
     */
    public fun enableClusterLevelEnhancedMonitoring(enableClusterLevelEnhancedMonitoring: Boolean)

    /**
     * @param enableDataApi Whether to enable the Data API for the cluster.
     */
    public fun enableDataApi(enableDataApi: Boolean)

    /**
     * @param enableLocalWriteForwarding Whether read replicas can forward write operations to the
     * writer DB instance in the DB cluster.
     * This setting can only be enabled for Aurora MySQL 3.04 or higher, and for Aurora PostgreSQL
     * 16.4
     * or higher (for version 16), 15.8 or higher (for version 15), and 14.13 or higher (for version
     * 14).
     */
    public fun enableLocalWriteForwarding(enableLocalWriteForwarding: Boolean)

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB cluster.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param engine What kind of database to start. 
     */
    public fun engine(engine: IClusterEngine)

    /**
     * @param engineLifecycleSupport The life cycle type for this DB cluster.
     */
    public fun engineLifecycleSupport(engineLifecycleSupport: EngineLifecycleSupport)

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
    @JvmName("1838abf5194eaee282bc044476e0cc8e28d7e45d8f4e50c322c3afdee1c73520")
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
     * @param monitoringInterval The interval between points when Amazon RDS collects enhanced
     * monitoring metrics.
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * @param monitoringRole Role that will be used to manage DB monitoring.
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
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
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     * If you set `databaseInsightsMode` to `DatabaseInsightsMode.ADVANCED`, you must set this
     * property to `PerformanceInsightRetention.MONTHS_15`.
     */
    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 export feature
     * enabled when creating the DatabaseClusterEngine
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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 import feature
     * enabled when creating the DatabaseClusterEngine
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
     * @param serverlessV2AutoPauseDuration Specifies the duration an Aurora Serverless v2 DB
     * instance must be idle before Aurora attempts to automatically pause it.
     * The duration must be between 300 seconds (5 minutes) and 86,400 seconds (24 hours).
     */
    public fun serverlessV2AutoPauseDuration(serverlessV2AutoPauseDuration: Duration)

    /**
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 256.
     *
     * The maximum capacity must be higher than 0.5 ACUs.
     */
    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number)

    /**
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on.
     * The smallest value that you can use is 0.
     *
     * For Aurora versions that support the Aurora Serverless v2 auto-pause feature, the smallest
     * value that you can use is 0.
     * For versions that don't support Aurora Serverless v2 auto-pause, the smallest value that you
     * can use is 0.5.
     */
    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number)

    /**
     * @param snapshotCredentials Master user credentials.
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     */
    public fun snapshotCredentials(snapshotCredentials: SnapshotCredentials)

    /**
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

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
    @JvmName("0304f6f17bcf1000da6b37a44196037584bc7ceba333cbf973debe00cabf47cd")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param writer The instance to use for the cluster writer.
     */
    public fun writer(writer: IClusterInstance)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps.builder()

    /**
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param backtrackWindow The number of seconds to set a cluster's target backtrack window to.
     * This feature is only supported by the Aurora MySQL database engine and
     * cannot be enabled on existing clusters.
     */
    override fun backtrackWindow(backtrackWindow: Duration) {
      cdkBuilder.backtrackWindow(backtrackWindow.let(Duration.Companion::unwrap))
    }

    /**
     * @param backup Backup settings.
     */
    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps.Companion::unwrap))
    }

    /**
     * @param backup Backup settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81281ab2c52d9da4017bedf5de6b74b80d0542b6e3b6c189b403a10c0cf38830")
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
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays.Companion::unwrap))
    }

    /**
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy.
     */
    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param clusterIdentifier An optional identifier for the cluster.
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param clusterScailabilityType [Misspelled] Specifies the scalability mode of the Aurora DB
     * cluster.
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     * @deprecated Use clusterScalabilityType instead. This will be removed in the next major
     * version.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clusterScailabilityType(clusterScailabilityType: ClusterScailabilityType) {
      cdkBuilder.clusterScailabilityType(clusterScailabilityType.let(ClusterScailabilityType.Companion::unwrap))
    }

    /**
     * @param clusterScalabilityType Specifies the scalability mode of the Aurora DB cluster.
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     */
    override fun clusterScalabilityType(clusterScalabilityType: ClusterScalabilityType) {
      cdkBuilder.clusterScalabilityType(clusterScalabilityType.let(ClusterScalabilityType.Companion::unwrap))
    }

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param credentials Credentials for the administrative user.
     * Note - using this prop only works with `Credentials.fromPassword()` with the
     * username of the snapshot, `Credentials.fromUsername()` with the username and
     * password of the snapshot or `Credentials.fromSecret()` with a secret containing
     * the username and password of the snapshot.
     * @deprecated use `snapshotCredentials` which allows to generate a new password
     */
    @Deprecated(message = "deprecated in CDK")
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param databaseInsightsMode The database insights mode.
     */
    override fun databaseInsightsMode(databaseInsightsMode: DatabaseInsightsMode) {
      cdkBuilder.databaseInsightsMode(databaseInsightsMode.let(DatabaseInsightsMode.Companion::unwrap))
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
      cdkBuilder.domainRole(domainRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param enableClusterLevelEnhancedMonitoring Whether to enable enhanced monitoring at the
     * cluster level.
     * If set to true, `monitoringInterval` and `monitoringRole` are applied to not the instances,
     * but the cluster.
     * `monitoringInterval` is required to be set if `enableClusterLevelEnhancedMonitoring` is set
     * to true.
     */
    override
        fun enableClusterLevelEnhancedMonitoring(enableClusterLevelEnhancedMonitoring: Boolean) {
      cdkBuilder.enableClusterLevelEnhancedMonitoring(enableClusterLevelEnhancedMonitoring)
    }

    /**
     * @param enableDataApi Whether to enable the Data API for the cluster.
     */
    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    /**
     * @param enableLocalWriteForwarding Whether read replicas can forward write operations to the
     * writer DB instance in the DB cluster.
     * This setting can only be enabled for Aurora MySQL 3.04 or higher, and for Aurora PostgreSQL
     * 16.4
     * or higher (for version 16), 15.8 or higher (for version 15), and 14.13 or higher (for version
     * 14).
     */
    override fun enableLocalWriteForwarding(enableLocalWriteForwarding: Boolean) {
      cdkBuilder.enableLocalWriteForwarding(enableLocalWriteForwarding)
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB cluster.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param engine What kind of database to start. 
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine.Companion::unwrap))
    }

    /**
     * @param engineLifecycleSupport The life cycle type for this DB cluster.
     */
    override fun engineLifecycleSupport(engineLifecycleSupport: EngineLifecycleSupport) {
      cdkBuilder.engineLifecycleSupport(engineLifecycleSupport.let(EngineLifecycleSupport.Companion::unwrap))
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
      cdkBuilder.instanceProps(instanceProps.let(InstanceProps.Companion::unwrap))
    }

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1838abf5194eaee282bc044476e0cc8e28d7e45d8f4e50c322c3afdee1c73520")
    override fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit): Unit =
        instanceProps(InstanceProps(instanceProps))

    /**
     * @param instanceUpdateBehaviour The ordering of updates for instances.
     */
    override fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
      cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour.let(InstanceUpdateBehaviour.Companion::unwrap))
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
     * @param monitoringInterval The interval between points when Amazon RDS collects enhanced
     * monitoring metrics.
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
     */
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param monitoringRole Role that will be used to manage DB monitoring.
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param networkType The network type of the DB instance.
     */
    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType.Companion::unwrap))
    }

    /**
     * @param parameterGroup Additional parameters to pass to the database engine.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup.Companion::unwrap))
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
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     * If you set `databaseInsightsMode` to `DatabaseInsightsMode.ADVANCED`, you must set this
     * property to `PerformanceInsightRetention.MONTHS_15`.
     */
    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention.Companion::unwrap))
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
      cdkBuilder.readers(readers.map(IClusterInstance.Companion::unwrap))
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
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket.Companion::unwrap))
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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 export feature
     * enabled when creating the DatabaseClusterEngine
     * For MySQL:
     */
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     * supported by the Aurora database engine.
     * This property must not be used if `s3ImportRole` is used.
     *
     * For MySQL:
     */
    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket.Companion::unwrap))
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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 import feature
     * enabled when creating the DatabaseClusterEngine
     * For MySQL:
     */
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param serverlessV2AutoPauseDuration Specifies the duration an Aurora Serverless v2 DB
     * instance must be idle before Aurora attempts to automatically pause it.
     * The duration must be between 300 seconds (5 minutes) and 86,400 seconds (24 hours).
     */
    override fun serverlessV2AutoPauseDuration(serverlessV2AutoPauseDuration: Duration) {
      cdkBuilder.serverlessV2AutoPauseDuration(serverlessV2AutoPauseDuration.let(Duration.Companion::unwrap))
    }

    /**
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster.
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 256.
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
     * The smallest value that you can use is 0.
     *
     * For Aurora versions that support the Aurora Serverless v2 auto-pause feature, the smallest
     * value that you can use is 0.
     * For versions that don't support Aurora Serverless v2 auto-pause, the smallest value that you
     * can use is 0.5.
     */
    override fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
      cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    /**
     * @param snapshotCredentials Master user credentials.
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     */
    override fun snapshotCredentials(snapshotCredentials: SnapshotCredentials) {
      cdkBuilder.snapshotCredentials(snapshotCredentials.let(SnapshotCredentials.Companion::unwrap))
    }

    /**
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
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
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param storageType The storage type to be associated with the DB cluster.
     */
    override fun storageType(storageType: DBClusterStorageType) {
      cdkBuilder.storageType(storageType.let(DBClusterStorageType.Companion::unwrap))
    }

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup.Companion::unwrap))
    }

    /**
     * @param vpc What subnets to run the RDS instances in.
     * Must be at least 2 subnets in two different AZs.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0304f6f17bcf1000da6b37a44196037584bc7ceba333cbf973debe00cabf47cd")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param writer The instance to use for the cluster writer.
     */
    override fun writer(writer: IClusterInstance) {
      cdkBuilder.writer(writer.let(IClusterInstance.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps,
  ) : CdkObject(cdkObject),
      DatabaseClusterFromSnapshotProps {
    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * Default: true
     */
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

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
     * (deprecated) [Misspelled] Specifies the scalability mode of the Aurora DB cluster.
     *
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     *
     * Default: ClusterScailabilityType.STANDARD
     *
     * @deprecated Use clusterScalabilityType instead. This will be removed in the next major
     * version.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clusterScailabilityType(): ClusterScailabilityType? =
        unwrap(this).getClusterScailabilityType()?.let(ClusterScailabilityType::wrap)

    /**
     * Specifies the scalability mode of the Aurora DB cluster.
     *
     * Set LIMITLESS if you want to use a limitless database; otherwise, set it to STANDARD.
     *
     * Default: ClusterScalabilityType.STANDARD
     */
    override fun clusterScalabilityType(): ClusterScalabilityType? =
        unwrap(this).getClusterScalabilityType()?.let(ClusterScalabilityType::wrap)

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     */
    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

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
     */
    @Deprecated(message = "deprecated in CDK")
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * The database insights mode.
     *
     * Default: - DatabaseInsightsMode.STANDARD when performance insights are enabled and Amazon
     * Aurora engine is used, otherwise not set.
     */
    override fun databaseInsightsMode(): DatabaseInsightsMode? =
        unwrap(this).getDatabaseInsightsMode()?.let(DatabaseInsightsMode::wrap)

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
     * Whether to enable enhanced monitoring at the cluster level.
     *
     * If set to true, `monitoringInterval` and `monitoringRole` are applied to not the instances,
     * but the cluster.
     * `monitoringInterval` is required to be set if `enableClusterLevelEnhancedMonitoring` is set
     * to true.
     *
     * Default: - When the `monitoringInterval` is set, enhanced monitoring is enabled for each
     * instance.
     */
    override fun enableClusterLevelEnhancedMonitoring(): Boolean? =
        unwrap(this).getEnableClusterLevelEnhancedMonitoring()

    /**
     * Whether to enable the Data API for the cluster.
     *
     * Default: - false
     */
    override fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

    /**
     * Whether read replicas can forward write operations to the writer DB instance in the DB
     * cluster.
     *
     * This setting can only be enabled for Aurora MySQL 3.04 or higher, and for Aurora PostgreSQL
     * 16.4
     * or higher (for version 16), 15.8 or higher (for version 15), and 14.13 or higher (for version
     * 14).
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-postgresql-write-forwarding.html)
     */
    override fun enableLocalWriteForwarding(): Boolean? =
        unwrap(this).getEnableLocalWriteForwarding()

    /**
     * Whether to enable Performance Insights for the DB cluster.
     *
     * Default: - false, unless `performanceInsightRetention` or `performanceInsightEncryptionKey`
     * is set,
     * or `databaseInsightsMode` is set to `DatabaseInsightsMode.ADVANCED`.
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * What kind of database to start.
     */
    override fun engine(): IClusterEngine = unwrap(this).getEngine().let(IClusterEngine::wrap)

    /**
     * The life cycle type for this DB cluster.
     *
     * Default: undefined - AWS RDS default setting is
     * `EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT`
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html)
     */
    override fun engineLifecycleSupport(): EngineLifecycleSupport? =
        unwrap(this).getEngineLifecycleSupport()?.let(EngineLifecycleSupport::wrap)

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
     * The interval between points when Amazon RDS collects enhanced monitoring metrics.
     *
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
     *
     * Default: - no enhanced monitoring
     */
    override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    /**
     * Role that will be used to manage DB monitoring.
     *
     * If you enable `enableClusterLevelEnhancedMonitoring`, this property is applied to the
     * cluster,
     * otherwise it is applied to the instances.
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
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     */
    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * If you set `databaseInsightsMode` to `DatabaseInsightsMode.ADVANCED`, you must set this
     * property to `PerformanceInsightRetention.MONTHS_15`.
     *
     * Default: - 7
     */
    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 export feature
     * enabled when creating the DatabaseClusterEngine
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
     * To use this property with Aurora PostgreSQL, it must be configured with the S3 import feature
     * enabled when creating the DatabaseClusterEngine
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
     * Default: - a new security group is created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Specifies the duration an Aurora Serverless v2 DB instance must be idle before Aurora
     * attempts to automatically pause it.
     *
     * The duration must be between 300 seconds (5 minutes) and 86,400 seconds (24 hours).
     *
     * Default: - The default is 300 seconds (5 minutes).
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2-auto-pause.html)
     */
    override fun serverlessV2AutoPauseDuration(): Duration? =
        unwrap(this).getServerlessV2AutoPauseDuration()?.let(Duration::wrap)

    /**
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless
     * v2 cluster.
     *
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on.
     * The largest value that you can use is 256.
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
     * The smallest value that you can use is 0.
     *
     * For Aurora versions that support the Aurora Serverless v2 auto-pause feature, the smallest
     * value that you can use is 0.
     * For versions that don't support Aurora Serverless v2 auto-pause, the smallest value that you
     * can use is 0.5.
     *
     * Default: 0.5
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.min_capacity_considerations)
     */
    override fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

    /**
     * Master user credentials.
     *
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     *
     * Default: - The existing username and password from the snapshot will be used.
     */
    override fun snapshotCredentials(): SnapshotCredentials? =
        unwrap(this).getSnapshotCredentials()?.let(SnapshotCredentials::wrap)

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    override fun snapshotIdentifier(): String = unwrap(this).getSnapshotIdentifier()

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
     * Default: - DBClusterStorageType.AURORA
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
     * Default: - required if instanceProps is not provided
     */
    override fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterFromSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps):
        DatabaseClusterFromSnapshotProps = CdkObjectWrappers.wrap(cdkObject) as?
        DatabaseClusterFromSnapshotProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterFromSnapshotProps):
        software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps
  }
}
