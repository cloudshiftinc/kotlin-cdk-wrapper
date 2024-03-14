package io.cloudshiftdev.awscdk.services.eks

import kotlin.String

public open class EndpointAccess internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.EndpointAccess,
) {
  public open fun onlyFrom(cidr: String): EndpointAccess =
      unwrap(this).onlyFrom(cidr).let(EndpointAccess::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.EndpointAccess): EndpointAccess
        = EndpointAccess(cdkObject)

    internal fun unwrap(wrapped: EndpointAccess): software.amazon.awscdk.services.eks.EndpointAccess
        = wrapped.cdkObject
  }
}
