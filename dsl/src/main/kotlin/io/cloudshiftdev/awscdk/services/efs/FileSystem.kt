package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FileSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.efs.FileSystem,
) : Resource(cdkObject), IFileSystem {
  public open fun addAccessPoint(id: String): AccessPoint =
      unwrap(this).addAccessPoint(id).let(AccessPoint::wrap)

  public open fun addAccessPoint(id: String, accessPointOptions: AccessPointOptions): AccessPoint =
      unwrap(this).addAccessPoint(id,
      accessPointOptions.let(AccessPointOptions::unwrap)).let(AccessPoint::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8bd637c6b4ee0728b3d7d7d8ea3fa8a9a24fef6ffbbcae760784373516e05bff")
  public open fun addAccessPoint(id: String,
      accessPointOptions: AccessPointOptions.Builder.() -> Unit): AccessPoint = addAccessPoint(id,
      AccessPointOptions(accessPointOptions))

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun fileSystemArn(): String = unwrap(this).getFileSystemArn()

  public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRootAccess(grantee: IGrantable): Grant =
      unwrap(this).grantRootAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun mountTargetsAvailable(): IDependable =
      unwrap(this).getMountTargetsAvailable().let(IDependable::wrap)

  public interface Builder {
    public fun allowAnonymousAccess(allowAnonymousAccess: Boolean) {
    }

    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
    }

    public fun encrypted(encrypted: Boolean) {
    }

    public fun fileSystemName(fileSystemName: String) {
    }

    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("936124fbdf6b3c84db4a15b4d30374f0293d7e22961a7ba4b09fb74e5493c288")
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit) {
    }

    public fun kmsKey(kmsKey: IKey) {
    }

    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
    }

    public fun oneZone(oneZone: Boolean) {
    }

    public
        fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
    }

    public fun performanceMode(performanceMode: PerformanceMode) {
    }

    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun throughputMode(throughputMode: ThroughputMode) {
    }

    public fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e822441263bb51dd2dcccf879bb057ca24273424f0b9396fbc659cb3cf008239")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystem.Builder =
        software.amazon.awscdk.services.efs.FileSystem.Builder.create(scope, id)

    public override fun allowAnonymousAccess(allowAnonymousAccess: Boolean) {
      cdkBuilder.allowAnonymousAccess(allowAnonymousAccess)
    }

    public override fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
      cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun fileSystemName(fileSystemName: String) {
      cdkBuilder.fileSystemName(fileSystemName)
    }

    public override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("936124fbdf6b3c84db4a15b4d30374f0293d7e22961a7ba4b09fb74e5493c288")
    public override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit): Unit
        = fileSystemPolicy(PolicyDocument(fileSystemPolicy))

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicy::unwrap))
    }

    public override fun oneZone(oneZone: Boolean) {
      cdkBuilder.oneZone(oneZone)
    }

    public override
        fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
      cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy.let(OutOfInfrequentAccessPolicy::unwrap))
    }

    public override fun performanceMode(performanceMode: PerformanceMode) {
      cdkBuilder.performanceMode(performanceMode.let(PerformanceMode::unwrap))
    }

    public override fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
      cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond.let(Size::unwrap))
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection) {
      cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection.let(ReplicationOverwriteProtection::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun throughputMode(throughputMode: ThroughputMode) {
      cdkBuilder.throughputMode(throughputMode.let(ThroughputMode::unwrap))
    }

    public override fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy) {
      cdkBuilder.transitionToArchivePolicy(transitionToArchivePolicy.let(LifecyclePolicy::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e822441263bb51dd2dcccf879bb057ca24273424f0b9396fbc659cb3cf008239")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.efs.FileSystem = cdkBuilder.build()
  }

  public companion object {
    public open fun fromFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes,
    ): IFileSystem =
        software.amazon.awscdk.services.efs.FileSystem.fromFileSystemAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FileSystemAttributes::unwrap)).let(IFileSystem::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67c7f8559a1a02511e0302ffd8ca4a5cf064c784eb6e462c6fc3b5500a867d2b")
    public open fun fromFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes.Builder.() -> Unit,
    ): IFileSystem = fromFileSystemAttributes(scope, id, FileSystemAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.services.efs.FileSystem =
        wrapped.cdkObject
  }
}
