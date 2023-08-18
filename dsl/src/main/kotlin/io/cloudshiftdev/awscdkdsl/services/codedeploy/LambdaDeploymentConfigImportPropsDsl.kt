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
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps

/**
 * Properties of a reference to a CodeDeploy Lambda Deployment Configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * LambdaDeploymentConfigImportProps lambdaDeploymentConfigImportProps =
 * LambdaDeploymentConfigImportProps.builder()
 * .deploymentConfigName("deploymentConfigName")
 * .build();
 * ```
 *
 * [Documentation](LambdaDeploymentConfig# import)
 */
@CdkDslMarker
public class LambdaDeploymentConfigImportPropsDsl {
    private val cdkBuilder: LambdaDeploymentConfigImportProps.Builder =
        LambdaDeploymentConfigImportProps.builder()

    /**
     * @param deploymentConfigName The physical, human-readable name of the custom CodeDeploy Lambda
     *   Deployment Configuration that we are referencing.
     */
    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun build(): LambdaDeploymentConfigImportProps = cdkBuilder.build()
}
