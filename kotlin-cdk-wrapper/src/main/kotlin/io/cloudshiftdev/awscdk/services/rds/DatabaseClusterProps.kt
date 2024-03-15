@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface DatabaseClusterProps {
  public fun backtrackWindow(): Duration? = unwrap(this).getBacktrackWindow()?.let(Duration::wrap)

  public fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

  public fun cloudwatchLogsExports(): List<String> = unwrap(this).getCloudwatchLogsExports() ?:
      emptyList()

  public fun cloudwatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudwatchLogsRetention()?.let(RetentionDays::wrap)

  public fun cloudwatchLogsRetentionRole(): IRole? =
      unwrap(this).getCloudwatchLogsRetentionRole()?.let(IRole::wrap)

  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

  public fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

  public fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun domain(): String? = unwrap(this).getDomain()

  public fun domainRole(): IRole? = unwrap(this).getDomainRole()?.let(IRole::wrap)

  public fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

  public fun engine(): IClusterEngine

  public fun iamAuthentication(): Boolean? = unwrap(this).getIamAuthentication()

  public fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

  @Deprecated(message = "deprecated in CDK")
  public fun instanceProps(): InstanceProps? =
      unwrap(this).getInstanceProps()?.let(InstanceProps::wrap)

  public fun instanceUpdateBehaviour(): InstanceUpdateBehaviour? =
      unwrap(this).getInstanceUpdateBehaviour()?.let(InstanceUpdateBehaviour::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun instances(): Number? = unwrap(this).getInstances()

  public fun monitoringInterval(): Duration? =
      unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

  public fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

  public fun networkType(): NetworkType? = unwrap(this).getNetworkType()?.let(NetworkType::wrap)

  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun readers(): List<IClusterInstance> =
      unwrap(this).getReaders()?.map(IClusterInstance::wrap) ?: emptyList()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun s3ExportBuckets(): List<IBucket> =
      unwrap(this).getS3ExportBuckets()?.map(IBucket::wrap) ?: emptyList()

  public fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

  public fun s3ImportBuckets(): List<IBucket> =
      unwrap(this).getS3ImportBuckets()?.map(IBucket::wrap) ?: emptyList()

  public fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun serverlessV2MaxCapacity(): Number? = unwrap(this).getServerlessV2MaxCapacity()

  public fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

  public fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

  public fun storageEncryptionKey(): IKey? = unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

  public fun storageType(): DBClusterStorageType? =
      unwrap(this).getStorageType()?.let(DBClusterStorageType::wrap)

  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun backtrackWindow(backtrackWindow: Duration)

    public fun backup(backup: BackupProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49cd1803fcd3e6b1b4c8e17bdc77d845dc10482a9520b395e9297a5bdc65de2b")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>)

    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String)

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays)

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun credentials(credentials: Credentials)

    public fun defaultDatabaseName(defaultDatabaseName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun domain(domain: String)

    public fun domainRole(domainRole: IRole)

    public fun enableDataApi(enableDataApi: Boolean)

    public fun engine(engine: IClusterEngine)

    public fun iamAuthentication(iamAuthentication: Boolean)

    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df92396c9f0edddf0036074d7ca7989bf0b2d9b4c27e949b9ec901c0f4ba477")
    public fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit)

    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour)

    @Deprecated(message = "deprecated in CDK")
    public fun instances(instances: Number)

    public fun monitoringInterval(monitoringInterval: Duration)

    public fun monitoringRole(monitoringRole: IRole)

    public fun networkType(networkType: NetworkType)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun parameters(parameters: Map<String, String>)

    public fun port(port: Number)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun readers(readers: List<IClusterInstance>)

    public fun readers(vararg readers: IClusterInstance)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket)

    public fun s3ExportRole(s3ExportRole: IRole)

    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket)

    public fun s3ImportRole(s3ImportRole: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number)

    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    public fun storageType(storageType: DBClusterStorageType)

    public fun subnetGroup(subnetGroup: ISubnetGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81da83322806002508132cc1ba556c3ce2710568323ae7c68d5238cdaed9c886")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    public fun writer(writer: IClusterInstance)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseClusterProps.builder()

    override fun backtrackWindow(backtrackWindow: Duration) {
      cdkBuilder.backtrackWindow(backtrackWindow.let(Duration::unwrap))
    }

    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49cd1803fcd3e6b1b4c8e17bdc77d845dc10482a9520b395e9297a5bdc65de2b")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    override fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String): Unit =
        cloudwatchLogsExports(cloudwatchLogsExports.toList())

    override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
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

    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(instanceProps: InstanceProps) {
      cdkBuilder.instanceProps(instanceProps.let(InstanceProps::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df92396c9f0edddf0036074d7ca7989bf0b2d9b4c27e949b9ec901c0f4ba477")
    override fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit): Unit =
        instanceProps(InstanceProps(instanceProps))

    override fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
      cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour.let(InstanceUpdateBehaviour::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun readers(readers: List<IClusterInstance>) {
      cdkBuilder.readers(readers.map(IClusterInstance::unwrap))
    }

    override fun readers(vararg readers: IClusterInstance): Unit = readers(readers.toList())

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    override fun s3ExportBuckets(vararg s3ExportBuckets: IBucket): Unit =
        s3ExportBuckets(s3ExportBuckets.toList())

    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    override fun s3ImportBuckets(vararg s3ImportBuckets: IBucket): Unit =
        s3ImportBuckets(s3ImportBuckets.toList())

    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
      cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

    override fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
      cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    override fun storageType(storageType: DBClusterStorageType) {
      cdkBuilder.storageType(storageType.let(DBClusterStorageType::unwrap))
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81da83322806002508132cc1ba556c3ce2710568323ae7c68d5238cdaed9c886")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    override fun writer(writer: IClusterInstance) {
      cdkBuilder.writer(writer.let(IClusterInstance::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterProps,
  ) : CdkObject(cdkObject), DatabaseClusterProps {
    override fun backtrackWindow(): Duration? =
        unwrap(this).getBacktrackWindow()?.let(Duration::wrap)

    override fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

    override fun cloudwatchLogsExports(): List<String> = unwrap(this).getCloudwatchLogsExports() ?:
        emptyList()

    override fun cloudwatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudwatchLogsRetention()?.let(RetentionDays::wrap)

    override fun cloudwatchLogsRetentionRole(): IRole? =
        unwrap(this).getCloudwatchLogsRetentionRole()?.let(IRole::wrap)

    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun domainRole(): IRole? = unwrap(this).getDomainRole()?.let(IRole::wrap)

    override fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

    override fun engine(): IClusterEngine = unwrap(this).getEngine().let(IClusterEngine::wrap)

    override fun iamAuthentication(): Boolean? = unwrap(this).getIamAuthentication()

    override fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(): InstanceProps? =
        unwrap(this).getInstanceProps()?.let(InstanceProps::wrap)

    override fun instanceUpdateBehaviour(): InstanceUpdateBehaviour? =
        unwrap(this).getInstanceUpdateBehaviour()?.let(InstanceUpdateBehaviour::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun instances(): Number? = unwrap(this).getInstances()

    override fun monitoringInterval(): Duration? =
        unwrap(this).getMonitoringInterval()?.let(Duration::wrap)

    override fun monitoringRole(): IRole? = unwrap(this).getMonitoringRole()?.let(IRole::wrap)

    override fun networkType(): NetworkType? = unwrap(this).getNetworkType()?.let(NetworkType::wrap)

    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun readers(): List<IClusterInstance> =
        unwrap(this).getReaders()?.map(IClusterInstance::wrap) ?: emptyList()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun s3ExportBuckets(): List<IBucket> =
        unwrap(this).getS3ExportBuckets()?.map(IBucket::wrap) ?: emptyList()

    override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

    override fun s3ImportBuckets(): List<IBucket> =
        unwrap(this).getS3ImportBuckets()?.map(IBucket::wrap) ?: emptyList()

    override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun serverlessV2MaxCapacity(): Number? = unwrap(this).getServerlessV2MaxCapacity()

    override fun serverlessV2MinCapacity(): Number? = unwrap(this).getServerlessV2MinCapacity()

    override fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

    override fun storageEncryptionKey(): IKey? =
        unwrap(this).getStorageEncryptionKey()?.let(IKey::wrap)

    override fun storageType(): DBClusterStorageType? =
        unwrap(this).getStorageType()?.let(DBClusterStorageType::wrap)

    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    override fun writer(): IClusterInstance? = unwrap(this).getWriter()?.let(IClusterInstance::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterProps):
        DatabaseClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterProps):
        software.amazon.awscdk.services.rds.DatabaseClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseClusterProps
  }
}
