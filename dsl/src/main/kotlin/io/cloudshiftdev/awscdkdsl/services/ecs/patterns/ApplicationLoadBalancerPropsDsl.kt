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

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * Properties to define an application load balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * import software.amazon.awscdk.services.route53.*;
 * Certificate certificate;
 * HostedZone hostedZone;
 * ApplicationLoadBalancerProps applicationLoadBalancerProps =
 * ApplicationLoadBalancerProps.builder()
 * .listeners(List.of(ApplicationListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .certificate(certificate)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .idleTimeout(Duration.minutes(30))
 * .publicLoadBalancer(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerPropsDsl {
    private val cdkBuilder: ApplicationLoadBalancerProps.Builder =
        ApplicationLoadBalancerProps.builder()

    private val _listeners: MutableList<ApplicationListenerProps> = mutableListOf()

    /** @param domainName The domain name for the service, e.g. "api.example.com.". */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". */
    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
    }

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds. Can be between 1 and 4000
     *   seconds.
     */
    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    /** @param listeners Listeners (at least one listener) attached to this load balancer. */
    public fun listeners(listeners: ApplicationListenerPropsDsl.() -> Unit) {
        _listeners.add(ApplicationListenerPropsDsl().apply(listeners).build())
    }

    /** @param listeners Listeners (at least one listener) attached to this load balancer. */
    public fun listeners(listeners: Collection<ApplicationListenerProps>) {
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

    public fun build(): ApplicationLoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
