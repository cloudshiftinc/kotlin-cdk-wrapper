@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A managed policy.
 */
public interface IManagedPolicy {
  /**
   * The ARN of the managed policy.
   */
  public fun managedPolicyArn(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy,
  ) : CdkObject(cdkObject), IManagedPolicy {
    /**
     * The ARN of the managed policy.
     */
    override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy): IManagedPolicy
        = CdkObjectWrappers.wrap(cdkObject) as? IManagedPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedPolicy): software.amazon.awscdk.services.iam.IManagedPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IManagedPolicy
  }
}
