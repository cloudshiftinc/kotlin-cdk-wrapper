package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVirtualService : IResource {
  public fun mesh(): IMesh

  public fun virtualServiceArn(): String

  public fun virtualServiceName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualService,
  ) : IVirtualService {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun virtualServiceArn(): String = unwrap(this).getVirtualServiceArn()

    override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualService):
        IVirtualService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualService):
        software.amazon.awscdk.services.appmesh.IVirtualService = (wrapped as Wrapper).cdkObject
  }
}
