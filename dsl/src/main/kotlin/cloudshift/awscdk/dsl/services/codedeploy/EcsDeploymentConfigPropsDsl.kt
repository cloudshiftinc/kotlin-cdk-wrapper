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
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import kotlin.String

@CdkDslMarker
public class EcsDeploymentConfigPropsDsl {
    private val cdkBuilder: EcsDeploymentConfigProps.Builder = EcsDeploymentConfigProps.builder()

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun trafficRouting(trafficRouting: TrafficRouting) {
        cdkBuilder.trafficRouting(trafficRouting)
    }

    public fun build(): EcsDeploymentConfigProps = cdkBuilder.build()
}
