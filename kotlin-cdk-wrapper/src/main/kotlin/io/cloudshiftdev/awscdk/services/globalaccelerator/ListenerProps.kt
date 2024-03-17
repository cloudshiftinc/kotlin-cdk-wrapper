@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construct properties for Listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * Accelerator accelerator;
 * ListenerProps listenerProps = ListenerProps.builder()
 * .accelerator(accelerator)
 * .portRanges(List.of(PortRange.builder()
 * .fromPort(123)
 * // the properties below are optional
 * .toPort(123)
 * .build()))
 * // the properties below are optional
 * .clientAffinity(ClientAffinity.NONE)
 * .listenerName("listenerName")
 * .protocol(ConnectionProtocol.TCP)
 * .build();
 * ```
 */
public interface ListenerProps : ListenerOptions {
  /**
   * The accelerator for this listener.
   */
  public fun accelerator(): IAccelerator

  /**
   * A builder for [ListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accelerator The accelerator for this listener. 
     */
    public fun accelerator(accelerator: IAccelerator)

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
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.ListenerProps.Builder
        = software.amazon.awscdk.services.globalaccelerator.ListenerProps.builder()

    /**
     * @param accelerator The accelerator for this listener. 
     */
    override fun accelerator(accelerator: IAccelerator) {
      cdkBuilder.accelerator(accelerator.let(IAccelerator::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.ListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerProps,
  ) : CdkObject(cdkObject), ListenerProps {
    /**
     * The accelerator for this listener.
     */
    override fun accelerator(): IAccelerator = unwrap(this).getAccelerator().let(IAccelerator::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerProps):
        ListenerProps = CdkObjectWrappers.wrap(cdkObject) as? ListenerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerProps):
        software.amazon.awscdk.services.globalaccelerator.ListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.ListenerProps
  }
}
