@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IHttpAuthorizer : IAuthorizer {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer,
  ) : CdkObject(cdkObject), IHttpAuthorizer {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer):
        IHttpAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer
  }
}
