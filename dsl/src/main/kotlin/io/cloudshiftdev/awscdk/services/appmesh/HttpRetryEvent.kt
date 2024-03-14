package io.cloudshiftdev.awscdk.services.appmesh

public enum class HttpRetryEvent(
    private val cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryEvent,
) {
    SERVER_ERROR(software.amazon.awscdk.services.appmesh.HttpRetryEvent.SERVER_ERROR),
    GATEWAY_ERROR(software.amazon.awscdk.services.appmesh.HttpRetryEvent.GATEWAY_ERROR),
    CLIENT_ERROR(software.amazon.awscdk.services.appmesh.HttpRetryEvent.CLIENT_ERROR),
    STREAM_ERROR(software.amazon.awscdk.services.appmesh.HttpRetryEvent.STREAM_ERROR),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryEvent
        ): HttpRetryEvent =
            when (cdkObject) {
                software.amazon.awscdk.services.appmesh.HttpRetryEvent.SERVER_ERROR ->
                    HttpRetryEvent.SERVER_ERROR
                software.amazon.awscdk.services.appmesh.HttpRetryEvent.GATEWAY_ERROR ->
                    HttpRetryEvent.GATEWAY_ERROR
                software.amazon.awscdk.services.appmesh.HttpRetryEvent.CLIENT_ERROR ->
                    HttpRetryEvent.CLIENT_ERROR
                software.amazon.awscdk.services.appmesh.HttpRetryEvent.STREAM_ERROR ->
                    HttpRetryEvent.STREAM_ERROR
            }

        internal fun unwrap(
            wrapped: HttpRetryEvent
        ): software.amazon.awscdk.services.appmesh.HttpRetryEvent = wrapped.cdkObject
    }
}
