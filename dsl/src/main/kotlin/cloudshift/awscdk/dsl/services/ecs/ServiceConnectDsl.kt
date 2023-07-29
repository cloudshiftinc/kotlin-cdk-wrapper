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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.AppProtocol
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.Protocol
import software.amazon.awscdk.services.ecs.ServiceConnect

/**
 * ServiceConnect ValueObjectClass having by ContainerDefinition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AppProtocol appProtocol;
 * ServiceConnect serviceConnect = ServiceConnect.Builder.create(NetworkMode.NONE)
 * .containerPort(123)
 * // the properties below are optional
 * .appProtocol(appProtocol)
 * .hostPort(123)
 * .name("name")
 * .protocol(Protocol.TCP)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceConnectDsl(
    networkmode: NetworkMode,
) {
    private val cdkBuilder: ServiceConnect.Builder = ServiceConnect.Builder.create(networkmode)

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
     * @param containerPort The port number on the container that is bound to the user-specified or
     *   automatically assigned host port.
     */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
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

    public fun build(): ServiceConnect = cdkBuilder.build()
}
