package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ServiceAttributes {
    /**  */
    public fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    /**  */
    public fun dnsRecordType(): DnsRecordType

    /**  */
    public fun namespace(): INamespace

    /**  */
    public fun routingPolicy(): RoutingPolicy

    /**  */
    public fun serviceArn(): String

    /**  */
    public fun serviceId(): String

    /**  */
    public fun serviceName(): String

    /** A builder for [ServiceAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param discoveryType the value to be set. */
        public fun discoveryType(discoveryType: DiscoveryType)

        /** @param dnsRecordType the value to be set. */
        public fun dnsRecordType(dnsRecordType: DnsRecordType)

        /** @param namespace the value to be set. */
        public fun namespace(namespace: INamespace)

        /** @param routingPolicy the value to be set. */
        public fun routingPolicy(routingPolicy: RoutingPolicy)

        /** @param serviceArn the value to be set. */
        public fun serviceArn(serviceArn: String)

        /** @param serviceId the value to be set. */
        public fun serviceId(serviceId: String)

        /** @param serviceName the value to be set. */
        public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicediscovery.ServiceAttributes.Builder =
            software.amazon.awscdk.services.servicediscovery.ServiceAttributes.builder()

        /** @param discoveryType the value to be set. */
        override fun discoveryType(discoveryType: DiscoveryType) {
            cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
        }

        /** @param dnsRecordType the value to be set. */
        override fun dnsRecordType(dnsRecordType: DnsRecordType) {
            cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
        }

        /** @param namespace the value to be set. */
        override fun namespace(namespace: INamespace) {
            cdkBuilder.namespace(namespace.let(INamespace::unwrap))
        }

        /** @param routingPolicy the value to be set. */
        override fun routingPolicy(routingPolicy: RoutingPolicy) {
            cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
        }

        /** @param serviceArn the value to be set. */
        override fun serviceArn(serviceArn: String) {
            cdkBuilder.serviceArn(serviceArn)
        }

        /** @param serviceId the value to be set. */
        override fun serviceId(serviceId: String) {
            cdkBuilder.serviceId(serviceId)
        }

        /** @param serviceName the value to be set. */
        override fun serviceName(serviceName: String) {
            cdkBuilder.serviceName(serviceName)
        }

        public fun build(): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes,
    ) : ServiceAttributes {
        /**  */
        override fun discoveryType(): DiscoveryType? =
            unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

        /**  */
        override fun dnsRecordType(): DnsRecordType =
            unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

        /**  */
        override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

        /**  */
        override fun routingPolicy(): RoutingPolicy =
            unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

        /**  */
        override fun serviceArn(): String = unwrap(this).getServiceArn()

        /**  */
        override fun serviceId(): String = unwrap(this).getServiceId()

        /**  */
        override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes
        ): ServiceAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ServiceAttributes
        ): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
