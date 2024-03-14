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
      unwrap(this).getCloudwatchLogGroups().mapValues { ILogGroup.wrap(it.value)} ?: emptyMap()

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
    public fun allocatedStorage(allocatedStorage: Number) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun backupRetention(backupRetention: Duration) {
    }

    public fun caCertificate(caCertificate: CaCertificate) {
    }

    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
    }

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
    }

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
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

    public fun iamAuthentication(iamAuthentication: Boolean) {
    }

    public fun instanceIdentifier(instanceIdentifier: String) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun iops(iops: Number) {
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
    @JvmName("756a719433bbb707bf4095bbf12c196b3dae50d9ab94a903cf993ac027efb1aa")
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

    public fun sourceDatabaseInstance(sourceDatabaseInstance: IDatabaseInstance) {
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

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bb50b1db573671285c6e80e9e254395e40e50cb265aa8955d1d29496c5388c6")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica.Builder
        = software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica.Builder.create(scope, id)

    public override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
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
    @JvmName("756a719433bbb707bf4095bbf12c196b3dae50d9ab94a903cf993ac027efb1aa")
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

    public override fun sourceDatabaseInstance(sourceDatabaseInstance: IDatabaseInstance) {
      cdkBuilder.sourceDatabaseInstance(sourceDatabaseInstance.let(IDatabaseInstance::unwrap))
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

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bb50b1db573671285c6e80e9e254395e40e50cb265aa8955d1d29496c5388c6")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
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
