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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

/**
 * Update policy for a blue/green deployment.
 *
 * If this update policy is specified, SageMaker creates a new fleet during the deployment while
 * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
 * traffic routing configuration. Only one update policy should be used in the deployment
 * configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy
 * with all at once traffic shifting by default.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * BlueGreenUpdatePolicyProperty blueGreenUpdatePolicyProperty =
 * BlueGreenUpdatePolicyProperty.builder()
 * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .canarySize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .linearStepSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * .build())
 * // the properties below are optional
 * .maximumExecutionTimeoutInSeconds(123)
 * .terminationWaitInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html)
 */
@CdkDslMarker
public class CfnEndpointBlueGreenUpdatePolicyPropertyDsl {
    private val cdkBuilder: CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder =
        CfnEndpoint.BlueGreenUpdatePolicyProperty.builder()

    /**
     * @param maximumExecutionTimeoutInSeconds Maximum execution timeout for the deployment. Note
     *   that the timeout value should be larger than the total waiting time specified in
     *   `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
     */
    public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
    }

    /**
     * @param terminationWaitInSeconds Additional waiting time in seconds after the completion of an
     *   endpoint deployment before terminating the old endpoint fleet. Default is 0.
     */
    public fun terminationWaitInSeconds(terminationWaitInSeconds: Number) {
        cdkBuilder.terminationWaitInSeconds(terminationWaitInSeconds)
    }

    /**
     * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from
     *   the old fleet to the new fleet during an endpoint deployment.
     */
    public fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
    }

    /**
     * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from
     *   the old fleet to the new fleet during an endpoint deployment.
     */
    public fun trafficRoutingConfiguration(
        trafficRoutingConfiguration: CfnEndpoint.TrafficRoutingConfigProperty
    ) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
    }

    public fun build(): CfnEndpoint.BlueGreenUpdatePolicyProperty = cdkBuilder.build()
}
