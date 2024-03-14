package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketRoute
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute,
) : Resource(cdkObject), IWebSocketRoute {
    /** Integration response ID. */
    public open fun integrationResponseId(): String? = unwrap(this).getIntegrationResponseId()

    /** Id of the Route. */
    public override fun routeId(): String = unwrap(this).getRouteId()

    /** The key to this route. */
    public override fun routeKey(): String = unwrap(this).getRouteKey()

    /** The WebSocket API associated with this route. */
    public override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRoute]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Whether the route requires an API Key to be provided.
         *
         * Default: false
         *
         * @param apiKeyRequired Whether the route requires an API Key to be provided.
         */
        public fun apiKeyRequired(apiKeyRequired: Boolean)

        /**
         * The authorize to this route.
         *
         * You can only set authorizer to a $connect route.
         *
         * Default: - No Authorizer
         *
         * @param authorizer The authorize to this route.
         */
        public fun authorizer(authorizer: IWebSocketRouteAuthorizer)

        /**
         * The integration to be configured on this route.
         *
         * @param integration The integration to be configured on this route.
         */
        public fun integration(integration: WebSocketRouteIntegration)

        /**
         * Should the route send a response to the client.
         *
         * Default: false
         *
         * @param returnResponse Should the route send a response to the client.
         */
        public fun returnResponse(returnResponse: Boolean)

        /**
         * The key to this route.
         *
         * @param routeKey The key to this route.
         */
        public fun routeKey(routeKey: String)

        /**
         * The API the route is associated with.
         *
         * @param webSocketApi The API the route is associated with.
         */
        public fun webSocketApi(webSocketApi: IWebSocketApi)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder =
            software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder.create(scope, id)

        /**
         * Whether the route requires an API Key to be provided.
         *
         * Default: false
         *
         * @param apiKeyRequired Whether the route requires an API Key to be provided.
         */
        override fun apiKeyRequired(apiKeyRequired: Boolean) {
            cdkBuilder.apiKeyRequired(apiKeyRequired)
        }

        /**
         * The authorize to this route.
         *
         * You can only set authorizer to a $connect route.
         *
         * Default: - No Authorizer
         *
         * @param authorizer The authorize to this route.
         */
        override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
            cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer::unwrap))
        }

        /**
         * The integration to be configured on this route.
         *
         * @param integration The integration to be configured on this route.
         */
        override fun integration(integration: WebSocketRouteIntegration) {
            cdkBuilder.integration(integration.let(WebSocketRouteIntegration::unwrap))
        }

        /**
         * Should the route send a response to the client.
         *
         * Default: false
         *
         * @param returnResponse Should the route send a response to the client.
         */
        override fun returnResponse(returnResponse: Boolean) {
            cdkBuilder.returnResponse(returnResponse)
        }

        /**
         * The key to this route.
         *
         * @param routeKey The key to this route.
         */
        override fun routeKey(routeKey: String) {
            cdkBuilder.routeKey(routeKey)
        }

        /**
         * The API the route is associated with.
         *
         * @param webSocketApi The API the route is associated with.
         */
        override fun webSocketApi(webSocketApi: IWebSocketApi) {
            cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRoute =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): WebSocketRoute {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return WebSocketRoute(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
        ): WebSocketRoute = WebSocketRoute(cdkObject)

        internal fun unwrap(
            wrapped: WebSocketRoute
        ): software.amazon.awscdk.services.apigatewayv2.WebSocketRoute = wrapped.cdkObject
    }
}
