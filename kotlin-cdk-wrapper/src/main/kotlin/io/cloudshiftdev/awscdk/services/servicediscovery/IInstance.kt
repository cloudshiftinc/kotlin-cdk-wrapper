@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstance : IResource {
  public fun instanceId(): String

  public fun service(): IService

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IInstance,
  ) : CdkObject(cdkObject), IInstance {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun service(): IService = unwrap(this).getService().let(IService::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IInstance):
        IInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstance):
        software.amazon.awscdk.services.servicediscovery.IInstance = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IInstance
  }
}
