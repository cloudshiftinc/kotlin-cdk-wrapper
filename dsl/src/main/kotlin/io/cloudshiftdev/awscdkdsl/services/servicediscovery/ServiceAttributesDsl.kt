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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.DiscoveryType
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * INamespace namespace;
 * ServiceAttributes serviceAttributes = ServiceAttributes.builder()
 * .dnsRecordType(DnsRecordType.A)
 * .namespace(namespace)
 * .routingPolicy(RoutingPolicy.WEIGHTED)
 * .serviceArn("serviceArn")
 * .serviceId("serviceId")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .discoveryType(DiscoveryType.API)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceAttributesDsl {
    private val cdkBuilder: ServiceAttributes.Builder = ServiceAttributes.builder()

    /** @param discoveryType the value to be set. */
    public fun discoveryType(discoveryType: DiscoveryType) {
        cdkBuilder.discoveryType(discoveryType)
    }

    /** @param dnsRecordType the value to be set. */
    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
        cdkBuilder.dnsRecordType(dnsRecordType)
    }

    /** @param namespace the value to be set. */
    public fun namespace(namespace: INamespace) {
        cdkBuilder.namespace(namespace)
    }

    /** @param routingPolicy the value to be set. */
    public fun routingPolicy(routingPolicy: RoutingPolicy) {
        cdkBuilder.routingPolicy(routingPolicy)
    }

    /** @param serviceArn the value to be set. */
    public fun serviceArn(serviceArn: String) {
        cdkBuilder.serviceArn(serviceArn)
    }

    /** @param serviceId the value to be set. */
    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    /** @param serviceName the value to be set. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): ServiceAttributes = cdkBuilder.build()
}
