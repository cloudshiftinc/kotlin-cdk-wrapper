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
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * ECSServiceProperty eCSServiceProperty = ECSServiceProperty.builder()
 * .clusterName("clusterName")
 * .serviceName("serviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupECSServicePropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.ECSServiceProperty.Builder =
        CfnDeploymentGroup.ECSServiceProperty.builder()

    /**
     * @param clusterName The name of the cluster that the Amazon ECS service is associated with.
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /** @param serviceName The name of the target Amazon ECS service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnDeploymentGroup.ECSServiceProperty = cdkBuilder.build()
}
