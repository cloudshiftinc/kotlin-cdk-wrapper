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

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnGitHubRepositoryPropsDsl {
    private val cdkBuilder: CfnGitHubRepositoryProps.Builder = CfnGitHubRepositoryProps.builder()

    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    public fun code(code: CfnGitHubRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun enableIssues(enableIssues: Boolean) {
        cdkBuilder.enableIssues(enableIssues)
    }

    public fun enableIssues(enableIssues: IResolvable) {
        cdkBuilder.enableIssues(enableIssues)
    }

    public fun isPrivate(isPrivate: Boolean) {
        cdkBuilder.isPrivate(isPrivate)
    }

    public fun isPrivate(isPrivate: IResolvable) {
        cdkBuilder.isPrivate(isPrivate)
    }

    public fun repositoryAccessToken(repositoryAccessToken: String) {
        cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    public fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun repositoryOwner(repositoryOwner: String) {
        cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): CfnGitHubRepositoryProps = cdkBuilder.build()
}
