@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node

public interface IGatewayResponse : IResource {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IGatewayResponse,
  ) : CdkObject(cdkObject), IGatewayResponse {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IGatewayResponse):
        IGatewayResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayResponse):
        software.amazon.awscdk.services.apigateway.IGatewayResponse = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IGatewayResponse
  }
}
