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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.ecs.IBaseService
import software.amazon.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class EcsDeployActionDsl {
    private val cdkBuilder: EcsDeployAction.Builder = EcsDeployAction.Builder.create()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun deploymentTimeout(deploymentTimeout: Duration) {
        cdkBuilder.deploymentTimeout(deploymentTimeout)
    }

    public fun imageFile(imageFile: ArtifactPath) {
        cdkBuilder.imageFile(imageFile)
    }

    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun service(service: IBaseService) {
        cdkBuilder.service(service)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): EcsDeployAction = cdkBuilder.build()
}
