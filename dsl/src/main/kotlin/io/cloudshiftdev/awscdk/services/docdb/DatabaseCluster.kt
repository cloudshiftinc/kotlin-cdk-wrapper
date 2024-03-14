package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.DatabaseCluster,
) : Resource(cdkObject), IDatabaseCluster {
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b8b044ea922f9f1b7e3ef5250128d6276285a347cedba57d10866b433d1856a")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  public open fun addRotationSingleUser(automaticallyAfter: Duration): SecretRotation =
      unwrap(this).addRotationSingleUser(automaticallyAfter.let(Duration::unwrap)).let(SecretRotation::wrap)

  public open fun addSecurityGroups(securityGroups: ISecurityGroup) {
    unwrap(this).addSecurityGroups(securityGroups.let(ISecurityGroup::unwrap))
  }

  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  public open fun clusterResourceIdentifier(): String = unwrap(this).getClusterResourceIdentifier()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun instanceEndpoints(): List<Endpoint> =
      unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

  public override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
      emptyList()

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  public interface Builder {
    public fun backup(backup: BackupProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c96b7df7819668cd86079d0487b9e2f82c8b347b3683ead131c1b3fe19811fac")
    public fun backup(backup: BackupProps.Builder.() -> Unit) {
    }

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
    }

    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
    }

    public fun dbClusterName(dbClusterName: String) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
    }

    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
    }

    public fun instanceIdentifierBase(instanceIdentifierBase: String) {
    }

    public fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun instances(instances: Number) {
    }

    public fun kmsKey(kmsKey: IKey) {
    }

    public fun masterUser(masterUser: Login) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38d2499bd6d916c15f6314c69c7931f6bfc68daf7e26bf4c71c60bda60e8605a")
    public fun masterUser(masterUser: Login.Builder.() -> Unit) {
    }

    public fun parameterGroup(parameterGroup: IClusterParameterGroup) {
    }

    public fun port(port: Number) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy) {
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("091172f9d8b70d03d056ac667cf52b06f2f8d009b9a8a20e165048f3805a713a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseCluster.Builder =
        software.amazon.awscdk.services.docdb.DatabaseCluster.Builder.create(scope, id)

    public override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c96b7df7819668cd86079d0487b9e2f82c8b347b3683ead131c1b3fe19811fac")
    public override fun backup(backup: BackupProps.Builder.() -> Unit): Unit =
        backup(BackupProps(backup))

    public override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays::unwrap))
    }

    public override fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole.let(IRole::unwrap))
    }

    public override fun dbClusterName(dbClusterName: String) {
      cdkBuilder.dbClusterName(dbClusterName)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
      cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    public override fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
      cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    public override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    public override fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy) {
      cdkBuilder.instanceRemovalPolicy(instanceRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public override fun masterUser(masterUser: Login) {
      cdkBuilder.masterUser(masterUser.let(Login::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38d2499bd6d916c15f6314c69c7931f6bfc68daf7e26bf4c71c60bda60e8605a")
    public override fun masterUser(masterUser: Login.Builder.() -> Unit): Unit =
        masterUser(Login(masterUser))

    public override fun parameterGroup(parameterGroup: IClusterParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IClusterParameterGroup::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy) {
      cdkBuilder.securityGroupRemovalPolicy(securityGroupRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("091172f9d8b70d03d056ac667cf52b06f2f8d009b9a8a20e165048f3805a713a")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseCluster = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes,
    ): IDatabaseCluster =
        software.amazon.awscdk.services.docdb.DatabaseCluster.fromDatabaseClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DatabaseClusterAttributes::unwrap)).let(IDatabaseCluster::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e421efc8468697cbb6411872efd05956c0ff05aff40cd5e11355e43937395e19")
    public open fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes.Builder.() -> Unit,
    ): IDatabaseCluster = fromDatabaseClusterAttributes(scope, id, DatabaseClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseCluster):
        DatabaseCluster = DatabaseCluster(cdkObject)

    internal fun unwrap(wrapped: DatabaseCluster):
        software.amazon.awscdk.services.docdb.DatabaseCluster = wrapped.cdkObject
  }
}
