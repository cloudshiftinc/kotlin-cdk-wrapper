package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ListenerOptions {
  /**
   * Client affinity to direct all requests from a user to the same endpoint.
   *
   * If you have stateful applications, client affinity lets you direct all
   * requests from a user to the same endpoint.
   *
   * By default, each connection from each client is routed to seperate
   * endpoints. Set client affinity to SOURCE_IP to route all connections from
   * a single client to the same endpoint.
   *
   * Default: ClientAffinity.NONE
   */
  public fun clientAffinity(): ClientAffinity? =
      unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

  /**
   * Name of the listener.
   *
   * Default: - logical ID of the resource
   */
  public fun listenerName(): String? = unwrap(this).getListenerName()

  /**
   * The list of port ranges for the connections from clients to the accelerator.
   */
  public fun portRanges(): List<PortRange>

  /**
   * The protocol for the connections from clients to the accelerator.
   *
   * Default: ConnectionProtocol.TCP
   */
  public fun protocol(): ConnectionProtocol? =
      unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)

  /**
   * A builder for [ListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientAffinity Client affinity to direct all requests from a user to the same
     * endpoint.
     * If you have stateful applications, client affinity lets you direct all
     * requests from a user to the same endpoint.
     *
     * By default, each connection from each client is routed to seperate
     * endpoints. Set client affinity to SOURCE_IP to route all connections from
     * a single client to the same endpoint.
     */
    public fun clientAffinity(clientAffinity: ClientAffinity)

    /**
     * @param listenerName Name of the listener.
     */
    public fun listenerName(listenerName: String)

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: List<PortRange>)

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(vararg portRanges: PortRange)

    /**
     * @param protocol The protocol for the connections from clients to the accelerator.
     */
    public fun protocol(protocol: ConnectionProtocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.Builder =
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.builder()

    /**
     * @param clientAffinity Client affinity to direct all requests from a user to the same
     * endpoint.
     * If you have stateful applications, client affinity lets you direct all
     * requests from a user to the same endpoint.
     *
     * By default, each connection from each client is routed to seperate
     * endpoints. Set client affinity to SOURCE_IP to route all connections from
     * a single client to the same endpoint.
     */
    override fun clientAffinity(clientAffinity: ClientAffinity) {
      cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity::unwrap))
    }

    /**
     * @param listenerName Name of the listener.
     */
    override fun listenerName(listenerName: String) {
      cdkBuilder.listenerName(listenerName)
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: List<PortRange>) {
      cdkBuilder.portRanges(portRanges.map(PortRange::unwrap))
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(vararg portRanges: PortRange): Unit = portRanges(portRanges.toList())

    /**
     * @param protocol The protocol for the connections from clients to the accelerator.
     */
    override fun protocol(protocol: ConnectionProtocol) {
      cdkBuilder.protocol(protocol.let(ConnectionProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.ListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions,
  ) : ListenerOptions {
    /**
     * Client affinity to direct all requests from a user to the same endpoint.
     *
     * If you have stateful applications, client affinity lets you direct all
     * requests from a user to the same endpoint.
     *
     * By default, each connection from each client is routed to seperate
     * endpoints. Set client affinity to SOURCE_IP to route all connections from
     * a single client to the same endpoint.
     *
     * Default: ClientAffinity.NONE
     */
    override fun clientAffinity(): ClientAffinity? =
        unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

    /**
     * Name of the listener.
     *
     * Default: - logical ID of the resource
     */
    override fun listenerName(): String? = unwrap(this).getListenerName()

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     */
    override fun portRanges(): List<PortRange> = unwrap(this).getPortRanges().map(PortRange::wrap)

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: ConnectionProtocol.TCP
     */
    override fun protocol(): ConnectionProtocol? =
        unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions):
        ListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerOptions):
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
