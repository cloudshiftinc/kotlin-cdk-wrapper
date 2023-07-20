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
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class LambdaDeploymentConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LambdaDeploymentConfig.Builder =
        LambdaDeploymentConfig.Builder.create(scope, id)

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun trafficRouting(trafficRouting: TrafficRouting) {
        cdkBuilder.trafficRouting(trafficRouting)
    }

    public fun build(): LambdaDeploymentConfig = cdkBuilder.build()
}
