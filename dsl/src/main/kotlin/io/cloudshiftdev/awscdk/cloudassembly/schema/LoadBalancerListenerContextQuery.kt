package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerListenerContextQuery : LoadBalancerFilter {
    /** Query account. */
    public fun account(): String

    /**
     * Find by listener's arn.
     *
     * Default: - does not find by listener arn
     */
    public fun listenerArn(): String? = unwrap(this).getListenerArn()

    /**
     * Filter listeners by listener port.
     *
     * Default: - does not filter by a listener port
     */
    public fun listenerPort(): Number? = unwrap(this).getListenerPort()

    /**
     * Filter by listener protocol.
     *
     * Default: - does not filter by listener protocol
     */
    public fun listenerProtocol(): LoadBalancerListenerProtocol? =
        unwrap(this).getListenerProtocol()?.let(LoadBalancerListenerProtocol::wrap)

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /** Query region. */
    public fun region(): String

    /** A builder for [LoadBalancerListenerContextQuery] */
    @CdkDslMarker
    public interface Builder {
        /** @param account Query account. */
        public fun account(account: String)

        /** @param listenerArn Find by listener's arn. */
        public fun listenerArn(listenerArn: String)

        /** @param listenerPort Filter listeners by listener port. */
        public fun listenerPort(listenerPort: Number)

        /** @param listenerProtocol Filter by listener protocol. */
        public fun listenerProtocol(listenerProtocol: LoadBalancerListenerProtocol)

        /** @param loadBalancerArn Find by load balancer's ARN. */
        public fun loadBalancerArn(loadBalancerArn: String)

        /** @param loadBalancerTags Match load balancer tags. */
        public fun loadBalancerTags(loadBalancerTags: List<Tag>)

        /** @param loadBalancerTags Match load balancer tags. */
        public fun loadBalancerTags(vararg loadBalancerTags: Tag)

        /** @param loadBalancerType Filter load balancers by their type. */
        public fun loadBalancerType(loadBalancerType: LoadBalancerType)

        /**
         * @param lookupRoleArn The ARN of the role that should be used to look up the missing
         *   values.
         */
        public fun lookupRoleArn(lookupRoleArn: String)

        /** @param region Query region. */
        public fun region(region: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.Builder =
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.builder()

        /** @param account Query account. */
        override fun account(account: String) {
            cdkBuilder.account(account)
        }

        /** @param listenerArn Find by listener's arn. */
        override fun listenerArn(listenerArn: String) {
            cdkBuilder.listenerArn(listenerArn)
        }

        /** @param listenerPort Filter listeners by listener port. */
        override fun listenerPort(listenerPort: Number) {
            cdkBuilder.listenerPort(listenerPort)
        }

        /** @param listenerProtocol Filter by listener protocol. */
        override fun listenerProtocol(listenerProtocol: LoadBalancerListenerProtocol) {
            cdkBuilder.listenerProtocol(listenerProtocol.let(LoadBalancerListenerProtocol::unwrap))
        }

        /** @param loadBalancerArn Find by load balancer's ARN. */
        override fun loadBalancerArn(loadBalancerArn: String) {
            cdkBuilder.loadBalancerArn(loadBalancerArn)
        }

        /** @param loadBalancerTags Match load balancer tags. */
        override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
            cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag::unwrap))
        }

        /** @param loadBalancerTags Match load balancer tags. */
        override fun loadBalancerTags(vararg loadBalancerTags: Tag): Unit =
            loadBalancerTags(loadBalancerTags.toList())

        /** @param loadBalancerType Filter load balancers by their type. */
        override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
            cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType::unwrap))
        }

        /**
         * @param lookupRoleArn The ARN of the role that should be used to look up the missing
         *   values.
         */
        override fun lookupRoleArn(lookupRoleArn: String) {
            cdkBuilder.lookupRoleArn(lookupRoleArn)
        }

        /** @param region Query region. */
        override fun region(region: String) {
            cdkBuilder.region(region)
        }

        public fun build():
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery,
    ) : LoadBalancerListenerContextQuery {
        /** Query account. */
        override fun account(): String = unwrap(this).getAccount()

        /**
         * Find by listener's arn.
         *
         * Default: - does not find by listener arn
         */
        override fun listenerArn(): String? = unwrap(this).getListenerArn()

        /**
         * Filter listeners by listener port.
         *
         * Default: - does not filter by a listener port
         */
        override fun listenerPort(): Number? = unwrap(this).getListenerPort()

        /**
         * Filter by listener protocol.
         *
         * Default: - does not filter by listener protocol
         */
        override fun listenerProtocol(): LoadBalancerListenerProtocol? =
            unwrap(this).getListenerProtocol()?.let(LoadBalancerListenerProtocol::wrap)

        /**
         * Find by load balancer's ARN.
         *
         * Default: - does not search by load balancer arn
         */
        override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

        /**
         * Match load balancer tags.
         *
         * Default: - does not match load balancers by tags
         */
        override fun loadBalancerTags(): List<Tag> =
            unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?: emptyList()

        /** Filter load balancers by their type. */
        override fun loadBalancerType(): LoadBalancerType =
            unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)

        /**
         * The ARN of the role that should be used to look up the missing values.
         *
         * Default: - None
         */
        override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

        /** Query region. */
        override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): LoadBalancerListenerContextQuery {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery
        ): LoadBalancerListenerContextQuery = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LoadBalancerListenerContextQuery
        ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery =
            (wrapped as Wrapper).cdkObject
    }
}
