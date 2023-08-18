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
 * Information about the instances that belong to the replacement environment in a blue/green
 * deployment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * GreenFleetProvisioningOptionProperty greenFleetProvisioningOptionProperty =
 * GreenFleetProvisioningOptionProperty.builder()
 * .action("action")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-greenfleetprovisioningoption.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.Builder =
        CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.builder()

    /**
     * @param action The method used to add instances to a replacement environment.
     * * `DISCOVER_EXISTING` : Use instances that already exist or will be created manually.
     * * `COPY_AUTO_SCALING_GROUP` : Use settings from a specified Auto Scaling group to define and
     *   create instances in a new Auto Scaling group.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun build(): CfnDeploymentGroup.GreenFleetProvisioningOptionProperty = cdkBuilder.build()
}
