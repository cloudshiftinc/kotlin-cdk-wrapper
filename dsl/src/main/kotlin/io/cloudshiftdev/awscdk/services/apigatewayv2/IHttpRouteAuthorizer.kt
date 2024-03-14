package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IHttpRouteAuthorizer {
    /**
     * Bind this authorizer to a specified Http route.
     *
     * @param options
     */
    public fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig

    /**
     * Bind this authorizer to a specified Http route.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
    public fun bind(
        options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit
    ): HttpRouteAuthorizerConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer,
    ) : IHttpRouteAuthorizer {
        /**
         * Bind this authorizer to a specified Http route.
         *
         * @param options
         */
        override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
            unwrap(this)
                .bind(options.let(HttpRouteAuthorizerBindOptions::unwrap))
                .let(HttpRouteAuthorizerConfig::wrap)

        /**
         * Bind this authorizer to a specified Http route.
         *
         * @param options
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
        override fun bind(
            options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit
        ): HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
        ): IHttpRouteAuthorizer = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IHttpRouteAuthorizer
        ): software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer =
            (wrapped as Wrapper).cdkObject
    }
}
