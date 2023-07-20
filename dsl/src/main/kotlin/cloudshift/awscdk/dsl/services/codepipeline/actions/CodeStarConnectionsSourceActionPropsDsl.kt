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
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CodeStarConnectionsSourceActionPropsDsl {
    private val cdkBuilder: CodeStarConnectionsSourceActionProps.Builder =
        CodeStarConnectionsSourceActionProps.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
        cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
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

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun triggerOnPush(triggerOnPush: Boolean) {
        cdkBuilder.triggerOnPush(triggerOnPush)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CodeStarConnectionsSourceActionProps = cdkBuilder.build()
}
