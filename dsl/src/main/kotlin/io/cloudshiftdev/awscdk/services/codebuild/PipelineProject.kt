package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
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

public open class PipelineProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.PipelineProject,
) : Project(cdkObject) {
  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
    }

    public fun badge(badge: Boolean) {
    }

    public fun buildSpec(buildSpec: BuildSpec) {
    }

    public fun cache(cache: Cache) {
    }

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
    }

    public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
    }

    public fun description(description: String) {
    }

    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun environment(environment: BuildEnvironment) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7474f03d8d0e66e9d0888cdd304f6516d0f2e5c326e1fd2c816fad257beebff0")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit) {
    }

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
    }

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
    }

    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
    }

    public fun logging(logging: LoggingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23e8421fc4efe1461494eb20fca09d7f5e0508fd5b74d08bd89d47a55902e77")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit) {
    }

    public fun projectName(projectName: String) {
    }

    public fun queuedTimeout(queuedTimeout: Duration) {
    }

    public fun role(role: IRole) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e466e93389d2f364b845979504e328ef45b4c63c4bae083538aaaa8fa23a4947")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.PipelineProject.Builder =
        software.amazon.awscdk.services.codebuild.PipelineProject.Builder.create(scope, id)

    public override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public override fun badge(badge: Boolean) {
      cdkBuilder.badge(badge)
    }

    public override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec::unwrap))
    }

    public override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    public override
        fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    public override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7474f03d8d0e66e9d0888cdd304f6516d0f2e5c326e1fd2c816fad257beebff0")
    public override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    public override
        fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues {
          BuildEnvironmentVariable.unwrap(it.value)})
    }

    public override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    public override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
      cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    public override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23e8421fc4efe1461494eb20fca09d7f5e0508fd5b74d08bd89d47a55902e77")
    public override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    public override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration::unwrap))
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    public override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e466e93389d2f364b845979504e328ef45b4c63c4bae083538aaaa8fa23a4947")
    public override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.PipelineProject =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PipelineProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PipelineProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.PipelineProject):
        PipelineProject = PipelineProject(cdkObject)

    internal fun unwrap(wrapped: PipelineProject):
        software.amazon.awscdk.services.codebuild.PipelineProject = wrapped.cdkObject
  }
}
