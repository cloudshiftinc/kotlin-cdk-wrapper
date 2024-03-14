package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Number
import kotlin.String

public open class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.Endpoint,
) : CdkObject(cdkObject) {
  /**
   * The hostname of the endpoint.
   */
  public open fun hostname(): String = unwrap(this).getHostname()

  /**
   * The port of the endpoint.
   */
  public open fun port(): Number = unwrap(this).getPort()

  /**
   * The combination of "HOSTNAME:PORT" for this endpoint.
   */
  public open fun socketAddress(): String = unwrap(this).getSocketAddress()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.Endpoint): Endpoint =
        Endpoint(cdkObject)

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.rds.Endpoint =
        wrapped.cdkObject
  }
}
