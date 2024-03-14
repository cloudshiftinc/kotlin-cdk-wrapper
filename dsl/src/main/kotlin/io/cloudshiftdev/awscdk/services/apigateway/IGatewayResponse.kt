package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node

public interface IGatewayResponse : IResource {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IGatewayResponse,
  ) : IGatewayResponse {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IGatewayResponse):
        IGatewayResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayResponse):
        software.amazon.awscdk.services.apigateway.IGatewayResponse = (wrapped as Wrapper).cdkObject
  }
}
