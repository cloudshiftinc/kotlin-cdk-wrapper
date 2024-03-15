@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node

public interface ILifecycleHook : IResource {
  public fun role(): IRole

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHook,
  ) : CdkObject(cdkObject), ILifecycleHook {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHook):
        ILifecycleHook = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILifecycleHook):
        software.amazon.awscdk.services.autoscaling.ILifecycleHook = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ILifecycleHook
  }
}
