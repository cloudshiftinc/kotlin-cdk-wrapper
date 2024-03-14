package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVirtualNode : IResource {
  public fun grantStreamAggregatedResources(arg0: IGrantable): Grant

  public fun mesh(): IMesh

  public fun virtualNodeArn(): String

  public fun virtualNodeName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualNode,
  ) : IVirtualNode {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantStreamAggregatedResources(arg0: IGrantable): Grant =
        unwrap(this).grantStreamAggregatedResources(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun virtualNodeArn(): String = unwrap(this).getVirtualNodeArn()

    override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualNode): IVirtualNode
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualNode): software.amazon.awscdk.services.appmesh.IVirtualNode
        = (wrapped as Wrapper).cdkObject
  }
}
