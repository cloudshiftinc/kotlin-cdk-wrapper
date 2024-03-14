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
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The name of the CodeDeploy AppSpec file.
     *
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'appspec.yaml'.
     * If you use this property, you don't need to specify the `appSpecTemplateInput` property.
     *
     * Default: - one of this property, or `appSpecTemplateInput`, is required
     *
     * @param appSpecTemplateFile The name of the CodeDeploy AppSpec file. 
     */
    public fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath)

    /**
     * The artifact containing the CodeDeploy AppSpec file.
     *
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * If you use this property, it's assumed the file is called 'appspec.yaml'.
     * If your AppSpec file uses a different filename, leave this property empty,
     * and use the `appSpecTemplateFile` property instead.
     *
     * Default: - one of this property, or `appSpecTemplateFile`, is required
     *
     * @param appSpecTemplateInput The artifact containing the CodeDeploy AppSpec file. 
     */
    public fun appSpecTemplateInput(appSpecTemplateInput: Artifact)

    /**
     * Configuration for dynamically updated images in the task definition.
     *
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     *
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition. 
     */
    public fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>)

    /**
     * Configuration for dynamically updated images in the task definition.
     *
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     *
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition. 
     */
    public fun containerImageInputs(vararg containerImageInputs: CodeDeployEcsContainerImageInput)

    /**
     * The CodeDeploy ECS Deployment Group to deploy to.
     *
     * @param deploymentGroup The CodeDeploy ECS Deployment Group to deploy to. 
     */
    public fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The name of the ECS task definition template file.
     *
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'taskdef.json'.
     * If you use this property, you don't need to specify the `taskDefinitionTemplateInput`
     * property.
     *
     * Default: - one of this property, or `taskDefinitionTemplateInput`, is required
     *
     * @param taskDefinitionTemplateFile The name of the ECS task definition template file. 
     */
    public fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath)

    /**
     * The artifact containing the ECS task definition template file.
     *
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * If you use this property, it's assumed the file is called 'taskdef.json'.
     * If your task definition template uses a different filename, leave this property empty,
     * and use the `taskDefinitionTemplateFile` property instead.
     *
     * Default: - one of this property, or `taskDefinitionTemplateFile`, is required
     *
     * @param taskDefinitionTemplateInput The artifact containing the ECS task definition template
     * file. 
     */
    public fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The name of the CodeDeploy AppSpec file.
     *
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'appspec.yaml'.
     * If you use this property, you don't need to specify the `appSpecTemplateInput` property.
     *
     * Default: - one of this property, or `appSpecTemplateInput`, is required
     *
     * @param appSpecTemplateFile The name of the CodeDeploy AppSpec file. 
     */
    override fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath) {
      cdkBuilder.appSpecTemplateFile(appSpecTemplateFile.let(ArtifactPath::unwrap))
    }

    /**
     * The artifact containing the CodeDeploy AppSpec file.
     *
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * If you use this property, it's assumed the file is called 'appspec.yaml'.
     * If your AppSpec file uses a different filename, leave this property empty,
     * and use the `appSpecTemplateFile` property instead.
     *
     * Default: - one of this property, or `appSpecTemplateFile`, is required
     *
     * @param appSpecTemplateInput The artifact containing the CodeDeploy AppSpec file. 
     */
    override fun appSpecTemplateInput(appSpecTemplateInput: Artifact) {
      cdkBuilder.appSpecTemplateInput(appSpecTemplateInput.let(Artifact::unwrap))
    }

    /**
     * Configuration for dynamically updated images in the task definition.
     *
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     *
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition. 
     */
    override
        fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>) {
      cdkBuilder.containerImageInputs(containerImageInputs.map(CodeDeployEcsContainerImageInput::unwrap))
    }

    /**
     * Configuration for dynamically updated images in the task definition.
     *
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     *
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition. 
     */
    override fun containerImageInputs(vararg
        containerImageInputs: CodeDeployEcsContainerImageInput): Unit =
        containerImageInputs(containerImageInputs.toList())

    /**
     * The CodeDeploy ECS Deployment Group to deploy to.
     *
     * @param deploymentGroup The CodeDeploy ECS Deployment Group to deploy to. 
     */
    override fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IEcsDeploymentGroup::unwrap))
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the ECS task definition template file.
     *
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'taskdef.json'.
     * If you use this property, you don't need to specify the `taskDefinitionTemplateInput`
     * property.
     *
     * Default: - one of this property, or `taskDefinitionTemplateInput`, is required
     *
     * @param taskDefinitionTemplateFile The name of the ECS task definition template file. 
     */
    override fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath) {
      cdkBuilder.taskDefinitionTemplateFile(taskDefinitionTemplateFile.let(ArtifactPath::unwrap))
    }

    /**
     * The artifact containing the ECS task definition template file.
     *
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * If you use this property, it's assumed the file is called 'taskdef.json'.
     * If your task definition template uses a different filename, leave this property empty,
     * and use the `taskDefinitionTemplateFile` property instead.
     *
     * Default: - one of this property, or `taskDefinitionTemplateFile`, is required
     *
     * @param taskDefinitionTemplateInput The artifact containing the ECS task definition template
     * file. 
     */
    override fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact) {
      cdkBuilder.taskDefinitionTemplateInput(taskDefinitionTemplateInput.let(Artifact::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
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
