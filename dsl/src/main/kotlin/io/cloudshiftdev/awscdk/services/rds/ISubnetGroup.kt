package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISubnetGroup : IResource {
  public fun subnetGroupName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ISubnetGroup,
  ) : ISubnetGroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ISubnetGroup): ISubnetGroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISubnetGroup): software.amazon.awscdk.services.rds.ISubnetGroup =
        (wrapped as Wrapper).cdkObject
  }
}
