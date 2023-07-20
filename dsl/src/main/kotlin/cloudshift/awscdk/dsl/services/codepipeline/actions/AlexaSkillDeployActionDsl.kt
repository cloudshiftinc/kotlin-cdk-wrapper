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
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class AlexaSkillDeployActionDsl {
    private val cdkBuilder: AlexaSkillDeployAction.Builder = AlexaSkillDeployAction.Builder.create()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: SecretValue) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
        cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact)
    }

    public fun refreshToken(refreshToken: SecretValue) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun skillId(skillId: String) {
        cdkBuilder.skillId(skillId)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): AlexaSkillDeployAction = cdkBuilder.build()
}
