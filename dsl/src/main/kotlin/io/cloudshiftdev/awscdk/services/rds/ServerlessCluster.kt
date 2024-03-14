package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ServerlessCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.ServerlessCluster,
) : Resource(cdkObject), IServerlessCluster {
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

  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun grantDataApiAccess(grantee: IGrantable): Grant =
      unwrap(this).grantDataApiAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public interface Builder {
    public fun backupRetention(backupRetention: Duration)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun credentials(credentials: Credentials)

    public fun defaultDatabaseName(defaultDatabaseName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun enableDataApi(enableDataApi: Boolean)

    public fun engine(engine: IClusterEngine)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun scaling(scaling: ServerlessScalingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a66ab5fc033d6677cef9a477412efff77d3611251692c8175fd34d74994a3deb")
    public fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    public fun subnetGroup(subnetGroup: ISubnetGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19fcc17e7f52f281daf909cf4668087718b2ad26f91bed9271ca5de1cbc15679")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ServerlessCluster.Builder =
        software.amazon.awscdk.services.rds.ServerlessCluster.Builder.create(scope, id)

    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
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

    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun scaling(scaling: ServerlessScalingOptions) {
      cdkBuilder.scaling(scaling.let(ServerlessScalingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a66ab5fc033d6677cef9a477412efff77d3611251692c8175fd34d74994a3deb")
    override fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit): Unit =
        scaling(ServerlessScalingOptions(scaling))

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
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
    @JvmName("19fcc17e7f52f281daf909cf4668087718b2ad26f91bed9271ca5de1cbc15679")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.ServerlessCluster = cdkBuilder.build()
  }

  public companion object {
    public open fun fromServerlessClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerlessClusterAttributes,
    ): IServerlessCluster =
        software.amazon.awscdk.services.rds.ServerlessCluster.fromServerlessClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ServerlessClusterAttributes::unwrap)).let(IServerlessCluster::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ad4c7ad78796d5cee14bd7dd4458c72f8f8535fcd3845598fc5ea0c2c77997f")
    public open fun fromServerlessClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerlessClusterAttributes.Builder.() -> Unit,
    ): IServerlessCluster = fromServerlessClusterAttributes(scope, id,
        ServerlessClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerlessCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerlessCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessCluster):
        ServerlessCluster = ServerlessCluster(cdkObject)

    internal fun unwrap(wrapped: ServerlessCluster):
        software.amazon.awscdk.services.rds.ServerlessCluster = wrapped.cdkObject
  }
}
