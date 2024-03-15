@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.LifecycleRule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CanaryProps {
  public fun artifactsBucketLifecycleRules(): List<LifecycleRule> =
      unwrap(this).getArtifactsBucketLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  public fun artifactsBucketLocation(): ArtifactsBucketLocation? =
      unwrap(this).getArtifactsBucketLocation()?.let(ArtifactsBucketLocation::wrap)

  public fun canaryName(): String? = unwrap(this).getCanaryName()

  public fun cleanup(): Cleanup? = unwrap(this).getCleanup()?.let(Cleanup::wrap)

  public fun environmentVariables(): Map<String, String> = unwrap(this).getEnvironmentVariables() ?:
      emptyMap()

  public fun failureRetentionPeriod(): Duration? =
      unwrap(this).getFailureRetentionPeriod()?.let(Duration::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun runtime(): Runtime

  public fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun startAfterCreation(): Boolean? = unwrap(this).getStartAfterCreation()

  public fun successRetentionPeriod(): Duration? =
      unwrap(this).getSuccessRetentionPeriod()?.let(Duration::wrap)

  public fun test(): Test

  public fun timeToLive(): Duration? = unwrap(this).getTimeToLive()?.let(Duration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>)

    public fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule)

    public fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99d5fbdde3a8e2c0e8c1d8a8dced4d7d42b93266ffd1c5647e159d53a8fa151c")
    public
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit)

    public fun canaryName(canaryName: String)

    public fun cleanup(cleanup: Cleanup)

    public fun environmentVariables(environmentVariables: Map<String, String>)

    public fun failureRetentionPeriod(failureRetentionPeriod: Duration)

    public fun role(role: IRole)

    public fun runtime(runtime: Runtime)

    public fun schedule(schedule: Schedule)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun startAfterCreation(startAfterCreation: Boolean)

    public fun successRetentionPeriod(successRetentionPeriod: Duration)

    public fun test(test: Test)

    public fun timeToLive(timeToLive: Duration)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5103fac4d1992618bf2bdae41546ad3f07047fcc9cc33f44af40a0a5fd9ac373")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CanaryProps.Builder =
        software.amazon.awscdk.services.synthetics.CanaryProps.builder()

    override fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>) {
      cdkBuilder.artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.map(LifecycleRule::unwrap))
    }

    override fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule):
        Unit = artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.toList())

    override fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
      cdkBuilder.artifactsBucketLocation(artifactsBucketLocation.let(ArtifactsBucketLocation::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99d5fbdde3a8e2c0e8c1d8a8dced4d7d42b93266ffd1c5647e159d53a8fa151c")
    override
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit):
        Unit = artifactsBucketLocation(ArtifactsBucketLocation(artifactsBucketLocation))

    override fun canaryName(canaryName: String) {
      cdkBuilder.canaryName(canaryName)
    }

    override fun cleanup(cleanup: Cleanup) {
      cdkBuilder.cleanup(cleanup.let(Cleanup::unwrap))
    }

    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun failureRetentionPeriod(failureRetentionPeriod: Duration) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime::unwrap))
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun startAfterCreation(startAfterCreation: Boolean) {
      cdkBuilder.startAfterCreation(startAfterCreation)
    }

    override fun successRetentionPeriod(successRetentionPeriod: Duration) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod.let(Duration::unwrap))
    }

    override fun test(test: Test) {
      cdkBuilder.test(test.let(Test::unwrap))
    }

    override fun timeToLive(timeToLive: Duration) {
      cdkBuilder.timeToLive(timeToLive.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5103fac4d1992618bf2bdae41546ad3f07047fcc9cc33f44af40a0a5fd9ac373")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.synthetics.CanaryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.CanaryProps,
  ) : CdkObject(cdkObject), CanaryProps {
    override fun artifactsBucketLifecycleRules(): List<LifecycleRule> =
        unwrap(this).getArtifactsBucketLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    override fun artifactsBucketLocation(): ArtifactsBucketLocation? =
        unwrap(this).getArtifactsBucketLocation()?.let(ArtifactsBucketLocation::wrap)

    override fun canaryName(): String? = unwrap(this).getCanaryName()

    override fun cleanup(): Cleanup? = unwrap(this).getCleanup()?.let(Cleanup::wrap)

    override fun environmentVariables(): Map<String, String> =
        unwrap(this).getEnvironmentVariables() ?: emptyMap()

    override fun failureRetentionPeriod(): Duration? =
        unwrap(this).getFailureRetentionPeriod()?.let(Duration::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runtime(): Runtime = unwrap(this).getRuntime().let(Runtime::wrap)

    override fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun startAfterCreation(): Boolean? = unwrap(this).getStartAfterCreation()

    override fun successRetentionPeriod(): Duration? =
        unwrap(this).getSuccessRetentionPeriod()?.let(Duration::wrap)

    override fun test(): Test = unwrap(this).getTest().let(Test::wrap)

    override fun timeToLive(): Duration? = unwrap(this).getTimeToLive()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CanaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CanaryProps):
        CanaryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CanaryProps):
        software.amazon.awscdk.services.synthetics.CanaryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.synthetics.CanaryProps
  }
}
