@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
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
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.LicenseModel
import software.amazon.awscdk.services.rds.NetworkType
import software.amazon.awscdk.services.rds.PerformanceInsightRetention
import software.amazon.awscdk.services.rds.ProcessorFeatures
import software.amazon.awscdk.services.rds.StorageType
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

/**
 * A database instance.
 *
 * Example:
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
@CdkDslMarker
public class DatabaseInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseInstance.Builder = DatabaseInstance.Builder.create(scope, id)

    private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

    private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * The allocated storage size, specified in gibibytes (GiB).
     *
     * Default: 100
     *
     * @param allocatedStorage The allocated storage size, specified in gibibytes (GiB).
     */
    public fun allocatedStorage(allocatedStorage: Number) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * Whether to allow major version upgrades.
     *
     * Default: false
     *
     * @param allowMajorVersionUpgrade Whether to allow major version upgrades.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     *   to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * The name of the Availability Zone where the DB instance will be located.
     *
     * Default: - no preference
     *
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     *   located.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Set to zero to disable backups. When creating a read replica, you must enable automatic
     * backups on the source database instance by setting the backup retention to a value other than
     * zero.
     *
     * Default: - Duration.days(1) for source instances, disabled for read replicas
     *
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     */
    public fun backupRetention(backupRetention: Duration) {
        cdkBuilder.backupRetention(backupRetention)
    }

    /**
     * For supported engines, specifies the character set to associate with the DB instance.
     *
     * Default: - RDS default character set name
     *
     * @param characterSetName For supported engines, specifies the character set to associate with
     *   the DB instance.
     */
    public fun characterSetName(characterSetName: String) {
        cdkBuilder.characterSetName(characterSetName)
    }

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * Default: - no log exports
     *
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     *   CloudWatch Logs.
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
     *   CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(cloudwatchLogsExports: Collection<String>) {
        _cloudwatchLogsExports.addAll(cloudwatchLogsExports)
    }

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating this property, unsetting it doesn't remove the log retention policy. To remove
     * the retention policy, set the value to `Infinity`.
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
     *   custom resource that sets the retention policy.
     */
    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole)
    }

    /**
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of
     * the DB instance.
     *
     * Default: true
     *
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     *   instance to snapshots of the DB instance.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
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
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * The name of the database.
     *
     * Default: - no name
     *
     * @param databaseName The name of the database.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * Indicates whether automated backups should be deleted or retained when you delete a DB
     * instance.
     *
     * Default: false
     *
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     *   retained when you delete a DB instance.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * Indicates whether the DB instance should have deletion protection enabled.
     *
     * Default: - true if ``removalPolicy`` is RETAIN, false otherwise
     *
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Default: - Do not join domain
     *
     * @param domain The Active Directory directory ID to create the DB instance in.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy AmazonRDSDirectoryServiceAccess or equivalent.
     *
     * Default: - The role will be created for you if `DatabaseInstanceNewProps#domain` is specified
     *
     * @param domainRole The IAM role to be used when making API calls to the Directory Service.
     */
    public fun domainRole(domainRole: IRole) {
        cdkBuilder.domainRole(domainRole)
    }

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRentention`` or
     * ``performanceInsightEncryptionKey`` is set.
     *
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * The database engine.
     *
     * @param engine The database engine.
     */
    public fun engine(engine: IInstanceEngine) {
        cdkBuilder.engine(engine)
    }

    /**
     * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts.
     *
     * Default: false
     *
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     *   (IAM) accounts to database accounts.
     */
    public fun iamAuthentication(iamAuthentication: Boolean) {
        cdkBuilder.iamAuthentication(iamAuthentication)
    }

    /**
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation converts it to lowercase.
     *
     * Default: - a CloudFormation generated name
     *
     * @param instanceIdentifier A name for the DB instance.
     */
    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * The name of the compute and memory capacity for the instance.
     *
     * Default: - m5.large (or, more specifically, db.m5.large)
     *
     * @param instanceType The name of the compute and memory capacity for the instance.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The number of I/O operations per second (IOPS) that the database provisions.
     *
     * The value must be equal to or greater than 1000.
     *
     * Default: - no provisioned iops if storage type is not specified. For GP3: 3,000 IOPS if
     * allocated storage is less than 400 GiB for MariaDB, MySQL, and PostgreSQL, less than 200 GiB
     * for Oracle and less than 20 GiB for SQL Server. 12,000 IOPS otherwise (except for SQL Server
     * where the default is always 3,000 IOPS).
     *
     * @param iops The number of I/O operations per second (IOPS) that the database provisions.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * The license model.
     *
     * Default: - RDS default license model
     *
     * @param licenseModel The license model.
     */
    public fun licenseModel(licenseModel: LicenseModel) {
        cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     *
     * Default: - No autoscaling of RDS instance
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     *
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number) {
        cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instance.
     *
     * Default: - no enhanced monitoring
     *
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     *   enhanced monitoring metrics for the DB instance.
     */
    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /**
     * Role that will be used to manage DB instance monitoring.
     *
     * Default: - A role is automatically created for you
     *
     * @param monitoringRole Role that will be used to manage DB instance monitoring.
     */
    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    /**
     * Specifies if the database instance is a multiple Availability Zone deployment.
     *
     * Default: false
     *
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     */
    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
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
     * The option group to associate with the instance.
     *
     * Default: - no option group
     *
     * @param optionGroup The option group to associate with the instance.
     */
    public fun optionGroup(optionGroup: IOptionGroup) {
        cdkBuilder.optionGroup(optionGroup)
    }

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: - no parameter group
     *
     * @param parameterGroup The DB parameter group to associate with the instance.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both. You need to use a versioned
     * engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     *
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     *
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     *   data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
        cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
    }

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7 this is the free tier
     *
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     *   Insights data.
     */
    public fun performanceInsightRetention(
        performanceInsightRetention: PerformanceInsightRetention
    ) {
        cdkBuilder.performanceInsightRetention(performanceInsightRetention)
    }

    /**
     * The port for the instance.
     *
     * Default: - the default port for the chosen engine.
     *
     * @param port The port for the instance.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * The daily time range during which automated backups are performed.
     *
     * Constraints:
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region. To see the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow
     *
     * @param preferredBackupWindow The daily time range during which automated backups are
     *   performed.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute window
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region, occurring on a random day of the week. To see the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     *   maintenance can occur.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the chosen instance
     * class. See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    public fun processorFeatures(processorFeatures: ProcessorFeaturesDsl.() -> Unit = {}) {
        val builder = ProcessorFeaturesDsl()
        builder.apply(processorFeatures)
        cdkBuilder.processorFeatures(builder.build())
    }

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the chosen instance
     * class. See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     *
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    public fun processorFeatures(processorFeatures: ProcessorFeatures) {
        cdkBuilder.processorFeatures(processorFeatures)
    }

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * Default: - `true` if `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false` otherwise
     *
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the resource, but retain a snapshot of the data)
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     *   stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
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
     *
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket) {
        _s3ExportBuckets.addAll(listOf(*s3ExportBuckets))
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
     *
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     */
    public fun s3ExportBuckets(s3ExportBuckets: Collection<IBucket>) {
        _s3ExportBuckets.addAll(s3ExportBuckets)
    }

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
     *
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export.
     */
    public fun s3ExportRole(s3ExportRole: IRole) {
        cdkBuilder.s3ExportRole(s3ExportRole)
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
     *
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket) {
        _s3ImportBuckets.addAll(listOf(*s3ImportBuckets))
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
     *
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     */
    public fun s3ImportBuckets(s3ImportBuckets: Collection<IBucket>) {
        _s3ImportBuckets.addAll(s3ImportBuckets)
    }

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
     *
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import.
     */
    public fun s3ImportRole(s3ImportRole: IRole) {
        cdkBuilder.s3ImportRole(s3ImportRole)
    }

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to assign to the DB instance.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * Indicates whether the DB instance is encrypted.
     *
     * Default: - true if storageEncryptionKey has been provided, false otherwise
     *
     * @param storageEncrypted Indicates whether the DB instance is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * The KMS key that's used to encrypt the DB instance.
     *
     * Default: - default master key if storageEncrypted is true, no key otherwise
     *
     * @param storageEncryptionKey The KMS key that's used to encrypt the DB instance.
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
        cdkBuilder.storageEncryptionKey(storageEncryptionKey)
    }

    /**
     * The storage throughput, specified in mebibytes per second (MiBps).
     *
     * Only applicable for GP3.
     *
     * Default: - 125 MiBps if allocated storage is less than 400 GiB for MariaDB, MySQL, and
     * PostgreSQL, less than 200 GiB for Oracle and less than 20 GiB for SQL Server. 500 MiBps
     * otherwise (except for SQL Server where the default is always 125 MiBps).
     *
     * [Documentation](https://docs.aws.amazon.com//AmazonRDS/latest/UserGuide/CHAP_Storage.html#gp3-storage)
     *
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps).
     */
    public fun storageThroughput(storageThroughput: Number) {
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
     *
     * @param storageType The storage type.
     */
    public fun storageType(storageType: StorageType) {
        cdkBuilder.storageType(storageType)
    }

    /**
     * Existing subnet group for the instance.
     *
     * Default: - a new subnet group will be created.
     *
     * @param subnetGroup Existing subnet group for the instance.
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
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
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    /**
     * The VPC network where the DB subnet group should be created.
     *
     * @param vpc The VPC network where the DB subnet group should be created.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     *
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): DatabaseInstance {
        if (_cloudwatchLogsExports.isNotEmpty())
            cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
        if (_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
        if (_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
