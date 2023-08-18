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
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.IService
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.constructs.Construct

/**
 * Instance that is accessible using an IP address.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Service service;
 * IpInstance ipInstance = IpInstance.Builder.create(this, "MyIpInstance")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .ipv4("ipv4")
 * .ipv6("ipv6")
 * .port(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class IpInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: IpInstance.Builder = IpInstance.Builder.create(scope, id)

    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * If the service that you specify contains a template for an A record, the IPv4 address that
     * you want AWS Cloud Map to use for the value of the A record.
     *
     * Default: none
     *
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     *   address that you want AWS Cloud Map to use for the value of the A record.
     */
    public fun ipv4(ipv4: String) {
        cdkBuilder.ipv4(ipv4)
    }

    /**
     * If the service that you specify contains a template for an AAAA record, the IPv6 address that
     * you want AWS Cloud Map to use for the value of the AAAA record.
     *
     * Default: none
     *
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     *   address that you want AWS Cloud Map to use for the value of the AAAA record.
     */
    public fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
    }

    /**
     * The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     *
     * This value is also used for the port value in an SRV record if the service that you specify
     * includes an SRV record. You can also specify a default port that is applied to all instances
     * in the Service configuration.
     *
     * Default: 80
     *
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to.
     */
    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): IpInstance = cdkBuilder.build()
}
