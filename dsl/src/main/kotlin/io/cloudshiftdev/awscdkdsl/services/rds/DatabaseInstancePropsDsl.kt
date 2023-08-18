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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.rds.DatabaseInstanceProps
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

/**
 * Construction properties for a DatabaseInstance.
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
public class DatabaseInstancePropsDsl {
    private val cdkBuilder: DatabaseInstanceProps.Builder = DatabaseInstanceProps.builder()

    private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

    private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param allocatedStorage The allocated storage size, specified in gibibytes (GiB). */
    public fun allocatedStorage(allocatedStorage: Number) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /** @param allowMajorVersionUpgrade Whether to allow major version upgrades. */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     *   to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     *   located.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     *   Set to zero to disable backups. When creating a read replica, you must enable automatic
     *   backups on the source database instance by setting the backup retention to a value other
     *   than zero.
     */
    public fun backupRetention(backupRetention: Duration) {
        cdkBuilder.backupRetention(backupRetention)
    }

    /**
     * @param characterSetName For supported engines, specifies the character set to associate with
     *   the DB instance.
     */
    public fun characterSetName(characterSetName: String) {
        cdkBuilder.characterSetName(characterSetName)
    }

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     *   CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String) {
        _cloudwatchLogsExports.addAll(listOf(*cloudwatchLogsExports))
    }

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     *   CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(cloudwatchLogsExports: Collection<String>) {
        _cloudwatchLogsExports.addAll(cloudwatchLogsExports)
    }

    /**
     * @param cloudwatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     *   When updating this property, unsetting it doesn't remove the log retention policy. To
     *   remove the retention policy, set the value to `Infinity`.
     */
    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention)
    }

    /**
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     *   custom resource that sets the retention policy.
     */
    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole)
    }

    /**
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     *   instance to snapshots of the DB instance.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /** @param credentials Credentials for the administrative user. */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /** @param databaseName The name of the database. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     *   retained when you delete a DB instance.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /** @param domain The Active Directory directory ID to create the DB instance in. */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * @param domainRole The IAM role to be used when making API calls to the Directory Service. The
     *   role needs the AWS-managed policy AmazonRDSDirectoryServiceAccess or equivalent.
     */
    public fun domainRole(domainRole: IRole) {
        cdkBuilder.domainRole(domainRole)
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param engine The database engine. */
    public fun engine(engine: IInstanceEngine) {
        cdkBuilder.engine(engine)
    }

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     *   (IAM) accounts to database accounts.
     */
    public fun iamAuthentication(iamAuthentication: Boolean) {
        cdkBuilder.iamAuthentication(iamAuthentication)
    }

    /**
     * @param instanceIdentifier A name for the DB instance. If you specify a name, AWS
     *   CloudFormation converts it to lowercase.
     */
    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /** @param instanceType The name of the compute and memory capacity for the instance. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) that the database provisions. The
     *   value must be equal to or greater than 1000.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /** @param licenseModel The license model. */
    public fun licenseModel(licenseModel: LicenseModel) {
        cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number) {
        cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     *   enhanced monitoring metrics for the DB instance.
     */
    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /** @param monitoringRole Role that will be used to manage DB instance monitoring. */
    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    /**
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     */
    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    /** @param networkType The network type of the DB instance. */
    public fun networkType(networkType: NetworkType) {
        cdkBuilder.networkType(networkType)
    }

    /** @param optionGroup The option group to associate with the instance. */
    public fun optionGroup(optionGroup: IOptionGroup) {
        cdkBuilder.optionGroup(optionGroup)
    }

    /** @param parameterGroup The DB parameter group to associate with the instance. */
    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically. You can
     *   only specify parameterGroup or parameters but not both. You need to use a versioned engine
     *   to auto-generate a DBParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     *   data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
        cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     *   Insights data.
     */
    public fun performanceInsightRetention(
        performanceInsightRetention: PerformanceInsightRetention
    ) {
        cdkBuilder.performanceInsightRetention(performanceInsightRetention)
    }

    /** @param port The port for the instance. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are
     *   performed. Constraints:
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     *   maintenance can occur. Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute
     *   window
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /** @param processorFeatures The number of CPU cores and the number of threads per core. */
    public fun processorFeatures(processorFeatures: ProcessorFeaturesDsl.() -> Unit = {}) {
        val builder = ProcessorFeaturesDsl()
        builder.apply(processorFeatures)
        cdkBuilder.processorFeatures(builder.build())
    }

    /** @param processorFeatures The number of CPU cores and the number of threads per core. */
    public fun processorFeatures(processorFeatures: ProcessorFeatures) {
        cdkBuilder.processorFeatures(processorFeatures)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     *   stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This property must not be
     *   used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket) {
        _s3ExportBuckets.addAll(listOf(*s3ExportBuckets))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This property must not be
     *   used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportBuckets(s3ExportBuckets: Collection<IBucket>) {
        _s3ExportBuckets.addAll(s3ExportBuckets)
    }

    /**
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export.
     *   This property must not be used if `s3ExportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportRole(s3ExportRole: IRole) {
        cdkBuilder.s3ExportRole(s3ExportRole)
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     *   supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket) {
        _s3ImportBuckets.addAll(listOf(*s3ImportBuckets))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     *   supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportBuckets(s3ImportBuckets: Collection<IBucket>) {
        _s3ImportBuckets.addAll(s3ImportBuckets)
    }

    /**
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import.
     *   This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportRole(s3ImportRole: IRole) {
        cdkBuilder.s3ImportRole(s3ImportRole)
    }

    /** @param securityGroups The security groups to assign to the DB instance. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups to assign to the DB instance. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param storageEncrypted Indicates whether the DB instance is encrypted. */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /** @param storageEncryptionKey The KMS key that's used to encrypt the DB instance. */
    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
        cdkBuilder.storageEncryptionKey(storageEncryptionKey)
    }

    /**
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps).
     *   Only applicable for GP3.
     */
    public fun storageThroughput(storageThroughput: Number) {
        cdkBuilder.storageThroughput(storageThroughput)
    }

    /** @param storageType The storage type. Storage types supported are gp2, io1, standard. */
    public fun storageType(storageType: StorageType) {
        cdkBuilder.storageType(storageType)
    }

    /** @param subnetGroup Existing subnet group for the instance. */
    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
    }

    /**
     * @param timezone The time zone of the instance. This is currently supported only by Microsoft
     *   Sql Server.
     */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    /** @param vpc The VPC network where the DB subnet group should be created. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets The type of subnets to add to the created DB subnet group. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets The type of subnets to add to the created DB subnet group. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): DatabaseInstanceProps {
        if (_cloudwatchLogsExports.isNotEmpty())
            cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
        if (_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
        if (_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
