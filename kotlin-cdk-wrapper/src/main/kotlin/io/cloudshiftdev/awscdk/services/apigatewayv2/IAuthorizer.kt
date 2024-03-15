@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IAuthorizer : IResource {
  public fun authorizerId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IAuthorizer,
  ) : CdkObject(cdkObject), IAuthorizer {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IAuthorizer):
        IAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IAuthorizer = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IAuthorizer
  }
}
