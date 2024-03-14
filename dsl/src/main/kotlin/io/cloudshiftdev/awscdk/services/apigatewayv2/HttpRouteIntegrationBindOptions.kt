package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface HttpRouteIntegrationBindOptions {
    /** The route to which this is being bound. */
    public fun route(): IHttpRoute

    /**
     * The current scope in which the bind is occurring.
     *
     * If the `HttpRouteIntegration` being bound creates additional constructs, this will be used as
     * their parent scope.
     */
    public fun scope(): Construct

    /** A builder for [HttpRouteIntegrationBindOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param route The route to which this is being bound. */
        public fun route(route: IHttpRoute)

        /**
         * @param scope The current scope in which the bind is occurring. If the
         *   `HttpRouteIntegration` being bound creates additional constructs, this will be used as
         *   their parent scope.
         */
        public fun scope(scope: Construct)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.Builder =
            software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.builder()

        /** @param route The route to which this is being bound. */
        override fun route(route: IHttpRoute) {
            cdkBuilder.route(route.let(IHttpRoute::unwrap))
        }

        /**
         * @param scope The current scope in which the bind is occurring. If the
         *   `HttpRouteIntegration` being bound creates additional constructs, this will be used as
         *   their parent scope.
         */
        override fun scope(scope: Construct) {
            cdkBuilder.scope(scope.let(Construct::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions,
    ) : HttpRouteIntegrationBindOptions {
        /** The route to which this is being bound. */
        override fun route(): IHttpRoute = unwrap(this).getRoute().let(IHttpRoute::wrap)

        /**
         * The current scope in which the bind is occurring.
         *
         * If the `HttpRouteIntegration` being bound creates additional constructs, this will be
         * used as their parent scope.
         */
        override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): HttpRouteIntegrationBindOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
        ): HttpRouteIntegrationBindOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: HttpRouteIntegrationBindOptions
        ): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions =
            (wrapped as Wrapper).cdkObject
    }
}
