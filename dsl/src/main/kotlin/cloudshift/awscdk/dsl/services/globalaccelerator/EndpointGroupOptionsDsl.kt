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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions
import software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol
import software.amazon.awscdk.services.globalaccelerator.IEndpoint
import software.amazon.awscdk.services.globalaccelerator.PortOverride

/**
 * Basic options for creating a new EndpointGroup.
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
public class EndpointGroupOptionsDsl {
    private val cdkBuilder: EndpointGroupOptions.Builder = EndpointGroupOptions.builder()

    private val _endpoints: MutableList<IEndpoint> = mutableListOf()

    private val _portOverrides: MutableList<PortOverride> = mutableListOf()

    /** @param endpointGroupName Name of the endpoint group. */
    public fun endpointGroupName(endpointGroupName: String) {
        cdkBuilder.endpointGroupName(endpointGroupName)
    }

    /** @param endpoints Initial list of endpoints for this group. */
    public fun endpoints(vararg endpoints: IEndpoint) {
        _endpoints.addAll(listOf(*endpoints))
    }

    /** @param endpoints Initial list of endpoints for this group. */
    public fun endpoints(endpoints: Collection<IEndpoint>) {
        _endpoints.addAll(endpoints)
    }

    /**
     * @param healthCheckInterval The time between health checks for each endpoint. Must be either
     *   10 or 30 seconds.
     */
    public fun healthCheckInterval(healthCheckInterval: Duration) {
        cdkBuilder.healthCheckInterval(healthCheckInterval)
    }

    /** @param healthCheckPath The ping path for health checks (if the protocol is HTTP(S)). */
    public fun healthCheckPath(healthCheckPath: String) {
        cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /** @param healthCheckPort The port used to perform health checks. */
    public fun healthCheckPort(healthCheckPort: Number) {
        cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /** @param healthCheckProtocol The protocol used to perform health checks. */
    public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
        cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /**
     * @param healthCheckThreshold The number of consecutive health checks required to set the state
     *   of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     */
    public fun healthCheckThreshold(healthCheckThreshold: Number) {
        cdkBuilder.healthCheckThreshold(healthCheckThreshold)
    }

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     *   Unless overridden, the port used to hit the endpoint will be the same as the port that
     *   traffic arrives on at the listener.
     */
    public fun portOverrides(portOverrides: PortOverrideDsl.() -> Unit) {
        _portOverrides.add(PortOverrideDsl().apply(portOverrides).build())
    }

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     *   Unless overridden, the port used to hit the endpoint will be the same as the port that
     *   traffic arrives on at the listener.
     */
    public fun portOverrides(portOverrides: Collection<PortOverride>) {
        _portOverrides.addAll(portOverrides)
    }

    /** @param region The AWS Region where the endpoint group is located. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param trafficDialPercentage The percentage of traffic to send to this AWS Region. The
     *   percentage is applied to the traffic that would otherwise have been routed to the Region
     *   based on optimal routing. Additional traffic is distributed to other endpoint groups for
     *   this listener.
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number) {
        cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): EndpointGroupOptions {
        if (_endpoints.isNotEmpty()) cdkBuilder.endpoints(_endpoints)
        if (_portOverrides.isNotEmpty()) cdkBuilder.portOverrides(_portOverrides)
        return cdkBuilder.build()
    }
}
