package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class EndpointAccess internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.EndpointAccess,
) : CdkObject(cdkObject) {
  /**
   * Restrict public access to specific CIDR blocks.
   *
   * If public access is disabled, this method will result in an error.
   *
   * @param cidr CIDR blocks. 
   */
  public open fun onlyFrom(cidr: String): EndpointAccess =
      unwrap(this).onlyFrom(cidr).let(EndpointAccess::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.EndpointAccess): EndpointAccess
        = EndpointAccess(cdkObject)

    internal fun unwrap(wrapped: EndpointAccess): software.amazon.awscdk.services.eks.EndpointAccess
        = wrapped.cdkObject
  }
}
