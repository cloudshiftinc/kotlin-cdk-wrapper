package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Listener
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener,
) : Resource(cdkObject), IListener {
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
        unwrap(this)
            .addEndpointGroup(id, options.let(EndpointGroupOptions::unwrap))
            .let(EndpointGroup::wrap)

    /**
     * Add a new endpoint group to this listener.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c83c4dd512e71452b5f5fa4cc0b068a3e6faed266b23647cbf1aab2f35ae1650")
    public open fun addEndpointGroup(
        id: String,
        options: EndpointGroupOptions.Builder.() -> Unit
    ): EndpointGroup = addEndpointGroup(id, EndpointGroupOptions(options))

    /** The ARN of the listener. */
    public override fun listenerArn(): String = unwrap(this).getListenerArn()

    /** The name of the listener. */
    public open fun listenerName(): String = unwrap(this).getListenerName()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.Listener]. */
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
         * If you have stateful applications, client affinity lets you direct all requests from a
         * user to the same endpoint.
         *
         * By default, each connection from each client is routed to seperate endpoints. Set client
         * affinity to SOURCE_IP to route all connections from a single client to the same endpoint.
         *
         * Default: ClientAffinity.NONE
         *
         * @param clientAffinity Client affinity to direct all requests from a user to the same
         *   endpoint.
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
         *   accelerator.
         */
        public fun portRanges(portRanges: List<PortRange>)

        /**
         * The list of port ranges for the connections from clients to the accelerator.
         *
         * @param portRanges The list of port ranges for the connections from clients to the
         *   accelerator.
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
            cdkBuilder.accelerator(accelerator.let(IAccelerator::unwrap))
        }

        /**
         * Client affinity to direct all requests from a user to the same endpoint.
         *
         * If you have stateful applications, client affinity lets you direct all requests from a
         * user to the same endpoint.
         *
         * By default, each connection from each client is routed to seperate endpoints. Set client
         * affinity to SOURCE_IP to route all connections from a single client to the same endpoint.
         *
         * Default: ClientAffinity.NONE
         *
         * @param clientAffinity Client affinity to direct all requests from a user to the same
         *   endpoint.
         */
        override fun clientAffinity(clientAffinity: ClientAffinity) {
            cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity::unwrap))
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
         *   accelerator.
         */
        override fun portRanges(portRanges: List<PortRange>) {
            cdkBuilder.portRanges(portRanges.map(PortRange::unwrap))
        }

        /**
         * The list of port ranges for the connections from clients to the accelerator.
         *
         * @param portRanges The list of port ranges for the connections from clients to the
         *   accelerator.
         */
        override fun portRanges(vararg portRanges: PortRange): Unit =
            portRanges(portRanges.toList())

        /**
         * The protocol for the connections from clients to the accelerator.
         *
         * Default: ConnectionProtocol.TCP
         *
         * @param protocol The protocol for the connections from clients to the accelerator.
         */
        override fun protocol(protocol: ConnectionProtocol) {
            cdkBuilder.protocol(protocol.let(ConnectionProtocol::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.globalaccelerator.Listener =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromListenerArn(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            listenerArn: String,
        ): IListener =
            software.amazon.awscdk.services.globalaccelerator.Listener.fromListenerArn(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    listenerArn
                )
                .let(IListener::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Listener {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Listener(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener
        ): Listener = Listener(cdkObject)

        internal fun unwrap(
            wrapped: Listener
        ): software.amazon.awscdk.services.globalaccelerator.Listener = wrapped.cdkObject
    }
}
