@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `GitHubSourceAction GitHub source action`.
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
public interface GitHubSourceActionProps : CommonActionProps {
  /**
   * The branch to use.
   *
   * Default: "master"
   */
  public fun branch(): String? = unwrap(this).getBranch()

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
   */
  public fun oauthToken(): SecretValue

  /**
   *
   */
  public fun output(): Artifact

  /**
   * The GitHub account/user that owns the repo.
   */
  public fun owner(): String

  /**
   * The name of the repo, without the username.
   */
  public fun repo(): String

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
   */
  public fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

  /**
   * A builder for [GitHubSourceActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param branch The branch to use.
     */
    public fun branch(branch: String)

    /**
     * @param oauthToken A GitHub OAuth token to use for authentication. 
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
     */
    public fun oauthToken(oauthToken: SecretValue)

    /**
     * @param output the value to be set. 
     */
    public fun output(output: Artifact)

    /**
     * @param owner The GitHub account/user that owns the repo. 
     */
    public fun owner(owner: String)

    /**
     * @param repo The name of the repo, without the username. 
     */
    public fun repo(repo: String)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param trigger How AWS CodePipeline should be triggered.
     * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action
     * With "POLL", CodePipeline periodically checks the source for changes
     * With "None", the action is not triggered through changes in the source
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have
     * **admin:repo_hook** scope (in addition to the regular **repo** scope).
     */
    public fun trigger(trigger: GitHubTrigger)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param branch The branch to use.
     */
    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    /**
     * @param oauthToken A GitHub OAuth token to use for authentication. 
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
     */
    override fun oauthToken(oauthToken: SecretValue) {
      cdkBuilder.oauthToken(oauthToken.let(SecretValue.Companion::unwrap))
    }

    /**
     * @param output the value to be set. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * @param owner The GitHub account/user that owns the repo. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param repo The name of the repo, without the username. 
     */
    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param trigger How AWS CodePipeline should be triggered.
     * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action
     * With "POLL", CodePipeline periodically checks the source for changes
     * With "None", the action is not triggered through changes in the source
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have
     * **admin:repo_hook** scope (in addition to the regular **repo** scope).
     */
    override fun trigger(trigger: GitHubTrigger) {
      cdkBuilder.trigger(trigger.let(GitHubTrigger.Companion::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps,
  ) : CdkObject(cdkObject),
      GitHubSourceActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The branch to use.
     *
     * Default: "master"
     */
    override fun branch(): String? = unwrap(this).getBranch()

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
     */
    override fun oauthToken(): SecretValue = unwrap(this).getOauthToken().let(SecretValue::wrap)

    /**
     *
     */
    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    /**
     * The GitHub account/user that owns the repo.
     */
    override fun owner(): String = unwrap(this).getOwner()

    /**
     * The name of the repo, without the username.
     */
    override fun repo(): String = unwrap(this).getRepo()

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
     */
    override fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps):
        GitHubSourceActionProps = CdkObjectWrappers.wrap(cdkObject) as? GitHubSourceActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
  }
}
