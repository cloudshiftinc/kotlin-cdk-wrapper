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
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.IEcsApplication
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig

/**
 * Properties of a reference to a CodeDeploy ECS Deployment Group.
 *
 * Example:
 * ```
 * EcsApplication application;
 * IEcsDeploymentGroup deploymentGroup = EcsDeploymentGroup.fromEcsDeploymentGroupAttributes(this,
 * "ExistingCodeDeployDeploymentGroup", EcsDeploymentGroupAttributes.builder()
 * .application(application)
 * .deploymentGroupName("MyExistingDeploymentGroup")
 * .build());
 * ```
 *
 * [Documentation](EcsDeploymentGroup#fromEcsDeploymentGroupAttributes)
 */
@CdkDslMarker
public class EcsDeploymentGroupAttributesDsl {
    private val cdkBuilder: EcsDeploymentGroupAttributes.Builder =
        EcsDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     *   belongs to.
     */
    public fun application(application: IEcsApplication) {
        cdkBuilder.application(application)
    }

    /** @param deploymentConfig The Deployment Configuration this Deployment Group uses. */
    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy ECS Deployment
     *   Group that we are referencing.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): EcsDeploymentGroupAttributes = cdkBuilder.build()
}
