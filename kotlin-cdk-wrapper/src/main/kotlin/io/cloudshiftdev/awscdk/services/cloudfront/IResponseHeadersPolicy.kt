@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents a response headers policy.
 */
public interface IResponseHeadersPolicy {
  /**
   * The ID of the response headers policy.
   */
  public fun responseHeadersPolicyId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy,
  ) : CdkObject(cdkObject), IResponseHeadersPolicy {
    /**
     * The ID of the response headers policy.
     */
    override fun responseHeadersPolicyId(): String = unwrap(this).getResponseHeadersPolicyId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy):
        IResponseHeadersPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy
  }
}
