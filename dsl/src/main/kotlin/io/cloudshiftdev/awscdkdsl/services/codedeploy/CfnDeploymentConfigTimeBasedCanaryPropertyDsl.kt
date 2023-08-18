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
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

/**
 * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task set
 * to another in two increments.
 *
 * The original and target Lambda function versions or ECS task sets are specified in the
 * deployment's AppSpec file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TimeBasedCanaryProperty timeBasedCanaryProperty = TimeBasedCanaryProperty.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html)
 */
@CdkDslMarker
public class CfnDeploymentConfigTimeBasedCanaryPropertyDsl {
    private val cdkBuilder: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder =
        CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

    /**
     * @param canaryInterval The number of minutes between the first and second traffic shifts of a
     *   `TimeBasedCanary` deployment.
     */
    public fun canaryInterval(canaryInterval: Number) {
        cdkBuilder.canaryInterval(canaryInterval)
    }

    /**
     * @param canaryPercentage The percentage of traffic to shift in the first increment of a
     *   `TimeBasedCanary` deployment.
     */
    public fun canaryPercentage(canaryPercentage: Number) {
        cdkBuilder.canaryPercentage(canaryPercentage)
    }

    public fun build(): CfnDeploymentConfig.TimeBasedCanaryProperty = cdkBuilder.build()
}
