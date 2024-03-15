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

/**
 * Construction properties of the `CodeDeployEcsDeployAction CodeDeploy ECS deploy CodePipeline
 * Action`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Artifact artifact;
 * ArtifactPath artifactPath;
 * EcsDeploymentGroup ecsDeploymentGroup;
 * Role role;
 * CodeDeployEcsDeployActionProps codeDeployEcsDeployActionProps =
 * CodeDeployEcsDeployActionProps.builder()
 * .actionName("actionName")
 * .deploymentGroup(ecsDeploymentGroup)
 * // the properties below are optional
 * .appSpecTemplateFile(artifactPath)
 * .appSpecTemplateInput(artifact)
 * .containerImageInputs(List.of(CodeDeployEcsContainerImageInput.builder()
 * .input(artifact)
 * // the properties below are optional
 * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
 * .build()))
 * .role(role)
 * .runOrder(123)
 * .taskDefinitionTemplateFile(artifactPath)
 * .taskDefinitionTemplateInput(artifact)
 * .variablesNamespace("variablesNamespace")
 * .build();
 * ```
 */
public interface CodeDeployEcsDeployActionProps : CommonAwsActionProps {
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
   */
  public fun appSpecTemplateFile(): ArtifactPath? =
      unwrap(this).getAppSpecTemplateFile()?.let(ArtifactPath::wrap)

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
   */
  public fun appSpecTemplateInput(): Artifact? =
      unwrap(this).getAppSpecTemplateInput()?.let(Artifact::wrap)

  /**
   * Configuration for dynamically updated images in the task definition.
   *
   * Provide pairs of an image details input artifact and a placeholder string
   * that will be used to dynamically update the ECS task definition template
   * file prior to deployment. A maximum of 4 images can be given.
   */
  public fun containerImageInputs(): List<CodeDeployEcsContainerImageInput> =
      unwrap(this).getContainerImageInputs()?.map(CodeDeployEcsContainerImageInput::wrap) ?:
      emptyList()

  /**
   * The CodeDeploy ECS Deployment Group to deploy to.
   */
  public fun deploymentGroup(): IEcsDeploymentGroup

  /**
   * The name of the ECS task definition template file.
   *
   * During deployment, the task definition template file contents
   * will be registered with ECS.
   *
   * Use this property if you want to use a different name for this file than the default
   * 'taskdef.json'.
   * If you use this property, you don't need to specify the `taskDefinitionTemplateInput` property.
   *
   * Default: - one of this property, or `taskDefinitionTemplateInput`, is required
   */
  public fun taskDefinitionTemplateFile(): ArtifactPath? =
      unwrap(this).getTaskDefinitionTemplateFile()?.let(ArtifactPath::wrap)

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
   */
  public fun taskDefinitionTemplateInput(): Artifact? =
      unwrap(this).getTaskDefinitionTemplateInput()?.let(Artifact::wrap)

  /**
   * A builder for [CodeDeployEcsDeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param appSpecTemplateFile The name of the CodeDeploy AppSpec file.
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'appspec.yaml'.
     * If you use this property, you don't need to specify the `appSpecTemplateInput` property.
     */
    public fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath)

    /**
     * @param appSpecTemplateInput The artifact containing the CodeDeploy AppSpec file.
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * If you use this property, it's assumed the file is called 'appspec.yaml'.
     * If your AppSpec file uses a different filename, leave this property empty,
     * and use the `appSpecTemplateFile` property instead.
     */
    public fun appSpecTemplateInput(appSpecTemplateInput: Artifact)

    /**
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition.
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     */
    public fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>)

    /**
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition.
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     */
    public fun containerImageInputs(vararg containerImageInputs: CodeDeployEcsContainerImageInput)

    /**
     * @param deploymentGroup The CodeDeploy ECS Deployment Group to deploy to. 
     */
    public fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param taskDefinitionTemplateFile The name of the ECS task definition template file.
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'taskdef.json'.
     * If you use this property, you don't need to specify the `taskDefinitionTemplateInput`
     * property.
     */
    public fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath)

    /**
     * @param taskDefinitionTemplateInput The artifact containing the ECS task definition template
     * file.
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * If you use this property, it's assumed the file is called 'taskdef.json'.
     * If your task definition template uses a different filename, leave this property empty,
     * and use the `taskDefinitionTemplateFile` property instead.
     */
    public fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param appSpecTemplateFile The name of the CodeDeploy AppSpec file.
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'appspec.yaml'.
     * If you use this property, you don't need to specify the `appSpecTemplateInput` property.
     */
    override fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath) {
      cdkBuilder.appSpecTemplateFile(appSpecTemplateFile.let(ArtifactPath::unwrap))
    }

    /**
     * @param appSpecTemplateInput The artifact containing the CodeDeploy AppSpec file.
     * During deployment, a new task definition will be registered
     * with ECS, and the new task definition ID will be inserted into
     * the CodeDeploy AppSpec file.  The AppSpec file contents will be
     * provided to CodeDeploy for the deployment.
     *
     * If you use this property, it's assumed the file is called 'appspec.yaml'.
     * If your AppSpec file uses a different filename, leave this property empty,
     * and use the `appSpecTemplateFile` property instead.
     */
    override fun appSpecTemplateInput(appSpecTemplateInput: Artifact) {
      cdkBuilder.appSpecTemplateInput(appSpecTemplateInput.let(Artifact::unwrap))
    }

    /**
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition.
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     */
    override
        fun containerImageInputs(containerImageInputs: List<CodeDeployEcsContainerImageInput>) {
      cdkBuilder.containerImageInputs(containerImageInputs.map(CodeDeployEcsContainerImageInput::unwrap))
    }

    /**
     * @param containerImageInputs Configuration for dynamically updated images in the task
     * definition.
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     */
    override fun containerImageInputs(vararg
        containerImageInputs: CodeDeployEcsContainerImageInput): Unit =
        containerImageInputs(containerImageInputs.toList())

    /**
     * @param deploymentGroup The CodeDeploy ECS Deployment Group to deploy to. 
     */
    override fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IEcsDeploymentGroup::unwrap))
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param taskDefinitionTemplateFile The name of the ECS task definition template file.
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * Use this property if you want to use a different name for this file than the default
     * 'taskdef.json'.
     * If you use this property, you don't need to specify the `taskDefinitionTemplateInput`
     * property.
     */
    override fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath) {
      cdkBuilder.taskDefinitionTemplateFile(taskDefinitionTemplateFile.let(ArtifactPath::unwrap))
    }

    /**
     * @param taskDefinitionTemplateInput The artifact containing the ECS task definition template
     * file.
     * During deployment, the task definition template file contents
     * will be registered with ECS.
     *
     * If you use this property, it's assumed the file is called 'taskdef.json'.
     * If your task definition template uses a different filename, leave this property empty,
     * and use the `taskDefinitionTemplateFile` property instead.
     */
    override fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact) {
      cdkBuilder.taskDefinitionTemplateInput(taskDefinitionTemplateInput.let(Artifact::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
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
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

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
     */
    override fun appSpecTemplateFile(): ArtifactPath? =
        unwrap(this).getAppSpecTemplateFile()?.let(ArtifactPath::wrap)

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
     */
    override fun appSpecTemplateInput(): Artifact? =
        unwrap(this).getAppSpecTemplateInput()?.let(Artifact::wrap)

    /**
     * Configuration for dynamically updated images in the task definition.
     *
     * Provide pairs of an image details input artifact and a placeholder string
     * that will be used to dynamically update the ECS task definition template
     * file prior to deployment. A maximum of 4 images can be given.
     */
    override fun containerImageInputs(): List<CodeDeployEcsContainerImageInput> =
        unwrap(this).getContainerImageInputs()?.map(CodeDeployEcsContainerImageInput::wrap) ?:
        emptyList()

    /**
     * The CodeDeploy ECS Deployment Group to deploy to.
     */
    override fun deploymentGroup(): IEcsDeploymentGroup =
        unwrap(this).getDeploymentGroup().let(IEcsDeploymentGroup::wrap)

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

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
     */
    override fun taskDefinitionTemplateFile(): ArtifactPath? =
        unwrap(this).getTaskDefinitionTemplateFile()?.let(ArtifactPath::wrap)

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
     */
    override fun taskDefinitionTemplateInput(): Artifact? =
        unwrap(this).getTaskDefinitionTemplateInput()?.let(Artifact::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
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
