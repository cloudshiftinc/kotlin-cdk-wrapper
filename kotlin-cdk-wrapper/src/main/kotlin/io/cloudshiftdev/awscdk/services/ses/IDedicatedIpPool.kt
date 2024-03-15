@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDedicatedIpPool : IResource {
  public fun dedicatedIpPoolName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IDedicatedIpPool,
  ) : CdkObject(cdkObject), IDedicatedIpPool {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun dedicatedIpPoolName(): String = unwrap(this).getDedicatedIpPoolName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IDedicatedIpPool):
        IDedicatedIpPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDedicatedIpPool):
        software.amazon.awscdk.services.ses.IDedicatedIpPool = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IDedicatedIpPool
  }
}
