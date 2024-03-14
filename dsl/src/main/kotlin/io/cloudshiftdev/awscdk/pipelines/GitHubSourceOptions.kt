package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.actions.GitHubTrigger
import kotlin.String
import kotlin.Unit

public interface GitHubSourceOptions {
  /**
   * The action name used for this source in the CodePipeline.
   *
   * Default: - The repository string
   */
  public fun actionName(): String? = unwrap(this).getActionName()

  /**
   * A GitHub OAuth token to use for authentication.
   *
   * It is recommended to use a Secrets Manager `Secret` to obtain the token:
   *
   * ```
   * SecretValue oauth = SecretValue.secretsManager("my-github-token");
   * ```
   *
   * The GitHub Personal Access Token should have these scopes:
   *
   * * **repo** - to read the repository
   * * **admin:repo_hook** - if you plan to use webhooks (true by default)
   *
   * Default: - SecretValue.secretsManager('github-token')
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/GitHub-create-personal-token-CLI.html)
   */
  public fun authentication(): SecretValue? =
      unwrap(this).getAuthentication()?.let(SecretValue::wrap)

  /**
   * How AWS CodePipeline should be triggered.
   *
   * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action.
   * With "POLL", CodePipeline periodically checks the source for changes.
   * With "None", the action is not triggered through changes in the source.
   *
   * To use `WEBHOOK`, your GitHub Personal Access Token should have
   * **admin:repo_hook** scope (in addition to the regular **repo** scope).
   *
   * Default: GitHubTrigger.WEBHOOK
   */
  public fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

  /**
   * A builder for [GitHubSourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    public fun actionName(actionName: String)

    /**
     * @param authentication A GitHub OAuth token to use for authentication.
     * It is recommended to use a Secrets Manager `Secret` to obtain the token:
     *
     * ```
     * SecretValue oauth = SecretValue.secretsManager("my-github-token");
     * ```
     *
     * The GitHub Personal Access Token should have these scopes:
     *
     * * **repo** - to read the repository
     * * **admin:repo_hook** - if you plan to use webhooks (true by default)
     */
    public fun authentication(authentication: SecretValue)

    /**
     * @param trigger How AWS CodePipeline should be triggered.
     * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action.
     * With "POLL", CodePipeline periodically checks the source for changes.
     * With "None", the action is not triggered through changes in the source.
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have
     * **admin:repo_hook** scope (in addition to the regular **repo** scope).
     */
    public fun trigger(trigger: GitHubTrigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.GitHubSourceOptions.Builder =
        software.amazon.awscdk.pipelines.GitHubSourceOptions.builder()

    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param authentication A GitHub OAuth token to use for authentication.
     * It is recommended to use a Secrets Manager `Secret` to obtain the token:
     *
     * ```
     * SecretValue oauth = SecretValue.secretsManager("my-github-token");
     * ```
     *
     * The GitHub Personal Access Token should have these scopes:
     *
     * * **repo** - to read the repository
     * * **admin:repo_hook** - if you plan to use webhooks (true by default)
     */
    override fun authentication(authentication: SecretValue) {
      cdkBuilder.authentication(authentication.let(SecretValue::unwrap))
    }

    /**
     * @param trigger How AWS CodePipeline should be triggered.
     * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action.
     * With "POLL", CodePipeline periodically checks the source for changes.
     * With "None", the action is not triggered through changes in the source.
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have
     * **admin:repo_hook** scope (in addition to the regular **repo** scope).
     */
    override fun trigger(trigger: GitHubTrigger) {
      cdkBuilder.trigger(trigger.let(GitHubTrigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.GitHubSourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.GitHubSourceOptions,
  ) : CdkObject(cdkObject), GitHubSourceOptions {
    /**
     * The action name used for this source in the CodePipeline.
     *
     * Default: - The repository string
     */
    override fun actionName(): String? = unwrap(this).getActionName()

    /**
     * A GitHub OAuth token to use for authentication.
     *
     * It is recommended to use a Secrets Manager `Secret` to obtain the token:
     *
     * ```
     * SecretValue oauth = SecretValue.secretsManager("my-github-token");
     * ```
     *
     * The GitHub Personal Access Token should have these scopes:
     *
     * * **repo** - to read the repository
     * * **admin:repo_hook** - if you plan to use webhooks (true by default)
     *
     * Default: - SecretValue.secretsManager('github-token')
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/GitHub-create-personal-token-CLI.html)
     */
    override fun authentication(): SecretValue? =
        unwrap(this).getAuthentication()?.let(SecretValue::wrap)

    /**
     * How AWS CodePipeline should be triggered.
     *
     * With the default value "WEBHOOK", a webhook is created in GitHub that triggers the action.
     * With "POLL", CodePipeline periodically checks the source for changes.
     * With "None", the action is not triggered through changes in the source.
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have
     * **admin:repo_hook** scope (in addition to the regular **repo** scope).
     *
     * Default: GitHubTrigger.WEBHOOK
     */
    override fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.GitHubSourceOptions):
        GitHubSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceOptions):
        software.amazon.awscdk.pipelines.GitHubSourceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.GitHubSourceOptions
  }
}
