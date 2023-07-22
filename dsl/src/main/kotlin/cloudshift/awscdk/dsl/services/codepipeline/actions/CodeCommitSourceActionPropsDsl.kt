@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codecommit.IRepository
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CodeCommitSourceActionPropsDsl {
  private val cdkBuilder: CodeCommitSourceActionProps.Builder =
      CodeCommitSourceActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param branch the value to be set.
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
   * @param eventRole Role to be used by on commit event rule.
   * Used only when trigger value is CodeCommitTrigger.EVENTS.
   */
  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
  }

  /**
   * @param output the value to be set. 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * @param repository The CodeCommit repository. 
   */
  public fun repository(repository: IRepository) {
    cdkBuilder.repository(repository)
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
   * @param trigger How should CodePipeline detect source changes for this Action.
   */
  public fun trigger(trigger: CodeCommitTrigger) {
    cdkBuilder.trigger(trigger)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeCommitSourceActionProps = cdkBuilder.build()
}
