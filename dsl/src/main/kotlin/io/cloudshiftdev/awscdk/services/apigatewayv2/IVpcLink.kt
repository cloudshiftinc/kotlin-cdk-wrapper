package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpcLink : IResource {
  public fun vpc(): IVpc

  public fun vpcLinkId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink,
  ) : IVpcLink {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink): IVpcLink =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigatewayv2.IVpcLink =
        (wrapped as Wrapper).cdkObject
  }
}
