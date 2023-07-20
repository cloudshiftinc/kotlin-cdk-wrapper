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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupGitHubLocationPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.GitHubLocationProperty.Builder =
        CfnDeploymentGroup.GitHubLocationProperty.builder()

    public fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
    }

    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    public fun build(): CfnDeploymentGroup.GitHubLocationProperty = cdkBuilder.build()
}
