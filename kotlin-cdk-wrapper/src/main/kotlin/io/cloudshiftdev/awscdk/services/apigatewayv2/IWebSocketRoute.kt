@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IWebSocketRoute : IRoute {
  public fun routeKey(): String

  public fun webSocketApi(): IWebSocketApi

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute,
  ) : CdkObject(cdkObject), IWebSocketRoute {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun routeId(): String = unwrap(this).getRouteId()

    override fun routeKey(): String = unwrap(this).getRouteKey()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute):
        IWebSocketRoute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketRoute):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute
  }
}
