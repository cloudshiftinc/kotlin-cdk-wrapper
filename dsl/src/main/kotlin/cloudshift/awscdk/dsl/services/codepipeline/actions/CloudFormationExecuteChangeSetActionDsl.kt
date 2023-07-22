@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction
import software.amazon.awscdk.services.iam.IRole

/**
 * CodePipeline action to execute a prepared change set.
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
public class CloudFormationExecuteChangeSetActionDsl {
  private val cdkBuilder: CloudFormationExecuteChangeSetAction.Builder =
      CloudFormationExecuteChangeSetAction.Builder.create()

  /**
   * The AWS account this Action is supposed to operate in.
   *
   * **Note**: if you specify the `role` property,
   * this is ignored - the action will operate in the same region the passed role does.
   *
   * Default: - action resides in the same account as the pipeline
   *
   * @param account The AWS account this Action is supposed to operate in. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

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
   * Name of the change set to execute.
   *
   * @param changeSetName Name of the change set to execute. 
   */
  public fun changeSetName(changeSetName: String) {
    cdkBuilder.changeSetName(changeSetName)
  }

  /**
   * The name of the output artifact to generate.
   *
   * Only applied if `outputFileName` is set as well.
   *
   * Default: Automatically generated artifact name.
   *
   * @param output The name of the output artifact to generate. 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * A name for the filename in the output artifact to store the AWS CloudFormation call's result.
   *
   * The file will contain the result of the call to AWS CloudFormation (for example
   * the call to UpdateStack or CreateChangeSet).
   *
   * AWS CodePipeline adds the file to the output artifact after performing
   * the specified action.
   *
   * Default: No output artifact generated
   *
   * @param outputFileName A name for the filename in the output artifact to store the AWS
   * CloudFormation call's result. 
   */
  public fun outputFileName(outputFileName: String) {
    cdkBuilder.outputFileName(outputFileName)
  }

  /**
   * The AWS region the given Action resides in.
   *
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps#crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   *
   * Default: the Action resides in the same region as the Pipeline
   *
   * @param region The AWS region the given Action resides in. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
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
   * The name of the stack to apply this action to.
   *
   * @param stackName The name of the stack to apply this action to. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
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

  public fun build(): CloudFormationExecuteChangeSetAction = cdkBuilder.build()
}
