@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IApiMapping : IResource {
  public fun apiMappingId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IApiMapping,
  ) : CdkObject(cdkObject), IApiMapping {
    override fun apiMappingId(): String = unwrap(this).getApiMappingId()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IApiMapping):
        IApiMapping = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApiMapping):
        software.amazon.awscdk.services.apigatewayv2.IApiMapping = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IApiMapping
  }
}
