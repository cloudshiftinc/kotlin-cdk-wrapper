@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class CodeBuildStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.CodeBuildStep,
) : ShellStep(cdkObject) {
  public open fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

  public open fun buildEnvironment(): BuildEnvironment? =
      unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

  public open fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  public open fun exportedVariable(variableName: String): String =
      unwrap(this).exportedVariable(variableName)

  public open fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  public open fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  public open fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  public open fun project(): IProject = unwrap(this).getProject().let(IProject::wrap)

  public open fun projectName(): String? = unwrap(this).getProjectName()

  public open fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public open fun rolePolicyStatements(): List<PolicyStatement> =
      unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public open fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public open fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public open fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionRole(actionRole: IRole)

    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>)

    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c0d67460631db6a1464a7c950694a77c581cc60122a8dc6698190fbec405f7d")
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
    @JvmName("55a8e91d26460c44da1b5d5d0e5128a4868ac5ee7351cfe875fe325980a418ae")
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
    @JvmName("3506bdd5b6d2e846b2e33c681a8e1834c3b5cf5de2a960683ed2d370be406b50")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildStep.Builder =
        software.amazon.awscdk.pipelines.CodeBuildStep.Builder.create(id)

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
    @JvmName("0c0d67460631db6a1464a7c950694a77c581cc60122a8dc6698190fbec405f7d")
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
    @JvmName("55a8e91d26460c44da1b5d5d0e5128a4868ac5ee7351cfe875fe325980a418ae")
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
    @JvmName("3506bdd5b6d2e846b2e33c681a8e1834c3b5cf5de2a960683ed2d370be406b50")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildStep = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): CodeBuildStep {
      val builderImpl = BuilderImpl(id)
      return CodeBuildStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildStep): CodeBuildStep =
        CodeBuildStep(cdkObject)

    internal fun unwrap(wrapped: CodeBuildStep): software.amazon.awscdk.pipelines.CodeBuildStep =
        wrapped.cdkObject
  }
}
