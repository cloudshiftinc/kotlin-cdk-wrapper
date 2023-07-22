@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction
import software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger

/**
 * Source that is provided by a GitHub repository.
 *
 * Example:
 *
 * ```
 * // Read the secret from Secrets Manager
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact sourceOutput = new Artifact();
 * GitHubSourceAction sourceAction = GitHubSourceAction.Builder.create()
 * .actionName("GitHub_Source")
 * .owner("awslabs")
 * .repo("aws-cdk")
 * .oauthToken(SecretValue.secretsManager("my-github-token"))
 * .output(sourceOutput)
 * .branch("develop")
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class GitHubSourceActionDsl {
  private val cdkBuilder: GitHubSourceAction.Builder = GitHubSourceAction.Builder.create()

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
   * The branch to use.
   *
   * Default: "master"
   *
   * @param branch The branch to use. 
   */
  public fun branch(branch: String) {
    cdkBuilder.branch(branch)
  }

  /**
   * A GitHub OAuth token to use for authentication.
   *
   * It is recommended to use a Secrets Manager `Secret` to obtain the token:
   *
   * const oauth = cdk.SecretValue.secretsManager('my-github-token');
   * new GitHubSourceAction(this, 'GitHubAction', { oauthToken: oauth, ... });
   *
   * If you rotate the value in the Secret, you must also change at least one property
   * of the CodePipeline to force CloudFormation to re-read the secret.
   *
   * The GitHub Personal Access Token should have these scopes:
   *
   * * **repo** - to read the repository
   * * **admin:repo_hook** - if you plan to use webhooks (true by default)
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/appendix-github-oauth.html#GitHub-create-personal-token-CLI)
   * @param oauthToken A GitHub OAuth token to use for authentication. 
   */
  public fun oauthToken(oauthToken: SecretValue) {
    cdkBuilder.oauthToken(oauthToken)
  }

  /**
   * @param output 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * The GitHub account/user that owns the repo.
   *
   * @param owner The GitHub account/user that owns the repo. 
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * The name of the repo, without the username.
   *
   * @param repo The name of the repo, without the username. 
   */
  public fun repo(repo: String) {
    cdkBuilder.repo(repo)
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
   * How AWS CodePipeline should be triggered.
   *
   * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action
   * With "POLL", CodePipeline periodically checks the source for changes
   * With "None", the action is not triggered through changes in the source
   *
   * To use `WEBHOOK`, your GitHub Personal Access Token should have
   * **admin:repo_hook** scope (in addition to the regular **repo** scope).
   *
   * Default: GitHubTrigger.WEBHOOK
   *
   * @param trigger How AWS CodePipeline should be triggered. 
   */
  public fun trigger(trigger: GitHubTrigger) {
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

  public fun build(): GitHubSourceAction = cdkBuilder.build()
}
