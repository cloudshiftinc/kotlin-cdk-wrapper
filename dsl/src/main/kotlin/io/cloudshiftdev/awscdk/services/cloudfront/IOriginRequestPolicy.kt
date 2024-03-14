package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String

public interface IOriginRequestPolicy {
  /**
   * The ID of the origin request policy.
   */
  public fun originRequestPolicyId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy,
  ) : IOriginRequestPolicy {
    /**
     * The ID of the origin request policy.
     */
    override fun originRequestPolicyId(): String = unwrap(this).getOriginRequestPolicyId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy):
        IOriginRequestPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy = (wrapped as
        Wrapper).cdkObject
  }
}
