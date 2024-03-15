@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ProjectProps : CommonProjectProps {
  public fun artifacts(): IArtifacts? = unwrap(this).getArtifacts()?.let(IArtifacts::wrap)

  public fun secondaryArtifacts(): List<IArtifacts> =
      unwrap(this).getSecondaryArtifacts()?.map(IArtifacts::wrap) ?: emptyList()

  public fun secondarySources(): List<ISource> =
      unwrap(this).getSecondarySources()?.map(ISource::wrap) ?: emptyList()

  public fun source(): ISource? = unwrap(this).getSource()?.let(ISource::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun artifacts(artifacts: IArtifacts)

    public fun badge(badge: Boolean)

    public fun buildSpec(buildSpec: BuildSpec)

    public fun cache(cache: Cache)

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    public fun description(description: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun environment(environment: BuildEnvironment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a92d88dad6fc895330e88a80c92a48cc25b747da098b0d2edf713cede7e48d28")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    public fun logging(logging: LoggingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75f8c5bd11adc0382c4d668d9b5923dfc4d3bce34882e83939abc501656aef0f")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun projectName(projectName: String)

    public fun queuedTimeout(queuedTimeout: Duration)

    public fun role(role: IRole)

    public fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>)

    public fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts)

    public fun secondarySources(secondarySources: List<ISource>)

    public fun secondarySources(vararg secondarySources: ISource)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun source(source: ISource)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("729a158e79542c8ca4bc47120ed4ecc54de7b03733994ca86081f4c0863abc15")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ProjectProps.Builder =
        software.amazon.awscdk.services.codebuild.ProjectProps.builder()

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun artifacts(artifacts: IArtifacts) {
      cdkBuilder.artifacts(artifacts.let(IArtifacts::unwrap))
    }

    override fun badge(badge: Boolean) {
      cdkBuilder.badge(badge)
    }

    override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec::unwrap))
    }

    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a92d88dad6fc895330e88a80c92a48cc25b747da098b0d2edf713cede7e48d28")
    override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
      cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75f8c5bd11adc0382c4d668d9b5923dfc4d3bce34882e83939abc501656aef0f")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun secondaryArtifacts(secondaryArtifacts: List<IArtifacts>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.map(IArtifacts::unwrap))
    }

    override fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    override fun secondarySources(secondarySources: List<ISource>) {
      cdkBuilder.secondarySources(secondarySources.map(ISource::unwrap))
    }

    override fun secondarySources(vararg secondarySources: ISource): Unit =
        secondarySources(secondarySources.toList())

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun source(source: ISource) {
      cdkBuilder.source(source.let(ISource::unwrap))
    }

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("729a158e79542c8ca4bc47120ed4ecc54de7b03733994ca86081f4c0863abc15")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ProjectProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ProjectProps,
  ) : CdkObject(cdkObject), ProjectProps {
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun artifacts(): IArtifacts? = unwrap(this).getArtifacts()?.let(IArtifacts::wrap)

    override fun badge(): Boolean? = unwrap(this).getBadge()

    override fun buildSpec(): BuildSpec? = unwrap(this).getBuildSpec()?.let(BuildSpec::wrap)

    override fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

    override fun checkSecretsInPlainTextEnvVariables(): Boolean? =
        unwrap(this).getCheckSecretsInPlainTextEnvVariables()

    override fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

    override fun description(): String? = unwrap(this).getDescription()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun environment(): BuildEnvironment? =
        unwrap(this).getEnvironment()?.let(BuildEnvironment::wrap)

    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    override fun fileSystemLocations(): List<IFileSystemLocation> =
        unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

    override fun grantReportGroupPermissions(): Boolean? =
        unwrap(this).getGrantReportGroupPermissions()

    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    override fun projectName(): String? = unwrap(this).getProjectName()

    override fun queuedTimeout(): Duration? = unwrap(this).getQueuedTimeout()?.let(Duration::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun secondaryArtifacts(): List<IArtifacts> =
        unwrap(this).getSecondaryArtifacts()?.map(IArtifacts::wrap) ?: emptyList()

    override fun secondarySources(): List<ISource> =
        unwrap(this).getSecondarySources()?.map(ISource::wrap) ?: emptyList()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun source(): ISource? = unwrap(this).getSource()?.let(ISource::wrap)

    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ProjectProps):
        ProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProjectProps):
        software.amazon.awscdk.services.codebuild.ProjectProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.ProjectProps
  }
}
