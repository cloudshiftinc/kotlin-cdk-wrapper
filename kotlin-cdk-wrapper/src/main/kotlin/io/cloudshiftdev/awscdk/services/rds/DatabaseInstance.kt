@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A database instance.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * DatabaseInstance instance1 = DatabaseInstance.Builder.create(this, "PostgresInstance1")
 * .engine(DatabaseInstanceEngine.POSTGRES)
 * // Generate the secret with admin username `postgres` and random password
 * .credentials(Credentials.fromGeneratedSecret("postgres"))
 * .vpc(vpc)
 * .build();
 * // Templated secret with username and password fields
 * Secret templatedSecret = Secret.Builder.create(this, "TemplatedSecret")
 * .generateSecretString(SecretStringGenerator.builder()
 * .secretStringTemplate(JSON.stringify(Map.of("username", "postgres")))
 * .generateStringKey("password")
 * .excludeCharacters("/&#64;\"")
 * .build())
 * .build();
 * // Using the templated secret as credentials
 * DatabaseInstance instance2 = DatabaseInstance.Builder.create(this, "PostgresInstance2")
 * .engine(DatabaseInstanceEngine.POSTGRES)
 * .credentials(Map.of(
 * "username", templatedSecret.secretValueFromJson("username").toString(),
 * "password", templatedSecret.secretValueFromJson("password")))
 * .vpc(vpc)
 * .build();
 * ```
 */
public open class DatabaseInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstance,
) : DatabaseInstanceBase(cdkObject), IDatabaseInstance {
  /**
   * Adds the multi user rotation to this instance.
   *
   * @param id 
   * @param options 
   */
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the multi user rotation to this instance.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e3144e2981e2d54c29b77d092c09cc103c3d4bfbd9ad1ec5f454ad3e6812f0")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  /**
   * Adds the single user rotation of the master password to this instance.
   *
   * @param options the options for the rotation, if you want to override the defaults.
   */
  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this instance.
   *
   * @param options the options for the rotation, if you want to override the defaults.
   */
  public open fun addRotationSingleUser(options: RotationSingleUserOptions): SecretRotation =
      unwrap(this).addRotationSingleUser(options.let(RotationSingleUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this instance.
   *
   * @param options the options for the rotation, if you want to override the defaults.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dc3cae235dd1373fbafbfbb3e452e2b888653b3946f4b0e89a32adad5226775")
  public open fun addRotationSingleUser(options: RotationSingleUserOptions.Builder.() -> Unit):
      SecretRotation = addRotationSingleUser(RotationSingleUserOptions(options))

  /**
   * The log group is created when `cloudwatchLogsExports` is set.
   *
   * Each export value will create a separate log group.
   */
  public open fun cloudwatchLogGroups(): Map<String, ILogGroup> =
      unwrap(this).getCloudwatchLogGroups().mapValues{ILogGroup.wrap(it.value)}

  /**
   * Access to network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The instance endpoint address.
   */
  public override fun dbInstanceEndpointAddress(): String =
      unwrap(this).getDbInstanceEndpointAddress()

  /**
   * The instance endpoint port.
   */
  public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

  /**
   * The engine of this database Instance.
   *
   * May be not known for imported Instances if it wasn't provided explicitly,
   * or for read replicas.
   */
  public override fun engine(): IInstanceEngine? =
      unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  /**
   * Grant the given identity connection access to the database.
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the db instance, or the
   * default database user, obtained from the Secret, if not specified.
   */
  public override fun grantConnect(grantee: IGrantable): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity connection access to the database.
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the db instance, or the
   * default database user, obtained from the Secret, if not specified.
   */
  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

  /**
   * The instance endpoint.
   */
  public override fun instanceEndpoint(): Endpoint =
      unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

  /**
   * The instance identifier.
   */
  public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

  /**
   * The AWS Region-unique, immutable identifier for the DB instance.
   *
   * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
   * instance is accessed.
   */
  public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  /**
   * The AWS Secrets Manager secret attached to the instance.
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * The VPC where this database instance is deployed.
   */
  public open fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.DatabaseInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The allocated storage size, specified in gibibytes (GiB).
     *
     * Default: 100
     *
     * @param allocatedStorage The allocated storage size, specified in gibibytes (GiB). 
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * Whether to allow major version upgrades.
     *
     * Default: false
     *
     * @param allowMajorVersionUpgrade Whether to allow major version upgrades. 
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * The name of the Availability Zone where the DB instance will be located.
     *
     * Default: - no preference
     *
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Set to zero to disable backups.
     * When creating a read replica, you must enable automatic backups on the source
     * database instance by setting the backup retention to a value other than zero.
     *
     * Default: - Duration.days(1) for source instances, disabled for read replicas
     *
     * @param backupRetention The number of days during which automatic DB snapshots are retained. 
     */
    public fun backupRetention(backupRetention: Duration)

    /**
     * The identifier of the CA certificate for this DB instance.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     *
     * Default: - RDS will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * @param caCertificate The identifier of the CA certificate for this DB instance. 
     */
    public fun caCertificate(caCertificate: CaCertificate)

    /**
     * For supported engines, specifies the character set to associate with the DB instance.
     *
     * Default: - RDS default character set name
     *
     * @param characterSetName For supported engines, specifies the character set to associate with
     * the DB instance. 
     */
    public fun characterSetName(characterSetName: String)

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
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of
     * the DB instance.
     *
     * Default: true
     *
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     * instance to snapshots of the DB instance. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * Credentials for the administrative user.
     *
     * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
     * password
     *
     * @param credentials Credentials for the administrative user. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * The name of the database.
     *
     * Default: - no name
     *
     * @param databaseName The name of the database. 
     */
    public fun databaseName(databaseName: String)

    /**
     * Indicates whether automated backups should be deleted or retained when you delete a DB
     * instance.
     *
     * Default: true
     *
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     * retained when you delete a DB instance. 
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

    /**
     * Indicates whether the DB instance should have deletion protection enabled.
     *
     * Default: - true if ``removalPolicy`` is RETAIN, false otherwise
     *
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Default: - Do not join domain
     *
     * @param domain The Active Directory directory ID to create the DB instance in. 
     */
    public fun domain(domain: String)

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * AmazonRDSDirectoryServiceAccess or equivalent.
     *
     * Default: - The role will be created for you if `DatabaseInstanceNewProps#domain` is specified
     *
     * @param domainRole The IAM role to be used when making API calls to the Directory Service. 
     */
    public fun domainRole(domainRole: IRole)

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     *
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * The database engine.
     *
     * @param engine The database engine. 
     */
    public fun engine(engine: IInstanceEngine)

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
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     *
     * Default: - a CloudFormation generated name
     *
     * @param instanceIdentifier A name for the DB instance. 
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * The name of the compute and memory capacity for the instance.
     *
     * Default: - m5.large (or, more specifically, db.m5.large)
     *
     * @param instanceType The name of the compute and memory capacity for the instance. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * The number of I/O operations per second (IOPS) that the database provisions.
     *
     * The value must be equal to or greater than 1000.
     *
     * Default: - no provisioned iops if storage type is not specified. For GP3: 3,000 IOPS if
     * allocated
     * storage is less than 400 GiB for MariaDB, MySQL, and PostgreSQL, less than 200 GiB for Oracle
     * and
     * less than 20 GiB for SQL Server. 12,000 IOPS otherwise (except for SQL Server where the
     * default is
     * always 3,000 IOPS).
     *
     * @param iops The number of I/O operations per second (IOPS) that the database provisions. 
     */
    public fun iops(iops: Number)

    /**
     * The license model.
     *
     * Default: - RDS default license model
     *
     * @param licenseModel The license model. 
     */
    public fun licenseModel(licenseModel: LicenseModel)

    /**
     * Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     *
     * Default: - No autoscaling of RDS instance
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte). 
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instance.
     *
     * Default: - no enhanced monitoring
     *
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instance. 
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * Role that will be used to manage DB instance monitoring.
     *
     * Default: - A role is automatically created for you
     *
     * @param monitoringRole Role that will be used to manage DB instance monitoring. 
     */
    public fun monitoringRole(monitoringRole: IRole)

    /**
     * Specifies if the database instance is a multiple Availability Zone deployment.
     *
     * Default: false
     *
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     * 
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * The network type of the DB instance.
     *
     * Default: - IPV4
     *
     * @param networkType The network type of the DB instance. 
     */
    public fun networkType(networkType: NetworkType)

    /**
     * The option group to associate with the instance.
     *
     * Default: - no option group
     *
     * @param optionGroup The option group to associate with the instance. 
     */
    public fun optionGroup(optionGroup: IOptionGroup)

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: - no parameter group
     *
     * @param parameterGroup The DB parameter group to associate with the instance. 
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     *
     * @param parameters The parameters in the DBParameterGroup to create automatically. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     *
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data. 
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7 this is the free tier
     *
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data. 
     */
    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    /**
     * The port for the instance.
     *
     * Default: - the default port for the chosen engine.
     *
     * @param port The port for the instance. 
     */
    public fun port(port: Number)

    /**
     * The daily time range during which automated backups are performed.
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region. To see the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow
     *
     * @param preferredBackupWindow The daily time range during which automated backups are
     * performed. 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * The weekly time range (in UTC) during which system maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region, occurring on a random day of the week. To see
     * the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the
     * chosen instance class.
     * See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core. 
     */
    public fun processorFeatures(processorFeatures: ProcessorFeatures)

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the
     * chosen instance class.
     * See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26339308c96a3e281ec96ae3bb5e4f2a372ca68dc3f999a3a8223eae994c313c")
    public fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit)

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If not specified,
     * the instance's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     *
     * Default: - `true` if the instance's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
     * otherwise
     *
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the resource, but retain a snapshot of the data)
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * S3 buckets that you want to load data into.
     *
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportBuckets S3 buckets that you want to load data into. 
     */
    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    /**
     * S3 buckets that you want to load data into.
     *
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportBuckets S3 buckets that you want to load data into. 
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket)

    /**
     * Role that will be associated with this DB instance to enable S3 export.
     *
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - New role is created if `s3ExportBuckets` is set, no role is defined otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export. 
     */
    public fun s3ExportRole(s3ExportRole: IRole)

    /**
     * S3 buckets that you want to load data from.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportBuckets S3 buckets that you want to load data from. 
     */
    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    /**
     * S3 buckets that you want to load data from.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportBuckets S3 buckets that you want to load data from. 
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket)

    /**
     * Role that will be associated with this DB instance to enable S3 import.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - New role is created if `s3ImportBuckets` is set, no role is defined otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import. 
     */
    public fun s3ImportRole(s3ImportRole: IRole)

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Indicates whether the DB instance is encrypted.
     *
     * Default: - true if storageEncryptionKey has been provided, false otherwise
     *
     * @param storageEncrypted Indicates whether the DB instance is encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * The KMS key that's used to encrypt the DB instance.
     *
     * Default: - default master key if storageEncrypted is true, no key otherwise
     *
     * @param storageEncryptionKey The KMS key that's used to encrypt the DB instance. 
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    /**
     * The storage throughput, specified in mebibytes per second (MiBps).
     *
     * Only applicable for GP3.
     *
     * Default: - 125 MiBps if allocated storage is less than 400 GiB for MariaDB, MySQL, and
     * PostgreSQL,
     * less than 200 GiB for Oracle and less than 20 GiB for SQL Server. 500 MiBps otherwise (except
     * for
     * SQL Server where the default is always 125 MiBps).
     *
     * [Documentation](https://docs.aws.amazon.com//AmazonRDS/latest/UserGuide/CHAP_Storage.html#gp3-storage)
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps). 
     */
    public fun storageThroughput(storageThroughput: Number)

    /**
     * The storage type.
     *
     * Storage types supported are gp2, io1, standard.
     *
     * Default: GP2
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#Concepts.Storage.GeneralSSD)
     * @param storageType The storage type. 
     */
    public fun storageType(storageType: StorageType)

    /**
     * Existing subnet group for the instance.
     *
     * Default: - a new subnet group will be created.
     *
     * @param subnetGroup Existing subnet group for the instance. 
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * The time zone of the instance.
     *
     * This is currently supported only by Microsoft Sql Server.
     *
     * Default: - RDS default timezone
     *
     * @param timezone The time zone of the instance. 
     */
    public fun timezone(timezone: String)

    /**
     * The VPC network where the DB subnet group should be created.
     *
     * @param vpc The VPC network where the DB subnet group should be created. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da31d4aab9e7de80115c98190e0fbf0760c297ee0a23eea1d782c099101376cf")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstance.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstance.Builder.create(scope, id)

    /**
     * The allocated storage size, specified in gibibytes (GiB).
     *
     * Default: 100
     *
     * @param allocatedStorage The allocated storage size, specified in gibibytes (GiB). 
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * Whether to allow major version upgrades.
     *
     * Default: false
     *
     * @param allowMajorVersionUpgrade Whether to allow major version upgrades. 
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * The name of the Availability Zone where the DB instance will be located.
     *
     * Default: - no preference
     *
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Set to zero to disable backups.
     * When creating a read replica, you must enable automatic backups on the source
     * database instance by setting the backup retention to a value other than zero.
     *
     * Default: - Duration.days(1) for source instances, disabled for read replicas
     *
     * @param backupRetention The number of days during which automatic DB snapshots are retained. 
     */
    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
    }

    /**
     * The identifier of the CA certificate for this DB instance.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     *
     * Default: - RDS will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * @param caCertificate The identifier of the CA certificate for this DB instance. 
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    /**
     * For supported engines, specifies the character set to associate with the DB instance.
     *
     * Default: - RDS default character set name
     *
     * @param characterSetName For supported engines, specifies the character set to associate with
     * the DB instance. 
     */
    override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

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
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of
     * the DB instance.
     *
     * Default: true
     *
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     * instance to snapshots of the DB instance. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * Credentials for the administrative user.
     *
     * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
     * password
     *
     * @param credentials Credentials for the administrative user. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * The name of the database.
     *
     * Default: - no name
     *
     * @param databaseName The name of the database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * Indicates whether automated backups should be deleted or retained when you delete a DB
     * instance.
     *
     * Default: true
     *
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     * retained when you delete a DB instance. 
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * Indicates whether the DB instance should have deletion protection enabled.
     *
     * Default: - true if ``removalPolicy`` is RETAIN, false otherwise
     *
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Default: - Do not join domain
     *
     * @param domain The Active Directory directory ID to create the DB instance in. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * AmazonRDSDirectoryServiceAccess or equivalent.
     *
     * Default: - The role will be created for you if `DatabaseInstanceNewProps#domain` is specified
     *
     * @param domainRole The IAM role to be used when making API calls to the Directory Service. 
     */
    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     *
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * The database engine.
     *
     * @param engine The database engine. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
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
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     *
     * Default: - a CloudFormation generated name
     *
     * @param instanceIdentifier A name for the DB instance. 
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * The name of the compute and memory capacity for the instance.
     *
     * Default: - m5.large (or, more specifically, db.m5.large)
     *
     * @param instanceType The name of the compute and memory capacity for the instance. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * The number of I/O operations per second (IOPS) that the database provisions.
     *
     * The value must be equal to or greater than 1000.
     *
     * Default: - no provisioned iops if storage type is not specified. For GP3: 3,000 IOPS if
     * allocated
     * storage is less than 400 GiB for MariaDB, MySQL, and PostgreSQL, less than 200 GiB for Oracle
     * and
     * less than 20 GiB for SQL Server. 12,000 IOPS otherwise (except for SQL Server where the
     * default is
     * always 3,000 IOPS).
     *
     * @param iops The number of I/O operations per second (IOPS) that the database provisions. 
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * The license model.
     *
     * Default: - RDS default license model
     *
     * @param licenseModel The license model. 
     */
    override fun licenseModel(licenseModel: LicenseModel) {
      cdkBuilder.licenseModel(licenseModel.let(LicenseModel::unwrap))
    }

    /**
     * Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     *
     * Default: - No autoscaling of RDS instance
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte). 
     */
    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instance.
     *
     * Default: - no enhanced monitoring
     *
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instance. 
     */
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    /**
     * Role that will be used to manage DB instance monitoring.
     *
     * Default: - A role is automatically created for you
     *
     * @param monitoringRole Role that will be used to manage DB instance monitoring. 
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    /**
     * Specifies if the database instance is a multiple Availability Zone deployment.
     *
     * Default: false
     *
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     * 
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
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
     * The option group to associate with the instance.
     *
     * Default: - no option group
     *
     * @param optionGroup The option group to associate with the instance. 
     */
    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: - no parameter group
     *
     * @param parameterGroup The DB parameter group to associate with the instance. 
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     *
     * @param parameters The parameters in the DBParameterGroup to create automatically. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     *
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data. 
     */
    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7 this is the free tier
     *
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data. 
     */
    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    /**
     * The port for the instance.
     *
     * Default: - the default port for the chosen engine.
     *
     * @param port The port for the instance. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The daily time range during which automated backups are performed.
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region. To see the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow
     *
     * @param preferredBackupWindow The daily time range during which automated backups are
     * performed. 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region, occurring on a random day of the week. To see
     * the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the
     * chosen instance class.
     * See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core. 
     */
    override fun processorFeatures(processorFeatures: ProcessorFeatures) {
      cdkBuilder.processorFeatures(processorFeatures.let(ProcessorFeatures::unwrap))
    }

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the
     * chosen instance class.
     * See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26339308c96a3e281ec96ae3bb5e4f2a372ca68dc3f999a3a8223eae994c313c")
    override fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit): Unit =
        processorFeatures(ProcessorFeatures(processorFeatures))

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If not specified,
     * the instance's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     *
     * Default: - `true` if the instance's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
     * otherwise
     *
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the resource, but retain a snapshot of the data)
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * S3 buckets that you want to load data into.
     *
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportBuckets S3 buckets that you want to load data into. 
     */
    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    /**
     * S3 buckets that you want to load data into.
     *
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportBuckets S3 buckets that you want to load data into. 
     */
    override fun s3ExportBuckets(vararg s3ExportBuckets: IBucket): Unit =
        s3ExportBuckets(s3ExportBuckets.toList())

    /**
     * Role that will be associated with this DB instance to enable S3 export.
     *
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - New role is created if `s3ExportBuckets` is set, no role is defined otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export. 
     */
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    /**
     * S3 buckets that you want to load data from.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportBuckets S3 buckets that you want to load data from. 
     */
    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    /**
     * S3 buckets that you want to load data from.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportBuckets S3 buckets that you want to load data from. 
     */
    override fun s3ImportBuckets(vararg s3ImportBuckets: IBucket): Unit =
        s3ImportBuckets(s3ImportBuckets.toList())

    /**
     * Role that will be associated with this DB instance to enable S3 import.
     *
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For Microsoft SQL Server:
     *
     * Default: - New role is created if `s3ImportBuckets` is set, no role is defined otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/PostgreSQL.Procedural.Importing.html)
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import. 
     */
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Indicates whether the DB instance is encrypted.
     *
     * Default: - true if storageEncryptionKey has been provided, false otherwise
     *
     * @param storageEncrypted Indicates whether the DB instance is encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * The KMS key that's used to encrypt the DB instance.
     *
     * Default: - default master key if storageEncrypted is true, no key otherwise
     *
     * @param storageEncryptionKey The KMS key that's used to encrypt the DB instance. 
     */
    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    /**
     * The storage throughput, specified in mebibytes per second (MiBps).
     *
     * Only applicable for GP3.
     *
     * Default: - 125 MiBps if allocated storage is less than 400 GiB for MariaDB, MySQL, and
     * PostgreSQL,
     * less than 200 GiB for Oracle and less than 20 GiB for SQL Server. 500 MiBps otherwise (except
     * for
     * SQL Server where the default is always 125 MiBps).
     *
     * [Documentation](https://docs.aws.amazon.com//AmazonRDS/latest/UserGuide/CHAP_Storage.html#gp3-storage)
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps). 
     */
    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    /**
     * The storage type.
     *
     * Storage types supported are gp2, io1, standard.
     *
     * Default: GP2
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#Concepts.Storage.GeneralSSD)
     * @param storageType The storage type. 
     */
    override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType::unwrap))
    }

    /**
     * Existing subnet group for the instance.
     *
     * Default: - a new subnet group will be created.
     *
     * @param subnetGroup Existing subnet group for the instance. 
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    /**
     * The time zone of the instance.
     *
     * This is currently supported only by Microsoft Sql Server.
     *
     * Default: - RDS default timezone
     *
     * @param timezone The time zone of the instance. 
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    /**
     * The VPC network where the DB subnet group should be created.
     *
     * @param vpc The VPC network where the DB subnet group should be created. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da31d4aab9e7de80115c98190e0fbf0760c297ee0a23eea1d782c099101376cf")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstance = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstance):
        DatabaseInstance = DatabaseInstance(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstance):
        software.amazon.awscdk.services.rds.DatabaseInstance = wrapped.cdkObject
  }
}
