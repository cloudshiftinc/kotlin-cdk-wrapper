package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IManagedPolicy {
  /**
   * The ARN of the managed policy.
   */
  public fun managedPolicyArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy,
  ) : CdkObject(cdkObject), IManagedPolicy {
    /**
     * The ARN of the managed policy.
     */
    override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy): IManagedPolicy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedPolicy): software.amazon.awscdk.services.iam.IManagedPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IManagedPolicy
  }
}
