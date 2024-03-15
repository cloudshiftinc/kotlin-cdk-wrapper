@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVirtualService : IResource {
  public fun mesh(): IMesh

  public fun virtualServiceArn(): String

  public fun virtualServiceName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualService,
  ) : CdkObject(cdkObject), IVirtualService {
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualService):
        IVirtualService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualService):
        software.amazon.awscdk.services.appmesh.IVirtualService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.IVirtualService
  }
}
