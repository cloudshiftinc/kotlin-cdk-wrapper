@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IOriginRequestPolicy {
  public fun originRequestPolicyId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy,
  ) : CdkObject(cdkObject), IOriginRequestPolicy {
    override fun originRequestPolicyId(): String = unwrap(this).getOriginRequestPolicyId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy):
        IOriginRequestPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy
  }
}
