@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IResponseHeadersPolicy {
  public fun responseHeadersPolicyId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy,
  ) : CdkObject(cdkObject), IResponseHeadersPolicy {
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
