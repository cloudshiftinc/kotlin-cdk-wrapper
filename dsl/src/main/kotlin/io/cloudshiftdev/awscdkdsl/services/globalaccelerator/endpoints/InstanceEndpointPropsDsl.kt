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
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps

/**
 * Properties for a NetworkLoadBalancerEndpoint.
 *
 * Example:
 * ```
 * Listener listener;
 * Instance instance;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * InstanceEndpoint.Builder.create(instance)
 * .weight(128)
 * .preserveClientIp(true)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class InstanceEndpointPropsDsl {
    private val cdkBuilder: InstanceEndpointProps.Builder = InstanceEndpointProps.builder()

    /**
     * @param preserveClientIp Forward the client IP address. GlobalAccelerator will create Network
     *   Interfaces in your VPC in order to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions. See the
     * GlobalAccelerator Developer Guide for a list.
     */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * @param weight Endpoint weight across all endpoints in the group. Must be a value between 0
     *   and 255.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): InstanceEndpointProps = cdkBuilder.build()
}
