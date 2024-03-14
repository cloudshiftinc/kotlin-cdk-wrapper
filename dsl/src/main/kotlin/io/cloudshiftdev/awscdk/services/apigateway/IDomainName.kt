package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDomainName : IResource {
  public fun domainName(): String

  public fun domainNameAliasDomainName(): String

  public fun domainNameAliasHostedZoneId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IDomainName,
  ) : IDomainName {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun domainName(): String = unwrap(this).getDomainName()

    public override fun domainNameAliasDomainName(): String =
        unwrap(this).getDomainNameAliasDomainName()

    public override fun domainNameAliasHostedZoneId(): String =
        unwrap(this).getDomainNameAliasHostedZoneId()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IDomainName):
        IDomainName = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigateway.IDomainName = (wrapped as Wrapper).cdkObject
  }
}
