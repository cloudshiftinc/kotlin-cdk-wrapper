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

public interface CommonProjectProps {
  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun badge(): Boolean? = unwrap(this).getBadge()

  public fun buildSpec(): BuildSpec? = unwrap(this).getBuildSpec()?.let(BuildSpec::wrap)

  public fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  public fun checkSecretsInPlainTextEnvVariables(): Boolean? =
      unwrap(this).getCheckSecretsInPlainTextEnvVariables()

  public fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

  public fun description(): String? = unwrap(this).getDescription()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun environment(): BuildEnvironment? =
      unwrap(this).getEnvironment()?.let(BuildEnvironment::wrap)

  public fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
      unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)} ?:
      emptyMap()

  public fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  public fun grantReportGroupPermissions(): Boolean? = unwrap(this).getGrantReportGroupPermissions()

  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  public fun projectName(): String? = unwrap(this).getProjectName()

  public fun queuedTimeout(): Duration? = unwrap(this).getQueuedTimeout()?.let(Duration::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun badge(badge: Boolean)

    public fun buildSpec(buildSpec: BuildSpec)

    public fun cache(cache: Cache)

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    public fun description(description: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun environment(environment: BuildEnvironment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd167ca0867fb3d919802ca33c9c74fefff28cc1ac9a8895792815ef2e82d1d3")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    public fun logging(logging: LoggingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("142ea87412b0d7197a94c55a1cb02daeabe68a455e5efa66b0a7a41486b81113")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun projectName(projectName: String)

    public fun queuedTimeout(queuedTimeout: Duration)

    public fun role(role: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bcc465c8ffe3d34c060b8fdddeb68395b5204948f663e45595d4aa633af2cd2")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder =
        software.amazon.awscdk.services.codebuild.CommonProjectProps.builder()

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
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
    @JvmName("dd167ca0867fb3d919802ca33c9c74fefff28cc1ac9a8895792815ef2e82d1d3")
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
    @JvmName("142ea87412b0d7197a94c55a1cb02daeabe68a455e5efa66b0a7a41486b81113")
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

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bcc465c8ffe3d34c060b8fdddeb68395b5204948f663e45595d4aa633af2cd2")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CommonProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CommonProjectProps,
  ) : CdkObject(cdkObject), CommonProjectProps {
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

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

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CommonProjectProps):
        CommonProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonProjectProps):
        software.amazon.awscdk.services.codebuild.CommonProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CommonProjectProps
  }
}
