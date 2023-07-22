@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codecommit.IRepository
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger
import software.amazon.awscdk.services.iam.IRole

/**
 * CodePipeline Source that is provided by an AWS CodeCommit repository.
 *
 * If the CodeCommit repository is in a different account, you must use
 * `CodeCommitTrigger.EVENTS` to trigger the pipeline.
 *
 * (That is because the Pipeline structure normally only has a `RepositoryName`
 * field, and that is not enough for the pipeline to locate the repository's
 * source account. However, if the pipeline is triggered via an EventBridge
 * event, the event itself has the full repository ARN in there, allowing the
 * pipeline to locate the repository).
 *
 * Example:
 *
 * ```
 * // Source stage: read from repository
 * Repository repo = Repository.Builder.create(stack, "TemplateRepo")
 * .repositoryName("template-repo")
 * .build();
 * Artifact sourceOutput = new Artifact("SourceArtifact");
 * CodeCommitSourceAction source = CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .repository(repo)
 * .output(sourceOutput)
 * .trigger(CodeCommitTrigger.POLL)
 * .build();
 * Map&lt;String, Object&gt; sourceStage = Map.of(
 * "stageName", "Source",
 * "actions", List.of(source));
 * // Deployment stage: create and deploy changeset with manual approval
 * String stackName = "OurStack";
 * String changeSetName = "StagedChangeSet";
 * Map&lt;String, Object&gt; prodStage = Map.of(
 * "stageName", "Deploy",
 * "actions", List.of(
 * CloudFormationCreateReplaceChangeSetAction.Builder.create()
 * .actionName("PrepareChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .adminPermissions(true)
 * .templatePath(sourceOutput.atPath("template.yaml"))
 * .runOrder(1)
 * .build(),
 * ManualApprovalAction.Builder.create()
 * .actionName("ApproveChanges")
 * .runOrder(2)
 * .build(),
 * CloudFormationExecuteChangeSetAction.Builder.create()
 * .actionName("ExecuteChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .runOrder(3)
 * .build()));
 * Pipeline.Builder.create(stack, "Pipeline")
 * .stages(List.of(sourceStage, prodStage))
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeCommitSourceActionDsl {
  private val cdkBuilder: CodeCommitSourceAction.Builder = CodeCommitSourceAction.Builder.create()

  /**
   * The physical, human-readable name of the Action.
   *
   * Note that Action names must be unique within a single Stage.
   *
   * @param actionName The physical, human-readable name of the Action. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * Default: 'master'
   *
   * @param branch 
   */
  public fun branch(branch: String) {
    cdkBuilder.branch(branch)
  }

  /**
   * Whether the output should be the contents of the repository (which is the default), or a link
   * that allows CodeBuild to clone the repository before building.
   *
   * **Note**: if this option is true,
   * then only CodeBuild actions can use the resulting `output`.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeCommit.html)
   * @param codeBuildCloneOutput Whether the output should be the contents of the repository (which
   * is the default), or a link that allows CodeBuild to clone the repository before building. 
   */
  public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
    cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
  }

  /**
   * Role to be used by on commit event rule.
   *
   * Used only when trigger value is CodeCommitTrigger.EVENTS.
   *
   * Default: a new role will be created.
   *
   * @param eventRole Role to be used by on commit event rule. 
   */
  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
  }

  /**
   * @param output 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * The CodeCommit repository.
   *
   * @param repository The CodeCommit repository. 
   */
  public fun repository(repository: IRepository) {
    cdkBuilder.repository(repository)
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
  public fun role(role: IRole) {
    cdkBuilder.role(role)
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
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * How should CodePipeline detect source changes for this Action.
   *
   * Default: CodeCommitTrigger.EVENTS
   *
   * @param trigger How should CodePipeline detect source changes for this Action. 
   */
  public fun trigger(trigger: CodeCommitTrigger) {
    cdkBuilder.trigger(trigger)
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
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeCommitSourceAction = cdkBuilder.build()
}
