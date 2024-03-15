@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IJobQueue : IResource {
  public fun addComputeEnvironment(arg0: IComputeEnvironment, arg1: Number)

  public fun computeEnvironments(): List<OrderedComputeEnvironment>

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun jobQueueArn(): String

  public fun jobQueueName(): String

  public fun priority(): Number

  public fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IJobQueue,
  ) : CdkObject(cdkObject), IJobQueue {
    override fun addComputeEnvironment(arg0: IComputeEnvironment, arg1: Number) {
      unwrap(this).addComputeEnvironment(arg0.let(IComputeEnvironment::unwrap), arg1)
    }

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun computeEnvironments(): List<OrderedComputeEnvironment> =
        unwrap(this).getComputeEnvironments().map(OrderedComputeEnvironment::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

    override fun jobQueueName(): String = unwrap(this).getJobQueueName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun priority(): Number = unwrap(this).getPriority()

    override fun schedulingPolicy(): ISchedulingPolicy? =
        unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IJobQueue): IJobQueue =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IJobQueue): software.amazon.awscdk.services.batch.IJobQueue =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.IJobQueue
  }
}
