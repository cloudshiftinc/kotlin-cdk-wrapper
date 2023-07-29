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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

/**
 * The configuration that specifies how traffic is shifted from one version of a Lambda function to
 * another version during an AWS Lambda deployment, or from one Amazon ECS task set to another
 * during an Amazon ECS deployment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
 * TrafficRoutingConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .timeBasedCanary(TimeBasedCanaryProperty.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build())
 * .timeBasedLinear(TimeBasedLinearProperty.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html)
 */
@CdkDslMarker
public class CfnDeploymentConfigTrafficRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder =
        CfnDeploymentConfig.TrafficRoutingConfigProperty.builder()

    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     *   function or ECS task set to another in two increments. The original and target Lambda
     *   function versions or ECS task sets are specified in the deployment's AppSpec file.
     */
    public fun timeBasedCanary(timeBasedCanary: IResolvable) {
        cdkBuilder.timeBasedCanary(timeBasedCanary)
    }

    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     *   function or ECS task set to another in two increments. The original and target Lambda
     *   function versions or ECS task sets are specified in the deployment's AppSpec file.
     */
    public fun timeBasedCanary(timeBasedCanary: CfnDeploymentConfig.TimeBasedCanaryProperty) {
        cdkBuilder.timeBasedCanary(timeBasedCanary)
    }

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     *   function or Amazon ECS task set to another in equal increments, with an equal number of
     *   minutes between each increment. The original and target Lambda function versions or Amazon
     *   ECS task sets are specified in the deployment's AppSpec file.
     */
    public fun timeBasedLinear(timeBasedLinear: IResolvable) {
        cdkBuilder.timeBasedLinear(timeBasedLinear)
    }

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     *   function or Amazon ECS task set to another in equal increments, with an equal number of
     *   minutes between each increment. The original and target Lambda function versions or Amazon
     *   ECS task sets are specified in the deployment's AppSpec file.
     */
    public fun timeBasedLinear(timeBasedLinear: CfnDeploymentConfig.TimeBasedLinearProperty) {
        cdkBuilder.timeBasedLinear(timeBasedLinear)
    }

    /**
     * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a
     *   deployment configuration.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDeploymentConfig.TrafficRoutingConfigProperty = cdkBuilder.build()
}
