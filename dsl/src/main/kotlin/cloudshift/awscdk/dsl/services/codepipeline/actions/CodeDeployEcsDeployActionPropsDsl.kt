@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties of the `CodeDeployEcsDeployAction CodeDeploy ECS deploy CodePipeline
 * Action`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class CodeDeployEcsDeployActionPropsDsl {
  private val cdkBuilder: CodeDeployEcsDeployActionProps.Builder =
      CodeDeployEcsDeployActionProps.builder()

  private val _containerImageInputs: MutableList<CodeDeployEcsContainerImageInput> = mutableListOf()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
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
  public fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath) {
    cdkBuilder.appSpecTemplateFile(appSpecTemplateFile)
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
  public fun appSpecTemplateInput(appSpecTemplateInput: Artifact) {
    cdkBuilder.appSpecTemplateInput(appSpecTemplateInput)
  }

  /**
   * @param containerImageInputs Configuration for dynamically updated images in the task
   * definition.
   * Provide pairs of an image details input artifact and a placeholder string
   * that will be used to dynamically update the ECS task definition template
   * file prior to deployment. A maximum of 4 images can be given.
   */
  public
      fun containerImageInputs(containerImageInputs: CodeDeployEcsContainerImageInputDsl.() -> Unit) {
    _containerImageInputs.add(CodeDeployEcsContainerImageInputDsl().apply(containerImageInputs).build())
  }

  /**
   * @param containerImageInputs Configuration for dynamically updated images in the task
   * definition.
   * Provide pairs of an image details input artifact and a placeholder string
   * that will be used to dynamically update the ECS task definition template
   * file prior to deployment. A maximum of 4 images can be given.
   */
  public
      fun containerImageInputs(containerImageInputs: Collection<CodeDeployEcsContainerImageInput>) {
    _containerImageInputs.addAll(containerImageInputs)
  }

  /**
   * @param deploymentGroup The CodeDeploy ECS Deployment Group to deploy to. 
   */
  public fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup) {
    cdkBuilder.deploymentGroup(deploymentGroup)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param taskDefinitionTemplateFile The name of the ECS task definition template file.
   * During deployment, the task definition template file contents
   * will be registered with ECS.
   *
   * Use this property if you want to use a different name for this file than the default
   * 'taskdef.json'.
   * If you use this property, you don't need to specify the `taskDefinitionTemplateInput` property.
   */
  public fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath) {
    cdkBuilder.taskDefinitionTemplateFile(taskDefinitionTemplateFile)
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
  public fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact) {
    cdkBuilder.taskDefinitionTemplateInput(taskDefinitionTemplateInput)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeDeployEcsDeployActionProps {
    if(_containerImageInputs.isNotEmpty()) cdkBuilder.containerImageInputs(_containerImageInputs)
    return cdkBuilder.build()
  }
}
