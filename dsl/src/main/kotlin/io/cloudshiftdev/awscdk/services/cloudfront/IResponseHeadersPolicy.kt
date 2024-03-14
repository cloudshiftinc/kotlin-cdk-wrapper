package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String

public interface IResponseHeadersPolicy {
  public fun responseHeadersPolicyId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy,
  ) : IResponseHeadersPolicy {
    public override fun responseHeadersPolicyId(): String =
        unwrap(this).getResponseHeadersPolicyId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy):
        IResponseHeadersPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy = (wrapped as
        Wrapper).cdkObject
  }
}
