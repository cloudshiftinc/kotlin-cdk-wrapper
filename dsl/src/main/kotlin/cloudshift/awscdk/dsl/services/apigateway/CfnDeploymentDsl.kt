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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

    public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
        cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
    }

    public fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
        cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun stageDescription(stageDescription: IResolvable) {
        cdkBuilder.stageDescription(stageDescription)
    }

    public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
        cdkBuilder.stageDescription(stageDescription)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnDeployment = cdkBuilder.build()
}
