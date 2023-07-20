@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationLoadBalancerPropsDsl {
    private val cdkBuilder: ApplicationLoadBalancerProps.Builder =
        ApplicationLoadBalancerProps.builder()

    private val _listeners: MutableList<ApplicationListenerProps> = mutableListOf()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
    }

    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun listeners(listeners: ApplicationListenerPropsDsl.() -> Unit) {
        _listeners.add(ApplicationListenerPropsDsl().apply(listeners).build())
    }

    public fun listeners(listeners: Collection<ApplicationListenerProps>) {
        _listeners.addAll(listeners)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
        cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): ApplicationLoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
