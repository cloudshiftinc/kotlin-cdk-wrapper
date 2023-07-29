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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * Properties to define an network load balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * import software.amazon.awscdk.services.route53.*;
 * HostedZone hostedZone;
 * NetworkLoadBalancerProps networkLoadBalancerProps = NetworkLoadBalancerProps.builder()
 * .listeners(List.of(NetworkListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .publicLoadBalancer(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkLoadBalancerPropsDsl {
    private val cdkBuilder: NetworkLoadBalancerProps.Builder = NetworkLoadBalancerProps.builder()

    private val _listeners: MutableList<NetworkListenerProps> = mutableListOf()

    /** @param domainName The domain name for the service, e.g. "api.example.com.". */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". */
    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
    }

    /** @param listeners Listeners (at least one listener) attached to this load balancer. */
    public fun listeners(listeners: NetworkListenerPropsDsl.() -> Unit) {
        _listeners.add(NetworkListenerPropsDsl().apply(listeners).build())
    }

    /** @param listeners Listeners (at least one listener) attached to this load balancer. */
    public fun listeners(listeners: Collection<NetworkListenerProps>) {
        _listeners.addAll(listeners)
    }

    /** @param name Name of the load balancer. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing. */
    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
        cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): NetworkLoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
