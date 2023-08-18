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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps

/**
 * Properties for a NetworkLoadBalancerEndpoint.
 *
 * Example:
 * ```
 * Listener listener;
 * CfnEIP eip;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * CfnEipEndpoint.Builder.create(eip)
 * .weight(128)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class CfnEipEndpointPropsDsl {
    private val cdkBuilder: CfnEipEndpointProps.Builder = CfnEipEndpointProps.builder()

    /**
     * @param weight Endpoint weight across all endpoints in the group. Must be a value between 0
     *   and 255.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEipEndpointProps = cdkBuilder.build()
}
