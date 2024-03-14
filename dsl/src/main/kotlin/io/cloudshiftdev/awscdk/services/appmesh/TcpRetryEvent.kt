package io.cloudshiftdev.awscdk.services.appmesh

public enum class TcpRetryEvent(
  private val cdkObject: software.amazon.awscdk.services.appmesh.TcpRetryEvent,
) {
  CONNECTION_ERROR(software.amazon.awscdk.services.appmesh.TcpRetryEvent.CONNECTION_ERROR),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpRetryEvent):
        TcpRetryEvent = when (cdkObject) {
      software.amazon.awscdk.services.appmesh.TcpRetryEvent.CONNECTION_ERROR ->
          TcpRetryEvent.CONNECTION_ERROR
    }

    internal fun unwrap(wrapped: TcpRetryEvent):
        software.amazon.awscdk.services.appmesh.TcpRetryEvent = wrapped.cdkObject
  }
}
