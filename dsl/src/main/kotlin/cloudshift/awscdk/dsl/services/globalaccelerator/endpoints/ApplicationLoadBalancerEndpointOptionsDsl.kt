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

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions

/**
 * Properties for a ApplicationLoadBalancerEndpoint.
 *
 * Example:
 * ```
 * ApplicationLoadBalancer alb;
 * Listener listener;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * ApplicationLoadBalancerEndpoint.Builder.create(alb)
 * .weight(128)
 * .preserveClientIp(true)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerEndpointOptionsDsl {
    private val cdkBuilder: ApplicationLoadBalancerEndpointOptions.Builder =
        ApplicationLoadBalancerEndpointOptions.builder()

    /**
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header.
     *   GlobalAccelerator will create Network Interfaces in your VPC in order to preserve the
     *   client IP address.
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

    public fun build(): ApplicationLoadBalancerEndpointOptions = cdkBuilder.build()
}
