package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ServiceConnectService {
  /**
   * Optionally specifies an intermediate dns name to register in the CloudMap namespace.
   *
   * This is required if you wish to use the same port mapping name in more than one service.
   *
   * Default: - port mapping name
   */
  public fun discoveryName(): String? = unwrap(this).getDiscoveryName()

  /**
   * The terse DNS alias to use for this port mapping in the service connect mesh.
   *
   * Service Connect-enabled clients will be able to reach this service at
   * http://dnsName:port.
   *
   * Default: - No alias is created. The service is reachable at `portMappingName.namespace:port`.
   */
  public fun dnsName(): String? = unwrap(this).getDnsName()

  /**
   * The amount of time in seconds a connection for Service Connect will stay active while idle.
   *
   * A value of 0 can be set to disable `idleTimeout`.
   *
   * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
   * close
   * when the `idleTimeout` is reached and not the `perRequestTimeout`.
   *
   * Default: - Duration.minutes(5) for HTTP/HTTP2/GRPC, Duration.hours(1) for TCP.
   */
  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  /**
   * Optional.
   *
   * The port on the Service Connect agent container to use for traffic ingress to this service.
   *
   * Default: - none
   */
  public fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

  /**
   * The amount of time waiting for the upstream to respond with a complete response per request for
   * Service Connect.
   *
   * A value of 0 can be set to disable `perRequestTimeout`.
   * Can only be set when the `appProtocol` for the application container is HTTP/HTTP2/GRPC.
   *
   * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
   * close
   * when the `idleTimeout` is reached and not the `perRequestTimeout`.
   *
   * Default: - Duration.seconds(15)
   */
  public fun perRequestTimeout(): Duration? =
      unwrap(this).getPerRequestTimeout()?.let(Duration::wrap)

  /**
   * The port for clients to use to communicate with this service via Service Connect.
   *
   * Default: the container port specified by the port mapping in portMappingName.
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * portMappingName specifies which port and protocol combination should be used for this service
   * connect service.
   */
  public fun portMappingName(): String

  /**
   * A builder for [ServiceConnectService]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param discoveryName Optionally specifies an intermediate dns name to register in the
     * CloudMap namespace.
     * This is required if you wish to use the same port mapping name in more than one service.
     */
    public fun discoveryName(discoveryName: String)

    /**
     * @param dnsName The terse DNS alias to use for this port mapping in the service connect mesh.
     * Service Connect-enabled clients will be able to reach this service at
     * http://dnsName:port.
     */
    public fun dnsName(dnsName: String)

    /**
     * @param idleTimeout The amount of time in seconds a connection for Service Connect will stay
     * active while idle.
     * A value of 0 can be set to disable `idleTimeout`.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * @param ingressPortOverride Optional.
     * The port on the Service Connect agent container to use for traffic ingress to this service.
     */
    public fun ingressPortOverride(ingressPortOverride: Number)

    /**
     * @param perRequestTimeout The amount of time waiting for the upstream to respond with a
     * complete response per request for Service Connect.
     * A value of 0 can be set to disable `perRequestTimeout`.
     * Can only be set when the `appProtocol` for the application container is HTTP/HTTP2/GRPC.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    public fun perRequestTimeout(perRequestTimeout: Duration)

    /**
     * @param port The port for clients to use to communicate with this service via Service Connect.
     */
    public fun port(port: Number)

    /**
     * @param portMappingName portMappingName specifies which port and protocol combination should
     * be used for this service connect service. 
     */
    public fun portMappingName(portMappingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceConnectService.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnectService.builder()

    /**
     * @param discoveryName Optionally specifies an intermediate dns name to register in the
     * CloudMap namespace.
     * This is required if you wish to use the same port mapping name in more than one service.
     */
    override fun discoveryName(discoveryName: String) {
      cdkBuilder.discoveryName(discoveryName)
    }

    /**
     * @param dnsName The terse DNS alias to use for this port mapping in the service connect mesh.
     * Service Connect-enabled clients will be able to reach this service at
     * http://dnsName:port.
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param idleTimeout The amount of time in seconds a connection for Service Connect will stay
     * active while idle.
     * A value of 0 can be set to disable `idleTimeout`.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    /**
     * @param ingressPortOverride Optional.
     * The port on the Service Connect agent container to use for traffic ingress to this service.
     */
    override fun ingressPortOverride(ingressPortOverride: Number) {
      cdkBuilder.ingressPortOverride(ingressPortOverride)
    }

    /**
     * @param perRequestTimeout The amount of time waiting for the upstream to respond with a
     * complete response per request for Service Connect.
     * A value of 0 can be set to disable `perRequestTimeout`.
     * Can only be set when the `appProtocol` for the application container is HTTP/HTTP2/GRPC.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     */
    override fun perRequestTimeout(perRequestTimeout: Duration) {
      cdkBuilder.perRequestTimeout(perRequestTimeout.let(Duration::unwrap))
    }

    /**
     * @param port The port for clients to use to communicate with this service via Service Connect.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param portMappingName portMappingName specifies which port and protocol combination should
     * be used for this service connect service. 
     */
    override fun portMappingName(portMappingName: String) {
      cdkBuilder.portMappingName(portMappingName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnectService =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectService,
  ) : ServiceConnectService {
    /**
     * Optionally specifies an intermediate dns name to register in the CloudMap namespace.
     *
     * This is required if you wish to use the same port mapping name in more than one service.
     *
     * Default: - port mapping name
     */
    override fun discoveryName(): String? = unwrap(this).getDiscoveryName()

    /**
     * The terse DNS alias to use for this port mapping in the service connect mesh.
     *
     * Service Connect-enabled clients will be able to reach this service at
     * http://dnsName:port.
     *
     * Default: - No alias is created. The service is reachable at `portMappingName.namespace:port`.
     */
    override fun dnsName(): String? = unwrap(this).getDnsName()

    /**
     * The amount of time in seconds a connection for Service Connect will stay active while idle.
     *
     * A value of 0 can be set to disable `idleTimeout`.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     *
     * Default: - Duration.minutes(5) for HTTP/HTTP2/GRPC, Duration.hours(1) for TCP.
     */
    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    /**
     * Optional.
     *
     * The port on the Service Connect agent container to use for traffic ingress to this service.
     *
     * Default: - none
     */
    override fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

    /**
     * The amount of time waiting for the upstream to respond with a complete response per request
     * for Service Connect.
     *
     * A value of 0 can be set to disable `perRequestTimeout`.
     * Can only be set when the `appProtocol` for the application container is HTTP/HTTP2/GRPC.
     *
     * If `idleTimeout` is set to a time that is less than `perRequestTimeout`, the connection will
     * close
     * when the `idleTimeout` is reached and not the `perRequestTimeout`.
     *
     * Default: - Duration.seconds(15)
     */
    override fun perRequestTimeout(): Duration? =
        unwrap(this).getPerRequestTimeout()?.let(Duration::wrap)

    /**
     * The port for clients to use to communicate with this service via Service Connect.
     *
     * Default: the container port specified by the port mapping in portMappingName.
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * portMappingName specifies which port and protocol combination should be used for this service
     * connect service.
     */
    override fun portMappingName(): String = unwrap(this).getPortMappingName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectService {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectService):
        ServiceConnectService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceConnectService):
        software.amazon.awscdk.services.ecs.ServiceConnectService = (wrapped as Wrapper).cdkObject
  }
}
