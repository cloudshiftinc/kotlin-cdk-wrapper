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
import software.amazon.awscdk.services.codedeploy.IServerApplication
import software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes

/**
 * Properties of a reference to a CodeDeploy EC2/on-premise Deployment Group.
 *
 * Example:
 * ```
 * ServerApplication application;
 * IServerDeploymentGroup deploymentGroup =
 * ServerDeploymentGroup.fromServerDeploymentGroupAttributes(this, "ExistingCodeDeployDeploymentGroup",
 * ServerDeploymentGroupAttributes.builder()
 * .application(application)
 * .deploymentGroupName("MyExistingDeploymentGroup")
 * .build());
 * ```
 *
 * [Documentation](ServerDeploymentGroup# import)
 */
@CdkDslMarker
public class ServerDeploymentGroupAttributesDsl {
    private val cdkBuilder: ServerDeploymentGroupAttributes.Builder =
        ServerDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy EC2/on-premise Application that this
     *   Deployment Group belongs to.
     */
    public fun application(application: IServerApplication) {
        cdkBuilder.application(application)
    }

    /** @param deploymentConfig The Deployment Configuration this Deployment Group uses. */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy EC2/on-premise
     *   Deployment Group that we are referencing.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): ServerDeploymentGroupAttributes = cdkBuilder.build()
}
