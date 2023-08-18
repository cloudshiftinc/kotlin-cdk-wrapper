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
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Information about the type of deployment, either in-place or blue/green, you want to run and
 * whether to route deployment traffic behind a load balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * DeploymentStyleProperty deploymentStyleProperty = DeploymentStyleProperty.builder()
 * .deploymentOption("deploymentOption")
 * .deploymentType("deploymentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupDeploymentStylePropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.DeploymentStyleProperty.Builder =
        CfnDeploymentGroup.DeploymentStyleProperty.builder()

    /**
     * @param deploymentOption Indicates whether to route deployment traffic behind a load balancer.
     *
     * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon
     * ECS deployment.
     */
    public fun deploymentOption(deploymentOption: String) {
        cdkBuilder.deploymentOption(deploymentOption)
    }

    /** @param deploymentType Indicates whether to run an in-place or blue/green deployment. */
    public fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
    }

    public fun build(): CfnDeploymentGroup.DeploymentStyleProperty = cdkBuilder.build()
}
