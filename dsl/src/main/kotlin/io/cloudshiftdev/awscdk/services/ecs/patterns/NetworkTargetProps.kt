package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface NetworkTargetProps {
    /**
     * The port number of the container.
     *
     * Only applicable when using application/network load balancers.
     */
    public fun containerPort(): Number

    /**
     * Name of the listener the target group attached to.
     *
     * Default: - default listener (first added listener)
     */
    public fun listener(): String? = unwrap(this).getListener()

    /** A builder for [NetworkTargetProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param containerPort The port number of the container. Only applicable when using
         *   application/network load balancers.
         */
        public fun containerPort(containerPort: Number)

        /** @param listener Name of the listener the target group attached to. */
        public fun listener(listener: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.Builder =
            software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.builder()

        /**
         * @param containerPort The port number of the container. Only applicable when using
         *   application/network load balancers.
         */
        override fun containerPort(containerPort: Number) {
            cdkBuilder.containerPort(containerPort)
        }

        /** @param listener Name of the listener the target group attached to. */
        override fun listener(listener: String) {
            cdkBuilder.listener(listener)
        }

        public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps,
    ) : NetworkTargetProps {
        /**
         * The port number of the container.
         *
         * Only applicable when using application/network load balancers.
         */
        override fun containerPort(): Number = unwrap(this).getContainerPort()

        /**
         * Name of the listener the target group attached to.
         *
         * Default: - default listener (first added listener)
         */
        override fun listener(): String? = unwrap(this).getListener()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): NetworkTargetProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
        ): NetworkTargetProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: NetworkTargetProps
        ): software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps =
            (wrapped as Wrapper).cdkObject
    }
}
