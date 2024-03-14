package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
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

public open class DatabaseInstanceReadReplica internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica,
) : DatabaseInstanceBase(cdkObject), IDatabaseInstance {
  public open fun cloudwatchLogGroups(): Map<String, ILogGroup> =
      unwrap(this).getCloudwatchLogGroups().mapValues{ILogGroup.wrap(it.value)} ?: emptyMap()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun dbInstanceEndpointAddress(): String =
      unwrap(this).getDbInstanceEndpointAddress()

  public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

  public override fun engine(): IInstanceEngine? =
      unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  public override fun instanceEndpoint(): Endpoint =
      unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

  public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

  public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  public open fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun backupRetention(backupRetention: Duration)

    public fun caCertificate(caCertificate: CaCertificate)

    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>)

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays)

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun domain(domain: String)

    public fun domainRole(domainRole: IRole)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun iamAuthentication(iamAuthentication: Boolean)

    public fun instanceIdentifier(instanceIdentifier: String)

    public fun instanceType(instanceType: InstanceType)

    public fun iops(iops: Number)

    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

    public fun monitoringInterval(monitoringInterval: Duration)

    public fun monitoringRole(monitoringRole: IRole)

    public fun multiAz(multiAz: Boolean)

    public fun networkType(networkType: NetworkType)

    public fun optionGroup(optionGroup: IOptionGroup)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    public fun port(port: Number)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun processorFeatures(processorFeatures: ProcessorFeatures)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("756a719433bbb707bf4095bbf12c196b3dae50d9ab94a903cf993ac027efb1aa")
    public fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    public fun s3ExportRole(s3ExportRole: IRole)

    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    public fun s3ImportRole(s3ImportRole: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun sourceDatabaseInstance(sourceDatabaseInstance: IDatabaseInstance)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    public fun storageThroughput(storageThroughput: Number)

    public fun storageType(storageType: StorageType)

    public fun subnetGroup(subnetGroup: ISubnetGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bb50b1db573671285c6e80e9e254395e40e50cb265aa8955d1d29496c5388c6")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica.Builder
        = software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica.Builder.create(scope, id)

    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
    }

    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun processorFeatures(processorFeatures: ProcessorFeatures) {
      cdkBuilder.processorFeatures(processorFeatures.let(ProcessorFeatures::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("756a719433bbb707bf4095bbf12c196b3dae50d9ab94a903cf993ac027efb1aa")
    override fun processorFeatures(processorFeatures: ProcessorFeatures.Builder.() -> Unit): Unit =
        processorFeatures(ProcessorFeatures(processorFeatures))

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun sourceDatabaseInstance(sourceDatabaseInstance: IDatabaseInstance) {
      cdkBuilder.sourceDatabaseInstance(sourceDatabaseInstance.let(IDatabaseInstance::unwrap))
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType::unwrap))
    }

    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bb50b1db573671285c6e80e9e254395e40e50cb265aa8955d1d29496c5388c6")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseInstanceReadReplica {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseInstanceReadReplica(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica):
        DatabaseInstanceReadReplica = DatabaseInstanceReadReplica(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceReadReplica):
        software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica = wrapped.cdkObject
  }
}
