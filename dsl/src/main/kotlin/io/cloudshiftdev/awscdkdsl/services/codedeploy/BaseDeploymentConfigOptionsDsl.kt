@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions

/**
 * Construction properties of `BaseDeploymentConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * BaseDeploymentConfigOptions baseDeploymentConfigOptions = BaseDeploymentConfigOptions.builder()
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseDeploymentConfigOptionsDsl {
    private val cdkBuilder: BaseDeploymentConfigOptions.Builder =
        BaseDeploymentConfigOptions.builder()

    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     *   Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): BaseDeploymentConfigOptions = cdkBuilder.build()
}
