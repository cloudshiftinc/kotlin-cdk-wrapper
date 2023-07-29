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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.constructs.Construct

/**
 * A custom Deployment Configuration for an EC2/on-premise Deployment Group.
 *
 * Example:
 * ```
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "CodeDeployDeploymentGroup")
 * .deploymentConfig(ServerDeploymentConfig.ALL_AT_ONCE)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServerDeploymentConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ServerDeploymentConfig.Builder =
        ServerDeploymentConfig.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     *   Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * Minimum number of healthy hosts.
     *
     * @param minimumHealthyHosts Minimum number of healthy hosts.
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
        cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
    }

    public fun build(): ServerDeploymentConfig = cdkBuilder.build()
}
