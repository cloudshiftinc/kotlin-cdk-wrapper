package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IHttpIntegration : IIntegration {
  public fun httpApi(): IHttpApi

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpIntegration,
  ) : IHttpIntegration {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun integrationId(): String = unwrap(this).getIntegrationId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpIntegration):
        IHttpIntegration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpIntegration):
        software.amazon.awscdk.services.apigatewayv2.IHttpIntegration = (wrapped as
        Wrapper).cdkObject
  }
}
