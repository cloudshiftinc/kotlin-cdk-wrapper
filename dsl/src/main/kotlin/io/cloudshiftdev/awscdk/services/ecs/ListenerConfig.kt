package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ListenerConfig
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.ListenerConfig,
) {
    /**
     * Create and attach a target group to listener.
     *
     * @param id
     * @param target
     * @param service
     */
    public open fun addTargets(
        id: String,
        target: LoadBalancerTargetOptions,
        service: BaseService,
    ) {
        unwrap(this)
            .addTargets(
                id,
                target.let(LoadBalancerTargetOptions::unwrap),
                service.let(BaseService::unwrap)
            )
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.ListenerConfig,
    ) : ListenerConfig(cdkObject)

    public companion object {
        public fun applicationListener(listener: ApplicationListener): ListenerConfig =
            software.amazon.awscdk.services.ecs.ListenerConfig.applicationListener(
                    listener.let(ApplicationListener::unwrap)
                )
                .let(ListenerConfig::wrap)

        public fun applicationListener(
            listener: ApplicationListener,
            props: AddApplicationTargetsProps
        ): ListenerConfig =
            software.amazon.awscdk.services.ecs.ListenerConfig.applicationListener(
                    listener.let(ApplicationListener::unwrap),
                    props.let(AddApplicationTargetsProps::unwrap)
                )
                .let(ListenerConfig::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2e8434e7630f57d2f56657a6dd56edd3274cac87386c4bd93585178fe5676884")
        public fun applicationListener(
            listener: ApplicationListener,
            props: AddApplicationTargetsProps.Builder.() -> Unit
        ): ListenerConfig = applicationListener(listener, AddApplicationTargetsProps(props))

        public fun networkListener(listener: NetworkListener): ListenerConfig =
            software.amazon.awscdk.services.ecs.ListenerConfig.networkListener(
                    listener.let(NetworkListener::unwrap)
                )
                .let(ListenerConfig::wrap)

        public fun networkListener(
            listener: NetworkListener,
            props: AddNetworkTargetsProps
        ): ListenerConfig =
            software.amazon.awscdk.services.ecs.ListenerConfig.networkListener(
                    listener.let(NetworkListener::unwrap),
                    props.let(AddNetworkTargetsProps::unwrap)
                )
                .let(ListenerConfig::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c16422763514ae0eb3b96259e0f711dc1314889f1a8a917b63a43b7c32f51ecd")
        public fun networkListener(
            listener: NetworkListener,
            props: AddNetworkTargetsProps.Builder.() -> Unit
        ): ListenerConfig = networkListener(listener, AddNetworkTargetsProps(props))

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ListenerConfig
        ): ListenerConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ListenerConfig
        ): software.amazon.awscdk.services.ecs.ListenerConfig = (wrapped as Wrapper).cdkObject
    }
}
