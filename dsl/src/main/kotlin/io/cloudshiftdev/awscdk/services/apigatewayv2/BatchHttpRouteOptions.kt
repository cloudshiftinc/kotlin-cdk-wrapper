package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface BatchHttpRouteOptions {
    /** The integration to be configured on this route. */
    public fun integration(): HttpRouteIntegration

    /** A builder for [BatchHttpRouteOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param integration The integration to be configured on this route. */
        public fun integration(integration: HttpRouteIntegration)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.Builder =
            software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions.builder()

        /** @param integration The integration to be configured on this route. */
        override fun integration(integration: HttpRouteIntegration) {
            cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions,
    ) : BatchHttpRouteOptions {
        /** The integration to be configured on this route. */
        override fun integration(): HttpRouteIntegration =
            unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BatchHttpRouteOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions
        ): BatchHttpRouteOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BatchHttpRouteOptions
        ): software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions =
            (wrapped as Wrapper).cdkObject
    }
}
