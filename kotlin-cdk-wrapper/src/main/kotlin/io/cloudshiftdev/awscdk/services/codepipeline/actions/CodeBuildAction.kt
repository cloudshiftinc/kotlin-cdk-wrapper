@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironmentVariable
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class CodeBuildAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction,
) : Action(cdkObject) {
  public open fun variable(variableName: String): String = unwrap(this).variable(variableName)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildAction {
      val builderImpl = BuilderImpl()
      return CodeBuildAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction):
        CodeBuildAction = CodeBuildAction(cdkObject)

    internal fun unwrap(wrapped: CodeBuildAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction = wrapped.cdkObject
  }
}
