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
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import kotlin.String

@CdkDslMarker
public class ServerDeploymentConfigPropsDsl {
    private val cdkBuilder: ServerDeploymentConfigProps.Builder =
        ServerDeploymentConfigProps.builder()

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
        cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
    }

    public fun build(): ServerDeploymentConfigProps = cdkBuilder.build()
}
