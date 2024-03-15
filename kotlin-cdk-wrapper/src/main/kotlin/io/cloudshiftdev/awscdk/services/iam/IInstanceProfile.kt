@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstanceProfile : IResource {
  public fun instanceProfileArn(): String

  public fun instanceProfileName(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IInstanceProfile,
  ) : CdkObject(cdkObject), IInstanceProfile {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IInstanceProfile):
        IInstanceProfile = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstanceProfile):
        software.amazon.awscdk.services.iam.IInstanceProfile = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.IInstanceProfile
  }
}
