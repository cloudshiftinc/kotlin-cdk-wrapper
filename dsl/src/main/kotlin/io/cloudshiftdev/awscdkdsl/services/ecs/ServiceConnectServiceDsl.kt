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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.ServiceConnectService

/**
 * Interface for service connect Service props.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectService serviceConnectService = ServiceConnectService.builder()
 * .portMappingName("portMappingName")
 * // the properties below are optional
 * .discoveryName("discoveryName")
 * .dnsName("dnsName")
 * .idleTimeout(Duration.minutes(30))
 * .ingressPortOverride(123)
 * .perRequestTimeout(Duration.minutes(30))
 * .port(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceConnectServiceDsl {
    private val cdkBuilder: ServiceConnectService.Builder = ServiceConnectService.builder()

    /**
     * @param discoveryName Optionally specifies an intermediate dns name to register in the
     *   CloudMap namespace. This is required if you wish to use the same port mapping name in more
     *   than one service.
     */
    public fun discoveryName(discoveryName: String) {
        cdkBuilder.discoveryName(discoveryName)
    }

    /**
     * @param dnsName The terse DNS alias to use for this port mapping in the service connect mesh.
     *   Service Connect-enabled clients will be able to reach this service at http://dnsName:port.
     */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param idleTimeout The amount of time in seconds a connection for Service Connect will stay
     *   active while idle. A value of 0 can be set to disable `idleTimeout`.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    /**
     * @param ingressPortOverride Optional. The port on the Service Connect agent container to use
     *   for traffic ingress to this service.
     */
    public fun ingressPortOverride(ingressPortOverride: Number) {
        cdkBuilder.ingressPortOverride(ingressPortOverride)
    }

    /**
     * @param perRequestTimeout The amount of time waiting for the upstream to respond with a
     *   complete response per request for Service Connect. A value of 0 can be set to disable
     *   `perRequestTimeout`. Can only be set when the `appProtocol` for the application container
     *   is HTTP/HTTP2/GRPC.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    public fun perRequestTimeout(perRequestTimeout: Duration) {
        cdkBuilder.perRequestTimeout(perRequestTimeout)
    }

    /**
     * @param port The port for clients to use to communicate with this service via Service Connect.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param portMappingName portMappingName specifies which port and protocol combination should
     *   be used for this service connect service.
     */
    public fun portMappingName(portMappingName: String) {
        cdkBuilder.portMappingName(portMappingName)
    }

    public fun build(): ServiceConnectService = cdkBuilder.build()
}
