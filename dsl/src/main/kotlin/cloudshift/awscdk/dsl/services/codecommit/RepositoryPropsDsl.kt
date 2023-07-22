@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codecommit.Code
import software.amazon.awscdk.services.codecommit.RepositoryProps

/**
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
public class RepositoryPropsDsl {
  private val cdkBuilder: RepositoryProps.Builder = RepositoryProps.builder()

  /**
   * @param code The contents with which to initialize the repository after it has been created.
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * @param description A description of the repository.
   * Use the description to identify the
   * purpose of the repository.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param repositoryName Name of the repository. 
   * This property is required for all CodeCommit repositories.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): RepositoryProps = cdkBuilder.build()
}
