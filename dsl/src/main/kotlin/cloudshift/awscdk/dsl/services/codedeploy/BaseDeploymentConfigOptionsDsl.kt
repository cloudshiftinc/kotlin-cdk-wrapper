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
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions
import kotlin.String

@CdkDslMarker
public class BaseDeploymentConfigOptionsDsl {
    private val cdkBuilder: BaseDeploymentConfigOptions.Builder =
        BaseDeploymentConfigOptions.builder()

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): BaseDeploymentConfigOptions = cdkBuilder.build()
}
