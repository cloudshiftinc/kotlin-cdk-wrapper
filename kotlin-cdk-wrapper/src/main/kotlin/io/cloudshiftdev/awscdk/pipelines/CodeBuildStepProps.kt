@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CodeBuildStepProps : ShellStepProps {
  public fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

  public fun buildEnvironment(): BuildEnvironment? =
      unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

  public fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  public fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  public fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  public fun projectName(): String? = unwrap(this).getProjectName()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun rolePolicyStatements(): List<PolicyStatement> =
      unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionRole(actionRole: IRole)

    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>)

    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab0bc8946f8962db6ca93a3377a2473cff40c858669e5401c298f80d6854708")
    public fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit)

    public fun cache(cache: Cache)

    public fun commands(commands: List<String>)

    public fun commands(vararg commands: String)

    public fun env(env: Map<String, String>)

    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>)

    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    public fun input(input: IFileSetProducer)

    public fun installCommands(installCommands: List<String>)

    public fun installCommands(vararg installCommands: String)

    public fun logging(logging: LoggingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41954556a8cd82c8a417434af88b924a19b2ed8ebaf0034f76971265b80f0921")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun partialBuildSpec(partialBuildSpec: BuildSpec)

    public fun primaryOutputDirectory(primaryOutputDirectory: String)

    public fun projectName(projectName: String)

    public fun role(role: IRole)

    public fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>)

    public fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62a5f5cf2942613e54caa1dfc89729f0a1b72d13a4be194b60599868108386f4")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildStepProps.Builder =
        software.amazon.awscdk.pipelines.CodeBuildStepProps.builder()

    override fun actionRole(actionRole: IRole) {
      cdkBuilder.actionRole(actionRole.let(IRole::unwrap))
    }

    override fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
      cdkBuilder.additionalInputs(additionalInputs.mapValues{IFileSetProducer.unwrap(it.value)})
    }

    override fun buildEnvironment(buildEnvironment: BuildEnvironment) {
      cdkBuilder.buildEnvironment(buildEnvironment.let(BuildEnvironment::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab0bc8946f8962db6ca93a3377a2473cff40c858669e5401c298f80d6854708")
    override fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit): Unit =
        buildEnvironment(BuildEnvironment(buildEnvironment))

    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    override fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
      cdkBuilder.envFromCfnOutputs(envFromCfnOutputs.mapValues{CfnOutput.unwrap(it.value)})
    }

    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    override fun input(input: IFileSetProducer) {
      cdkBuilder.input(input.let(IFileSetProducer::unwrap))
    }

    override fun installCommands(installCommands: List<String>) {
      cdkBuilder.installCommands(installCommands)
    }

    override fun installCommands(vararg installCommands: String): Unit =
        installCommands(installCommands.toList())

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41954556a8cd82c8a417434af88b924a19b2ed8ebaf0034f76971265b80f0921")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    override fun partialBuildSpec(partialBuildSpec: BuildSpec) {
      cdkBuilder.partialBuildSpec(partialBuildSpec.let(BuildSpec::unwrap))
    }

    override fun primaryOutputDirectory(primaryOutputDirectory: String) {
      cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>) {
      cdkBuilder.rolePolicyStatements(rolePolicyStatements.map(PolicyStatement::unwrap))
    }

    override fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement): Unit =
        rolePolicyStatements(rolePolicyStatements.toList())

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62a5f5cf2942613e54caa1dfc89729f0a1b72d13a4be194b60599868108386f4")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodeBuildStepProps,
  ) : CdkObject(cdkObject), CodeBuildStepProps {
    override fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

    override fun additionalInputs(): Map<String, IFileSetProducer> =
        unwrap(this).getAdditionalInputs()?.mapValues{IFileSetProducer.wrap(it.value)} ?: emptyMap()

    override fun buildEnvironment(): BuildEnvironment? =
        unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

    override fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

    override fun commands(): List<String> = unwrap(this).getCommands()

    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    override fun envFromCfnOutputs(): Map<String, CfnOutput> =
        unwrap(this).getEnvFromCfnOutputs()?.mapValues{CfnOutput.wrap(it.value)} ?: emptyMap()

    override fun fileSystemLocations(): List<IFileSystemLocation> =
        unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

    override fun input(): IFileSetProducer? = unwrap(this).getInput()?.let(IFileSetProducer::wrap)

    override fun installCommands(): List<String> = unwrap(this).getInstallCommands() ?: emptyList()

    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    override fun partialBuildSpec(): BuildSpec? =
        unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

    override fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()

    override fun projectName(): String? = unwrap(this).getProjectName()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun rolePolicyStatements(): List<PolicyStatement> =
        unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildStepProps):
        CodeBuildStepProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildStepProps):
        software.amazon.awscdk.pipelines.CodeBuildStepProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodeBuildStepProps
  }
}
