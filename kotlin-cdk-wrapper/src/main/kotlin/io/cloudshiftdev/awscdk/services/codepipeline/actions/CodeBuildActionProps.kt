@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironmentVariable
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CodeBuildActionProps : CommonAwsActionProps {
  public fun checkSecretsInPlainTextEnvVariables(): Boolean? =
      unwrap(this).getCheckSecretsInPlainTextEnvVariables()

  public fun combineBatchBuildArtifacts(): Boolean? = unwrap(this).getCombineBatchBuildArtifacts()

  public fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
      unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)} ?:
      emptyMap()

  public fun executeBatchBuild(): Boolean? = unwrap(this).getExecuteBatchBuild()

  public fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun input(): Artifact

  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun project(): IProject

  public fun type(): CodeBuildActionType? = unwrap(this).getType()?.let(CodeBuildActionType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean)

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    public fun executeBatchBuild(executeBatchBuild: Boolean)

    public fun extraInputs(extraInputs: List<Artifact>)

    public fun extraInputs(vararg extraInputs: Artifact)

    public fun input(input: Artifact)

    public fun outputs(outputs: List<Artifact>)

    public fun outputs(vararg outputs: Artifact)

    public fun project(project: IProject)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun type(type: CodeBuildActionType)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    override fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
      cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    override fun executeBatchBuild(executeBatchBuild: Boolean) {
      cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact::unwrap))
    }

    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    override fun project(project: IProject) {
      cdkBuilder.project(project.let(IProject::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun type(type: CodeBuildActionType) {
      cdkBuilder.type(type.let(CodeBuildActionType::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps,
  ) : CdkObject(cdkObject), CodeBuildActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun checkSecretsInPlainTextEnvVariables(): Boolean? =
        unwrap(this).getCheckSecretsInPlainTextEnvVariables()

    override fun combineBatchBuildArtifacts(): Boolean? =
        unwrap(this).getCombineBatchBuildArtifacts()

    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    override fun executeBatchBuild(): Boolean? = unwrap(this).getExecuteBatchBuild()

    override fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap)
        ?: emptyList()

    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun project(): IProject = unwrap(this).getProject().let(IProject::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun type(): CodeBuildActionType? =
        unwrap(this).getType()?.let(CodeBuildActionType::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps):
        CodeBuildActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
  }
}
