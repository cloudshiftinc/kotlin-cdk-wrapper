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

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables

/**
 * The CodePipeline variables emitted by GitHub source Action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * GitHubSourceVariables gitHubSourceVariables = GitHubSourceVariables.builder()
 * .authorDate("authorDate")
 * .branchName("branchName")
 * .commitId("commitId")
 * .commitMessage("commitMessage")
 * .committerDate("committerDate")
 * .commitUrl("commitUrl")
 * .repositoryName("repositoryName")
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubSourceVariablesDsl {
    private val cdkBuilder: GitHubSourceVariables.Builder = GitHubSourceVariables.builder()

    /**
     * @param authorDate The date the currently last commit on the tracked branch was authored, in
     *   ISO-8601 format.
     */
    public fun authorDate(authorDate: String) {
        cdkBuilder.authorDate(authorDate)
    }

    /** @param branchName The name of the branch this action tracks. */
    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    /** @param commitId The SHA1 hash of the currently last commit on the tracked branch. */
    public fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
    }

    /** @param commitMessage The message of the currently last commit on the tracked branch. */
    public fun commitMessage(commitMessage: String) {
        cdkBuilder.commitMessage(commitMessage)
    }

    /** @param commitUrl The GitHub API URL of the currently last commit on the tracked branch. */
    public fun commitUrl(commitUrl: String) {
        cdkBuilder.commitUrl(commitUrl)
    }

    /**
     * @param committerDate The date the currently last commit on the tracked branch was committed,
     *   in ISO-8601 format.
     */
    public fun committerDate(committerDate: String) {
        cdkBuilder.committerDate(committerDate)
    }

    /** @param repositoryName The name of the repository this action points to. */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): GitHubSourceVariables = cdkBuilder.build()
}
