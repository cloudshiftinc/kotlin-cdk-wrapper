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
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.ComputePlatform
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import kotlin.String

@CdkDslMarker
public class BaseDeploymentConfigPropsDsl {
    private val cdkBuilder: BaseDeploymentConfigProps.Builder = BaseDeploymentConfigProps.builder()

    public fun computePlatform(computePlatform: ComputePlatform) {
        cdkBuilder.computePlatform(computePlatform)
    }

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
        cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
    }

    public fun trafficRouting(trafficRouting: TrafficRouting) {
        cdkBuilder.trafficRouting(trafficRouting)
    }

    public fun build(): BaseDeploymentConfigProps = cdkBuilder.build()
}
