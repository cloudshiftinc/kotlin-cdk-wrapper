@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codedeploy.IEcsDeploymentGroup
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CodeDeployEcsDeployActionProps : CommonAwsActionProps {
  public fun appSpecTemplateFile(): ArtifactPath? =
      unwrap(this).getAppSpecTemplateFile()?.let(ArtifactPath::wrap)

  public fun appSpecTemplateInput(): Artifact? =
      unwrap(this).getAppSpecTemplateInput()?.let(Artifact::wrap)

  public fun containerImageInputs(): List<CodeDeployEcsContainerImageInput> =
      unwrap(this).getContainerImageInputs()?.map(CodeDeployEcsContainerImageInput::wrap) ?:
      emptyList()

  public fun deploymentGroup(): IEcsDeploymentGroup

  public fun taskDefinitionTemplateFile(): ArtifactPath? =
      unwrap(this).getTaskDefinitionTemplateFile()?.let(ArtifactPath::wrap)

  public fun taskDefinitionTemplateInput(): Artifact? =
      unwrap(this).getTaskDefinitionTemplateInput()?.let(Artifact::wrap)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps.builder()

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
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps,
  ) : CdkObject(cdkObject), CodeDeployEcsDeployActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun appSpecTemplateFile(): ArtifactPath? =
        unwrap(this).getAppSpecTemplateFile()?.let(ArtifactPath::wrap)

    override fun appSpecTemplateInput(): Artifact? =
        unwrap(this).getAppSpecTemplateInput()?.let(Artifact::wrap)

    override fun containerImageInputs(): List<CodeDeployEcsContainerImageInput> =
        unwrap(this).getContainerImageInputs()?.map(CodeDeployEcsContainerImageInput::wrap) ?:
        emptyList()

    override fun deploymentGroup(): IEcsDeploymentGroup =
        unwrap(this).getDeploymentGroup().let(IEcsDeploymentGroup::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun taskDefinitionTemplateFile(): ArtifactPath? =
        unwrap(this).getTaskDefinitionTemplateFile()?.let(ArtifactPath::wrap)

    override fun taskDefinitionTemplateInput(): Artifact? =
        unwrap(this).getTaskDefinitionTemplateInput()?.let(Artifact::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployEcsDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps):
        CodeDeployEcsDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeDeployEcsDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps
  }
}
