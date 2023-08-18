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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

/**
 * Defines the traffic routing strategy during an endpoint deployment to shift traffic from the old
 * fleet to the new fleet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
 * TrafficRoutingConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html)
 */
@CdkDslMarker
public class CfnEndpointTrafficRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.TrafficRoutingConfigProperty.Builder =
        CfnEndpoint.TrafficRoutingConfigProperty.builder()

    /**
     * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet.
     *   `Value` must be less than or equal to 50% of the variant's total instance count.
     */
    public fun canarySize(canarySize: IResolvable) {
        cdkBuilder.canarySize(canarySize)
    }

    /**
     * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet.
     *   `Value` must be less than or equal to 50% of the variant's total instance count.
     */
    public fun canarySize(canarySize: CfnEndpoint.CapacitySizeProperty) {
        cdkBuilder.canarySize(canarySize)
    }

    /**
     * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet.
     *   `Value` must be 10-50% of the variant's total instance count.
     */
    public fun linearStepSize(linearStepSize: IResolvable) {
        cdkBuilder.linearStepSize(linearStepSize)
    }

    /**
     * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet.
     *   `Value` must be 10-50% of the variant's total instance count.
     */
    public fun linearStepSize(linearStepSize: CfnEndpoint.CapacitySizeProperty) {
        cdkBuilder.linearStepSize(linearStepSize)
    }

    /**
     * @param type Traffic routing strategy type.
     * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
     * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
     *   canary, which is a small portion of the traffic. The second step is the remainder of the
     *   traffic.
     * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param waitIntervalInSeconds The waiting time (in seconds) between incremental steps to turn
     *   on traffic on the new endpoint fleet.
     */
    public fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
    }

    public fun build(): CfnEndpoint.TrafficRoutingConfigProperty = cdkBuilder.build()
}
