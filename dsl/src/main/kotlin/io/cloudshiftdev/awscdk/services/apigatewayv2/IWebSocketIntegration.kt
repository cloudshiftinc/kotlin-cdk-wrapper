package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IWebSocketIntegration : IIntegration {
  public fun webSocketApi(): IWebSocketApi

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration,
  ) : IWebSocketIntegration {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun integrationId(): String = unwrap(this).getIntegrationId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration):
        IWebSocketIntegration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketIntegration):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration = (wrapped as
        Wrapper).cdkObject
  }
}
