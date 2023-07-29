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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger

/**
 * Construction properties of the `GitHubSourceAction GitHub source action`.
 *
 * Example:
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
public class GitHubSourceActionPropsDsl {
    private val cdkBuilder: GitHubSourceActionProps.Builder = GitHubSourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /** @param branch The branch to use. */
    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    /**
     * @param oauthToken A GitHub OAuth token to use for authentication. It is recommended to use a
     *   Secrets Manager `Secret` to obtain the token:
     *
     * const oauth = cdk.SecretValue.secretsManager('my-github-token'); new GitHubSourceAction(this,
     * 'GitHubAction', { oauthToken: oauth, ... });
     *
     * If you rotate the value in the Secret, you must also change at least one property of the
     * CodePipeline to force CloudFormation to re-read the secret.
     *
     * The GitHub Personal Access Token should have these scopes:
     * * **repo** - to read the repository
     * * **admin:repo_hook** - if you plan to use webhooks (true by default)
     */
    public fun oauthToken(oauthToken: SecretValue) {
        cdkBuilder.oauthToken(oauthToken)
    }

    /** @param output the value to be set. */
    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    /** @param owner The GitHub account/user that owns the repo. */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /** @param repo The name of the repo, without the username. */
    public fun repo(repo: String) {
        cdkBuilder.repo(repo)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param trigger How AWS CodePipeline should be triggered. With the default value "WEBHOOK", a
     *   webhook is created in GitHub that triggers the action With "POLL", CodePipeline
     *   periodically checks the source for changes With "None", the action is not triggered through
     *   changes in the source
     *
     * To use `WEBHOOK`, your GitHub Personal Access Token should have **admin:repo_hook** scope (in
     * addition to the regular **repo** scope).
     */
    public fun trigger(trigger: GitHubTrigger) {
        cdkBuilder.trigger(trigger)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): GitHubSourceActionProps = cdkBuilder.build()
}
