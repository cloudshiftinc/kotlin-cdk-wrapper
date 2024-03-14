package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRecordSet : IResource {
  public fun domainName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.IRecordSet,
  ) : IRecordSet {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IRecordSet): IRecordSet =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRecordSet): software.amazon.awscdk.services.route53.IRecordSet =
        (wrapped as Wrapper).cdkObject
  }
}
