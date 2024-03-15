@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

/**
 * Connection endpoint of a database cluster or instance.
 *
 * Consists of a combination of hostname and port.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Endpoint endpoint = new Endpoint("address", 123);
 * ```
 */
public open class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.Endpoint,
) : CdkObject(cdkObject) {
  public constructor(address: String, port: Number) :
      this(software.amazon.awscdk.services.rds.Endpoint(address, port)
  )

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
