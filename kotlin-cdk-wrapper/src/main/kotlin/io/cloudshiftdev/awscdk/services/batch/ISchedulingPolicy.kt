@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISchedulingPolicy : IResource {
  public fun schedulingPolicyArn(): String

  public fun schedulingPolicyName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.ISchedulingPolicy,
  ) : CdkObject(cdkObject), ISchedulingPolicy {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

    override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.ISchedulingPolicy):
        ISchedulingPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchedulingPolicy):
        software.amazon.awscdk.services.batch.ISchedulingPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.ISchedulingPolicy
  }
}
