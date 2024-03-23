@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Construction properties for a DatabaseInstance.
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
public interface DatabaseInstanceProps : DatabaseInstanceSourceProps {
  /**
   * For supported engines, specifies the character set to associate with the DB instance.
   *
   * Default: - RDS default character set name
   */
  public fun characterSetName(): String? = unwrap(this).getCharacterSetName()

  /**
   * Credentials for the administrative user.
   *
   * Default: - A username of 'admin' (or 'postgres' for PostgreSQL) and SecretsManager-generated
   * password
   */
  public fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

  /**
   * Indicates whether the DB instance is encrypted.
   *
   * Default: - true if storageEncryptionKey has been provided, false otherwise
   */
  public fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

  /**
   * The KMS key that's used to encrypt the DB instance.
   *
   * Default: - default master key if storageEncrypted is true, no key otherwise
   */
  public fun storageEncryptionKey(): IKey? = unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [DatabaseInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedStorage The allocated storage size, specified in gibibytes (GiB).
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * @param allowMajorVersionUpgrade Whether to allow major version upgrades.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     * Set to zero to disable backups.
     * When creating a read replica, you must enable automatic backups on the source
     * database instance by setting the backup retention to a value other than zero.
     */
    public fun backupRetention(backupRetention: Duration)

    /**
     * @param caCertificate The identifier of the CA certificate for this DB instance.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    public fun caCertificate(caCertificate: CaCertificate)

    /**
     * @param characterSetName For supported engines, specifies the character set to associate with
     * the DB instance.
     */
    public fun characterSetName(characterSetName: String)

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
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     * instance to snapshots of the DB instance.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param credentials Credentials for the administrative user.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param databaseName The name of the database.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     * retained when you delete a DB instance.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

    /**
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     * enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     */
    public fun domain(domain: String)

    /**
     * @param domainRole The IAM role to be used when making API calls to the Directory Service.
     * The role needs the AWS-managed policy
     * AmazonRDSDirectoryServiceAccess or equivalent.
     */
    public fun domainRole(domainRole: IRole)

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param engine The database engine. 
     */
    public fun engine(engine: IInstanceEngine)

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts.
     */
    public fun iamAuthentication(iamAuthentication: Boolean)

    /**
     * @param instanceIdentifier A name for the DB instance.
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * @param instanceType The name of the compute and memory capacity for the instance.
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param iops The number of I/O operations per second (IOPS) that the database provisions.
     * The value must be equal to or greater than 1000.
     */
    public fun iops(iops: Number)

    /**
     * @param licenseModel The license model.
     */
    public fun licenseModel(licenseModel: LicenseModel)

    /**
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instance.
     */
    public fun monitoringInterval(monitoringInterval: Duration)

    /**
     * @param monitoringRole Role that will be used to manage DB instance monitoring.
     */
    public fun monitoringRole(monitoringRole: IRole)

    /**
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * @param networkType The network type of the DB instance.
     */
    public fun networkType(networkType: NetworkType)

    /**
     * @param optionGroup The option group to associate with the instance.
     */
    public fun optionGroup(optionGroup: IOptionGroup)

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
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
     */
    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    /**
     * @param port The port for the instance.
     */
    public fun port(port: Number)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are
     * performed.
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    public fun processorFeatures(processorFeatures: ProcessorFeatures)

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e72249efb897fe7e9e9b068201e8f6b63c8f4d1464d2428bff2d74ce05b6d064")
    public fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit)

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the instance's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket)

    /**
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export.
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ExportRole(s3ExportRole: IRole)

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket)

    /**
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    public fun s3ImportRole(s3ImportRole: IRole)

    /**
     * @param securityGroups The security groups to assign to the DB instance.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups to assign to the DB instance.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param storageEncrypted Indicates whether the DB instance is encrypted.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncryptionKey The KMS key that's used to encrypt the DB instance.
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    /**
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps).
     * Only applicable for GP3.
     */
    public fun storageThroughput(storageThroughput: Number)

    /**
     * @param storageType The storage type.
     * Storage types supported are gp2, io1, standard.
     */
    public fun storageType(storageType: StorageType)

    /**
     * @param subnetGroup Existing subnet group for the instance.
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * @param timezone The time zone of the instance.
     * This is currently supported only by Microsoft Sql Server.
     */
    public fun timezone(timezone: String)

    /**
     * @param vpc The VPC network where the DB subnet group should be created. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c4f5614c0efc5894a2486cf3901be8a0945aa6e7529931cd71d9985bff3c7f3")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstanceProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstanceProps.builder()

    /**
     * @param allocatedStorage The allocated storage size, specified in gibibytes (GiB).
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param allowMajorVersionUpgrade Whether to allow major version upgrades.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     * to the DB instance during the maintenance window.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     * located.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     * Set to zero to disable backups.
     * When creating a read replica, you must enable automatic backups on the source
     * database instance by setting the backup retention to a value other than zero.
     */
    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
    }

    /**
     * @param caCertificate The identifier of the CA certificate for this DB instance.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    /**
     * @param characterSetName For supported engines, specifies the character set to associate with
     * the DB instance.
     */
    override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

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
     * @param copyTagsToSnapshot Indicates whether to copy all of the user-defined tags from the DB
     * instance to snapshots of the DB instance.
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
     * @param databaseName The name of the database.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param deleteAutomatedBackups Indicates whether automated backups should be deleted or
     * retained when you delete a DB instance.
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * @param deletionProtection Indicates whether the DB instance should have deletion protection
     * enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param domainRole The IAM role to be used when making API calls to the Directory Service.
     * The role needs the AWS-managed policy
     * AmazonRDSDirectoryServiceAccess or equivalent.
     */
    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param engine The database engine. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     * (IAM) accounts to database accounts.
     */
    override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    /**
     * @param instanceIdentifier A name for the DB instance.
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param instanceType The name of the compute and memory capacity for the instance.
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) that the database provisions.
     * The value must be equal to or greater than 1000.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param licenseModel The license model.
     */
    override fun licenseModel(licenseModel: LicenseModel) {
      cdkBuilder.licenseModel(licenseModel.let(LicenseModel::unwrap))
    }

    /**
     * @param maxAllocatedStorage Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     */
    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     * enhanced monitoring metrics for the DB instance.
     */
    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    /**
     * @param monitoringRole Role that will be used to manage DB instance monitoring.
     */
    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    /**
     * @param multiAz Specifies if the database instance is a multiple Availability Zone deployment.
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param networkType The network type of the DB instance.
     */
    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    /**
     * @param optionGroup The option group to associate with the instance.
     */
    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     */
    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    /**
     * @param port The port for the instance.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are
     * performed.
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi`.
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     * maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     * Constraint: Minimum 30-minute window
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    override fun processorFeatures(processorFeatures: ProcessorFeatures) {
      cdkBuilder.processorFeatures(processorFeatures.let(ProcessorFeatures::unwrap))
    }

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e72249efb897fe7e9e9b068201e8f6b63c8f4d1464d2428bff2d74ce05b6d064")
    override fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit): Unit =
        processorFeatures(ProcessorFeatures(processorFeatures))

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the instance's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     * stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into.
     * This property must not be used if `s3ExportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ExportBuckets(vararg s3ExportBuckets: IBucket): Unit =
        s3ExportBuckets(s3ExportBuckets.toList())

    /**
     * @param s3ExportRole Role that will be associated with this DB instance to enable S3 export.
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportRole` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ImportBuckets(vararg s3ImportBuckets: IBucket): Unit =
        s3ImportBuckets(s3ImportBuckets.toList())

    /**
     * @param s3ImportRole Role that will be associated with this DB instance to enable S3 import.
     * This feature is only supported by the Microsoft SQL Server, Oracle, and PostgreSQL engines.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For Microsoft SQL Server:
     */
    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    /**
     * @param securityGroups The security groups to assign to the DB instance.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups to assign to the DB instance.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param storageEncrypted Indicates whether the DB instance is encrypted.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncryptionKey The KMS key that's used to encrypt the DB instance.
     */
    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    /**
     * @param storageThroughput The storage throughput, specified in mebibytes per second (MiBps).
     * Only applicable for GP3.
     */
    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    /**
     * @param storageType The storage type.
     * Storage types supported are gp2, io1, standard.
     */
    override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType::unwrap))
    }

    /**
     * @param subnetGroup Existing subnet group for the instance.
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    /**
     * @param timezone The time zone of the instance.
     * This is currently supported only by Microsoft Sql Server.
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    /**
     * @param vpc The VPC network where the DB subnet group should be created. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets to add to the created DB subnet group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c4f5614c0efc5894a2486cf3901be8a0945aa6e7529931cd71d9985bff3c7f3")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceProps,
  ) : CdkObject(cdkObject), DatabaseInstanceProps {
    /**
     * The allocated storage size, specified in gibibytes (GiB).
     *
     * Default: 100
     */
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

    /**
     * Whether to allow major version upgrades.
     *
     * Default: false
     */
    override fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     */
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The name of the Availability Zone where the DB instance will be located.
     *
     * Default: - no preference
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Set to zero to disable backups.
     * When creating a read replica, you must enable automatic backups on the source
     * database instance by setting the backup retention to a value other than zero.
     *
     * Default: - Duration.days(1) for source instances, disabled for read replicas
     */
    override fun backupRetention(): Duration? =
        unwrap(this).getBackupRetention()?.let(Duration::wrap)

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
     */
    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    /**
     * For supported engines, specifies the character set to associate with the DB instance.
     *
     * Default: - RDS default character set name
     */
    override fun characterSetName(): String? = unwrap(this).getCharacterSetName()

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
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of
     * the DB instance.
     *
     * Default: true
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
     * The name of the database.
     *
     * Default: - no name
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Indicates whether automated backups should be deleted or retained when you delete a DB
     * instance.
     *
     * Default: true
     */
    override fun deleteAutomatedBackups(): Boolean? = unwrap(this).getDeleteAutomatedBackups()

    /**
     * Indicates whether the DB instance should have deletion protection enabled.
     *
     * Default: - true if ``removalPolicy`` is RETAIN, false otherwise
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Default: - Do not join domain
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The IAM role to be used when making API calls to the Directory Service.
     *
     * The role needs the AWS-managed policy
     * AmazonRDSDirectoryServiceAccess or equivalent.
     *
     * Default: - The role will be created for you if `DatabaseInstanceNewProps#domain` is specified
     */
    override fun domainRole(): IRole? = unwrap(this).getDomainRole()?.let(IRole::wrap)

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The database engine.
     */
    override fun engine(): IInstanceEngine = unwrap(this).getEngine().let(IInstanceEngine::wrap)

    /**
     * Whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts.
     *
     * Default: false
     */
    override fun iamAuthentication(): Boolean? = unwrap(this).getIamAuthentication()

    /**
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation
     * converts it to lowercase.
     *
     * Default: - a CloudFormation generated name
     */
    override fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

    /**
     * The name of the compute and memory capacity for the instance.
     *
     * Default: - m5.large (or, more specifically, db.m5.large)
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

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
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The license model.
     *
     * Default: - RDS default license model
     */
    override fun licenseModel(): LicenseModel? =
        unwrap(this).getLicenseModel()?.let(LicenseModel::wrap)

    /**
     * Upper limit to which RDS can scale the storage in GiB(Gibibyte).
     *
     * Default: - No autoscaling of RDS instance
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     */
    override fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics
     * for the DB instance.
     *
     * Default: - no enhanced monitoring
     */
    override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    /**
     * Role that will be used to manage DB instance monitoring.
     *
     * Default: - A role is automatically created for you
     */
    override fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

    /**
     * Specifies if the database instance is a multiple Availability Zone deployment.
     *
     * Default: false
     */
    override fun multiAz(): Boolean? = unwrap(this).getMultiAz()

    /**
     * The network type of the DB instance.
     *
     * Default: - IPV4
     */
    override fun networkType(): NetworkType? = unwrap(this).getNetworkType()?.let(NetworkType::wrap)

    /**
     * The option group to associate with the instance.
     *
     * Default: - no option group
     */
    override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: - no parameter group
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
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
     * Default: 7 this is the free tier
     */
    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    /**
     * The port for the instance.
     *
     * Default: - the default port for the chosen engine.
     */
    override fun port(): Number? = unwrap(this).getPort()

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
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The number of CPU cores and the number of threads per core.
     *
     * Default: - the default number of CPU cores and threads per core for the
     * chosen instance class.
     * See
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor
     */
    override fun processorFeatures(): ProcessorFeatures? =
        unwrap(this).getProcessorFeatures()?.let(ProcessorFeatures::wrap)

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If not specified,
     * the instance's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     *
     * Default: - `true` if the instance's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
     * otherwise
     */
    override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the resource, but retain a snapshot of the data)
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

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
     */
    override fun s3ExportBuckets(): List<IBucket> =
        unwrap(this).getS3ExportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
     */
    override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

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
     */
    override fun s3ImportBuckets(): List<IBucket> =
        unwrap(this).getS3ImportBuckets()?.map(IBucket::wrap) ?: emptyList()

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
     */
    override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

    /**
     * The security groups to assign to the DB instance.
     *
     * Default: - a new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Indicates whether the DB instance is encrypted.
     *
     * Default: - true if storageEncryptionKey has been provided, false otherwise
     */
    override fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

    /**
     * The KMS key that's used to encrypt the DB instance.
     *
     * Default: - default master key if storageEncrypted is true, no key otherwise
     */
    override fun storageEncryptionKey(): IKey? =
        unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

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
     */
    override fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

    /**
     * The storage type.
     *
     * Storage types supported are gp2, io1, standard.
     *
     * Default: GP2
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#Concepts.Storage.GeneralSSD)
     */
    override fun storageType(): StorageType? = unwrap(this).getStorageType()?.let(StorageType::wrap)

    /**
     * Existing subnet group for the instance.
     *
     * Default: - a new subnet group will be created.
     */
    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

    /**
     * The time zone of the instance.
     *
     * This is currently supported only by Microsoft Sql Server.
     *
     * Default: - RDS default timezone
     */
    override fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * The VPC network where the DB subnet group should be created.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The type of subnets to add to the created DB subnet group.
     *
     * Default: - private subnets
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceProps):
        DatabaseInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? DatabaseInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceProps):
        software.amazon.awscdk.services.rds.DatabaseInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseInstanceProps
  }
}
