package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String

public interface ICachePolicy {
  /**
   * The ID of the cache policy.
   */
  public fun cachePolicyId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ICachePolicy,
  ) : ICachePolicy {
    /**
     * The ID of the cache policy.
     */
    override fun cachePolicyId(): String = unwrap(this).getCachePolicyId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ICachePolicy):
        ICachePolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICachePolicy):
        software.amazon.awscdk.services.cloudfront.ICachePolicy = (wrapped as Wrapper).cdkObject
  }
}
