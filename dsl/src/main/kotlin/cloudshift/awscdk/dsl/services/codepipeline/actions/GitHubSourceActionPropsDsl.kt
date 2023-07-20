@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class GitHubSourceActionPropsDsl {
    private val cdkBuilder: GitHubSourceActionProps.Builder = GitHubSourceActionProps.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    public fun oauthToken(oauthToken: SecretValue) {
        cdkBuilder.oauthToken(oauthToken)
    }

    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    public fun repo(repo: String) {
        cdkBuilder.repo(repo)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun trigger(trigger: GitHubTrigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): GitHubSourceActionProps = cdkBuilder.build()
}
