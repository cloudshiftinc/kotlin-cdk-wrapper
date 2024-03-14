package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EcsTarget {
    /** The name of the container. */
    public fun containerName(): String

    /**
     * The port number of the container.
     *
     * Only applicable when using application/network load balancers.
     *
     * Default: - Container port of the first added port mapping.
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /** Listener and properties for adding target group to the listener. */
    public fun listener(): ListenerConfig

    /** ID for a target group to be created. */
    public fun newTargetGroupId(): String

    /**
     * The protocol used for the port mapping.
     *
     * Only applicable when using application load balancers.
     *
     * Default: Protocol.TCP
     */
    public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    /** A builder for [EcsTarget] */
    @CdkDslMarker
    public interface Builder {
        /** @param containerName The name of the container. */
        public fun containerName(containerName: String)

        /**
         * @param containerPort The port number of the container. Only applicable when using
         *   application/network load balancers.
         */
        public fun containerPort(containerPort: Number)

        /** @param listener Listener and properties for adding target group to the listener. */
        public fun listener(listener: ListenerConfig)

        /** @param newTargetGroupId ID for a target group to be created. */
        public fun newTargetGroupId(newTargetGroupId: String)

        /**
         * @param protocol The protocol used for the port mapping. Only applicable when using
         *   application load balancers.
         */
        public fun protocol(protocol: Protocol)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.EcsTarget.Builder =
            software.amazon.awscdk.services.ecs.EcsTarget.builder()

        /** @param containerName The name of the container. */
        override fun containerName(containerName: String) {
            cdkBuilder.containerName(containerName)
        }

        /**
         * @param containerPort The port number of the container. Only applicable when using
         *   application/network load balancers.
         */
        override fun containerPort(containerPort: Number) {
            cdkBuilder.containerPort(containerPort)
        }

        /** @param listener Listener and properties for adding target group to the listener. */
        override fun listener(listener: ListenerConfig) {
            cdkBuilder.listener(listener.let(ListenerConfig::unwrap))
        }

        /** @param newTargetGroupId ID for a target group to be created. */
        override fun newTargetGroupId(newTargetGroupId: String) {
            cdkBuilder.newTargetGroupId(newTargetGroupId)
        }

        /**
         * @param protocol The protocol used for the port mapping. Only applicable when using
         *   application load balancers.
         */
        override fun protocol(protocol: Protocol) {
            cdkBuilder.protocol(protocol.let(Protocol::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.EcsTarget = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.EcsTarget,
    ) : EcsTarget {
        /** The name of the container. */
        override fun containerName(): String = unwrap(this).getContainerName()

        /**
         * The port number of the container.
         *
         * Only applicable when using application/network load balancers.
         *
         * Default: - Container port of the first added port mapping.
         */
        override fun containerPort(): Number? = unwrap(this).getContainerPort()

        /** Listener and properties for adding target group to the listener. */
        override fun listener(): ListenerConfig =
            unwrap(this).getListener().let(ListenerConfig::wrap)

        /** ID for a target group to be created. */
        override fun newTargetGroupId(): String = unwrap(this).getNewTargetGroupId()

        /**
         * The protocol used for the port mapping.
         *
         * Only applicable when using application load balancers.
         *
         * Default: Protocol.TCP
         */
        override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): EcsTarget {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsTarget): EcsTarget =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: EcsTarget): software.amazon.awscdk.services.ecs.EcsTarget =
            (wrapped as Wrapper).cdkObject
    }
}
