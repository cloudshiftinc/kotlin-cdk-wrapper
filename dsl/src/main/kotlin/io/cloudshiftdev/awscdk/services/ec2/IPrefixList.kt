package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IPrefixList : IResource {
  public fun prefixListId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IPrefixList,
  ) : IPrefixList {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun prefixListId(): String = unwrap(this).getPrefixListId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPrefixList): IPrefixList =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPrefixList): software.amazon.awscdk.services.ec2.IPrefixList =
        (wrapped as Wrapper).cdkObject
  }
}
