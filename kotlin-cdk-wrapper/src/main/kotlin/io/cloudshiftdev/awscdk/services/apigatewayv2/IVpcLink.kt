@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpcLink : IResource {
  public fun vpc(): IVpc

  public fun vpcLinkId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink,
  ) : CdkObject(cdkObject), IVpcLink {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink): IVpcLink =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigatewayv2.IVpcLink =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IVpcLink
  }
}
