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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.servicediscovery.DiscoveryType
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.DnsServiceProps
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DnsServicePropsDsl {
    private val cdkBuilder: DnsServiceProps.Builder = DnsServiceProps.builder()

    public fun customHealthCheck(block: HealthCheckCustomConfigDsl.() -> Unit = {}) {
        val builder = HealthCheckCustomConfigDsl()
        builder.apply(block)
        cdkBuilder.customHealthCheck(builder.build())
    }

    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
        cdkBuilder.customHealthCheck(customHealthCheck)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun discoveryType(discoveryType: DiscoveryType) {
        cdkBuilder.discoveryType(discoveryType)
    }

    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
        cdkBuilder.dnsRecordType(dnsRecordType)
    }

    public fun dnsTtl(dnsTtl: Duration) {
        cdkBuilder.dnsTtl(dnsTtl)
    }

    public fun healthCheck(block: HealthCheckConfigDsl.() -> Unit = {}) {
        val builder = HealthCheckConfigDsl()
        builder.apply(block)
        cdkBuilder.healthCheck(builder.build())
    }

    public fun healthCheck(healthCheck: HealthCheckConfig) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun loadBalancer(loadBalancer: Boolean) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun routingPolicy(routingPolicy: RoutingPolicy) {
        cdkBuilder.routingPolicy(routingPolicy)
    }

    public fun build(): DnsServiceProps = cdkBuilder.build()
}
