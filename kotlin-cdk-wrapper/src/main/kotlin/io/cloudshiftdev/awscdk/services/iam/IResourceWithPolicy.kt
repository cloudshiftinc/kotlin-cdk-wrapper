@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A resource with a resource policy that can be added to.
 */
public interface IResourceWithPolicy : IResource {
  /**
   * Add a statement to the resource's resource policy.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Add a statement to the resource's resource policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IResourceWithPolicy):
        IResourceWithPolicy = CdkObjectWrappers.wrap(cdkObject) as IResourceWithPolicy

    internal fun unwrap(wrapped: IResourceWithPolicy):
        software.amazon.awscdk.services.iam.IResourceWithPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IResourceWithPolicy
  }
}
