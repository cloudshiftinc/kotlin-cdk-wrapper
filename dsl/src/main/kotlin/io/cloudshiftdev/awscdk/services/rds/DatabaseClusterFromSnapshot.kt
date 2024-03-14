package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseClusterFromSnapshot internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot,
) : DatabaseClusterBase(cdkObject) {
  /**
   * Adds the multi user rotation to this cluster.
   *
   * See [Alternating users rotation
   * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
   *
   * @param id 
   * @param options 
   */
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the multi user rotation to this cluster.
   *
   * See [Alternating users rotation
   * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e3144e2981e2d54c29b77d092c09cc103c3d4bfbd9ad1ec5f454ad3e6812f0")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * See [Single user rotation
   * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-one-user-one-password)
   *
   * @param options
   */
  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * See [Single user rotation
   * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-one-user-one-password)
   *
   * @param options
   */
  public open fun addRotationSingleUser(options: RotationSingleUserOptions): SecretRotation =
      unwrap(this).addRotationSingleUser(options.let(RotationSingleUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * See [Single user rotation
   * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-one-user-one-password)
   *
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dc3cae235dd1373fbafbfbb3e452e2b888653b3946f4b0e89a32adad5226775")
  public open fun addRotationSingleUser(options: RotationSingleUserOptions.Builder.() -> Unit):
      SecretRotation = addRotationSingleUser(RotationSingleUserOptions(options))

  /**
   * The log group is created when `cloudwatchLogsExports` is set.
   *
   * Each export value will create a separate log group.
   */
  public open fun cloudwatchLogGroups(): Map<String, ILogGroup> =
      unwrap(this).getCloudwatchLogGroups().mapValues{ILogGroup.wrap(it.value)} ?: emptyMap()

  /**
   * The endpoint to use for read/write operations.
   */
  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  /**
   * Identifier of the cluster.
   */
  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * Endpoint to use for load-balanced read-only operations.
   */
  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  /**
   * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
   *
   * This AWS Region-unique identifier is used in things like IAM authentication policies.
   */
  public override fun clusterResourceIdentifier(): String =
      unwrap(this).getClusterResourceIdentifier()

  /**
   * Access to the network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The engine for this Cluster.
   *
   * Never undefined.
   */
  public override fun engine(): IClusterEngine? =
      unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  /**
   * Endpoints which address each individual replica.
   */
  public override fun instanceEndpoints(): List<Endpoint> =
      unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

  /**
   * Identifiers of the replicas.
   */
  public override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers()

  /**
   * This value is represented as a percentage.
   *
   * It's calculated as the value of the
   * ServerlessDatabaseCapacity metric divided by the maximum ACU value of the DB cluster.
   *
   * If this metric approaches a value of 100.0, the DB instance has scaled up as high as it can.
   * Consider increasing the maximum ACU setting for the cluster.
   *
   * @param props
   */
  public open fun metricAcuUtilization(): Metric =
      unwrap(this).metricACUUtilization().let(Metric::wrap)

  /**
   * This value is represented as a percentage.
   *
   * It's calculated as the value of the
   * ServerlessDatabaseCapacity metric divided by the maximum ACU value of the DB cluster.
   *
   * If this metric approaches a value of 100.0, the DB instance has scaled up as high as it can.
   * Consider increasing the maximum ACU setting for the cluster.
   *
   * @param props
   */
  public open fun metricAcuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricACUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This value is represented as a percentage.
   *
   * It's calculated as the value of the
   * ServerlessDatabaseCapacity metric divided by the maximum ACU value of the DB cluster.
   *
   * If this metric approaches a value of 100.0, the DB instance has scaled up as high as it can.
   * Consider increasing the maximum ACU setting for the cluster.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f3662f4563df3003c54025065edc6881211474bc66d259be936d026eb80d439")
  public open fun metricAcuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricAcuUtilization(MetricOptions(props))

  /**
   * As a cluster-level metric, it represents the average of the ServerlessDatabaseCapacity values
   * of all the Aurora Serverless v2 DB instances in the cluster.
   *
   * @param props
   */
  public open fun metricServerlessDatabaseCapacity(): Metric =
      unwrap(this).metricServerlessDatabaseCapacity().let(Metric::wrap)

  /**
   * As a cluster-level metric, it represents the average of the ServerlessDatabaseCapacity values
   * of all the Aurora Serverless v2 DB instances in the cluster.
   *
   * @param props
   */
  public open fun metricServerlessDatabaseCapacity(props: MetricOptions): Metric =
      unwrap(this).metricServerlessDatabaseCapacity(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * As a cluster-level metric, it represents the average of the ServerlessDatabaseCapacity values
   * of all the Aurora Serverless v2 DB instances in the cluster.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e244f29bc74eb44ea8910600161af0e2f6bc79ddfc1a0c701993bd2e6c0c0aa8")
  public open fun metricServerlessDatabaseCapacity(props: MetricOptions.Builder.() -> Unit): Metric
      = metricServerlessDatabaseCapacity(MetricOptions(props))

  /**
   * Application for multi user rotation to this cluster.
   */
  public open fun multiUserRotationApplication(): SecretRotationApplication =
      unwrap(this).getMultiUserRotationApplication().let(SecretRotationApplication::wrap)

  /**
   * The secret attached to this cluster.
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * Application for single user rotation of the master password to this cluster.
   */
  public open fun singleUserRotationApplication(): SecretRotationApplication =
      unwrap(this).getSingleUserRotationApplication().let(SecretRotationApplication::wrap)

  /**
   * The VPC network to place the cluster in.
   */
  public open fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  /**
   * The cluster's subnets.
   */
  public open fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.DatabaseClusterFromSnapshot].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun backtrackWindow(backtrackWindow: Duration)

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
    public fun backup(backup: BackupProps)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1adb134a32e72472583d4c505224d10a7e95ade94c6ab5ea49c656eed6ae8b5b")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     *
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs. 
     */
    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>)

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     *
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs. 
     */
    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String)

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
    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - a new role is created.
     *
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy. 
     */
    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole)

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param clusterIdentifier An optional identifier for the cluster. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

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
    public fun credentials(credentials: Credentials)

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     *
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster. 
     */
    public fun defaultDatabaseName(defaultDatabaseName: String)

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if `removalPolicy` is RETAIN, `undefined` otherwise, which will not enable
     * deletion protection.
     * To disable deletion protection after it has been enabled, you must explicitly set this value
     * to `false`.
     *
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

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
     *
     * @param domain Directory ID for associating the DB cluster with a specific Active Directory. 
     */
    public fun domain(domain: String)

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * `AmazonRDSDirectoryServiceAccess` or equivalent.
     *
     * Default: - If `DatabaseClusterBaseProps.domain` is specified, a role with the
     * `AmazonRDSDirectoryServiceAccess` policy is automatically created.
     *
     * @param domainRole The IAM role to be used when making API calls to the Directory Service. 
     */
    public fun domainRole(domainRole: IRole)

    /**
     * Whether to enable the Data API for the cluster.
     *
     * Default: - false
     *
     * @param enableDataApi Whether to enable the Data API for the cluster. 
     */
    public fun enableDataApi(enableDataApi: Boolean)

    /**
     * What kind of database to start.
     *
     * @param engine What kind of database to start. 
     */
    public fun engine(engine: IClusterEngine)

    /**
     * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts.
     *
     * Default: false
     *
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts. 
     */
    public fun iamAuthentication(iamAuthentication: Boolean)

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
    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    /**
     * (deprecated) Settings for the individual instances that are launched.
     *
     * * use writer and readers instead
     * @param instanceProps Settings for the individual instances that are launched. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps)

    /**
     * (deprecated) Settings for the individual instances that are launched.
     *
     * * use writer and readers instead
     * @param instanceProps Settings for the individual instances that are launched. 
     */
    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03a0e700852020576b1b85226cdaec0837d276e854f2e607e66810e8a4bc75c")
    public fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit)

    /**
     * The ordering of updates for instances.
     *
     * Default: InstanceUpdateBehaviour.BULK
     *
     * @param instanceUpdateBehaviour The ordering of updates for instances. 
     */
    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour)

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
    public fun instances(instances: Number)

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instances.
     *
     * Default: no enhanced monitoring
     *
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instances. 
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * Role that will be used to manage DB instances monitoring.
     *
     * Default: - A role is automatically created for you
     *
     * @param monitoringRole Role that will be used to manage DB instances monitoring. 
     */
    public fun monitoringRole(monitoringRole: IRole)

    /**
     * The network type of the DB instance.
     *
     * Default: - IPV4
     *
     * @param networkType The network type of the DB instance. 
     */
    public fun networkType(networkType: NetworkType)

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - No parameter group.
     *
     * @param parameterGroup Additional parameters to pass to the database engine. 
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

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
    public fun parameters(parameters: Map<String, String>)

    /**
     * What port to listen on.
     *
     * Default: - The default for the engine is used.
     *
     * @param port What port to listen on. 
     */
    public fun port(port: Number)

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
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * A list of instances to create as cluster reader instances.
     *
     * Default: - no readers are created. The cluster will have a single writer/reader
     *
     * @param readers A list of instances to create as cluster reader instances. 
     */
    public fun readers(readers: List<IClusterInstance>)

    /**
     * A list of instances to create as cluster reader instances.
     *
     * Default: - no readers are created. The cluster will have a single writer/reader
     *
     * @param readers A list of instances to create as cluster reader instances. 
     */
    public fun readers(vararg readers: IClusterInstance)

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

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
    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

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
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket)

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
    public fun s3ExportRole(s3ExportRole: IRole)

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
    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

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
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket)

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
    public fun s3ImportRole(s3ImportRole: IRole)

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroups Security group. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroups Security group. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

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
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster. 
     */
    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number)

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
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster. 
     */
    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number)

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
    public fun snapshotCredentials(snapshotCredentials: SnapshotCredentials)

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     *
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * Whether to enable storage encryption.
     *
     * Default: - true if storageEncryptionKey is provided, false otherwise
     *
     * @param storageEncrypted Whether to enable storage encryption. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * The KMS key for storage encryption.
     *
     * If specified, `storageEncrypted` will be set to `true`.
     *
     * Default: - if storageEncrypted is true then the default master key, no key otherwise
     *
     * @param storageEncryptionKey The KMS key for storage encryption. 
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    /**
     * The storage type to be associated with the DB cluster.
     *
     * Default: - DBClusterStorageType.AURORA_IOPT1
     *
     * @param storageType The storage type to be associated with the DB cluster. 
     */
    public fun storageType(storageType: DBClusterStorageType)

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group will be created.
     *
     * @param subnetGroup Existing subnet group for the cluster. 
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * What subnets to run the RDS instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     *
     * @param vpc What subnets to run the RDS instances in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4fb99f1a5ecd4912fdd943e6616bcac1dbd939cdf5992bdff129f24c94f9bfe")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * The instance to use for the cluster writer.
     *
     * Default: required if instanceProps is not provided
     *
     * @param writer The instance to use for the cluster writer. 
     */
    public fun writer(writer: IClusterInstance)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot.Builder
        = software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot.Builder.create(scope, id)

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
    override fun backtrackWindow(backtrackWindow: Duration) {
      cdkBuilder.backtrackWindow(backtrackWindow.let(Duration::unwrap))
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
    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1adb134a32e72472583d4c505224d10a7e95ade94c6ab5ea49c656eed6ae8b5b")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     *
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs. 
     */
    override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     *
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     * CloudWatch Logs. 
     */
    override fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String): Unit =
        cloudwatchLogsExports(cloudwatchLogsExports.toList())

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
    override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
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
    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param clusterIdentifier An optional identifier for the cluster. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
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
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     *
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster. 
     */
    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if `removalPolicy` is RETAIN, `undefined` otherwise, which will not enable
     * deletion protection.
     * To disable deletion protection after it has been enabled, you must explicitly set this value
     * to `false`.
     *
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

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
     *
     * @param domain Directory ID for associating the DB cluster with a specific Active Directory. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * `AmazonRDSDirectoryServiceAccess` or equivalent.
     *
     * Default: - If `DatabaseClusterBaseProps.domain` is specified, a role with the
     * `AmazonRDSDirectoryServiceAccess` policy is automatically created.
     *
     * @param domainRole The IAM role to be used when making API calls to the Directory Service. 
     */
    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    /**
     * Whether to enable the Data API for the cluster.
     *
     * Default: - false
     *
     * @param enableDataApi Whether to enable the Data API for the cluster. 
     */
    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    /**
     * What kind of database to start.
     *
     * @param engine What kind of database to start. 
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    /**
     * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts.
     *
     * Default: false
     *
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts. 
     */
    override fun iamAuthentication(iamAuthentication: Boolean) {
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
    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /**
     * (deprecated) Settings for the individual instances that are launched.
     *
     * * use writer and readers instead
     * @param instanceProps Settings for the individual instances that are launched. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(instanceProps: InstanceProps) {
      cdkBuilder.instanceProps(instanceProps.let(InstanceProps::unwrap))
    }

    /**
     * (deprecated) Settings for the individual instances that are launched.
     *
     * * use writer and readers instead
     * @param instanceProps Settings for the individual instances that are launched. 
     */
    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03a0e700852020576b1b85226cdaec0837d276e854f2e607e66810e8a4bc75c")
    override fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit): Unit =
        instanceProps(InstanceProps(instanceProps))

    /**
     * The ordering of updates for instances.
     *
     * Default: InstanceUpdateBehaviour.BULK
     *
     * @param instanceUpdateBehaviour The ordering of updates for instances. 
     */
    override fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
      cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour.let(InstanceUpdateBehaviour::unwrap))
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
    override fun instances(instances: Number) {
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
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    /**
     * Role that will be used to manage DB instances monitoring.
     *
     * Default: - A role is automatically created for you
     *
     * @param monitoringRole Role that will be used to manage DB instances monitoring. 
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    /**
     * The network type of the DB instance.
     *
     * Default: - IPV4
     *
     * @param networkType The network type of the DB instance. 
     */
    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - No parameter group.
     *
     * @param parameterGroup Additional parameters to pass to the database engine. 
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
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
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * What port to listen on.
     *
     * Default: - The default for the engine is used.
     *
     * @param port What port to listen on. 
     */
    override fun port(port: Number) {
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
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * A list of instances to create as cluster reader instances.
     *
     * Default: - no readers are created. The cluster will have a single writer/reader
     *
     * @param readers A list of instances to create as cluster reader instances. 
     */
    override fun readers(readers: List<IClusterInstance>) {
      cdkBuilder.readers(readers.map(IClusterInstance::unwrap))
    }

    /**
     * A list of instances to create as cluster reader instances.
     *
     * Default: - no readers are created. The cluster will have a single writer/reader
     *
     * @param readers A list of instances to create as cluster reader instances. 
     */
    override fun readers(vararg readers: IClusterInstance): Unit = readers(readers.toList())

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
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
    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
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
    override fun s3ExportBuckets(vararg s3ExportBuckets: IBucket): Unit =
        s3ExportBuckets(s3ExportBuckets.toList())

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
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
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
    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
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
    override fun s3ImportBuckets(vararg s3ImportBuckets: IBucket): Unit =
        s3ImportBuckets(s3ImportBuckets.toList())

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
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroups Security group. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroups Security group. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

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
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster. 
     */
    override fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
      cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

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
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     * instance in an Aurora Serverless v2 cluster. 
     */
    override fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
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
    override fun snapshotCredentials(snapshotCredentials: SnapshotCredentials) {
      cdkBuilder.snapshotCredentials(snapshotCredentials.let(SnapshotCredentials::unwrap))
    }

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     *
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * Whether to enable storage encryption.
     *
     * Default: - true if storageEncryptionKey is provided, false otherwise
     *
     * @param storageEncrypted Whether to enable storage encryption. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
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
    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    /**
     * The storage type to be associated with the DB cluster.
     *
     * Default: - DBClusterStorageType.AURORA_IOPT1
     *
     * @param storageType The storage type to be associated with the DB cluster. 
     */
    override fun storageType(storageType: DBClusterStorageType) {
      cdkBuilder.storageType(storageType.let(DBClusterStorageType::unwrap))
    }

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group will be created.
     *
     * @param subnetGroup Existing subnet group for the cluster. 
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    /**
     * What subnets to run the RDS instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     *
     * @param vpc What subnets to run the RDS instances in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4fb99f1a5ecd4912fdd943e6616bcac1dbd939cdf5992bdff129f24c94f9bfe")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * The instance to use for the cluster writer.
     *
     * Default: required if instanceProps is not provided
     *
     * @param writer The instance to use for the cluster writer. 
     */
    override fun writer(writer: IClusterInstance) {
      cdkBuilder.writer(writer.let(IClusterInstance::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseClusterFromSnapshot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseClusterFromSnapshot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot):
        DatabaseClusterFromSnapshot = DatabaseClusterFromSnapshot(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterFromSnapshot):
        software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot = wrapped.cdkObject
  }
}
