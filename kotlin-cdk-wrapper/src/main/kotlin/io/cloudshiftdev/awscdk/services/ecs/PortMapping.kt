@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Port mappings allow containers to access ports on the host container instance to send or receive
 * traffic.
 *
 * Example:
 *
 * ```
 * ContainerDefinition container;
 * container.addPortMappings(PortMapping.builder()
 * .containerPort(ContainerDefinition.CONTAINER_PORT_USE_RANGE)
 * .containerPortRange("8080-8081")
 * .build());
 * ```
 */
public interface PortMapping {
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
   */
  public fun appProtocol(): AppProtocol? = unwrap(this).getAppProtocol()?.let(AppProtocol::wrap)

  /**
   * The port number on the container that is bound to the user-specified or automatically assigned
   * host port.
   *
   * If you are using containers in a task with the awsvpc or host network mode, exposed ports
   * should be specified using containerPort.
   * If you are using containers in a task with the bridge network mode and you specify a container
   * port and not a host port,
   * your container automatically receives a host port in the ephemeral port range.
   *
   * For more information, see hostPort.
   * Port mappings that are automatically assigned in this way do not count toward the 100 reserved
   * ports limit of a container instance.
   *
   * If you want to expose a port range, you must specify `CONTAINER_PORT_USE_RANGE` as container
   * port.
   */
  public fun containerPort(): Number

  /**
   * The port number range on the container that's bound to the dynamically mapped host port range.
   *
   * The following rules apply when you specify a `containerPortRange`:
   *
   * * You must specify `CONTAINER_PORT_USE_RANGE` as `containerPort`
   * * You must use either the `bridge` network mode or the `awsvpc` network mode.
   * * The container instance must have at least version 1.67.0 of the container agent and at least
   * version 1.67.0-1 of the `ecs-init` package
   * * You can specify a maximum of 100 port ranges per container.
   * * A port can only be included in one port mapping per container.
   * * You cannot specify overlapping port ranges.
   * * The first port in the range must be less than last port in the range.
   *
   * If you want to expose a single port, you must not set a range.
   */
  public fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

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
   */
  public fun hostPort(): Number? = unwrap(this).getHostPort()

  /**
   * The name to give the port mapping.
   *
   * Name is required in order to use the port mapping with ECS Service Connect.
   * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
   *
   * Default: - no port mapping name
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The protocol used for the port mapping.
   *
   * Valid values are Protocol.TCP and Protocol.UDP.
   *
   * Default: TCP
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * A builder for [PortMapping]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appProtocol The protocol used by Service Connect.
     * Valid values are AppProtocol.http, AppProtocol.http2, and
     * AppProtocol.grpc. The protocol determines what telemetry will be shown in the ECS Console for
     * Service Connect services using this port mapping.
     *
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     */
    public fun appProtocol(appProtocol: AppProtocol)

    /**
     * @param containerPort The port number on the container that is bound to the user-specified or
     * automatically assigned host port. 
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
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param containerPortRange The port number range on the container that's bound to the
     * dynamically mapped host port range.
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
     */
    public fun containerPortRange(containerPortRange: String)

    /**
     * @param hostPort The port number on the container instance to reserve for your container.
     * If you are using containers in a task with the awsvpc or host network mode,
     * the hostPort can either be left blank or set to the same value as the containerPort.
     *
     * If you are using containers in a task with the bridge network mode,
     * you can specify a non-reserved host port for your container port mapping, or
     * you can omit the hostPort (or set it to 0) while specifying a containerPort and
     * your container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     */
    public fun hostPort(hostPort: Number)

    /**
     * @param name The name to give the port mapping.
     * Name is required in order to use the port mapping with ECS Service Connect.
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     */
    public fun name(name: String)

    /**
     * @param protocol The protocol used for the port mapping.
     * Valid values are Protocol.TCP and Protocol.UDP.
     */
    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.PortMapping.Builder =
        software.amazon.awscdk.services.ecs.PortMapping.builder()

    /**
     * @param appProtocol The protocol used by Service Connect.
     * Valid values are AppProtocol.http, AppProtocol.http2, and
     * AppProtocol.grpc. The protocol determines what telemetry will be shown in the ECS Console for
     * Service Connect services using this port mapping.
     *
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     */
    override fun appProtocol(appProtocol: AppProtocol) {
      cdkBuilder.appProtocol(appProtocol.let(AppProtocol.Companion::unwrap))
    }

    /**
     * @param containerPort The port number on the container that is bound to the user-specified or
     * automatically assigned host port. 
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
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param containerPortRange The port number range on the container that's bound to the
     * dynamically mapped host port range.
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
     */
    override fun containerPortRange(containerPortRange: String) {
      cdkBuilder.containerPortRange(containerPortRange)
    }

    /**
     * @param hostPort The port number on the container instance to reserve for your container.
     * If you are using containers in a task with the awsvpc or host network mode,
     * the hostPort can either be left blank or set to the same value as the containerPort.
     *
     * If you are using containers in a task with the bridge network mode,
     * you can specify a non-reserved host port for your container port mapping, or
     * you can omit the hostPort (or set it to 0) while specifying a containerPort and
     * your container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     */
    override fun hostPort(hostPort: Number) {
      cdkBuilder.hostPort(hostPort)
    }

    /**
     * @param name The name to give the port mapping.
     * Name is required in order to use the port mapping with ECS Service Connect.
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param protocol The protocol used for the port mapping.
     * Valid values are Protocol.TCP and Protocol.UDP.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.PortMapping = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.PortMapping,
  ) : CdkObject(cdkObject), PortMapping {
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
     */
    override fun appProtocol(): AppProtocol? = unwrap(this).getAppProtocol()?.let(AppProtocol::wrap)

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
     */
    override fun containerPort(): Number = unwrap(this).getContainerPort()

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
     */
    override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

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
     */
    override fun hostPort(): Number? = unwrap(this).getHostPort()

    /**
     * The name to give the port mapping.
     *
     * Name is required in order to use the port mapping with ECS Service Connect.
     * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
     *
     * Default: - no port mapping name
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The protocol used for the port mapping.
     *
     * Valid values are Protocol.TCP and Protocol.UDP.
     *
     * Default: TCP
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PortMapping): PortMapping =
        CdkObjectWrappers.wrap(cdkObject) as? PortMapping ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortMapping): software.amazon.awscdk.services.ecs.PortMapping =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.PortMapping
  }
}
