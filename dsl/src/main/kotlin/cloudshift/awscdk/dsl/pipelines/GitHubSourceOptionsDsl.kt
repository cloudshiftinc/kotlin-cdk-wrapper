@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.pipelines.GitHubSourceOptions
import software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger

/**
 * Options for GitHub sources.
 *
 * Example:
 * ```
 * CodePipelineSource.gitHub("org/repo", "branch", GitHubSourceOptions.builder()
 * // This is optional
 * .authentication(SecretValue.secretsManager("my-token"))
 * .build());
 * ```
 */
@CdkDslMarker
public class GitHubSourceOptionsDsl {
    private val cdkBuilder: GitHubSourceOptions.Builder = GitHubSourceOptions.builder()

    /** @param actionName The action name used for this source in the CodePipeline. */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param authentication A GitHub OAuth token to use for authentication. It is recommended to
     *   use a Secrets Manager `Secret` to obtain the token:
     * ```
     * SecretValue oauth = SecretValue.secretsManager("my-github-token");
     * ```
     *
     * The GitHub Personal Access Token should have these scopes:
     * * **repo** - to read the repository
     * * **admin:repo_hook** - if you plan to use webhooks (true by default)
     */
    public fun authentication(authentication: SecretValue) {
        cdkBuilder.authentication(authentication)
    }

    /**
     * @param trigger How AWS CodePipeline should be triggered. With the default value "WEBHOOK", a
     *   webhook is created in GitHub that triggers the action. With "POLL", CodePipeline
     *   periodically checks the source for changes. With "None", the action is not triggered
     *   through changes in the source.
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have **admin:repo_hook** scope (in
     * addition to the regular **repo** scope).
     */
    public fun trigger(trigger: GitHubTrigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): GitHubSourceOptions = cdkBuilder.build()
}
