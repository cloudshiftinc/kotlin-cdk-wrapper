@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * ServiceConnect ValueObjectClass having by ContainerDefinition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * AppProtocol appProtocol;
 * ServiceConnect serviceConnect = ServiceConnect.Builder.create(NetworkMode.NONE)
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
public open class ServiceConnect(
  cdkObject: software.amazon.awscdk.services.ecs.ServiceConnect,
) : CdkObject(cdkObject) {
  public constructor(networkmode: NetworkMode, pm: PortMapping) :
      this(software.amazon.awscdk.services.ecs.ServiceConnect(networkmode.let(NetworkMode.Companion::unwrap),
      pm.let(PortMapping.Companion::unwrap))
  )

  public constructor(networkmode: NetworkMode, pm: PortMapping.Builder.() -> Unit) :
      this(networkmode, PortMapping(pm)
  )

  /**
   * Judge parameters can be serviceconnect logick.
   *
   * If parameters can be serviceConnect return true.
   */
  public open fun isServiceConnect(): Boolean = unwrap(this).isServiceConnect()

  /**
   * The networking mode to use for the containers in the task.
   */
  public open fun networkmode(): NetworkMode = unwrap(this).getNetworkmode().let(NetworkMode::wrap)

  /**
   * Port mappings allow containers to access ports on the host container instance to send or
   * receive traffic.
   */
  public open fun portmapping(): PortMapping = unwrap(this).getPortmapping().let(PortMapping::wrap)

  /**
   * Judge serviceconnect parametes are valid.
   *
   * If invalid, throw Error.
   */
  public open fun validate() {
    unwrap(this).validate()
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.ServiceConnect].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The protocol used by Service Connect.
     *
     * Valid values are AppProtocol.http, AppProtocol.http2, and
     * AppProtocol.grpc. The protocol determines what telemetry will be shown in the ECS Console for
     * Service Connect services using this port mapping.
     *
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no app protocol
     *
     * @param appProtocol The protocol used by Service Connect. 
     */
    public fun appProtocol(appProtocol: AppProtocol)

    /**
     * The port number on the container that is bound to the user-specified or automatically
     * assigned host port.
     *
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * For more information, see hostPort.
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * If you want to expose a port range, you must specify `CONTAINER_PORT_USE_RANGE` as container
     * port.
     *
     * @param containerPort The port number on the container that is bound to the user-specified or
     * automatically assigned host port. 
     */
    public fun containerPort(containerPort: Number)

    /**
     * The port number range on the container that's bound to the dynamically mapped host port
     * range.
     *
     * The following rules apply when you specify a `containerPortRange`:
     *
     * * You must specify `CONTAINER_PORT_USE_RANGE` as `containerPort`
     * * You must use either the `bridge` network mode or the `awsvpc` network mode.
     * * The container instance must have at least version 1.67.0 of the container agent and at
     * least version 1.67.0-1 of the `ecs-init` package
     * * You can specify a maximum of 100 port ranges per container.
     * * A port can only be included in one port mapping per container.
     * * You cannot specify overlapping port ranges.
     * * The first port in the range must be less than last port in the range.
     *
     * If you want to expose a single port, you must not set a range.
     *
     * @param containerPortRange The port number range on the container that's bound to the
     * dynamically mapped host port range. 
     */
    public fun containerPortRange(containerPortRange: String)

    /**
     * The port number on the container instance to reserve for your container.
     *
     * If you are using containers in a task with the awsvpc or host network mode,
     * the hostPort can either be left blank or set to the same value as the containerPort.
     *
     * If you are using containers in a task with the bridge network mode,
     * you can specify a non-reserved host port for your container port mapping, or
     * you can omit the hostPort (or set it to 0) while specifying a containerPort and
     * your container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     *
     * @param hostPort The port number on the container instance to reserve for your container. 
     */
    public fun hostPort(hostPort: Number)

    /**
     * The name to give the port mapping.
     *
     * Name is required in order to use the port mapping with ECS Service Connect.
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no port mapping name
     *
     * @param name The name to give the port mapping. 
     */
    public fun name(name: String)

    /**
     * The protocol used for the port mapping.
     *
     * Valid values are Protocol.TCP and Protocol.UDP.
     *
     * Default: TCP
     *
     * @param protocol The protocol used for the port mapping. 
     */
    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl(
    networkmode: software.amazon.awscdk.services.ecs.NetworkMode,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceConnect.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnect.Builder.create(networkmode)

    /**
     * The protocol used by Service Connect.
     *
     * Valid values are AppProtocol.http, AppProtocol.http2, and
     * AppProtocol.grpc. The protocol determines what telemetry will be shown in the ECS Console for
     * Service Connect services using this port mapping.
     *
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no app protocol
     *
     * @param appProtocol The protocol used by Service Connect. 
     */
    override fun appProtocol(appProtocol: AppProtocol) {
      cdkBuilder.appProtocol(appProtocol.let(AppProtocol.Companion::unwrap))
    }

    /**
     * The port number on the container that is bound to the user-specified or automatically
     * assigned host port.
     *
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * For more information, see hostPort.
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * If you want to expose a port range, you must specify `CONTAINER_PORT_USE_RANGE` as container
     * port.
     *
     * @param containerPort The port number on the container that is bound to the user-specified or
     * automatically assigned host port. 
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * The port number range on the container that's bound to the dynamically mapped host port
     * range.
     *
     * The following rules apply when you specify a `containerPortRange`:
     *
     * * You must specify `CONTAINER_PORT_USE_RANGE` as `containerPort`
     * * You must use either the `bridge` network mode or the `awsvpc` network mode.
     * * The container instance must have at least version 1.67.0 of the container agent and at
     * least version 1.67.0-1 of the `ecs-init` package
     * * You can specify a maximum of 100 port ranges per container.
     * * A port can only be included in one port mapping per container.
     * * You cannot specify overlapping port ranges.
     * * The first port in the range must be less than last port in the range.
     *
     * If you want to expose a single port, you must not set a range.
     *
     * @param containerPortRange The port number range on the container that's bound to the
     * dynamically mapped host port range. 
     */
    override fun containerPortRange(containerPortRange: String) {
      cdkBuilder.containerPortRange(containerPortRange)
    }

    /**
     * The port number on the container instance to reserve for your container.
     *
     * If you are using containers in a task with the awsvpc or host network mode,
     * the hostPort can either be left blank or set to the same value as the containerPort.
     *
     * If you are using containers in a task with the bridge network mode,
     * you can specify a non-reserved host port for your container port mapping, or
     * you can omit the hostPort (or set it to 0) while specifying a containerPort and
     * your container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     *
     * @param hostPort The port number on the container instance to reserve for your container. 
     */
    override fun hostPort(hostPort: Number) {
      cdkBuilder.hostPort(hostPort)
    }

    /**
     * The name to give the port mapping.
     *
     * Name is required in order to use the port mapping with ECS Service Connect.
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no port mapping name
     *
     * @param name The name to give the port mapping. 
     */
    override fun name(name: String) {
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
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnect = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(networkmode: NetworkMode, block: Builder.() -> Unit = {}):
        ServiceConnect {
      val builderImpl = BuilderImpl(NetworkMode.unwrap(networkmode))
      return ServiceConnect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnect): ServiceConnect
        = ServiceConnect(cdkObject)

    internal fun unwrap(wrapped: ServiceConnect): software.amazon.awscdk.services.ecs.ServiceConnect
        = wrapped.cdkObject as software.amazon.awscdk.services.ecs.ServiceConnect
  }
}
