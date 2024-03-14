package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CodeBuildOptions {
  public fun buildEnvironment(): BuildEnvironment? =
      unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

  public fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  public fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  public fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  public fun rolePolicy(): List<PolicyStatement> =
      unwrap(this).getRolePolicy()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3a687835e189ee4baf969e19076ab9c8a363a995aff69ee6b510acfa79550f")
    public fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit)

    public fun cache(cache: Cache)

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    public fun logging(logging: LoggingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf37ca978f283cd317c366abfcbaf5875e30b98b3c196f6850c5c027dad7835")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun partialBuildSpec(partialBuildSpec: BuildSpec)

    public fun rolePolicy(rolePolicy: List<PolicyStatement>)

    public fun rolePolicy(vararg rolePolicy: PolicyStatement)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50f1a4ecf72ee950cf9d0486b74ebba1ab84ef9bd51b98513c980a1559646d1e")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildOptions.Builder =
        software.amazon.awscdk.pipelines.CodeBuildOptions.builder()

    override fun buildEnvironment(buildEnvironment: BuildEnvironment) {
      cdkBuilder.buildEnvironment(buildEnvironment.let(BuildEnvironment::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3a687835e189ee4baf969e19076ab9c8a363a995aff69ee6b510acfa79550f")
    override fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit): Unit =
        buildEnvironment(BuildEnvironment(buildEnvironment))

    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf37ca978f283cd317c366abfcbaf5875e30b98b3c196f6850c5c027dad7835")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    override fun partialBuildSpec(partialBuildSpec: BuildSpec) {
      cdkBuilder.partialBuildSpec(partialBuildSpec.let(BuildSpec::unwrap))
    }

    override fun rolePolicy(rolePolicy: List<PolicyStatement>) {
      cdkBuilder.rolePolicy(rolePolicy.map(PolicyStatement::unwrap))
    }

    override fun rolePolicy(vararg rolePolicy: PolicyStatement): Unit =
        rolePolicy(rolePolicy.toList())

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50f1a4ecf72ee950cf9d0486b74ebba1ab84ef9bd51b98513c980a1559646d1e")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.CodeBuildOptions,
  ) : CodeBuildOptions {
    override fun buildEnvironment(): BuildEnvironment? =
        unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

    override fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

    override fun fileSystemLocations(): List<IFileSystemLocation> =
        unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    override fun partialBuildSpec(): BuildSpec? =
        unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

    override fun rolePolicy(): List<PolicyStatement> =
        unwrap(this).getRolePolicy()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildOptions):
        CodeBuildOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildOptions):
        software.amazon.awscdk.pipelines.CodeBuildOptions = (wrapped as Wrapper).cdkObject
  }
}
