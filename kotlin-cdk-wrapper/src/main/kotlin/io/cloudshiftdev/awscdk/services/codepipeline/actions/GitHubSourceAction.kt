@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit

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
public open class GitHubSourceAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction,
) : Action(cdkObject) {
  public constructor(props: GitHubSourceActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction(props.let(GitHubSourceActionProps::unwrap))
  )

  public constructor(props: GitHubSourceActionProps.Builder.() -> Unit) :
      this(GitHubSourceActionProps(props)
  )

  /**
   * The variables emitted by this action.
   */
  public open fun variables(): GitHubSourceVariables =
      unwrap(this).getVariables().let(GitHubSourceVariables::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.GitHubSourceAction].
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
     * The branch to use.
     *
     * Default: "master"
     *
     * @param branch The branch to use. 
     */
    public fun branch(branch: String)

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
    public fun oauthToken(oauthToken: SecretValue)

    /**
     * @param output 
     */
    public fun output(output: Artifact)

    /**
     * The GitHub account/user that owns the repo.
     *
     * @param owner The GitHub account/user that owns the repo. 
     */
    public fun owner(owner: String)

    /**
     * The name of the repo, without the username.
     *
     * @param repo The name of the repo, without the username. 
     */
    public fun repo(repo: String)

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
    public fun trigger(trigger: GitHubTrigger)

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
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder.create()

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
     * The branch to use.
     *
     * Default: "master"
     *
     * @param branch The branch to use. 
     */
    override fun branch(branch: String) {
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
    override fun oauthToken(oauthToken: SecretValue) {
      cdkBuilder.oauthToken(oauthToken.let(SecretValue::unwrap))
    }

    /**
     * @param output 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * The GitHub account/user that owns the repo.
     *
     * @param owner The GitHub account/user that owns the repo. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * The name of the repo, without the username.
     *
     * @param repo The name of the repo, without the username. 
     */
    override fun repo(repo: String) {
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
    override fun runOrder(runOrder: Number) {
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
    override fun trigger(trigger: GitHubTrigger) {
      cdkBuilder.trigger(trigger.let(GitHubTrigger::unwrap))
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceAction {
      val builderImpl = BuilderImpl()
      return GitHubSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction):
        GitHubSourceAction = GitHubSourceAction(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction = wrapped.cdkObject
        as software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction
  }
}
