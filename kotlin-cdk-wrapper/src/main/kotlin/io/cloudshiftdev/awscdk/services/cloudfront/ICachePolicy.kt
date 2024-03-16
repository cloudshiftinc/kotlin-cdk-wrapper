@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Cache Policy.
 */
public interface ICachePolicy {
  /**
   * The ID of the cache policy.
   */
  public fun cachePolicyId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ICachePolicy):
        ICachePolicy = CdkObjectWrappers.wrap(cdkObject) as ICachePolicy

    internal fun unwrap(wrapped: ICachePolicy):
        software.amazon.awscdk.services.cloudfront.ICachePolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.ICachePolicy
  }
}
