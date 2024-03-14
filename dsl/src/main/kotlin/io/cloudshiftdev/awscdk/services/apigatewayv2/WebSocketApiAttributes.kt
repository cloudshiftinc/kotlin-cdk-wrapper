package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface WebSocketApiAttributes {
    /**
     * The endpoint URL of the WebSocketApi.
     *
     * Default: - throw san error if apiEndpoint is accessed.
     */
    public fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

    /** The identifier of the WebSocketApi. */
    public fun webSocketId(): String

    /** A builder for [WebSocketApiAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param apiEndpoint The endpoint URL of the WebSocketApi. */
        public fun apiEndpoint(apiEndpoint: String)

        /** @param webSocketId The identifier of the WebSocketApi. */
        public fun webSocketId(webSocketId: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes.Builder =
            software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes.builder()

        /** @param apiEndpoint The endpoint URL of the WebSocketApi. */
        override fun apiEndpoint(apiEndpoint: String) {
            cdkBuilder.apiEndpoint(apiEndpoint)
        }

        /** @param webSocketId The identifier of the WebSocketApi. */
        override fun webSocketId(webSocketId: String) {
            cdkBuilder.webSocketId(webSocketId)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes,
    ) : WebSocketApiAttributes {
        /**
         * The endpoint URL of the WebSocketApi.
         *
         * Default: - throw san error if apiEndpoint is accessed.
         */
        override fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

        /** The identifier of the WebSocketApi. */
        override fun webSocketId(): String = unwrap(this).getWebSocketId()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketApiAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes
        ): WebSocketApiAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: WebSocketApiAttributes
        ): software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
