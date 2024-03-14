package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String

public open class AppProtocol internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.AppProtocol,
) {
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public open fun grpc(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getGrpc().let(AppProtocol::wrap)

    public open fun grpc(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setGrpc(`value`.let(AppProtocol::unwrap))
    }

    public open fun http(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp().let(AppProtocol::wrap)

    public open fun http(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp(`value`.let(AppProtocol::unwrap))
    }

    public open fun http2(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp2().let(AppProtocol::wrap)

    public open fun http2(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp2(`value`.let(AppProtocol::unwrap))
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppProtocol): AppProtocol =
        AppProtocol(cdkObject)

    internal fun unwrap(wrapped: AppProtocol): software.amazon.awscdk.services.ecs.AppProtocol =
        wrapped.cdkObject
  }
}
