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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.servicediscovery.DiscoveryType
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import software.amazon.awscdk.services.servicediscovery.ServiceProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.servicediscovery.*;
 * INamespace namespace;
 * ServiceProps serviceProps = ServiceProps.builder()
 * .namespace(namespace)
 * // the properties below are optional
 * .customHealthCheck(HealthCheckCustomConfig.builder()
 * .failureThreshold(123)
 * .build())
 * .description("description")
 * .discoveryType(DiscoveryType.API)
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.minutes(30))
 * .healthCheck(HealthCheckConfig.builder()
 * .failureThreshold(123)
 * .resourcePath("resourcePath")
 * .type(HealthCheckType.HTTP)
 * .build())
 * .loadBalancer(false)
 * .name("name")
 * .routingPolicy(RoutingPolicy.WEIGHTED)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServicePropsDsl {
    private val cdkBuilder: ServiceProps.Builder = ServiceProps.builder()

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     *   Only one of healthCheckConfig or healthCheckCustomConfig can be specified. See:
     *   https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfigDsl.() -> Unit = {}) {
        val builder = HealthCheckCustomConfigDsl()
        builder.apply(customHealthCheck)
        cdkBuilder.customHealthCheck(builder.build())
    }

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     *   Only one of healthCheckConfig or healthCheckCustomConfig can be specified. See:
     *   https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
        cdkBuilder.customHealthCheck(customHealthCheck)
    }

    /** @param description A description of the service. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param discoveryType Controls how instances within this service can be discovered. */
    public fun discoveryType(discoveryType: DiscoveryType) {
        cdkBuilder.discoveryType(discoveryType)
    }

    /**
     * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create.
     *   Supported record types include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
        cdkBuilder.dnsRecordType(dnsRecordType)
    }

    /**
     * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the
     *   settings for this record.
     */
    public fun dnsTtl(dnsTtl: Duration) {
        cdkBuilder.dnsTtl(dnsTtl)
    }

    /**
     * @param healthCheck Settings for an optional health check. If you specify health check
     *   settings, AWS Cloud Map associates the health check with the records that you specify in
     *   DnsConfig. Only one of healthCheckConfig or healthCheckCustomConfig can be specified. Not
     *   valid for PrivateDnsNamespaces. If you use healthCheck, you can only register IP instances
     *   to this service.
     */
    public fun healthCheck(healthCheck: HealthCheckConfigDsl.() -> Unit = {}) {
        val builder = HealthCheckConfigDsl()
        builder.apply(healthCheck)
        cdkBuilder.healthCheck(builder.build())
    }

    /**
     * @param healthCheck Settings for an optional health check. If you specify health check
     *   settings, AWS Cloud Map associates the health check with the records that you specify in
     *   DnsConfig. Only one of healthCheckConfig or healthCheckCustomConfig can be specified. Not
     *   valid for PrivateDnsNamespaces. If you use healthCheck, you can only register IP instances
     *   to this service.
     */
    public fun healthCheck(healthCheck: HealthCheckConfig) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered
     *   to it as an AliasTargetInstance. Setting this to `true` correctly configures the
     *   `routingPolicy` and performs some additional validation.
     */
    public fun loadBalancer(loadBalancer: Boolean) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    /** @param name A name for the Service. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param namespace The namespace that you want to use for DNS configuration. */
    public fun namespace(namespace: INamespace) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     *   Cloud Map creates when you register an instance and specify this service.
     */
    public fun routingPolicy(routingPolicy: RoutingPolicy) {
        cdkBuilder.routingPolicy(routingPolicy)
    }

    public fun build(): ServiceProps = cdkBuilder.build()
}
