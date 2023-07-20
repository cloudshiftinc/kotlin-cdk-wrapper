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
import software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables
import kotlin.String

@CdkDslMarker
public class CodeStarSourceVariablesDsl {
    private val cdkBuilder: CodeStarSourceVariables.Builder = CodeStarSourceVariables.builder()

    public fun authorDate(authorDate: String) {
        cdkBuilder.authorDate(authorDate)
    }

    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    public fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
    }

    public fun commitMessage(commitMessage: String) {
        cdkBuilder.commitMessage(commitMessage)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun fullRepositoryName(fullRepositoryName: String) {
        cdkBuilder.fullRepositoryName(fullRepositoryName)
    }

    public fun build(): CodeStarSourceVariables = cdkBuilder.build()
}
