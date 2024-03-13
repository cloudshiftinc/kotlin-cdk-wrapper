package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public interface IManagedPolicy {
  public fun managedPolicyArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy,
  ) : IManagedPolicy {
    public override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy): IManagedPolicy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedPolicy): software.amazon.awscdk.services.iam.IManagedPolicy
        = (wrapped as Wrapper).cdkObject
  }
}
