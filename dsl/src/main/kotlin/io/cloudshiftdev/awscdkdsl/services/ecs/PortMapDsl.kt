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
import software.amazon.awscdk.services.ecs.AppProtocol
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PortMap
import software.amazon.awscdk.services.ecs.Protocol

/**
 * PortMap ValueObjectClass having by ContainerDefinition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AppProtocol appProtocol;
 * PortMap portMap = PortMap.Builder.create(NetworkMode.NONE)
 * .containerPort(123)
 * // the properties below are optional
 * .appProtocol(appProtocol)
 * .containerPortRange("containerPortRange")
 * .hostPort(123)
 * .name("name")
 * .protocol(Protocol.TCP)
 * .build();
 * ```
 */
@CdkDslMarker
public class PortMapDsl(
    networkmode: NetworkMode,
) {
    private val cdkBuilder: PortMap.Builder = PortMap.Builder.create(networkmode)

    /**
     * The protocol used by Service Connect.
     *
     * Valid values are AppProtocol.http, AppProtocol.http2, and AppProtocol.grpc. The protocol
     * determines what telemetry will be shown in the ECS Console for Service Connect services using
     * this port mapping.
     *
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no app protocol
     *
     * @param appProtocol The protocol used by Service Connect.
     */
    public fun appProtocol(appProtocol: AppProtocol) {
        cdkBuilder.appProtocol(appProtocol)
    }

    /**
     * The port number on the container that is bound to the user-specified or automatically
     * assigned host port.
     *
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort. If you are using containers in a task with the
     * bridge network mode and you specify a container port and not a host port, your container
     * automatically receives a host port in the ephemeral port range.
     *
     * For more information, see hostPort. Port mappings that are automatically assigned in this way
     * do not count toward the 100 reserved ports limit of a container instance.
     *
     * If you want to expose a port range, you must specify `CONTAINER_PORT_USE_RANGE` as container
     * port.
     *
     * @param containerPort The port number on the container that is bound to the user-specified or
     *   automatically assigned host port.
     */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /**
     * The port number range on the container that's bound to the dynamically mapped host port
     * range.
     *
     * The following rules apply when you specify a `containerPortRange`:
     * * You must specify `CONTAINER_PORT_USE_RANGE` as `containerPort`
     * * You must use either the `bridge` network mode or the `awsvpc` network mode.
     * * The container instance must have at least version 1.67.0 of the container agent and at
     *   least version 1.67.0-1 of the `ecs-init` package
     * * You can specify a maximum of 100 port ranges per container.
     * * A port can only be included in one port mapping per container.
     * * You cannot specify overlapping port ranges.
     * * The first port in the range must be less than last port in the range.
     *
     * If you want to expose a single port, you must not set a range.
     *
     * @param containerPortRange The port number range on the container that's bound to the
     *   dynamically mapped host port range.
     */
    public fun containerPortRange(containerPortRange: String) {
        cdkBuilder.containerPortRange(containerPortRange)
    }

    /**
     * The port number on the container instance to reserve for your container.
     *
     * If you are using containers in a task with the awsvpc or host network mode, the hostPort can
     * either be left blank or set to the same value as the containerPort.
     *
     * If you are using containers in a task with the bridge network mode, you can specify a
     * non-reserved host port for your container port mapping, or you can omit the hostPort (or set
     * it to 0) while specifying a containerPort and your container automatically receives a port in
     * the ephemeral port range for your container instance operating system and Docker version.
     *
     * @param hostPort The port number on the container instance to reserve for your container.
     */
    public fun hostPort(hostPort: Number) {
        cdkBuilder.hostPort(hostPort)
    }

    /**
     * The name to give the port mapping.
     *
     * Name is required in order to use the port mapping with ECS Service Connect. This field may
     * only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no port mapping name
     *
     * @param name The name to give the port mapping.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The protocol used for the port mapping.
     *
     * Valid values are Protocol.TCP and Protocol.UDP.
     *
     * Default: TCP
     *
     * @param protocol The protocol used for the port mapping.
     */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): PortMap = cdkBuilder.build()
}
