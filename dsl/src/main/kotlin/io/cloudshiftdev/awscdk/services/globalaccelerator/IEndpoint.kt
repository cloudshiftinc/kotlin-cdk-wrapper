package io.cloudshiftdev.awscdk.services.globalaccelerator

import kotlin.Any
import kotlin.String

public interface IEndpoint {
  public fun region(): String? = unwrap(this).getRegion()

  public fun renderEndpointConfiguration(): Any

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint,
  ) : IEndpoint {
    override fun region(): String? = unwrap(this).getRegion()

    override fun renderEndpointConfiguration(): Any = unwrap(this).renderEndpointConfiguration()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpoint):
        IEndpoint = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpoint):
        software.amazon.awscdk.services.globalaccelerator.IEndpoint = (wrapped as Wrapper).cdkObject
  }
}
