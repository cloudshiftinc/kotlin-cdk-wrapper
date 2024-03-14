package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEndpointGroup : IResource {
  public fun endpointGroupArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpointGroup,
  ) : IEndpointGroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun endpointGroupArn(): String = unwrap(this).getEndpointGroupArn()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpointGroup):
        IEndpointGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpointGroup):
        software.amazon.awscdk.services.globalaccelerator.IEndpointGroup = (wrapped as
        Wrapper).cdkObject
  }
}
