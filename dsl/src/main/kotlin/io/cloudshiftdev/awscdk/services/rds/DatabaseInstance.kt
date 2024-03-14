package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstance,
) : DatabaseInstanceBase(cdkObject), IDatabaseInstance {
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e3144e2981e2d54c29b77d092c09cc103c3d4bfbd9ad1ec5f454ad3e6812f0")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  public open fun addRotationSingleUser(options: RotationSingleUserOptions): SecretRotation =
      unwrap(this).addRotationSingleUser(options.let(RotationSingleUserOptions::unwrap)).let(SecretRotation::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dc3cae235dd1373fbafbfbb3e452e2b888653b3946f4b0e89a32adad5226775")
  public open fun addRotationSingleUser(options: RotationSingleUserOptions.Builder.() -> Unit):
      SecretRotation = addRotationSingleUser(RotationSingleUserOptions(options))

  public open fun cloudwatchLogGroups(): Map<String, ILogGroup> =
      unwrap(this).getCloudwatchLogGroups().mapValues { ILogGroup.wrap(it.value)} ?: emptyMap()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun dbInstanceEndpointAddress(): String =
      unwrap(this).getDbInstanceEndpointAddress()

  public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

  public override fun engine(): IInstanceEngine? =
      unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  public override fun grantConnect(grantee: IGrantable): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

  public override fun instanceEndpoint(): Endpoint =
      unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

  public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

  public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public open fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number) {
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun backupRetention(backupRetention: Duration) {
    }

    public fun caCertificate(caCertificate: CaCertificate) {
    }

    public fun characterSetName(characterSetName: String) {
    }

    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
    }

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
    }

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    }

    public fun credentials(credentials: Credentials) {
    }

    public fun databaseName(databaseName: String) {
    }

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun domain(domain: String) {
    }

    public fun domainRole(domainRole: IRole) {
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    }

    public fun engine(engine: IInstanceEngine) {
    }

    public fun iamAuthentication(iamAuthentication: Boolean) {
    }

    public fun instanceIdentifier(instanceIdentifier: String) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun iops(iops: Number) {
    }

    public fun licenseModel(licenseModel: LicenseModel) {
    }

    public fun maxAllocatedStorage(maxAllocatedStorage: Number) {
    }

    public fun monitoringInterval(monitoringInterval: Duration) {
    }

    public fun monitoringRole(monitoringRole: IRole) {
    }

    public fun multiAz(multiAz: Boolean) {
    }

    public fun networkType(networkType: NetworkType) {
    }

    public fun optionGroup(optionGroup: IOptionGroup) {
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
    }

    public fun parameters(parameters: Map<String, String>) {
    }

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
    }

    public
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
    }

    public fun port(port: Number) {
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun processorFeatures(processorFeatures: ProcessorFeatures) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26339308c96a3e281ec96ae3bb5e4f2a372ca68dc3f999a3a8223eae994c313c")
    public fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
    }

    public fun s3ExportRole(s3ExportRole: IRole) {
    }

    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
    }

    public fun s3ImportRole(s3ImportRole: IRole) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
    }

    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
    }

    public fun storageThroughput(storageThroughput: Number) {
    }

    public fun storageType(storageType: StorageType) {
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
    }

    public fun timezone(timezone: String) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da31d4aab9e7de80115c98190e0fbf0760c297ee0a23eea1d782c099101376cf")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstance.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstance.Builder.create(scope, id)

    public override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
    }

    public override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    public override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

    public override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    public override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
    }

    public override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    public override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    public override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    public override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    public override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun licenseModel(licenseModel: LicenseModel) {
      cdkBuilder.licenseModel(licenseModel.let(LicenseModel::unwrap))
    }

    public override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    public override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    public override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    public override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    public override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    public override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    public override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    public override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    public override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun processorFeatures(processorFeatures: ProcessorFeatures) {
      cdkBuilder.processorFeatures(processorFeatures.let(ProcessorFeatures::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26339308c96a3e281ec96ae3bb5e4f2a372ca68dc3f999a3a8223eae994c313c")
    public override fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit):
        Unit = processorFeatures(ProcessorFeatures(processorFeatures))

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    public override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    public override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    public override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    public override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    public override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType::unwrap))
    }

    public override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    public override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da31d4aab9e7de80115c98190e0fbf0760c297ee0a23eea1d782c099101376cf")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
