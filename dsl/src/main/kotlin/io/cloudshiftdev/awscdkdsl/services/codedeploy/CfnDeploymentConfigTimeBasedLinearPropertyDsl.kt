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
 * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
 * another in equal increments, with an equal number of minutes between each increment.
 *
 * The original and target Lambda function versions or ECS task sets are specified in the
 * deployment's AppSpec file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TimeBasedLinearProperty timeBasedLinearProperty = TimeBasedLinearProperty.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html)
 */
@CdkDslMarker
public class CfnDeploymentConfigTimeBasedLinearPropertyDsl {
    private val cdkBuilder: CfnDeploymentConfig.TimeBasedLinearProperty.Builder =
        CfnDeploymentConfig.TimeBasedLinearProperty.builder()

    /**
     * @param linearInterval The number of minutes between each incremental traffic shift of a
     *   `TimeBasedLinear` deployment.
     */
    public fun linearInterval(linearInterval: Number) {
        cdkBuilder.linearInterval(linearInterval)
    }

    /**
     * @param linearPercentage The percentage of traffic that is shifted at the start of each
     *   increment of a `TimeBasedLinear` deployment.
     */
    public fun linearPercentage(linearPercentage: Number) {
        cdkBuilder.linearPercentage(linearPercentage)
    }

    public fun build(): CfnDeploymentConfig.TimeBasedLinearProperty = cdkBuilder.build()
}
