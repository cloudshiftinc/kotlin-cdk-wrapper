package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface INamespace : IResource {
  public fun namespaceArn(): String

  public fun namespaceId(): String

  public fun namespaceName(): String

  public fun type(): NamespaceType

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.INamespace,
  ) : INamespace {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

    override fun namespaceId(): String = unwrap(this).getNamespaceId()

    override fun namespaceName(): String = unwrap(this).getNamespaceName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.INamespace):
        INamespace = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INamespace):
        software.amazon.awscdk.services.servicediscovery.INamespace = (wrapped as Wrapper).cdkObject
  }
}
