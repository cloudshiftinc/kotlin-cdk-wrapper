@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Service connect app protocol.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * AppProtocol appProtocol = AppProtocol.getGrpc();
 * ```
 */
public open class AppProtocol(
  cdkObject: software.amazon.awscdk.services.ecs.AppProtocol,
) : CdkObject(cdkObject) {
  /**
   * Custom value.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public fun grpc(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getGrpc().let(AppProtocol::wrap)

    public fun grpc(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setGrpc(`value`.let(AppProtocol.Companion::unwrap))
    }

    public fun http(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp().let(AppProtocol::wrap)

    public fun http(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp(`value`.let(AppProtocol.Companion::unwrap))
    }

    public fun http2(): AppProtocol =
        software.amazon.awscdk.services.ecs.AppProtocol.getHttp2().let(AppProtocol::wrap)

    public fun http2(`value`: AppProtocol) {
      software.amazon.awscdk.services.ecs.AppProtocol.setHttp2(`value`.let(AppProtocol.Companion::unwrap))
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AppProtocol): AppProtocol =
        AppProtocol(cdkObject)

    internal fun unwrap(wrapped: AppProtocol): software.amazon.awscdk.services.ecs.AppProtocol =
        wrapped.cdkObject as software.amazon.awscdk.services.ecs.AppProtocol
  }
}
