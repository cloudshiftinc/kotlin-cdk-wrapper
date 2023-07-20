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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CodeCommitSourceOptionsDsl {
    private val cdkBuilder: CodeCommitSourceOptions.Builder = CodeCommitSourceOptions.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
        cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    public fun trigger(trigger: CodeCommitTrigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CodeCommitSourceOptions = cdkBuilder.build()
}
