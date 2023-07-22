@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties of the `CodeDeployServerDeployAction CodeDeploy server deploy
 * CodePipeline Action`.
 *
 * Example:
 *
 * ```
 * ServerDeploymentGroup deploymentGroup;
 * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
 * .pipelineName("MyPipeline")
 * .build();
 * // add the source and build Stages to the Pipeline...
 * Artifact buildOutput = new Artifact();
 * CodeDeployServerDeployAction deployAction = CodeDeployServerDeployAction.Builder.create()
 * .actionName("CodeDeploy")
 * .input(buildOutput)
 * .deploymentGroup(deploymentGroup)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class CodeDeployServerDeployActionPropsDsl {
  private val cdkBuilder: CodeDeployServerDeployActionProps.Builder =
      CodeDeployServerDeployActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to. 
   */
  public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
    cdkBuilder.deploymentGroup(deploymentGroup)
  }

  /**
   * @param input The source to use as input for deployment. 
   */
  public fun input(input: Artifact) {
    cdkBuilder.input(input)
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
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeDeployServerDeployActionProps = cdkBuilder.build()
}
