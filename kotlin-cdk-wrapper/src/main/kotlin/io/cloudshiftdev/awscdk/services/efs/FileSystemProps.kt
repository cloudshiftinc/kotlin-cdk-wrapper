@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FileSystemProps {
  public fun allowAnonymousAccess(): Boolean? = unwrap(this).getAllowAnonymousAccess()

  public fun enableAutomaticBackups(): Boolean? = unwrap(this).getEnableAutomaticBackups()

  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public fun fileSystemName(): String? = unwrap(this).getFileSystemName()

  public fun fileSystemPolicy(): PolicyDocument? =
      unwrap(this).getFileSystemPolicy()?.let(PolicyDocument::wrap)

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun lifecyclePolicy(): LifecyclePolicy? =
      unwrap(this).getLifecyclePolicy()?.let(LifecyclePolicy::wrap)

  public fun oneZone(): Boolean? = unwrap(this).getOneZone()

  public fun outOfInfrequentAccessPolicy(): OutOfInfrequentAccessPolicy? =
      unwrap(this).getOutOfInfrequentAccessPolicy()?.let(OutOfInfrequentAccessPolicy::wrap)

  public fun performanceMode(): PerformanceMode? =
      unwrap(this).getPerformanceMode()?.let(PerformanceMode::wrap)

  public fun provisionedThroughputPerSecond(): Size? =
      unwrap(this).getProvisionedThroughputPerSecond()?.let(Size::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun replicationOverwriteProtection(): ReplicationOverwriteProtection? =
      unwrap(this).getReplicationOverwriteProtection()?.let(ReplicationOverwriteProtection::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun throughputMode(): ThroughputMode? =
      unwrap(this).getThroughputMode()?.let(ThroughputMode::wrap)

  public fun transitionToArchivePolicy(): LifecyclePolicy? =
      unwrap(this).getTransitionToArchivePolicy()?.let(LifecyclePolicy::wrap)

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowAnonymousAccess(allowAnonymousAccess: Boolean)

    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean)

    public fun encrypted(encrypted: Boolean)

    public fun fileSystemName(fileSystemName: String)

    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93976cc102e8900903625c6fda8700132299e5d1f682b11c2a26251c122eba23")
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit)

    public fun kmsKey(kmsKey: IKey)

    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy)

    public fun oneZone(oneZone: Boolean)

    public fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy)

    public fun performanceMode(performanceMode: PerformanceMode)

    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun throughputMode(throughputMode: ThroughputMode)

    public fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d211c28077ad1f5c00b036bcfd8ffead14d31f158c6088ad691107dfc40c3765")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystemProps.Builder =
        software.amazon.awscdk.services.efs.FileSystemProps.builder()

    override fun allowAnonymousAccess(allowAnonymousAccess: Boolean) {
      cdkBuilder.allowAnonymousAccess(allowAnonymousAccess)
    }

    override fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
      cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun fileSystemName(fileSystemName: String) {
      cdkBuilder.fileSystemName(fileSystemName)
    }

    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93976cc102e8900903625c6fda8700132299e5d1f682b11c2a26251c122eba23")
    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        fileSystemPolicy(PolicyDocument(fileSystemPolicy))

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicy::unwrap))
    }

    override fun oneZone(oneZone: Boolean) {
      cdkBuilder.oneZone(oneZone)
    }

    override
        fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
      cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy.let(OutOfInfrequentAccessPolicy::unwrap))
    }

    override fun performanceMode(performanceMode: PerformanceMode) {
      cdkBuilder.performanceMode(performanceMode.let(PerformanceMode::unwrap))
    }

    override fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
      cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond.let(Size::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection) {
      cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection.let(ReplicationOverwriteProtection::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun throughputMode(throughputMode: ThroughputMode) {
      cdkBuilder.throughputMode(throughputMode.let(ThroughputMode::unwrap))
    }

    override fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy) {
      cdkBuilder.transitionToArchivePolicy(transitionToArchivePolicy.let(LifecyclePolicy::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d211c28077ad1f5c00b036bcfd8ffead14d31f158c6088ad691107dfc40c3765")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.efs.FileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.FileSystemProps,
  ) : CdkObject(cdkObject), FileSystemProps {
    override fun allowAnonymousAccess(): Boolean? = unwrap(this).getAllowAnonymousAccess()

    override fun enableAutomaticBackups(): Boolean? = unwrap(this).getEnableAutomaticBackups()

    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    override fun fileSystemName(): String? = unwrap(this).getFileSystemName()

    override fun fileSystemPolicy(): PolicyDocument? =
        unwrap(this).getFileSystemPolicy()?.let(PolicyDocument::wrap)

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun lifecyclePolicy(): LifecyclePolicy? =
        unwrap(this).getLifecyclePolicy()?.let(LifecyclePolicy::wrap)

    override fun oneZone(): Boolean? = unwrap(this).getOneZone()

    override fun outOfInfrequentAccessPolicy(): OutOfInfrequentAccessPolicy? =
        unwrap(this).getOutOfInfrequentAccessPolicy()?.let(OutOfInfrequentAccessPolicy::wrap)

    override fun performanceMode(): PerformanceMode? =
        unwrap(this).getPerformanceMode()?.let(PerformanceMode::wrap)

    override fun provisionedThroughputPerSecond(): Size? =
        unwrap(this).getProvisionedThroughputPerSecond()?.let(Size::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun replicationOverwriteProtection(): ReplicationOverwriteProtection? =
        unwrap(this).getReplicationOverwriteProtection()?.let(ReplicationOverwriteProtection::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun throughputMode(): ThroughputMode? =
        unwrap(this).getThroughputMode()?.let(ThroughputMode::wrap)

    override fun transitionToArchivePolicy(): LifecyclePolicy? =
        unwrap(this).getTransitionToArchivePolicy()?.let(LifecyclePolicy::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystemProps):
        FileSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemProps):
        software.amazon.awscdk.services.efs.FileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.FileSystemProps
  }
}
