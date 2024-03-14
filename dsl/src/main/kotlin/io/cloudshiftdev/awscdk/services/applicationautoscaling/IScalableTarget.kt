package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IScalableTarget : IResource {
  public fun scalableTargetId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.applicationautoscaling.IScalableTarget,
  ) : IScalableTarget {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun scalableTargetId(): String = unwrap(this).getScalableTargetId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.IScalableTarget):
        IScalableTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.IScalableTarget = (wrapped as
        Wrapper).cdkObject
  }
}
