@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

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
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * Endpoint endpoint = new Endpoint("address", 123);
 * ```
 */
public open class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.docdb.Endpoint,
) : CdkObject(cdkObject) {
  /**
   * The hostname of the endpoint.
   */
  public open fun hostname(): String = unwrap(this).getHostname()

  /**
   * The port number of the endpoint.
   *
   * This can potentially be a CDK token. If you need to embed the port in a string (e.g. instance
   * user data script),
   * use `Endpoint.portAsString`.
   */
  public open fun port(): Number = unwrap(this).getPort()

  /**
   * Returns the port number as a string representation that can be used for embedding within other
   * strings.
   *
   * This is intended to deal with CDK's token system. Numeric CDK tokens are not expanded when
   * their string
   * representation is embedded in a string. This function returns the port either as an unresolved
   * string token or
   * as a resolved string representation of the port value.
   *
   * @return An (un)resolved string representation of the endpoint's port number
   */
  public open fun portAsString(): String = unwrap(this).portAsString()

  /**
   * The combination of `HOSTNAME:PORT` for this endpoint.
   */
  public open fun socketAddress(): String = unwrap(this).getSocketAddress()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Endpoint): Endpoint =
        Endpoint(cdkObject)

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.docdb.Endpoint =
        wrapped.cdkObject
  }
}
