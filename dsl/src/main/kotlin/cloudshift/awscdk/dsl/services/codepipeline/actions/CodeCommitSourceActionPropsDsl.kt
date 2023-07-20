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
import software.amazon.awscdk.services.codecommit.IRepository
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CodeCommitSourceActionPropsDsl {
    private val cdkBuilder: CodeCommitSourceActionProps.Builder =
        CodeCommitSourceActionProps.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
        cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    public fun repository(repository: IRepository) {
        cdkBuilder.repository(repository)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun trigger(trigger: CodeCommitTrigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CodeCommitSourceActionProps = cdkBuilder.build()
}
