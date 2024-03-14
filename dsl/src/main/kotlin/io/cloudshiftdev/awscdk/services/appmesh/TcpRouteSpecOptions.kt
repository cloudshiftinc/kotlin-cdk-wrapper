package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TcpRouteSpecOptions : RouteSpecOptionsBase {
    /**
     * An object that represents a tcp timeout.
     *
     * Default: - None
     */
    public fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

    /** List of targets that traffic is routed to when a request matches the route. */
    public fun weightedTargets(): List<WeightedTarget>

    /** A builder for [TcpRouteSpecOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param priority The priority for the route. When a Virtual Router has multiple routes,
         *   route match is performed in the order of specified value, where 0 is the highest
         *   priority, and first matched route is selected.
         */
        public fun priority(priority: Number)

        /** @param timeout An object that represents a tcp timeout. */
        public fun timeout(timeout: TcpTimeout)

        /** @param timeout An object that represents a tcp timeout. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
        public fun timeout(timeout: TcpTimeout.Builder.() -> Unit)

        /**
         * @param weightedTargets List of targets that traffic is routed to when a request matches
         *   the route.
         */
        public fun weightedTargets(weightedTargets: List<WeightedTarget>)

        /**
         * @param weightedTargets List of targets that traffic is routed to when a request matches
         *   the route.
         */
        public fun weightedTargets(vararg weightedTargets: WeightedTarget)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.Builder =
            software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.builder()

        /**
         * @param priority The priority for the route. When a Virtual Router has multiple routes,
         *   route match is performed in the order of specified value, where 0 is the highest
         *   priority, and first matched route is selected.
         */
        override fun priority(priority: Number) {
            cdkBuilder.priority(priority)
        }

        /** @param timeout An object that represents a tcp timeout. */
        override fun timeout(timeout: TcpTimeout) {
            cdkBuilder.timeout(timeout.let(TcpTimeout::unwrap))
        }

        /** @param timeout An object that represents a tcp timeout. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
        override fun timeout(timeout: TcpTimeout.Builder.() -> Unit): Unit =
            timeout(TcpTimeout(timeout))

        /**
         * @param weightedTargets List of targets that traffic is routed to when a request matches
         *   the route.
         */
        override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
            cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
        }

        /**
         * @param weightedTargets List of targets that traffic is routed to when a request matches
         *   the route.
         */
        override fun weightedTargets(vararg weightedTargets: WeightedTarget): Unit =
            weightedTargets(weightedTargets.toList())

        public fun build(): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions,
    ) : TcpRouteSpecOptions {
        /**
         * The priority for the route.
         *
         * When a Virtual Router has multiple routes, route match is performed in the order of
         * specified value, where 0 is the highest priority, and first matched route is selected.
         *
         * Default: - no particular priority
         */
        override fun priority(): Number? = unwrap(this).getPriority()

        /**
         * An object that represents a tcp timeout.
         *
         * Default: - None
         */
        override fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

        /** List of targets that traffic is routed to when a request matches the route. */
        override fun weightedTargets(): List<WeightedTarget> =
            unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteSpecOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions
        ): TcpRouteSpecOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TcpRouteSpecOptions
        ): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
            (wrapped as Wrapper).cdkObject
    }
}
