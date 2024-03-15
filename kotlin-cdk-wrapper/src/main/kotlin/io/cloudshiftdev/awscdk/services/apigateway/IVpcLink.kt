@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpcLink : IResource {
  public fun vpcLinkId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IVpcLink,
  ) : CdkObject(cdkObject), IVpcLink {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IVpcLink): IVpcLink =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigateway.IVpcLink =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IVpcLink
  }
}
