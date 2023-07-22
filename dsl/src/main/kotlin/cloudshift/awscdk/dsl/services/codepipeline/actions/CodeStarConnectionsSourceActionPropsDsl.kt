@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CodeStarConnectionsSourceActionPropsDsl {
  private val cdkBuilder: CodeStarConnectionsSourceActionProps.Builder =
      CodeStarConnectionsSourceActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param branch The branch to build.
   */
  public fun branch(branch: String) {
    cdkBuilder.branch(branch)
  }

  /**
   * @param codeBuildCloneOutput Whether the output should be the contents of the repository (which
   * is the default), or a link that allows CodeBuild to clone the repository before building.
   * **Note**: if this option is true,
   * then only CodeBuild actions can use the resulting `output`.
   */
  public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
    cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
  }

  /**
   * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
   * permissions to access this GitHub or BitBucket repository. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param output The output artifact that this action produces. 
   * Can be used as input for further pipeline actions.
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * @param owner The owning user or organization of the repository. 
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param repo The name of the repository. 
   */
  public fun repo(repo: String) {
    cdkBuilder.repo(repo)
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
   * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made on
   * the configured repository and branch.
   * If unspecified,
   * the default value is true, and the field does not display by default.
   */
  public fun triggerOnPush(triggerOnPush: Boolean) {
    cdkBuilder.triggerOnPush(triggerOnPush)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeStarConnectionsSourceActionProps = cdkBuilder.build()
}
