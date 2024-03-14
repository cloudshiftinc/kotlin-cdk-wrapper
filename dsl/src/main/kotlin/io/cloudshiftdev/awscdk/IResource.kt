package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node

public interface IResource : IConstruct {
  public fun applyRemovalPolicy(arg0: RemovalPolicy)

  public fun env(): ResourceEnvironment

  public fun stack(): Stack

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IResource,
  ) : IResource {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IResource): IResource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResource): software.amazon.awscdk.IResource = (wrapped as
        Wrapper).cdkObject
  }
}
