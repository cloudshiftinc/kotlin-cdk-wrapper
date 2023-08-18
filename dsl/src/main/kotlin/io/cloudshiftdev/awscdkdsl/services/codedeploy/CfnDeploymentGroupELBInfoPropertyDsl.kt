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
 * The `ELBInfo` property type specifies information about the Elastic Load Balancing load balancer
 * used for an CodeDeploy deployment group.
 *
 * If you specify the `ELBInfo` property, the `DeploymentStyle.DeploymentOption` property must be
 * set to `WITH_TRAFFIC_CONTROL` for AWS CodeDeploy to route your traffic using the specified load
 * balancers.
 *
 * `ELBInfo` is a property of the
 * [AWS CodeDeploy DeploymentGroup LoadBalancerInfo](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * ELBInfoProperty eLBInfoProperty = ELBInfoProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupELBInfoPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.ELBInfoProperty.Builder =
        CfnDeploymentGroup.ELBInfoProperty.builder()

    /**
     * @param name For blue/green deployments, the name of the load balancer that is used to route
     *   traffic from original instances to replacement instances in a blue/green deployment. For
     *   in-place deployments, the name of the load balancer that instances are deregistered from so
     *   they are not serving traffic during a deployment, and then re-registered with after the
     *   deployment is complete.
     *
     * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDeploymentGroup.ELBInfoProperty = cdkBuilder.build()
}
