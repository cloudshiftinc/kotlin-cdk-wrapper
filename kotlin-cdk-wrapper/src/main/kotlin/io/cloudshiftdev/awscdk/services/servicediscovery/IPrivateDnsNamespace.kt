@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IPrivateDnsNamespace : INamespace {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace,
  ) : CdkObject(cdkObject), IPrivateDnsNamespace {
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
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace):
        IPrivateDnsNamespace = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPrivateDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.IPrivateDnsNamespace
  }
}
