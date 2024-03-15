@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IGatewayRoute : IResource {
  public fun gatewayRouteArn(): String

  public fun gatewayRouteName(): String

  public fun virtualGateway(): IVirtualGateway

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IGatewayRoute,
  ) : CdkObject(cdkObject), IGatewayRoute {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun gatewayRouteArn(): String = unwrap(this).getGatewayRouteArn()

    override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun virtualGateway(): IVirtualGateway =
        unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IGatewayRoute):
        IGatewayRoute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayRoute):
        software.amazon.awscdk.services.appmesh.IGatewayRoute = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.IGatewayRoute
  }
}
