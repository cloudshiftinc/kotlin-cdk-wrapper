@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codedeploy.IEcsDeploymentGroup
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class CodeDeployEcsDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath)

    public fun appSpecTemplateInput(appSpecTemplateInput: Artifact)

    public fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>)

    public fun containerImageInputs(vararg containerImageInputs: CodeDeployEcsContainerImageInput)

    public fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath)

    public fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath) {
      cdkBuilder.appSpecTemplateFile(appSpecTemplateFile.let(ArtifactPath::unwrap))
    }

    override fun appSpecTemplateInput(appSpecTemplateInput: Artifact) {
      cdkBuilder.appSpecTemplateInput(appSpecTemplateInput.let(Artifact::unwrap))
    }

    override
        fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>) {
      cdkBuilder.containerImageInputs(containerImageInputs.map(CodeDeployEcsContainerImageInput::unwrap))
    }

    override fun containerImageInputs(vararg
        containerImageInputs: CodeDeployEcsContainerImageInput): Unit =
        containerImageInputs(containerImageInputs.toList())

    override fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IEcsDeploymentGroup::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath) {
      cdkBuilder.taskDefinitionTemplateFile(taskDefinitionTemplateFile.let(ArtifactPath::unwrap))
    }

    override fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact) {
      cdkBuilder.taskDefinitionTemplateInput(taskDefinitionTemplateInput.let(Artifact::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployEcsDeployAction {
      val builderImpl = BuilderImpl()
      return CodeDeployEcsDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction):
        CodeDeployEcsDeployAction = CodeDeployEcsDeployAction(cdkObject)

    internal fun unwrap(wrapped: CodeDeployEcsDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction =
        wrapped.cdkObject
  }
}
