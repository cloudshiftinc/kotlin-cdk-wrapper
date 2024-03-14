package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDomainName : IResource {
  public fun name(): String

  public fun regionalDomainName(): String

  public fun regionalHostedZoneId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName,
  ) : IDomainName {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun name(): String = unwrap(this).getName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

    public override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName):
        IDomainName = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigatewayv2.IDomainName = (wrapped as Wrapper).cdkObject
  }
}
