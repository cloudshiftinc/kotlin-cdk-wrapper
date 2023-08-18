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
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint

/**
 * Use an Application Load Balancer as a Global Accelerator Endpoint.
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
public class ApplicationLoadBalancerEndpointDsl(
    loadBalancer: IApplicationLoadBalancer,
) {
    private val cdkBuilder: ApplicationLoadBalancerEndpoint.Builder =
        ApplicationLoadBalancerEndpoint.Builder.create(loadBalancer)

    /**
     * Forward the client IP address in an `X-Forwarded-For` header.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order to preserve the client
     * IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions. See the
     * GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if available
     *
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header.
     */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): ApplicationLoadBalancerEndpoint = cdkBuilder.build()
}
