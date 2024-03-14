package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IHttpAuthorizer : IAuthorizer {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer,
  ) : IHttpAuthorizer {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer):
        IHttpAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer = (wrapped as
        Wrapper).cdkObject
  }
}
