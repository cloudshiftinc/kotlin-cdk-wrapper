package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface ICachePolicy {
  /**
   * The ID of the cache policy.
   */
  public fun cachePolicyId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ICachePolicy,
  ) : CdkObject(cdkObject), ICachePolicy {
    /**
     * The ID of the cache policy.
     */
    override fun cachePolicyId(): String = unwrap(this).getCachePolicyId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ICachePolicy):
        ICachePolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICachePolicy):
        software.amazon.awscdk.services.cloudfront.ICachePolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.ICachePolicy
  }
}
