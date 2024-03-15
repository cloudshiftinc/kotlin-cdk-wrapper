@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class AppProtocol internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AppProtocol,
) : CdkObject(cdkObject) {
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public fun grpc(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getGrpc().let(AppProtocol::wrap)

    public fun grpc(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setGrpc(`value`.let(AppProtocol::unwrap))
    }

    public fun http(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp().let(AppProtocol::wrap)

    public fun http(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp(`value`.let(AppProtocol::unwrap))
    }

    public fun http2(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp2().let(AppProtocol::wrap)

    public fun http2(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp2(`value`.let(AppProtocol::unwrap))
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppProtocol): AppProtocol =
        AppProtocol(cdkObject)

    internal fun unwrap(wrapped: AppProtocol): software.amazon.awscdk.services.ecs.AppProtocol =
        wrapped.cdkObject
  }
}
