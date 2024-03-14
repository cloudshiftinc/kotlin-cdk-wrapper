package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface RouteAttributes {
    /** The name of the Route. */
    public fun routeName(): String

    /** The VirtualRouter the Route belongs to. */
    public fun virtualRouter(): IVirtualRouter

    /** A builder for [RouteAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param routeName The name of the Route. */
        public fun routeName(routeName: String)

        /** @param virtualRouter The VirtualRouter the Route belongs to. */
        public fun virtualRouter(virtualRouter: IVirtualRouter)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteAttributes.Builder =
            software.amazon.awscdk.services.appmesh.RouteAttributes.builder()

        /** @param routeName The name of the Route. */
        override fun routeName(routeName: String) {
            cdkBuilder.routeName(routeName)
        }

        /** @param virtualRouter The VirtualRouter the Route belongs to. */
        override fun virtualRouter(virtualRouter: IVirtualRouter) {
            cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appmesh.RouteAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes,
    ) : RouteAttributes {
        /** The name of the Route. */
        override fun routeName(): String = unwrap(this).getRouteName()

        /** The VirtualRouter the Route belongs to. */
        override fun virtualRouter(): IVirtualRouter =
            unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RouteAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes
        ): RouteAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RouteAttributes
        ): software.amazon.awscdk.services.appmesh.RouteAttributes = (wrapped as Wrapper).cdkObject
    }
}
