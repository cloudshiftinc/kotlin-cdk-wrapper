@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The construct for the Listener.
 *
 * Example:
 *
 * ```
 * // Create an Accelerator
 * Accelerator accelerator = new Accelerator(this, "Accelerator");
 * // Create a Listener
 * Listener listener = accelerator.addListener("Listener", ListenerOptions.builder()
 * .portRanges(List.of(PortRange.builder().fromPort(80).build(),
 * PortRange.builder().fromPort(443).build()))
 * .build());
 * // Import the Load Balancers
 * INetworkLoadBalancer nlb1 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB1",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:us-west-2:111111111111:loadbalancer/app/my-load-balancer1/e16bef66805b")
 * .build());
 * INetworkLoadBalancer nlb2 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB2",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:ap-south-1:111111111111:loadbalancer/app/my-load-balancer2/5513dc2ea8a1")
 * .build());
 * // Add one EndpointGroup for each Region we are targeting
 * listener.addEndpointGroup("Group1", EndpointGroupOptions.builder()
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb1)))
 * .build());
 * listener.addEndpointGroup("Group2", EndpointGroupOptions.builder()
 * // Imported load balancers automatically calculate their Region from the ARN.
 * // If you are load balancing to other resources, you must also pass a `region`
 * // parameter here.
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb2)))
 * .build());
 * ```
 */
public open class Listener(
  cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener,
) : Resource(cdkObject),
    IListener {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ListenerProps,
  ) :
      this(software.amazon.awscdk.services.globalaccelerator.Listener(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ListenerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ListenerProps.Builder.() -> Unit,
  ) : this(scope, id, ListenerProps(props)
  )

  /**
   * Add a new endpoint group to this listener.
   *
   * @param id 
   * @param options
   */
  public open fun addEndpointGroup(id: String): EndpointGroup =
      unwrap(this).addEndpointGroup(id).let(EndpointGroup::wrap)

  /**
   * Add a new endpoint group to this listener.
   *
   * @param id 
   * @param options
   */
  public open fun addEndpointGroup(id: String, options: EndpointGroupOptions): EndpointGroup =
      unwrap(this).addEndpointGroup(id,
      options.let(EndpointGroupOptions.Companion::unwrap)).let(EndpointGroup::wrap)

  /**
   * Add a new endpoint group to this listener.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c83c4dd512e71452b5f5fa4cc0b068a3e6faed266b23647cbf1aab2f35ae1650")
  public open fun addEndpointGroup(id: String, options: EndpointGroupOptions.Builder.() -> Unit):
      EndpointGroup = addEndpointGroup(id, EndpointGroupOptions(options))

  /**
   * The ARN of the listener.
   */
  public override fun listenerArn(): String = unwrap(this).getListenerArn()

  /**
   * The name of the listener.
   */
  public open fun listenerName(): String = unwrap(this).getListenerName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.Listener].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The accelerator for this listener.
     *
     * @param accelerator The accelerator for this listener. 
     */
    public fun accelerator(accelerator: IAccelerator)

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
     *
     * @param clientAffinity Client affinity to direct all requests from a user to the same
     * endpoint. 
     */
    public fun clientAffinity(clientAffinity: ClientAffinity)

    /**
     * Name of the listener.
     *
     * Default: - logical ID of the resource
     *
     * @param listenerName Name of the listener. 
     */
    public fun listenerName(listenerName: String)

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(portRanges: List<PortRange>)

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    public fun portRanges(vararg portRanges: PortRange)

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: ConnectionProtocol.TCP
     *
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    public fun protocol(protocol: ConnectionProtocol)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.Listener.Builder =
        software.amazon.awscdk.services.globalaccelerator.Listener.Builder.create(scope, id)

    /**
     * The accelerator for this listener.
     *
     * @param accelerator The accelerator for this listener. 
     */
    override fun accelerator(accelerator: IAccelerator) {
      cdkBuilder.accelerator(accelerator.let(IAccelerator.Companion::unwrap))
    }

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
     *
     * @param clientAffinity Client affinity to direct all requests from a user to the same
     * endpoint. 
     */
    override fun clientAffinity(clientAffinity: ClientAffinity) {
      cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity.Companion::unwrap))
    }

    /**
     * Name of the listener.
     *
     * Default: - logical ID of the resource
     *
     * @param listenerName Name of the listener. 
     */
    override fun listenerName(listenerName: String) {
      cdkBuilder.listenerName(listenerName)
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(portRanges: List<PortRange>) {
      cdkBuilder.portRanges(portRanges.map(PortRange.Companion::unwrap))
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator.
     *
     * @param portRanges The list of port ranges for the connections from clients to the
     * accelerator. 
     */
    override fun portRanges(vararg portRanges: PortRange): Unit = portRanges(portRanges.toList())

    /**
     * The protocol for the connections from clients to the accelerator.
     *
     * Default: ConnectionProtocol.TCP
     *
     * @param protocol The protocol for the connections from clients to the accelerator. 
     */
    override fun protocol(protocol: ConnectionProtocol) {
      cdkBuilder.protocol(protocol.let(ConnectionProtocol.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.Listener =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.globalaccelerator.Listener.PROPERTY_INJECTION_ID

    public fun fromListenerArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      listenerArn: String,
    ): IListener =
        software.amazon.awscdk.services.globalaccelerator.Listener.fromListenerArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, listenerArn).let(IListener::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Listener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Listener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener):
        Listener = Listener(cdkObject)

    internal fun unwrap(wrapped: Listener):
        software.amazon.awscdk.services.globalaccelerator.Listener = wrapped.cdkObject as
        software.amazon.awscdk.services.globalaccelerator.Listener
  }
}
