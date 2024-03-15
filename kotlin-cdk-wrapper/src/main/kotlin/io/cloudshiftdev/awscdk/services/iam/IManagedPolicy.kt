@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IManagedPolicy {
  public fun managedPolicyArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy,
  ) : CdkObject(cdkObject), IManagedPolicy {
    override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IManagedPolicy): IManagedPolicy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedPolicy): software.amazon.awscdk.services.iam.IManagedPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IManagedPolicy
  }
}
