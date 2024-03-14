package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerFilter {
    /**
     * Find by load balancer's ARN.
     *
     * Default: - does not search by load balancer arn
     */
    public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * Match load balancer tags.
     *
     * Default: - does not match load balancers by tags
     */
    public fun loadBalancerTags(): List<Tag> =
        unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?: emptyList()

    /** Filter load balancers by their type. */
    public fun loadBalancerType(): LoadBalancerType

    /** A builder for [LoadBalancerFilter] */
    @CdkDslMarker
    public interface Builder {
        /** @param loadBalancerArn Find by load balancer's ARN. */
        public fun loadBalancerArn(loadBalancerArn: String)

        /** @param loadBalancerTags Match load balancer tags. */
        public fun loadBalancerTags(loadBalancerTags: List<Tag>)

        /** @param loadBalancerTags Match load balancer tags. */
        public fun loadBalancerTags(vararg loadBalancerTags: Tag)

        /** @param loadBalancerType Filter load balancers by their type. */
        public fun loadBalancerType(loadBalancerType: LoadBalancerType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.Builder =
            software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.builder()

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

        public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter,
    ) : LoadBalancerFilter {
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
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerFilter {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter
        ): LoadBalancerFilter = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LoadBalancerFilter
        ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
            (wrapped as Wrapper).cdkObject
    }
}
