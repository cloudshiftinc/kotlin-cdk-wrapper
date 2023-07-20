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
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import software.amazon.awscdk.services.servicediscovery.Service
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Service.Builder = Service.Builder.create(scope, id)

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

    public fun namespace(namespace: INamespace) {
        cdkBuilder.namespace(namespace)
    }

    public fun routingPolicy(routingPolicy: RoutingPolicy) {
        cdkBuilder.routingPolicy(routingPolicy)
    }

    public fun build(): Service = cdkBuilder.build()
}
